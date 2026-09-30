package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g43 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e63 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a26 d;

    public /* synthetic */ g43(e63 e63Var, boolean z, a26 a26Var, int i) {
        this.b = e63Var;
        this.c = z;
        this.d = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        a26 a26Var = this.d;
        boolean z = this.c;
        e63 e63Var = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    String strQ = afc.q(z ? R.string.home_daily_fortune_tomorrow_title : R.string.daily_universe_tarot, l46Var);
                    dd2 dd2VarB0 = af1.b0(245015449, new w7(14, e63Var, a26Var), l46Var);
                    boolean zG = l46Var.g(a26Var);
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        objR = new zh1(a26Var, 4);
                        l46Var.p0(objR);
                    }
                    oa7.c(null, strQ, true, dd2VarB0, (x16) objR, l46Var, 3456, 1);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                dj6.g(e63Var, z, a26Var, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ g43(boolean z, a26 a26Var, e63 e63Var) {
        this.c = z;
        this.d = a26Var;
        this.b = e63Var;
    }
}
