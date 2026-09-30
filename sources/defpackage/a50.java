package defpackage;

import java.util.List;
import tech.chatmind.api.annual.model.DomainReportRequestBody;
import tech.chatmind.api.common.model.TarotCardRequestBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a50 extends gbe implements l26 {
    final /* synthetic */ List<TarotCardRequestBody> $domainCards;
    final /* synthetic */ String $year;
    int label;
    final /* synthetic */ c50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a50(c50 c50Var, String str, List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = c50Var;
        this.$year = str;
        this.$domainCards = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new a50(this.this$0, this.$year, this.$domainCards, xn2Var);
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
        n10 n10Var = this.this$0.a;
        String str = this.$year;
        DomainReportRequestBody domainReportRequestBody = new DomainReportRequestBody(this.$domainCards);
        this.label = 1;
        Object objB = n10Var.b(str, domainReportRequestBody, false, this);
        bw2 bw2Var = bw2.a;
        return objB == bw2Var ? bw2Var : objB;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a50) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
