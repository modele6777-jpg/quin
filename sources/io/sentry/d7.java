package io.sentry;

import defpackage.xag;
import defpackage.zi0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d7 implements o1 {
    public final z4 a;
    public z4 b;
    public final e7 c;
    public final a7 d;
    public Throwable e;
    public final g1 f;
    public final zi0 i;
    public f7 j;
    public boolean g = false;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final ConcurrentHashMap l = new ConcurrentHashMap();

    public d7(a7 a7Var, j4 j4Var, e7 e7Var, zi0 zi0Var, xag xagVar) {
        new ConcurrentHashMap();
        this.c = e7Var;
        e7Var.w = (String) zi0Var.d;
        this.d = a7Var;
        io.sentry.util.b.r(j4Var, "Scopes are required");
        this.f = j4Var;
        this.i = zi0Var;
        this.j = xagVar;
        z4 z4Var = (z4) zi0Var.b;
        if (z4Var != null) {
            this.a = z4Var;
        } else {
            this.a = j4Var.o().getDateProvider().a();
        }
    }

    @Override // io.sentry.o1
    public final h7 a() {
        return this.c.g;
    }

    @Override // io.sentry.o1
    public final void b(h7 h7Var) {
        this.c.g = h7Var;
    }

    @Override // io.sentry.o1
    public final w6 d() {
        e7 e7Var = this.c;
        io.sentry.protocol.w wVar = e7Var.a;
        g7 g7Var = e7Var.b;
        w3 w3Var = e7Var.d;
        return new w6(wVar, g7Var, w3Var == null ? null : (Boolean) w3Var.a);
    }

    @Override // io.sentry.o1
    public final boolean e() {
        return this.g;
    }

    @Override // io.sentry.o1
    public final void g(Throwable th) {
        this.e = th;
    }

    @Override // io.sentry.o1
    public final String getDescription() {
        return this.c.f;
    }

    @Override // io.sentry.o1
    public final void h(h7 h7Var) {
        x(h7Var, this.f.o().getDateProvider().a());
    }

    @Override // io.sentry.o1
    public final o1 i(String str, String str2, z4 z4Var, v1 v1Var) {
        return l(str, str2, z4Var, v1Var, new zi0(11));
    }

    @Override // io.sentry.o1
    public final void j() {
        h(this.c.g);
    }

    @Override // io.sentry.o1
    public final void k(Object obj, String str) {
        ConcurrentHashMap concurrentHashMap = this.k;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // io.sentry.o1
    public final o1 l(String str, String str2, z4 z4Var, v1 v1Var, zi0 zi0Var) {
        if (this.g) {
            return g3.a;
        }
        g7 g7Var = this.c.b;
        a7 a7Var = this.d;
        e7 e7Var = a7Var.b.c;
        e7 e7Var2 = new e7(e7Var.a, new g7(), g7Var, str, null, e7Var.d, null, "manual");
        e7Var2.f = str2;
        e7Var2.z = v1Var;
        zi0Var.b = z4Var;
        return a7Var.C(e7Var2, zi0Var);
    }

    @Override // io.sentry.o1
    public final void p(String str) {
        this.c.f = str;
    }

    @Override // io.sentry.o1
    public final o1 r(String str) {
        return y(str, null);
    }

    @Override // io.sentry.o1
    public final void t(String str, Long l, n2 n2Var) {
        if (this.g) {
            this.f.o().getLogger().i(q5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new io.sentry.protocol.n(n2Var.apiName(), l));
        a7 a7Var = this.d;
        d7 d7Var = a7Var.b;
        if (d7Var == this || d7Var.l.containsKey(str)) {
            return;
        }
        a7Var.t(str, l, n2Var);
    }

    @Override // io.sentry.o1
    public final e7 u() {
        return this.c;
    }

    @Override // io.sentry.o1
    public final z4 v() {
        return this.b;
    }

    @Override // io.sentry.o1
    public final void w(String str, Number number) {
        if (this.g) {
            this.f.o().getLogger().i(q5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new io.sentry.protocol.n((String) null, number));
        a7 a7Var = this.d;
        d7 d7Var = a7Var.b;
        if (d7Var == this || d7Var.l.containsKey(str)) {
            return;
        }
        a7Var.w(str, number);
    }

    @Override // io.sentry.o1
    public final void x(h7 h7Var, z4 z4Var) {
        List<d7> list;
        z4 z4Var2;
        z4 z4Var3;
        e7 e7Var = this.c;
        g7 g7Var = e7Var.b;
        a7 a7Var = this.d;
        CopyOnWriteArrayList<d7> copyOnWriteArrayList = a7Var.c;
        if (this.g || !this.h.compareAndSet(false, true)) {
            return;
        }
        e7Var.g = h7Var;
        g1 g1Var = this.f;
        if (z4Var == null) {
            z4Var = g1Var.o().getDateProvider().a();
        }
        this.b = z4Var;
        zi0 zi0Var = this.i;
        if (zi0Var.a) {
            if (!a7Var.b.c.b.equals(g7Var)) {
                list = copyOnWriteArrayList;
                ArrayList arrayList = new ArrayList();
                for (d7 d7Var : copyOnWriteArrayList) {
                    g7 g7Var2 = d7Var.c.c;
                    if (g7Var2 != null && g7Var2.equals(g7Var)) {
                        arrayList.add(d7Var);
                    }
                }
                list = arrayList;
            }
            list = copyOnWriteArrayList;
            z4 z4Var4 = null;
            z4 z4Var5 = null;
            for (d7 d7Var2 : list) {
                if (z4Var4 == null || d7Var2.a.b(z4Var4) < 0) {
                    z4Var4 = d7Var2.a;
                }
                if (z4Var5 == null || ((z4Var3 = d7Var2.b) != null && z4Var3.b(z4Var5) > 0)) {
                    z4Var5 = d7Var2.b;
                }
            }
            if (zi0Var.a && z4Var5 != null && (((z4Var2 = this.b) == null || z4Var2.b(z4Var5) > 0) && this.b != null)) {
                this.b = z4Var5;
            }
        }
        Throwable th = this.e;
        if (th != null) {
            g1Var.d(th, this, a7Var.e);
        }
        f7 f7Var = this.j;
        if (f7Var != null) {
            f7Var.d(this);
        }
        this.g = true;
    }

    @Override // io.sentry.o1
    public final o1 y(String str, String str2) {
        if (this.g) {
            return g3.a;
        }
        g7 g7Var = this.c.b;
        zi0 zi0Var = new zi0(11);
        a7 a7Var = this.d;
        e7 e7Var = a7Var.b.c;
        e7 e7Var2 = new e7(e7Var.a, new g7(), g7Var, str, null, e7Var.d, null, "manual");
        e7Var2.f = str2;
        e7Var2.z = v1.SENTRY;
        return a7Var.C(e7Var2, zi0Var);
    }

    @Override // io.sentry.o1
    public final z4 z() {
        return this.a;
    }

    public d7(m7 m7Var, a7 a7Var, j4 j4Var, n7 n7Var) {
        new ConcurrentHashMap();
        this.c = m7Var;
        m7Var.w = (String) n7Var.d;
        this.d = a7Var;
        this.f = j4Var;
        this.j = null;
        z4 z4Var = (z4) n7Var.b;
        if (z4Var != null) {
            this.a = z4Var;
        } else {
            this.a = j4Var.o().getDateProvider().a();
        }
        this.i = n7Var;
    }
}
