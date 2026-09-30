package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0d {
    public static final p0d a = new p0d();
    public static final m6c b;

    static {
        hh7 hh7Var = new hh7();
        hh7Var.a(o0d.class, ao0.a);
        hh7Var.a(u0d.class, bo0.a);
        hh7Var.a(gb3.class, yn0.a);
        hh7Var.a(xb0.class, xn0.a);
        hh7Var.a(wo.class, wn0.a);
        hh7Var.a(jva.class, zn0.a);
        hh7Var.d = true;
        b = new m6c(20, hh7Var);
    }

    public static xb0 a(ff5 ff5Var) throws PackageManager.NameNotFoundException {
        ff5Var.a();
        Context context = ff5Var.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        ff5Var.a();
        String str = ff5Var.c.b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        Build.MANUFACTURER.getClass();
        ff5Var.a();
        jva jvaVarN = q6.n(context);
        ff5Var.a();
        return new xb0(str, new wo(packageName, str2, strValueOf, jvaVarN, q6.h(context)));
    }
}
