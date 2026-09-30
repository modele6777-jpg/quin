package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y47 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z47 b;

    public /* synthetic */ y47(z47 z47Var, int i) {
        this.a = i;
        this.b = z47Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        z47 z47Var = this.b;
        i4f i4fVar = (i4f) obj;
        switch (i) {
            case 0:
                i4fVar.getClass();
                z47 z47Var2 = (z47) i4fVar;
                g7g g7gVar = z47Var.E0;
                if (!pa7.t(z47Var2.Z, g7gVar)) {
                    z47Var2.Z = g7gVar;
                    z47Var2.m1();
                }
                return h4f.b;
            default:
                i4fVar.getClass();
                z47Var.Z = ((z47) i4fVar).E0;
                return Boolean.FALSE;
        }
    }
}
