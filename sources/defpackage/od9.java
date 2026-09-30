package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class od9 extends h36 implements a26 {
    public static final od9 a = new od9(1, qk2.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && bp.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new pk2(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return ok2.a;
    }
}
