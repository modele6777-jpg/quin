package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uh9 {
    public final Context a;
    public final od4 b;
    public final ei9 c;
    public final AtomicReference d;

    public uh9(Context context, yk8 yk8Var, ei9 ei9Var, AtomicReference atomicReference) {
        context.getClass();
        yk8Var.getClass();
        ei9Var.getClass();
        atomicReference.getClass();
        this.a = context;
        this.b = yk8Var;
        this.c = ei9Var;
        this.d = atomicReference;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final void a(x16 x16Var, x16 x16Var2) {
        Object dzbVar;
        String str;
        int i = Build.VERSION.SDK_INT;
        sh9 sh9Var = sh9.a;
        sh9 sh9Var2 = sh9.c;
        Context context = this.a;
        if (i >= 33) {
            vb2 vb2VarH = kn2.H(context);
            boolean zA0 = vb2VarH != null ? rd.a0(vb2VarH) : false;
            boolean zK = uyb.k(context);
            boolean z = bp.c(context, "android.permission.POST_NOTIFICATIONS") == 0;
            boolean zE = xh9.e(context);
            if (!zK) {
                if (i < 33 || z || zE || zA0) {
                    sh9Var = sh9Var2;
                } else {
                    sh9Var = sh9.b;
                }
            }
        } else if (!uyb.k(context)) {
            sh9Var = sh9Var2;
        }
        int iOrdinal = sh9Var.ordinal();
        if (iOrdinal == 0) {
            x16Var.invoke();
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                x16Var2.invoke();
                return;
            } else {
                ap.c();
                return;
            }
        }
        di9 di9Var = di9.a;
        ei9 ei9Var = this.c;
        ei9Var.getClass();
        if (i < 33) {
            str = null;
        } else {
            di9.e.set(null);
            try {
                dzbVar = di9.e().a(r8a.SystemDialog, ei9Var);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            Throwable thA = ezb.a(dzbVar);
            if (thA != null) {
                di9.f(thA);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            str = (String) dzbVar;
        }
        AtomicReference atomicReference = this.d;
        atomicReference.set(str);
        try {
            this.b.y("android.permission.POST_NOTIFICATIONS", null);
        } catch (RuntimeException e) {
            atomicReference.set(null);
            if (str != null) {
                di9 di9Var2 = di9.a;
                di9.a(str);
            }
            throw e;
        }
    }
}
