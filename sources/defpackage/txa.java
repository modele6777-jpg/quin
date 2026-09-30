package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class txa implements ze0 {
    public final hn7 a;
    public final String b;

    public txa(hn7 hn7Var, String str) {
        str.getClass();
        this.a = hn7Var;
        this.b = str;
    }

    public final Object a(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        qc0.p(ks0.l(new StringBuilder("Field "), this.b, " is not set"));
        return null;
    }

    @Override // defpackage.ze0
    public final Object e(Object obj, Object obj2) {
        hn7 hn7Var = this.a;
        Object obj3 = hn7Var.get(obj);
        if (obj3 == null) {
            hn7Var.v(obj, obj2);
            return null;
        }
        if (obj3.equals(obj2)) {
            return null;
        }
        return obj3;
    }
}
