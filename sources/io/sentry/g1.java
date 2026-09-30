package io.sentry;

import defpackage.jv2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface g1 {
    g1 A(String str);

    io.sentry.protocol.w B(io.sentry.protocol.k kVar);

    io.sentry.protocol.w C(i5 i5Var, l0 l0Var);

    void a(boolean z);

    o1 b();

    void c(io.sentry.protocol.i0 i0Var);

    y0 clone();

    void d(Throwable th, d7 d7Var, String str);

    void e(long j);

    io.sentry.android.core.internal.tombstone.b f();

    boolean g();

    io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, l0 l0Var);

    void i(g gVar, l0 l0Var);

    boolean isEnabled();

    void j(g gVar);

    io.sentry.protocol.w k(r3 r3Var);

    default io.sentry.protocol.w l(io.sentry.protocol.k kVar) {
        return B(kVar);
    }

    q1 m(m7 m7Var, n7 n7Var);

    void n(g4 g4Var);

    q6 o();

    q1 p();

    void q();

    void r();

    default boolean s() {
        return false;
    }

    io.sentry.logger.a t();

    io.sentry.protocol.w u(s6 s6Var, l0 l0Var);

    e1 v();

    e1 w();

    x0 x();

    io.sentry.protocol.w y(Exception exc, l0 l0Var, jv2 jv2Var);

    io.sentry.protocol.w z(io.sentry.protocol.f0 f0Var, k7 k7Var, l0 l0Var, u3 u3Var);
}
