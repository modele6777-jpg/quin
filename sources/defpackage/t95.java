package defpackage;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t95 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ t95(Context context, e89 e89Var, int i) {
        this.a = i;
        this.b = context;
        this.c = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                WebView webView = (WebView) obj;
                webView.getClass();
                e89Var.setValue(webView);
                tgc.f(webView);
                context.getClass();
                webView.setWebViewClient(new e9b(context));
                break;
            default:
                ((xe) obj).getClass();
                di9 di9Var = di9.a;
                di9.d(context);
                boolean zK = uyb.k(context);
                x16 x16Var = (x16) e89Var.getValue();
                x16Var.getClass();
                if (zK) {
                    x16Var.invoke();
                }
                break;
        }
        return wefVar;
    }
}
