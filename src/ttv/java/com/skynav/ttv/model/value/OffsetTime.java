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
 
package com.skynav.ttv.model.value;

import java.util.Set;

public interface OffsetTime extends Time {
    public enum Metric {
        Hours("h"),
        Minutes("m"),
        Seconds("s"),
        Milliseconds("ms"),
        Frames("f"),
        Ticks("t");
        private String shorthand;
        Metric(String shorthand) {
            this.shorthand = shorthand;
        }
        public String shorthand() {
            return shorthand;
        }
        public static String shorthands() {
            StringBuffer sb = new StringBuffer();
            for (Metric v: values()) {
                if (sb.length() > 0)
                    sb.append(", ");
                sb.append('\'');
                sb.append(v.shorthand());
                sb.append('\'');
            }
            return "{" + sb.toString() + "}";
        }
        public static String shorthands(Set<Metric> metrics) {
            StringBuffer sb = new StringBuffer();
            for (Metric v: values()) {
                if (metrics.contains(v)) {
                    if (sb.length() > 0)
                        sb.append(", ");
                    sb.append('\'');
                    sb.append(v.shorthand());
                    sb.append('\'');
                }
            }
            return "{" + sb.toString() + "}";
        }
        public static Metric valueOfShorthand(String value) {
            if (value == null)
                throw new IllegalArgumentException();
            for (Metric v: values()) {
                if (value.equals(v.shorthand()))
                    return v;
            }
            throw new IllegalArgumentException();
        }
        public static Metric valueOfShorthandIgnoringCase(String value) {
            return valueOfShorthand(value.toLowerCase());
        }
    }
    double getOffset();
    Metric getMetric();
}
