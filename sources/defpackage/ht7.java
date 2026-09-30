package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ht7 implements x16 {
    public final /* synthetic */ int a;
    public final jt7 b;

    public /* synthetic */ ht7(jt7 jt7Var, int i) {
        this.a = i;
        this.b = jt7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        jt7 jt7Var = this.b;
        switch (i) {
            case 0:
                return new it7(jt7Var);
            default:
                return jt7Var.y();
        }
    }
}
