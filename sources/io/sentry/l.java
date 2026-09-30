package io.sentry;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends io.sentry.protocol.e {
    public final io.sentry.protocol.e c;
    public final io.sentry.protocol.e d;
    public final io.sentry.protocol.e e;
    public final i4 f;

    public l(io.sentry.protocol.e eVar, io.sentry.protocol.e eVar2, io.sentry.protocol.e eVar3, i4 i4Var) {
        this.c = eVar;
        this.d = eVar2;
        this.e = eVar3;
        this.f = i4Var;
    }

    @Override // io.sentry.protocol.e
    public final void a() {
        y().a();
    }

    @Override // io.sentry.protocol.e
    public final boolean b(Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final Set c() {
        return z().a.entrySet();
    }

    @Override // io.sentry.protocol.e
    public final Object d(Object obj) {
        Object objD = this.e.d(obj);
        if (objD != null) {
            return objD;
        }
        Object objD2 = this.d.d(obj);
        return objD2 != null ? objD2 : this.c.d(obj);
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.a e() {
        io.sentry.protocol.a aVarE = this.e.e();
        if (aVarE != null) {
            return aVarE;
        }
        io.sentry.protocol.a aVarE2 = this.d.e();
        return aVarE2 != null ? aVarE2 : this.c.e();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.h f() {
        io.sentry.protocol.h hVarF = this.e.f();
        if (hVarF != null) {
            return hVarF;
        }
        io.sentry.protocol.h hVarF2 = this.d.f();
        return hVarF2 != null ? hVarF2 : this.c.f();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.j g() {
        io.sentry.protocol.j jVarG = this.e.g();
        if (jVarG != null) {
            return jVarG;
        }
        io.sentry.protocol.j jVarG2 = this.d.g();
        return jVarG2 != null ? jVarG2 : this.c.g();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.q h() {
        io.sentry.protocol.q qVarH = this.e.h();
        if (qVarH != null) {
            return qVarH;
        }
        io.sentry.protocol.q qVarH2 = this.d.h();
        return qVarH2 != null ? qVarH2 : this.c.h();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.y i() {
        io.sentry.protocol.y yVarI = this.e.i();
        if (yVarI != null) {
            return yVarI;
        }
        io.sentry.protocol.y yVarI2 = this.d.i();
        return yVarI2 != null ? yVarI2 : this.c.i();
    }

    @Override // io.sentry.protocol.e
    public final e7 j() {
        e7 e7VarJ = this.e.j();
        if (e7VarJ != null) {
            return e7VarJ;
        }
        e7 e7VarJ2 = this.d.j();
        return e7VarJ2 != null ? e7VarJ2 : this.c.j();
    }

    @Override // io.sentry.protocol.e
    public final Enumeration k() {
        return z().a.keys();
    }

    @Override // io.sentry.protocol.e
    public final Object l(Object obj, String str) {
        return y().l(obj, str);
    }

    @Override // io.sentry.protocol.e
    public final void m(io.sentry.protocol.e eVar) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final void n(io.sentry.protocol.a aVar) {
        y().n(aVar);
    }

    @Override // io.sentry.protocol.e
    public final void o(io.sentry.protocol.d dVar) {
        y().o(dVar);
    }

    @Override // io.sentry.protocol.e
    public final void p(io.sentry.protocol.h hVar) {
        y().p(hVar);
    }

    @Override // io.sentry.protocol.e
    public final void q(io.sentry.protocol.j jVar) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final void r(io.sentry.protocol.m mVar) {
        y().r(mVar);
    }

    @Override // io.sentry.protocol.e
    public final void s(io.sentry.protocol.q qVar) {
        y().s(qVar);
    }

    @Override // io.sentry.protocol.e, io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        z().serialize(m3Var, z0Var);
    }

    @Override // io.sentry.protocol.e
    public final void t(io.sentry.protocol.s sVar) {
        y().t(sVar);
    }

    @Override // io.sentry.protocol.e
    public final void u(io.sentry.protocol.y yVar) {
        y().u(yVar);
    }

    @Override // io.sentry.protocol.e
    public final void v(io.sentry.protocol.g0 g0Var) {
        y().v(g0Var);
    }

    @Override // io.sentry.protocol.e
    public final void w(e7 e7Var) {
        y().w(e7Var);
    }

    public final io.sentry.protocol.e y() {
        int i = k.a[this.f.ordinal()];
        io.sentry.protocol.e eVar = this.e;
        if (i == 1) {
            return eVar;
        }
        if (i != 2) {
            return i != 3 ? eVar : this.c;
        }
        return this.d;
    }

    public final io.sentry.protocol.e z() {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.m(this.c);
        eVar.m(this.d);
        eVar.m(this.e);
        return eVar;
    }
}
