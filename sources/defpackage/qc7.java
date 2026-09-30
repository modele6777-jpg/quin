package defpackage;

import java.util.List;
import tech.chatmind.api.RedeemResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qc7 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RedeemResponse b;

    public /* synthetic */ qc7(RedeemResponse redeemResponse, int i) {
        this.a = i;
        this.b = redeemResponse;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        RedeemResponse redeemResponse = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                l1fVar.getClass();
                Integer grantCount = redeemResponse.getGrantCount();
                l1fVar.a(Integer.valueOf(grantCount != null ? grantCount.intValue() : 0), "credits_granted");
                Integer expireDays = redeemResponse.getExpireDays();
                l1fVar.a(Integer.valueOf(expireDays != null ? expireDays.intValue() : 0), "credits_expire_days");
                break;
            default:
                l1fVar.a("success", "result");
                l1fVar.a("account", "pathway");
                List<String> tarotIds = redeemResponse.getTarotIds();
                if (tarotIds == null) {
                    tarotIds = pu4.a;
                }
                l1fVar.a(s72.D0(tarotIds, ",", null, null, null, 62), "tarot_id");
                break;
        }
        return wefVar;
    }
}
