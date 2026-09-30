package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yu9 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd4 b;

    public /* synthetic */ yu9(bd4 bd4Var, int i) {
        this.a = i;
        this.b = bd4Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        wxd wxdVar;
        yxd xxdVar;
        int i = this.a;
        wef wefVar = wef.a;
        bd4 bd4Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    jgb.C(null, false, ynb.q(24.0f, 0.0f, 2), af1.b0(-981415936, new yu9(bd4Var, i2), l46Var), l46Var, 3456, 3);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    String strQ = afc.q(R.string.overview_question, l46Var2);
                    String str = ((ad4) bd4Var.b).a.a;
                    String strK = ym8.k(bd4Var);
                    String strF = ym8.F(bd4Var);
                    String strH = ym8.H(bd4Var);
                    String strG = ym8.G(bd4Var);
                    if (strH == null || v4e.Q(strH) || strG == null || v4e.Q(strG)) {
                        if (strF == null || v4e.Q(strF)) {
                            wxdVar = null;
                        } else {
                            xxdVar = new xxd(strF);
                        }
                        vd0.m(strQ, str, strK, xxdVar, l46Var2, 0, 0);
                    } else {
                        wxdVar = new wxd(strH, strG);
                    }
                    xxdVar = wxdVar;
                    vd0.m(strQ, str, strK, xxdVar, l46Var2, 0, 0);
                }
                break;
        }
        return wefVar;
    }
}
