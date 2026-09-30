package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hce implements ym9, a35 {
    public static final String x = ff8.n("SystemFgDispatcher");
    public final yag a;
    public final bbg b;
    public final Object c = new Object();
    public tag d;
    public final LinkedHashMap e;
    public final HashMap f;
    public final HashMap g;
    public final iag v;
    public SystemForegroundService w;

    public hce(Context context) {
        yag yagVarB = yag.b(context);
        this.a = yagVarB;
        this.b = yagVarB.d;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.v = new iag(yagVarB.h);
        yagVarB.f.a(this);
    }

    public static Intent c(Context context, tag tagVar, kr5 kr5Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", tagVar.a);
        intent.putExtra("KEY_GENERATION", tagVar.b);
        intent.putExtra("KEY_NOTIFICATION_ID", kr5Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", kr5Var.b);
        intent.putExtra("KEY_NOTIFICATION", kr5Var.c);
        return intent;
    }

    @Override // defpackage.ym9
    public final void a(lbg lbgVar, ql2 ql2Var) {
        if (ql2Var instanceof pl2) {
            String str = lbgVar.a;
            ff8.h().e(x, "Constraints unmet for WorkSpec " + str);
            tag tagVarH = fbc.h(lbgVar);
            int i = ((pl2) ql2Var).a;
            yag yagVar = this.a;
            yagVar.d.a(new k2e(yagVar.f, new nzd(tagVarH), true, i));
        }
    }

    @Override // defpackage.a35
    public final void b(tag tagVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                dg7 dg7Var = ((lbg) this.f.remove(tagVar)) != null ? (dg7) this.g.remove(tagVar) : null;
                if (dg7Var != null) {
                    dg7Var.h(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        kr5 kr5Var = (kr5) this.e.remove(tagVar);
        if (tagVar.equals(this.d)) {
            if (this.e.size() > 0) {
                Iterator it = this.e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (tag) entry.getKey();
                if (this.w != null) {
                    kr5 kr5Var2 = (kr5) entry.getValue();
                    SystemForegroundService systemForegroundService = this.w;
                    int i = kr5Var2.a;
                    int i2 = kr5Var2.b;
                    Notification notification = kr5Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        bp.T(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        bp.S(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.w.d.cancel(kr5Var2.a);
                }
            } else {
                this.d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.w;
        if (kr5Var == null || systemForegroundService2 == null) {
            return;
        }
        ff8.h().e(x, "Removing Notification (id: " + kr5Var.a + ", workSpecId: " + tagVar + ", notificationType: " + kr5Var.b);
        systemForegroundService2.d.cancel(kr5Var.a);
    }

    public final void d(Intent intent) {
        if (this.w == null) {
            qc0.p("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        tag tagVar = new tag(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        ff8.h().e(x, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            qc0.j("Notification passed in the intent was null.");
            return;
        }
        kr5 kr5Var = new kr5(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.put(tagVar, kr5Var);
        kr5 kr5Var2 = (kr5) linkedHashMap.get(this.d);
        if (kr5Var2 == null) {
            this.d = tagVar;
        } else {
            this.w.d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((kr5) ((Map.Entry) it.next()).getValue()).b;
                }
                kr5Var = new kr5(kr5Var2.a, kr5Var2.c, i);
            } else {
                kr5Var = kr5Var2;
            }
        }
        SystemForegroundService systemForegroundService = this.w;
        int i2 = kr5Var.a;
        int i3 = kr5Var.b;
        Notification notification2 = kr5Var.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            bp.T(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            bp.S(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    public final void e() {
        this.w = null;
        synchronized (this.c) {
            try {
                Iterator it = this.g.values().iterator();
                while (it.hasNext()) {
                    ((dg7) it.next()).h(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        vva vvaVar = this.a.f;
        synchronized (vvaVar.k) {
            vvaVar.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        ff8.h().l(x, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.e.entrySet()) {
            if (((kr5) entry.getValue()).b == i2) {
                tag tagVar = (tag) entry.getKey();
                yag yagVar = this.a;
                yagVar.d.a(new k2e(yagVar.f, new nzd(tagVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.w;
        if (systemForegroundService != null) {
            systemForegroundService.b = true;
            ff8.h().e(SystemForegroundService.e, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i);
        }
    }
}
