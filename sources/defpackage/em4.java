package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class em4 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ em4(int i, Object obj, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = obj;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        g09 g09Var = g09.a;
        Object obj4 = this.d;
        boolean z = this.c;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                x16 x16Var = (x16) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    c8b.j(b.d(ynb.a0(mh3.N(b.c(g09Var, 1.0f)), 24.0f, 24.0f), 56.0f), afc.q(R.string.quick_draw_ask_for_reading, l46Var), !z, z2 ? ed.E0 : dd.E0, 0.0f, null, null, null, false, x16Var, l46Var, 4096, 496);
                }
                break;
            default:
                h0e h0eVar = (h0e) obj4;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, g09Var);
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
                    nte.b(afc.q(z2 ? R.string.button_retry : R.string.draw_card_next, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 262142);
                    if (z) {
                        l46Var2.f0(110509320);
                        axa.a(2.0f, 0.0f, 0, 390, 56, ((y72) h0eVar.getValue()).a, 0L, l46Var2, b.l(g09Var, 18.0f));
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(110666273);
                        l46Var2.r(false);
                    }
                    l46Var2.r(true);
                }
                break;
        }
        return wefVar;
    }
}
