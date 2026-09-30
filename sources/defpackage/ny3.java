package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ny3 extends uy3 implements sn7 {
    public final lw7 F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny3(xm7 xm7Var, wxa wxaVar, dm7 dm7Var) {
        super(xm7Var, wxaVar, dm7Var);
        xm7Var.getClass();
        dm7Var.getClass();
        ly3 ly3Var = new ly3(this, 0);
        z18 z18Var = z18.b;
        this.F0 = eb3.N(z18Var, ly3Var);
        eb3.N(z18Var, new ly3(this, 1));
    }

    @Override // defpackage.uy3
    public final iy3 J() {
        return (my3) this.F0.getValue();
    }

    @Override // defpackage.wnb
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public ny3 p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        return new ny3(xm7Var, G(), dm7Var);
    }

    @Override // defpackage.wn7
    public final qn7 b() {
        return (my3) this.F0.getValue();
    }

    @Override // defpackage.sn7
    public final Object get() {
        return ((my3) this.F0.getValue()).call(new Object[0]);
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return get();
    }

    @Override // defpackage.wn7
    public final rn7 b() {
        return (my3) this.F0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny3(xm7 xm7Var, String str, String str2, Object obj) {
        super(xm7Var, str, str2, obj);
        str.getClass();
        str2.getClass();
        ly3 ly3Var = new ly3(this, 0);
        z18 z18Var = z18.b;
        this.F0 = eb3.N(z18Var, ly3Var);
        eb3.N(z18Var, new ly3(this, 1));
    }
}
