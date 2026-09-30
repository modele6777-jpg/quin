package defpackage;

import io.sentry.android.core.b1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u5c {
    public final LinkedHashMap a;

    public u5c(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(nv8 nv8Var) {
        nv8Var.getClass();
        int i = nv8Var.a;
        int i2 = nv8Var.b;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            b1.l("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + nv8Var);
        }
        treeMap2.put(Integer.valueOf(i2), nv8Var);
    }

    public nzd b(tag tagVar) {
        tagVar.getClass();
        return (nzd) this.a.remove(tagVar);
    }

    public List c(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (pa7.t(((tag) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((tag) it.next());
        }
        return s72.j1(linkedHashMap.values());
    }

    public nzd d(tag tagVar) {
        LinkedHashMap linkedHashMap = this.a;
        Object nzdVar = linkedHashMap.get(tagVar);
        if (nzdVar == null) {
            nzdVar = new nzd(tagVar);
            linkedHashMap.put(tagVar, nzdVar);
        }
        return (nzd) nzdVar;
    }
}
