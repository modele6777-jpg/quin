package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vva {
    public static final String l = ff8.n("Processor");
    public final Context b;
    public final si2 c;
    public final bbg d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public vva(Context context, si2 si2Var, bbg bbgVar, WorkDatabase workDatabase) {
        this.b = context;
        this.c = si2Var;
        this.d = bbgVar;
        this.e = workDatabase;
    }

    public static boolean d(String str, ccg ccgVar, int i) {
        String str2 = l;
        if (ccgVar == null) {
            ff8.h().e(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        ccgVar.l.t(new sbg(i));
        ff8.h().e(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(a35 a35Var) {
        synchronized (this.k) {
            this.j.add(a35Var);
        }
    }

    public final ccg b(String str) {
        ccg ccgVar = (ccg) this.f.remove(str);
        boolean z = ccgVar != null;
        if (!z) {
            ccgVar = (ccg) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = hce.x;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable th) {
                            ff8.h().g(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ccgVar;
    }

    public final ccg c(String str) {
        ccg ccgVar = (ccg) this.f.get(str);
        return ccgVar == null ? (ccg) this.g.get(str) : ccgVar;
    }
}
