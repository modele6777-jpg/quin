package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fs0 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ int d;

    public /* synthetic */ fs0(boolean z, x16 x16Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = x16Var;
        this.d = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        x16 x16Var = this.c;
        wef wefVar = wef.a;
        int i2 = this.d;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                i7h.a(z, x16Var, (l46) obj, k99.P(i2 | 1));
                break;
            case 1:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 0;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else if (!z) {
                    l46Var.f0(828562872);
                    l46Var.r(false);
                } else {
                    l46Var.f0(828374516);
                    pa7.a(null, 0L, 0L, null, af1.b0(-1476355003, new os1(i2, i3), l46Var), null, false, false, this.c, l46Var, 24576, 239);
                    l46Var.r(false);
                }
                break;
            default:
                ((Integer) obj2).intValue();
                v2c.m(z, x16Var, (l46) obj, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }
}
