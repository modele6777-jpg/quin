package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wn0 implements lk9 {
    public static final wn0 a = new wn0();
    public static final rc5 b = rc5.a("packageName");
    public static final rc5 c = rc5.a("versionName");
    public static final rc5 d = rc5.a("appBuildVersion");
    public static final rc5 e = rc5.a("deviceManufacturer");
    public static final rc5 f = rc5.a("currentProcessDetails");
    public static final rc5 g = rc5.a("appProcessDetails");

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        wo woVar = (wo) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.a(b, woVar.a);
        mk9Var.a(c, woVar.b);
        mk9Var.a(d, woVar.c);
        mk9Var.a(e, Build.MANUFACTURER);
        mk9Var.a(f, woVar.d);
        mk9Var.a(g, woVar.e);
    }
}
