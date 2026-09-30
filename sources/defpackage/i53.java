package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i53 implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ a26 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ m26 y;
    public final /* synthetic */ m26 z;

    public /* synthetic */ i53(t33 t33Var, boolean z, d63 d63Var, List list, cs3 cs3Var, cod codVar, y72 y72Var, a26 a26Var, int i, a26 a26Var2, a26 a26Var3) {
        this.f = t33Var;
        this.b = z;
        this.g = d63Var;
        this.c = list;
        this.v = cs3Var;
        this.w = codVar;
        this.x = y72Var;
        this.d = a26Var;
        this.e = i;
        this.y = a26Var2;
        this.z = a26Var3;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        jx0 jx0Var;
        cwa type;
        int i = this.a;
        wef wefVar = wef.a;
        g09 g09Var = g09.a;
        m26 m26Var = this.z;
        m26 m26Var2 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.v;
        Object obj7 = this.g;
        a26 a26Var = this.d;
        List list = this.c;
        Object obj8 = this.f;
        switch (i) {
            case 0:
                t33 t33Var = (t33) obj8;
                d63 d63Var = (d63) obj7;
                cs3 cs3Var = (cs3) obj6;
                cod codVar = (cod) obj5;
                y72 y72Var = (y72) obj4;
                a26 a26Var2 = (a26) m26Var2;
                a26 a26Var3 = (a26) m26Var;
                e31 e31Var = (e31) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                e31Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(e31Var) ? 4 : 2;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    l46Var.Z();
                } else {
                    float fC = e31Var.c();
                    ghc ghcVarT = mh3.T(l46Var);
                    boolean z = t33Var.a == s33.b;
                    j09 j09VarD0 = mh3.d0(b.c(g09Var, 1.0f), ghcVarT, ghcVarT.f.j() > 0, 12);
                    dd2 dd2VarB0 = af1.b0(623907963, new m43(d63Var, 1), l46Var);
                    dd2 dd2VarB1 = af1.b0(1072023548, new x6(list, d63Var, cs3Var, 17), l46Var);
                    dd2 dd2VarB2 = af1.b0(1520139133, new x6(codVar, y72Var, a26Var), l46Var);
                    int i2 = this.e;
                    x57.m(fC, this.b, j09VarD0, dd2VarB0, dd2VarB1, dd2VarB2, af1.b0(1968254718, new gc(list, i2, y72Var, 13), l46Var), af1.b0(-1878596993, new tg(z, y72Var, t33Var, codVar, a26Var2, a26Var3, i2, 4), l46Var), l46Var, 14380032);
                }
                break;
            default:
                xw9 xw9Var = (xw9) obj8;
                bwa bwaVar = (bwa) obj7;
                l5a l5aVar = (l5a) obj6;
                x16 x16Var = (x16) obj5;
                x16 x16Var2 = (x16) obj4;
                x16 x16Var3 = (x16) m26Var2;
                x16 x16Var4 = (x16) m26Var;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                jx0 jx0Var2 = ndb.Z;
                ((c31) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    j09 j09VarD1 = mh3.d0(b.c, mh3.T(l46Var2), false, 14);
                    jx0 jx0Var3 = ndb.Y;
                    sc0 sc0Var = xc0.c;
                    c92 c92VarA = a92.a(sc0Var, jx0Var3, l46Var2, 0);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarD1);
                    lf2.q.getClass();
                    l46Var2.j0();
                    boolean z2 = l46Var2.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z2) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var2, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var2, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var2, numValueOf);
                    dec.k(l46Var2);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var2, j09VarJ);
                    o4a.a(null, ynb.r(0.0f, ((yi4) mh3.l(new yi4(xw9Var.d() - 12.0f), new yi4(0.0f))).a, 0.0f, 0.0f, 13), l46Var2, 0);
                    pr4 pr4Var = l8b.a;
                    j09 j09VarD = b.c(g09Var, 1.0f).D(this.b ? g09Var : tm7.n(g09Var, gec.N(0.0f, 14, t72.I(new y72(((e8b) l46Var2.k(pr4Var)).e), new y72(((e8b) l46Var2.k(pr4Var)).a))), null, 6));
                    c92 c92VarA2 = a92.a(sc0Var, jx0Var3, l46Var2, 0);
                    int iHashCode2 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, j09VarD);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, c92VarA2);
                    dec.l(he2Var2, l46Var2, u8aVarM2);
                    ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ2);
                    o5c.f(l46Var2, b.d(g09Var, 24.0f));
                    k5a.b(0, a26Var, l46Var2, null, list);
                    o5c.f(l46Var2, b.d(g09Var, 24.0f));
                    cwa type2 = bwaVar != null ? bwaVar.getType() : null;
                    thb thbVar = type2 instanceof thb ? (thb) type2 : null;
                    bm8.o(l5aVar, this.e, null, thbVar != null ? Integer.valueOf(thbVar.d()) : null, l46Var2, 0);
                    o5c.f(l46Var2, b.d(g09Var, 16.0f));
                    oa7.d(ynb.b0(32.0f, 0.0f, g09Var, 2), 0.5f, y72.b(((e8b) l46Var2.k(pr4Var)).q, 0.08f), l46Var2, 54, 0);
                    o5c.f(l46Var2, b.d(g09Var, 16.0f));
                    ca2.a.getClass();
                    if (ca2.c) {
                        jx0Var = jx0Var2;
                        l46Var2.f0(1798566251);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(1798206837);
                        j09 j09VarC = b.c(g09Var, 1.0f);
                        jx0Var = jx0Var2;
                        c92 c92VarA3 = a92.a(sc0Var, jx0Var, l46Var2, 48);
                        int iHashCode3 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM3 = l46Var2.m();
                        j09 j09VarJ3 = m93.J(l46Var2, j09VarC);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, c92VarA3);
                        dec.l(he2Var2, l46Var2, u8aVarM3);
                        ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ3);
                        z7f.h(0, x16Var, x16Var2, l46Var2, null);
                        o5c.f(l46Var2, b.d(g09Var, 16.0f));
                        l46Var2.r(true);
                        l46Var2.r(false);
                    }
                    j09 j09VarB0 = ynb.b0(32.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                    c92 c92VarA4 = a92.a(sc0Var, jx0Var, l46Var2, 48);
                    int iHashCode4 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM4 = l46Var2.m();
                    j09 j09VarJ4 = m93.J(l46Var2, j09VarB0);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, c92VarA4);
                    dec.l(he2Var2, l46Var2, u8aVarM4);
                    ib8.s(iHashCode4, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ4);
                    boolean z3 = !ca2.c;
                    if (bwaVar == null || (type = bwaVar.getType()) == null) {
                        type = u7e.b;
                    }
                    ynb.g(type, z3, x16Var3, false, x16Var4, l46Var2, 6, 24);
                    ib8.t(l46Var2, true, g09Var, 24.0f, l46Var2);
                    o5c.f(l46Var2, b.d(g09Var, xw9Var.a()));
                    l46Var2.r(true);
                    l46Var2.r(true);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ i53(boolean z, xw9 xw9Var, List list, a26 a26Var, bwa bwaVar, l5a l5aVar, int i, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4) {
        this.b = z;
        this.f = xw9Var;
        this.c = list;
        this.d = a26Var;
        this.g = bwaVar;
        this.v = l5aVar;
        this.e = i;
        this.w = x16Var;
        this.x = x16Var2;
        this.y = x16Var3;
        this.z = x16Var4;
    }
}
