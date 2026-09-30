package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hc implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hc(long j, x16 x16Var, boolean z) {
        this.b = z;
        this.c = j;
        this.d = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                lc.s(this.b, (Integer) obj3, this.c, (l46) obj, k99.P(1));
                break;
            default:
                x16 x16Var = (x16) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    c8b.a(null, this.b, false, this.c, x16Var, l46Var, 384, 1);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ hc(boolean z, Integer num, long j, int i) {
        this.b = z;
        this.d = num;
        this.c = j;
    }
}
