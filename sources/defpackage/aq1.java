package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aq1 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ aq1(x16 x16Var, String str, String str2, r4g r4gVar, aw2 aw2Var, ted tedVar, x16 x16Var2) {
        this.a = 4;
        this.c = x16Var;
        this.b = str;
        this.d = str2;
        this.e = r4gVar;
        this.f = aw2Var;
        this.g = tedVar;
        this.v = x16Var2;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        Integer numValueOf;
        mue mueVar;
        mue mueVar2;
        Integer numValueOf2;
        boolean z;
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        i8c i8cVar = sf2.a;
        j09 j09VarA = g09.a;
        wef wefVar = wef.a;
        Object obj4 = this.v;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.b;
        Object obj10 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj9;
                List list = (List) obj10;
                TarotCardType tarotCardType = (TarotCardType) obj8;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj7;
                l26 l26Var = (l26) obj6;
                a26 a26Var = (a26) obj5;
                a26 a26Var2 = (a26) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    String strR = afc.r(R.string.explore_detail_change_skin_cta, new Object[]{str}, l46Var);
                    mue mueVar3 = pue.a;
                    nte.b(strR, b.c(j09VarA, 1.0f), ((e8b) l46Var.k(l8b.a)).q, 0L, null, cr5.b(), 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.p(l46Var), l46Var, 48, 0, 129912);
                    j09 j09VarC = b.c(j09VarA, 1.0f);
                    uc0 uc0Var = new uc0(16.0f, true, new qc0(0));
                    boolean zI = l46Var.i(list) | l46Var.e(tarotCardType == null ? -1 : tarotCardType.ordinal()) | l46Var.e(tarotSkinIdentify.ordinal()) | l46Var.g(l26Var) | l46Var.g(a26Var) | l46Var.g(a26Var2);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new k11(list, tarotCardType, tarotSkinIdentify, l26Var, a26Var, a26Var2, 2);
                        l46Var.p0(objR);
                    }
                    af1.t(j09VarC, null, null, uc0Var, null, null, false, null, (a26) objR, l46Var, 24582, 494);
                }
                break;
            case 1:
                pl3 pl3Var = (pl3) obj9;
                hmd hmdVar = (hmd) obj10;
                y72 y72Var = (y72) obj8;
                x16 x16Var = (x16) obj7;
                x16 x16Var2 = (x16) obj6;
                x16 x16Var3 = (x16) obj5;
                x16 x16Var4 = (x16) obj4;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    xj3.c(pl3Var, hmdVar, y72Var, x16Var, x16Var2, x16Var3, x16Var4, ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(32.0f, 0.0f, mh3.N(j09VarA), 2)), l46Var2, 0);
                }
                break;
            case 2:
                String strR2 = null;
                ArrayList arrayList = (ArrayList) obj9;
                mue mueVar4 = (mue) obj10;
                aue aueVar = (aue) obj8;
                ArrayList arrayList2 = (ArrayList) obj6;
                mue mueVar5 = (mue) obj5;
                mld mldVar = (mld) obj4;
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) obj7;
                e31 e31Var = (e31) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                e31Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.g(e31Var) ? 4 : 2;
                }
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    l46Var3.Z();
                } else {
                    long jB = ll2.b(0, kl2.h(e31Var.b), 0, 0, 13);
                    boolean zG = l46Var3.g(arrayList) | l46Var3.g(mueVar4) | l46Var3.g(aueVar) | l46Var3.f(jB);
                    Object objR2 = l46Var3.R();
                    if (zG || objR2 == i8cVar) {
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            long j = jB;
                            aue aueVar2 = aueVar;
                            numValueOf = Integer.valueOf(aue.a(aueVar2, (String) it.next(), mueVar4, j, 988).b.f);
                            while (it.hasNext()) {
                                aue aueVar3 = aueVar2;
                                long j2 = j;
                                Integer numValueOf3 = Integer.valueOf(aue.a(aueVar2, (String) it.next(), mueVar4, j, 988).b.f);
                                if (numValueOf.compareTo(numValueOf3) < 0) {
                                    numValueOf = numValueOf3;
                                }
                                j = j2;
                                aueVar2 = aueVar3;
                            }
                            aueVar = aueVar2;
                            mueVar = mueVar4;
                            jB = j;
                        } else {
                            mueVar = mueVar4;
                            numValueOf = null;
                        }
                        objR2 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 1);
                        l46Var3.p0(objR2);
                    } else {
                        mueVar = mueVar4;
                    }
                    int iIntValue4 = ((Number) objR2).intValue();
                    boolean zG2 = l46Var3.g(arrayList2) | l46Var3.g(mueVar5) | l46Var3.g(aueVar) | l46Var3.f(jB);
                    Object objR3 = l46Var3.R();
                    if (zG2 || objR3 == i8cVar) {
                        Iterator it2 = arrayList2.iterator();
                        if (it2.hasNext()) {
                            long j3 = jB;
                            aue aueVar4 = aueVar;
                            mueVar2 = mueVar5;
                            numValueOf2 = Integer.valueOf(aue.a(aueVar4, (String) it2.next(), mueVar2, j3, 988).b.f);
                            while (it2.hasNext()) {
                                Integer numValueOf4 = Integer.valueOf(aue.a(aueVar4, (String) it2.next(), mueVar2, j3, 988).b.f);
                                if (numValueOf2.compareTo(numValueOf4) < 0) {
                                    numValueOf2 = numValueOf4;
                                }
                            }
                        } else {
                            numValueOf2 = null;
                            mueVar2 = mueVar5;
                        }
                        objR3 = Integer.valueOf(numValueOf2 != null ? numValueOf2.intValue() : 1);
                        l46Var3.p0(objR3);
                    } else {
                        mueVar2 = mueVar5;
                    }
                    int iIntValue5 = ((Number) objR3).intValue();
                    j09 j09VarC2 = b.c(j09VarA, 1.0f);
                    c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var3, 54);
                    int iHashCode = Long.hashCode(l46Var3.T);
                    u8a u8aVarM = l46Var3.m();
                    j09 j09VarJ = m93.J(l46Var3, j09VarC2);
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
                    String strQ = afc.q(mldVar.m(), l46Var3);
                    mue mueVar6 = pue.a;
                    mue mueVarN = pue.n(l46Var3);
                    cq5 cq5VarB = cr5.b();
                    pr4 pr4Var = l8b.a;
                    nte.b(strQ, null, ((e8b) l46Var3.k(pr4Var)).q, 0L, null, cq5VarB, 0L, null, new jme(3), 0L, 2, false, 1, 0, null, mueVarN, l46Var3, 0, 24960, 109434);
                    nte.b(afc.q(mldVar.l(), l46Var3), null, ((e8b) l46Var3.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, iIntValue4, null, mueVar, l46Var3, 0, 0, 97274);
                    Integer numI = mldVar.i();
                    if (!tarotSkinIdentify2.getIsModianCollab()) {
                        numI = null;
                    }
                    if (numI == null) {
                        l46Var3.f0(-1196977359);
                        l46Var3.r(false);
                    } else {
                        l46Var3.f0(-1196977358);
                        strR2 = afc.r(R.string.explore_deck_artist_credit, new Object[]{afc.q(numI.intValue(), l46Var3)}, l46Var3);
                        l46Var3.r(false);
                    }
                    if (strR2 == null) {
                        strR2 = "";
                    }
                    String str2 = strR2;
                    long j4 = we6.e(l46Var3) ? ((e8b) l46Var3.k(pr4Var)).q : ((e8b) l46Var3.k(pr4Var)).u;
                    if (numI == null) {
                        l46Var3.f0(931229926);
                        Object objR4 = l46Var3.R();
                        if (objR4 == i8cVar) {
                            objR4 = new i73(17);
                            l46Var3.p0(objR4);
                        }
                        j09VarA = vwc.a(j09VarA, (a26) objR4);
                        z = false;
                    } else {
                        z = false;
                        l46Var3.f0(931230839);
                    }
                    l46Var3.r(z);
                    nte.b(str2, j09VarA, j4, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, iIntValue5, null, mueVar2, l46Var3, 0, 0, 97272);
                    l46Var3.r(true);
                }
                break;
            case 3:
                fl6 fl6Var = (fl6) obj9;
                final x16 x16Var5 = (x16) obj10;
                final Context context = (Context) obj8;
                final a26 a26Var3 = (a26) obj5;
                final a26 a26Var4 = (a26) obj4;
                final a26 a26Var5 = (a26) obj7;
                final a26 a26Var6 = (a26) obj6;
                xw9 xw9Var = (xw9) obj;
                l46 l46Var4 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= l46Var4.g(xw9Var) ? 4 : 2;
                }
                if (!l46Var4.W(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    l46Var4.Z();
                } else {
                    WeakHashMap weakHashMap = m8g.w;
                    final float fA = m93.q(q7c.k(l46Var4).l, l46Var4).a();
                    j09 j09VarY = ynb.Y(b.c, xw9Var);
                    Object objR5 = l46Var4.R();
                    if (objR5 == i8cVar) {
                        objR5 = new tk6(0);
                        l46Var4.p0(objR5);
                    }
                    kn2.c(fl6Var, j09VarY, null, null, null, (a26) objR5, af1.b0(1655981930, new o26() { // from class: uk6
                        @Override // defpackage.o26
                        public final Object t(Object obj11, Object obj12, Object obj13, Object obj14) {
                            String strI;
                            bc4 bc4Var;
                            fl6 fl6Var2 = (fl6) obj12;
                            l46 l46Var5 = (l46) obj13;
                            int iIntValue7 = ((Integer) obj14).intValue();
                            ((ly) obj11).getClass();
                            fl6Var2.getClass();
                            if ((iIntValue7 & 48) == 0) {
                                iIntValue7 |= l46Var5.g(fl6Var2) ? 32 : 16;
                            }
                            if (!l46Var5.W(iIntValue7 & 1, (iIntValue7 & 145) != 144)) {
                                l46Var5.Z();
                            } else if (fl6Var2.equals(cl6.a)) {
                                l46Var5.f0(1363367383);
                                al6.c(0, l46Var5);
                                l46Var5.r(false);
                            } else if (fl6Var2.equals(dl6.a)) {
                                l46Var5.f0(1363441504);
                                FillElement fillElement = b.c;
                                xn8 xn8VarC = s21.c(ndb.f, false);
                                int iHashCode2 = Long.hashCode(l46Var5.T);
                                u8a u8aVarM2 = l46Var5.m();
                                j09 j09VarJ2 = m93.J(l46Var5, fillElement);
                                lf2.q.getClass();
                                l46Var5.j0();
                                if (l46Var5.S) {
                                    l46Var5.l(LayoutNode.h1);
                                } else {
                                    l46Var5.s0();
                                }
                                dec.l(hj6.z, l46Var5, xn8VarC);
                                dec.l(hj6.y, l46Var5, u8aVarM2);
                                dec.l(hj6.X, l46Var5, Integer.valueOf(iHashCode2));
                                dec.k(l46Var5);
                                dec.l(hj6.x, l46Var5, j09VarJ2);
                                axa.a(0.0f, 0.0f, 0, 0, 61, ((m82) l46Var5.k(o82.a)).p, 0L, l46Var5, null);
                                l46Var5.r(true);
                                l46Var5.r(false);
                            } else {
                                if (!(fl6Var2 instanceof el6)) {
                                    throw tec.d(-2034227386, l46Var5, false);
                                }
                                l46Var5.f0(1363813876);
                                j18 j18VarA = k18.a(0, 3, l46Var5);
                                el6 el6Var = (el6) fl6Var2;
                                boolean zH = l46Var5.h(el6Var.c) | l46Var5.h(el6Var.b);
                                Object objR6 = l46Var5.R();
                                i8c i8cVar2 = sf2.a;
                                if (zH || objR6 == i8cVar2) {
                                    objR6 = zrd.b(new jf6(4, fl6Var2, j18VarA));
                                    l46Var5.p0(objR6);
                                }
                                h0e h0eVar = (h0e) objR6;
                                Boolean bool = (Boolean) h0eVar.getValue();
                                bool.booleanValue();
                                boolean zG3 = l46Var5.g(h0eVar);
                                x16 x16Var6 = x16Var5;
                                boolean zG4 = zG3 | l46Var5.g(x16Var6);
                                Object objR7 = l46Var5.R();
                                if (zG4 || objR7 == i8cVar2) {
                                    objR7 = new vk6(x16Var6, h0eVar, null);
                                    l46Var5.p0(objR7);
                                }
                                af1.o((l26) objR7, l46Var5, bool);
                                Object[] objArr = new Object[0];
                                Object objR8 = l46Var5.R();
                                if (objR8 == i8cVar2) {
                                    objR8 = new w66(25);
                                    l46Var5.p0(objR8);
                                }
                                e89 e89Var = (e89) vfh.I(objArr, (x16) objR8, l46Var5, 48);
                                boolean zG5 = l46Var5.g(j18VarA) | l46Var5.g(e89Var);
                                Object objR9 = l46Var5.R();
                                if (zG5 || objR9 == i8cVar2) {
                                    objR9 = new wk6(j18VarA, e89Var, null);
                                    l46Var5.p0(objR9);
                                }
                                af1.o((l26) objR9, l46Var5, j18VarA);
                                List list2 = (List) s72.w0(el6Var.a.values());
                                if (list2 == null || (bc4Var = (bc4) s72.x0(list2)) == null) {
                                    strI = null;
                                } else if (bc4Var instanceof zb4) {
                                    strI = ((zb4) bc4Var).a;
                                } else {
                                    if (!(bc4Var instanceof ac4)) {
                                        ap.c();
                                        return null;
                                    }
                                    strI = ks0.i(((ac4) bc4Var).a, "qd_");
                                }
                                Boolean bool2 = (Boolean) e89Var.getValue();
                                bool2.booleanValue();
                                boolean zG6 = l46Var5.g(e89Var) | l46Var5.g(strI) | l46Var5.g(j18VarA);
                                Object objR10 = l46Var5.R();
                                if (zG6 || objR10 == i8cVar2) {
                                    objR10 = new xk6(strI, j18VarA, e89Var, null);
                                    l46Var5.p0(objR10);
                                }
                                af1.p(strI, bool2, (l26) objR10, l46Var5);
                                FillElement fillElement2 = b.c;
                                float f = eze.a(l46Var5).c.a;
                                bx9 bx9VarW = g21.W(new bx9(f, f, f, f), ynb.r(0.0f, 0.0f, 0.0f, eze.a(l46Var5).c.a + fA, 7), l46Var5);
                                uc0 uc0Var2 = new uc0(12.0f, true, new qc0(0));
                                boolean z2 = (iIntValue7 & 112) == 32;
                                Context context2 = context;
                                boolean zI2 = l46Var5.i(context2) | z2;
                                a26 a26Var7 = a26Var3;
                                boolean zG7 = zI2 | l46Var5.g(a26Var7);
                                a26 a26Var8 = a26Var4;
                                boolean zG8 = zG7 | l46Var5.g(a26Var8);
                                a26 a26Var9 = a26Var5;
                                boolean zG9 = zG8 | l46Var5.g(a26Var9);
                                a26 a26Var10 = a26Var6;
                                boolean zG10 = zG9 | l46Var5.g(a26Var10);
                                Object objR11 = l46Var5.R();
                                if (zG10 || objR11 == i8cVar2) {
                                    k11 k11Var = new k11(fl6Var2, context2, a26Var7, a26Var8, a26Var9, a26Var10, 4);
                                    l46Var5.p0(k11Var);
                                    objR11 = k11Var;
                                }
                                af1.s(fillElement2, j18VarA, bx9VarW, uc0Var2, null, null, false, null, (a26) objR11, l46Var5, 24582, 488);
                                l46Var5.r(false);
                            }
                            return wef.a;
                        }
                    }, l46Var4), l46Var4, 1769472, 28);
                }
                break;
            default:
                x16 x16Var6 = (x16) obj10;
                String str3 = (String) obj9;
                String str4 = (String) obj8;
                r4g r4gVar = (r4g) obj7;
                aw2 aw2Var = (aw2) obj6;
                ted tedVar = (ted) obj5;
                x16 x16Var7 = (x16) obj4;
                c31 c31Var = (c31) obj;
                l46 l46Var5 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                c31Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= l46Var5.g(c31Var) ? 4 : 2;
                }
                int i2 = iIntValue7;
                if (!l46Var5.W(i2 & 1, (i2 & 19) != 18)) {
                    l46Var5.Z();
                } else {
                    j09 j09VarZ = ynb.Z(j09VarA, 32.0f);
                    c92 c92VarA2 = a92.a(new uc0(24.0f, true, new qc0(0)), ndb.Y, l46Var5, 6);
                    int iHashCode2 = Long.hashCode(l46Var5.T);
                    u8a u8aVarM2 = l46Var5.m();
                    j09 j09VarJ2 = m93.J(l46Var5, j09VarZ);
                    lf2.q.getClass();
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    dec.l(hj6.z, l46Var5, c92VarA2);
                    dec.l(hj6.y, l46Var5, u8aVarM2);
                    dec.l(hj6.X, l46Var5, Integer.valueOf(iHashCode2));
                    dec.k(l46Var5);
                    dec.l(hj6.x, l46Var5, j09VarJ2);
                    t4c.f(0, 3, l46Var5, null, false);
                    String strQ2 = afc.q(R.string.widget_onboarding_guide_cta_popup, l46Var5);
                    boolean zG3 = l46Var5.g(str3) | l46Var5.g(str4) | l46Var5.e(r4gVar.ordinal()) | l46Var5.i(aw2Var) | l46Var5.g(tedVar) | l46Var5.g(x16Var7);
                    Object objR6 = l46Var5.R();
                    if (zG3 || objR6 == i8cVar) {
                        objR6 = new xi3(str3, str4, r4gVar, aw2Var, tedVar, x16Var7, 6);
                        l46Var5.p0(objR6);
                    }
                    t4c.g(strQ2, (x16) objR6, null, l46Var5, 0, 4);
                    l46Var5.r(true);
                    v2c.f(c31Var, x16Var6, l46Var5, i2 & 14);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ aq1(fl6 fl6Var, x16 x16Var, Context context, a26 a26Var, a26 a26Var2, a26 a26Var3, a26 a26Var4) {
        this.a = 3;
        this.b = fl6Var;
        this.c = x16Var;
        this.d = context;
        this.g = a26Var;
        this.v = a26Var2;
        this.e = a26Var3;
        this.f = a26Var4;
    }

    public /* synthetic */ aq1(Object obj, Object obj2, Object obj3, Object obj4, m26 m26Var, m26 m26Var2, m26 m26Var3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = m26Var;
        this.g = m26Var2;
        this.v = m26Var3;
    }

    public /* synthetic */ aq1(ArrayList arrayList, mue mueVar, aue aueVar, ArrayList arrayList2, mue mueVar2, mld mldVar, TarotSkinIdentify tarotSkinIdentify) {
        this.a = 2;
        this.b = arrayList;
        this.c = mueVar;
        this.d = aueVar;
        this.f = arrayList2;
        this.g = mueVar2;
        this.v = mldVar;
        this.e = tarotSkinIdentify;
    }
}
