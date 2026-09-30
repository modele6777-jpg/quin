package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q62 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ c4c b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dd2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ q62(c4c c4cVar, int i, dd2 dd2Var, int i2) {
        this.b = c4cVar;
        this.c = i;
        this.d = dd2Var;
        this.e = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        dd2 dd2Var = this.d;
        int i3 = this.c;
        c4c c4cVar = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                s62.a(k99.P(i3 | 1), i2, dd2Var, l46Var, c4cVar);
                break;
            default:
                t72.f(i3, k99.P(i2 | 1), dd2Var, l46Var, c4cVar);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ q62(c4c c4cVar, dd2 dd2Var, int i, int i2) {
        this.b = c4cVar;
        this.d = dd2Var;
        this.c = i;
        this.e = i2;
    }
}
