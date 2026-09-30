package io.sentry.android.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import defpackage.f9e;
import defpackage.j9e;
import defpackage.o9e;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements f9e {
    public final f9e a;
    public final io.sentry.n b;

    public i(f9e f9eVar, io.sentry.n nVar) {
        f9eVar.getClass();
        nVar.getClass();
        this.a = f9eVar;
        this.b = nVar;
    }

    @Override // defpackage.f9e
    public final o9e C(String str) {
        str.getClass();
        return new n(this.a.C(str), this.b, str);
    }

    @Override // defpackage.f9e
    public final boolean I0() {
        return this.a.I0();
    }

    @Override // defpackage.f9e
    public final void J() {
        this.a.J();
    }

    @Override // defpackage.f9e
    public final boolean S() {
        return this.a.S();
    }

    @Override // defpackage.f9e
    public final int S0(ContentValues contentValues, Object[] objArr) {
        return this.a.S0(contentValues, objArr);
    }

    @Override // defpackage.f9e
    public final void V() {
        this.a.V();
    }

    @Override // defpackage.f9e
    public final void X(String str, Object[] objArr) {
        str.getClass();
        objArr.getClass();
        this.b.f(str, new f(this, str, objArr));
    }

    @Override // defpackage.f9e
    public final void Z() {
        this.a.Z();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.f9e
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.f9e
    public final Cursor l0(String str) {
        str.getClass();
        return (Cursor) this.b.f(str, new g(this, str));
    }

    @Override // defpackage.f9e
    public final boolean q() {
        return this.a.q();
    }

    @Override // defpackage.f9e
    public final void q0() {
        this.a.q0();
    }

    @Override // defpackage.f9e
    public final void t() {
        this.a.t();
    }

    @Override // defpackage.f9e
    public final Cursor w(j9e j9eVar) {
        j9eVar.getClass();
        return (Cursor) this.b.f(j9eVar.f(), new h(this, j9eVar));
    }

    @Override // defpackage.f9e
    public final void y() {
        this.a.y();
    }

    @Override // defpackage.f9e
    public final void z(String str) {
        str.getClass();
        this.b.f(str, new e(this, str));
    }
}
