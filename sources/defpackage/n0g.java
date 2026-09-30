package defpackage;

import ai.askquin.ui.web.WebViewActivity;
import android.graphics.Bitmap;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0g implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebViewActivity b;

    public /* synthetic */ n0g(WebViewActivity webViewActivity, int i) {
        this.a = i;
        this.b = webViewActivity;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        WebViewActivity webViewActivity = this.b;
        switch (i) {
            case 0:
                WebView webView = (WebView) obj;
                int i2 = WebViewActivity.T0;
                webView.getClass();
                c1g c1gVar = webViewActivity.O0;
                if (c1gVar == null) {
                    pa7.g0("webViewStrategy");
                    throw null;
                }
                webView.setWebViewClient(c1gVar.s(webViewActivity));
                c1g c1gVar2 = webViewActivity.O0;
                if (c1gVar2 == null) {
                    pa7.g0("webViewStrategy");
                    throw null;
                }
                c1gVar2.l(webView, webViewActivity);
                webViewActivity.N0 = webView;
                return wefVar;
            case 1:
                a26 a26Var = (a26) obj;
                int i3 = WebViewActivity.T0;
                a26Var.getClass();
                ynb.V(vpf.H(webViewActivity), null, null, new q0g(webViewActivity, a26Var, null), 3);
                return wefVar;
            default:
                Bitmap bitmap = (Bitmap) obj;
                int i4 = WebViewActivity.T0;
                bitmap.getClass();
                a26 a26Var2 = webViewActivity.S0;
                if (a26Var2 != null) {
                    a26Var2.d(bitmap);
                }
                return wefVar;
        }
    }
}
