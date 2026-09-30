package io.sentry;

import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface e1 {
    j1 A();

    Map B();

    List C();

    List D();

    void E(i5 i5Var);

    io.sentry.protocol.e F();

    w3 G(b4 b4Var);

    String H();

    void I(d4 d4Var);

    void J(io.sentry.protocol.w wVar);

    void K(q1 q1Var);

    List L();

    io.sentry.protocol.i0 M();

    List N();

    String O();

    void P(w3 w3Var);

    o1 b();

    void c(io.sentry.protocol.i0 i0Var);

    void clear();

    e1 clone();

    void d(Throwable th, d7 d7Var, String str);

    Map getAttributes();

    Map getExtras();

    io.sentry.protocol.r h();

    void i(g gVar, l0 l0Var);

    io.sentry.protocol.j j();

    io.sentry.protocol.w l();

    void m(String str, String str2);

    void n(io.sentry.protocol.w wVar);

    q6 o();

    q1 p();

    c7 q();

    io.sentry.internal.debugmeta.c r();

    void s();

    io.sentry.featureflags.b t();

    c7 u();

    Queue v();

    q5 w();

    w3 x();

    c7 y(c4 c4Var);

    void z(String str);
}
