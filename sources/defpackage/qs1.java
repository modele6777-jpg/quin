package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qs1 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ qs1(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        wef wefVar = wef.a;
        g09 g09Var = g09.a;
        int i2 = 4;
        final int i3 = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((vw7) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    nte.b(afc.r(R.string.photo_pick_number_card, new Object[]{Integer.valueOf(i3)}, l46Var), ynb.d0(0.0f, 16.0f, 0.0f, 0.0f, 13, b.c(g09Var, 1.0f)), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var.k(nte.a), y72.b(((m82) l46Var.k(o82.a)).q, 0.88f), w6c.l(27), ar5.y, cr5.b(), w6c.i(0.006d), null, 3, w6c.k(40.5d), null, null, 16613208), l46Var, 48, 0, 131068);
                }
                break;
            case 1:
                List list = (List) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                list.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? l46Var2.g(list) : l46Var2.i(list) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                } else {
                    i8c i8cVar = i8c.g;
                    pr4 pr4Var = l8b.a;
                    i8cVar.n(oa7.E(rrb.q(ynb.Z(m93.u(fdc.w(g09Var, 0.0f), new kt3(i2, (yce) ((i3 < 0 || i3 >= list.size()) ? (yce) list.get(0) : list.get(i3)))), 2.0f), 1.0f, eze.a(l46Var2).a.a, 0L, 0L, 28), eze.a(l46Var2).a.a), 32.0f, we6.e(l46Var2) ? ((e8b) l46Var2.k(pr4Var)).m : ((e8b) l46Var2.k(pr4Var)).d, l46Var2, 3120, 0);
                }
                break;
            case 2:
                xw9 xw9Var = (xw9) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.g(xw9Var) ? 4 : 2;
                }
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    l46Var3.Z();
                } else {
                    jgb.l(0, l46Var3);
                    j09 j09VarY = ynb.Y(b.c, xw9Var);
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var3, 48);
                    int iHashCode = Long.hashCode(l46Var3.T);
                    u8a u8aVarM = l46Var3.m();
                    j09 j09VarJ = m93.J(l46Var3, j09VarY);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, c92VarA);
                    dec.l(hj6.y, l46Var3, u8aVarM);
                    dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode));
                    dec.k(l46Var3);
                    dec.l(hj6.x, l46Var3, j09VarJ);
                    jgb.q(0, 1, l46Var3, null, ks0.h(24.0f, R.string.spread_info_entry_title, l46Var3, l46Var3, g09Var));
                    jgb.s(0, 0, 5, l46Var3, null, ks0.h(8.0f, R.string.spread_info_entry_subtitle, l46Var3, l46Var3, g09Var));
                    nk8.d(b.c(g09Var, 1.0f).D(new jw7(1.0f, true)), null, af1.b0(1810523624, new qs1(i3, 3), l46Var3), l46Var3, 3072, 6);
                    l46Var3.r(true);
                }
                break;
            default:
                e31 e31Var = (e31) obj;
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                e31Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= l46Var4.g(e31Var) ? 4 : 2;
                }
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    l46Var4.Z();
                } else {
                    boolean z = i3 >= 3;
                    final float f = z ? 80.0f : 109.0f;
                    final float aspectRatio = ((die) l46Var4.k(snd.a)).a.getAspectRatio();
                    j09 j09VarB0 = ynb.b0(0.0f, 24.0f, mh3.d0(b.b(0.0f, e31Var.c(), b.c(g09Var, 1.0f), 1), mh3.T(l46Var4), false, 14), 1);
                    jx0 jx0Var = ndb.Z;
                    c92 c92VarA2 = a92.a(xc0.e, jx0Var, l46Var4, 54);
                    int iHashCode2 = Long.hashCode(l46Var4.T);
                    u8a u8aVarM2 = l46Var4.m();
                    j09 j09VarJ2 = m93.J(l46Var4, j09VarB0);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(ov7Var);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(hj6.z, l46Var4, c92VarA2);
                    dec.l(hj6.y, l46Var4, u8aVarM2);
                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode2));
                    dec.k(l46Var4);
                    dec.l(hj6.x, l46Var4, j09VarJ2);
                    ynb.j(ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2), new uc0(8.0f, true, new jv2(3, jx0Var)), new uc0(20.0f, true, new qc0(0)), null, z ? 3 : i3, 0, af1.b0(127793667, new n26() { // from class: zvd
                        @Override // defpackage.n26
                        public final Object m(Object obj4, Object obj5, Object obj6) {
                            l46 l46Var5 = (l46) obj5;
                            int iIntValue5 = ((Integer) obj6).intValue();
                            ((en5) obj4).getClass();
                            if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                int i4 = 0;
                                while (i4 < i3) {
                                    i4++;
                                    n16.j(i4, 0, l46Var5, dj6.w(b.p(g09.a, f), aspectRatio));
                                }
                            } else {
                                l46Var5.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var4), l46Var4, 1573302, 40);
                    l46Var4.r(true);
                }
                break;
        }
        return wefVar;
    }
}
