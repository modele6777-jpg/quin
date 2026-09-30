package defpackage;

import ai.askquin.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zu9 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd4 b;
    public final /* synthetic */ pp5 c;
    public final /* synthetic */ l26 d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ zu9(bd4 bd4Var, pp5 pp5Var, l26 l26Var, boolean z, int i) {
        this.a = i;
        this.b = bd4Var;
        this.c = pp5Var;
        this.d = l26Var;
        this.e = z;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    jgb.C(null, false, ynb.q(24.0f, 0.0f, 2), af1.b0(836234245, new zu9(this.b, this.c, this.d, this.e, 1), l46Var), l46Var, 3456, 3);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    vd0.l(432, af1.b0(273889162, new zu9(this.b, this.c, this.d, this.e, 2), l46Var2), l46Var2, null, false);
                }
                break;
            default:
                d92 d92Var = (d92) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                d92Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.g(d92Var) ? 4 : 2;
                }
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    l46Var3.Z();
                } else {
                    vd0.q(d92Var, null, afc.q(R.string.overview_deck, l46Var3), l46Var3, iIntValue3 & 14, 1);
                    ad4 ad4Var = (ad4) this.b.b;
                    List list = this.c.c;
                    bx9 bx9VarQ = ynb.q(0.0f, 0.0f, 3);
                    l26 l26Var = this.d;
                    boolean z = this.e;
                    beb.b(bx9VarQ, ad4Var, l26Var, z, z, list, l46Var3, 1572870, 0);
                }
                break;
        }
        return wefVar;
    }
}
