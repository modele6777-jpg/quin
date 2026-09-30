package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fu0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final aq4 c = new aq4(new CopyOnWriteArrayList(), 0, null);
    public final aq4 d = new aq4(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public gye f;
    public uha g;
    public lp3 h;

    public abstract up8 a(zp8 zp8Var, ta0 ta0Var, long j);

    public final void b(aq8 aq8Var) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(aq8Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        c();
    }

    public final void d(aq8 aq8Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(aq8Var);
        if (zIsEmpty) {
            e();
        }
    }

    public gye f() {
        return null;
    }

    public abstract op8 g();

    public boolean h() {
        return true;
    }

    public abstract void i();

    public final void j(aq8 aq8Var, uha uhaVar, lp3 lp3Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        pa7.A(looper == null || looper == looperMyLooper);
        this.g = uhaVar;
        this.h = lp3Var;
        gye gyeVar = this.f;
        this.a.add(aq8Var);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(aq8Var);
            lp3Var.getClass();
            k(lp3Var);
            return;
        }
        if (gyeVar != null) {
            d(aq8Var);
            aq8Var.a(this, gyeVar);
        }
    }

    public abstract void k(lp3 lp3Var);

    public final void l(gye gyeVar) {
        this.f = gyeVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((aq8) it.next()).a(this, gyeVar);
        }
    }

    public abstract void m(up8 up8Var);

    public final void n(aq8 aq8Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(aq8Var);
        if (!arrayList.isEmpty()) {
            b(aq8Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        o();
    }

    public abstract void o();

    public final void p(bq4 bq4Var) {
        CopyOnWriteArrayList<zp4> copyOnWriteArrayList = this.d.c;
        for (zp4 zp4Var : copyOnWriteArrayList) {
            if (zp4Var.a == bq4Var) {
                copyOnWriteArrayList.remove(zp4Var);
            }
        }
    }

    public final void q(fq8 fq8Var) {
        CopyOnWriteArrayList<eq8> copyOnWriteArrayList = this.c.c;
        for (eq8 eq8Var : copyOnWriteArrayList) {
            if (eq8Var.b == fq8Var) {
                copyOnWriteArrayList.remove(eq8Var);
            }
        }
    }

    public abstract void r(op8 op8Var);

    public void c() {
    }

    public void e() {
    }
}
