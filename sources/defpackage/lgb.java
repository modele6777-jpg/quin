package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lgb implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lhb b;

    public /* synthetic */ lgb(lhb lhbVar, int i) {
        this.a = i;
        this.b = lhbVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        lhb lhbVar = this.b;
        switch (i) {
            case 0:
                ste steVar = (ste) obj;
                steVar.getClass();
                lhbVar.b.setValue(steVar);
                break;
            case 1:
                ste steVar2 = (ste) obj;
                steVar2.getClass();
                lhbVar.b.setValue(steVar2);
                break;
            default:
                bv7 bv7Var = (bv7) obj;
                bv7Var.getClass();
                lhbVar.a.setValue(bv7Var);
                break;
        }
        return wefVar;
    }
}
