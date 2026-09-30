package defpackage;

import android.webkit.WebView;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yyd extends h36 implements n26 {
    public static final yyd a = new yyd(3, bzd.class, "installDocumentStartScript", "installDocumentStartScript(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Set;)Landroidx/webkit/ScriptHandler;", 1);

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        Object dzbVar;
        WebView webView = (WebView) obj;
        String str = (String) obj2;
        Set set = (Set) obj3;
        webView.getClass();
        str.getClass();
        set.getClass();
        if (!v0g.a("DOCUMENT_START_SCRIPT")) {
            return null;
        }
        try {
            dzbVar = s0g.a(webView, str, set);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("StandardWebViewStrategy").c("Failed to install initial data script", thA);
        }
        return (pgc) (dzbVar instanceof dzb ? null : dzbVar);
    }
}
