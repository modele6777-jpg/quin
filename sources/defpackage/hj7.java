package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hj7 extends czb implements n26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jj7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj7(jj7 jj7Var, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = jj7Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        hj7 hj7Var = new hj7(this.this$0, (xn2) obj3);
        hj7Var.L$0 = (ym3) obj;
        return hj7Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ym3 ym3Var = (ym3) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            byte bX = this.this$0.a.x();
            if (bX == 1) {
                return this.this$0.d(true);
            }
            if (bX == 0) {
                return this.this$0.d(false);
            }
            jj7 jj7Var = this.this$0;
            if (bX != 6) {
                if (bX == 8) {
                    return jj7Var.b();
                }
                a80.n(jj7Var.a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.L$0 = null;
            this.label = 1;
            obj = jj7Var.c(ym3Var, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return (nh7) obj;
    }
}
