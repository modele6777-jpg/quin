package defpackage;

import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q98 {
    public static final Object k = new Object();
    public final Object a;
    public final dcc b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final wwg j;

    public q98() {
        this.a = new Object();
        this.b = new dcc();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new wwg(17, this);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        gt3 gt3Var = nc0.o().a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        qc0.p(ib8.j("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(p98 p98Var) {
        if (p98Var.b) {
            if (!p98Var.d()) {
                p98Var.a(false);
                return;
            }
            int i = p98Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            p98Var.c = i2;
            p98Var.a.a(this.e);
        }
    }

    public final void c(p98 p98Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (p98Var != null) {
                b(p98Var);
                p98Var = null;
            } else {
                dcc dccVar = this.b;
                bcc bccVar = new bcc(dccVar);
                dccVar.c.put(bccVar, Boolean.FALSE);
                while (bccVar.hasNext()) {
                    b((p98) ((Map.Entry) bccVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(x48 x48Var, zk9 zk9Var) {
        a("observe");
        if (((a58) x48Var.k()).i == g48.a) {
            return;
        }
        o98 o98Var = new o98(this, x48Var, zk9Var);
        p98 p98Var = (p98) this.b.a(zk9Var, o98Var);
        if (p98Var != null && !p98Var.c(x48Var)) {
            qc0.j("Cannot add the same observer with different lifecycles");
        } else {
            if (p98Var != null) {
                return;
            }
            x48Var.k().a(o98Var);
        }
    }

    public final void f(zk9 zk9Var) {
        a("observeForever");
        n98 n98Var = new n98(this, zk9Var);
        p98 p98Var = (p98) this.b.a(zk9Var, n98Var);
        if (p98Var instanceof o98) {
            qc0.j("Cannot add the same observer with different lifecycles");
        } else {
            if (p98Var != null) {
                return;
            }
            n98Var.a(true);
        }
    }

    public void i(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            nc0.o().p(this.j);
        }
    }

    public void j(zk9 zk9Var) {
        a("removeObserver");
        dcc dccVar = this.b;
        WeakHashMap weakHashMap = dccVar.c;
        acc accVar = dccVar.a;
        while (accVar != null && !accVar.a.equals(zk9Var)) {
            accVar = accVar.c;
        }
        Object obj = null;
        if (accVar != null) {
            dccVar.d--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((ccc) it.next()).a(accVar);
                }
            }
            acc accVar2 = accVar.d;
            acc accVar3 = accVar.c;
            if (accVar2 != null) {
                accVar2.c = accVar3;
            } else {
                dccVar.a = accVar3;
            }
            acc accVar4 = accVar.c;
            if (accVar4 != null) {
                accVar4.d = accVar2;
            } else {
                dccVar.b = accVar2;
            }
            accVar.c = null;
            accVar.d = null;
            obj = accVar.b;
        }
        p98 p98Var = (p98) obj;
        if (p98Var == null) {
            return;
        }
        p98Var.b();
        p98Var.a(false);
    }

    public void k(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public void g() {
    }

    public void h() {
    }

    public q98(Object obj) {
        this.a = new Object();
        this.b = new dcc();
        this.c = 0;
        this.f = k;
        this.j = new wwg(17, this);
        this.e = obj;
        this.g = 0;
    }
}
