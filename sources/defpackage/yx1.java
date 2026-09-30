package defpackage;

import ai.askquin.ui.router.GiftCardFixtureScenario;
import java.util.List;
import java.util.Locale;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.seasonal.model.SeasonalHistoryItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yx1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ yx1(a26 a26Var, e89 e89Var, int i) {
        this.a = i;
        this.b = a26Var;
        this.c = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        int i2 = 1;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                jo5 jo5Var = (jo5) obj;
                jo5Var.getClass();
                ko5 ko5Var = (ko5) jo5Var;
                e89Var.setValue(Boolean.valueOf(ko5Var.b()));
                a26Var.d(Boolean.valueOf(ko5Var.b()));
                return wefVar;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                e89Var.setValue(bool);
                if (a26Var != null) {
                    a26Var.d(bool);
                }
                return wefVar;
            case 2:
                jo5 jo5Var2 = (jo5) obj;
                jo5Var2.getClass();
                ko5 ko5Var2 = (ko5) jo5Var2;
                e89Var.setValue(Boolean.valueOf(ko5Var2.b()));
                a26Var.d(Boolean.valueOf(ko5Var2.b()));
                return wefVar;
            case 3:
                ste steVar = (ste) obj;
                e89Var.setValue(steVar);
                a26Var.d(steVar);
                return wefVar;
            case 4:
                hl9 hl9Var = (hl9) obj;
                ste steVar2 = (ste) e89Var.getValue();
                if (steVar2 != null) {
                    a26Var.d(Integer.valueOf(steVar2.b.g(hl9Var.a)));
                }
                return wefVar;
            case 5:
                SeasonalHistoryItem seasonalHistoryItem = (SeasonalHistoryItem) obj;
                seasonalHistoryItem.getClass();
                e89Var.setValue(Boolean.FALSE);
                a26Var.d(seasonalHistoryItem);
                return wefVar;
            case 6:
                String str = (String) obj;
                str.getClass();
                List list = l96.a;
                wa6 wa6Var = (wa6) e89Var.getValue();
                wa6Var.getClass();
                int iOrdinal = wa6Var.ordinal();
                GiftCardFixtureScenario giftCardFixtureScenario = null;
                if (iOrdinal == 0) {
                    List list2 = l96.a;
                    if (str.equals(((GiftCardItem) list2.get(0)).getCardId())) {
                        giftCardFixtureScenario = GiftCardFixtureScenario.SentUnclaimed;
                    } else if (str.equals(((GiftCardItem) list2.get(1)).getCardId())) {
                        giftCardFixtureScenario = GiftCardFixtureScenario.SentClaimed;
                    } else if (str.equals(((GiftCardItem) list2.get(2)).getCardId())) {
                        giftCardFixtureScenario = GiftCardFixtureScenario.SentInvalidated;
                    }
                } else {
                    if (iOrdinal != 1) {
                        ap.c();
                        return null;
                    }
                    List list3 = l96.b;
                    if (str.equals(((GiftCardItem) list3.get(0)).getCardId())) {
                        giftCardFixtureScenario = GiftCardFixtureScenario.ReceivedActive;
                    } else if (str.equals(((GiftCardItem) list3.get(1)).getCardId())) {
                        giftCardFixtureScenario = GiftCardFixtureScenario.ReceivedPending;
                    } else if (str.equals(((GiftCardItem) list3.get(2)).getCardId())) {
                        giftCardFixtureScenario = GiftCardFixtureScenario.ReceivedUsedUp;
                    } else if (str.equals(((GiftCardItem) list3.get(3)).getCardId())) {
                        giftCardFixtureScenario = GiftCardFixtureScenario.ReceivedExpired;
                    } else if (str.equals(((GiftCardItem) list3.get(4)).getCardId())) {
                        giftCardFixtureScenario = GiftCardFixtureScenario.ReceivedInvalidated;
                    }
                }
                if (giftCardFixtureScenario == null) {
                    return wefVar;
                }
                a26Var.d(giftCardFixtureScenario);
                return wefVar;
            case 7:
                Locale locale = (Locale) obj;
                locale.getClass();
                e89Var.setValue(locale);
                a26Var.d(locale);
                return wefVar;
            default:
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                Locale[] localeArr = vd8.a;
                v08Var.X(localeArr.length, new d5(19, new tb7(9), localeArr), new x(21, localeArr), new dd2(new yj3(localeArr, a26Var, e89Var, i2), true, -1781742563));
                return wefVar;
        }
    }

    public /* synthetic */ yx1(e89 e89Var, a26 a26Var, int i) {
        this.a = i;
        this.c = e89Var;
        this.b = a26Var;
    }
}
