package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kld implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad4 b;

    public /* synthetic */ kld(ad4 ad4Var, int i) {
        this.a = i;
        this.b = ad4Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        boolean z = true;
        byte b = 0;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    vd0.l(432, af1.b0(1033213188, new kld(this.b, z ? 1 : 0), l46Var), l46Var, null, false);
                }
                break;
            default:
                d92 d92Var = (d92) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                d92Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(d92Var) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                } else {
                    vd0.q(d92Var, null, afc.q(R.string.overview_deck, l46Var2), l46Var2, iIntValue2 & 14, 1);
                    bx9 bx9VarQ = ynb.q(0.0f, 0.0f, 3);
                    Object objR = l46Var2.R();
                    if (objR == sf2.a) {
                        objR = new dxc(8, b);
                        l46Var2.p0(objR);
                    }
                    beb.b(bx9VarQ, this.b, (l26) objR, false, false, null, l46Var2, 1600902, 32);
                }
                break;
        }
        return wefVar;
    }
}
