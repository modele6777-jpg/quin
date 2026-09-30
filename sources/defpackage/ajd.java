package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ajd implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ajd(Object obj, Object obj2, float f, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = f;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        String strValueOf;
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (i) {
            case 0:
                sdd sddVar = (sdd) obj9;
                xw9 xw9Var = (xw9) obj8;
                List list = (List) obj7;
                e89 e89Var = (e89) obj6;
                l26 l26Var = (l26) obj5;
                ft1 ft1Var = (ft1) obj2;
                l46 l46Var = (l46) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((c31) obj).getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= l46Var.g(ft1Var) ? 32 : 16;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 145) != 144)) {
                    l46Var.Z();
                } else {
                    Integer num = (Integer) e89Var.getValue();
                    boolean zG = l46Var.g(e89Var);
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new w77(e89Var, 13);
                        l46Var.p0(objR);
                    }
                    kn2.h(sddVar, null, xw9Var, this.b, list, num, false, false, false, null, null, null, 0.0f, ft1Var, (a26) objR, l26Var, l46Var, 0, (iIntValue << 6) & 7168, 4065);
                }
                break;
            default:
                String[] strArr = (String[]) obj9;
                z67 z67Var = (z67) obj8;
                j18 j18Var = (j18) obj7;
                lx0 lx0Var = (lx0) obj6;
                mue mueVar = (mue) obj5;
                int iIntValue2 = ((Integer) obj2).intValue();
                l46 l46Var2 = (l46) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((mx7) obj).getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= l46Var2.e(iIntValue2) ? 32 : 16;
                }
                if (!l46Var2.W(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    l46Var2.Z();
                } else {
                    if (strArr == null || (strValueOf = (String) qd0.q0(iIntValue2, strArr)) == null) {
                        strValueOf = String.valueOf(z67Var.a + iIntValue2);
                    }
                    j09 j09VarC = b.c(b.d(g09.a, this.b), 1.0f);
                    boolean zG2 = l46Var2.g(j18Var) | ((iIntValue3 & 112) == 32);
                    Object objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new vj(j18Var, iIntValue2, 11);
                        l46Var2.p0(objR2);
                    }
                    j09 j09VarX = bzd.x(j09VarC, (a26) objR2);
                    xn8 xn8VarC = s21.c(lx0Var, false);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarX);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    nte.b(strValueOf, null, ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mueVar, l46Var2, 0, 24576, 114682);
                    l46Var2.r(true);
                }
                break;
        }
        return wefVar;
    }
}
