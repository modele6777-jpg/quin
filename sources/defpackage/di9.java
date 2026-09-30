package defpackage;

import ai.askquin.App;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class di9 {
    public static App c;
    public static final di9 a = new di9();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static a26 d = new d59(25);
    public static final AtomicReference e = new AtomicReference(null);
    public static final ace f = new ace(new fk8(22));

    public static void a(String str) {
        Object dzbVar;
        boolean zJ;
        try {
            r6a r6aVarE = e();
            r6aVarE.getClass();
            synchronized (r6aVarE.d) {
                zJ = r6aVarE.a.j(str);
            }
            dzbVar = Boolean.valueOf(zJ);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            f(thA);
        }
    }

    public static void b(ContextWrapper contextWrapper, boolean z) {
        t6a t6aVarQ;
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        r6a r6aVarE = e();
        synchronized (r6aVarE.d) {
            t6aVarQ = r6aVarE.a.q();
        }
        if (t6aVarQ == null) {
            return;
        }
        r8a r8aVar = t6aVarQ.b;
        if (r8aVar == r8a.SystemSettings || z) {
            int iOrdinal = r8aVar.ordinal();
            if (iOrdinal == 0) {
                c(contextWrapper, t6aVarQ.a, new nh9(contextWrapper).b.areNotificationsEnabled(), true);
            } else if (iOrdinal == 1) {
                d(contextWrapper);
            } else {
                ap.c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    public static boolean c(Context context, String str, boolean z, boolean z2) {
        Object dzbVar;
        Object dzbVar2;
        Object dzbVar3;
        t6a t6aVarQ;
        AtomicReference atomicReference = e;
        context.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        t6a t6aVar = null;
        try {
            r6a r6aVarE = e();
            synchronized (r6aVarE.d) {
                t6aVarQ = r6aVarE.a.q();
            }
            if (t6aVarQ == null) {
                dzbVar = null;
            } else {
                if (t6aVarQ.b != r8a.SystemDialog) {
                    t6aVarQ = null;
                }
                if (t6aVarQ != null) {
                    dzbVar = t6aVarQ.a;
                } else {
                    dzbVar = null;
                }
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            f(thA);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        String str2 = (String) dzbVar;
        if (str == null) {
            str = str2 == null ? (String) atomicReference.getAndSet(null) : str2;
        }
        if (str != null) {
            try {
                dzbVar2 = e().b(str);
            } catch (Throwable th2) {
                dzbVar2 = new dzb(th2);
            }
            Throwable thA2 = ezb.a(dzbVar2);
            if (thA2 != null) {
                f(thA2);
            }
            t6aVar = (t6a) (dzbVar2 instanceof dzb ? null : dzbVar2);
        }
        try {
            dzbVar3 = xh9.b(context, str, z);
        } catch (Throwable th3) {
            dzbVar3 = new dzb(th3);
        }
        Throwable thA3 = ezb.a(dzbVar3);
        if (thA3 != null) {
            f(thA3);
        }
        Throwable thA4 = ezb.a(dzbVar3);
        Object objA = dzbVar3;
        if (thA4 != null) {
            objA = xh9.a();
        }
        wh9 wh9Var = (wh9) objA;
        boolean z3 = z || wh9Var == wh9.Denied;
        if (t6aVar != null && z2) {
            atomicReference.set(t6aVar.a);
        }
        if (z3) {
            g(wh9Var);
            if (t6aVar != null) {
                h(t6aVar, z);
            }
        }
        return t6aVar != null;
    }

    public static void d(Context context) {
        Object dzbVar;
        Object dzbVar2;
        context.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        try {
            dzbVar = xh9.c(context);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            f(thA);
        }
        if (ezb.a(dzbVar) != null) {
            dzbVar = xh9.a();
        }
        wh9 wh9Var = (wh9) dzbVar;
        g(wh9Var);
        try {
            dzbVar2 = Boolean.valueOf(e().c(Boolean.valueOf(wh9Var == wh9.Authorized)));
        } catch (Throwable th2) {
            dzbVar2 = new dzb(th2);
        }
        Throwable thA2 = ezb.a(dzbVar2);
        if (thA2 != null) {
            f(thA2);
        }
        Boolean bool = Boolean.FALSE;
        if (dzbVar2 instanceof dzb) {
            dzbVar2 = bool;
        }
    }

    public static r6a e() {
        return (r6a) f.getValue();
    }

    public static void f(Throwable th) {
        hf8.Q.getClass();
        ef8.a("NotificationPermissionTracking").h("Notification permission tracking failed", th);
    }

    public static void g(wh9 wh9Var) {
        Object dzbVar;
        try {
            d.d(wh9Var);
            dzbVar = wef.a;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            f(thA);
        }
    }

    public static void h(t6a t6aVar, boolean z) {
        Object dzbVar;
        Object dzbVar2 = wef.a;
        r8a r8aVar = t6aVar.b;
        ei9 ei9Var = t6aVar.c;
        fl8 fl8Var = new fl8();
        fl8Var.put("result", z ? "granted" : "denied");
        fl8Var.put("method", r8aVar.a());
        fl8Var.put("pathway", ei9Var.b);
        Integer num = ei9Var.c;
        if (num != null) {
            fl8Var.put("touchpoint_id", String.valueOf(num.intValue()));
        }
        fl8 fl8VarJ = fl8Var.j();
        try {
            x1f x1fVar = x1f.a;
            x1f.g(new r05("notification_permission_result"), m1f.a, new c95(fl8VarJ, 1));
            dzbVar = dzbVar2;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            f(thA);
        }
        if (z && r8aVar == r8a.SystemDialog) {
            try {
                x1f x1fVar2 = x1f.a;
                x1f.k(new r05("button_click"), new p59(5, t6aVar), 2);
            } catch (Throwable th2) {
                dzbVar2 = new dzb(th2);
            }
            Throwable thA2 = ezb.a(dzbVar2);
            if (thA2 != null) {
                f(thA2);
            }
        }
    }
}
