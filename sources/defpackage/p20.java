package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p20 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ p20(a30 a30Var, x16 x16Var, x16 x16Var2, a26 a26Var, a26 a26Var2, e89 e89Var, e89 e89Var2, boolean z) {
        this.d = a30Var;
        this.b = x16Var;
        this.c = z;
        this.e = x16Var2;
        this.f = a26Var;
        this.g = a26Var2;
        this.v = e89Var;
        this.w = e89Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.g;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.b;
        Object obj9 = this.d;
        switch (i) {
            case 0:
                final a30 a30Var = (a30) obj9;
                final x16 x16Var = (x16) obj8;
                final x16 x16Var2 = (x16) obj7;
                final a26 a26Var = (a26) obj6;
                final a26 a26Var2 = (a26) obj3;
                final e89 e89Var = (e89) obj5;
                final e89 e89Var2 = (e89) obj4;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    g09 g09Var = g09.a;
                    j09 j09VarN = tm7.n(b.c(g09Var, 1.0f), gec.N(0.0f, 14, g21.S(l46Var) ? t72.I(new y72(y72.b(abg.d(4294967295L), 0.1f)), new y72(y72.b(abg.d(4294967295L), 0.8f)), new y72(y72.b(abg.d(4294967295L), 1.0f))) : t72.I(new y72(abg.c(1842217)), new y72(abg.d(3424394281L)))), null, 6);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarN);
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
                    dec.l(he2Var, l46Var, xn8VarC);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    j09 j09VarD0 = ynb.d0(0.0f, 24.0f, 0.0f, 6.0f, 5, mh3.N(ynb.b0(32.0f, 0.0f, g09Var, 2)));
                    c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarD0);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    Boolean boolValueOf = Boolean.valueOf(a30Var.c);
                    Object objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = new zv(9);
                        l46Var.p0(objR);
                    }
                    final boolean z2 = this.c;
                    kn2.c(boolValueOf, null, (a26) objR, null, "button_switch_animation", null, af1.b0(-106336953, new o26() { // from class: e20
                        @Override // defpackage.o26
                        public final Object t(Object obj10, Object obj11, Object obj12, Object obj13) {
                            e89 e89Var3;
                            e89 e89Var4;
                            boolean z3;
                            String strR;
                            boolean z4;
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            l46 l46Var2 = (l46) obj12;
                            int iIntValue2 = ((Integer) obj13).intValue();
                            ((ly) obj10).getClass();
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= l46Var2.h(zBooleanValue) ? 32 : 16;
                            }
                            if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                g09 g09Var2 = g09.a;
                                i8c i8cVar = sf2.a;
                                if (zBooleanValue) {
                                    l46Var2.f0(1801757054);
                                    j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09Var2, 1.0f), 1);
                                    String strQ = afc.q(R.string.annual_intro_start_button, l46Var2);
                                    u51 u51VarM = c8b.m(l46Var2);
                                    x16 x16Var3 = x16Var;
                                    boolean zG = l46Var2.g(x16Var3);
                                    Object objR2 = l46Var2.R();
                                    if (zG || objR2 == i8cVar) {
                                        objR2 = new c20(2, x16Var3);
                                        l46Var2.p0(objR2);
                                    }
                                    c8b.i(j09VarB, strQ, null, null, 0L, 0.0f, false, null, u51VarM, false, null, null, (x16) objR2, l46Var2, 6, 0, 3836);
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(1802410286);
                                    c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                                    int iHashCode3 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM3 = l46Var2.m();
                                    j09 j09VarJ3 = m93.J(l46Var2, g09Var2);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(LayoutNode.h1);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(hj6.z, l46Var2, c92VarA2);
                                    dec.l(hj6.y, l46Var2, u8aVarM3);
                                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode3));
                                    dec.k(l46Var2);
                                    dec.l(hj6.x, l46Var2, j09VarJ3);
                                    j09 j09VarB2 = b.b(0.0f, 56.0f, b.c(g09Var2, 1.0f), 1);
                                    u51 u51VarM2 = c8b.m(l46Var2);
                                    x4d x4dVar = eze.a(l46Var2).a.a;
                                    boolean z5 = z2;
                                    boolean zH = l46Var2.h(z5);
                                    x16 x16Var4 = x16Var2;
                                    boolean zG2 = zH | l46Var2.g(x16Var4);
                                    Object objR3 = l46Var2.R();
                                    e89 e89Var5 = e89Var;
                                    e89 e89Var6 = e89Var2;
                                    if (zG2 || objR3 == i8cVar) {
                                        e89Var3 = e89Var5;
                                        e89Var4 = e89Var6;
                                        z3 = z5;
                                        objR3 = new f20(z3, x16Var4, e89Var3, e89Var4, 0);
                                        l46Var2.p0(objR3);
                                    } else {
                                        e89Var3 = e89Var5;
                                        e89Var4 = e89Var6;
                                        z3 = z5;
                                    }
                                    a30 a30Var2 = a30Var;
                                    boolean z6 = z3;
                                    cgg.a((x16) objR3, j09VarB2, false, x4dVar, u51VarM2, null, null, null, af1.b0(826301309, new g20(0, a30Var2), l46Var2), l46Var2, 805306416, 484);
                                    n07 n07Var = a30Var2.a;
                                    j09 j09VarR = o8c.r(0, l46Var2, b.b(0.0f, 56.0f, oa7.E(b.c(g09Var2, 1.0f), eze.a(l46Var2).a.a), 1), n07Var == null);
                                    if (n07Var == null) {
                                        l46Var2.f0(446128733);
                                        l46Var2.r(false);
                                        strR = null;
                                    } else {
                                        l46Var2.f0(446128734);
                                        strR = afc.r(R.string.annual_button_purchase_report, new Object[]{n07Var.y()}, l46Var2);
                                        l46Var2.r(false);
                                    }
                                    if (strR == null) {
                                        strR = "";
                                    }
                                    boolean zH2 = l46Var2.h(z6) | l46Var2.i(n07Var);
                                    a26 a26Var3 = a26Var;
                                    boolean zG3 = zH2 | l46Var2.g(a26Var3);
                                    Object objR4 = l46Var2.R();
                                    if (zG3 || objR4 == i8cVar) {
                                        objR4 = new h20(n07Var, a26Var3, e89Var3, e89Var4, z6, 0);
                                        z4 = z6;
                                        l46Var2.p0(objR4);
                                    } else {
                                        z4 = z6;
                                    }
                                    c8b.d(j09VarR, strR, null, false, null, (x16) objR4, l46Var2, 0, 28);
                                    ynb.s(b.c(g09Var2, 1.0f), z4, a26Var2, null, null, false, l46Var2, 6, 56);
                                    l46Var2.r(true);
                                    l46Var2.r(false);
                                }
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, 1597824, 42);
                    l46Var.r(true);
                    l46Var.r(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                cgg.g((x16) obj8, (j09) obj9, this.c, (x4d) obj7, (u51) obj6, (z51) obj3, (xw9) obj5, (dd2) obj4, (l46) obj, k99.P(805306417));
                break;
            case 2:
                ((Integer) obj2).getClass();
                vf3.b((wf3) obj9, (j09) obj8, (ne3) obj7, (ke3) obj6, (l26) obj3, (l26) obj5, this.c, (fo5) obj4, (l46) obj, k99.P(1794049));
                break;
            default:
                ((Integer) obj2).getClass();
                beb.c((bx9) obj9, (dd4) obj8, (l26) obj7, (a26) obj6, (List) obj5, (List) obj4, this.c, (a26) obj3, (l46) obj, k99.P(12582919));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ p20(wf3 wf3Var, j09 j09Var, ne3 ne3Var, ke3 ke3Var, l26 l26Var, l26 l26Var2, boolean z, fo5 fo5Var, int i) {
        this.d = wf3Var;
        this.b = j09Var;
        this.e = ne3Var;
        this.f = ke3Var;
        this.g = l26Var;
        this.v = l26Var2;
        this.c = z;
        this.w = fo5Var;
    }

    public /* synthetic */ p20(x16 x16Var, j09 j09Var, boolean z, x4d x4dVar, u51 u51Var, z51 z51Var, xw9 xw9Var, dd2 dd2Var, int i) {
        this.b = x16Var;
        this.d = j09Var;
        this.c = z;
        this.e = x4dVar;
        this.f = u51Var;
        this.g = z51Var;
        this.v = xw9Var;
        this.w = dd2Var;
    }

    public /* synthetic */ p20(bx9 bx9Var, dd4 dd4Var, l26 l26Var, a26 a26Var, List list, List list2, boolean z, a26 a26Var2, int i) {
        this.d = bx9Var;
        this.b = dd4Var;
        this.e = l26Var;
        this.f = a26Var;
        this.v = list;
        this.w = list2;
        this.c = z;
        this.g = a26Var2;
    }
}
