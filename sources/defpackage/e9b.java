package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e9b extends WebViewClient implements hf8 {
    public final /* synthetic */ Context a;

    public e9b(Context context) {
        this.a = context;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
        d().e("request url: " + string);
        boolean z = string != null && (c5e.C(string, "http", false) || c5e.C(string, Constants.SCHEME, false));
        if (z) {
            Uri url2 = webResourceRequest.getUrl();
            url2.getClass();
            if (bzd.A(url2)) {
                return false;
            }
        }
        Context context = this.a;
        try {
            Intent intent = z ? new Intent("android.intent.action.VIEW", webResourceRequest.getUrl()) : Intent.parseUri(string, 3);
            intent.setFlags(intent.getFlags() + 268435456);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
                return true;
            }
            String stringExtra = intent.getStringExtra("browser_fallback_url");
            if (stringExtra == null) {
                throw new RuntimeException("cannot open " + intent);
            }
            Uri uri = Uri.parse(stringExtra);
            uri.getClass();
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (Exception e) {
            hf8.Q.getClass();
            ef8.a("QuinWebView").c("Open link(" + string + ") in webView error", e);
            String string2 = context.getString(R.string.not_app_found_to_open);
            string2.getClass();
            jcc.k(0, string2);
            return true;
        }
    }
}
