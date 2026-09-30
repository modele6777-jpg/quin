package io.sentry;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.gi2;
import defpackage.xag;
import defpackage.zi0;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a7 implements q1 {
    public final d7 b;
    public final j4 d;
    public final String e;
    public volatile Future g;
    public volatile Future h;
    public volatile boolean i;
    public final io.sentry.util.a j;
    public final io.sentry.util.a k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final io.sentry.protocol.h0 n;
    public final v1 o;
    public final io.sentry.protocol.e p;
    public final o q;
    public final n7 r;
    public final io.sentry.protocol.w a = new io.sentry.protocol.w();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public z6 f = z6.c;

    public a7(m7 m7Var, j4 j4Var, n7 n7Var, o oVar) {
        this.i = false;
        io.sentry.util.a aVar = new io.sentry.util.a();
        this.j = aVar;
        this.k = new io.sentry.util.a();
        this.l = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.m = atomicBoolean;
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        this.p = eVar;
        d7 d7Var = new d7(m7Var, this, j4Var, n7Var);
        this.b = d7Var;
        this.e = m7Var.E0;
        this.o = m7Var.z;
        this.d = j4Var;
        Boolean bool = Boolean.TRUE;
        oVar = bool.equals(F()) ? oVar : null;
        this.q = oVar;
        this.n = m7Var.F0;
        this.r = n7Var;
        G(d7Var);
        io.sentry.protocol.w wVarE = E();
        if (!wVarE.equals(io.sentry.protocol.w.b) && bool.equals(F())) {
            eVar.l(new s3(wVarE), "profile");
        }
        if (oVar != null) {
            oVar.e(this);
        }
        if (n7Var.g == null && n7Var.v == null) {
            return;
        }
        boolean z = true;
        this.i = true;
        Long l = n7Var.v;
        if (l != null) {
            aVar.b();
            try {
                if (this.i) {
                    A();
                    atomicBoolean.set(true);
                    try {
                        this.h = j4Var.o().getTimerExecutorService().schedule(new x6(this, 1), l.longValue());
                    } catch (Throwable th) {
                        this.d.o().getLogger().d(q5.WARNING, "Failed to schedule finish timer", th);
                        h7 h7VarA = a();
                        if (h7VarA == null) {
                            h7VarA = h7.DEADLINE_EXCEEDED;
                        }
                        if (this.r.g == null) {
                            z = false;
                        }
                        f(h7VarA, z, null);
                        this.m.set(false);
                    }
                }
                aVar.close();
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        s();
    }

    public final void A() {
        io.sentry.util.a aVar = this.j;
        aVar.b();
        try {
            if (this.h != null) {
                this.h.cancel(false);
                this.m.set(false);
                this.h = null;
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

    public final void B() {
        io.sentry.util.a aVar = this.j;
        aVar.b();
        try {
            if (this.g != null) {
                this.g.cancel(false);
                this.l.set(false);
                this.g = null;
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

    public final o1 C(e7 e7Var, zi0 zi0Var) {
        boolean z = this.b.g;
        g3 g3Var = g3.a;
        if (!z && this.o.equals(e7Var.z)) {
            j4 j4Var = this.d;
            if (!io.sentry.util.o.a((String) zi0Var.d, j4Var.o().getIgnoredSpanOrigins())) {
                g7 g7Var = e7Var.c;
                String str = e7Var.e;
                String str2 = e7Var.f;
                CopyOnWriteArrayList copyOnWriteArrayList = this.c;
                if (copyOnWriteArrayList.size() >= j4Var.o().getMaxSpans()) {
                    j4Var.o().getLogger().i(q5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
                    return g3Var;
                }
                io.sentry.util.b.r(g7Var, "parentSpanId is required");
                io.sentry.util.b.r(str, "operation is required");
                B();
                d7 d7Var = new d7(this, this.d, e7Var, zi0Var, new xag(4, this));
                G(d7Var);
                copyOnWriteArrayList.add(d7Var);
                o oVar = this.q;
                if (oVar != null) {
                    oVar.d(d7Var);
                }
                return d7Var;
            }
        }
        return g3Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    public final void D(h7 h7Var, z4 z4Var, boolean z, l0 l0Var) {
        u3 u3VarF;
        z4 z4Var2 = this.b.b;
        if (z4Var == null) {
            z4Var = z4Var2;
        }
        if (z4Var == null) {
            z4Var = this.d.o().getDateProvider().a();
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            zi0 zi0Var = ((d7) it.next()).i;
        }
        this.f = new z6(true, h7Var);
        if (this.b.g) {
            return;
        }
        if (this.r.f) {
            ListIterator listIterator = this.c.listIterator();
            while (listIterator.hasNext()) {
                d7 d7Var = (d7) listIterator.next();
                if (!d7Var.g && d7Var.b == null) {
                    return;
                }
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        d7 d7Var2 = this.b;
        d7Var2.j = new gi2(this, d7Var2.j, atomicReference, 13);
        d7Var2.x(this.f.b, z4Var);
        Boolean bool = Boolean.TRUE;
        if (bool.equals(F())) {
            w3 w3Var = this.b.c.d;
            if (bool.equals(w3Var == null ? null : (Boolean) w3Var.d)) {
                u3VarF = this.d.o().getTransactionProfiler().f(this, (List) atomicReference.get(), this.d.o());
            } else {
                u3VarF = null;
            }
        } else {
            u3VarF = null;
        }
        if (this.d.o().isContinuousProfilingEnabled()) {
            t3 profileLifecycle = this.d.o().getProfileLifecycle();
            t3 t3Var = t3.TRACE;
            if (profileLifecycle == t3Var && this.b.c.Z.equals(io.sentry.protocol.w.b)) {
                this.d.o().getContinuousProfiler().b(t3Var);
            }
        }
        if (atomicReference.get() != null) {
            ((List) atomicReference.get()).clear();
        }
        j4 j4Var = this.d;
        int i = 0;
        if (j4Var.isEnabled()) {
            try {
                e1 e1VarE = j4Var.e.e(null);
                e1VarE.I(new y6(i, this, e1VarE));
            } catch (Throwable th) {
                j4Var.o().getLogger().d(q5.ERROR, "Error in the 'configureScope' callback.", th);
            }
        } else {
            j4Var.o().getLogger().i(q5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
        }
        io.sentry.protocol.f0 f0Var = new io.sentry.protocol.f0(this);
        if (this.i) {
            io.sentry.util.a aVar = this.j;
            aVar.b();
            try {
                if (this.i) {
                    B();
                    A();
                    this.i = false;
                }
                aVar.close();
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (z && this.c.isEmpty() && this.r.g != null) {
            this.d.o().getLogger().i(q5.DEBUG, "Dropping idle transaction %s because it has no child spans", this.e);
        } else {
            f0Var.I0.putAll(this.b.l);
            this.d.z(f0Var, c(), l0Var, u3VarF);
        }
    }

    public final io.sentry.protocol.w E() {
        d7 d7Var = this.b;
        return !d7Var.c.Z.equals(io.sentry.protocol.w.b) ? d7Var.c.Z : this.d.o().getContinuousProfiler().e();
    }

    public final Boolean F() {
        w3 w3Var = this.b.c.d;
        if (w3Var == null) {
            return null;
        }
        return (Boolean) w3Var.a;
    }

    public final void G(d7 d7Var) {
        io.sentry.util.thread.a threadChecker = this.d.o().getThreadChecker();
        io.sentry.protocol.w wVarE = E();
        if (!wVarE.equals(io.sentry.protocol.w.b)) {
            Boolean bool = Boolean.TRUE;
            w3 w3Var = d7Var.c.d;
            if (bool.equals(w3Var == null ? null : (Boolean) w3Var.a)) {
                d7Var.k(wVarE.a(), "profiler_id");
            }
        }
        d7Var.k(String.valueOf(threadChecker.b()), "thread.id");
        d7Var.k(threadChecker.a(), "thread.name");
    }

    public final void H(c cVar) {
        d7 d7Var = this.b;
        j4 j4Var = this.d;
        io.sentry.util.a aVar = this.k;
        aVar.b();
        try {
            if (cVar.f) {
                AtomicReference atomicReference = new AtomicReference();
                if (j4Var.isEnabled()) {
                    try {
                        atomicReference.set(j4Var.e.e(null).l());
                    } catch (Throwable th) {
                        j4Var.o().getLogger().d(q5.ERROR, "Error in the 'configureScope' callback.", th);
                    }
                } else {
                    j4Var.o().getLogger().i(q5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                }
                cVar.e(d7Var.c.a, (io.sentry.protocol.w) atomicReference.get(), j4Var.o(), d7Var.c.d, this.e, this.n);
                cVar.f = false;
            }
            aVar.close();
        } catch (Throwable th2) {
            try {
                aVar.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.o1
    public final h7 a() {
        return this.b.c.g;
    }

    @Override // io.sentry.o1
    public final void b(h7 h7Var) {
        d7 d7Var = this.b;
        if (d7Var.g) {
            this.d.o().getLogger().i(q5.DEBUG, "The transaction is already finished. Status %s cannot be set", h7Var == null ? "null" : h7Var.name());
        } else {
            d7Var.c.g = h7Var;
        }
    }

    @Override // io.sentry.o1
    public final k7 c() {
        c cVar;
        if (!this.d.o().isTraceSampling() || (cVar = this.b.c.X) == null) {
            return null;
        }
        H(cVar);
        return cVar.f();
    }

    @Override // io.sentry.o1
    public final w6 d() {
        return this.b.d();
    }

    @Override // io.sentry.o1
    public final boolean e() {
        return this.b.g;
    }

    @Override // io.sentry.q1
    public final void f(h7 h7Var, boolean z, l0 l0Var) {
        if (this.b.g) {
            return;
        }
        z4 z4VarA = this.d.o().getDateProvider().a();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            d7 d7Var = (d7) listIterator.previous();
            d7Var.j = null;
            d7Var.x(h7Var, z4VarA);
        }
        D(h7Var, z4VarA, z, l0Var);
    }

    @Override // io.sentry.o1
    public final void g(Throwable th) {
        d7 d7Var = this.b;
        if (d7Var.g) {
            this.d.o().getLogger().i(q5.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            d7Var.e = th;
        }
    }

    @Override // io.sentry.o1
    public final String getDescription() {
        return this.b.c.f;
    }

    @Override // io.sentry.q1
    public final String getName() {
        return this.e;
    }

    @Override // io.sentry.o1
    public final void h(h7 h7Var) {
        x(h7Var, null);
    }

    @Override // io.sentry.o1
    public final o1 i(String str, String str2, z4 z4Var, v1 v1Var) {
        return l(str, str2, z4Var, v1Var, new zi0(11));
    }

    @Override // io.sentry.o1
    public final void j() {
        x(a(), null);
    }

    @Override // io.sentry.o1
    public final void k(Object obj, String str) {
        d7 d7Var = this.b;
        if (d7Var.g) {
            this.d.o().getLogger().i(q5.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            d7Var.k(obj, str);
        }
    }

    @Override // io.sentry.o1
    public final o1 l(String str, String str2, z4 z4Var, v1 v1Var, zi0 zi0Var) {
        boolean z = this.b.g;
        g3 g3Var = g3.a;
        if (z || !this.o.equals(v1Var)) {
            return g3Var;
        }
        int size = this.c.size();
        j4 j4Var = this.d;
        if (size < j4Var.o().getMaxSpans()) {
            return this.b.l(str, str2, z4Var, v1Var, zi0Var);
        }
        j4Var.o().getLogger().i(q5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return g3Var;
    }

    @Override // io.sentry.o1
    public final d m() {
        c cVar;
        String str;
        int i;
        String str2;
        c cVar2;
        String str3 = "%20";
        d dVar = null;
        if (!this.d.o().isTraceSampling() || (cVar = this.b.c.X) == null) {
            return null;
        }
        z0 z0Var = cVar.h;
        H(cVar);
        String str4 = c.a(z0Var, null, true).e;
        ConcurrentHashMap concurrentHashMap = cVar.a;
        StringBuilder sb = new StringBuilder();
        if (str4 == null || str4.isEmpty()) {
            str = "";
            i = 0;
        } else {
            sb.append(str4);
            Charset charset = io.sentry.util.p.a;
            int i2 = 0;
            for (int i3 = 0; i3 < str4.length(); i3++) {
                if (str4.charAt(i3) == ',') {
                    i2++;
                }
            }
            i = i2 + 1;
            str = ",";
        }
        io.sentry.util.a aVar = cVar.b;
        aVar.b();
        try {
            TreeSet<String> treeSet = new TreeSet(Collections.list(concurrentHashMap.keys()));
            aVar.close();
            treeSet.add("sentry-sample_rate");
            treeSet.add("sentry-sample_rand");
            int i4 = i;
            String str5 = str;
            for (String str6 : treeSet) {
                d dVar2 = dVar;
                String strC = "sentry-sample_rate".equals(str6) ? c.c(cVar.c) : "sentry-sample_rand".equals(str6) ? c.c(cVar.d) : (String) concurrentHashMap.get(str6);
                if (strC == null) {
                    str2 = str3;
                    cVar2 = cVar;
                } else if (i4 >= 64) {
                    z0Var.i(q5.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str6, 64);
                    str2 = str3;
                    cVar2 = cVar;
                } else {
                    try {
                        cVar2 = cVar;
                        try {
                            str2 = str3;
                            try {
                                String str7 = str5 + URLEncoder.encode(str6, Constants.ENCODING).replaceAll("\\+", str3) + "=" + URLEncoder.encode(strC, Constants.ENCODING).replaceAll("\\+", str3);
                                if (sb.length() + str7.length() > 8192) {
                                    z0Var.i(q5.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str6, Integer.valueOf(UserMetadata.MAX_INTERNAL_KEY_SIZE));
                                } else {
                                    i4++;
                                    sb.append(str7);
                                    str5 = ",";
                                }
                            } catch (Throwable th) {
                                th = th;
                                z0Var.c(q5.ERROR, th, "Unable to encode baggage key value pair (key=%s,value=%s).", str6, strC);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = str3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = str3;
                        cVar2 = cVar;
                    }
                }
                dVar = dVar2;
                cVar = cVar2;
                str3 = str2;
            }
            d dVar3 = dVar;
            String string = sb.toString();
            return string.isEmpty() ? dVar3 : new d(0, string);
        } catch (Throwable th4) {
            try {
                aVar.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @Override // io.sentry.o1
    public final void n() {
        j4 j4Var = this.d;
        if (!j4Var.isEnabled()) {
            j4Var.o().getLogger().i(q5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            j4Var.e.e(null).K(this);
        } catch (Throwable th) {
            j4Var.o().getLogger().d(q5.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.q1
    public final o1 o() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            d7 d7Var = (d7) listIterator.previous();
            if (!d7Var.g) {
                return d7Var;
            }
        }
        return null;
    }

    @Override // io.sentry.o1
    public final void p(String str) {
        d7 d7Var = this.b;
        if (d7Var.g) {
            this.d.o().getLogger().i(q5.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            d7Var.c.f = str;
        }
    }

    @Override // io.sentry.q1
    public final io.sentry.protocol.w q() {
        return this.a;
    }

    @Override // io.sentry.o1
    public final o1 r(String str) {
        return y(str, null);
    }

    @Override // io.sentry.q1
    public final void s() {
        Long l;
        io.sentry.util.a aVar = this.j;
        aVar.b();
        try {
            if (this.i && (l = this.r.g) != null) {
                B();
                this.l.set(true);
                try {
                    this.g = this.d.o().getTimerExecutorService().schedule(new x6(this, 0), l.longValue());
                } catch (Throwable th) {
                    this.d.o().getLogger().d(q5.WARNING, "Failed to schedule finish timer", th);
                    h7 h7VarA = a();
                    if (h7VarA == null) {
                        h7VarA = h7.OK;
                    }
                    x(h7VarA, null);
                    this.l.set(false);
                }
            }
            aVar.close();
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.o1
    public final void t(String str, Long l, n2 n2Var) {
        this.b.t(str, l, n2Var);
    }

    @Override // io.sentry.o1
    public final e7 u() {
        return this.b.c;
    }

    @Override // io.sentry.o1
    public final z4 v() {
        return this.b.b;
    }

    @Override // io.sentry.o1
    public final void w(String str, Number number) {
        this.b.w(str, number);
    }

    @Override // io.sentry.o1
    public final void x(h7 h7Var, z4 z4Var) {
        D(h7Var, z4Var, true, null);
    }

    @Override // io.sentry.o1
    public final o1 y(String str, String str2) {
        return l(str, str2, null, v1.SENTRY, new zi0(11));
    }

    @Override // io.sentry.o1
    public final z4 z() {
        return this.b.a;
    }
}
