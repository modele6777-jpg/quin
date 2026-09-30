package defpackage;

import java.util.List;
import tech.chatmind.api.seasonal.model.SeasonalCard;
import tech.chatmind.api.seasonal.model.SeasonalReadingRequest;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nqc extends gbe implements l26 {
    final /* synthetic */ List<SeasonalCard> $cards;
    final /* synthetic */ SolarTerm $solarTerm;
    final /* synthetic */ SeasonalUserInfo $userInfo;
    final /* synthetic */ int $year;
    int label;
    final /* synthetic */ rqc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqc(rqc rqcVar, int i, SolarTerm solarTerm, SeasonalUserInfo seasonalUserInfo, List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = rqcVar;
        this.$year = i;
        this.$solarTerm = solarTerm;
        this.$userInfo = seasonalUserInfo;
        this.$cards = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new nqc(this.this$0, this.$year, this.$solarTerm, this.$userInfo, this.$cards, xn2Var);
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
        SeasonalReadingRequest seasonalReadingRequest = new SeasonalReadingRequest(this.$year, this.$solarTerm, this.$userInfo, this.$cards);
        this.label = 1;
        Object objA = picVar.a(seasonalReadingRequest, this);
        bw2 bw2Var = bw2.a;
        return objA == bw2Var ? bw2Var : objA;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nqc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
