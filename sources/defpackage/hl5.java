package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hl5 implements wj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj5 b;

    public /* synthetic */ hl5(wj5 wj5Var, int i) {
        this.a = i;
        this.b = wj5Var;
    }

    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        wj5 wj5Var = this.b;
        switch (i) {
            case 0:
                Object objB = wj5Var.b(new jl5(new kmb(), xj5Var), xn2Var);
                return objB == bw2Var ? objB : wefVar;
            case 1:
                Object objB2 = wj5Var.b(new pm5(xj5Var), xn2Var);
                return objB2 == bw2Var ? objB2 : wefVar;
            default:
                Object objB3 = wj5Var.b(new wda(xj5Var), xn2Var);
                return objB3 == bw2Var ? objB3 : wefVar;
        }
    }
}
