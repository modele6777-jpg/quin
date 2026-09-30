package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l6d extends gbe implements l26 {
    final /* synthetic */ z3g $backgroundArt;
    final /* synthetic */ e89 $backgroundBackdrop$delegate;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6d(z3g z3gVar, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$backgroundArt = z3gVar;
        this.$backgroundBackdrop$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new l6d(this.$backgroundArt, this.$backgroundBackdrop$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        e89 e89Var;
        int i = this.label;
        cv6 cv6Var = null;
        if (i == 0) {
            jzb.q(obj);
            e89Var = this.$backgroundBackdrop$delegate;
            z3g z3gVar = this.$backgroundArt;
            if (z3gVar != null) {
                ks ksVar = z3gVar.a;
                js3 js3Var = ga4.a;
                k6d k6dVar = new k6d(ksVar, null);
                this.L$0 = null;
                this.L$1 = e89Var;
                this.label = 1;
                obj = ynb.p0(js3Var, k6dVar, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            }
            float f = p6d.a;
            e89Var.setValue(cv6Var);
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e89Var = (e89) this.L$1;
        jzb.q(obj);
        cv6Var = (cv6) obj;
        float f2 = p6d.a;
        e89Var.setValue(cv6Var);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((l6d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
