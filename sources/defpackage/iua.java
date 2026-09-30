package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iua implements x16 {
    public final /* synthetic */ int a;
    public final jua b;

    public /* synthetic */ iua(jua juaVar, int i) {
        this.a = i;
        this.b = juaVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        jua juaVar = this.b;
        switch (i) {
            case 0:
                return jua.g(juaVar);
            default:
                return jua.a(juaVar);
        }
    }
}
