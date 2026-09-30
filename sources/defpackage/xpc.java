package defpackage;

import ai.askquin.data.SeasonalReadingStore$Snapshot;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xpc extends gbe implements l26 {
    final /* synthetic */ SolarTerm $solarTerm;
    final /* synthetic */ int $year;
    int label;
    final /* synthetic */ lqc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpc(lqc lqcVar, int i, SolarTerm solarTerm, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lqcVar;
        this.$year = i;
        this.$solarTerm = solarTerm;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xpc(this.this$0, this.$year, this.$solarTerm, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        epc epcVar = this.this$0.b;
        int i = this.$year;
        SolarTerm solarTerm = this.$solarTerm;
        solarTerm.getClass();
        hs3 hs3Var = xqa.u0;
        return (SeasonalReadingStore$Snapshot) epcVar.a((String) z5c.I(nu4.a, new apc(hs3Var.a, hs3Var.b, null))).get(epcVar.b(i, solarTerm));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xpc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
