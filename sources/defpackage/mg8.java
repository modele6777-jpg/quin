package defpackage;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mg8 extends bea {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ mg8(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.bea
    public float a(rq6 rq6Var) {
        a26 a26Var;
        int iR0;
        gw9 snapshotObserver;
        int iR1;
        switch (this.b) {
            case 0:
                l26 l26Var = rq6Var.a;
                if (l26Var != null) {
                    return ((Number) l26Var.z(this, Float.valueOf(Float.NaN))).floatValue();
                }
                lg8 lg8Var = (lg8) this.c;
                if (lg8Var.Z) {
                    return Float.NaN;
                }
                mmb mmbVar = new mmb();
                mmbVar.element = lg8Var;
                while (true) {
                    a80 a80Var = ((lg8) mmbVar.element).F0;
                    float f = (a80Var == null || (iR1 = qd0.r0((rq6[]) a80Var.c, rq6Var)) < 0) ? Float.NaN : ((float[]) a80Var.d)[iR1];
                    boolean zIsNaN = Float.isNaN(f);
                    Object obj = mmbVar.element;
                    if (!zIsNaN) {
                        ((lg8) obj).l0(lg8Var.A0(), rq6Var);
                        return rq6Var.a(f, ((lg8) mmbVar.element).t0(), lg8Var.t0());
                    }
                    lg8 lg8Var2 = (lg8) obj;
                    l26 l26Var2 = lg8Var2.v;
                    if (l26Var2 != null && (a26Var = lg8Var2.w) != null && ((Boolean) a26Var.d(rq6Var)).booleanValue()) {
                        lg8 lg8Var3 = (lg8) mmbVar.element;
                        w79 w79Var = lg8Var3.y;
                        if (w79Var == null) {
                            long[] jArr = jec.a;
                            w79Var = new w79();
                            lg8Var3.y = w79Var;
                        }
                        Object objG = w79Var.g(rq6Var);
                        if (objG == null) {
                            objG = new eea(lg8Var3.B0(), lg8Var3, rq6Var);
                            w79Var.m(rq6Var, objG);
                        }
                        eea eeaVar = (eea) objG;
                        eeaVar.a = lg8Var3.B0();
                        Owner owner = lg8Var.A0().Z;
                        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
                            snapshotObserver.a.d(eeaVar, lg8.I0, new n25(l26Var2, mmbVar, rq6Var, 13));
                        }
                        ((lg8) mmbVar.element).l0(lg8Var.A0(), rq6Var);
                        a80 a80Var2 = ((lg8) mmbVar.element).F0;
                        float f2 = (a80Var2 == null || (iR0 = qd0.r0((rq6[]) a80Var2.c, rq6Var)) < 0) ? Float.NaN : ((float[]) a80Var2.d)[iR0];
                        if (!Float.isNaN(f2)) {
                            return rq6Var.a(f2, ((lg8) mmbVar.element).t0(), lg8Var.t0());
                        }
                    }
                    lg8 lg8VarC0 = ((lg8) mmbVar.element).C0();
                    if (lg8VarC0 == null) {
                        ((lg8) mmbVar.element).l0(lg8Var.A0(), rq6Var);
                        return Float.NaN;
                    }
                    mmbVar.element = lg8VarC0;
                }
                break;
            default:
                return super.a(rq6Var);
        }
    }

    @Override // defpackage.bea
    public final bv7 b() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                lg8 lg8Var = (lg8) obj;
                bv7 bv7VarT0 = lg8Var.Z ? null : lg8Var.t0();
                if (bv7VarT0 == null) {
                    lg8Var.A0().getLayoutDelegate().b();
                }
                return bv7VarT0;
            default:
                return ((AndroidComposeView) obj).getRoot().getOuterCoordinator$ui();
        }
    }

    @Override // defpackage.bea
    public final cv7 c() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((lg8) obj).getLayoutDirection();
            default:
                return ((AndroidComposeView) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.bea
    public final int d() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((lg8) obj).Y();
            default:
                return ((AndroidComposeView) obj).getRoot().I();
        }
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((lg8) obj).getDensity();
            default:
                return ((AndroidComposeView) obj).getDensity().getDensity();
        }
    }

    @Override // defpackage.sw3
    public final float h0() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((lg8) obj).h0();
            default:
                return ((AndroidComposeView) obj).getDensity().h0();
        }
    }
}
