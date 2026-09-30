package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class le7 implements x16 {
    public final /* synthetic */ int a;
    public final oe7 b;

    public /* synthetic */ le7(oe7 oe7Var, int i) {
        this.a = i;
        this.b = oe7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        oe7 oe7Var = this.b;
        switch (i) {
            case 0:
                em7 em7VarB = job.a.b(lx4.class);
                do7 do7Var = do7.c;
                return qn4.x(em7VarB, t72.H(db6.b0(qn4.x(oe7Var.c, null, false, 7))), false, 6);
            default:
                return new me7(oe7Var);
        }
    }
}
