package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xn0 implements lk9 {
    public static final xn0 a = new xn0();
    public static final rc5 b = rc5.a("appId");
    public static final rc5 c = rc5.a("deviceModel");
    public static final rc5 d = rc5.a("sessionSdkVersion");
    public static final rc5 e = rc5.a("osVersion");
    public static final rc5 f = rc5.a("logEnvironment");
    public static final rc5 g = rc5.a("androidAppInfo");

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        xb0 xb0Var = (xb0) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.a(b, xb0Var.a);
        mk9Var.a(c, Build.MODEL);
        mk9Var.a(d, "3.0.7");
        mk9Var.a(e, Build.VERSION.RELEASE);
        mk9Var.a(f, te8.LOG_ENVIRONMENT_PROD);
        mk9Var.a(g, xb0Var.b);
    }
}
