package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c65 extends gbe implements l26 {
    final /* synthetic */ nu3 $refresh;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ l65 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c65(l65 l65Var, nu3 nu3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = l65Var;
        this.$refresh = nu3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new c65(this.this$0, this.$refresh, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        l65 l65Var;
        d99 d99Var;
        nu3 nu3Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            l65 l65Var2 = this.this$0;
            f99 f99Var = l65Var2.c;
            nu3 nu3Var2 = this.$refresh;
            this.L$0 = f99Var;
            this.L$1 = l65Var2;
            this.L$2 = nu3Var2;
            this.label = 1;
            Object objB = f99Var.b(this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            l65Var = l65Var2;
            d99Var = f99Var;
            nu3Var = nu3Var2;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nu3Var = (nu3) this.L$2;
            l65Var = (l65) this.L$1;
            d99Var = (d99) this.L$0;
            jzb.q(obj);
        }
        try {
            if (l65Var.d == nu3Var) {
                l65Var.d = null;
            }
            return wef.a;
        } finally {
            d99Var.h(null);
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c65) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
