package io.sentry.protocol;

import io.sentry.a7;
import io.sentry.d7;
import io.sentry.e7;
import io.sentry.k2;
import io.sentry.m3;
import io.sentry.t5;
import io.sentry.v4;
import io.sentry.w3;
import io.sentry.z0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends v4 implements k2 {
    public String E0;
    public Double F0;
    public Double G0;
    public final ArrayList H0;
    public final HashMap I0;
    public t5 J0;
    public ConcurrentHashMap K0;

    public f0(a7 a7Var) {
        super(a7Var.a);
        this.H0 = new ArrayList();
        this.I0 = new HashMap();
        d7 d7Var = a7Var.b;
        this.F0 = Double.valueOf(d7Var.a.d() / 1.0E9d);
        this.G0 = Double.valueOf(d7Var.a.c(d7Var.b) / 1.0E9d);
        this.E0 = a7Var.e;
        for (d7 d7Var2 : a7Var.c) {
            Boolean bool = Boolean.TRUE;
            w3 w3Var = d7Var2.c.d;
            if (bool.equals(w3Var == null ? null : (Boolean) w3Var.a)) {
                this.H0.add(new z(d7Var2));
            }
        }
        e eVar = this.b;
        eVar.m(a7Var.p);
        e7 e7Var = d7Var.c;
        ConcurrentHashMap concurrentHashMap = d7Var.k;
        e7 e7Var2 = new e7(e7Var.a, e7Var.b, e7Var.c, e7Var.e, e7Var.f, e7Var.d, e7Var.g, e7Var.w);
        for (Map.Entry entry : e7Var.v.entrySet()) {
            b((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (str != null) {
                Map map = e7Var2.x;
                if (value == null) {
                    map.remove(str);
                } else {
                    map.put(str, value);
                }
            }
        }
        e7Var.Y.j();
        eVar.w(e7Var2);
        this.J0 = new t5(1, a7Var.n.apiName());
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.E0 != null) {
            cVar.q("transaction");
            cVar.z(this.E0);
        }
        cVar.q("start_timestamp");
        cVar.w(z0Var, io.sentry.config.a.g(this.F0.doubleValue()));
        if (this.G0 != null) {
            cVar.q("timestamp");
            cVar.w(z0Var, io.sentry.config.a.g(this.G0.doubleValue()));
        }
        ArrayList arrayList = this.H0;
        if (!arrayList.isEmpty()) {
            cVar.q("spans");
            cVar.w(z0Var, arrayList);
        }
        cVar.q("type");
        cVar.z("transaction");
        HashMap map = this.I0;
        if (!map.isEmpty()) {
            cVar.q("measurements");
            cVar.w(z0Var, map);
        }
        cVar.q("transaction_info");
        cVar.w(z0Var, this.J0);
        io.sentry.config.a.w(this, cVar, z0Var);
        ConcurrentHashMap concurrentHashMap = this.K0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.K0, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }

    public f0(ArrayList arrayList, HashMap map, t5 t5Var) {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.H0 = arrayList2;
        HashMap map2 = new HashMap();
        this.I0 = map2;
        this.E0 = "";
        this.F0 = dValueOf;
        this.G0 = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.I0.putAll(((z) it.next()).z);
        }
        this.J0 = t5Var;
    }
}
