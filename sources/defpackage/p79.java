package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p79 {
    public final LinkedHashMap a;
    public final m6c b;

    public p79(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new m6c(z);
    }

    public final Map a() {
        iy9 iy9Var;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iF = bm8.F(t72.u(setEntrySet, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                iy9Var = new iy9(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                iy9Var = new iy9(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(iy9Var.d(), iy9Var.e());
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.b).get()) {
            qc0.p("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(isa isaVar) {
        isaVar.getClass();
        Object obj = this.a.get(isaVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d(isa isaVar) {
        isaVar.getClass();
        b();
        this.a.remove(isaVar);
    }

    public final void e(isa isaVar, Object obj) {
        isaVar.getClass();
        f(isaVar, obj);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zT;
        if (obj instanceof p79) {
            LinkedHashMap linkedHashMap = ((p79) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zT = pa7.t(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zT = true;
                                } else {
                                    zT = false;
                                }
                            } else {
                                zT = false;
                            }
                            if (!zT) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(isa isaVar, Object obj) {
        isaVar.getClass();
        b();
        if (obj == null) {
            d(isaVar);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(s72.o1((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(isaVar, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(isaVar, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(isaVar, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return s72.D0(this.a.entrySet(), ",\n", "{\n", "\n}", new d59(2), 24);
    }

    public /* synthetic */ p79(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
