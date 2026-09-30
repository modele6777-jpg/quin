package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f9a extends p3 {
    public final /* synthetic */ int a;
    public final o3 b;

    public /* synthetic */ f9a(o3 o3Var, int i) {
        this.a = i;
        this.b = o3Var;
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
        int i = this.a;
        o3 o3Var = this.b;
        switch (i) {
            case 0:
                return ((y8a) o3Var).containsKey(obj);
            default:
                return ((s9a) o3Var).d.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        o3 o3Var = this.b;
        switch (i) {
            case 0:
                y8a y8aVar = (y8a) o3Var;
                q4f[] q4fVarArr = new q4f[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    q4fVarArr[i2] = new r4f(1);
                }
                return new g9a(y8aVar, q4fVarArr);
            default:
                return new t9a((s9a) o3Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        o3 o3Var = this.b;
        switch (i) {
            case 0:
                y8a y8aVar = (y8a) o3Var;
                if (!y8aVar.containsKey(obj)) {
                    return false;
                }
                y8aVar.remove(obj);
                return true;
            default:
                s9a s9aVar = (s9a) o3Var;
                if (!s9aVar.d.containsKey(obj)) {
                    return false;
                }
                s9aVar.remove(obj);
                return true;
        }
    }
}
