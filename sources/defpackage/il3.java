package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class il3 extends gbe implements l26 {
    int label;
    final /* synthetic */ ol3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il3(ol3 ol3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ol3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new il3(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wj5 wj5VarI = dj6.I(new hl3(this.this$0.b.b));
            bl3 bl3Var = new bl3(this.this$0, 2);
            this.label = 1;
            Object objB = wj5VarI.b(bl3Var, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
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
        return ((il3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
