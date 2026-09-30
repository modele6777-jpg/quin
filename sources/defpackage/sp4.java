package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.share.SharePayload$DrawnCards;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sp4 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SharePayload$DrawnCards b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ sp4(SharePayload$DrawnCards sharePayload$DrawnCards, a26 a26Var, int i) {
        this.a = i;
        this.b = sharePayload$DrawnCards;
        this.c = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        TarotSkinIdentify tarotSkinIdentifyN;
        int i = this.a;
        wef wefVar = wef.a;
        a26 a26Var = this.c;
        SharePayload$DrawnCards sharePayload$DrawnCards = this.b;
        int i2 = 1;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    pr4 pr4Var = snd.a;
                    die dieVar = (die) l46Var.k(pr4Var);
                    mfc mfcVar = ((e8b) l46Var.k(l8b.a)).C;
                    String skinType = sharePayload$DrawnCards.getSkinType();
                    if (skinType == null || (tarotSkinIdentifyN = r8c.n(skinType, mfcVar)) == null) {
                        tarotSkinIdentifyN = dieVar.a;
                    }
                    mh3.a(pr4Var.a(die.a(dieVar, tarotSkinIdentifyN)), af1.b0(768705626, new sp4(sharePayload$DrawnCards, a26Var, i2), l46Var), l46Var, 56);
                }
                break;
            default:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    g21.j(sharePayload$DrawnCards, a26Var, l46Var, SharePayload$DrawnCards.$stable);
                }
                break;
        }
        return wefVar;
    }
}
