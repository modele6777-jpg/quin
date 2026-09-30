package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xv0 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yte b;

    public /* synthetic */ xv0(yte yteVar, int i) {
        this.a = i;
        this.b = yteVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = 2;
        yte yteVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(yteVar != null ? ((Boolean) new xv0(yteVar, i2).invoke()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(yteVar != null ? ((Boolean) new xv0(yteVar, i2).invoke()).booleanValue() : false);
            default:
                k00 k00Var = yteVar.b;
                ste steVar = (ste) yteVar.a.getValue();
                return Boolean.valueOf(pa7.t(k00Var, steVar != null ? steVar.a.a : null));
        }
    }
}
