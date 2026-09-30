package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class gt7 extends kt7 implements sn7 {
    public final lw7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt7(xm7 xm7Var, String str, Object obj, uq7 uq7Var, dm7 dm7Var) {
        super(xm7Var, str, obj, uq7Var, dm7Var);
        xm7Var.getClass();
        str.getClass();
        uq7Var.getClass();
        dm7Var.getClass();
        et7 et7Var = new et7(this, 0);
        z18 z18Var = z18.b;
        this.z = eb3.N(z18Var, et7Var);
        eb3.N(z18Var, new et7(this, 1));
    }

    @Override // defpackage.kt7
    public final bt7 F() {
        return (ft7) this.z.getValue();
    }

    @Override // defpackage.wn7
    public final qn7 b() {
        return (ft7) this.z.getValue();
    }

    @Override // defpackage.sn7
    public final Object get() {
        return ((ft7) this.z.getValue()).call(new Object[0]);
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return get();
    }

    @Override // defpackage.wnb
    public wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        return new gt7(xm7Var, this.d, ga1.NO_RECEIVER, this.f, dm7Var);
    }

    @Override // defpackage.wn7
    public final rn7 b() {
        return (ft7) this.z.getValue();
    }
}
