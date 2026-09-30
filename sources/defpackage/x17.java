package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x17 extends sv3 implements ug2 {
    public boolean F0;
    public m77 G0;
    public float H0;
    public float I0;
    public boolean J0;
    public lyd K0;
    public wne L0;
    public jx M0;
    public x4d N0;
    public final jx O0;
    public final g81 P0;

    public x17(boolean z, m77 m77Var, wne wneVar, x4d x4dVar, float f, float f2) {
        this.F0 = z;
        this.G0 = m77Var;
        this.H0 = f;
        this.I0 = f2;
        this.L0 = wneVar;
        this.N0 = x4dVar;
        this.O0 = new jx(new yi4((this.J0 && z) ? f : f2), xo1.i, null, 12);
        g81 g81Var = new g81(new h81(), new za6(11, this));
        l1(g81Var);
        this.P0 = g81Var;
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.i09
    public final void d1() {
        this.K0 = ynb.V(Z0(), null, null, new v17(this, null), 3);
        if (this.M0 == null) {
            wne wneVarS = this.L0;
            if (wneVarS == null) {
                wneVarS = m8c.s((m82) eb3.H(this, o82.a), (hue) eb3.H(this, iue.a));
            }
            long jC = wneVarS.c(this.F0, false, this.J0);
            this.M0 = new jx(new y72(jC), new y6f(xx.X, new w82(y72.e(jC))), null, 12);
        }
    }

    public final void o1() {
        ynb.V(Z0(), null, null, new t17(this, null), 3);
        ynb.V(Z0(), null, null, new u17(this, null), 3);
    }

    public final Object p1(gbe gbeVar) throws Throwable {
        this.J0 = false;
        ((u69) this.G0).a.b(new qb1(6, new ArrayList(), this), gbeVar);
        return bw2.a;
    }
}
