package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v76 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ v76(int i, int i2, long j) {
        this.b = j;
        this.c = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.c;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(1 & iIntValue, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    String strQ = afc.q(i2, l46Var);
                    mue mueVar = oue.a;
                    nte.b(strQ, ynb.a0(g09.a, 6.0f, 2.0f), this.b, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 48, 0, 131064);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                fu6.b(k99.P(1), i2, this.b, (l46) obj);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ v76(int i, long j) {
        this.c = i;
        this.b = j;
    }
}
