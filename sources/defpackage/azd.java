package defpackage;

import android.content.Context;
import android.util.Base64;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class azd implements c1g, hf8 {
    public static final List y = t72.I("toast", "openExternalLink", "openAppStoreReview", "saveImagesToAlbum", "saveVideoToAlbum", "openSharePanel", "getSupportedMethods");
    public final n0g a;
    public final o0g b;
    public final l26 c;
    public final a26 d;
    public final a26 e;
    public final x16 f;
    public final n26 g;
    public final Set v;
    public WebView w;
    public pgc x;

    public azd(Set set, n0g n0gVar, o0g o0gVar, o0g o0gVar2, n0g n0gVar2) {
        wyd wydVar = wyd.a;
        xyd xydVar = xyd.a;
        yyd yydVar = yyd.a;
        this.a = n0gVar;
        this.b = o0gVar;
        this.c = o0gVar2;
        this.d = n0gVar2;
        this.e = wydVar;
        this.f = xydVar;
        this.g = yydVar;
        this.v = s72.o1(set);
    }

    @Override // defpackage.c1g
    public final void a() {
        Object dzbVar;
        pgc pgcVar = this.x;
        if (pgcVar != null) {
            try {
                pgcVar.a.remove();
                dzbVar = wef.a;
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            Throwable thA = ezb.a(dzbVar);
            if (thA != null) {
                d().c("Failed to remove initial data script", thA);
            }
        }
        this.x = null;
        WebView webView = this.w;
        if (webView != null) {
            webView.removeJavascriptInterface("JSBridge");
        }
        this.w = null;
    }

    public final void b(String str, String str2, String str3, String str4) {
        if (str2.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", str3);
        jSONObject.put("message", str4);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("id", str2);
        jSONObject2.put("result", JSONObject.NULL);
        jSONObject2.put("error", jSONObject);
        c(str, jSONObject2);
    }

    public final void c(String str, JSONObject jSONObject) throws IOException {
        String string = jSONObject.toString();
        string.getClass();
        byte[] bytes = string.getBytes(ox1.a);
        bytes.getClass();
        String strP = w4e.p("\n      if (window.JSBridge && typeof window.JSBridge.onMessage === 'function') {\n        window.JSBridge.onMessage('" + str + "', '" + Base64.encodeToString(bytes, 2) + "');\n      }\n    ");
        WebView webView = this.w;
        if (webView != null) {
            webView.post(new c0(this, strP, str, 29));
        }
    }

    public final void e(String str, String str2, Object obj) {
        if (str2.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str2);
        jSONObject.put("result", obj);
        jSONObject.put("error", JSONObject.NULL);
        c(str, jSONObject);
    }

    @Override // defpackage.c1g
    public final void l(WebView webView, Context context) throws JSONException, IOException {
        a();
        this.w = webView;
        webView.addJavascriptInterface(new cp(new yea(new s19(17, this, context))), "JSBridge");
        String str = (String) this.f.invoke();
        if (str != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cookie", str);
            String strP = w4e.p("\n    (() => {\n      if (window.top !== window) return;\n      Object.defineProperty(window.JSBridge, 'initialData', {\n        value: " + jSONObject + ",\n        writable: false,\n        configurable: false\n      });\n    })();\n  ");
            Set set = this.v;
            if (set.isEmpty()) {
                return;
            }
            pgc pgcVar = (pgc) this.g.m(webView, strP, set);
            this.x = pgcVar;
            if (pgcVar == null) {
                d().g("Initial data was not installed before page load");
            }
        }
    }

    @Override // defpackage.c1g
    public final WebViewClient s(Context context) {
        return new zyd(context);
    }
}
