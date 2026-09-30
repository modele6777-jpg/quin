package defpackage;

import ai.askquin.R;
import ai.askquin.model.Scene;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.web.WebViewActivity;
import android.view.ViewGroup;
import android.webkit.WebView;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;
import coil3.compose.AsyncImagePainter$State$Success;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hy0 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;

    public /* synthetic */ hy0(a26 a26Var, int i) {
        this.a = i;
        this.b = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                a26Var.d(str);
                return wef.a;
            case 1:
                im2 im2Var = (im2) obj;
                a26Var.d(im2Var);
                ((vv7) im2Var).a();
                return wef.a;
            case 2:
                Integer num = (Integer) obj;
                num.getClass();
                return ((m91) a26Var.d(num)).b();
            case 3:
                bv7 bv7Var = (bv7) obj;
                bv7Var.getClass();
                a26Var.d(vd0.S(bv7Var).M(bv7Var, true));
                return wef.a;
            case 4:
                a26Var.d(Integer.valueOf((int) ((Float) obj).floatValue()));
                return wef.a;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                a26Var.d(str2);
                return wef.a;
            case 6:
                qb9 qb9Var = (qb9) obj;
                qb9Var.getClass();
                a26Var.d(qb9Var);
                return wef.a;
            case 7:
                qb9 qb9Var2 = (qb9) obj;
                qb9Var2.getClass();
                a26Var.d(qb9Var2);
                return wef.a;
            case 8:
                qb9 qb9Var3 = (qb9) obj;
                qb9Var3.getClass();
                a26Var.d(qb9Var3);
                return wef.a;
            case 9:
                ((gbd) obj).getClass();
                a26Var.d(u06.System);
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                i4f i4fVar = (i4f) obj;
                if (i4fVar instanceof u66) {
                    return Boolean.valueOf(((Boolean) a26Var.d(((u66) i4fVar).Z)).booleanValue());
                }
                qc0.p("Node is not a GestureNode instance");
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                String str3 = (String) obj;
                str3.getClass();
                a26Var.d(t72.c0(str3));
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Scene scene = (Scene) obj;
                scene.getClass();
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new za6(9, scene), 2);
                a26Var.d(scene);
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                a26Var.d(bool);
                return wef.a;
            case 14:
                a26Var.d(new r4b(((Integer) obj).intValue()));
                return wef.a;
            case 15:
                WebView webView = (WebView) obj;
                webView.getClass();
                a26Var.d(webView);
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.stopLoading();
                    webView.setWebChromeClient(null);
                    webView.destroy();
                    break;
                } catch (Exception e) {
                    tec.t(hf8.Q, "WebView", "Something wrong while destroy WebView", e);
                }
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                a26Var.d(Float.valueOf((((Float) obj).floatValue() * 0.2f) + 0.8f));
                return wef.a;
            case 17:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
                tarotSkinIdentify.getClass();
                p05 p05Var = p05.a;
                String str4 = "";
                switch (yke.a[tarotSkinIdentify.ordinal()]) {
                    case 1:
                    case 2:
                        break;
                    case 3:
                        str4 = "cardSale_detail_cat";
                        break;
                    case 4:
                        str4 = "cardSale_detail_romantic";
                        break;
                    case 5:
                        str4 = "cardSale_detail_puppet";
                        break;
                    case 6:
                        str4 = "cardSale_detail_symbolism";
                        break;
                    case 7:
                        str4 = "cardSale_detail_minimalism";
                        break;
                    case 8:
                        str4 = "cardSale_detail_fable";
                        break;
                    case 9:
                        str4 = "cardSale_detail_woodcut";
                        break;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        str4 = "cardSale_detail_dream";
                        break;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        str4 = "cardSale_detail_prism";
                        break;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        str4 = "cardSale_detail_midnight";
                        break;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        str4 = "cardSale_detail_darkgold";
                        break;
                    case 14:
                        str4 = "cardSale_detail_zenith_day";
                        break;
                    case 15:
                        str4 = "cardSale_detail_eternal_night";
                        break;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        str4 = "cardSale_detail_transformation";
                        break;
                    case 17:
                        str4 = "cardSale_detail_secret_manor";
                        break;
                    case 18:
                        str4 = "cardSale_detail_magic_awakening";
                        break;
                    default:
                        ap.c();
                        return null;
                }
                x1f x1fVar2 = x1f.a;
                x1f.g(p05Var, m1f.c, new alc(str4, 10));
                a26Var.d(new pmd(tarotSkinIdentify));
                return wef.a;
            case 18:
                ird irdVar = (ird) a26Var.d((ord) obj);
                synchronized (qrd.c) {
                    qrd.d = qrd.d.g(irdVar.g());
                }
                return irdVar;
            case 19:
                Long l = (Long) obj;
                l.getClass();
                return a26Var.d(l);
            case 20:
                yg0 yg0Var = (yg0) obj;
                if (!(yg0Var instanceof AsyncImagePainter$State$Loading) && !(yg0Var instanceof AsyncImagePainter$State$Success)) {
                    if (yg0Var instanceof AsyncImagePainter$State$Error) {
                        if (a26Var != null) {
                            a26Var.d(yg0Var);
                        }
                    } else if (!(yg0Var instanceof xg0)) {
                        ap.c();
                        return null;
                    }
                }
                return wef.a;
            case 21:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue = bool2.booleanValue();
                int i2 = WebViewActivity.T0;
                if (zBooleanValue) {
                    jcc.k(0, Integer.valueOf(R.string.image_save_success));
                } else {
                    jcc.k(0, Integer.valueOf(R.string.image_save_failed));
                }
                a26Var.d(bool2);
                return wef.a;
            default:
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue2 = bool3.booleanValue();
                int i3 = WebViewActivity.T0;
                if (zBooleanValue2) {
                    jcc.k(0, Integer.valueOf(R.string.image_save_success));
                } else {
                    jcc.k(0, Integer.valueOf(R.string.image_save_failed));
                }
                a26Var.d(bool3);
                return wef.a;
        }
    }
}
