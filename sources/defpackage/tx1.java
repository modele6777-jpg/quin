package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx1 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ x16 e;

    public /* synthetic */ tx1(j09 j09Var, String str, String str2, x16 x16Var, int i) {
        this.b = j09Var;
        this.c = str;
        this.d = str2;
        this.e = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                jgb.h(k99.P(1), this.e, (l46) obj, this.b, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                vd0.D(k99.P(7), this.e, (l46) obj, this.b, this.c, this.d);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ tx1(String str, String str2, j09 j09Var, x16 x16Var, int i) {
        this.c = str;
        this.d = str2;
        this.b = j09Var;
        this.e = x16Var;
    }
}
