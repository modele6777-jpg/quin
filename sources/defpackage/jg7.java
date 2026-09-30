package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jg7 extends pl1 {
    public final rg7 w;

    public jg7(xn2 xn2Var, rg7 rg7Var) {
        super(1, xn2Var);
        this.w = rg7Var;
    }

    @Override // defpackage.pl1
    public final String C() {
        return "AwaitContinuation";
    }

    @Override // defpackage.pl1
    public final Throwable s(rg7 rg7Var) {
        Throwable thC;
        Object objK = this.w.K();
        if (!(objK instanceof lg7) || (thC = ((lg7) objK).c()) == null) {
            return objK instanceof eb2 ? ((eb2) objK).a : rg7Var.N();
        }
        return thC;
    }
}
