package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class om4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw2 b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ om4(aw2 aw2Var, e89 e89Var, int i) {
        this.a = i;
        this.b = aw2Var;
        this.c = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        aw2 aw2Var = this.b;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                e89Var.setValue(Boolean.FALSE);
                if (zBooleanValue) {
                    ynb.V(aw2Var, null, null, new in4(2, null), 3);
                }
                break;
            default:
                e89Var.setValue(Boolean.FALSE);
                if (zBooleanValue) {
                    ynb.V(aw2Var, null, null, new zm4(2, null), 3);
                }
                break;
        }
        return wefVar;
    }
}
