package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ty3 extends uy3 implements vn7 {
    public final lw7 F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty3(xm7 xm7Var, String str, String str2) {
        super(xm7Var, str, str2, ga1.NO_RECEIVER);
        str.getClass();
        str2.getClass();
        ry3 ry3Var = new ry3(this, 0);
        z18 z18Var = z18.b;
        this.F0 = eb3.N(z18Var, ry3Var);
        eb3.N(z18Var, new ry3(this, 1));
    }

    @Override // defpackage.uy3
    public final iy3 J() {
        return (sy3) this.F0.getValue();
    }

    @Override // defpackage.wnb
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public ty3 p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        return new ty3(xm7Var, G(), dm7Var);
    }

    @Override // defpackage.wn7
    public final sy3 b() {
        return (sy3) this.F0.getValue();
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((sy3) this.F0.getValue()).call(obj, obj2);
    }

    @Override // defpackage.wn7
    public final qn7 b() {
        return (sy3) this.F0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty3(xm7 xm7Var, wxa wxaVar, dm7 dm7Var) {
        super(xm7Var, wxaVar, dm7Var);
        xm7Var.getClass();
        dm7Var.getClass();
        ry3 ry3Var = new ry3(this, 0);
        z18 z18Var = z18.b;
        this.F0 = eb3.N(z18Var, ry3Var);
        eb3.N(z18Var, new ry3(this, 1));
    }
}
