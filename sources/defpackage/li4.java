package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class li4 {
    public static final sz9 a = new sz9(((Number) z5c.I(nu4.a, new ki4(xqa.q, 0, null))).intValue());

    public static final boolean a(l46 l46Var) {
        sz9 sz9Var = a;
        if (sz9Var.j() != 0) {
            l46Var.f0(927727952);
            l46Var.r(false);
            return sz9Var.j() == 2;
        }
        l46Var.f0(927726997);
        boolean zB = if9.B(l46Var);
        l46Var.r(false);
        return zB;
    }

    public static final boolean b(Context context) {
        context.getClass();
        sz9 sz9Var = a;
        if (sz9Var.j() == 0) {
            return (context.getResources().getConfiguration().uiMode & 48) == 32;
        }
        return sz9Var.j() == 2;
    }

    public static final void c(int i) {
        Object dzbVar;
        int i2;
        int i3 = 1;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Object systemService = cn1.z().getSystemService("uimode");
                systemService.getClass();
                UiModeManager uiModeManager = (UiModeManager) systemService;
                if (i == 0) {
                    i3 = 0;
                } else if (i == 2) {
                    i3 = 2;
                }
                uiModeManager.setApplicationNightMode(i3);
                ynb.V(lw2.a, null, null, new rra(xqa.q, Integer.valueOf(i), null), 3);
                dzbVar = wef.a;
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            Throwable thA = ezb.a(dzbVar);
            if (thA != null) {
                hf8.Q.getClass();
                ef8.a("setAppUiMode").c("Failed to set app ui mode", thA);
                return;
            }
            return;
        }
        if (i != 0) {
            i2 = i != 2 ? 1 : 2;
        } else {
            i2 = -1;
        }
        h80 h80Var = i80.a;
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (i80.b != i2) {
            i80.b = i2;
            synchronized (i80.v) {
                try {
                    od0 od0Var = i80.g;
                    od0Var.getClass();
                    fd0 fd0Var = new fd0(od0Var);
                    while (fd0Var.hasNext()) {
                        i80 i80Var = (i80) ((WeakReference) fd0Var.next()).get();
                        if (i80Var != null) {
                            ((q80) i80Var).p(true, true);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        ynb.V(lw2.a, null, null, new rra(xqa.q, Integer.valueOf(i), null), 3);
    }
}
