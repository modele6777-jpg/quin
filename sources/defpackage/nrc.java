package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nrc extends gbe implements l26 {
    final /* synthetic */ hrc $session;
    final /* synthetic */ SolarTerm $solarTerm;
    final /* synthetic */ int $year;
    int label;
    final /* synthetic */ orc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrc(orc orcVar, int i, SolarTerm solarTerm, hrc hrcVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = orcVar;
        this.$year = i;
        this.$solarTerm = solarTerm;
        this.$session = hrcVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new nrc(this.this$0, this.$year, this.$solarTerm, this.$session, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            lqc lqcVar = this.this$0.b;
            int i2 = this.$year;
            SolarTerm solarTerm = this.$solarTerm;
            solarTerm.getClass();
            ybc ybcVar = new ybc(new jqc(lqcVar, i2, solarTerm, null));
            lrc lrcVar = new lrc(this.this$0, this.$session, this.$year, this.$solarTerm, 1);
            this.label = 1;
            Object objB = ybcVar.b(lrcVar, this);
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
        return ((nrc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
