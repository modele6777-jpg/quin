package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ct7 implements x16 {
    public final /* synthetic */ int a;
    public final dt7 b;

    public /* synthetic */ ct7(dt7 dt7Var, int i) {
        this.a = i;
        this.b = dt7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                dt7 dt7Var = this.b;
                ar7 ar7Var = dt7Var.F().f.i;
                if (ar7Var == null) {
                    return new ps3(dt7Var.F());
                }
                return new ys7(dt7Var, ar7Var, dt7Var.F().a().size(), on7.d, (g8f) dt7Var.F().x.getValue());
            default:
                return urg.p(this.b, false);
        }
    }
}
