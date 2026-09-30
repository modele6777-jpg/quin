package com.adjust.sdk;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class AdjustRemoteTrigger {
    private final String label;
    private final JSONObject payload;

    public AdjustRemoteTrigger(String str, JSONObject jSONObject) {
        this.label = str;
        this.payload = jSONObject;
    }

    public String getLabel() {
        return this.label;
    }

    public JSONObject getPayload() {
        return this.payload;
    }

    public String toString() {
        return "AdjustRemoteTrigger{label='" + this.label + "', payload=" + this.payload + '}';
    }
}
