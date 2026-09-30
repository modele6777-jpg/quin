package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kn7 implements x16 {
    public final /* synthetic */ int a;
    public final nn7 b;

    public /* synthetic */ kn7(nn7 nn7Var, int i) {
        this.a = i;
        this.b = nn7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        nn7 nn7Var = this.b;
        switch (i) {
            case 0:
                return new mn7(nn7Var);
            default:
                return hkg.g0(nn7Var.b);
        }
    }
}
