package defpackage;

import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iag {
    public final ArrayList a;

    public iag(y1f y1fVar) {
        y1fVar.getClass();
        String str = kag.a;
        gl2 gl2Var = y1fVar.b;
        pe9 pe9Var = y1fVar.d;
        ArrayList arrayListK = t72.K(new uw0(gl2Var, 0), new uw0(y1fVar.c, 1), new uw0(y1fVar.e, 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Object systemService = y1fVar.a.getSystemService("connectivity");
            systemService.getClass();
            arrayListK.add(new ee9((ConnectivityManager) systemService));
        } else {
            pe9Var.getClass();
            arrayListK.addAll(t72.I(new uw0(pe9Var, 2), new uw0(pe9Var, 3), new zd9(pe9Var), new yd9(pe9Var)));
        }
        this.a = arrayListK;
    }
}
