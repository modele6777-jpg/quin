package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class qy3 extends uy3 implements un7 {
    public final lw7 F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy3(xm7 xm7Var, String str, String str2, Object obj) {
        super(xm7Var, str, str2, obj);
        str.getClass();
        str2.getClass();
        oy3 oy3Var = new oy3(this, 0);
        z18 z18Var = z18.b;
        this.F0 = eb3.N(z18Var, oy3Var);
        eb3.N(z18Var, new oy3(this, 1));
    }

    @Override // defpackage.uy3
    public final iy3 J() {
        return (py3) this.F0.getValue();
    }

    @Override // defpackage.wnb
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public qy3 p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        return new qy3(xm7Var, G(), dm7Var);
    }

    @Override // defpackage.wn7
    public final qn7 b() {
        return (py3) this.F0.getValue();
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return get(obj);
    }

    @Override // defpackage.un7
    public final Object get(Object obj) {
        return ((py3) this.F0.getValue()).call(obj);
    }

    @Override // defpackage.wn7
    public final tn7 b() {
        return (py3) this.F0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy3(xm7 xm7Var, wxa wxaVar, dm7 dm7Var) {
        super(xm7Var, wxaVar, dm7Var);
        xm7Var.getClass();
        dm7Var.getClass();
        oy3 oy3Var = new oy3(this, 0);
        z18 z18Var = z18.b;
        this.F0 = eb3.N(z18Var, oy3Var);
        eb3.N(z18Var, new oy3(this, 1));
    }
}
