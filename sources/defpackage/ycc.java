package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ycc {
    public final LinkedHashMap a;
    public final a82 b;

    public ycc() {
        this.a = new LinkedHashMap();
        this.b = new a82(qu4.a);
    }

    public final Object a(String str) {
        Object value;
        a82 a82Var = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) a82Var.c;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) a82Var.e;
        try {
            h89 h89Var = (h89) linkedHashMap2.get(str);
            if (h89Var != null && (value = ((s0e) h89Var).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) a82Var.b).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final whb b(String str, Boolean bool) {
        a82 a82Var = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) a82Var.e;
        boolean zContainsKey = linkedHashMap.containsKey(str);
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) a82Var.c;
        if (zContainsKey) {
            Object objA = linkedHashMap.get(str);
            if (objA == null) {
                if (!linkedHashMap2.containsKey(str)) {
                    linkedHashMap2.put(str, bool);
                }
                objA = t0e.a(linkedHashMap2.get(str));
                linkedHashMap.put(str, objA);
            }
            return if9.n((h89) objA);
        }
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) a82Var.b;
        Object objA2 = linkedHashMap3.get(str);
        if (objA2 == null) {
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, bool);
            }
            objA2 = t0e.a(linkedHashMap2.get(str));
            linkedHashMap3.put(str, objA2);
        }
        return if9.n((h89) objA2);
    }

    public final Object c(String str) {
        a82 a82Var = this.b;
        Object objRemove = ((LinkedHashMap) a82Var.c).remove(str);
        ((LinkedHashMap) a82Var.b).remove(str);
        ((LinkedHashMap) a82Var.e).remove(str);
        if (this.a.remove(str) == null) {
            return objRemove;
        }
        r3.f();
        return null;
    }

    public final void d(String str, Serializable serializable) {
        str.getClass();
        if (serializable != null) {
            List list = adc.a;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!((Class) it.next()).isInstance(serializable));
            }
            cva.u(serializable.getClass(), " into saved state", "Can't put value with type ");
            return;
        }
        List list2 = adc.a;
        Object obj = this.a.get(str);
        v69 v69Var = obj instanceof v69 ? (v69) obj : null;
        if (v69Var != null) {
            v69Var.k(serializable);
        }
        this.b.O(serializable, str);
    }

    public ycc(fl8 fl8Var) {
        this.a = new LinkedHashMap();
        this.b = new a82(fl8Var);
    }
}
