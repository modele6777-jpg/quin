package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xq6 extends i09 implements i4f, ria, ug2 {
    public ju E0;
    public boolean F0;
    public cj4 Z;

    public xq6(ju juVar, cj4 cj4Var) {
        this.Z = cj4Var;
        this.E0 = juVar;
    }

    @Override // defpackage.ria
    public final void E(hia hiaVar, iia iiaVar, long j) {
        if (iiaVar == iia.b) {
            List list = hiaVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (o1(((oia) list.get(i)).i)) {
                    int i2 = hiaVar.f;
                    if (i2 == 4) {
                        this.F0 = true;
                        n1();
                        return;
                    } else {
                        if (i2 == 5) {
                            p1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.ria
    public final void N() {
        p1();
    }

    @Override // defpackage.i09
    public final void e1() {
        p1();
    }

    public final void l1() {
        ju juVar;
        mmb mmbVar = new mmb();
        n3d.t(this, new tk6(16, mmbVar));
        xq6 xq6Var = (xq6) mmbVar.element;
        if (xq6Var == null || (juVar = xq6Var.E0) == null) {
            juVar = this.E0;
        }
        m1(juVar);
    }

    public abstract void m1(mia miaVar);

    public final void n1() {
        imb imbVar = new imb();
        imbVar.element = true;
        n3d.v(this, new wq6(imbVar, 0));
        if (imbVar.element) {
            l1();
        }
    }

    public abstract boolean o1(int i);

    public final void p1() {
        if (this.F0) {
            this.F0 = false;
            if (this.Y) {
                mmb mmbVar = new mmb();
                n3d.t(this, new up(mmbVar, 3));
                xq6 xq6Var = (xq6) mmbVar.element;
                if (xq6Var != null) {
                    xq6Var.l1();
                } else {
                    m1(null);
                }
            }
        }
    }

    @Override // defpackage.ria
    public final long r() {
        if (this.Z == null) {
            return t0f.a;
        }
        sw3 sw3Var = vd0.s0(this).O0;
        int i = t0f.b;
        return gdc.j(sw3Var.D0(10.0f), sw3Var.D0(40.0f), sw3Var.D0(10.0f), sw3Var.D0(40.0f));
    }
}
