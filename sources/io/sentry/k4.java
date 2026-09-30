package io.sentry;

import defpackage.jv2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k4 implements g1 {
    public static final k4 a = new k4();

    @Override // io.sentry.g1
    public final g1 A(String str) {
        return q4.b().A("getCurrentScopes");
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w B(io.sentry.protocol.k kVar) {
        return q4.b().x().j(kVar);
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w C(i5 i5Var, l0 l0Var) {
        return q4.b().C(i5Var, l0Var);
    }

    @Override // io.sentry.g1
    public final void a(boolean z) {
        q4.a();
    }

    @Override // io.sentry.g1
    public final o1 b() {
        return q4.b().b();
    }

    @Override // io.sentry.g1
    public final void c(io.sentry.protocol.i0 i0Var) {
        q4.h(i0Var);
    }

    @Override // io.sentry.g1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final y0 m25clone() {
        return q4.b().m24clone();
    }

    @Override // io.sentry.g1
    public final void d(Throwable th, d7 d7Var, String str) {
        q4.b().d(th, d7Var, str);
    }

    @Override // io.sentry.g1
    public final void e(long j) {
        q4.b().e(j);
    }

    @Override // io.sentry.g1
    public final io.sentry.android.core.internal.tombstone.b f() {
        return q4.b().f();
    }

    @Override // io.sentry.g1
    public final boolean g() {
        return q4.b().g();
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, l0 l0Var) {
        return q4.b().h(cVar, l0Var);
    }

    @Override // io.sentry.g1
    public final void i(g gVar, l0 l0Var) {
        q4.b().i(gVar, l0Var);
    }

    @Override // io.sentry.g1
    public final boolean isEnabled() {
        return q4.f();
    }

    @Override // io.sentry.g1
    public final void j(g gVar) {
        i(gVar, new l0());
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w k(r3 r3Var) {
        return q4.b().k(r3Var);
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w l(io.sentry.protocol.k kVar) {
        return q4.b().x().g(kVar);
    }

    @Override // io.sentry.g1
    public final q1 m(m7 m7Var, n7 n7Var) {
        return q4.b().m(m7Var, n7Var);
    }

    @Override // io.sentry.g1
    public final void n(g4 g4Var) {
        q4.b().n(g4Var);
    }

    @Override // io.sentry.g1
    public final q6 o() {
        return q4.b().o();
    }

    @Override // io.sentry.g1
    public final q1 p() {
        return q4.b().p();
    }

    @Override // io.sentry.g1
    public final void q() {
        q4.b().q();
    }

    @Override // io.sentry.g1
    public final void r() {
        q4.b().r();
    }

    @Override // io.sentry.g1
    public final io.sentry.logger.a t() {
        return q4.b().t();
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w u(s6 s6Var, l0 l0Var) {
        return q4.b().u(s6Var, l0Var);
    }

    @Override // io.sentry.g1
    public final e1 v() {
        return q4.c;
    }

    @Override // io.sentry.g1
    public final e1 w() {
        return q4.b().w();
    }

    @Override // io.sentry.g1
    public final x0 x() {
        return q4.b().x();
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w y(Exception exc, l0 l0Var, jv2 jv2Var) {
        return q4.b().y(exc, l0Var, jv2Var);
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w z(io.sentry.protocol.f0 f0Var, k7 k7Var, l0 l0Var, u3 u3Var) {
        return q4.b().z(f0Var, k7Var, l0Var, u3Var);
    }
}
