package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c9a extends p3 {
    public final /* synthetic */ int a;
    public final o3 b;

    public /* synthetic */ c9a(o3 o3Var, int i) {
        this.a = i;
        this.b = o3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.p3
    public final int c() {
        int i = this.a;
        o3 o3Var = this.b;
        switch (i) {
            case 0:
                return ((y8a) o3Var).f;
            default:
                return ((s9a) o3Var).d.d();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        o3 o3Var = this.b;
        switch (i) {
            case 0:
                ((y8a) o3Var).clear();
                break;
            default:
                ((s9a) o3Var).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int i = this.a;
        o3 o3Var = this.b;
        switch (i) {
            case 0:
                y8a y8aVar = (y8a) o3Var;
                Object obj2 = y8aVar.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !y8aVar.containsKey(entry.getKey())) {
                    return false;
                }
                break;
            default:
                s9a s9aVar = (s9a) o3Var;
                Object obj3 = s9aVar.get(entry.getKey());
                if (obj3 != null) {
                    return obj3.equals(entry.getValue());
                }
                if (entry.getValue() != null) {
                    return false;
                }
                if (!s9aVar.d.containsKey(entry.getKey())) {
                    return false;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        o3 o3Var = this.b;
        switch (i) {
            case 0:
                return new e9a((y8a) o3Var);
            default:
                return new t9a((s9a) o3Var, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int i = this.a;
        o3 o3Var = this.b;
        switch (i) {
            case 0:
                return ((y8a) o3Var).remove(entry.getKey(), entry.getValue());
            default:
                return ((s9a) o3Var).remove(entry.getKey(), entry.getValue());
        }
    }
}
