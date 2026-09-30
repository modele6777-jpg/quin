package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class krc extends gbe implements l26 {
    final /* synthetic */ boolean $analyticsEnabled;
    final /* synthetic */ String $question;
    final /* synthetic */ String $seasonalPeriod;
    final /* synthetic */ hrc $session;
    final /* synthetic */ SolarTerm $solarTerm;
    final /* synthetic */ int $year;
    Object L$0;
    int label;
    final /* synthetic */ orc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krc(orc orcVar, int i, SolarTerm solarTerm, String str, hrc hrcVar, boolean z, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = orcVar;
        this.$year = i;
        this.$solarTerm = solarTerm;
        this.$question = str;
        this.$session = hrcVar;
        this.$analyticsEnabled = z;
        this.$seasonalPeriod = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new krc(this.this$0, this.$year, this.$solarTerm, this.$question, this.$session, this.$analyticsEnabled, this.$seasonalPeriod, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            imb imbVar = new imb();
            lqc lqcVar = this.this$0.b;
            int i2 = this.$year;
            SolarTerm solarTerm = this.$solarTerm;
            String str = this.$question;
            solarTerm.getClass();
            str.getClass();
            ybc ybcVar = new ybc(new dqc(lqcVar, i2, solarTerm, str, null));
            jrc jrcVar = new jrc(this.this$0, this.$session, imbVar, this.$analyticsEnabled, this.$question, this.$seasonalPeriod);
            this.L$0 = null;
            this.label = 1;
            Object objB = ybcVar.b(jrcVar, this);
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
        return ((krc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
