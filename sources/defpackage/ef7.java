package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ef7 implements x16 {
    public final /* synthetic */ int a;
    public final xe7 b;

    public /* synthetic */ ef7(xe7 xe7Var, int i) {
        this.a = i;
        this.b = xe7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        xe7 xe7Var = this.b;
        switch (i) {
            case 0:
                return new ps3(xe7Var.e);
            default:
                return i7h.n(xe7Var, false);
        }
    }
}
