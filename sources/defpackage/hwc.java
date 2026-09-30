package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hwc implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ hwc(x16 x16Var, x16 x16Var2, int i) {
        this.a = i;
        this.b = x16Var;
        this.c = x16Var2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.c;
        x16 x16Var2 = this.b;
        hne hneVar = (hne) obj;
        switch (i) {
            case 0:
                x16Var2.invoke();
                if (x16Var != null ? ((Boolean) x16Var.invoke()).booleanValue() : true) {
                    hneVar.close();
                }
                break;
            default:
                x16Var2.invoke();
                if (x16Var != null ? ((Boolean) x16Var.invoke()).booleanValue() : true) {
                    hneVar.close();
                }
                break;
        }
        return wefVar;
    }
}
