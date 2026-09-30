package defpackage;

import android.os.Build;
import android.os.Trace;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zh6 {
    public static final lw7 a = eb3.N(z18.c, new w66(20));

    public static float a(xh6 xh6Var) {
        float fD = d(xh6Var);
        xh6Var.getClass();
        bi6 bi6Var = xh6Var.I0;
        if (pa7.t(bi6Var, bi6.a)) {
            return 1.0f;
        }
        if (!pa7.t(bi6Var, ai6.a)) {
            ap.c();
            return 0.0f;
        }
        if (yi4.a(fD, 7.0f) < 0) {
            return 1.0f;
        }
        return (xh6Var.Y0 == null && xh6Var.T0 == null) ? 0.3334f : 0.5f;
    }

    public static nqb b(xh6 xh6Var, float f, float f2, List list, float f3, b41 b41Var, ci6 ci6Var, int i) {
        float fD;
        float fA = a(xh6Var);
        if ((i & 2) != 0) {
            fD = d(xh6Var);
            if (Float.isNaN(fD)) {
                fD = 0.0f;
            }
        } else {
            fD = f;
        }
        float fE = (i & 4) != 0 ? e(xh6Var) : f2;
        List listF = (i & 8) != 0 ? f(xh6Var) : list;
        float f4 = (i & 16) != 0 ? 1.0f : f3;
        long j = xh6Var.O0;
        long j2 = xh6Var.Q0;
        b41 b41Var2 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? xh6Var.T0 : b41Var;
        nqb nqbVar = null;
        ci6 ci6Var2 = (i & 256) != 0 ? null : ci6Var;
        int i2 = pa7.t(xh6Var.d1, null) ? 3 : 0;
        xh6Var.getClass();
        Trace.beginSection(xdc.v("HazeEffectNode-getOrCreateRenderEffect"));
        try {
            qqb qqbVar = new qqb(fD, fE, fA, j, j2, listF, f4, b41Var2, ci6Var2, i2);
            lw7 lw7Var = a;
            nqb nqbVar2 = (nqb) ((ej8) lw7Var.getValue()).c(qqbVar);
            if (nqbVar2 != null) {
                nqbVar = nqbVar2;
            } else {
                tu tuVarD = q6.d(xh6Var, qqbVar);
                if (tuVarD != null) {
                    ((ej8) lw7Var.getValue()).d(qqbVar, tuVarD);
                    nqbVar = tuVarD;
                }
            }
            return nqbVar;
        } finally {
            Trace.endSection();
        }
    }

    public static final boolean c(xh6 xh6Var) {
        if (xh6Var.G0) {
            return xh6Var.H0;
        }
        ii6 ii6Var = xh6Var.Z;
        if (ii6Var != null) {
            return ((Boolean) ii6Var.b.getValue()).booleanValue();
        }
        y02 y02Var = th6.a;
        return Build.VERSION.SDK_INT >= 31;
    }

    public static final float d(xh6 xh6Var) {
        xh6Var.getClass();
        float f = xh6Var.R0;
        if (Float.isNaN(f)) {
            f = xh6Var.K0.c;
        }
        return !Float.isNaN(f) ? f : xh6Var.J0.c;
    }

    public static final float e(xh6 xh6Var) {
        xh6Var.getClass();
        float f = xh6Var.S0;
        if (0.0f > f || f > 1.0f) {
            f = xh6Var.K0.d;
        }
        return (0.0f > f || f > 1.0f) ? xh6Var.J0.d : f;
    }

    public static final List f(xh6 xh6Var) {
        xh6Var.getClass();
        xh6Var.V0.getClass();
        List list = xh6Var.K0.b;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return list;
        }
        List list2 = xh6Var.J0.b;
        List list3 = list2.isEmpty() ? null : list2;
        return list3 == null ? pu4.a : list3;
    }
}
