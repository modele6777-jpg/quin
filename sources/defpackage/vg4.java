package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vg4 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ int f;

    public /* synthetic */ vg4(boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = x16Var;
        this.d = x16Var2;
        this.e = x16Var3;
        this.f = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                if9.f(this.b, this.c, this.d, this.e, (l46) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                x57.y(this.b, this.c, this.d, this.e, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }
}
