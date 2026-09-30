package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s3g extends gbe implements l26 {
    final /* synthetic */ int $itemCount;
    final /* synthetic */ h0e $latestOnScrollingChanged$delegate;
    final /* synthetic */ h0e $latestOnValueChange$delegate;
    final /* synthetic */ h0e $latestValue$delegate;
    final /* synthetic */ j18 $listState;
    final /* synthetic */ z67 $range;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3g(j18 j18Var, int i, z67 z67Var, h0e h0eVar, h0e h0eVar2, h0e h0eVar3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$listState = j18Var;
        this.$itemCount = i;
        this.$range = z67Var;
        this.$latestOnScrollingChanged$delegate = h0eVar;
        this.$latestValue$delegate = h0eVar2;
        this.$latestOnValueChange$delegate = h0eVar3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new s3g(this.$listState, this.$itemCount, this.$range, this.$latestOnScrollingChanged$delegate, this.$latestValue$delegate, this.$latestOnValueChange$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wj5 wj5VarI = dj6.I(jzb.p(new te3(this.$listState, 7)));
            r3g r3gVar = new r3g(this.$itemCount, this.$range, this.$latestOnScrollingChanged$delegate, this.$latestValue$delegate, this.$latestOnValueChange$delegate);
            this.label = 1;
            Object objB = wj5VarI.b(r3gVar, this);
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
        return ((s3g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
