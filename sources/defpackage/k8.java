package defpackage;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k8 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ k8(x16 x16Var, e89 e89Var, int i) {
        this.a = i;
        this.b = x16Var;
        this.c = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        x16 x16Var = this.b;
        switch (i) {
            case 0:
                e89Var.setValue(Boolean.FALSE);
                x16Var.invoke();
                break;
            case 1:
                if (((qp1) e89Var.getValue()) == qp1.g) {
                    e89Var.setValue(qp1.v);
                    x1f x1fVar = x1f.a;
                    x1f.k(p05.a, new wu0(14), 2);
                    x16Var.invoke();
                }
                break;
            case 2:
                e89Var.setValue(null);
                x16Var.invoke();
                break;
            case 3:
                if (((Boolean) e89Var.getValue()).booleanValue()) {
                    e89Var.setValue(Boolean.FALSE);
                    x16Var.invoke();
                    js3 js3Var = ga4.a;
                    ynb.V(jgb.k(mk8.a), null, null, new jh3(500L, e89Var, null), 3);
                }
                break;
            case 4:
                WebView webView = (WebView) e89Var.getValue();
                if (webView != null && webView.canGoBack()) {
                    webView.goBack();
                } else {
                    x16Var.invoke();
                }
                break;
            case 5:
                e89Var.setValue(Boolean.FALSE);
                x16Var.invoke();
                break;
            case 6:
                e89Var.setValue(Boolean.TRUE);
                x16Var.invoke();
                break;
            case 7:
                e89Var.setValue(Boolean.TRUE);
                x16Var.invoke();
                break;
            case 8:
                e89Var.setValue(Boolean.FALSE);
                x1f x1fVar2 = x1f.a;
                x1f.k(new r05("report_start"), null, 4);
                x16Var.invoke();
                break;
            case 9:
                if (!((Boolean) e89Var.getValue()).booleanValue()) {
                    x16Var.invoke();
                } else {
                    e89Var.setValue(Boolean.FALSE);
                }
                break;
            default:
                e89Var.setValue(Boolean.valueOf(!((Boolean) e89Var.getValue()).booleanValue()));
                if (((Boolean) e89Var.getValue()).booleanValue()) {
                    x16Var.invoke();
                }
                break;
        }
        return wefVar;
    }
}
