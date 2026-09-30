package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ih4 implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ oh4 c;

    public /* synthetic */ ih4(oh4 oh4Var, x16 x16Var) {
        this.c = oh4Var;
        this.b = x16Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                xw9 xw9Var = (xw9) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(xw9Var) ? 4 : 2;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    l46Var.Z();
                } else {
                    kn2.c(this.c, null, null, null, null, null, af1.b0(-1521107249, new p50(3, this.b, xw9Var), l46Var), l46Var, 1572872, 62);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    bm8.h(this.b, null, this.c instanceof nh4, null, null, ok8.c, l46Var2, 1572864, 58);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ih4(x16 x16Var, oh4 oh4Var) {
        this.b = x16Var;
        this.c = oh4Var;
    }
}
