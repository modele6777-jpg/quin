package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ly3 implements x16 {
    public final /* synthetic */ int a;
    public final ny3 b;

    public /* synthetic */ ly3(ny3 ny3Var, int i) {
        this.a = i;
        this.b = ny3Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        ny3 ny3Var = this.b;
        switch (i) {
            case 0:
                return new my3(ny3Var);
            default:
                return cgg.z(ny3Var, ny3Var.H());
        }
    }
}
