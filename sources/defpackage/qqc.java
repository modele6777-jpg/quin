package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qqc extends gbe implements l26 {
    final /* synthetic */ SolarTerm $solarTerm;
    final /* synthetic */ int $year;
    int label;
    final /* synthetic */ rqc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqc(rqc rqcVar, int i, SolarTerm solarTerm, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = rqcVar;
        this.$year = i;
        this.$solarTerm = solarTerm;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qqc(this.this$0, this.$year, this.$solarTerm, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        pic picVar = this.this$0.a;
        int i2 = this.$year;
        String wireValue = this.$solarTerm.getWireValue();
        this.label = 1;
        Object objD = picVar.d(i2, wireValue, this);
        bw2 bw2Var = bw2.a;
        return objD == bw2Var ? bw2Var : objD;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qqc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
