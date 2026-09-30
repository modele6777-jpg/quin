package defpackage;

import android.os.Trace;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dva {
    public static final dva b = new dva(new di2(2));
    public final di2 a;

    public dva(di2 di2Var) {
        this.a = di2Var;
    }

    public final i48 a(x48 x48Var, xi1 xi1Var, oif... oifVarArr) {
        int i;
        x48Var.getClass();
        di2 di2Var = this.a;
        oif[] oifVarArr2 = (oif[]) Arrays.copyOf(oifVarArr, oifVarArr.length);
        Trace.beginSection(xdc.v("CX:bindToLifecycle"));
        try {
            rk1 rk1Var = (rk1) di2Var.d;
            int i2 = 0;
            if (rk1Var != null) {
                rk1Var.getClass();
                wo0 wo0Var = rk1Var.g;
                if (wo0Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                if1 if1Var = (if1) wo0Var.f;
                synchronized (if1Var.b) {
                    i = if1Var.e;
                }
                i2 = i;
            }
            if (i2 == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            di2Var.k(1);
            i48 i48VarB = di2.b(di2Var, x48Var, xi1Var, new hc2(qd0.k0(oifVarArr2), pu4.a));
            Trace.endSection();
            return i48VarB;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
