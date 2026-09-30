package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d9a extends p3 {
    public final /* synthetic */ int a;
    public final z8a b;

    public /* synthetic */ d9a(int i, z8a z8aVar) {
        this.a = i;
        this.b = z8aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.p3
    public final int c() {
        int i = this.a;
        z8a z8aVar = this.b;
        switch (i) {
            case 0:
                break;
        }
        return z8aVar.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        z8a z8aVar = this.b;
        switch (i) {
            case 0:
                z8aVar.clear();
                break;
            default:
                z8aVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    z8a z8aVar = this.b;
                    Object obj2 = z8aVar.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && z8aVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        z8a z8aVar = this.b;
        switch (i) {
            case 0:
                return new e9a(z8aVar);
            default:
                q4f[] q4fVarArr = new q4f[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    q4fVarArr[i2] = new s4f(1);
                }
                return new h9a(z8aVar, q4fVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.b.remove(entry.getKey(), entry.getValue());
            default:
                z8a z8aVar = this.b;
                if (!z8aVar.containsKey(obj)) {
                    return false;
                }
                z8aVar.remove(obj);
                return true;
        }
    }
}
