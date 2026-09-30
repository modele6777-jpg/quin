package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t31 extends i09 implements h31, zu7 {
    public boolean E0;
    public pm2 Z;

    public static final hkb l1(t31 t31Var, bv7 bv7Var, x16 x16Var) {
        hkb hkbVar;
        if (t31Var.Y && t31Var.E0) {
            yf9 yf9VarR0 = vd0.r0(t31Var);
            if (!bv7Var.h()) {
                bv7Var = null;
            }
            if (bv7Var != null && (hkbVar = (hkb) x16Var.invoke()) != null) {
                return hkbVar.k(yf9VarR0.M(bv7Var, false).f());
            }
        }
        return null;
    }

    @Override // defpackage.h31
    public final Object X(yf9 yf9Var, v6 v6Var, zn2 zn2Var) {
        Object objO = jgb.O(new s31(this, yf9Var, v6Var, new j8(this, yf9Var, v6Var, 7), null), zn2Var);
        return objO == bw2.a ? objO : wef.a;
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.zu7
    public final void p(bv7 bv7Var) {
        this.E0 = true;
    }
}
