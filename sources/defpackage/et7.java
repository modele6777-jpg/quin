package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class et7 implements x16 {
    public final /* synthetic */ int a;
    public final gt7 b;

    public /* synthetic */ et7(gt7 gt7Var, int i) {
        this.a = i;
        this.b = gt7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        gt7 gt7Var = this.b;
        switch (i) {
            case 0:
                return new ft7(gt7Var);
            default:
                return cgg.z(gt7Var, gt7Var.y());
        }
    }
}
