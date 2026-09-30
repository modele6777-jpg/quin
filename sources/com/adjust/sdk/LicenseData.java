package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class LicenseData {
    private final int responseCode;
    private final String signature;
    private final String signedData;

    public LicenseData(String str, String str2, int i) {
        this.signedData = str;
        this.signature = str2;
        this.responseCode = i;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSignedData() {
        return this.signedData;
    }

    public boolean isValid() {
        String str = this.signedData;
        return (str == null || this.signature == null || str.isEmpty() || this.signature.isEmpty()) ? false : true;
    }
}
