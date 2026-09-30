package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sc3 implements wj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sc3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        int i = this.a;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object objB = ((kl5) obj).b(new rc3(xj5Var), xn2Var);
                return objB == bw2Var ? objB : wefVar;
            case 1:
                ak5 ak5Var = new ak5((n26) obj, xj5Var, null);
                zj5 zj5Var = new zj5(xn2Var, xn2Var.getContext());
                Object objC = gcc.C(zj5Var, true, zj5Var, ak5Var);
                return objC == bw2Var ? objC : wefVar;
            case 2:
                Object objA = xj5Var.a(obj, xn2Var);
                return objA == bw2Var ? objA : wefVar;
            default:
                wj5[] wj5VarArr = (wj5[]) obj;
                Object objV = lmg.V(xn2Var, xj5Var, new wj7(24, wj5VarArr), new hag(3, null), wj5VarArr);
                return objV == bw2Var ? objV : wefVar;
        }
    }
}
