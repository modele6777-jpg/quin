package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oy3 implements x16 {
    public final /* synthetic */ int a;
    public final qy3 b;

    public /* synthetic */ oy3(qy3 qy3Var, int i) {
        this.a = i;
        this.b = qy3Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        qy3 qy3Var = this.b;
        switch (i) {
            case 0:
                return new py3(qy3Var);
            default:
                return qy3Var.H();
        }
    }
}
