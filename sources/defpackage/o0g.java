package defpackage;

import ai.askquin.R;
import ai.askquin.ui.web.WebViewActivity;
import android.graphics.Bitmap;
import android.webkit.WebView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0g implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebViewActivity b;

    public /* synthetic */ o0g(WebViewActivity webViewActivity, int i) {
        this.a = i;
        this.b = webViewActivity;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        byte b = 0;
        WebViewActivity webViewActivity = this.b;
        final int i2 = 1;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = WebViewActivity.T0;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    o7c.a(false, null, af1.b0(1412102886, new o0g(webViewActivity, i2), l46Var), l46Var, 384, 3);
                }
                break;
            case 1:
                final WebViewActivity webViewActivity2 = this.b;
                lw7 lw7Var = webViewActivity2.Q0;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i4 = WebViewActivity.T0;
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    Object objR = l46Var2.R();
                    i8c i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = q1c.f(null);
                        l46Var2.p0(objR);
                    }
                    e89 e89Var = (e89) objR;
                    Object objR2 = l46Var2.R();
                    if (objR2 == i8cVar) {
                        objR2 = q1c.f(null);
                        l46Var2.p0(objR2);
                    }
                    e89 e89Var2 = (e89) objR2;
                    Object objR3 = l46Var2.R();
                    if (objR3 == i8cVar) {
                        objR3 = q1c.f(Boolean.FALSE);
                        l46Var2.p0(objR3);
                    }
                    final e89 e89Var3 = (e89) objR3;
                    Object objR4 = l46Var2.R();
                    if (objR4 == i8cVar) {
                        objR4 = q1c.f(Boolean.FALSE);
                        l46Var2.p0(objR4);
                    }
                    e89 e89Var4 = (e89) objR4;
                    Object objR5 = l46Var2.R();
                    if (objR5 == i8cVar) {
                        objR5 = new w77(e89Var2, 23);
                        l46Var2.p0(objR5);
                    }
                    webViewActivity2.S0 = (a26) objR5;
                    boolean zI = l46Var2.i(webViewActivity2);
                    Object objR6 = l46Var2.R();
                    if (zI || objR6 == i8cVar) {
                        final byte b2 = b == true ? 1 : 0;
                        objR6 = new x16() { // from class: l0g
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i5 = b2;
                                wef wefVar2 = wef.a;
                                e89 e89Var5 = e89Var3;
                                WebViewActivity webViewActivity3 = webViewActivity2;
                                switch (i5) {
                                    case 0:
                                        WebView webView = webViewActivity3.N0;
                                        if (webView != null ? webView.canGoBack() : false) {
                                            WebView webView2 = webViewActivity3.N0;
                                            if (webView2 != null) {
                                                webView2.goBack();
                                            }
                                        } else if (((x0g) webViewActivity3.M0.getValue()) != x0g.a) {
                                            webViewActivity3.finish();
                                        } else {
                                            e89Var5.setValue(Boolean.TRUE);
                                        }
                                        break;
                                    default:
                                        int i6 = WebViewActivity.T0;
                                        e89Var5.setValue(Boolean.FALSE);
                                        webViewActivity3.finish();
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var2.p0(objR6);
                    }
                    x16 x16Var = (x16) objR6;
                    rxg.a(false, x16Var, l46Var2, 0, 1);
                    xdc.a(null, af1.b0(1616876714, new r19((Object) webViewActivity2, x16Var, (Object) e89Var, e89Var4, 18), l46Var2), null, null, null, 0, 0L, 0L, m93.l, af1.b0(1094159669, new s19(20, webViewActivity2, e89Var), l46Var2), l46Var2, 805306416, 253);
                    if (((Bitmap) e89Var2.getValue()) != null) {
                        l46Var2.f0(-1245252882);
                        a1g a1gVar = (a1g) lw7Var.getValue();
                        Bitmap bitmap = (Bitmap) e89Var2.getValue();
                        bitmap.getClass();
                        Object objR7 = l46Var2.R();
                        if (objR7 == i8cVar) {
                            objR7 = new xfc(e89Var2, 13);
                            l46Var2.p0(objR7);
                        }
                        ((b1g) a1gVar).b(bitmap, (x16) objR7, l46Var2, 48);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1245116420);
                        l46Var2.r(false);
                    }
                    if (((Boolean) e89Var3.getValue()).booleanValue()) {
                        l46Var2.f0(-1245059969);
                        String strQ = afc.q(R.string.annual_report_exit_dialog_title, l46Var2);
                        String strQ2 = afc.q(R.string.annual_report_exit_dialog_confirm, l46Var2);
                        String strQ3 = afc.q(R.string.annual_report_exit_dialog_cancel, l46Var2);
                        dd2 dd2Var = bzd.f;
                        Object objR8 = l46Var2.R();
                        if (objR8 == i8cVar) {
                            objR8 = new xfc(e89Var3, 14);
                            l46Var2.p0(objR8);
                        }
                        x16 x16Var2 = (x16) objR8;
                        boolean zI2 = l46Var2.i(webViewActivity2);
                        Object objR9 = l46Var2.R();
                        if (zI2 || objR9 == i8cVar) {
                            objR9 = new x16() { // from class: l0g
                                @Override // defpackage.x16
                                public final Object invoke() {
                                    int i5 = i2;
                                    wef wefVar2 = wef.a;
                                    e89 e89Var5 = e89Var3;
                                    WebViewActivity webViewActivity3 = webViewActivity2;
                                    switch (i5) {
                                        case 0:
                                            WebView webView = webViewActivity3.N0;
                                            if (webView != null ? webView.canGoBack() : false) {
                                                WebView webView2 = webViewActivity3.N0;
                                                if (webView2 != null) {
                                                    webView2.goBack();
                                                }
                                            } else if (((x0g) webViewActivity3.M0.getValue()) != x0g.a) {
                                                webViewActivity3.finish();
                                            } else {
                                                e89Var5.setValue(Boolean.TRUE);
                                            }
                                            break;
                                        default:
                                            int i6 = WebViewActivity.T0;
                                            e89Var5.setValue(Boolean.FALSE);
                                            webViewActivity3.finish();
                                            break;
                                    }
                                    return wefVar2;
                                }
                            };
                            l46Var2.p0(objR9);
                        }
                        kj0.F(strQ, dd2Var, strQ2, strQ3, false, false, null, null, x16Var2, (x16) objR9, l46Var2, 100663344, 240);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1244591652);
                        l46Var2.r(false);
                    }
                    if (!((Boolean) e89Var4.getValue()).booleanValue()) {
                        l46Var2.f0(-1244414084);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1244544780);
                        a1g a1gVar2 = (a1g) lw7Var.getValue();
                        Object objR10 = l46Var2.R();
                        if (objR10 == i8cVar) {
                            objR10 = new xfc(e89Var4, 15);
                            l46Var2.p0(objR10);
                        }
                        ((b1g) a1gVar2).a((x16) objR10, l46Var2, 6);
                        l46Var2.r(false);
                    }
                }
                break;
            case 2:
                List list = (List) obj;
                a26 a26Var = (a26) obj2;
                int i5 = WebViewActivity.T0;
                list.getClass();
                a26Var.getClass();
                l1g l1gVar = (l1g) webViewActivity.P0.getValue();
                hy0 hy0Var = new hy0(a26Var, 21);
                l1gVar.getClass();
                ynb.V(hwf.a(l1gVar), null, null, new j1g(l1gVar, list, hy0Var, null), 3);
                break;
            default:
                String str = (String) obj;
                a26 a26Var2 = (a26) obj2;
                int i6 = WebViewActivity.T0;
                str.getClass();
                a26Var2.getClass();
                l1g l1gVar2 = (l1g) webViewActivity.P0.getValue();
                hy0 hy0Var2 = new hy0(a26Var2, 22);
                l1gVar2.getClass();
                ynb.V(hwf.a(l1gVar2), null, null, new k1g(l1gVar2, str, hy0Var2, null), 3);
                break;
        }
        return wefVar;
    }
}
