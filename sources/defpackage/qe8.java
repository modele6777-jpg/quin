package defpackage;

import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.personality.ReportData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qe8 extends gbe implements l26 {
    final /* synthetic */ x16 $toReportDirectly;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ se8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe8(x16 x16Var, se8 se8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$toReportDirectly = x16Var;
        this.this$0 = se8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        qe8 qe8Var = new qe8(this.$toReportDirectly, this.this$0, xn2Var);
        qe8Var.L$0 = obj;
        return qe8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        hsb hsbVar = (hsb) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (hsbVar instanceof fsb) {
            this.$toReportDirectly.invoke();
        } else {
            if (!(hsbVar instanceof gsb)) {
                ap.c();
                return null;
            }
            ReportData reportData = ((gsb) hsbVar).a;
            fie fieVar = TarotCardType.Companion;
            String name = reportData.getOverview().getTarotCard().getName();
            fieVar.getClass();
            TarotCardType tarotCardTypeA = fie.a(name);
            s0e s0eVar = this.this$0.T0;
            do {
                value = s0eVar.getValue();
            } while (!s0eVar.l(value, nsb.a((nsb) value, null, reportData.getPersonality(), tarotCardTypeA, false, false, 25)));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        qe8 qe8Var = (qe8) k((xn2) obj2, (hsb) obj);
        wef wefVar = wef.a;
        qe8Var.r(wefVar);
        return wefVar;
    }
}
