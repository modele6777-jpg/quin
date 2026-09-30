package io.sentry;

import defpackage.vh2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final byte[] a;
    public final io.sentry.protocol.j0 b;
    public final vh2 c;
    public final String d;
    public final String e;
    public final String f;

    public a(io.sentry.protocol.j0 j0Var) {
        this.a = null;
        this.b = j0Var;
        this.c = null;
        this.d = "view-hierarchy.json";
        this.e = "application/json";
        this.f = "event.view_hierarchy";
    }

    public a(String str, String str2, String str3, byte[] bArr) {
        this.a = bArr;
        this.b = null;
        this.c = null;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public a(String str, String str2, byte[] bArr) {
        this(str, str2, "event.attachment", bArr);
    }

    public a(vh2 vh2Var) {
        this.a = null;
        this.b = null;
        this.c = vh2Var;
        this.d = "screenshot.png";
        this.e = "image/png";
        this.f = "event.attachment";
    }
}
