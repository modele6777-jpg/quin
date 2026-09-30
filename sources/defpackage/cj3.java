package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.router.GiftCardPerspective;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cj3 implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ cj3(cs3 cs3Var, sx9 sx9Var, ph3 ph3Var, boolean z, List list, x16 x16Var, bhe bheVar, x16 x16Var2, aw2 aw2Var) {
        this.e = cs3Var;
        this.f = sx9Var;
        this.g = ph3Var;
        this.d = z;
        this.v = list;
        this.b = x16Var;
        this.w = bheVar;
        this.c = x16Var2;
        this.x = aw2Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        jsd jsdVar;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj4 = this.w;
        Object obj5 = this.c;
        Object obj6 = this.x;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        Object obj10 = this.v;
        int i2 = 1;
        switch (i) {
            case 0:
                final cs3 cs3Var = (cs3) obj9;
                sx9 sx9Var = (sx9) obj8;
                ph3 ph3Var = (ph3) obj7;
                final List list = (List) obj10;
                final bhe bheVar = (bhe) obj4;
                final x16 x16Var = (x16) obj5;
                final aw2 aw2Var = (aw2) obj6;
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
                    final float f = ((yi4) i7h.D(new yi4(e31Var.d() * 0.56f), new yi4(e31Var.c() * 0.6f))).a;
                    final float f2 = f / 0.6f;
                    float f3 = ((yi4) mh3.l(new yi4((e31Var.d() - f) / 2.0f), new yi4(0.0f))).a;
                    FillElement fillElement = b.c;
                    ex9 ex9Var = new ex9(f);
                    bx9 bx9VarQ = ynb.q(f3, 0.0f, 2);
                    kx0 kx0Var = ndb.z;
                    ard ardVarV = an1.v(cs3Var, sx9Var, ph3Var, l46Var, 196656, 24);
                    final boolean z = this.d;
                    cn1.h(0.0f, 0, 1572912, 15920, kx0Var, af1.b0(-998740712, new o26() { // from class: jj3
                        @Override // defpackage.o26
                        public final Object t(Object obj11, Object obj12, Object obj13, Object obj14) {
                            int iIntValue2 = ((Integer) obj12).intValue();
                            l46 l46Var2 = (l46) obj13;
                            int iIntValue3 = ((Integer) obj14).intValue();
                            ((rx9) obj11).getClass();
                            if ((iIntValue3 & 48) == 0) {
                                iIntValue3 |= l46Var2.e(iIntValue2) ? 32 : 16;
                            }
                            if (l46Var2.W(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                List list2 = list;
                                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) list2.get(iIntValue2 % list2.size());
                                Object objR = l46Var2.R();
                                i8c i8cVar = sf2.a;
                                if (objR == i8cVar) {
                                    objR = ib8.e(l46Var2);
                                }
                                t69 t69Var = (t69) objR;
                                bhe bheVar2 = bheVar;
                                yge ygeVarF = bheVar2.f(tarotSkinIdentify);
                                boolean zA = bheVar2.a(tarotSkinIdentify);
                                cs3 cs3Var2 = cs3Var;
                                int i3 = iIntValue3 & 112;
                                boolean zG = l46Var2.g(cs3Var2) | (i3 == 32);
                                Object objR2 = l46Var2.R();
                                if (zG || objR2 == i8cVar) {
                                    objR2 = new vj(cs3Var2, iIntValue2, 2);
                                    l46Var2.p0(objR2);
                                }
                                j09 j09VarB = g09.a;
                                j09 j09VarX = bzd.x(j09VarB, (a26) objR2);
                                if (z) {
                                    l46Var2.f0(2049984585);
                                    boolean zG2 = l46Var2.g(cs3Var2) | (i3 == 32);
                                    x16 x16Var2 = x16Var;
                                    boolean zG3 = zG2 | l46Var2.g(x16Var2);
                                    aw2 aw2Var2 = aw2Var;
                                    boolean zI = zG3 | l46Var2.i(aw2Var2);
                                    Object objR3 = l46Var2.R();
                                    if (zI || objR3 == i8cVar) {
                                        bl blVar = new bl(iIntValue2, cs3Var2, x16Var2, aw2Var2, 1);
                                        l46Var2.p0(blVar);
                                        objR3 = blVar;
                                    }
                                    j09VarB = androidx.compose.foundation.b.b(j09VarB, t69Var, null, false, null, (x16) objR3, 28);
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(2050392452);
                                    l46Var2.r(false);
                                }
                                xj3.e(tarotSkinIdentify, ygeVarF, zA, f, f2, j09VarX.D(j09VarB), l46Var2, 64);
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, fillElement, null, null, bx9VarQ, ex9Var, cs3Var, ardVarV, null, z);
                    if (!list.isEmpty()) {
                        l46Var.f0(1740115376);
                        xj3.a(0, this.b, l46Var, tm7.M(e31Var.a(g09.a, ndb.f), (f / 2.0f) - 16.0f, ((-f2) / 2.0f) + 32.0f), z);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1740356587);
                        l46Var.r(false);
                    }
                }
                break;
            case 1:
                z76 z76Var = (z76) obj9;
                GiftCardItem giftCardItem = (GiftCardItem) obj8;
                x16 x16Var2 = (x16) obj5;
                GiftCardPerspective giftCardPerspective = (GiftCardPerspective) obj7;
                v86 v86Var = (v86) obj10;
                a26 a26Var = (a26) obj4;
                l26 l26Var = (l26) obj6;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    FillElement fillElement2 = b.c;
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, fillElement2);
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
                    boolean z3 = this.d;
                    pa7.a(null, 0L, 0L, null, af1.b0(1828193059, new nu2(z3, giftCardPerspective, i2), l46Var2), null, false, false, this.b, l46Var2, 24576, 239);
                    if (z76Var.b) {
                        l46Var2.f0(-215105281);
                        xn8 xn8VarC = s21.c(ndb.f, false);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, fillElement2);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, xn8VarC);
                        dec.l(he2Var2, l46Var2, u8aVarM2);
                        ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ2);
                        axa.a(0.0f, 0.0f, 0, 0, 63, 0L, 0L, l46Var2, null);
                        l46Var2.r(true);
                        l46Var2.r(false);
                    } else if (z76Var.c != null || giftCardItem == null) {
                        l46Var2.f0(-215100189);
                        pa6.e(x16Var2, l46Var2, 0);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-215098676);
                        pa6.c(giftCardItem, giftCardPerspective, v86Var, z3, !z3, a26Var, l26Var, l46Var2, GiftCardItem.$stable);
                        l46Var2.r(false);
                    }
                    l46Var2.r(true);
                }
                break;
            default:
                List list2 = (List) obj10;
                jsd jsdVar2 = (jsd) obj9;
                use useVar = (use) obj8;
                fn8 fn8Var = (fn8) obj7;
                aw2 aw2Var2 = (aw2) obj6;
                ted tedVar = (ted) obj5;
                l26 l26Var2 = (l26) obj4;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var3.Z();
                } else {
                    boolean zI = l46Var3.i(aw2Var2) | l46Var3.g(tedVar) | l46Var3.g(useVar) | l46Var3.g(l26Var2);
                    Object objR = l46Var3.R();
                    if (zI || objR == sf2.a) {
                        jsdVar = jsdVar2;
                        m8 m8Var = new m8(aw2Var2, tedVar, useVar, l26Var2, jsdVar, 19);
                        useVar = useVar;
                        l46Var3.p0(m8Var);
                        objR = m8Var;
                    } else {
                        jsdVar = jsdVar2;
                    }
                    jfb.d(list2, jsdVar, useVar, fn8Var, this.d, this.b, (x16) objR, l46Var3, 3120);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ cj3(x16 x16Var, z76 z76Var, GiftCardItem giftCardItem, x16 x16Var2, GiftCardPerspective giftCardPerspective, v86 v86Var, boolean z, a26 a26Var, l26 l26Var) {
        this.b = x16Var;
        this.e = z76Var;
        this.f = giftCardItem;
        this.c = x16Var2;
        this.g = giftCardPerspective;
        this.v = v86Var;
        this.d = z;
        this.w = a26Var;
        this.x = l26Var;
    }

    public /* synthetic */ cj3(List list, jsd jsdVar, use useVar, fn8 fn8Var, boolean z, x16 x16Var, aw2 aw2Var, ted tedVar, l26 l26Var) {
        this.v = list;
        this.e = jsdVar;
        this.f = useVar;
        this.g = fn8Var;
        this.d = z;
        this.b = x16Var;
        this.x = aw2Var;
        this.c = tedVar;
        this.w = l26Var;
    }
}
