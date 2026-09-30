package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j30 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v50 b;

    public /* synthetic */ j30(v50 v50Var, int i) {
        this.a = i;
        this.b = v50Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        v50 v50Var = this.b;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    qk2.e(null, v50Var != null ? mh3.a0(v50Var) : null, l46Var, 0);
                }
                break;
            default:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    qk2.e(null, v50Var != null ? mh3.a0(v50Var) : null, l46Var, 0);
                }
                break;
        }
        return wefVar;
    }
}
