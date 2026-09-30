package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y2 implements e1 {
    public static final y2 b = new y2();
    public final io.sentry.util.f a = new io.sentry.util.f(new com.adjust.sdk.sig.r3(9));

    @Override // io.sentry.e1
    public final j1 A() {
        return c3.a;
    }

    @Override // io.sentry.e1
    public final Map B() {
        return new HashMap();
    }

    @Override // io.sentry.e1
    public final List C() {
        return new ArrayList();
    }

    @Override // io.sentry.e1
    public final List D() {
        return new ArrayList();
    }

    @Override // io.sentry.e1
    public final io.sentry.protocol.e F() {
        return new io.sentry.protocol.e();
    }

    @Override // io.sentry.e1
    public final w3 G(b4 b4Var) {
        return new w3();
    }

    @Override // io.sentry.e1
    public final String H() {
        return null;
    }

    @Override // io.sentry.e1
    public final List L() {
        return new ArrayList();
    }

    @Override // io.sentry.e1
    public final io.sentry.protocol.i0 M() {
        return null;
    }

    @Override // io.sentry.e1
    public final List N() {
        return new ArrayList();
    }

    @Override // io.sentry.e1
    public final String O() {
        return null;
    }

    @Override // io.sentry.e1
    public final o1 b() {
        return null;
    }

    @Override // io.sentry.e1
    public final e1 clone() {
        return b;
    }

    @Override // io.sentry.e1
    public final Map getAttributes() {
        return new HashMap();
    }

    @Override // io.sentry.e1
    public final Map getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.e1
    public final io.sentry.protocol.r h() {
        return null;
    }

    @Override // io.sentry.e1
    public final io.sentry.protocol.j j() {
        return null;
    }

    @Override // io.sentry.e1
    public final io.sentry.protocol.w l() {
        return io.sentry.protocol.w.b;
    }

    @Override // io.sentry.e1
    public final q6 o() {
        return (q6) this.a.a();
    }

    @Override // io.sentry.e1
    public final q1 p() {
        return null;
    }

    @Override // io.sentry.e1
    public final c7 q() {
        return null;
    }

    @Override // io.sentry.e1
    public final io.sentry.internal.debugmeta.c r() {
        return null;
    }

    @Override // io.sentry.e1
    public final io.sentry.featureflags.b t() {
        return io.sentry.featureflags.c.a;
    }

    @Override // io.sentry.e1
    public final c7 u() {
        return null;
    }

    @Override // io.sentry.e1
    public final Queue v() {
        return new ArrayDeque();
    }

    @Override // io.sentry.e1
    public final q5 w() {
        return null;
    }

    @Override // io.sentry.e1
    public final w3 x() {
        return new w3();
    }

    @Override // io.sentry.e1
    public final c7 y(c4 c4Var) {
        return null;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m29clone() {
        return b;
    }

    @Override // io.sentry.e1
    public final void clear() {
    }

    @Override // io.sentry.e1
    public final void s() {
    }

    @Override // io.sentry.e1
    public final void E(i5 i5Var) {
    }

    @Override // io.sentry.e1
    public final void I(d4 d4Var) {
    }

    @Override // io.sentry.e1
    public final void J(io.sentry.protocol.w wVar) {
    }

    @Override // io.sentry.e1
    public final void K(q1 q1Var) {
    }

    @Override // io.sentry.e1
    public final void P(w3 w3Var) {
    }

    @Override // io.sentry.e1
    public final void c(io.sentry.protocol.i0 i0Var) {
    }

    @Override // io.sentry.e1
    public final void n(io.sentry.protocol.w wVar) {
    }

    @Override // io.sentry.e1
    public final void z(String str) {
    }

    @Override // io.sentry.e1
    public final void i(g gVar, l0 l0Var) {
    }

    @Override // io.sentry.e1
    public final void m(String str, String str2) {
    }

    @Override // io.sentry.e1
    public final void d(Throwable th, d7 d7Var, String str) {
    }
}
