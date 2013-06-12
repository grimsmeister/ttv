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
 
package com.skynav.ttv.model.ttml;

import java.util.Map;
import java.util.Set;

import javax.xml.bind.Binder;
import javax.xml.namespace.QName;

import com.skynav.ttv.model.Model;
import com.skynav.ttv.model.ttml10.tt.Layout;
import com.skynav.ttv.model.ttml10.tt.Region;
import com.skynav.ttv.model.ttml10.tt.Style;
import com.skynav.ttv.model.ttml10.tt.Styling;
import com.skynav.ttv.verifier.ParameterVerifier;
import com.skynav.ttv.verifier.SemanticsVerifier;
import com.skynav.ttv.verifier.StyleVerifier;
import com.skynav.ttv.verifier.TimingVerifier;

public class TTML10 {
    public static final Model MODEL = new TTML10Model();
    private static class TTML10Model implements Model {
        public String getName() {
            return "ttml10";
        }
        public String getSchemaResourceName() {
            return "xsd/ttml10/ttaf1-dfxp.xsd";
        }
        public String getNamespaceUri() {
            return "http://www.w3.org/ns/ttml";
        }
        public String getJAXBContextPath() {
            return "com.skynav.ttv.model.ttml10.tt:com.skynav.ttv.model.ttml10.ttm:com.skynav.ttv.model.ttml10.ttp";
        }
        private static final Map<Class<?>,String> rootClasses;
        static {
            rootClasses = new java.util.HashMap<Class<?>,String>();
            rootClasses.put(com.skynav.ttv.model.ttml10.tt.TimedText.class, "createTt");
            rootClasses.put(com.skynav.ttv.model.ttml10.ttp.Profile.class, "createProfile");
        }
        public Map<Class<?>,String> getRootClasses() {
            return rootClasses;
        }
        private static final QName regionElementName = new com.skynav.ttv.model.ttml10.tt.ObjectFactory().createRegion(new Region()).getName();
        private static final QName styleElementName = new com.skynav.ttv.model.ttml10.tt.ObjectFactory().createStyle(new Style()).getName();
        public QName getIdReferenceTargetName(QName attributeName) {
            String namespaceUri = attributeName.getNamespaceURI();
            String localName = attributeName.getLocalPart();
            if ((namespaceUri == null) || (namespaceUri.length() == 0)) {
                if (localName.equals("style"))
                    return styleElementName;
                else if (localName.equals("region"))
                    return regionElementName;
            }
            return null;
        }
        public Class<?> getIdReferenceTargetClass(QName attributeName) {
            String namespaceUri = attributeName.getNamespaceURI();
            String localName = attributeName.getLocalPart();
            if ((namespaceUri == null) || (namespaceUri.length() == 0)) {
                if (localName.equals("style"))
                    return Style.class;
                else if (localName.equals("region"))
                    return Region.class;
            }
            return Object.class;
        }
        private static final QName stylingElementName = new com.skynav.ttv.model.ttml10.tt.ObjectFactory().createStyling(new Styling()).getName();
        private static final QName layoutElementName = new com.skynav.ttv.model.ttml10.tt.ObjectFactory().createLayout(new Layout()).getName();
        public Set<QName> getIdReferenceAncestorNames(QName attributeName) {
            Set<QName> ancestorNames = new java.util.HashSet<QName>();
            String namespaceUri = attributeName.getNamespaceURI();
            String localName = attributeName.getLocalPart();
            if ((namespaceUri == null) || (namespaceUri.length() == 0)) {
                if (localName.equals("style"))
                    ancestorNames.add(stylingElementName);
                else if (localName.equals("region"))
                    ancestorNames.add(layoutElementName);
            }
            return (ancestorNames.size() > 0) ? ancestorNames : null;
        }
        private SemanticsVerifier semanticsVerifier;
        public SemanticsVerifier getSemanticsVerifier(Binder<?> binder) {
            synchronized (this) {
                if (semanticsVerifier == null) {
                    semanticsVerifier = new com.skynav.ttv.verifier.ttml.TTML10SemanticsVerifier(this, binder);
                }
            }
            return semanticsVerifier;
        }
        private ParameterVerifier parameterVerifier;
        public ParameterVerifier getParameterVerifier(Binder<?> binder) {
            synchronized (this) {
                if (parameterVerifier == null) {
                    parameterVerifier = new com.skynav.ttv.verifier.ttml.TTML10ParameterVerifier(this, binder);
                }
            }
            return parameterVerifier;
        }
        private StyleVerifier styleVerifier;
        public StyleVerifier getStyleVerifier(Binder<?> binder) {
            synchronized (this) {
                if (styleVerifier == null) {
                    styleVerifier = new com.skynav.ttv.verifier.ttml.TTML10StyleVerifier(this, binder);
                }
            }
            return styleVerifier;
        }
        private TimingVerifier timingVerifier;
        public TimingVerifier getTimingVerifier(Binder<?> binder) {
            synchronized (this) {
                if (timingVerifier == null) {
                    timingVerifier = new com.skynav.ttv.verifier.ttml.TTML10TimingVerifier(this, binder);
                }
            }
            return timingVerifier;
        }
    }
}
