package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.webkit.WebView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pg implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;

    public /* synthetic */ pg(e89 e89Var, int i) {
        this.a = i;
        this.b = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        String strA;
        String strA2;
        String strA3;
        int i = this.a;
        String str = "";
        wef wefVar = wef.a;
        e89 e89Var = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                e89Var.setValue(bool);
                return wefVar;
            case 1:
                e89Var.setValue((bv7) obj);
                return wefVar;
            case 2:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                a56 a56Var = ((w50) e89Var.getValue()).a;
                if (a56Var == null || (strA = a56Var.a()) == null) {
                    strA = "secret";
                }
                l1fVar.a(strA, "gender");
                return wefVar;
            case 3:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                pu1 pu1Var = ((w50) e89Var.getValue()).d;
                if (pu1Var != null && (strA2 = pu1Var.a()) != null) {
                    str = strA2;
                }
                l1fVar2.a(str, "role");
                return wefVar;
            case 4:
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                kpb kpbVar = ((w50) e89Var.getValue()).c;
                if (kpbVar != null && (strA3 = kpbVar.a()) != null) {
                    str = strA3;
                }
                l1fVar3.a(str, "relationshipStatus");
                return wefVar;
            case 5:
                ((ra4) obj).getClass();
                return new lf(4, e89Var);
            case 6:
                l1f l1fVar4 = (l1f) obj;
                kv2.y(l1fVar4, "btn", "enable_auto_renew", "pathway", "account");
                en0 en0Var = (en0) e89Var.getValue();
                String str2 = en0Var.b;
                l1fVar4.a(String.valueOf((pa7.t(str2, "wechat-app-pay") || pa7.t(str2, "wechat")) && !en0Var.a()), "pure_signing");
                return wefVar;
            case 7:
                e89Var.setValue((bv7) obj);
                return wefVar;
            case 8:
                nme nmeVar = (nme) obj;
                e89Var.setValue(nmeVar.c ? nmeVar.b : nmeVar.a);
                return wefVar;
            case 9:
                List list = (List) obj;
                if (e89Var != null) {
                    e89Var.setValue(list);
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                hkb hkbVar = (hkb) obj;
                hkbVar.getClass();
                e89Var.setValue(hkbVar);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                bv7 bv7Var = (bv7) obj;
                bv7Var.getClass();
                e89Var.setValue(vd0.S(bv7Var).M(bv7Var, true));
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                hxc hxcVar = (hxc) obj;
                hxcVar.getClass();
                qp1 qp1Var = (qp1) e89Var.getValue();
                gxc gxcVar = pp1.b;
                wn7 wn7Var = pp1.a[0];
                gxcVar.getClass();
                hxcVar.c(gxcVar, qp1Var);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                e77 e77Var = (e77) obj;
                long j = e77Var.a;
                e89Var.setValue(e77Var);
                return wefVar;
            case 14:
                e89Var.setValue(Integer.valueOf((int) (((e77) obj).a & 4294967295L)));
                return wefVar;
            case 15:
                bv7 bv7Var2 = (bv7) obj;
                bv7Var2.getClass();
                e89Var.setValue(new iy9(Integer.valueOf((int) (bv7Var2.l() >> 32)), Integer.valueOf((int) (bv7Var2.l() & 4294967295L))));
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                w02 w02Var = (w02) obj;
                w02Var.getClass();
                e89Var.setValue(w02Var);
                return wefVar;
            case 17:
                ((t7) obj).getClass();
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 18:
                String str3 = (String) obj;
                str3.getClass();
                e89Var.setValue(str3);
                return wefVar;
            case 19:
                bv7 bv7Var3 = (bv7) obj;
                bv7Var3.getClass();
                if (bv7Var3.h() && ((int) (bv7Var3.l() >> 32)) > 0 && ((int) (bv7Var3.l() & 4294967295L)) > 0) {
                    e89Var.setValue(Boolean.TRUE);
                }
                return wefVar;
            case 20:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                e89Var.setValue(bool2);
                return wefVar;
            case 21:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
                tarotSkinIdentify.getClass();
                e89Var.setValue(tarotSkinIdentify);
                return wefVar;
            case 22:
                e83 e83Var = (e83) obj;
                e83Var.getClass();
                e89Var.setValue(e83Var);
                return wefVar;
            case 23:
                e83 e83Var2 = (e83) obj;
                e83Var2.getClass();
                e89Var.setValue(e83Var2);
                return wefVar;
            case 24:
                hxc hxcVar2 = (hxc) obj;
                if (!v4e.Q((CharSequence) e89Var.getValue())) {
                    String str4 = (String) e89Var.getValue();
                    wn7[] wn7VarArr = exc.a;
                    hxcVar2.c(cxc.O, str4);
                }
                return wefVar;
            case 25:
                Float f = (Float) obj;
                f.getClass();
                ((a26) e89Var.getValue()).d(f);
                return wefVar;
            case 26:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                e89Var.setValue(bool3);
                return wefVar;
            case 27:
                ((WebView) obj).getClass();
                e89Var.setValue(null);
                return wefVar;
            case 28:
                wa6 wa6Var = (wa6) obj;
                wa6Var.getClass();
                e89Var.setValue(wa6Var);
                return wefVar;
            default:
                t91 t91Var = (t91) obj;
                t91Var.getClass();
                e89Var.setValue(t91Var);
                return wefVar;
        }
    }
}
