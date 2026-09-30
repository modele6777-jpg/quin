package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m4a implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ m4a(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        List list = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                l46 l46Var = (l46) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((rx9) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= l46Var.e(iIntValue) ? 32 : 16;
                }
                if (!l46Var.W(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    l46Var.Z();
                } else {
                    j09 j09VarD = b.d(g09Var, 472.0f);
                    c92 c92VarA = a92.a(xc0.d, ndb.Y, l46Var, 6);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarD);
                    lf2.q.getClass();
                    l46Var.j0();
                    boolean z = l46Var.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    j09 j09VarC = b.c(b.b(0.0f, 96.0f, g09Var, 1), 1.0f);
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarC);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, xn8VarC);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    String strQ = afc.q(((Number) o4a.a.get(iIntValue)).intValue(), l46Var);
                    mue mueVar = pue.a;
                    nte.b(strQ, ynb.b0(32.0f, 0.0f, g09Var, 2), ((e8b) l46Var.k(l8b.a)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.m(l46Var), 0L, 0L, null, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183), l46Var, 48, 0, 130040);
                    ib8.t(l46Var, true, g09Var, 12.0f, l46Var);
                    feg.j(od4.A(((Number) list.get(iIntValue)).intValue(), 0, l46Var), null, b.c(b.d(g09Var, 256.0f), 1.0f), ndb.c, an2.a, 0.0f, null, l46Var, 28088, 96);
                    l46Var.r(true);
                }
                break;
            case 1:
                int iIntValue3 = ((Integer) obj2).intValue();
                l46 l46Var2 = (l46) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= l46Var2.e(iIntValue3) ? 32 : 16;
                }
                if (!l46Var2.W(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    l46Var2.Z();
                } else {
                    o5c.b(((djc) list.get(iIntValue3)).a, iIntValue3, null, l46Var2, iIntValue4 & 112, 4);
                }
                break;
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                l46 l46Var3 = (l46) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((rx9) obj).getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= l46Var3.e(iIntValue5) ? 32 : 16;
                }
                if (!l46Var3.W(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    l46Var3.Z();
                } else {
                    bzd.b(Integer.valueOf(((old) list.get(iIntValue5)).a), null, (aw6) l46Var3.k(n72.a), dj6.w(g09Var, 1.0f), an2.a, null, l46Var3, 12586032, 0, 3952);
                }
                break;
        }
        return wefVar;
    }
}
