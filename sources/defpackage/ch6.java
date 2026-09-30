package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ch6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kmb b;
    public final /* synthetic */ kmb c;

    public /* synthetic */ ch6(kmb kmbVar, kmb kmbVar2, int i) {
        this.a = i;
        this.b = kmbVar;
        this.c = kmbVar2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        kmb kmbVar = this.c;
        kmb kmbVar2 = this.b;
        um8 um8Var = (um8) obj;
        switch (i) {
            case 0:
                if (kmbVar2.element == -1) {
                    kmbVar2.element = um8Var.b().a;
                }
                kmbVar.element = um8Var.b().b + 1;
                break;
            default:
                if (kmbVar2.element == -1) {
                    kmbVar2.element = um8Var.b().a;
                }
                kmbVar.element = um8Var.b().b + 1;
                break;
        }
        return "";
    }
}
