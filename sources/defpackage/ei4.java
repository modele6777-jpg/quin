package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ei4 implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ ei4(x16 x16Var, x16 x16Var2, boolean z) {
        this.b = x16Var;
        this.d = x16Var2;
        this.c = z;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    xdc.a(b.c, af1.b0(2026116834, new m(29, x16Var), l46Var), af1.b0(985824995, new fi4(i2, this.d), l46Var), null, null, 0, y72.j, 0L, null, af1.b0(1995969453, new g8(this.c, 4), l46Var), l46Var, 806879670, 440);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    j09 j09VarC = b.c(g09.a, 1.0f);
                    t7c t7cVarA = s7c.a(xc0.g, ndb.z, l46Var2, 54);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarC);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, t7cVarA);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    if (x16Var == null) {
                        l46Var2.f0(809739093);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(809739094);
                        xxb.g(0, x16Var, l46Var2, null, afc.q(R.string.text_prev_step, l46Var2));
                        l46Var2.r(false);
                    }
                    o5c.f(l46Var2, new jw7(1.0f, true));
                    xxb.f(0, this.d, l46Var2, null, afc.q(R.string.annual_continue, l46Var2), this.c);
                    l46Var2.r(true);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ei4(x16 x16Var, boolean z, x16 x16Var2) {
        this.b = x16Var;
        this.c = z;
        this.d = x16Var2;
    }
}
