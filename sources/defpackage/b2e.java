package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b2e extends gbe implements l26 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f2e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2e(f2e f2eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = f2eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new b2e(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        f2e f2eVar;
        d99 d99Var;
        ya2 ya2Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            f2eVar = this.this$0;
            f99 f99Var = f2eVar.c;
            this.L$0 = f99Var;
            this.L$1 = f2eVar;
            this.label = 1;
            Object objB = f99Var.b(this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            d99Var = f99Var;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2eVar = (f2e) this.L$1;
            d99Var = (d99) this.L$0;
            jzb.q(obj);
        }
        while (!f2eVar.e.isEmpty()) {
            try {
                y1e y1eVar = (y1e) f2eVar.e.poll();
                if (y1eVar != null && (ya2Var = y1eVar.d) != null) {
                    ((za2) ya2Var).i0(new jv6(3, "Capture request is cancelled due to a reset", null));
                }
            } finally {
                d99Var.h(null);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b2e) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
