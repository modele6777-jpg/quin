package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cz7 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke6 b;
    public final /* synthetic */ kz7 c;

    public /* synthetic */ cz7(ke6 ke6Var, kz7 kz7Var, int i) {
        this.a = i;
        this.b = ke6Var;
        this.c = kz7Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        kz7 kz7Var = this.c;
        ke6 ke6Var = this.b;
        jx jxVar = (jx) obj;
        switch (i) {
            case 0:
                ke6Var.f(((Number) jxVar.e()).floatValue());
                kz7Var.c.invoke();
                break;
            default:
                ke6Var.f(((Number) jxVar.e()).floatValue());
                kz7Var.c.invoke();
                break;
        }
        return wefVar;
    }
}
