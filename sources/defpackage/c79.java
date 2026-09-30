package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c79 extends kl8 implements bn7 {
    public final e9a d;
    public Object e;

    public c79(e9a e9aVar, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.d = e9aVar;
        this.e = obj2;
    }

    @Override // defpackage.kl8, java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // defpackage.kl8, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        b9a b9aVar = (b9a) this.d.b;
        z8a z8aVar = b9aVar.e;
        Object obj3 = this.b;
        if (!z8aVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z = b9aVar.c;
        if (!z) {
            z8aVar.put(obj3, obj);
        } else {
            if (!z) {
                s8f.c();
                return null;
            }
            q4f q4fVar = ((q4f[]) b9aVar.d)[b9aVar.b];
            Object obj4 = q4fVar.b[q4fVar.d];
            z8aVar.put(obj3, obj);
            b9aVar.f(obj4 != null ? obj4.hashCode() : 0, z8aVar.c, obj4, 0);
        }
        b9aVar.v = z8aVar.e;
        return obj2;
    }
}
