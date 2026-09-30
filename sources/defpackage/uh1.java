package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uh1 {
    public final Executor a;
    public final ah6 b;
    public ScheduledFuture e;
    public wo0 f;
    public vi1 g;
    public zda h;
    public pk1 i;
    public final Object c = new Object();
    public final Object d = new Object();
    public final kb6 j = new kb6(7, this);
    public volatile List k = pu4.a;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final CopyOnWriteArrayList m = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList n = new CopyOnWriteArrayList();
    public final LinkedHashMap o = new LinkedHashMap();

    public uh1(Executor executor, ah6 ah6Var) {
        this.a = executor;
        this.b = ah6Var;
    }

    public final void a(String str) {
        vi1 vi1Var = this.g;
        if (vi1Var == null) {
            return;
        }
        try {
            ng1 ng1VarQ = vi1Var.b(str).q();
            ng1VarQ.getClass();
            e(ng1VarQ);
        } catch (IllegalArgumentException unused) {
            b21.W("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void b(Set set, Set set2) {
        boolean zIsEmpty = set.isEmpty();
        CopyOnWriteArrayList<th1> copyOnWriteArrayList = this.n;
        if (!zIsEmpty) {
            b21.C("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            for (th1 th1Var : copyOnWriteArrayList) {
                th1Var.b.execute(new ni(2, th1Var, set));
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        b21.C("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        for (th1 th1Var2 : copyOnWriteArrayList) {
            th1Var2.b.execute(new fe(15, th1Var2, set2));
        }
    }

    public final void c(String str) {
        synchronized (this.c) {
            zk9 zk9Var = (zk9) this.o.remove(str);
            vi1 vi1Var = this.g;
            if (zk9Var != null && vi1Var != null) {
                try {
                    ((ah6) ok8.w()).execute(new fe(16, vi1Var.b(str), zk9Var));
                    b21.q("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final void d(int i, List list) {
        if (i > 0 && this.l.get()) {
            this.e = this.b.schedule(new rh1(this, list, i, 1), i == 3 ? 0L : 400L, TimeUnit.MILLISECONDS);
        } else if (i <= 0) {
            b21.W("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
        }
    }

    public final void e(ng1 ng1Var) {
        String strD = ng1Var.d();
        strD.getClass();
        if (this.l.get()) {
            synchronized (this.c) {
                if (this.o.containsKey(strD)) {
                    return;
                }
                sh1 sh1Var = new sh1(0, this, strD);
                ((ah6) ok8.w()).execute(new fe(17, ng1Var, sh1Var));
                this.o.put(strD, sh1Var);
                b21.q("CameraPresencePrvdr", "Registered state observer for camera: ".concat(strD));
            }
        }
    }

    public final void f() {
        d0 d0Var;
        if (!this.l.getAndSet(false)) {
            b21.q("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        b21.C("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        synchronized (this.d) {
            try {
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        zda zdaVar = this.h;
        if (zdaVar != null) {
            kb6 kb6Var = this.j;
            Iterator it = zdaVar.b.iterator();
            do {
                if (!it.hasNext()) {
                    d0Var = null;
                    break;
                }
                d0Var = (d0) it.next();
            } while (!d0Var.b.equals(kb6Var));
            if (d0Var != null) {
                zdaVar.b.remove(d0Var);
            }
            synchronized (zdaVar.a) {
                try {
                    if (zdaVar.e && zdaVar.b.isEmpty()) {
                        Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                        zdaVar.e = false;
                        Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
                        if (zdaVar.h.compareAndSet(true, false)) {
                            lyd lydVar = zdaVar.i;
                            if (lydVar != null) {
                                lydVar.h(null);
                            }
                            zdaVar.i = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        synchronized (this.c) {
            if (!this.o.isEmpty()) {
                Map mapX = bm8.X(this.o);
                this.o.clear();
                vi1 vi1Var = this.g;
                if (vi1Var != null) {
                    LinkedHashSet<pg1> linkedHashSetC = vi1Var.c();
                    ArrayList arrayList = new ArrayList();
                    for (pg1 pg1Var : linkedHashSetC) {
                        ng1 ng1VarQ = pg1Var != null ? pg1Var.q() : null;
                        if (ng1VarQ != null) {
                            arrayList.add(ng1VarQ);
                        }
                    }
                    b21.q("CameraPresencePrvdr", "Clearing all " + mapX.size() + " state observers.");
                    for (Map.Entry entry : mapX.entrySet()) {
                        ((ah6) ok8.w()).execute(new c0(arrayList, (zk9) entry.getValue(), (String) entry.getKey(), 5));
                    }
                }
            }
        }
        this.i = null;
        this.m.clear();
        this.n.clear();
        this.k = pu4.a;
        this.f = null;
        this.g = null;
    }

    public final void g(pk1 pk1Var, wo0 wo0Var, vi1 vi1Var) {
        List listUnmodifiableList;
        Throwable th;
        wo0Var.getClass();
        vi1Var.getClass();
        int i = 0;
        if (this.l.compareAndSet(false, true)) {
            b21.C("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            this.i = pk1Var;
            Set<String> setG = wo0Var.g();
            ArrayList arrayList = new ArrayList(t72.u(setG, 10));
            for (String str : setG) {
                str.getClass();
                arrayList.add(m93.v(str, null, null));
            }
            this.k = arrayList;
            this.f = wo0Var;
            this.g = vi1Var;
            this.h = (zda) wo0Var.g;
            this.a.execute(new qh1(this, i));
            zda zdaVar = this.h;
            if (zdaVar != null) {
                lyc lycVar = new lyc(this.a);
                kb6 kb6Var = this.j;
                zdaVar.b.add(new d0(lycVar, kb6Var));
                synchronized (zdaVar.a) {
                    try {
                        if (!zdaVar.e && !zdaVar.b.isEmpty()) {
                            Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                            zdaVar.e = true;
                            zdaVar.b();
                        }
                        listUnmodifiableList = Collections.unmodifiableList(zdaVar.c);
                        th = zdaVar.d;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                lycVar.execute(new c0(th, new d0(lycVar, kb6Var), listUnmodifiableList, i));
            }
        }
    }
}
