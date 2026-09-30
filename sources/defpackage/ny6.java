package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ny6 implements Map, Serializable {
    private static final long serialVersionUID = 912559;
    public transient apb a;
    public transient bpb b;
    public transient cpb c;

    public static os b() {
        return new os(4);
    }

    public static ny6 c(Map map) {
        if ((map instanceof ny6) && !(map instanceof SortedMap)) {
            return (ny6) map;
        }
        Set setEntrySet = map.entrySet();
        os osVar = new os(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        osVar.r(setEntrySet);
        return osVar.e(true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ry6 entrySet() {
        apb apbVar = this.a;
        if (apbVar != null) {
            return apbVar;
        }
        dpb dpbVar = (dpb) this;
        apb apbVar2 = new apb(dpbVar, dpbVar.e, dpbVar.f);
        this.a = apbVar2;
        return apbVar2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ry6 keySet() {
        bpb bpbVar = this.b;
        if (bpbVar != null) {
            return bpbVar;
        }
        dpb dpbVar = (dpb) this;
        bpb bpbVar2 = new bpb(dpbVar, new cpb(dpbVar.e, 0, dpbVar.f));
        this.b = bpbVar2;
        return bpbVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return if9.t(this, obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ay6 values() {
        cpb cpbVar = this.c;
        if (cpbVar != null) {
            return cpbVar;
        }
        dpb dpbVar = (dpb) this;
        cpb cpbVar2 = new cpb(dpbVar.e, 1, dpbVar.f);
        this.c = cpbVar2;
        return cpbVar2;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return aic.l(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((dpb) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((dpb) this).f;
        ynb.D(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        gff it = ((apb) entrySet()).iterator();
        boolean z = true;
        while (true) {
            ey6 ey6Var = (ey6) it;
            if (!ey6Var.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) ey6Var.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }

    public Object writeReplace() {
        return new my6(this);
    }
}
