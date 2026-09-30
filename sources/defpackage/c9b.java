package defpackage;

import android.content.Intent;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c9b extends WebChromeClient {
    public final /* synthetic */ a26 a;
    public final /* synthetic */ i0g b;
    public final /* synthetic */ yk8 c;

    public c9b(a26 a26Var, i0g i0gVar, yk8 yk8Var) {
        this.a = a26Var;
        this.b = i0gVar;
        this.c = yk8Var;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        if (str == null) {
            str = "";
        }
        this.a.d(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        valueCallback.getClass();
        fileChooserParams.getClass();
        try {
            i0g i0gVar = this.b;
            yk8 yk8Var = this.c;
            i0gVar.getClass();
            i0gVar.a(null);
            i0gVar.a = valueCallback;
            try {
                Intent intentCreateIntent = fileChooserParams.createIntent();
                intentCreateIntent.getClass();
                yk8Var.y(intentCreateIntent, null);
                return true;
            } catch (Exception e) {
                i0gVar.a(null);
                throw e;
            }
        } catch (Exception e2) {
            tec.t(hf8.Q, "QuinWebView", "Open web file chooser error", e2);
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
    }
}
