package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ec3 implements Map, cn7 {
    public final Map a = new HashMap();
    public final a26 b;

    public ec3(a26 a26Var) {
        this.b = a26Var;
    }

    @Override // java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return this.a.containsKey(Integer.valueOf(((Number) obj).intValue()));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.a.entrySet();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        int iIntValue = ((Number) obj).intValue();
        Integer numValueOf = Integer.valueOf(iIntValue);
        Map map = this.a;
        Object obj2 = map.get(numValueOf);
        if (obj2 != null) {
            return obj2;
        }
        Object objD = this.b.d(Integer.valueOf(iIntValue));
        map.put(Integer.valueOf(iIntValue), objD);
        return objD;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.a.put(Integer.valueOf(((Number) obj).intValue()), obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        this.a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        return this.a.remove(Integer.valueOf(((Number) obj).intValue()));
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.a.values();
    }
}
