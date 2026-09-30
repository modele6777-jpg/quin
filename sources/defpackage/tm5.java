package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tm5 implements wj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj5[] b;
    public final /* synthetic */ m26 c;

    public /* synthetic */ tm5(wj5[] wj5VarArr, m26 m26Var, int i) {
        this.a = i;
        this.b = wj5VarArr;
        this.c = m26Var;
    }

    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        int i = this.a;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        m26 m26Var = this.c;
        wj5[] wj5VarArr = this.b;
        switch (i) {
            case 0:
                Object objV = lmg.V(xn2Var, xj5Var, tq0.z, new sm5(null, (o26) m26Var), wj5VarArr);
                return objV == bw2Var ? objV : wefVar;
            case 1:
                Object objV2 = lmg.V(xn2Var, xj5Var, tq0.z, new um5(null, (p26) m26Var), wj5VarArr);
                return objV2 == bw2Var ? objV2 : wefVar;
            default:
                Object objV3 = lmg.V(xn2Var, xj5Var, tq0.z, new vm5(null, (q26) m26Var), wj5VarArr);
                return objV3 == bw2Var ? objV3 : wefVar;
        }
    }
}
