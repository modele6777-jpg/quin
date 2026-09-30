package io.sentry;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e4 implements e1 {
    public q1 a;
    public final WeakReference b;
    public io.sentry.protocol.i0 c;
    public String d;
    public io.sentry.protocol.r e;
    public final ArrayList f;
    public volatile Queue g;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public final CopyOnWriteArrayList k;
    public volatile q6 l;
    public volatile c7 m;
    public final io.sentry.util.a n;
    public final io.sentry.util.a o;
    public final io.sentry.util.a p;
    public final io.sentry.protocol.e q;
    public final CopyOnWriteArrayList r;
    public w3 s;
    public io.sentry.protocol.w t;
    public j1 u;
    public final Map v;
    public final io.sentry.featureflags.b w;

    public e4(e4 e4Var) {
        io.sentry.protocol.i0 i0Var;
        io.sentry.protocol.r rVar = null;
        this.b = new WeakReference(null);
        this.f = new ArrayList();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new CopyOnWriteArrayList();
        this.n = new io.sentry.util.a();
        this.o = new io.sentry.util.a();
        this.p = new io.sentry.util.a();
        this.q = new io.sentry.protocol.e();
        this.r = new CopyOnWriteArrayList();
        this.t = io.sentry.protocol.w.b;
        this.u = c3.a;
        this.v = Collections.synchronizedMap(new WeakHashMap());
        this.a = e4Var.a;
        this.b = e4Var.b;
        this.m = e4Var.m;
        this.l = e4Var.l;
        this.u = e4Var.u;
        io.sentry.protocol.i0 i0Var2 = e4Var.c;
        if (i0Var2 != null) {
            i0Var = new io.sentry.protocol.i0();
            i0Var.a = i0Var2.a;
            i0Var.c = i0Var2.c;
            i0Var.b = i0Var2.b;
            i0Var.d = i0Var2.d;
            i0Var.e = i0Var2.e;
            i0Var.f = i0Var2.f;
            i0Var.g = io.sentry.util.b.o(i0Var2.g);
            i0Var.v = io.sentry.util.b.o(i0Var2.v);
        } else {
            i0Var = null;
        }
        this.c = i0Var;
        this.d = e4Var.d;
        this.t = e4Var.t;
        io.sentry.protocol.r rVar2 = e4Var.e;
        if (rVar2 != null) {
            rVar = new io.sentry.protocol.r();
            rVar.a = rVar2.a;
            rVar.e = rVar2.e;
            rVar.b = rVar2.b;
            rVar.c = rVar2.c;
            rVar.f = io.sentry.util.b.o(rVar2.f);
            rVar.g = io.sentry.util.b.o(rVar2.g);
            rVar.w = io.sentry.util.b.o(rVar2.w);
            rVar.z = io.sentry.util.b.o(rVar2.z);
            rVar.d = rVar2.d;
            rVar.x = rVar2.x;
            rVar.v = rVar2.v;
            rVar.y = rVar2.y;
        }
        this.e = rVar;
        this.f = new ArrayList(e4Var.f);
        this.k = new CopyOnWriteArrayList(e4Var.k);
        g[] gVarArr = (g[]) e4Var.g.toArray(new g[0]);
        Queue queueA = a(e4Var.l.getMaxBreadcrumbs());
        for (g gVar : gVarArr) {
            queueA.add(new g(gVar));
        }
        this.g = queueA;
        ConcurrentHashMap concurrentHashMap = e4Var.h;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.h = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = e4Var.i;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), (s4) entry2.getValue());
            }
        }
        this.i = concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5 = e4Var.j;
        ConcurrentHashMap concurrentHashMap6 = new ConcurrentHashMap();
        for (Map.Entry entry3 : concurrentHashMap5.entrySet()) {
            if (entry3 != null) {
                concurrentHashMap6.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        this.j = concurrentHashMap6;
        this.q = new io.sentry.protocol.e(e4Var.q);
        this.r = new CopyOnWriteArrayList(e4Var.r);
        this.w = e4Var.w.clone();
        this.s = new w3(e4Var.s);
    }

    public static Queue a(int i) {
        return i > 0 ? new j7(new j(i)) : new b0();
    }

    @Override // io.sentry.e1
    public final j1 A() {
        return this.u;
    }

    @Override // io.sentry.e1
    public final Map B() {
        return io.sentry.util.b.o(this.h);
    }

    @Override // io.sentry.e1
    public final List C() {
        return this.k;
    }

    @Override // io.sentry.e1
    public final List D() {
        return new CopyOnWriteArrayList(this.r);
    }

    @Override // io.sentry.e1
    public final void E(i5 i5Var) {
        o1 o1Var;
        if (!this.l.isTracingEnabled() || i5Var.a() == null) {
            return;
        }
        Map map = this.v;
        Throwable thA = i5Var.a();
        io.sentry.util.b.r(thA, "throwable cannot be null");
        while (thA.getCause() != null && thA.getCause() != thA) {
            thA = thA.getCause();
        }
        io.sentry.util.i iVar = (io.sentry.util.i) map.get(thA);
        if (iVar != null) {
            WeakReference weakReference = iVar.a;
            if (i5Var.b.j() == null && (o1Var = (o1) weakReference.get()) != null) {
                i5Var.b.w(o1Var.u());
            }
            String str = (String) iVar.b;
            if (i5Var.K0 == null) {
                i5Var.K0 = str;
            }
        }
    }

    @Override // io.sentry.e1
    public final io.sentry.protocol.e F() {
        return this.q;
    }

    @Override // io.sentry.e1
    public final w3 G(b4 b4Var) {
        io.sentry.util.a aVar = this.p;
        aVar.b();
        try {
            b4Var.a(this.s);
            w3 w3Var = new w3(this.s);
            aVar.close();
            return w3Var;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.e1
    public final String H() {
        return this.d;
    }

    @Override // io.sentry.e1
    public final void I(d4 d4Var) {
        io.sentry.util.a aVar = this.o;
        aVar.b();
        try {
            d4Var.c(this.a);
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.e1
    public final void K(q1 q1Var) {
        io.sentry.util.a aVar = this.o;
        aVar.b();
        try {
            this.a = q1Var;
            for (f1 f1Var : this.l.getScopeObservers()) {
                if (q1Var != null) {
                    f1Var.s(q1Var.getName());
                    f1Var.p(q1Var.u(), this);
                } else {
                    f1Var.s(null);
                    f1Var.p(null, this);
                }
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.e1
    public final List L() {
        return this.f;
    }

    @Override // io.sentry.e1
    public final io.sentry.protocol.i0 M() {
        return this.c;
    }

    @Override // io.sentry.e1
    public final List N() {
        return io.sentry.util.b.w(this.k);
    }

    @Override // io.sentry.e1
    public final String O() {
        q1 q1Var = this.a;
        if (q1Var != null) {
            return q1Var.getName();
        }
        return null;
    }

    @Override // io.sentry.e1
    public final void P(w3 w3Var) {
        this.s = w3Var;
        e7 e7Var = new e7((io.sentry.protocol.w) w3Var.b, (g7) w3Var.c, "default", null);
        e7Var.w = "auto";
        Iterator<f1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().p(e7Var, this);
        }
    }

    @Override // io.sentry.e1
    public final o1 b() {
        o1 o1VarO;
        o1 o1Var = (o1) this.b.get();
        if (o1Var != null) {
            return o1Var;
        }
        q1 q1Var = this.a;
        return (q1Var == null || (o1VarO = q1Var.o()) == null) ? q1Var : o1VarO;
    }

    @Override // io.sentry.e1
    public final void c(io.sentry.protocol.i0 i0Var) {
        this.c = i0Var;
        Iterator<f1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().c(i0Var);
        }
    }

    @Override // io.sentry.e1
    public final void clear() {
        this.c = null;
        this.e = null;
        this.d = null;
        this.f.clear();
        this.g.clear();
        Iterator<f1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().k(this.g);
        }
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.q.a();
        this.k.clear();
        s();
        this.r.clear();
        Iterator<f1> it2 = this.l.getScopeObservers().iterator();
        while (it2.hasNext()) {
            it2.next().l();
        }
        this.w.clear();
        Iterator<f1> it3 = this.l.getScopeObservers().iterator();
        while (it3.hasNext()) {
            it3.next().q(this.q);
        }
    }

    @Override // io.sentry.e1
    public final e1 clone() {
        return new e4(this);
    }

    @Override // io.sentry.e1
    public final void d(Throwable th, d7 d7Var, String str) {
        io.sentry.util.b.r(th, "throwable is required");
        io.sentry.util.b.r(str, "transactionName is required");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        Map map = this.v;
        if (map.containsKey(th)) {
            return;
        }
        map.put(th, new io.sentry.util.i(new WeakReference(d7Var), str));
    }

    @Override // io.sentry.e1
    public final Map getAttributes() {
        return io.sentry.util.b.o(this.i);
    }

    @Override // io.sentry.e1
    public final Map getExtras() {
        return this.j;
    }

    @Override // io.sentry.e1
    public final io.sentry.protocol.r h() {
        return this.e;
    }

    @Override // io.sentry.e1
    public final void i(g gVar, l0 l0Var) {
        if (gVar == null || (this.g instanceof b0) || io.sentry.util.m.a()) {
            return;
        }
        b6 beforeBreadcrumb = this.l.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            if (l0Var == null) {
                l0Var = new l0();
            }
            try {
                ThreadLocal threadLocal = io.sentry.util.m.a;
                Integer num = (Integer) threadLocal.get();
                int iIntValue = 1;
                if (num != null) {
                    iIntValue = 1 + num.intValue();
                }
                threadLocal.set(Integer.valueOf(iIntValue));
                io.sentry.util.l lVar = io.sentry.util.m.b;
                try {
                    gVar = ((d) beforeBreadcrumb).a(gVar, l0Var);
                    if (lVar != null) {
                        lVar.close();
                    }
                } catch (Throwable th) {
                    if (lVar != null) {
                        try {
                            lVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                this.l.getLogger().d(q5.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th3);
                if (th3.getMessage() != null) {
                    gVar.d(th3.getMessage(), "sentry:message");
                }
            }
        }
        if (gVar == null) {
            this.l.getLogger().i(q5.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.g.add(gVar);
        for (f1 f1Var : this.l.getScopeObservers()) {
            f1Var.j(gVar);
            f1Var.k(this.g);
        }
    }

    @Override // io.sentry.e1
    public final io.sentry.protocol.j j() {
        return this.w.j();
    }

    @Override // io.sentry.e1
    public final io.sentry.protocol.w l() {
        return this.t;
    }

    @Override // io.sentry.e1
    public final void m(String str, String str2) {
        if (str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (str2 == null) {
            concurrentHashMap.remove(str);
            for (f1 f1Var : this.l.getScopeObservers()) {
                f1Var.o(str);
                f1Var.r(this.j);
            }
            return;
        }
        concurrentHashMap.put(str, str2);
        for (f1 f1Var2 : this.l.getScopeObservers()) {
            f1Var2.m(str, str2);
            f1Var2.r(this.j);
        }
    }

    @Override // io.sentry.e1
    public final void n(io.sentry.protocol.w wVar) {
        this.t = wVar;
        Iterator<f1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().n(wVar);
        }
    }

    @Override // io.sentry.e1
    public final q6 o() {
        return this.l;
    }

    @Override // io.sentry.e1
    public final q1 p() {
        return this.a;
    }

    @Override // io.sentry.e1
    public final c7 q() {
        io.sentry.util.a aVar = this.n;
        aVar.b();
        try {
            c7 c7Var = null;
            if (this.m != null) {
                c7 c7Var2 = this.m;
                c7Var2.getClass();
                c7Var2.b(new Date());
                this.l.getContinuousProfiler().d();
                c7 c7VarClone = this.m.clone();
                this.m = null;
                c7Var = c7VarClone;
            }
            aVar.close();
            return c7Var;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.e1
    public final io.sentry.internal.debugmeta.c r() {
        io.sentry.util.a aVar = this.n;
        aVar.b();
        try {
            if (this.m != null) {
                c7 c7Var = this.m;
                c7Var.getClass();
                c7Var.b(new Date());
                this.l.getContinuousProfiler().d();
            }
            c7 c7Var2 = this.m;
            io.sentry.internal.debugmeta.c cVar = null;
            if (this.l.getRelease() != null) {
                String distinctId = this.l.getDistinctId();
                io.sentry.protocol.i0 i0Var = this.c;
                this.m = new c7(b7.Ok, new Date(), new Date(), 0, distinctId, io.sentry.config.a.j(), Boolean.TRUE, null, null, i0Var != null ? i0Var.d : null, null, this.l.getEnvironment(), this.l.getRelease(), null);
                cVar = new io.sentry.internal.debugmeta.c(5, this.m.clone(), c7Var2 != null ? c7Var2.clone() : null);
            } else {
                this.l.getLogger().i(q5.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            aVar.close();
            return cVar;
        } catch (Throwable th) {
            try {
                aVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.e1
    public final void s() {
        io.sentry.util.a aVar = this.o;
        aVar.b();
        try {
            this.a = null;
            aVar.close();
            for (f1 f1Var : this.l.getScopeObservers()) {
                f1Var.s(null);
                f1Var.p(null, this);
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.e1
    public final io.sentry.featureflags.b t() {
        return this.w;
    }

    @Override // io.sentry.e1
    public final c7 u() {
        return this.m;
    }

    @Override // io.sentry.e1
    public final Queue v() {
        return this.g;
    }

    @Override // io.sentry.e1
    public final q5 w() {
        return null;
    }

    @Override // io.sentry.e1
    public final w3 x() {
        return this.s;
    }

    @Override // io.sentry.e1
    public final c7 y(c4 c4Var) {
        io.sentry.util.a aVar = this.n;
        aVar.b();
        try {
            c4Var.b(this.m);
            c7 c7VarClone = this.m != null ? this.m.clone() : null;
            aVar.close();
            return c7VarClone;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.e1
    public final void z(String str) {
        this.d = str;
        io.sentry.protocol.e eVar = this.q;
        io.sentry.protocol.a aVarE = eVar.e();
        if (aVarE == null) {
            aVarE = new io.sentry.protocol.a();
            eVar.n(aVarE);
        }
        if (str == null) {
            aVarE.w = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            aVarE.w = arrayList;
        }
        Iterator<f1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().q(eVar);
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m21clone() {
        return new e4(this);
    }

    @Override // io.sentry.e1
    public final void J(io.sentry.protocol.w wVar) {
    }

    public e4(q6 q6Var) {
        io.sentry.featureflags.b aVar;
        this.b = new WeakReference(null);
        this.f = new ArrayList();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new CopyOnWriteArrayList();
        this.n = new io.sentry.util.a();
        this.o = new io.sentry.util.a();
        this.p = new io.sentry.util.a();
        this.q = new io.sentry.protocol.e();
        this.r = new CopyOnWriteArrayList();
        this.t = io.sentry.protocol.w.b;
        this.u = c3.a;
        this.v = Collections.synchronizedMap(new WeakHashMap());
        io.sentry.util.b.r(q6Var, "SentryOptions is required.");
        this.l = q6Var;
        this.g = a(this.l.getMaxBreadcrumbs());
        int maxFeatureFlags = q6Var.getMaxFeatureFlags();
        if (maxFeatureFlags > 0) {
            aVar = new io.sentry.featureflags.a(maxFeatureFlags);
        } else {
            aVar = io.sentry.featureflags.c.a;
        }
        this.w = aVar;
        this.s = new w3();
    }
}
