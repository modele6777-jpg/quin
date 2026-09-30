package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wre extends gbe implements l26 {
    final /* synthetic */ rfa $platformSelectionBehaviors;
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    int label;
    final /* synthetic */ jse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wre(rfa rfaVar, CharSequence charSequence, long j, jse jseVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$platformSelectionBehaviors = rfaVar;
        this.$text = charSequence;
        this.$selection = j;
        this.this$0 = jseVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wre(this.$platformSelectionBehaviors, this.$text, this.$selection, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            rfa rfaVar = this.$platformSelectionBehaviors;
            CharSequence charSequence = this.$text;
            long j = this.$selection;
            this.label = 1;
            obj = ((yfa) rfaVar).f(charSequence, j, this);
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
        eue eueVar = (eue) obj;
        jse jseVar = this.this$0;
        jseVar.getClass();
        if (eueVar != null) {
            long j2 = eueVar.a;
            if (pa7.t(jseVar.a.d().c, this.$text) && eue.c(this.this$0.a.d().d, this.$selection) && !eue.c(j2, this.this$0.a.d().d)) {
                this.this$0.a.j(j2);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wre) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
