package defpackage;

import ai.askquin.App;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class th9 implements DefaultLifecycleObserver {
    public static final th9 a = new th9();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static App c;

    public static void a(wh9 wh9Var) {
        Object dzbVar;
        try {
            App app = c;
            if (app == null) {
                pa7.g0("application");
                throw null;
            }
            if (((mo3) ((t7) ((nfc) tq.A(app).c.e).g(job.a.b(t7.class), null, null))).b()) {
                w74.a(wh9Var);
            }
            dzbVar = wef.a;
            Throwable thA = ezb.a(dzbVar);
            if (thA != null) {
                hf8.Q.getClass();
                ef8.a("NotificationPermission").h("Failed to synchronize notification permission status", thA);
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(x48 x48Var) {
        Object dzbVar;
        Object dzbVar2;
        x48Var.getClass();
        try {
            di9 di9Var = di9.a;
            App app = c;
            if (app == null) {
                pa7.g0("application");
                throw null;
            }
            try {
                xh9.d(app);
                di9.b(app, false);
                dzbVar2 = wef.a;
            } catch (Throwable th) {
                dzbVar2 = new dzb(th);
            }
            Throwable thA = ezb.a(dzbVar2);
            if (thA != null) {
                di9.f(thA);
            }
            dzbVar = xh9.a();
        } catch (Throwable th2) {
            dzbVar = new dzb(th2);
        }
        Throwable thA2 = ezb.a(dzbVar);
        if (thA2 != null) {
            hf8.Q.getClass();
            ef8.a("NotificationPermission").h("Failed to synchronize notification permission status", thA2);
        }
        if (ezb.a(dzbVar) != null) {
            dzbVar = xh9.a();
        }
        a((wh9) dzbVar);
    }
}
