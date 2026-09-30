package io.sentry.protocol;

import io.sentry.e7;
import io.sentry.k2;
import io.sentry.m3;
import io.sentry.s3;
import io.sentry.z0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements k2 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final io.sentry.util.a b = new io.sentry.util.a();

    public e(e eVar) {
        for (Map.Entry entry : eVar.c()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof a)) {
                    a aVar = (a) value;
                    a aVar2 = new a();
                    aVar2.g = aVar.g;
                    aVar2.a = aVar.a;
                    aVar2.e = aVar.e;
                    aVar2.b = aVar.b;
                    aVar2.f = aVar.f;
                    aVar2.d = aVar.d;
                    aVar2.c = aVar.c;
                    aVar2.v = io.sentry.util.b.o(aVar.v);
                    aVar2.y = aVar.y;
                    List list = aVar.w;
                    aVar2.w = list != null ? new ArrayList(list) : null;
                    aVar2.x = aVar.x;
                    aVar2.z = aVar.z;
                    aVar2.X = aVar.X;
                    aVar2.Y = io.sentry.util.b.o(aVar.Y);
                    n(aVar2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof d)) {
                    d dVar = (d) value;
                    d dVar2 = new d();
                    dVar2.a = dVar.a;
                    dVar2.b = dVar.b;
                    dVar2.c = io.sentry.util.b.o(dVar.c);
                    o(dVar2);
                } else if ("device".equals(entry.getKey()) && (value instanceof h)) {
                    h hVar = (h) value;
                    h hVar2 = new h();
                    hVar2.a = hVar.a;
                    hVar2.b = hVar.b;
                    hVar2.c = hVar.c;
                    hVar2.d = hVar.d;
                    hVar2.e = hVar.e;
                    hVar2.f = hVar.f;
                    hVar2.w = hVar.w;
                    hVar2.x = hVar.x;
                    hVar2.y = hVar.y;
                    hVar2.z = hVar.z;
                    hVar2.X = hVar.X;
                    hVar2.Y = hVar.Y;
                    hVar2.Z = hVar.Z;
                    hVar2.E0 = hVar.E0;
                    hVar2.F0 = hVar.F0;
                    hVar2.G0 = hVar.G0;
                    hVar2.H0 = hVar.H0;
                    hVar2.I0 = hVar.I0;
                    hVar2.J0 = hVar.J0;
                    hVar2.K0 = hVar.K0;
                    hVar2.L0 = hVar.L0;
                    hVar2.M0 = hVar.M0;
                    hVar2.N0 = hVar.N0;
                    hVar2.P0 = hVar.P0;
                    hVar2.R0 = hVar.R0;
                    hVar2.S0 = hVar.S0;
                    hVar2.v = hVar.v;
                    String[] strArr = hVar.g;
                    hVar2.g = strArr != null ? (String[]) strArr.clone() : null;
                    hVar2.Q0 = hVar.Q0;
                    TimeZone timeZone = hVar.O0;
                    hVar2.O0 = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    hVar2.T0 = hVar.T0;
                    hVar2.U0 = hVar.U0;
                    hVar2.V0 = hVar.V0;
                    hVar2.W0 = hVar.W0;
                    hVar2.X0 = io.sentry.util.b.o(hVar.X0);
                    p(hVar2);
                } else if ("os".equals(entry.getKey()) && (value instanceof q)) {
                    q qVar = (q) value;
                    q qVar2 = new q();
                    qVar2.a = qVar.a;
                    qVar2.b = qVar.b;
                    qVar2.c = qVar.c;
                    qVar2.d = qVar.d;
                    qVar2.e = qVar.e;
                    qVar2.f = qVar.f;
                    qVar2.g = io.sentry.util.b.o(qVar.g);
                    s(qVar2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof y)) {
                    y yVar = (y) value;
                    y yVar2 = new y();
                    yVar2.a = yVar.a;
                    yVar2.b = yVar.b;
                    yVar2.c = yVar.c;
                    yVar2.d = io.sentry.util.b.o(yVar.d);
                    u(yVar2);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof k)) {
                    k kVar = (k) value;
                    k kVar2 = new k();
                    kVar2.a = kVar.a;
                    kVar2.b = kVar.b;
                    kVar2.c = kVar.c;
                    kVar2.d = kVar.d;
                    kVar2.e = kVar.e;
                    kVar2.f = kVar.f;
                    kVar2.g = io.sentry.util.b.o(kVar.g);
                    l(kVar2, "feedback");
                } else if ("gpu".equals(entry.getKey()) && (value instanceof m)) {
                    m mVar = (m) value;
                    m mVar2 = new m();
                    mVar2.a = mVar.a;
                    mVar2.b = mVar.b;
                    mVar2.c = mVar.c;
                    mVar2.d = mVar.d;
                    mVar2.e = mVar.e;
                    mVar2.f = mVar.f;
                    mVar2.g = mVar.g;
                    mVar2.v = mVar.v;
                    mVar2.w = mVar.w;
                    mVar2.x = io.sentry.util.b.o(mVar.x);
                    r(mVar2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof e7)) {
                    w(new e7((e7) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof s3)) {
                    s3 s3Var = (s3) value;
                    s3 s3Var2 = new s3();
                    s3Var2.a = s3Var.a;
                    ConcurrentHashMap concurrentHashMapO = io.sentry.util.b.o(s3Var.b);
                    if (concurrentHashMapO != null) {
                        s3Var2.b = concurrentHashMapO;
                    }
                    l(s3Var2, "profile");
                } else if ("response".equals(entry.getKey()) && (value instanceof s)) {
                    s sVar = (s) value;
                    s sVar2 = new s();
                    sVar2.a = sVar.a;
                    sVar2.b = io.sentry.util.b.o(sVar.b);
                    sVar2.f = io.sentry.util.b.o(sVar.f);
                    sVar2.c = sVar.c;
                    sVar2.d = sVar.d;
                    sVar2.e = sVar.e;
                    t(sVar2);
                } else if ("spring".equals(entry.getKey()) && (value instanceof g0)) {
                    g0 g0Var = (g0) value;
                    g0 g0Var2 = new g0();
                    g0Var2.a = g0Var.a;
                    g0Var2.b = io.sentry.util.b.o(g0Var.b);
                    v(g0Var2);
                } else if ("art".equals(entry.getKey()) && (value instanceof c)) {
                    c cVar = (c) value;
                    c cVar2 = new c();
                    cVar2.a = cVar.a;
                    cVar2.b = cVar.b;
                    cVar2.c = cVar.c;
                    cVar2.d = cVar.d;
                    cVar2.e = cVar.e;
                    cVar2.f = cVar.f;
                    cVar2.g = cVar.g;
                    cVar2.v = cVar.v;
                    cVar2.w = cVar.w;
                    cVar2.x = cVar.x;
                    cVar2.y = cVar.y;
                    cVar2.z = io.sentry.util.b.o(cVar.z);
                    l(cVar2, "art");
                } else {
                    l(value, (String) entry.getKey());
                }
            }
        }
    }

    public void a() {
        this.a.clear();
    }

    public boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.a.containsKey(obj);
    }

    public Set c() {
        return this.a.entrySet();
    }

    public Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.a.get(obj);
    }

    public a e() {
        return (a) x("app", a.class);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.a.equals(((e) obj).a);
        }
        return false;
    }

    public h f() {
        return (h) x("device", h.class);
    }

    public j g() {
        return (j) x("flags", j.class);
    }

    public q h() {
        return (q) x("os", q.class);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public y i() {
        return (y) x("runtime", y.class);
    }

    public e7 j() {
        return (e7) x("trace", e7.class);
    }

    public Enumeration k() {
        return this.a.keys();
    }

    public Object l(Object obj, String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
    }

    public void m(e eVar) {
        if (eVar == null) {
            return;
        }
        this.a.putAll(eVar.a);
    }

    public void n(a aVar) {
        l(aVar, "app");
    }

    public void o(d dVar) {
        l(dVar, "browser");
    }

    public void p(h hVar) {
        l(hVar, "device");
    }

    public void q(j jVar) {
        l(jVar, "flags");
    }

    public void r(m mVar) {
        l(mVar, "gpu");
    }

    public void s(q qVar) {
        l(qVar, "os");
    }

    @Override // io.sentry.k2
    public void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        Enumeration enumerationK = k();
        int size = this.a.size();
        String[] strArr = size == 0 ? io.sentry.util.b.a : new String[size];
        int i = 0;
        while (enumerationK.hasMoreElements()) {
            if (i == strArr.length) {
                strArr = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            }
            strArr[i] = (String) enumerationK.nextElement();
            i++;
        }
        if (i != strArr.length) {
            strArr = (String[]) Arrays.copyOf(strArr, i);
        }
        Arrays.sort(strArr);
        for (String str : strArr) {
            Object objD = d(str);
            if (objD != null) {
                cVar.q(str);
                cVar.w(z0Var, objD);
            }
        }
        cVar.m();
    }

    public void t(s sVar) {
        io.sentry.util.a aVar = this.b;
        aVar.b();
        try {
            l(sVar, "response");
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

    public void u(y yVar) {
        l(yVar, "runtime");
    }

    public void v(g0 g0Var) {
        l(g0Var, "spring");
    }

    public void w(e7 e7Var) {
        io.sentry.util.b.r(e7Var, "traceContext is required");
        l(e7Var, "trace");
    }

    public final Object x(String str, Class cls) {
        Object objD = d(str);
        if (cls.isInstance(objD)) {
            return cls.cast(objD);
        }
        return null;
    }

    public e() {
    }
}
