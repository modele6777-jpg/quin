package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kl5 implements wj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj5 b;
    public final /* synthetic */ l26 c;

    public /* synthetic */ kl5(wj5 wj5Var, l26 l26Var, int i) {
        this.a = i;
        this.b = wj5Var;
        this.c = l26Var;
    }

    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        l26 l26Var = this.c;
        wj5 wj5Var = this.b;
        switch (i) {
            case 0:
                Object objB = wj5Var.b(new ml5(new imb(), xj5Var, l26Var), xn2Var);
                return objB == bw2Var ? objB : wefVar;
            default:
                Object objB2 = wj5Var.b(new rm5(xj5Var, l26Var), xn2Var);
                return objB2 == bw2Var ? objB2 : wefVar;
        }
    }
}
