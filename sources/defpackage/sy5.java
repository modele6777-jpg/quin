package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sy5 implements AutoCloseable, atb {
    public final d3e a;
    public final qy5 b;
    public final pt9 c = new pt9(st9.b);
    public final LinkedHashMap d;
    public final Set e;

    public sy5(d3e d3eVar, qy5 qy5Var) {
        this.a = d3eVar;
        this.b = qy5Var;
        fl8 fl8Var = d3eVar.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(fl8Var.size()));
        Iterator it = fl8Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            int i = ((e3e) entry.getKey()).a;
            if (d3eVar.b(i) == null) {
                qc0.p("Required value was null.");
                throw null;
            }
            d3eVar.h(i).getClass();
            throw null;
        }
        this.d = linkedHashMap;
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(t72.u(setKeySet, 10));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            xj1 xj1VarB = this.a.b(((e3e) it2.next()).a);
            if (xj1VarB == null) {
                qc0.p("Required value was null.");
                throw null;
            }
            arrayList.add(xj1VarB);
        }
        this.e = s72.o1(arrayList);
    }

    @Override // defpackage.atb
    public final void G(qtb qtbVar, long j, long j2) throws Throwable {
        qtbVar.getClass();
        cz5 cz5Var = new cz5(qtbVar, j, j2, this.e);
        this.c.l(j, j2, j, cz5Var.d);
        c78 c78Var = cz5Var.e;
        int iC = c78Var.c();
        for (int i = 0; i < iC; i++) {
            az5 az5Var = (az5) c78Var.get(i);
            Object obj = this.d.get(new e3e(az5Var.c));
            if (obj == null) {
                qc0.p("Required value was null.");
                return;
            }
            Object obj2 = ((Map) obj).get(new qt9(az5Var.d));
            if (obj2 == null) {
                qc0.p("Required value was null.");
                return;
            }
            pt9 pt9Var = (pt9) obj2;
            pt9Var.l(j, j2, j2, az5Var);
            if (!qtbVar.W().keySet().contains(new e3e(az5Var.c))) {
                pt9Var.b(cz5Var.a);
            }
        }
        ty5 ty5Var = new ty5(cz5Var);
        if (!qtbVar.k0()) {
            this.b.b(qtbVar.h());
        }
        ty5Var.b();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
        this.c.close();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Map) it.next()).values().iterator();
            while (it2.hasNext()) {
                ((pt9) it2.next()).close();
            }
        }
    }

    @Override // defpackage.atb
    public final void g0(qtb qtbVar, long j, ptb ptbVar) {
        this.c.h(j, new vt9(10));
        if (ptbVar.N()) {
            return;
        }
        for (e3e e3eVar : qtbVar.W().keySet()) {
            int i = e3eVar.a;
            Map map = (Map) this.d.get(e3eVar);
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((pt9) it.next()).b(j);
                }
            }
        }
    }

    @Override // defpackage.atb
    public final void h(qtb qtbVar, long j, int i, int i2) {
        Map map = (Map) this.d.get(new e3e(i));
        if (map == null) {
            return;
        }
        if (this.a.h(i) == null) {
            qc0.p("Required value was null.");
        } else {
            if (!map.containsKey(new qt9(i2))) {
                qc0.p("Check failed.");
                return;
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((pt9) it.next()).b(j);
            }
        }
    }

    @Override // defpackage.atb
    public final void h0(qtb qtbVar, long j, ds dsVar) {
        this.c.h(j, dsVar);
    }

    @Override // defpackage.atb
    public final void k0(ctb ctbVar) {
        ctbVar.getClass();
        this.b.b(ctbVar);
    }
}
