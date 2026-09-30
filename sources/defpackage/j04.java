package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j04 implements x16 {
    public final /* synthetic */ int a;
    public final x16 b;

    public /* synthetic */ j04(int i, x16 x16Var) {
        this.a = i;
        this.b = x16Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        x16 x16Var = this.b;
        switch (i) {
            case 0:
                return s72.o1((Iterable) x16Var.invoke());
            default:
                dr8 dr8Var = (dr8) x16Var.invoke();
                return dr8Var instanceof p18 ? ((p18) dr8Var).h() : dr8Var;
        }
    }
}
