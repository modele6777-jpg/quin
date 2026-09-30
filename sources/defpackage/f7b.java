package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f7b implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ f7b(int i, a26 a26Var, boolean z) {
        this.a = i;
        this.b = z;
        this.c = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        a26 a26Var = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                ale aleVar = (ale) obj;
                if (!z && aleVar != null) {
                    a26Var.d(aleVar);
                }
                return wef.a;
            default:
                ((ra4) obj).getClass();
                return new o6d(a26Var, z);
        }
    }
}
