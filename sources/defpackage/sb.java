package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sb implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public /* synthetic */ sb(String str, long j) {
        this.a = 2;
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        long j = this.c;
        String str = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                lc.i(str, j, (l46) obj, k99.P(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                hkg.O(str, j, (l46) obj, k99.P(1));
                break;
            default:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09VarA0 = ynb.a0(g09.a, 8.0f, 4.0f);
                    mue mueVar = pue.a;
                    nte.b(this.b, j09VarA0, this.c, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.i(l46Var), l46Var, 48, 0, 130040);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ sb(int i, int i2, long j, String str) {
        this.a = i2;
        this.b = str;
        this.c = j;
    }
}
