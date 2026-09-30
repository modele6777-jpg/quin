package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import ai.askquin.ui.share.SharedDivination;
import android.graphics.Bitmap;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import tech.chatmind.api.ShareSummaryContent;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rb(use useVar, fo5 fo5Var, int i, x16 x16Var, j09 j09Var, int i2) {
        this.a = 20;
        this.c = useVar;
        this.b = fo5Var;
        this.e = i;
        this.d = x16Var;
        this.f = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.f;
        wef wefVar = wef.a;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                lc.g((UserSubscriptionInformation) obj6, (lb) obj3, (e4d) obj5, (x16) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                lc.e((lb) obj3, (UserSubscriptionInformation) obj6, (fb) obj5, (x16) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                lc.p((j09) obj3, (UserSubscriptionInformation) obj6, (e4d) obj5, (x16) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                hkg.G((en0) obj6, (String) obj3, (x16) obj4, (x16) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                kj0.c((lla) obj6, (dd2) obj3, (d0f) obj5, (dd2) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                pp1.b((x16) obj4, (x16) obj6, (qp1) obj3, (fy9) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                eb3.e((String) obj6, (TarotCardChoice) obj3, (x16) obj4, (x16) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                vd0.m((String) obj6, (String) obj3, (String) obj5, (yxd) obj4, (l46) obj, k99.P(1), this.e);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2) | 1;
                ((dd2) obj6).h(this.b, this.f, this.d, (l46) obj, iP);
                break;
            case 9:
                ((Integer) obj2).intValue();
                qn4.i((String) obj6, (List) obj3, (y23) obj5, (j09) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).intValue();
                xj3.n((hmd) obj6, (y72) obj3, (x16) obj4, (x16) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                kj0.U((ju5) obj6, (ps5) obj3, (x16) obj4, (a26) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                t72.j((Boolean) obj6, this.b, (x48) obj5, (a26) obj4, (l46) obj, iP2);
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).intValue();
                if9.j((p29) obj6, (x16) obj4, (x16) obj3, (x16) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                tq.h((u6b) obj6, (dba) obj3, (x16) obj4, (l26) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((ndb) obj6).y0((c4c) obj3, (rf0) obj5, (dd2) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                p6d.d((String) obj6, (List) obj3, (TarotSkinIdentify) obj5, (ShareSummaryContent) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                h7d.e((SharedDivination) obj6, (x6d) obj3, (x16) obj4, (Bitmap) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                d8c.d((j09) obj6, (x16) obj4, (fy9) obj3, (String) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                sfc.c((TarotSkinIdentify) obj6, (dmd) obj3, (x16) obj4, (a26) obj5, (l46) obj, k99.P(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(49);
                o8c.c((use) obj6, (fo5) obj3, this.e, (x16) obj4, (j09) obj5, (l46) obj, iP3);
                break;
            case 21:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(1);
                o8c.f((List) obj6, (List) obj3, this.e, (a26) obj5, (x16) obj4, (l46) obj, iP4);
                break;
            case 22:
                ((Integer) obj2).getClass();
                qde.a((c4c) obj6, (j09) obj3, (a26) obj5, (a26) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                q7c.i((j09) obj6, (mfc) obj3, (List) obj5, (a26) obj4, (l46) obj, k99.P(1), this.e);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ rb(x16 x16Var, x16 x16Var2, qp1 qp1Var, fy9 fy9Var, int i) {
        this.a = 5;
        this.d = x16Var;
        this.c = x16Var2;
        this.b = qp1Var;
        this.f = fy9Var;
        this.e = i;
    }

    public /* synthetic */ rb(lla llaVar, dd2 dd2Var, d0f d0fVar, dd2 dd2Var2, int i) {
        this.a = 4;
        this.c = llaVar;
        this.b = dd2Var;
        this.f = d0fVar;
        this.d = dd2Var2;
        this.e = i;
    }

    public /* synthetic */ rb(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
        this.f = obj3;
        this.d = obj4;
        this.e = i;
    }

    public /* synthetic */ rb(Object obj, x16 x16Var, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = x16Var;
        this.b = obj2;
        this.f = obj3;
        this.e = i;
    }

    public /* synthetic */ rb(Object obj, UserSubscriptionInformation userSubscriptionInformation, Object obj2, x16 x16Var, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = userSubscriptionInformation;
        this.f = obj2;
        this.d = x16Var;
        this.e = i;
    }

    public /* synthetic */ rb(Object obj, Object obj2, x16 x16Var, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
        this.d = x16Var;
        this.f = obj3;
        this.e = i;
    }

    public /* synthetic */ rb(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
        this.f = obj3;
        this.d = obj4;
        this.e = i2;
    }

    public /* synthetic */ rb(List list, List list2, int i, a26 a26Var, x16 x16Var, int i2) {
        this.a = 21;
        this.c = list;
        this.b = list2;
        this.e = i;
        this.f = a26Var;
        this.d = x16Var;
    }
}
