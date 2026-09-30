package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class la2 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ na2 b;

    public /* synthetic */ la2(na2 na2Var, int i) {
        this.a = i;
        this.b = na2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        na2 na2Var = this.b;
        switch (i) {
            case 0:
                na2Var.clear();
                break;
            default:
                na2Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        na2 na2Var = this.b;
        switch (i) {
            case 0:
                Map mapC = na2Var.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = na2Var.e(entry.getKey());
                    if (iE != -1 && ok8.t(na2Var.m()[iE], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return na2Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        na2 na2Var = this.b;
        switch (i) {
            case 0:
                Map mapC = na2Var.c();
                return mapC != null ? mapC.entrySet().iterator() : new ka2(na2Var, 1);
            default:
                Map mapC2 = na2Var.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new ka2(na2Var, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        na2 na2Var = this.b;
        switch (i) {
            case 0:
                Map mapC = na2Var.c();
                if (mapC != null) {
                    return mapC.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (na2Var.i()) {
                    return false;
                }
                int iD = na2Var.d();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = na2Var.a;
                Objects.requireNonNull(obj2);
                int iO = rxg.O(key, value, iD, obj2, na2Var.k(), na2Var.l(), na2Var.m());
                if (iO == -1) {
                    return false;
                }
                na2Var.h(iO, iD);
                na2Var.f--;
                na2Var.e += 32;
                return true;
            default:
                Map mapC2 = na2Var.c();
                if (mapC2 != null) {
                    return mapC2.keySet().remove(obj);
                }
                return na2Var.j(obj) != na2.x;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        na2 na2Var = this.b;
        switch (i) {
            case 0:
                break;
        }
        return na2Var.size();
    }
}
