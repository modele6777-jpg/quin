package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xr2 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr2 b;
    public final /* synthetic */ kzd c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ xr2(tr2 tr2Var, kzd kzdVar, x16 x16Var, int i) {
        this.a = 2;
        this.b = tr2Var;
        this.c = kzdVar;
        this.d = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        x16 x16Var = this.d;
        kzd kzdVar = this.c;
        tr2 tr2Var = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    Object objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = new pg2(29);
                        l46Var.p0(objR);
                    }
                    mh3.S(null, (x16) objR, l46Var, 48, 1);
                    gu8.b(null, af1.b0(2050077564, new xr2(this.b, this.c, this.d, 1, (byte) 0), l46Var), l46Var, 48);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    int i2 = kzd.e;
                    lt2.a(tr2Var, kzdVar, x16Var, l46Var2, 520);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                lt2.a(tr2Var, kzdVar, x16Var, (l46) obj, k99.P(521));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ xr2(tr2 tr2Var, kzd kzdVar, x16 x16Var, int i, byte b) {
        this.a = i;
        this.b = tr2Var;
        this.c = kzdVar;
        this.d = x16Var;
    }
}
