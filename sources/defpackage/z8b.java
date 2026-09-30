package defpackage;

import ai.askquin.R;
import ai.askquin.model.reviewreward.ReviewRewardState;
import android.content.ClipData;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z8b implements a26 {
    public final /* synthetic */ int a;

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        boolean z = true;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((String) obj).getClass();
                return wefVar;
            case 1:
                Exception exc = (Exception) obj;
                exc.getClass();
                tec.t(hf8.Q, "QuinWebView", "Parse web file chooser result error", exc);
                return wefVar;
            case 2:
                sme smeVar = (sme) obj;
                smeVar.getClass();
                Object obj2 = smeVar.a;
                if (!pa7.t(obj2, vfh.t) && !pa7.t(obj2, vfh.v)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                ((Long) obj).getClass();
                return wefVar;
            case 4:
                ((Long) obj).getClass();
                return wefVar;
            case 5:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.g(false);
                return wefVar;
            case 6:
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                g0cVar2.g(false);
                return wefVar;
            case 7:
                g0c g0cVar3 = (g0c) obj;
                g0cVar3.getClass();
                g0cVar3.g(false);
                return wefVar;
            case 8:
                g0c g0cVar4 = (g0c) obj;
                g0cVar4.getClass();
                g0cVar4.g(false);
                return wefVar;
            case 9:
                ued uedVar = (ued) obj;
                uedVar.getClass();
                return Boolean.valueOf(uedVar != ued.a);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                hxc hxcVar = (hxc) obj;
                hxcVar.getClass();
                wn7[] wn7VarArr = exc.a;
                hxcVar.c(cxc.h, wefVar);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                rf0 rf0Var = (rf0) obj;
                rf0Var.getClass();
                return Boolean.valueOf(rf0Var.a instanceof cg0);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                sw3 sw3Var = (sw3) obj;
                sw3Var.getClass();
                return new e77((((long) sw3Var.D0(128.0f)) & 4294967295L) | (((long) sw3Var.D0(128.0f)) << 32));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                rf0 rf0Var2 = (rf0) obj;
                rf0Var2.getClass();
                return Boolean.valueOf(rf0Var2.a instanceof cg0);
            case 14:
                rf0 rf0Var3 = (rf0) obj;
                rf0Var3.getClass();
                return rf0Var3.b.e;
            case 15:
                rf0 rf0Var4 = (rf0) obj;
                rf0Var4.getClass();
                return Boolean.valueOf(rf0Var4.a.equals(gg0.l));
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                lhb lhbVar = (lhb) obj;
                lhbVar.getClass();
                ste steVar = (ste) lhbVar.b.getValue();
                steVar.getClass();
                return steVar.a.a.b;
            case 17:
                String str = (String) obj;
                str.getClass();
                tce.a().setPrimaryClip(ClipData.newPlainText("reading", str));
                jcc.k(0, Integer.valueOf(R.string.reading_menu_copied));
                return wefVar;
            case 18:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("reading_long_press", "pathway");
                return wefVar;
            case 19:
                return Boolean.TRUE;
            case 20:
                ((hxc) obj).getClass();
                return wefVar;
            case 21:
                rdg rdgVar = (rdg) obj;
                rdgVar.getClass();
                e1a e1aVar = yxb.f;
                return Boolean.valueOf(xxb.t(rdgVar.a));
            case 22:
                ((wef) obj).getClass();
                return Boolean.TRUE;
            case 23:
                ((ReviewRewardState) obj).getClass();
                return new ReviewRewardState(0, (w57) null, false, false, false, (String) null, (Long) null, 0, 255, (rp3) null).recordPromptImpression().prepareStoreLaunch().recordStoreLaunched();
            case 24:
                ((String) obj).getClass();
                return new f99();
            case 25:
                g0c g0cVar5 = (g0c) obj;
                g0cVar5.getClass();
                g0cVar5.b(1.0f);
                return wefVar;
            case 26:
                kv2.y((l1f) obj, "btn", "close", "popup", "app_store_review");
                return wefVar;
            case 27:
                kv2.y((l1f) obj, "btn", "rate_on_app_store", "popup", "app_store_review");
                return wefVar;
            case 28:
                kv2.y((l1f) obj, "btn", "upload_review", "popup", "review_reward_snackbar");
                return wefVar;
            default:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.a("app_store_review", "popup");
                l1fVar2.a("love_click", "triggered_by");
                return wefVar;
        }
    }

    public /* synthetic */ z8b(int i) {
        this.a = i;
    }
}
