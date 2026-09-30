package defpackage;

import ai.askquin.R;
import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Map;
import tech.chatmind.api.WhereDidYouHear;
import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sz5 implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ sz5(int i) {
        this.a = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        mue mueVar;
        mue mueVar2;
        int i = this.a;
        g09 g09Var = g09.a;
        d31 d31Var = d31.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                eb3.o(k99.P(1), (l46) obj);
                return wefVar;
            case 1:
                ((Integer) obj2).getClass();
                eb3.q(k99.P(1), (l46) obj);
                return wefVar;
            case 2:
                ((Integer) obj2).getClass();
                eb3.l(k99.P(1), (l46) obj);
                return wefVar;
            case 3:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    feg.j(od4.A(R.drawable.bg_widget_onboarding_popup, 0, l46Var), null, d31Var.b(g09Var), null, an2.a, 0.0f, null, l46Var, 24632, 104);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 4:
                ((Integer) obj).intValue();
                GiftCardItem giftCardItem = (GiftCardItem) obj2;
                giftCardItem.getClass();
                return giftCardItem.getCardId();
            case 5:
                ((Integer) obj2).getClass();
                pa6.n(k99.P(1), (l46) obj);
                return wefVar;
            case 6:
                int iIntValue2 = ((Integer) obj).intValue();
                mue mueVar3 = (mue) obj2;
                mueVar3.getClass();
                if (iIntValue2 == 0) {
                    return new mue(0L, w6c.l(36), ar5.z, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777209);
                }
                if (iIntValue2 != 1) {
                    if (iIntValue2 == 2) {
                        mueVar2 = new mue(y72.b(mueVar3.c(), 0.7f), w6c.l(22), ar5.z, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777208);
                    } else if (iIntValue2 == 3) {
                        mueVar = new mue(0L, w6c.l(20), ar5.z, new wq5(1), null, 0L, 0L, 0, 0, 0L, null, null, 16777201);
                    } else if (iIntValue2 == 4) {
                        mueVar2 = new mue(y72.b(mueVar3.c(), 0.7f), w6c.l(18), ar5.z, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777208);
                    } else {
                        if (iIntValue2 != 5) {
                            return mueVar3;
                        }
                        mueVar2 = new mue(y72.b(mueVar3.c(), 0.5f), 0L, ar5.z, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777210);
                    }
                    return mueVar2;
                }
                mueVar = new mue(0L, w6c.l(26), ar5.z, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777209);
                return mueVar;
            case 7:
                ((Integer) obj).intValue();
                WhereDidYouHear whereDidYouHear = (WhereDidYouHear) obj2;
                whereDidYouHear.getClass();
                return whereDidYouHear.name();
            case 8:
                ((Integer) obj2).getClass();
                al6.e(k99.P(1), (l46) obj);
                return wefVar;
            case 9:
                ((Integer) obj2).getClass();
                al6.c(k99.P(1), (l46) obj);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                jx jxVar = (jx) obj2;
                ((pcc) obj).getClass();
                jxVar.getClass();
                return (Float) jxVar.e();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                qn4.o(k99.P(1), (l46) obj);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var2 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    feg.j(od4.A(R.drawable.bg_intercept_paywall, 0, l46Var2), null, d31Var.b(g09Var), ndb.c, an2.a, 0.0f, null, l46Var2, 27704, 96);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                bm8.l(k99.P(1), (l46) obj);
                return wefVar;
            case 14:
                t05 t05Var = (t05) obj;
                a26 a26Var = (a26) obj2;
                t05Var.getClass();
                a26Var.getClass();
                x1f x1fVar = x1f.a;
                x1f.k(t05Var, a26Var, 2);
                return wefVar;
            case 15:
                t05 t05Var2 = (t05) obj;
                a26 a26Var2 = (a26) obj2;
                t05Var2.getClass();
                a26Var2.getClass();
                x1f x1fVar2 = x1f.a;
                x1f.g(t05Var2, m1f.a, a26Var2);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                nfc nfcVar = (nfc) obj;
                nfcVar.getClass();
                ((nz9) obj2).getClass();
                return a6c.i((Context) nfcVar.g(job.a.b(Context.class), null, null)).s();
            case 17:
                nfc nfcVar2 = (nfc) obj;
                nfcVar2.getClass();
                ((nz9) obj2).getClass();
                return a6c.i((Context) nfcVar2.g(job.a.b(Context.class), null, null)).w();
            case 18:
                nfc nfcVar3 = (nfc) obj;
                nfcVar3.getClass();
                ((nz9) obj2).getClass();
                return a6c.i((Context) nfcVar3.g(job.a.b(Context.class), null, null)).t();
            case 19:
                nfc nfcVar4 = (nfc) obj;
                nfcVar4.getClass();
                ((nz9) obj2).getClass();
                return a6c.i((Context) nfcVar4.g(job.a.b(Context.class), null, null)).u();
            case 20:
                nfc nfcVar5 = (nfc) obj;
                nfcVar5.getClass();
                ((nz9) obj2).getClass();
                return a6c.i((Context) nfcVar5.g(job.a.b(Context.class), null, null)).v();
            case 21:
                nfc nfcVar6 = (nfc) obj;
                nfcVar6.getClass();
                ((nz9) obj2).getClass();
                return new sv6(pa7.q(nfcVar6));
            case 22:
                ((Integer) obj2).intValue();
                return new af6(qk2.m(1));
            case 23:
                jx7 jx7Var = (jx7) obj2;
                return t72.I(Integer.valueOf(jx7Var.d.b.j()), Integer.valueOf(jx7Var.d.c.j()));
            case 24:
                j18 j18Var = (j18) obj2;
                return t72.I(Integer.valueOf(j18Var.e.b.j()), Integer.valueOf(j18Var.e.c.j()));
            case 25:
                Map mapD = ((o18) obj2).d();
                if (mapD.isEmpty()) {
                    return null;
                }
                return mapD;
            case 26:
                l46 l46Var3 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var3.f0(1978032038);
                    l46Var3.r(false);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 27:
                ((tg8) obj2).getClass();
                return wefVar;
            case 28:
                ((Integer) obj2).getClass();
                ok8.c(k99.P(1), (l46) obj);
                return wefVar;
            default:
                ((Integer) obj).getClass();
                mue mueVar4 = (mue) obj2;
                mueVar4.getClass();
                return mue.a(mueVar4, 0L, 0L, new ar5(674), null, 0L, null, 0, 0L, null, null, 16777211);
        }
    }

    public /* synthetic */ sz5(int i, int i2) {
        this.a = i2;
    }
}
