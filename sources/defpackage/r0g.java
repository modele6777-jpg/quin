package defpackage;

import ai.askquin.ui.web.WebViewActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r0g implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebViewActivity b;

    public /* synthetic */ r0g(WebViewActivity webViewActivity, int i) {
        this.a = i;
        this.b = webViewActivity;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        WebViewActivity webViewActivity = this.b;
        switch (i) {
            case 0:
                return cgg.A(webViewActivity).g(job.a.b(a1g.class), null, null);
            case 1:
                return cgg.A(webViewActivity).g(job.a.b(za0.class), null, null);
            default:
                return z5c.G(job.a.b(l1g.class), webViewActivity.g(), null, webViewActivity.e(), cgg.A(webViewActivity), null);
        }
    }
}
