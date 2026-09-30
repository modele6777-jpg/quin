package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ts7 extends jt7 implements hn7 {
    public final lw7 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts7(xm7 xm7Var, String str, Object obj, uq7 uq7Var, dm7 dm7Var) {
        super(xm7Var, str, obj, uq7Var, dm7Var);
        xm7Var.getClass();
        str.getClass();
        uq7Var.getClass();
        dm7Var.getClass();
        this.X = eb3.N(z18.b, new wj7(4, this));
    }

    @Override // defpackage.in7
    public final dn7 c() {
        return (ss7) this.X.getValue();
    }

    @Override // defpackage.jt7, defpackage.wnb
    public final wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        return new ts7(xm7Var, this.d, ga1.NO_RECEIVER, this.f, dm7Var);
    }

    @Override // defpackage.hn7
    public final void v(Object obj, Object obj2) {
        ((ss7) this.X.getValue()).call(obj, obj2);
    }

    @Override // defpackage.hn7, defpackage.in7
    public final gn7 c() {
        return (ss7) this.X.getValue();
    }
}
