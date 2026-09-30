package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jy3 implements x16 {
    public final /* synthetic */ int a;
    public final ky3 b;

    public /* synthetic */ jy3(ky3 ky3Var, int i) {
        this.a = i;
        this.b = ky3Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        ky3 ky3Var = this.b;
        switch (i) {
            case 0:
                dya dyaVarC = ky3Var.I().G().c();
                return dyaVarC == null ? af1.H(ky3Var.I().G(), hj6.c) : dyaVarC;
            default:
                return an1.o(ky3Var, false);
        }
    }
}
