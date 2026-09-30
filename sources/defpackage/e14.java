package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e14 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd8 b;

    public /* synthetic */ e14(gd8 gd8Var, int i) {
        this.a = i;
        this.b = gd8Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        gd8 gd8Var = this.b;
        switch (i) {
            case 0:
                ynb.V(lw2.a, null, null, new m44(gd8Var, null), 3);
                jcc.k(0, "已重置 TP 标志 + localStorage");
                break;
            case 1:
                ynb.V(lw2.a, null, null, new n44(gd8Var, null), 3);
                jcc.k(0, "占卜 +1");
                break;
            case 2:
                ynb.V(lw2.a, null, null, new o44(gd8Var, null), 3);
                jcc.k(0, "今日运势 +3（按日期去重，可能只 +1）");
                break;
            case 3:
                isa isaVar = xqa.Y.a;
                qn2 qn2Var = lw2.a;
                ynb.V(qn2Var, null, null, new a34(isaVar, "", null), 3);
                ynb.V(qn2Var, null, null, new d34(xqa.W.a, "", null), 3);
                ynb.V(qn2Var, null, null, new g34(xqa.X.a, "", null), 3);
                hs3 hs3Var = xqa.a0;
                ynb.V(qn2Var, null, null, new j34(hs3Var.a, Boolean.TRUE, null), 3);
                lw2.a(new o24(gd8Var, null));
                break;
            case 4:
                ynb.V(lw2.a, null, null, new d64(gd8Var, null), 3);
                break;
            default:
                ynb.V(lw2.a, null, null, new f64(gd8Var, null), 3);
                break;
        }
        return wefVar;
    }
}
