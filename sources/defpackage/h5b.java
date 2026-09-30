package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h5b implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ j09 d;

    public /* synthetic */ h5b(float f, float f2, j09 j09Var, int i) {
        this.b = f;
        this.c = f2;
        this.d = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        j09 j09Var = this.d;
        float f = this.c;
        float f2 = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vfh.m(f2, f, k99.P(49), l46Var, j09Var);
                break;
            default:
                h4g.b(f2, f, k99.P(1), l46Var, j09Var);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ h5b(float f, j09 j09Var, float f2, int i) {
        this.b = f;
        this.d = j09Var;
        this.c = f2;
    }
}
