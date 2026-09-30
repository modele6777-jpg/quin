package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jh4 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nh4 b;

    public /* synthetic */ jh4(nh4 nh4Var, int i) {
        this.a = i;
        this.b = nh4Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        nh4 nh4Var = this.b;
        switch (i) {
            case 0:
                j09 j09Var = (j09) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j09Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(j09Var) ? 4 : 2;
                }
                if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    bm8.d(j09Var, nh4Var, l46Var, iIntValue & 14);
                } else {
                    l46Var.Z();
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    bx9 bx9Var = new bx9(20.0f, 20.0f, 20.0f, 20.0f);
                    uc0 uc0Var = new uc0(12.0f, true, new qc0(0));
                    boolean zI = l46Var2.i(nh4Var);
                    Object objR = l46Var2.R();
                    if (zI || objR == sf2.a) {
                        objR = new ot1(20, nh4Var);
                        l46Var2.p0(objR);
                    }
                    af1.t(j09VarC, null, bx9Var, uc0Var, null, null, false, null, (a26) objR, l46Var2, 24966, 490);
                } else {
                    l46Var2.Z();
                }
                break;
            case 2:
                c31 c31Var = (c31) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                c31Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.g(c31Var) ? 4 : 2;
                }
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    l46Var3.f0(879916037);
                    ArrayList<di4> arrayList = nh4Var.d;
                    ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
                    for (di4 di4Var : arrayList) {
                        arrayList2.add(new ng4(tm7.m(di4Var.a, false, l46Var3, 3), di4Var.b));
                    }
                    l46Var3.r(false);
                    jgb.u(0, l46Var3, c31Var.b(g09Var), arrayList2);
                } else {
                    l46Var3.Z();
                }
                break;
            default:
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var4, 0);
                    int iHashCode = Long.hashCode(l46Var4.T);
                    u8a u8aVarM = l46Var4.m();
                    j09 j09VarJ = m93.J(l46Var4, g09Var);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(LayoutNode.h1);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(hj6.z, l46Var4, c92VarA);
                    dec.l(hj6.y, l46Var4, u8aVarM);
                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode));
                    dec.k(l46Var4);
                    dec.l(hj6.x, l46Var4, j09VarJ);
                    String str = nh4Var.e;
                    mue mueVar = pue.a;
                    nte.b(str, null, ((e8b) l46Var4.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var4), l46Var4, 0, 0, 131066);
                    if (ca2.a.a()) {
                        l46Var4.f0(-1854310317);
                        jgb.c(null, l46Var4, 6);
                        l46Var4.r(false);
                    } else {
                        l46Var4.f0(-1854271877);
                        l46Var4.r(false);
                    }
                    l46Var4.r(true);
                } else {
                    l46Var4.Z();
                }
                break;
        }
        return wefVar;
    }
}
