package defpackage;

import ai.askquin.datastore.model.UserProfile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rof implements xj5 {
    public final /* synthetic */ xj5 a;

    public rof(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        qof qofVar;
        if (xn2Var instanceof qof) {
            qofVar = (qof) xn2Var;
            int i = qofVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qofVar.label = i - Integer.MIN_VALUE;
            } else {
                qofVar = new qof(this, xn2Var);
            }
        } else {
            qofVar = new qof(this, xn2Var);
        }
        Object obj2 = qofVar.result;
        int i2 = qofVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            UserProfile userProfile = (UserProfile) obj;
            String nickname = userProfile.getNickname();
            String gender = userProfile.getGender();
            if (!t72.I("MALE", "FEMALE", "OTHER", "UNDISCLOSED").contains(gender)) {
                gender = null;
            }
            String str = gender == null ? "UNDISCLOSED" : gender;
            String bios = userProfile.getBios();
            Integer cardCoverOrdinal = userProfile.getCardCoverOrdinal();
            yof yofVar = new yof(nickname, str, userProfile.getBirthday(), bios, cardCoverOrdinal != null ? new Integer(mh3.o(cardCoverOrdinal.intValue(), 0, 21)) : null, userProfile.getPurchasedSkins(), userProfile.getUsingSkinType(), userProfile.getOptOutAllServerPush(), userProfile.getOptOutDailyTarotLocalPush(), userProfile.getOptOutTomorrowTarotLocalPush(), userProfile.getAppReviewClaimed(), 384);
            qofVar.L$0 = null;
            qofVar.L$1 = null;
            qofVar.L$2 = null;
            qofVar.L$3 = null;
            qofVar.label = 1;
            Object objA = this.a.a(yofVar, qofVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
