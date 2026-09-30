package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ry3 implements x16 {
    public final /* synthetic */ int a;
    public final ty3 b;

    public /* synthetic */ ry3(ty3 ty3Var, int i) {
        this.a = i;
        this.b = ty3Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        ty3 ty3Var = this.b;
        switch (i) {
            case 0:
                return new sy3(ty3Var);
            default:
                return ty3Var.H();
        }
    }
}
