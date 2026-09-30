package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class goa implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ soa b;

    public /* synthetic */ goa(soa soaVar, int i) {
        this.a = i;
        this.b = soaVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        soa soaVar = this.b;
        switch (i) {
            case 0:
                soaVar.v.k(((Integer) obj).intValue());
                break;
            default:
                Float f = (Float) obj;
                f.getClass();
                soaVar.w.setValue(f);
                break;
        }
        return wefVar;
    }
}
