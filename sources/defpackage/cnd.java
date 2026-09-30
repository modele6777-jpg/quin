package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cnd implements n26 {
    public final /* synthetic */ mmd a;
    public final /* synthetic */ a26 b;

    public cnd(mmd mmdVar, a26 a26Var) {
        this.a = mmdVar;
        this.b = a26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((d92) obj).getClass();
        boolean z = false;
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            a26 a26Var = this.b;
            boolean zG = l46Var.g(a26Var);
            mmd mmdVar = this.a;
            boolean zG2 = zG | l46Var.g(mmdVar);
            Object objR = l46Var.R();
            if (zG2 || objR == sf2.a) {
                objR = new n5(a26Var, mmdVar, z, 24);
                l46Var.p0(objR);
            }
            n3d.a(null, this.a, 0.0f, true, (x16) objR, l46Var, 3072);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
