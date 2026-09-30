package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fv9 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx9 b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ fv9(bx9 bx9Var, x16 x16Var, x16 x16Var2, int i) {
        this.a = i;
        this.b = bx9Var;
        this.c = x16Var;
        this.d = x16Var2;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.d;
        x16 x16Var2 = this.c;
        bx9 bx9Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    jgb.g(null, ynb.q(0.0f, 24.0f, 1), af1.b0(-1254774582, new fv9(bx9Var, x16Var2, x16Var, i2), l46Var), l46Var, 432);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    x57.i(0, x16Var2, x16Var, l46Var2, ynb.Y(g09.a, bx9Var));
                }
                break;
        }
        return wefVar;
    }
}
