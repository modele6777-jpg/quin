package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x9d extends gbe implements l26 {
    final /* synthetic */ o7a $action;
    final /* synthetic */ w7d $bitmapLease;
    int label;
    final /* synthetic */ bad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9d(bad badVar, w7d w7dVar, o7a o7aVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = badVar;
        this.$bitmapLease = w7dVar;
        this.$action = o7aVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new x9d(this.this$0, this.$bitmapLease, this.$action, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            bad badVar = this.this$0;
            w7d w7dVar = this.$bitmapLease;
            n7a n7aVar = (n7a) this.$action;
            gbd gbdVar = n7aVar.b;
            String str = n7aVar.c;
            this.label = 1;
            Object objG = badVar.g(w7dVar, gbdVar, str, this);
            bw2 bw2Var = bw2.a;
            if (objG == bw2Var) {
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

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((x9d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
