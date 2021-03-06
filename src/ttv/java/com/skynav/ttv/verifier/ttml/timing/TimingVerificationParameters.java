/*
 * Copyright 2013 Skynav, Inc. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY SKYNAV, INC. AND ITS CONTRIBUTORS “AS IS” AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL SKYNAV, INC. OR ITS CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
package com.skynav.ttv.verifier.ttml.timing;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.xml.namespace.QName;

import org.xml.sax.Locator;

import com.skynav.ttv.model.ttml1.tt.TimedText;
import com.skynav.ttv.model.value.DropMode;
import com.skynav.ttv.model.value.TimeBase;
import com.skynav.ttv.model.value.TimeParameters;
import com.skynav.ttv.util.ExternalParameters;
import com.skynav.ttv.util.Reporter;
import com.skynav.ttv.verifier.VerificationParameters;
import com.skynav.ttv.verifier.VerifierContext;

public class TimingVerificationParameters implements VerificationParameters {

    private TimeBase timeBase;
    private DropMode dropMode;
    private boolean allowDuration;
    private int frameRate;
    private double frameRateMultiplier;
    private int subFrameRate;
    private double effectiveFrameRate;
    private int tickRate;
    private double externalDuration;

    public TimingVerificationParameters(TimedText tt, ExternalParameters externalParameters) {
        populate(tt, externalParameters);
    }

    public TimeBase getTimeBase() {
        return timeBase;
    }

    public boolean allowsDuration() {
        return allowDuration;
    }

    public void badDuration(QName name, String value, Locator locator, VerifierContext context) {
        Reporter reporter = context.getReporter();
        reporter.logInfo(reporter.message(locator, "*KEY*", "Duration not allowed when using ''smpte'' time base with ''discontinuous'' marker mode."));
    }

    public int getFrameRate() {
        return frameRate;
    }

    public double getFrameRateMultiplier() {
        return frameRateMultiplier;
    }

    public double getEffectiveFrameRate() {
        return effectiveFrameRate;
    }

    public int getSubFrameRate() {
        return subFrameRate;
    }

    private TimeParameters timeParameters;
    public TimeParameters getTimeParameters() {
        if (timeParameters == null)
            timeParameters = new TimeParameters(timeBase, dropMode, frameRate, subFrameRate, effectiveFrameRate, tickRate, externalDuration);
        return timeParameters;
    }

    private void populate(TimedText tt, ExternalParameters externalParameters) {
        this.timeBase = TimeBase.valueOf(tt.getTimeBase().name());
        this.dropMode = DropMode.valueOf(tt.getDropMode().name());
        this.allowDuration = (timeBase != TimeBase.SMPTE) || !tt.getMarkerMode().name().equals("DISCONTINUOUS");
        this.frameRate = tt.getFrameRate().intValue();
        this.subFrameRate = tt.getSubFrameRate().intValue();
        BigDecimal multiplier = parseFrameRateMultiplier(tt.getFrameRateMultiplier());
        this.frameRateMultiplier = multiplier.doubleValue();
        this.effectiveFrameRate = new BigDecimal(tt.getFrameRate()).multiply(multiplier).doubleValue();
        this.tickRate = tt.getTickRate().intValue();
        if (externalParameters != null) {
            Double externalDuration = (Double) externalParameters.getParameter("externalDuration");
            if (externalDuration != null)
                this.externalDuration = externalDuration.doubleValue();
            else
                this.externalDuration = Double.NaN;
        }
    }

    private static final BigDecimal zero = new BigDecimal(0D);
    private static final BigDecimal one = new BigDecimal(1D);
    private BigDecimal parseFrameRateMultiplier(String value) {
        String[] components = value.split("\\s+");
        if (components.length == 2) {
            BigDecimal n = new BigDecimal(components[0]);
            BigDecimal d = new BigDecimal(components[1]);
            if (!d.equals(zero))
                return n.divide(d, RoundingMode.DOWN);
            else
                return one;
        } else
            return new BigDecimal(1);
    }

}
