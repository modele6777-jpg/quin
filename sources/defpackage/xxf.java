package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xxf implements pg1 {
    public final uf a;
    public final byf b;
    public final zxf c;

    public xxf(pg1 pg1Var, zxf zxfVar, r45 r45Var) {
        this.c = zxfVar;
        this.a = new uf(pg1Var.f(), r45Var);
        this.b = new byf(pg1Var.q());
    }

    @Override // defpackage.pg1
    public final m88 a() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.nif
    public final void c(oif oifVar) {
        p8c.m();
        this.c.c(oifVar);
    }

    @Override // defpackage.nif
    public final void e(oif oifVar) {
        p8c.m();
        this.c.e(oifVar);
    }

    @Override // defpackage.pg1
    public final ef1 f() {
        return this.a;
    }

    @Override // defpackage.nif
    public final void h(oif oifVar) {
        p8c.m();
        this.c.h(oifVar);
    }

    @Override // defpackage.pg1
    public final void l(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.pg1
    public final void m(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.pg1
    public final boolean o() {
        return false;
    }

    @Override // defpackage.pg1
    public final ng1 q() {
        return this.b;
    }

    @Override // defpackage.nif
    public final void r(oif oifVar) {
        p8c.m();
        this.c.r(oifVar);
    }
}
