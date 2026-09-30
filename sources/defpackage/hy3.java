package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hy3 implements x16 {
    public final /* synthetic */ int a;
    public final iy3 b;

    public /* synthetic */ hy3(iy3 iy3Var, int i) {
        this.a = i;
        this.b = iy3Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        iy3 iy3Var = this.b;
        switch (i) {
            case 0:
                zxa zxaVarB = iy3Var.I().G().b();
                if (zxaVarB != null) {
                    return zxaVarB;
                }
                zxa zxaVarG = af1.G(iy3Var.I().G(), hj6.c);
                zxaVarG.F0(iy3Var.I().G().getType());
                return zxaVarG;
            default:
                return an1.o(iy3Var, true);
        }
    }
}
