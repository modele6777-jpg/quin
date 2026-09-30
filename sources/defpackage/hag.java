package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hag extends gbe implements n26 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        hag hagVar = new hag(3, (xn2) obj3);
        hagVar.L$0 = (xj5) obj;
        hagVar.L$1 = (Object[]) obj2;
        return hagVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ql2 ql2Var;
        int i = this.label;
        ql2 ql2Var2 = null;
        if (i == 0) {
            jzb.q(obj);
            xj5 xj5Var = (xj5) this.L$0;
            ql2[] ql2VarArr = (ql2[]) ((Object[]) this.L$1);
            int length = ql2VarArr.length;
            int i2 = 0;
            while (true) {
                ql2Var = ol2.a;
                if (i2 >= length) {
                    break;
                }
                ql2 ql2Var3 = ql2VarArr[i2];
                if (!pa7.t(ql2Var3, ql2Var)) {
                    ql2Var2 = ql2Var3;
                    break;
                }
                i2++;
            }
            if (ql2Var2 != null) {
                ql2Var = ql2Var2;
            }
            this.label = 1;
            Object objA = xj5Var.a(ql2Var, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
