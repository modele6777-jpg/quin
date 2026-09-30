package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ycd extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        ycd ycdVar = new ycd(3, (xn2) obj3);
        ycdVar.L$0 = (cdd) obj;
        ycdVar.L$1 = (p79) obj2;
        return ycdVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        cdd cddVar = (cdd) this.L$0;
        p79 p79Var = (p79) this.L$1;
        Set setKeySet = p79Var.a().keySet();
        ArrayList arrayList = new ArrayList(t72.u(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((isa) it.next()).a);
        }
        Map<String, ?> all = cddVar.a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = cddVar.b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(bm8.F(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = s72.o1((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        p79 p79Var2 = new p79(new LinkedHashMap(p79Var.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                p79Var2.f(new isa(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                p79Var2.f(new isa(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                p79Var2.f(new isa(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                p79Var2.f(new isa(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                p79Var2.f(new isa(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                p79Var2.f(new isa(str), (Set) value2);
            }
        }
        return new p79(new LinkedHashMap(p79Var2.a()), true);
    }
}
