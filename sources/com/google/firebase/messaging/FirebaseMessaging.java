package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.a82;
import defpackage.bo1;
import defpackage.bp;
import defpackage.fc2;
import defpackage.ff5;
import defpackage.g3e;
import defpackage.g94;
import defpackage.hbc;
import defpackage.i1b;
import defpackage.kd0;
import defpackage.lh;
import defpackage.lqb;
import defpackage.ml;
import defpackage.nf5;
import defpackage.oa7;
import defpackage.odh;
import defpackage.of5;
import defpackage.rw;
import defpackage.sf5;
import defpackage.uf5;
import defpackage.veh;
import defpackage.vf5;
import defpackage.vrb;
import defpackage.w7c;
import defpackage.xj0;
import defpackage.y41;
import defpackage.y6e;
import defpackage.ya5;
import defpackage.z99;
import defpackage.zi0;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {
    public static vrb l;
    public static i1b m = new fc2(5);
    public static ScheduledThreadPoolExecutor n;
    public final ff5 a;
    public final Context b;
    public final hbc c;
    public final a82 d;
    public final lqb e;
    public final zi0 f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final rw i;
    public final of5 j;
    public boolean k;

    public FirebaseMessaging(final ff5 ff5Var, i1b i1bVar, i1b i1bVar2, final of5 of5Var, i1b i1bVar3, y6e y6eVar) {
        ff5Var.a();
        Context context = ff5Var.a;
        final rw rwVar = new rw();
        final int i = 0;
        rwVar.b = 0;
        rwVar.c = context;
        ff5Var.a();
        w7c w7cVar = new w7c(ff5Var.a);
        hbc hbcVar = new hbc();
        hbcVar.a = ff5Var;
        hbcVar.b = rwVar;
        hbcVar.c = w7cVar;
        hbcVar.d = i1bVar;
        hbcVar.e = i1bVar2;
        hbcVar.f = of5Var;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new z99("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new z99("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new z99("Firebase-Messaging-File-Io"));
        this.k = false;
        m = i1bVar3;
        this.a = ff5Var;
        zi0 zi0Var = new zi0();
        zi0Var.d = this;
        zi0Var.b = y6eVar;
        this.f = zi0Var;
        ff5Var.a();
        final Context context2 = ff5Var.a;
        this.b = context2;
        ya5 ya5Var = new ya5();
        this.i = rwVar;
        this.c = hbcVar;
        this.j = of5Var;
        a82 a82Var = new a82(context2, ff5Var, of5Var, hbcVar, rwVar);
        this.d = a82Var;
        this.e = new lqb(executorServiceNewSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        ff5Var.a();
        Context context3 = ff5Var.a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(ya5Var);
        } else {
            b1.l("FirebaseMessaging", "Context " + context3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (a82Var.G()) {
            sf5 sf5Var = new sf5(this);
            nf5 nf5Var = (nf5) of5Var;
            synchronized (nf5Var) {
                nf5Var.j.add(sf5Var);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: tf5
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gfh gfhVarC;
                int i3;
                int i4 = i;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i4) {
                    case 0:
                        if (firebaseMessaging.f.s() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.k) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context4 = firebaseMessaging.b;
                        bp.A(context4);
                        hbc hbcVar2 = firebaseMessaging.c;
                        final boolean zF = firebaseMessaging.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesX0 = hkg.x0(context4);
                            if (!sharedPreferencesX0.contains("proxy_retention") || sharedPreferencesX0.getBoolean("proxy_retention", false) != zF) {
                                w7c w7cVar2 = (w7c) hbcVar2.c;
                                if (w7cVar2.c.A() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    veh vehVarI = veh.i(w7cVar2.b);
                                    synchronized (vehVarI) {
                                        i3 = vehVarI.b;
                                        vehVarI.b = i3 + 1;
                                    }
                                    gfhVarC = vehVarI.j(new odh(i3, 4, bundle, 0));
                                } else {
                                    gfhVarC = Tasks.c(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                gfhVarC.e(new mc0(1), new kn9() { // from class: j1b
                                    @Override // defpackage.kn9
                                    public final void a(Object obj) {
                                        SharedPreferences.Editor editorEdit = hkg.x0(context4).edit();
                                        editorEdit.putBoolean("proxy_retention", zF);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new z99("Firebase-Messaging-Topics-Io"));
        Tasks.b(scheduledThreadPoolExecutor2, new Callable() { // from class: n0f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m0f m0fVar;
                Context context4 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                rw rwVar2 = rwVar;
                ff5 ff5Var2 = ff5Var;
                FirebaseMessaging firebaseMessaging = this;
                of5 of5Var2 = of5Var;
                synchronized (m0f.class) {
                    try {
                        WeakReference weakReference = m0f.b;
                        m0fVar = weakReference != null ? (m0f) weakReference.get() : null;
                        if (m0fVar == null) {
                            SharedPreferences sharedPreferences = context4.getSharedPreferences("com.google.android.gms.appid", 0);
                            m0f m0fVar2 = new m0f();
                            synchronized (m0fVar2) {
                                m0fVar2.a = gg7.f(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            m0f.b = new WeakReference(m0fVar2);
                            m0fVar = m0fVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new o0f(rwVar2, m0fVar, new psd(ff5Var2, firebaseMessaging, of5Var2), context4, scheduledThreadPoolExecutor3);
            }
        }).e(scheduledThreadPoolExecutor, new uf5(this, i));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: tf5
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gfh gfhVarC;
                int i3;
                int i4 = i2;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i4) {
                    case 0:
                        if (firebaseMessaging.f.s() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.k) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context4 = firebaseMessaging.b;
                        bp.A(context4);
                        hbc hbcVar2 = firebaseMessaging.c;
                        final boolean zF = firebaseMessaging.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesX0 = hkg.x0(context4);
                            if (!sharedPreferencesX0.contains("proxy_retention") || sharedPreferencesX0.getBoolean("proxy_retention", false) != zF) {
                                w7c w7cVar2 = (w7c) hbcVar2.c;
                                if (w7cVar2.c.A() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    veh vehVarI = veh.i(w7cVar2.b);
                                    synchronized (vehVarI) {
                                        i3 = vehVarI.b;
                                        vehVarI.b = i3 + 1;
                                    }
                                    gfhVarC = vehVarI.j(new odh(i3, 4, bundle, 0));
                                } else {
                                    gfhVarC = Tasks.c(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                gfhVarC.e(new mc0(1), new kn9() { // from class: j1b
                                    @Override // defpackage.kn9
                                    public final void a(Object obj) {
                                        SharedPreferences.Editor editorEdit = hkg.x0(context4).edit();
                                        editorEdit.putBoolean("proxy_retention", zF);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = n;
                if (scheduledThreadPoolExecutor == null) {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new z99("TAG"));
                    n = scheduledThreadPoolExecutor;
                }
                scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized vrb c(Context context) {
        vrb vrbVar;
        vrbVar = l;
        if (vrbVar == null) {
            vrbVar = new vrb(context);
            l = vrbVar;
        }
        return vrbVar;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(ff5 ff5Var) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) ff5Var.b(FirebaseMessaging.class);
        oa7.B(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        Task taskG;
        xj0 xj0VarD = d();
        if (!h(xj0VarD)) {
            return (String) xj0VarD.b;
        }
        String strC = rw.c(this.a);
        lqb lqbVar = this.e;
        vf5 vf5Var = new vf5(this, strC, xj0VarD);
        synchronized (lqbVar) {
            taskG = (Task) ((kd0) lqbVar.c).get(strC);
            if (taskG == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strC);
                }
                taskG = vf5Var.a().g((Executor) lqbVar.b, new bo1(20, lqbVar, strC));
                ((kd0) lqbVar.c).put(strC, taskG);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strC);
            }
        }
        try {
            return (String) Tasks.a(taskG);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("FCM Registration failed!", e);
        }
    }

    public final xj0 d() {
        xj0 xj0VarG;
        vrb vrbVarC = c(this.b);
        ff5 ff5Var = this.a;
        ff5Var.a();
        String strE = "[DEFAULT]".equals(ff5Var.b) ? "" : ff5Var.e();
        String strC = rw.c(this.a);
        synchronized (vrbVarC) {
            xj0VarG = xj0.g(((SharedPreferences) vrbVarC.b).getString(strE + "|T|" + strC + "|*", null));
        }
        return xj0VarG;
    }

    public final void e() {
        Task taskC;
        int i;
        w7c w7cVar = (w7c) this.c.c;
        int i2 = 1;
        if (w7cVar.c.A() >= 241100000) {
            veh vehVarI = veh.i(w7cVar.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (vehVarI) {
                i = vehVarI.b;
                vehVarI.b = i + 1;
            }
            taskC = vehVarI.j(new odh(i, 5, bundle, 1)).f(g94.d, g3e.b);
        } else {
            taskC = Tasks.c(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskC.e(this.g, new uf5(this, i2));
    }

    public final boolean f() {
        Context context = this.b;
        bp.A(context);
        if (!bp.C(context)) {
            return false;
        }
        if (this.a.b(ml.class) != null) {
            return true;
        }
        return y41.i() && m != null;
    }

    public final synchronized void g(long j) {
        b(new lh(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
        this.k = true;
    }

    public final boolean h(xj0 xj0Var) {
        String str;
        if (xj0Var != null) {
            String str2 = (String) xj0Var.b;
            String strB = this.i.b();
            if (System.currentTimeMillis() <= xj0Var.a + 604800000 && strB.equals((String) xj0Var.c)) {
                if (this.d.G()) {
                    try {
                        str = (String) Tasks.a(((nf5) this.j).c());
                    } catch (InterruptedException | ExecutionException unused) {
                        str = null;
                    }
                    return !str2.equalsIgnoreCase(str);
                }
                if (str2.length() > 22) {
                    return false;
                }
            }
        }
        return true;
    }
}
