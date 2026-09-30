package io.sentry;

import defpackage.jv2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements y0 {
    public final j4 a;

    public p0(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // io.sentry.g1
    public final g1 A(String str) {
        return this.a.A("getCurrentScopes");
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w B(io.sentry.protocol.k kVar) {
        return this.a.B(kVar);
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w C(i5 i5Var, l0 l0Var) {
        return this.a.C(i5Var, l0Var);
    }

    @Override // io.sentry.g1
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // io.sentry.g1
    public final o1 b() {
        return this.a.b();
    }

    @Override // io.sentry.g1
    public final void c(io.sentry.protocol.i0 i0Var) {
        this.a.c(i0Var);
    }

    @Override // io.sentry.g1
    /* JADX INFO: renamed from: clone */
    public final y0 m25clone() {
        return this.a.m25clone();
    }

    @Override // io.sentry.g1
    public final void d(Throwable th, d7 d7Var, String str) {
        this.a.d(th, d7Var, str);
    }

    @Override // io.sentry.g1
    public final void e(long j) {
        this.a.e(j);
    }

    @Override // io.sentry.g1
    public final io.sentry.android.core.internal.tombstone.b f() {
        return this.a.f();
    }

    @Override // io.sentry.g1
    public final boolean g() {
        return this.a.g();
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, l0 l0Var) {
        return this.a.h(cVar, l0Var);
    }

    @Override // io.sentry.g1
    public final void i(g gVar, l0 l0Var) {
        this.a.i(gVar, l0Var);
    }

    @Override // io.sentry.g1
    public final boolean isEnabled() {
        return this.a.isEnabled();
    }

    @Override // io.sentry.g1
    public final void j(g gVar) {
        this.a.j(gVar);
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w k(r3 r3Var) {
        return this.a.k(r3Var);
    }

    @Override // io.sentry.g1
    public final q1 m(m7 m7Var, n7 n7Var) {
        return this.a.m(m7Var, n7Var);
    }

    @Override // io.sentry.g1
    public final void n(g4 g4Var) {
        this.a.n(g4Var);
    }

    @Override // io.sentry.g1
    public final q6 o() {
        return this.a.o();
    }

    @Override // io.sentry.g1
    public final q1 p() {
        return this.a.p();
    }

    @Override // io.sentry.g1
    public final void q() {
        this.a.q();
    }

    @Override // io.sentry.g1
    public final void r() {
        this.a.r();
    }

    @Override // io.sentry.g1
    public final io.sentry.logger.a t() {
        return this.a.f;
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w u(s6 s6Var, l0 l0Var) {
        return this.a.u(s6Var, l0Var);
    }

    @Override // io.sentry.g1
    public final e1 v() {
        return q4.c;
    }

    @Override // io.sentry.g1
    public final e1 w() {
        return this.a.a;
    }

    @Override // io.sentry.g1
    public final x0 x() {
        return this.a.g;
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w y(Exception exc, l0 l0Var, jv2 jv2Var) {
        return this.a.y(exc, l0Var, jv2Var);
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w z(io.sentry.protocol.f0 f0Var, k7 k7Var, l0 l0Var, u3 u3Var) {
        return this.a.z(f0Var, k7Var, l0Var, u3Var);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m27clone() {
        return this.a.m25clone();
    }
}
