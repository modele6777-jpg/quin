package defpackage;

import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l73 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ DailyFortuneGuideTrigger b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ x16 e;

    public /* synthetic */ l73(DailyFortuneGuideTrigger dailyFortuneGuideTrigger, a26 a26Var, x16 x16Var, x16 x16Var2) {
        this.b = dailyFortuneGuideTrigger;
        this.c = a26Var;
        this.d = x16Var;
        this.e = x16Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    a26 a26Var = this.c;
                    boolean zI = l46Var.i(a26Var);
                    Object objR = l46Var.R();
                    if (zI || objR == sf2.a) {
                        objR = new m73(null, a26Var);
                        l46Var.p0(objR);
                    }
                    DailyFortuneGuideTrigger dailyFortuneGuideTrigger = this.b;
                    af1.o((l26) objR, l46Var, dailyFortuneGuideTrigger);
                    j09 j09VarA0 = ynb.a0(b.c, 12.0f, 32.0f);
                    xn8 xn8VarC = s21.c(ndb.w, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarA0);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    nk8.g(dailyFortuneGuideTrigger, this.d, this.e, b.q(0.0f, 369.0f, g09.a, 1), l46Var, 3072);
                    l46Var.r(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                tm7.c(this.b, this.c, this.d, this.e, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ l73(DailyFortuneGuideTrigger dailyFortuneGuideTrigger, a26 a26Var, x16 x16Var, x16 x16Var2, int i) {
        this.b = dailyFortuneGuideTrigger;
        this.c = a26Var;
        this.d = x16Var;
        this.e = x16Var2;
    }
}
