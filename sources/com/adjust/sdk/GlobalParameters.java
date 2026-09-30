package com.adjust.sdk;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class GlobalParameters {
    Map<String, String> callbackParameters;
    Map<String, String> partnerParameters;

    public GlobalParameters deepCopy() {
        GlobalParameters globalParameters = new GlobalParameters();
        if (this.callbackParameters != null) {
            globalParameters.callbackParameters = new HashMap(this.callbackParameters);
        }
        if (this.partnerParameters != null) {
            globalParameters.partnerParameters = new HashMap(this.partnerParameters);
        }
        return globalParameters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalParameters globalParameters = (GlobalParameters) obj;
        return Util.equalObject(this.callbackParameters, globalParameters.callbackParameters) && Util.equalObject(this.partnerParameters, globalParameters.partnerParameters);
    }

    public int hashCode() {
        return Util.hashObject(this.partnerParameters, Util.hashObject(this.callbackParameters, 17));
    }
}
