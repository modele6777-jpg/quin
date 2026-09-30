package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zuc implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ qwc c;
    public final /* synthetic */ dd2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ zuc(j09 j09Var, qwc qwcVar, dd2 dd2Var, int i) {
        this.b = j09Var;
        this.c = qwcVar;
        this.d = dd2Var;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        dd2 dd2Var = this.d;
        qwc qwcVar = this.c;
        j09 j09Var = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fbc.c(qwcVar, j09Var, dd2Var, l46Var, k99.P(i2 | 1));
                break;
            default:
                fbc.b(j09Var, qwcVar, dd2Var, l46Var, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ zuc(qwc qwcVar, j09 j09Var, dd2 dd2Var, int i) {
        this.c = qwcVar;
        this.b = j09Var;
        this.d = dd2Var;
        this.e = i;
    }
}
