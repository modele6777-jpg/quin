package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0g {
    public static final WeakHashMap a;

    static {
        Uri.parse("*");
        Uri.parse("");
        a = new WeakHashMap();
    }

    public static pgc a(WebView webView, String str, Set set) {
        y0g y0gVar;
        if (!v0g.b.b()) {
            s8f.i("This method is not supported by the current version of the framework and the current WebView APK");
            return null;
        }
        if (v0g.c.b()) {
            WeakHashMap weakHashMap = a;
            y0gVar = (y0g) weakHashMap.get(webView);
            if (y0gVar == null) {
                y0gVar = new y0g(w0g.a.createWebView(webView));
                weakHashMap.put(webView, y0gVar);
            }
        } else {
            y0gVar = new y0g(w0g.a.createWebView(webView));
        }
        return new pgc((ScriptHandlerBoundaryInterface) g21.y(ScriptHandlerBoundaryInterface.class, y0gVar.a.addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]))));
    }
}
