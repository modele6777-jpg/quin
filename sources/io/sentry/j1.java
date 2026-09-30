package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface j1 {
    void a(boolean z);

    void b(c7 c7Var, l0 l0Var);

    io.sentry.protocol.w c(s6 s6Var, e1 e1Var, l0 l0Var);

    void d(s5 s5Var, e1 e1Var);

    void e(long j);

    io.sentry.android.core.internal.tombstone.b f();

    default boolean g() {
        return true;
    }

    io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, l0 l0Var);

    io.sentry.protocol.w i(io.sentry.protocol.f0 f0Var, k7 k7Var, e1 e1Var, l0 l0Var, u3 u3Var);

    boolean isEnabled();

    io.sentry.protocol.w j(io.sentry.protocol.k kVar, e1 e1Var);

    io.sentry.protocol.w k(r3 r3Var);

    io.sentry.protocol.w l(i5 i5Var, e1 e1Var, l0 l0Var);
}
