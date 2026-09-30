package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ox3 implements x16 {
    public final /* synthetic */ int a;
    public final rx3 b;

    public /* synthetic */ ox3(rx3 rx3Var, int i) {
        this.a = i;
        this.b = rx3Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        rx3 rx3Var = this.b;
        switch (i) {
            case 0:
                return sqf.d(rx3Var.G());
            case 1:
                return rx3Var.y(true);
            default:
                return ynb.Q(rx3Var) ? rx3Var.y(false) : rx3Var.a();
        }
    }
}
