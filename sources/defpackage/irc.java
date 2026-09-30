package defpackage;

import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class irc extends gbe implements l26 {
    final /* synthetic */ hrc $session;
    final /* synthetic */ SolarTerm $solarTerm;
    final /* synthetic */ int $year;
    int label;
    final /* synthetic */ orc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irc(orc orcVar, int i, SolarTerm solarTerm, hrc hrcVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = orcVar;
        this.$year = i;
        this.$solarTerm = solarTerm;
        this.$session = hrcVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new irc(this.this$0, this.$year, this.$solarTerm, this.$session, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        orc orcVar;
        hrc hrcVar;
        Object value;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            lqc lqcVar = this.this$0.b;
            int i2 = this.$year;
            SolarTerm solarTerm = this.$solarTerm;
            this.label = 1;
            obj = lqcVar.e(i2, solarTerm, this);
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
        SeasonalReadingResponse seasonalReadingResponse = (SeasonalReadingResponse) obj;
        fpc fpcVarV = seasonalReadingResponse != null ? t4c.v(seasonalReadingResponse) : null;
        if (fpcVarV != null) {
            orc orcVar2 = this.this$0;
            hrc hrcVar2 = this.$session;
            int i3 = orc.H0;
            if (orcVar2.l(hrcVar2)) {
                s0e s0eVar = this.this$0.y;
                do {
                    value = s0eVar.getValue();
                } while (!s0eVar.l(value, fpcVarV));
                orc orcVar3 = this.this$0;
                orcVar3.v = this.$session.a;
                orcVar3.X.n(null, grc.a);
            } else {
                orcVar = this.this$0;
                hrcVar = this.$session;
                int i4 = orc.H0;
                if (orcVar.l(hrcVar)) {
                    this.this$0.X.n(null, grc.c);
                }
            }
        } else {
            orcVar = this.this$0;
            hrcVar = this.$session;
            int i5 = orc.H0;
            if (orcVar.l(hrcVar)) {
                this.this$0.X.n(null, grc.c);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((irc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
