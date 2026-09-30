package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb0 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ qb0(long j, x16 x16Var, boolean z, boolean z2, int i) {
        this.b = j;
        this.c = x16Var;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else if (!this.d) {
                    l46Var.f0(-1276570612);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1276896391);
                    bm8.h(this.c, null, this.e, if9.z(0L, this.b, l46Var, 13), null, vfh.c, l46Var, 1572864, 50);
                    l46Var.r(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                zz8.c(this.b, this.c, this.d, this.e, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ qb0(boolean z, x16 x16Var, boolean z2, long j) {
        this.d = z;
        this.c = x16Var;
        this.e = z2;
        this.b = j;
    }
}
