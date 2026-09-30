package com.google.firebase.crashlytics.internal.network;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class HttpResponse {
    private final String body;
    private final int code;

    public HttpResponse(int i, String str) {
        this.code = i;
        this.body = str;
    }

    public String body() {
        return this.body;
    }

    public int code() {
        return this.code;
    }
}
