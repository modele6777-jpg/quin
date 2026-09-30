package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mbg implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nbg b;
    public final /* synthetic */ q8c c;

    public /* synthetic */ mbg(nbg nbgVar, q8c q8cVar, int i) {
        this.a = i;
        this.b = nbgVar;
        this.c = q8cVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        q8c q8cVar = this.c;
        nbg nbgVar = this.b;
        kd0 kd0Var = (kd0) obj;
        switch (i) {
            case 0:
                kd0Var.getClass();
                nbgVar.a(q8cVar, kd0Var);
                break;
            default:
                kd0Var.getClass();
                nbgVar.b(q8cVar, kd0Var);
                break;
        }
        return wefVar;
    }
}
