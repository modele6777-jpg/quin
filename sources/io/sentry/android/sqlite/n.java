package io.sentry.android.sqlite;

import defpackage.o9e;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements o9e {
    public final o9e a;
    public final io.sentry.n b;
    public final String c;

    public n(o9e o9eVar, io.sentry.n nVar, String str) {
        o9eVar.getClass();
        nVar.getClass();
        str.getClass();
        this.a = o9eVar;
        this.b = nVar;
        this.c = str;
    }

    @Override // defpackage.i9e
    public final void A(int i, String str) {
        str.getClass();
        this.a.A(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.i9e
    public final void m(int i, long j) {
        this.a.m(i, j);
    }

    @Override // defpackage.i9e
    public final void n(byte[] bArr, int i) {
        this.a.n(bArr, i);
    }

    @Override // defpackage.i9e
    public final void o(int i) {
        this.a.o(i);
    }

    @Override // defpackage.o9e
    public final void p() {
        this.b.f(this.c, new m(this));
    }

    @Override // defpackage.i9e
    public final void s() {
        this.a.s();
    }

    @Override // defpackage.i9e
    public final void w0(double d, int i) {
        this.a.w0(d, i);
    }
}
