package defpackage;

import ai.askquin.data.InAppMessageUiModel;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import ai.askquin.ui.share.SharePayload$DrawnCards;
import android.view.View;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.Duration;
import java.util.List;
import tech.chatmind.api.Gender;
import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b8 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b8(rz7 rz7Var, Object obj, int i, Object obj2, int i2) {
        this.a = 27;
        this.d = rz7Var;
        this.e = obj;
        this.c = i;
        this.b = obj2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        wef wefVar = wef.a;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cn1.g((Gender) obj5, (a26) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                lc.d((gb) obj5, (fb) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                i7h.c((ul9) obj5, (yi) obj4, (dd2) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                feg.b(k99.P(i2 | 1), (a26) obj4, (l46) obj, (j09) obj5, (List) obj3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                jgb.x((j09) obj5, (b1b) obj4, (dd2) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                kj0.W((d0f) obj5, (e89) obj4, (dd2) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                qn4.h((Integer) obj5, (a26) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                jgb.g((j09) obj5, (bx9) obj4, (dd2) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                vd0.o((d92) obj5, (j09) obj4, (k00) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((dd2) obj5).g(obj4, obj3, (l46) obj, k99.P(i2) | 1);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                pn2.b((j09) obj5, (ln2) obj3, (a26) obj4, (l46) obj, k99.P(1), this.c);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                pn2.a((ln2) obj5, (j09) obj4, (dd2) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                b53.a((DailyCardBasicInfo) obj5, (qhe) obj4, (TarotSkinIdentify) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                b53.c((DailyCardBasicInfo) obj5, (xad) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                vf3.f((j09) obj5, this.c, (a26) obj4, (ke3) obj3, (l46) obj, k99.P(7));
                break;
            case 15:
                String str = (String) obj;
                ((Integer) obj2).getClass();
                str.getClass();
                ((l26) obj5).z("play_view", str);
                ((l26) obj4).z(((mx4) ((lx4) obj3)).get(i2), str);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).intValue();
                lt3.c((hne) obj5, (ume) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                g21.f((SharePayload$DrawnCards) obj5, (String) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                g21.i((SharePayload$DrawnCards) obj5, (a26) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                i7h.j((View) obj5, (sw3) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 20:
                dd2 dd2Var = (dd2) obj5;
                c4c c4cVar = (c4c) obj4;
                List list = (List) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    dd2Var.t(c4cVar, list.get(i2), l46Var, 0);
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                kj0.f((mic) obj5, (Duration) obj4, (j09) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                x76.b((GiftCardItem) obj5, (wa6) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                feg.h((GiftCardItem) obj5, (a26) obj4, (j09) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                eb3.u((j09) obj5, (zb4) obj4, (x16) obj3, (l46) obj, k99.P(65), this.c);
                break;
            case 25:
                ((Integer) obj2).getClass();
                vd0.z((j09) obj5, (InAppMessageUiModel) obj3, (a26) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                vd0.x((g07) obj5, (x16) obj3, (a26) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                n16.r((rz7) obj5, this.e, this.c, this.b, (l46) obj, k99.P(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ((o18) obj5).b(obj4, (dd2) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            default:
                e89 e89Var = (e89) obj5;
                dd2 dd2Var2 = (dd2) obj4;
                g6d g6dVar = (g6d) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    ynb.t(48, af1.b0(1784349222, new k38(dd2Var2, i2, g6dVar), l46Var2), l46Var2, ((Boolean) e89Var.getValue()).booleanValue());
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ b8(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = i;
    }

    public /* synthetic */ b8(j09 j09Var, int i, a26 a26Var, ke3 ke3Var, int i2) {
        this.a = 14;
        this.d = j09Var;
        this.c = i;
        this.e = a26Var;
        this.b = ke3Var;
    }

    public /* synthetic */ b8(j09 j09Var, ln2 ln2Var, a26 a26Var, int i, int i2) {
        this.a = 10;
        this.d = j09Var;
        this.b = ln2Var;
        this.e = a26Var;
        this.c = i2;
    }

    public /* synthetic */ b8(j09 j09Var, zb4 zb4Var, x16 x16Var, int i, int i2) {
        this.a = 24;
        this.d = j09Var;
        this.e = zb4Var;
        this.b = x16Var;
        this.c = i2;
    }

    public /* synthetic */ b8(e89 e89Var, dd2 dd2Var, int i, g6d g6dVar) {
        this.a = 29;
        this.d = e89Var;
        this.e = dd2Var;
        this.c = i;
        this.b = g6dVar;
    }

    public /* synthetic */ b8(d0f d0fVar, e89 e89Var, dd2 dd2Var, int i) {
        this.a = 5;
        this.d = d0fVar;
        this.e = e89Var;
        this.b = dd2Var;
        this.c = i;
    }

    public /* synthetic */ b8(DailyCardBasicInfo dailyCardBasicInfo, qhe qheVar, TarotSkinIdentify tarotSkinIdentify, int i) {
        this.a = 12;
        this.d = dailyCardBasicInfo;
        this.e = qheVar;
        this.b = tarotSkinIdentify;
        this.c = i;
    }

    public /* synthetic */ b8(Object obj, Object obj2, a26 a26Var, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.e = a26Var;
        this.c = i;
    }
}
