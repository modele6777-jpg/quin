package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lvd implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ale b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ suc d;
    public final /* synthetic */ a26 e;

    public /* synthetic */ lvd(ale aleVar, boolean z, suc sucVar, a26 a26Var, int i) {
        this.a = i;
        this.b = aleVar;
        this.c = z;
        this.d = sucVar;
        this.e = a26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    ale aleVar = this.b;
                    int iE = aleVar.e();
                    ale.a.getClass();
                    int iK = pzd.k(iE);
                    suc sucVar = this.d;
                    ruc rucVar = sucVar instanceof ruc ? (ruc) sucVar : null;
                    boolean z = (rucVar != null ? rucVar.a : null) == aleVar;
                    a26 a26Var = this.e;
                    boolean zG = l46Var.g(a26Var) | l46Var.e(aleVar.ordinal());
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        objR = new ykc(13, a26Var, aleVar);
                        l46Var.p0(objR);
                    }
                    q7c.e(null, aleVar, false, iK, this.c, z, (x16) objR, l46Var, 0, 9);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    jgb.C(null, false, null, af1.b0(-2146287382, new lvd(this.b, this.c, this.d, this.e, 0), l46Var2), l46Var2, 3072, 7);
                }
                break;
        }
        return wefVar;
    }
}
