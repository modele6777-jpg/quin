package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class v2 extends AbstractMap {
    public transient t2 a;
    public transient k3 b;
    public final transient Map c;
    public final /* synthetic */ c69 d;

    public v2(c69 c69Var, Map map) {
        this.d = c69Var;
        this.c = map;
    }

    public final by6 b(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        c69 c69Var = this.d;
        return new by6(key, z ? new z2(c69Var, key, list, null) : new d3(c69Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c69 c69Var = this.d;
        if (this.c == c69Var.d) {
            c69Var.d();
            return;
        }
        u2 u2Var = new u2(this);
        while (u2Var.hasNext()) {
            u2Var.next();
            u2Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        t2 t2Var = this.a;
        if (t2Var != null) {
            return t2Var;
        }
        t2 t2Var2 = new t2(this);
        this.a = t2Var2;
        return t2Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        c69 c69Var = this.d;
        return z ? new z2(c69Var, obj, list, null) : new d3(c69Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        c69 c69Var = this.d;
        Set set = c69Var.a;
        if (set != null) {
            return set;
        }
        Set setC = c69Var.c();
        c69Var.a = setC;
        return setC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        c69 c69Var = this.d;
        List list = (List) c69Var.f.get();
        list.addAll(collection);
        c69Var.e -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        k3 k3Var = this.b;
        if (k3Var != null) {
            return k3Var;
        }
        k3 k3Var2 = new k3(this);
        this.b = k3Var2;
        return k3Var2;
    }
}
