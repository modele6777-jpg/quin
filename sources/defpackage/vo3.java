package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vo3 extends gbe implements l26 {
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo3(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$url = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        vo3 vo3Var = new vo3(this.$url, xn2Var);
        vo3Var.L$0 = obj;
        return vo3Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        Object dzbVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                String str = this.$url;
                k55 k55Var = k55.a;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                gg7 gg7Var = k55.c;
                i55 i55Var = new i55(str, null);
                gg7Var.getClass();
                za2 za2Var = new za2();
                gg7Var.x(str, new zo7(za2Var, null, i55Var));
                Object objS = za2Var.s(this);
                bw2 bw2Var = bw2.a;
                if (objS != bw2Var) {
                    objS = dzbVar;
                }
                if (objS == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        return new ezb(dzbVar);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vo3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
