package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.events.model.Popup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g30 implements n26 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ g30(x16 x16Var, v50 v50Var, e89 e89Var, e89 e89Var2, x16 x16Var2, x16 x16Var3, boolean z) {
        this.d = x16Var;
        this.g = v50Var;
        this.c = e89Var;
        this.v = e89Var2;
        this.e = x16Var2;
        this.f = x16Var3;
        this.b = z;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = 3;
        boolean z = this.b;
        int i3 = 2;
        wef wefVar = wef.a;
        Object obj4 = this.v;
        Object obj5 = this.c;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        switch (i) {
            case 0:
                x16 x16Var = (x16) obj9;
                v50 v50Var = (v50) obj6;
                e89 e89Var = (e89) obj5;
                h0e h0eVar = (h0e) obj4;
                x16 x16Var2 = (x16) obj8;
                x16 x16Var3 = (x16) obj7;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    xdc.a(null, af1.b0(-1581617582, new q8(x16Var, (Object) v50Var, (Object) e89Var, h0eVar, 3), l46Var), af1.b0(1109345841, new b20(x16Var2, x16Var3, false, 2), l46Var), null, null, 0, y72.j, 0L, null, af1.b0(441030695, new sg(x16Var2, z, h0eVar, 1), l46Var), l46Var, 806879664, 441);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                Popup popup = (Popup) obj8;
                e89 e89Var2 = (e89) obj5;
                e89 e89Var3 = (e89) obj7;
                ted tedVar = (ted) obj6;
                a26 a26Var = (a26) obj4;
                x16 x16Var4 = (x16) obj9;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object objR = l46Var2.R();
                    i8c i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = af1.E(l46Var2);
                        l46Var2.p0(objR);
                    }
                    aw2 aw2Var = (aw2) objR;
                    boolean z2 = this.b;
                    boolean zH = l46Var2.h(z2) | l46Var2.g(e89Var2) | l46Var2.i(aw2Var) | l46Var2.g(e89Var3) | l46Var2.g(tedVar) | l46Var2.g(a26Var);
                    Object objR2 = l46Var2.R();
                    if (zH || objR2 == i8cVar) {
                        no2 no2Var = new no2(z2, a26Var, e89Var2, aw2Var, tedVar, e89Var3);
                        l46Var2.p0(no2Var);
                        objR2 = no2Var;
                    }
                    a26 a26Var2 = (a26) objR2;
                    boolean zH2 = l46Var2.h(z2) | l46Var2.g(e89Var2) | l46Var2.i(aw2Var) | l46Var2.g(e89Var3) | l46Var2.g(tedVar) | l46Var2.g(x16Var4);
                    Object objR3 = l46Var2.R();
                    if (zH2 || objR3 == i8cVar) {
                        i43 i43Var = new i43(z2, x16Var4, e89Var2, aw2Var, tedVar, e89Var3);
                        l46Var2.p0(i43Var);
                        objR3 = i43Var;
                    }
                    qka.b(popup, z2, a26Var2, (x16) objR3, l46Var2, Popup.$stable);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                bx9 bx9Var = (bx9) obj9;
                dd4 dd4Var = (dd4) obj8;
                List list = (List) obj7;
                l26 l26Var = (l26) obj6;
                a26 a26Var3 = (a26) obj5;
                List list2 = (List) obj4;
                e31 e31Var = (e31) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                e31Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.g(e31Var) ? 4 : 2;
                }
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    l46Var3.Z();
                    return wefVar;
                }
                ghc ghcVarT = mh3.T(l46Var3);
                float fD = e31Var.d();
                g09 g09Var = g09.a;
                j09 j09VarK = mh3.K(b.c(g09Var, 1.0f), ghcVarT);
                xn8 xn8VarC = s21.c(ndb.b, false);
                int iHashCode = Long.hashCode(l46Var3.T);
                u8a u8aVarM = l46Var3.m();
                j09 j09VarJ = m93.J(l46Var3, j09VarK);
                lf2.q.getClass();
                l46Var3.j0();
                boolean z3 = l46Var3.S;
                ov7 ov7Var = LayoutNode.h1;
                if (z3) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var3, xn8VarC);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var3, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var3, numValueOf);
                dec.k(l46Var3);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var3, j09VarJ);
                j09 j09VarQ = b.q(fD, 0.0f, g09Var, 2);
                t7c t7cVarA = s7c.a(new uc0(8.0f, true, new jv2(3, ndb.Z)), ndb.y, l46Var3, 6);
                int iHashCode2 = Long.hashCode(l46Var3.T);
                u8a u8aVarM2 = l46Var3.m();
                j09 j09VarJ2 = m93.J(l46Var3, j09VarQ);
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                dec.l(he2Var, l46Var3, t7cVarA);
                dec.l(he2Var2, l46Var3, u8aVarM2);
                ib8.s(iHashCode2, l46Var3, he2Var3, l46Var3);
                dec.l(he2Var4, l46Var3, j09VarJ2);
                o5c.f(l46Var3, b.p(g09Var, ynb.B(bx9Var, (cv7) l46Var3.k(zg2.n))));
                l46Var3.f0(-1647506278);
                ad4 ad4Var = (ad4) dd4Var;
                Iterator it = ad4Var.b.iterator();
                int i4 = 0;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    boolean z4 = this.b;
                    String name = null;
                    if (!zHasNext) {
                        l46 l46Var4 = l46Var3;
                        l46Var4.r(false);
                        if (list.isEmpty()) {
                            l46Var4.f0(468150456);
                            l46Var4.r(false);
                        } else {
                            l46Var4.f0(467402798);
                            beb.e(((yi4) vx.a(z4 ? 72.0f : 40.0f, b21.T(300, 0, gs4.a, 2), "extraCardsSeparatorWidth", l46Var4, 384, 8).getValue()).a, 0.0f, 0L, l46Var4, 0, 6);
                            int i5 = 0;
                            for (Object obj10 : list) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    t72.Z();
                                    throw null;
                                }
                                beb.a((TarotCardChoice) obj10, (String) s72.y0(i5, list2), z4, l26Var, a26Var3, l46Var4, 0);
                                i5 = i6;
                            }
                            l46Var4 = l46Var4;
                            l46Var4.r(false);
                        }
                        o5c.f(l46Var4, b.p(g09Var, ynb.A(bx9Var, (cv7) l46Var4.k(zg2.n))));
                        l46Var4.r(true);
                        l46Var4.r(true);
                        return wefVar;
                    }
                    Object next = it.next();
                    int i7 = i4 + 1;
                    if (i4 < 0) {
                        t72.Z();
                        throw null;
                    }
                    TarotCardChoice tarotCardChoice = (TarotCardChoice) next;
                    PatternData patternData = (PatternData) s72.y0(i4, ad4Var.a.c);
                    if (patternData != null) {
                        name = patternData.getName();
                    }
                    beb.a(tarotCardChoice, name, z4, l26Var, a26Var3, l46Var3, 0);
                    i4 = i7;
                }
                break;
            case 3:
                x16 x16Var5 = (x16) obj9;
                jnc jncVar = (jnc) obj8;
                yk8 yk8Var = (yk8) obj7;
                a26 a26Var4 = (a26) obj6;
                s69 s69Var = (s69) obj4;
                e89 e89Var4 = (e89) obj5;
                l46 l46Var5 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var5.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    xdc.a(b.c, af1.b0(1682156898, new fkc(i3, x16Var5), l46Var5), null, null, null, 0, y72.j, 0L, m93.o(0, 14), af1.b0(1802228269, new pc2(jncVar, this.b, yk8Var, a26Var4, s69Var, e89Var4), l46Var5), l46Var5, 806879286, 188);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            default:
                x16 x16Var6 = (x16) obj9;
                x16 x16Var7 = (x16) obj8;
                x16 x16Var8 = (x16) obj7;
                x16 x16Var9 = (x16) obj6;
                use useVar = (use) obj5;
                pmc pmcVar = (pmc) obj4;
                l46 l46Var6 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var6.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    xdc.a(b.c, af1.b0(1758255038, new fkc(i2, x16Var6), l46Var6), af1.b0(1587415581, new hk8(x16Var7, z, x16Var8, x16Var9), l46Var6), null, null, 0, y72.j, 0L, null, af1.b0(-26098413, new s19(9, useVar, pmcVar), l46Var6), l46Var6, 806879670, 440);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ g30(x16 x16Var, x16 x16Var2, boolean z, x16 x16Var3, x16 x16Var4, use useVar, pmc pmcVar) {
        this.d = x16Var;
        this.e = x16Var2;
        this.b = z;
        this.f = x16Var3;
        this.g = x16Var4;
        this.c = useVar;
        this.v = pmcVar;
    }

    public /* synthetic */ g30(x16 x16Var, jnc jncVar, boolean z, yk8 yk8Var, a26 a26Var, s69 s69Var, e89 e89Var) {
        this.d = x16Var;
        this.e = jncVar;
        this.b = z;
        this.f = yk8Var;
        this.g = a26Var;
        this.v = s69Var;
        this.c = e89Var;
    }

    public /* synthetic */ g30(bx9 bx9Var, dd4 dd4Var, List list, boolean z, l26 l26Var, a26 a26Var, List list2) {
        this.d = bx9Var;
        this.e = dd4Var;
        this.f = list;
        this.b = z;
        this.g = l26Var;
        this.c = a26Var;
        this.v = list2;
    }

    public /* synthetic */ g30(Popup popup, boolean z, e89 e89Var, e89 e89Var2, ted tedVar, a26 a26Var, x16 x16Var) {
        this.e = popup;
        this.b = z;
        this.c = e89Var;
        this.f = e89Var2;
        this.g = tedVar;
        this.v = a26Var;
        this.d = x16Var;
    }
}
