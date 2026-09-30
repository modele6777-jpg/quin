package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i9a extends m3 {
    public final /* synthetic */ int a;
    public final o3 b;

    public /* synthetic */ i9a(o3 o3Var, int i) {
        this.a = i;
        this.b = o3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.m3
    public final int c() {
        int i = this.a;
        o3 o3Var = this.b;
        switch (i) {
            case 0:
                return ((y8a) o3Var).f;
            case 1:
                return ((z8a) o3Var).f;
            default:
                return ((s9a) o3Var).d.d();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.a;
        o3 o3Var = this.b;
        switch (i) {
            case 0:
                ((y8a) o3Var).clear();
                break;
            case 1:
                ((z8a) o3Var).clear();
                break;
            default:
                ((s9a) o3Var).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        o3 o3Var = this.b;
        switch (i) {
            case 0:
                return ((y8a) o3Var).containsValue(obj);
            case 1:
                return ((z8a) o3Var).containsValue(obj);
            default:
                return ((s9a) o3Var).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        int i2 = 0;
        o3 o3Var = this.b;
        switch (i) {
            case 0:
                y8a y8aVar = (y8a) o3Var;
                q4f[] q4fVarArr = new q4f[8];
                while (i2 < 8) {
                    q4fVarArr[i2] = new r4f(2);
                    i2++;
                }
                return new g9a(y8aVar, q4fVarArr);
            case 1:
                z8a z8aVar = (z8a) o3Var;
                q4f[] q4fVarArr2 = new q4f[8];
                while (i2 < 8) {
                    q4fVarArr2[i2] = new s4f(2);
                    i2++;
                }
                return new h9a(z8aVar, q4fVarArr2);
            default:
                return new t9a((s9a) o3Var, 2);
        }
    }
}
