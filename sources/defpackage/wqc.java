package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wqc extends gbe implements l26 {
    final /* synthetic */ String $question;
    final /* synthetic */ mic $season;
    final /* synthetic */ lsc $state;
    int label;
    final /* synthetic */ xqc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqc(xqc xqcVar, mic micVar, lsc lscVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = xqcVar;
        this.$season = micVar;
        this.$state = lscVar;
        this.$question = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wqc(this.this$0, this.$season, this.$state, this.$question, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ckc ckcVar = this.this$0.b;
            int iB = this.$season.b();
            String wireValue = this.$season.c().getWireValue();
            h6b h6bVar = new h6b(15, (Object) this.$state, this.$question);
            this.label = 1;
            Object objE = ckcVar.e(iB, wireValue, h6bVar, this);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
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
        return ((wqc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
