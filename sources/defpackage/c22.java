package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c22 implements im3 {
    public final enb a;
    public final a26 b;
    public final x c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public c22(enb enbVar, a26 a26Var) {
        enbVar.getClass();
        this.a = enbVar;
        this.b = a26Var;
        x xVar = new x(12, this);
        this.c = xVar;
        ve5 ve5Var = new ve5(new td0(1, enbVar.d()), true, xVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ue5 ue5Var = new ue5(ve5Var);
        while (ue5Var.hasNext()) {
            Object next = ue5Var.next();
            t99 t99VarC = ((onb) next).c();
            Object arrayList = linkedHashMap.get(t99VarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(t99VarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        ve5 ve5Var2 = new ve5(new td0(1, this.a.b()), true, this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ue5 ue5Var2 = new ue5(ve5Var2);
        while (ue5Var2.hasNext()) {
            Object next2 = ue5Var2.next();
            linkedHashMap2.put(((lnb) next2).c(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList arrayListF = this.a.f();
        a26 a26Var2 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListF) {
            if (((Boolean) a26Var2.d(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iF = bm8.F(t72.u(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iF < 16 ? 16 : iF);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((rnb) obj2).c(), obj2);
        }
        this.f = linkedHashMap3;
    }

    @Override // defpackage.im3
    public final Set a() {
        ve5 ve5Var = new ve5(new td0(1, this.a.d()), true, this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ue5 ue5Var = new ue5(ve5Var);
        while (ue5Var.hasNext()) {
            linkedHashSet.add(((onb) ue5Var.next()).c());
        }
        return linkedHashSet;
    }

    @Override // defpackage.im3
    public final rnb b(t99 t99Var) {
        t99Var.getClass();
        return (rnb) this.f.get(t99Var);
    }

    @Override // defpackage.im3
    public final Collection c(t99 t99Var) {
        List list = (List) this.d.get(t99Var);
        return list != null ? list : pu4.a;
    }

    @Override // defpackage.im3
    public final lnb d(t99 t99Var) {
        return (lnb) this.e.get(t99Var);
    }

    @Override // defpackage.im3
    public final Set e() {
        return this.f.keySet();
    }

    @Override // defpackage.im3
    public final Set f() {
        ve5 ve5Var = new ve5(new td0(1, this.a.b()), true, this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ue5 ue5Var = new ue5(ve5Var);
        while (ue5Var.hasNext()) {
            linkedHashSet.add(((lnb) ue5Var.next()).c());
        }
        return linkedHashSet;
    }
}
