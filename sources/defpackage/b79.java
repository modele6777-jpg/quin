package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b79 extends kl8 implements bn7 {
    public final s9a d;
    public v68 e;
    public final int f;

    public b79(s9a s9aVar, Object obj, v68 v68Var) {
        super(1, obj, v68Var.a);
        this.d = s9aVar;
        this.e = v68Var;
        this.f = s9aVar.d.e;
    }

    @Override // defpackage.kl8, java.util.Map.Entry
    public final Object getValue() {
        return this.e.a;
    }

    @Override // defpackage.kl8, java.util.Map.Entry
    public final Object setValue(Object obj) {
        v68 v68Var = this.e;
        Object obj2 = v68Var.a;
        v68 v68Var2 = new v68(obj, v68Var.b, v68Var.c);
        this.e = v68Var2;
        s9a s9aVar = this.d;
        y8a y8aVar = s9aVar.d;
        int i = y8aVar.e;
        int i2 = this.f;
        Object obj3 = this.b;
        if (i != i2) {
            s9aVar.put(obj3, obj);
            return obj2;
        }
        s9aVar.a = null;
        y8aVar.put(obj3, v68Var2);
        return obj2;
    }
}
