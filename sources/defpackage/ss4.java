package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ss4 extends rs4 {
    @Override // defpackage.qs4
    public void b(dce dceVar, dce dceVar2, Window window, View view, boolean z, boolean z2) {
        o7c j8gVar;
        dceVar.getClass();
        dceVar2.getClass();
        window.getClass();
        view.getClass();
        q6c.l(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            j8gVar = new l8g(window);
        } else {
            j8gVar = i >= 30 ? new j8g(window) : new i8g(window);
        }
        j8gVar.B(!z);
        j8gVar.A(true ^ z2);
    }
}
