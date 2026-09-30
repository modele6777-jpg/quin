package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class knc implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ knc(String str, int i) {
        this.a = 0;
        this.b = str;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                onc.d(this.b, (l46) obj, k99.P(7));
                break;
            case 1:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    mue mueVar = oue.a;
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var), l46Var, 0, 0, 131070);
                }
                break;
            case 2:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    j09 j09VarA0 = ynb.a0(g09Var, 24.0f, 14.0f);
                    mue mueVar2 = pue.a;
                    nte.b(this.b, j09VarA0, ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var2, 48, 0, 131064);
                }
                break;
            default:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    nte.b(this.b, ynb.a0(g09Var, 24.0f, 16.0f), 0L, w6c.l(17), ar5.b, cr5.h, w6c.k(0.1d), null, null, w6c.l(27), 0, false, 0, 0, null, null, l46Var3, 102260736, 48, 259628);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ knc(String str, int i, byte b) {
        this.a = i;
        this.b = str;
    }
}
