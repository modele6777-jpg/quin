package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bqb implements lg5 {
    public static final Random j = new Random();
    public static final HashMap k = new HashMap();
    public final Context b;
    public final ScheduledExecutorService c;
    public final ff5 d;
    public final of5 e;
    public final bf5 f;
    public final i1b g;
    public final String h;
    public final HashMap a = new HashMap();
    public final HashMap i = new HashMap();

    public bqb(Context context, ScheduledExecutorService scheduledExecutorService, ff5 ff5Var, of5 of5Var, bf5 bf5Var, i1b i1bVar) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = ff5Var;
        this.e = of5Var;
        this.f = bf5Var;
        this.g = i1bVar;
        ff5Var.a();
        this.h = ff5Var.c.b;
        AtomicReference atomicReference = aqb.a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = aqb.a;
        if (atomicReference2.get() == null) {
            aqb aqbVar = new aqb();
            while (!atomicReference2.compareAndSet(null, aqbVar)) {
                if (atomicReference2.get() != null) {
                }
            }
            ps0.b(application);
            ps0.e.a(aqbVar);
        }
        Tasks.b(scheduledExecutorService, new uh2(4, this));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    public final synchronized gg5 a(ff5 ff5Var, String str, of5 of5Var, bf5 bf5Var, Executor executor, wh2 wh2Var, wh2 wh2Var2, wh2 wh2Var3, di2 di2Var, ei2 ei2Var, li2 li2Var, kxa kxaVar) {
        bf5 bf5Var2;
        if (!this.a.containsKey(str)) {
            if (str.equals("firebase")) {
                ff5Var.a();
                if (ff5Var.b.equals("[DEFAULT]")) {
                    bf5Var2 = bf5Var;
                } else {
                    bf5Var2 = null;
                }
            } else {
                bf5Var2 = null;
            }
            Context context = this.b;
            synchronized (this) {
                gg5 gg5Var = new gg5(bf5Var2, executor, wh2Var, wh2Var2, wh2Var3, di2Var, ei2Var, li2Var, new k47(ff5Var, of5Var, di2Var, wh2Var2, context, str, li2Var, this.c), kxaVar);
                wh2Var2.b();
                wh2Var3.b();
                wh2Var.b();
                this.a.put(str, gg5Var);
                k.put(str, gg5Var);
            }
        }
        return (gg5) this.a.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0062  */
    public final synchronized gg5 b(String str) {
        Throwable th;
        fz3 fz3Var;
        try {
            try {
                wh2 wh2VarC = c(str, "fetch");
                wh2 wh2VarC2 = c(str, "activate");
                wh2 wh2VarC3 = c(str, "defaults");
                Context context = this.b;
                try {
                    boolean z = false;
                    li2 li2Var = new li2(context.getSharedPreferences("frc_" + this.h + "_" + str + "_settings", 0));
                    ei2 ei2Var = new ei2(this.c, wh2VarC2, wh2VarC3);
                    ff5 ff5Var = this.d;
                    i1b i1bVar = this.g;
                    ff5Var.a();
                    if (ff5Var.b.equals("[DEFAULT]")) {
                        try {
                            if (str.equals("firebase")) {
                                fz3Var = new fz3(i1bVar);
                            } else {
                                fz3Var = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        fz3Var = null;
                    }
                    if (fz3Var != null) {
                        zpb zpbVar = new zpb(fz3Var);
                        synchronized (ei2Var.a) {
                            ei2Var.a.add(zpbVar);
                        }
                    }
                    lqb lqbVar = new lqb(2, z);
                    lqbVar.b = wh2VarC2;
                    lqbVar.c = wh2VarC3;
                    ScheduledExecutorService scheduledExecutorService = this.c;
                    kxa kxaVar = new kxa();
                    kxaVar.d = Collections.newSetFromMap(new ConcurrentHashMap());
                    kxaVar.a = wh2VarC2;
                    kxaVar.b = lqbVar;
                    kxaVar.c = scheduledExecutorService;
                    return a(this.d, str, this.e, this.f, this.c, wh2VarC, wh2VarC2, wh2VarC3, d(str, wh2VarC, li2Var), ei2Var, li2Var, kxaVar);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            th = th;
            throw th;
        }
    }

    public final wh2 c(String str, String str2) {
        mi2 mi2Var;
        wh2 wh2Var;
        String strL = ks0.l(ib8.o("frc_", this.h, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.c;
        Context context = this.b;
        HashMap map = mi2.c;
        synchronized (mi2.class) {
            try {
                HashMap map2 = mi2.c;
                if (!map2.containsKey(strL)) {
                    map2.put(strL, new mi2(context, strL));
                }
                mi2Var = (mi2) map2.get(strL);
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map3 = wh2.d;
        synchronized (wh2.class) {
            try {
                String str3 = mi2Var.b;
                HashMap map4 = wh2.d;
                if (!map4.containsKey(str3)) {
                    map4.put(str3, new wh2(scheduledExecutorService, mi2Var));
                }
                wh2Var = (wh2) map4.get(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wh2Var;
    }

    public final synchronized di2 d(String str, wh2 wh2Var, li2 li2Var) {
        of5 of5Var;
        Object fc2Var;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str2;
        ff5 ff5Var;
        try {
            of5Var = this.e;
            ff5 ff5Var2 = this.d;
            ff5Var2.a();
            fc2Var = ff5Var2.b.equals("[DEFAULT]") ? this.g : new fc2(10);
            scheduledExecutorService = this.c;
            random = j;
            ff5 ff5Var3 = this.d;
            ff5Var3.a();
            str2 = ff5Var3.c.a;
            ff5Var = this.d;
            ff5Var.a();
        } catch (Throwable th) {
            throw th;
        }
        return new di2(of5Var, fc2Var, scheduledExecutorService, random, wh2Var, new ConfigFetchHttpClient(this.b, ff5Var.c.b, str2, str, li2Var.a.getLong("fetch_timeout_in_seconds", 60L), li2Var.a.getLong("fetch_timeout_in_seconds", 60L)), li2Var, this.i);
    }
}
