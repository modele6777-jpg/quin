package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class czb extends bzb implements w26 {
    private final int arity;

    public czb(int i, xn2 xn2Var) {
        super(xn2Var);
        this.arity = i;
    }

    @Override // defpackage.w26
    public final int getArity() {
        return this.arity;
    }

    @Override // defpackage.pt0
    public final String toString() {
        return l() == null ? job.a.j(this) : super.toString();
    }
}
