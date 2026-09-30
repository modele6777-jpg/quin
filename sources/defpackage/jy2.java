package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jy2 {
    public static Object a(jy2 jy2Var, Context context, e76 e76Var, hc6 hc6Var) {
        ly2 ly2VarB;
        pl1 pl1Var = new pl1(1, k99.D(hc6Var));
        pl1Var.v();
        CancellationSignal cancellationSignal = new CancellationSignal();
        pl1Var.x(new x(15, cancellationSignal));
        hy2 hy2Var = new hy2(pl1Var, 0);
        mc0 mc0Var = new mc0(1);
        context.getClass();
        e76Var.getClass();
        dz0 dz0Var = new dz0(context, 1);
        if (e76Var != "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL") {
            for (i76 i76Var : e76Var.a) {
            }
            Context context2 = dz0Var.a;
            context2.getClass();
            if (context2.getPackageManager().hasSystemFeature("android.software.leanback") || context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                ly2VarB = dz0Var.b();
            } else {
                int i = Build.VERSION.SDK_INT;
                ly2VarB = null;
                if (i >= 34) {
                    ty2 ty2Var = new ty2(context2);
                    ly2VarB = ty2Var.isAvailableOnDevice() ? ty2Var : null;
                    if (ly2VarB == null) {
                        ly2VarB = dz0Var.b();
                    }
                } else if (i <= 33) {
                    ly2VarB = dz0Var.b();
                }
            }
        } else {
            ly2VarB = dz0Var.b();
        }
        ly2 ly2Var = ly2VarB;
        if (ly2Var == null) {
            hy2Var.a(new d76("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            ly2Var.onGetCredential(context, e76Var, cancellationSignal, mc0Var, hy2Var);
        }
        return pl1Var.t();
    }
}
