package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.router.GiftCardFixtureScenario;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh1 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;

    public /* synthetic */ zh1(a26 a26Var, int i) {
        this.a = i;
        this.b = a26Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        sfb sfbVar = sfb.DISLIKE;
        sfb sfbVar2 = sfb.LIKE;
        sfb sfbVar3 = sfb.LOVE;
        wef wefVar = wef.a;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                a26Var.d(Float.valueOf(-90.0f));
                break;
            case 1:
                a26Var.d(Float.valueOf(90.0f));
                break;
            case 2:
                a26Var.d(Boolean.FALSE);
                break;
            case 3:
                a26Var.d(Boolean.FALSE);
                break;
            case 4:
                a26Var.d(l33.a);
                break;
            case 5:
                a26Var.d(m33.a);
                break;
            case 6:
                a26Var.d(new ka4(1));
                break;
            case 7:
                a26Var.d(new ka4(0));
                break;
            case 8:
                a26Var.d(Float.valueOf(0.0f));
                break;
            case 9:
                a26Var.d(Boolean.FALSE);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                a26Var.d(Boolean.TRUE);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                a26Var.d(Boolean.FALSE);
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                a26Var.d(Boolean.FALSE);
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                a26Var.d(Boolean.FALSE);
                break;
            case 14:
                a26Var.d(QuotaBlockReason.InsufficientBalance);
                break;
            case 15:
                a26Var.d(QuotaBlockReason.NoFollowUpPermission);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                a26Var.d(u06.CopyLink);
                break;
            case 17:
                a26Var.d(GiftCardFixtureScenario.SentList);
                break;
            case 18:
                a26Var.d(GiftCardSku.OneMonth);
                break;
            case 19:
                a26Var.d(GiftCardSku.OneYear);
                break;
            case 20:
                a26Var.d(t91.b);
                break;
            case 21:
                a26Var.d(t91.a);
                break;
            case 22:
                a26Var.d(sfbVar);
                break;
            case 23:
                a26Var.d(sfbVar2);
                break;
            case 24:
                a26Var.d(sfbVar3);
                break;
            case 25:
                a26Var.d(sfbVar);
                break;
            case 26:
                a26Var.d(sfbVar2);
                break;
            case 27:
                a26Var.d(sfbVar3);
                break;
            case 28:
                a26Var.d(gbd.e);
                break;
            default:
                a26Var.d(s4b.a);
                break;
        }
        return wefVar;
    }
}
