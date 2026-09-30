package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xqe extends gbe implements l26 {
    final /* synthetic */ sl9 $offsetMapping;
    final /* synthetic */ rfa $platformSelectionBehaviors;
    final /* synthetic */ eue $selection;
    final /* synthetic */ String $text;
    final /* synthetic */ long $transformedSelection;
    int label;
    final /* synthetic */ cre this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqe(rfa rfaVar, String str, long j, eue eueVar, cre creVar, sl9 sl9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$platformSelectionBehaviors = rfaVar;
        this.$text = str;
        this.$transformedSelection = j;
        this.$selection = eueVar;
        this.this$0 = creVar;
        this.$offsetMapping = sl9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xqe(this.$platformSelectionBehaviors, this.$text, this.$transformedSelection, this.$selection, this.this$0, this.$offsetMapping, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            rfa rfaVar = this.$platformSelectionBehaviors;
            String str = this.$text;
            long j = this.$transformedSelection;
            this.label = 1;
            obj = ((yfa) rfaVar).f(str, j, this);
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
        wef wefVar = wef.a;
        if (eueVar != null) {
            sl9 sl9Var = this.$offsetMapping;
            long j2 = eueVar.a;
            long jB = u3c.b(sl9Var.j((int) (j2 >> 32)), sl9Var.j((int) (j2 & 4294967295L)));
            if (!eue.b(jB, this.$selection) && pa7.t(this.this$0.l().a.b, this.$text)) {
                sl9 sl9Var2 = this.$offsetMapping;
                cre creVar = this.this$0;
                if (sl9Var2 == creVar.b) {
                    creVar.c.d(cre.b(creVar.l().a, jB));
                    this.this$0.v = new eue(jB);
                }
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xqe) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
