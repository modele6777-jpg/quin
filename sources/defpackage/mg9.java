package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mg9 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        mg9 mg9Var = new mg9(2, xn2Var);
        mg9Var.L$0 = obj;
        return mg9Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        aw2 aw2Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            aw2Var = (aw2) this.L$0;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aw2Var = (aw2) this.L$0;
            jzb.q(obj);
        }
        while (tq.F(aw2Var.getCoroutineContext())) {
            d59 d59Var = new d59(24);
            this.L$0 = aw2Var;
            this.label = 1;
            Object objG0 = tm7.J(getContext()).g0(this, d59Var);
            bw2 bw2Var = bw2.a;
            if (objG0 == bw2Var) {
                return bw2Var;
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mg9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
