package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zyd extends WebViewClient {
    public final /* synthetic */ Context a;

    public zyd(Context context) {
        this.a = context;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            String string = url.toString();
            string.getClass();
            if (!c5e.C(string, "http://", false) && !c5e.C(string, "https://", false)) {
                try {
                    Context context = this.a;
                    Intent intent = new Intent("android.intent.action.VIEW", url);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return true;
                } catch (ActivityNotFoundException e) {
                    hf8.Q.getClass();
                    ef8.a("StandardWebViewStrategy").c("start action error: ", e);
                    jcc.k(0, "未安装对应应用, " + url.getScheme());
                    return true;
                }
            }
        }
        return false;
    }
}
