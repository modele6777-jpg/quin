package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ve7 implements x16 {
    public final /* synthetic */ int a;
    public final we7 b;

    public /* synthetic */ ve7(we7 we7Var, int i) {
        this.a = i;
        this.b = we7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        we7 we7Var = this.b;
        switch (i) {
            case 0:
                return rxg.C(we7Var, true);
            case 1:
                return ynb.Q(we7Var) ? rxg.C(we7Var, false) : we7Var.a();
            default:
                return vpf.W(we7Var.F(), we7Var);
        }
    }
}
