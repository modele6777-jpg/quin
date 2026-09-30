package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w5c {
    public qn2 a;
    public pv2 b;
    public Executor c;
    public h80 d;
    public ld5 e;
    public jb7 f;
    public boolean h;
    public final s52 g = new s52(new yv9(0, this, w5c.class, "onClosed", "onClosed()V", 0, 7));
    public final ThreadLocal i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public final void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qc0.p("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        f9e f9eVarJ0 = g().j0();
        if (!f9eVarJ0.q()) {
            d8c.r(new ib7(f(), null));
        }
        if (f9eVarJ0.I0()) {
            f9eVarJ0.Z();
        } else {
            f9eVarJ0.t();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(bm8.F(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(af1.R((em7) entry.getKey()), entry.getValue());
        }
        return pu4.a;
    }

    public abstract jb7 d();

    public gt4 e() {
        throw new wg9(0);
    }

    public final jb7 f() {
        jb7 jb7Var = this.f;
        if (jb7Var != null) {
            return jb7Var;
        }
        pa7.g0("internalTracker");
        throw null;
    }

    public final h9e g() {
        ld5 ld5Var = this.e;
        if (ld5Var == null) {
            pa7.g0("connectionManager");
            throw null;
        }
        h9e h9eVar = (h9e) ld5Var.h;
        if (h9eVar != null) {
            return h9eVar;
        }
        qc0.p("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public final pv2 h() {
        qn2 qn2Var = this.a;
        if (qn2Var != null) {
            return qn2Var.a;
        }
        pa7.g0("coroutineScope");
        throw null;
    }

    public Set i() {
        return s72.o1(new ArrayList(t72.u(xu4.a, 10)));
    }

    public LinkedHashMap j() {
        int iF = bm8.F(t72.u(xu4.a, 10));
        if (iF < 16) {
            iF = 16;
        }
        return new LinkedHashMap(iF);
    }

    public final boolean k() {
        ld5 ld5Var = this.e;
        if (ld5Var != null) {
            return ((h9e) ld5Var.h) != null;
        }
        pa7.g0("connectionManager");
        throw null;
    }

    public final boolean l() {
        return o() && g().j0().q();
    }

    public final void m() {
        g().j0().q0();
        if (l()) {
            return;
        }
        jb7 jb7VarF = f();
        jb7VarF.b.c(jb7VarF.e, jb7VarF.f);
    }

    public final void n(q8c q8cVar) {
        q8cVar.getClass();
        jb7 jb7VarF = f();
        j5f j5fVar = jb7VarF.b;
        j5fVar.getClass();
        x8c x8cVarW0 = q8cVar.W0("PRAGMA query_only");
        try {
            x8cVarW0.R0();
            boolean zT = x8cVarW0.T();
            cgg.t(x8cVarW0, null);
            if (!zT) {
                p8c.o(q8cVar, "PRAGMA temp_store = MEMORY");
                p8c.o(q8cVar, "PRAGMA recursive_triggers = 1");
                p8c.o(q8cVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (j5fVar.d) {
                    p8c.o(q8cVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    p8c.o(q8cVar, c5e.A("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                wk9 wk9Var = j5fVar.h;
                ReentrantLock reentrantLock = wk9Var.a;
                reentrantLock.lock();
                try {
                    wk9Var.d = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (jb7VarF.h) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                cgg.t(x8cVarW0, th2);
                throw th3;
            }
        }
    }

    public final boolean o() {
        ld5 ld5Var = this.e;
        if (ld5Var == null) {
            pa7.g0("connectionManager");
            throw null;
        }
        f9e f9eVar = (f9e) ld5Var.i;
        if (f9eVar != null) {
            return f9eVar.isOpen();
        }
        return false;
    }

    public final Object p(x16 x16Var) {
        if (!k()) {
            return urg.I(this, false, true, new p9(28, x16Var));
        }
        b();
        try {
            Object objInvoke = x16Var.invoke();
            q();
            return objInvoke;
        } finally {
            m();
        }
    }

    public final void q() {
        g().j0().V();
    }

    public final Object r(boolean z, l26 l26Var, zn2 zn2Var) {
        ld5 ld5Var = this.e;
        if (ld5Var != null) {
            return ((zj2) ld5Var.g).J0(z, l26Var, zn2Var);
        }
        pa7.g0("connectionManager");
        throw null;
    }
}
