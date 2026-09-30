package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o1e implements x16 {
    public final /* synthetic */ int a;
    public final p1e b;

    public /* synthetic */ o1e(p1e p1eVar, int i) {
        this.a = i;
        this.b = p1eVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        p1e p1eVar = this.b;
        switch (i) {
            case 0:
                d04 d04Var = p1eVar.b;
                return t72.I(af1.J(d04Var), af1.K(d04Var));
            default:
                return p1eVar.c ? t72.J(af1.I(p1eVar.b)) : pu4.a;
        }
    }
}
