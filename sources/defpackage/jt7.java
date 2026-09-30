package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class jt7 extends kt7 implements un7 {
    public final lw7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt7(xm7 xm7Var, String str, Object obj, uq7 uq7Var, dm7 dm7Var) {
        super(xm7Var, str, obj, uq7Var, dm7Var);
        xm7Var.getClass();
        str.getClass();
        uq7Var.getClass();
        dm7Var.getClass();
        ht7 ht7Var = new ht7(this, 0);
        z18 z18Var = z18.b;
        this.z = eb3.N(z18Var, ht7Var);
        eb3.N(z18Var, new ht7(this, 1));
    }

    @Override // defpackage.kt7
    public final bt7 F() {
        return (it7) this.z.getValue();
    }

    @Override // defpackage.wn7
    public final qn7 b() {
        return (it7) this.z.getValue();
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return get(obj);
    }

    @Override // defpackage.un7
    public final Object get(Object obj) {
        return ((it7) this.z.getValue()).call(obj);
    }

    @Override // defpackage.wnb
    public wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        return new jt7(xm7Var, this.d, ga1.NO_RECEIVER, this.f, dm7Var);
    }

    @Override // defpackage.wn7
    public final tn7 b() {
        return (it7) this.z.getValue();
    }
}
