package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.Gender;
import tech.chatmind.api.SkinType;
import tech.chatmind.api.UserProfileResponse;
import tech.chatmind.api.UserProfileResult;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jpf extends gbe implements l26 {
    Object L$0;
    int label;
    final /* synthetic */ npf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpf(npf npfVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = npfVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jpf(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        n2f n2fVar;
        Object objB;
        List list;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                int iOrdinal = k8b.c().ordinal();
                if (iOrdinal == 0) {
                    n2fVar = n2f.a;
                } else {
                    if (iOrdinal != 1) {
                        throw new rf9();
                    }
                    n2fVar = n2f.b;
                }
                vkf vkfVar = this.this$0.a;
                this.L$0 = n2fVar;
                this.label = 1;
                objB = vkfVar.b(this);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n2fVar = (n2f) this.L$0;
                jzb.q(obj);
                objB = obj;
            }
            ServerResponse serverResponse = (ServerResponse) objB;
            if (tgc.k(serverResponse)) {
                npf npfVar = this.this$0;
                int i2 = npf.c;
                npfVar.b("Failed to get user profile");
                return null;
            }
            if (!serverResponse.getSuccess() || !((UserProfileResponse) serverResponse.getData()).getSuccess()) {
                serverResponse = null;
            }
            if (serverResponse != null) {
                npf npfVar2 = this.this$0;
                UserProfileResponse userProfileResponse = (UserProfileResponse) serverResponse.getData();
                UserProfileResult userMainInfo = userProfileResponse.getUserMainInfo();
                String nickname = userMainInfo.getNickname();
                String str = nickname == null ? "" : nickname;
                Integer gender = userMainInfo.getGender();
                String strName = gender != null ? ((Gender) ((mx4) Gender.getEntries()).get(gender.intValue())).name() : null;
                String str2 = strName == null ? "" : strName;
                String birthday = userMainInfo.getBirthday();
                String str3 = birthday == null ? "" : birthday;
                String selfDescription = userMainInfo.getSelfDescription();
                String str4 = selfDescription == null ? "" : selfDescription;
                Integer customizedCardBack = userMainInfo.getCustomizedCardBack();
                List<SkinType> purchasedTarotCards = userMainInfo.getPurchasedTarotCards();
                pu4 pu4Var = pu4.a;
                if (purchasedTarotCards != null) {
                    ArrayList arrayList = new ArrayList(t72.u(purchasedTarotCards, 10));
                    for (SkinType skinType : purchasedTarotCards) {
                        int i3 = npf.c;
                        npfVar2.getClass();
                        arrayList.add(npf.c(skinType, n2fVar));
                    }
                    list = arrayList;
                } else {
                    list = pu4Var;
                }
                SkinType currentTarotCard = userMainInfo.getCurrentTarotCard();
                int i4 = npf.c;
                npfVar2.getClass();
                n2f n2fVarC = npf.c(currentTarotCard, n2fVar);
                List<String> quinSource = userMainInfo.getQuinSource();
                List<String> list2 = quinSource == null ? pu4Var : quinSource;
                List<String> intentions = userMainInfo.getIntentions();
                return new yof(str, str2, str3, str4, customizedCardBack, list, n2fVarC, list2, intentions == null ? pu4Var : intentions, userMainInfo.getOptOutAllServerPush(), userMainInfo.getOptOutDailyTarotLocalPush(), userMainInfo.getOptOutTomorrowTarotLocalPush(), userProfileResponse.getAppReviewClaimed());
            }
            return null;
        } catch (Exception e) {
            npf npfVar3 = this.this$0;
            int i5 = npf.c;
            npfVar3.getClass();
            if (e instanceof CancellationException) {
                throw e;
            }
            ynb.h0(e);
            if (tgc.j(e, false)) {
                npfVar3.b("Failed to get user profile");
            } else {
                npfVar3.d().c("Failed to get user profile", e);
            }
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jpf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
