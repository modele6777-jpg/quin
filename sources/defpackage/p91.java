package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p91 implements l26 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ p91(tr2 tr2Var, xw9 xw9Var, kzd kzdVar, boolean z, ii6 ii6Var, boolean z2, int i) {
        this.d = tr2Var;
        this.e = xw9Var;
        this.f = kzdVar;
        this.b = z;
        this.g = ii6Var;
        this.c = z2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        pad padVar;
        a26 a26Var;
        Integer num;
        gd7 gd7Var;
        int i = this.a;
        i8c i8cVar = sf2.a;
        sc0 sc0Var = xc0.c;
        ov7 ov7Var = LayoutNode.h1;
        boolean z = this.c;
        boolean z2 = this.b;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        boolean z3 = true;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                mx7 mx7Var = (mx7) obj6;
                m91 m91Var = (m91) obj5;
                gd7 gd7Var2 = (gd7) obj4;
                dd2 dd2Var = (dd2) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j09 j09VarC = z2 ? b.c(g09Var, 1.0f) : mx7.b(mx7Var);
                    boolean z4 = this.c;
                    j09 j09VarD = j09VarC.D(z4 ? z2 ? b.b : new a0a(null, mx7Var.b, 2) : b.r(g09Var));
                    c92 c92VarA = a92.a(sc0Var, ndb.Y, l46Var, 0);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarD);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.h(l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    l46Var.f0(1028986199);
                    l46Var.r(false);
                    kj0.d.C(e92.a, m91Var, af1.b0(-912247458, new o50(z4, m91Var, gd7Var2, dd2Var, 1), l46Var), l46Var, 390);
                    l46Var.f0(1031214231);
                    l46Var.r(false);
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                af1.f((j09) obj6, this.b, (String) obj5, (fy9) obj4, this.c, (a26) obj3, (l46) obj, k99.P(4097));
                break;
            case 2:
                ((Integer) obj2).getClass();
                zk3.a((ak3) obj6, this.b, this.c, (x16) obj5, (x16) obj4, (x16) obj3, (l46) obj, k99.P(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                kc4.a((tr2) obj6, (xw9) obj5, (kzd) obj4, this.b, (ii6) obj3, this.c, (l46) obj, k99.P(521));
                break;
            case 4:
                ((Integer) obj2).getClass();
                y7h.h((List) obj6, this.b, (String) obj5, this.c, (l26) obj4, (x16) obj3, (l46) obj, k99.P(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                jzb.a(this.b, this.c, (x16) obj6, (x16) obj5, (x16) obj4, (j09) obj3, (l46) obj, k99.P(1));
                break;
            case 6:
                pad padVar2 = (pad) obj6;
                Integer num2 = (Integer) obj5;
                a26 a26Var2 = (a26) obj4;
                dd2 dd2Var2 = (dd2) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e1b e1bVarA = sad.a.a(Boolean.FALSE);
                    pr4 pr4Var = d8d.a;
                    boolean zG = l46Var2.g(padVar2) | l46Var2.g(num2);
                    boolean z5 = this.b;
                    boolean zH = l46Var2.h(z5) | zG | l46Var2.g(a26Var2);
                    Object objR = l46Var2.R();
                    if (zH || objR == i8cVar) {
                        padVar = padVar2;
                        a26Var = a26Var2;
                        num = num2;
                        fef fefVar = new fef(padVar, num, z5, a26Var, 0);
                        l46Var2.p0(fefVar);
                        objR = fefVar;
                    } else {
                        padVar = padVar2;
                        a26Var = a26Var2;
                        num = num2;
                    }
                    e1b e1bVarA2 = pr4Var.a((a26) objR);
                    e1b e1bVarA3 = sad.b.a(Boolean.valueOf(z));
                    e1b e1bVarA4 = sad.c.a(Integer.valueOf(z5 ? 8388608 : 67108864));
                    pr4 pr4Var2 = sad.d;
                    boolean zG2 = l46Var2.g(padVar) | l46Var2.g(num);
                    Object objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new i2e(24, padVar, num);
                        l46Var2.p0(objR2);
                    }
                    mh3.b(new e1b[]{e1bVarA, e1bVarA2, e1bVarA3, e1bVarA4, pr4Var2.a((a26) objR2)}, af1.b0(852710039, new l30(dd2Var2, num, padVar, z5, a26Var), l46Var2), l46Var2, 48);
                } else {
                    l46Var2.Z();
                }
                break;
            default:
                he2 he2Var = hj6.x;
                he2 he2Var2 = hj6.y;
                he2 he2Var3 = hj6.z;
                mx7 mx7Var2 = (mx7) obj6;
                r2g r2gVar = (r2g) obj5;
                gd7 gd7Var3 = (gd7) obj4;
                dd2 dd2Var3 = (dd2) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    j09 j09VarC2 = z2 ? z ? b.c(g09Var, 1.0f) : mx7.b(mx7Var2) : urg.T(g09Var);
                    c92 c92VarA2 = a92.a(sc0Var, ndb.Y, l46Var3, 0);
                    int iHashCode2 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM2 = l46Var3.m();
                    j09 j09VarJ2 = m93.J(l46Var3, j09VarC2);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(he2Var3, l46Var3, c92VarA2);
                    dec.l(he2Var2, l46Var3, u8aVarM2);
                    dec.h(l46Var3, Integer.valueOf(iHashCode2));
                    dec.k(l46Var3);
                    dec.l(he2Var, l46Var3, j09VarJ2);
                    l46Var3.f0(-982756660);
                    l46Var3.r(false);
                    t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var3, 0);
                    int iHashCode3 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM3 = l46Var3.m();
                    j09 j09VarJ3 = m93.J(l46Var3, g09Var);
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(he2Var3, l46Var3, t7cVarA);
                    dec.l(he2Var2, l46Var3, u8aVarM3);
                    dec.h(l46Var3, Integer.valueOf(iHashCode3));
                    dec.k(l46Var3);
                    dec.l(he2Var, l46Var3, j09VarJ3);
                    l46Var3.f0(-140154097);
                    int i2 = 0;
                    for (Iterator it = r2gVar.a().iterator(); it.hasNext(); it = it) {
                        int i3 = i2 + 1;
                        v2g v2gVar = (v2g) it.next();
                        j09 j09VarF = oa7.F(z2 ? new jw7(1.0f, z3) : g09Var);
                        boolean zG3 = l46Var3.g(gd7Var3);
                        Object objR3 = l46Var3.R();
                        if (zG3 || objR3 == i8cVar) {
                            gd7Var = gd7Var3;
                            objR3 = new dne(1, gd7Var, gd7.class, "onFirstDayPlaced", "onFirstDayPlaced(Landroidx/compose/ui/layout/LayoutCoordinates;)V", 0, 10);
                            l46Var3.p0(objR3);
                        } else {
                            gd7Var = gd7Var3;
                        }
                        a26 a26Var3 = (a26) ((ym7) objR3);
                        if (i2 == 0) {
                            j09VarF = ok8.E(j09VarF, a26Var3);
                        }
                        xn8 xn8VarC = s21.c(ndb.b, false);
                        int iHashCode4 = Long.hashCode(l46Var3.T);
                        u8a u8aVarM4 = l46Var3.m();
                        j09 j09VarJ4 = m93.J(l46Var3, j09VarF);
                        lf2.q.getClass();
                        l46Var3.j0();
                        if (l46Var3.S) {
                            l46Var3.l(ov7Var);
                        } else {
                            l46Var3.s0();
                        }
                        dec.l(he2Var3, l46Var3, xn8VarC);
                        dec.l(he2Var2, l46Var3, u8aVarM4);
                        dec.h(l46Var3, Integer.valueOf(iHashCode4));
                        dec.k(l46Var3);
                        dec.l(he2Var, l46Var3, j09VarJ4);
                        dd2Var3.t(d31.a, v2gVar, l46Var3, 6);
                        l46Var3.r(true);
                        z3 = true;
                        i2 = i3;
                        gd7Var3 = gd7Var;
                    }
                    boolean z6 = z3;
                    l46Var3.r(false);
                    l46Var3.r(z6);
                    l46Var3.f0(-982062260);
                    l46Var3.r(false);
                    l46Var3.r(z6);
                } else {
                    l46Var3.Z();
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ p91(ak3 ak3Var, boolean z, boolean z2, x16 x16Var, x16 x16Var2, x16 x16Var3, int i) {
        this.d = ak3Var;
        this.b = z;
        this.c = z2;
        this.e = x16Var;
        this.f = x16Var2;
        this.g = x16Var3;
    }

    public /* synthetic */ p91(j09 j09Var, boolean z, String str, fy9 fy9Var, boolean z2, a26 a26Var, int i) {
        this.d = j09Var;
        this.b = z;
        this.e = str;
        this.f = fy9Var;
        this.c = z2;
        this.g = a26Var;
    }

    public /* synthetic */ p91(pad padVar, Integer num, boolean z, a26 a26Var, boolean z2, dd2 dd2Var) {
        this.d = padVar;
        this.e = num;
        this.b = z;
        this.f = a26Var;
        this.c = z2;
        this.g = dd2Var;
    }

    public /* synthetic */ p91(List list, boolean z, String str, boolean z2, l26 l26Var, x16 x16Var, int i) {
        this.d = list;
        this.b = z;
        this.e = str;
        this.c = z2;
        this.f = l26Var;
        this.g = x16Var;
    }

    public /* synthetic */ p91(boolean z, mx7 mx7Var, boolean z2, m91 m91Var, gd7 gd7Var, dd2 dd2Var) {
        this.b = z;
        this.d = mx7Var;
        this.c = z2;
        this.e = m91Var;
        this.f = gd7Var;
        this.g = dd2Var;
    }

    public /* synthetic */ p91(boolean z, boolean z2, x16 x16Var, x16 x16Var2, x16 x16Var3, j09 j09Var, int i) {
        this.b = z;
        this.c = z2;
        this.d = x16Var;
        this.e = x16Var2;
        this.f = x16Var3;
        this.g = j09Var;
    }

    public /* synthetic */ p91(boolean z, boolean z2, mx7 mx7Var, r2g r2gVar, gd7 gd7Var, dd2 dd2Var) {
        this.b = z;
        this.c = z2;
        this.d = mx7Var;
        this.e = r2gVar;
        this.f = gd7Var;
        this.g = dd2Var;
    }
}
