package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class br3 extends vd0 implements Map {
    public final Map E0;

    public br3(Map map) {
        this.E0 = map;
    }

    @Override // defpackage.vd0
    public final Object R() {
        return this.E0;
    }

    @Override // java.util.Map
    public final void clear() {
        this.E0.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.E0.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        am8 am8Var = new am8(entrySet().iterator());
        if (obj == null) {
            while (am8Var.hasNext()) {
                if (am8Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (am8Var.hasNext()) {
            if (obj.equals(am8Var.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return aic.k(this.E0.entrySet(), new ar3(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && if9.t(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.E0.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return aic.l(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.E0;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return aic.k(this.E0.keySet(), new ar3(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.E0.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.E0.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.E0.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.E0;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.E0.values();
    }
}
