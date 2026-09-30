package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class le0 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ le0(boolean z, boolean z2, int i) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        long j;
        long j2;
        int i = this.a;
        wef wefVar = wef.a;
        boolean z = this.c;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    gx6 gx6VarY = z2 ? ok8.y() : af1.X();
                    if (z) {
                        l46Var.f0(754716780);
                        j = ((e8b) l46Var.k(l8b.a)).t;
                    } else {
                        l46Var.f0(754717768);
                        j = ((e8b) l46Var.k(l8b.a)).q;
                    }
                    l46Var.r(false);
                    gu6.a(gx6VarY, null, null, j, l46Var, 48, 4);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else if (!z2) {
                    l46Var2.f0(-1244159449);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1244452554);
                    if (z) {
                        l46Var2.f0(-1244313426);
                        l46Var2.r(false);
                        j2 = zk3.a;
                    } else {
                        l46Var2.f0(-1244250620);
                        j2 = ((m82) l46Var2.k(o82.a)).a;
                        l46Var2.r(false);
                    }
                    lmg.I(null, 3, 5, 0.0f, 0.0f, j2, l46Var2, 432, 25);
                    l46Var2.r(false);
                }
                break;
        }
        return wefVar;
    }
}
