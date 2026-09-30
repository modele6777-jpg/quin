package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import tech.chatmind.api.personality.PersonalitySection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qi3 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qi3(ghc ghcVar, iwd iwdVar, List list, use useVar, fo5 fo5Var, a26 a26Var) {
        this.a = 8;
        this.c = ghcVar;
        this.d = iwdVar;
        this.e = list;
        this.f = useVar;
        this.g = fo5Var;
        this.b = a26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        int i2 = 18;
        wef wefVar = wef.a;
        Object obj4 = this.c;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.b;
        int i3 = 0;
        switch (i) {
            case 0:
                a26 a26Var = (a26) obj9;
                e89 e89Var = (e89) obj4;
                e89 e89Var2 = (e89) obj8;
                e89 e89Var3 = (e89) obj7;
                e89 e89Var4 = (e89) obj6;
                e89 e89Var5 = (e89) obj5;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
                String str = (String) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                tarotSkinIdentify.getClass();
                str.getClass();
                if (((xh3) e89Var.getValue()) == xh3.a) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("playcard_gesture"), new so2(str, tarotSkinIdentify, zBooleanValue, 1), 2);
                    a26Var.d(tarotSkinIdentify);
                    Boolean bool = Boolean.FALSE;
                    e89Var2.setValue(bool);
                    e89Var3.setValue(Boolean.TRUE);
                    e89Var4.setValue(bool);
                    e89Var5.setValue(bool);
                    e89Var.setValue(xh3.b);
                }
                break;
            case 1:
                x16 x16Var = (x16) obj4;
                fh4 fh4Var = (fh4) obj8;
                a26 a26Var2 = (a26) obj9;
                s69 s69Var = (s69) obj7;
                x16 x16Var2 = (x16) obj6;
                x16 x16Var3 = (x16) obj5;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    xdc.a(b.c, af1.b0(-1547089315, new q8(x16Var, (Object) fh4Var, (Object) a26Var2, (h0e) s69Var, 15), l46Var), af1.b0(942374686, new b20(x16Var2, x16Var3, false, 3), l46Var), null, null, 0, y72.j, 0L, null, af1.b0(569615208, new j41(fh4Var, x16Var2, s69Var, 1), l46Var), l46Var, 806879670, 440);
                }
                break;
            case 2:
                Integer num = (Integer) obj4;
                sdd sddVar = (sdd) obj8;
                xw9 xw9Var = (xw9) obj7;
                a26 a26Var3 = (a26) obj9;
                l26 l26Var = (l26) obj6;
                x16 x16Var4 = (x16) obj5;
                oz ozVar = (oz) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ozVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? l46Var2.g(ozVar) : l46Var2.i(ozVar) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                } else if (num != null) {
                    l46Var2.f0(725177496);
                    g21.c(sddVar, ynb.Y(g21.B(g09Var, true, new r02(15)).D(b.c), xw9Var), num.intValue(), ozVar, a26Var3, l26Var, x16Var4, l46Var2, (iIntValue2 << 9) & 7168);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(725177495);
                    l46Var2.r(false);
                }
                break;
            case 3:
                nsb nsbVar = (nsb) obj4;
                iwa iwaVar = (iwa) obj8;
                x16 x16Var5 = (x16) obj7;
                a26 a26Var4 = (a26) obj9;
                x16 x16Var6 = (x16) obj6;
                x16 x16Var7 = (x16) obj5;
                c31 c31Var = (c31) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                c31Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.g(c31Var) ? 4 : 2;
                }
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    l46Var3.Z();
                } else {
                    FillElement fillElement = b.c;
                    feg.j(od4.A(R.drawable.bg_personality, 0, l46Var3), null, fillElement, null, an2.a, 0.0f, null, l46Var3, 25016, 104);
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var3, 48);
                    int iHashCode = Long.hashCode(l46Var3.T);
                    u8a u8aVarM = l46Var3.m();
                    j09 j09VarJ = m93.J(l46Var3, fillElement);
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
                    y7h.g(mh3.W(tm7.o(g09Var, y72.b(((m82) l46Var3.k(o82.a)).p, ((qz9) g21.Z(mh3.T(l46Var3), l46Var3)).j()), g21.f)), null, null, 0L, x16Var6, x16Var7, l46Var3, 0, 14);
                    kj0.J(nsbVar.c, l46Var3, 0);
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    kj0.d(j09VarC.D(new jw7(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), nsbVar.b, l46Var3, 6 | (PersonalitySection.$stable << 6));
                    l46Var3.r(true);
                    kj0.B(c31Var.a(ynb.d0(0.0f, 12.0f, 0.0f, 0.0f, 13, mh3.N(g09Var)), ndb.w), nsbVar.d, iwaVar, x16Var5, a26Var4, l46Var3, 512);
                }
                break;
            case 4:
                x16 x16Var8 = (x16) obj4;
                a29 a29Var = (a29) obj8;
                a26 a26Var5 = (a26) obj9;
                s69 s69Var2 = (s69) obj7;
                x16 x16Var9 = (x16) obj6;
                a26 a26Var6 = (a26) obj5;
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    l46Var4.Z();
                } else {
                    xdc.a(b.c, af1.b0(254638776, new r19(x16Var8, a29Var, a26Var5, s69Var2, 0), l46Var4), af1.b0(-1618574761, new m65(x16Var9, a29Var, a26Var6, 16), l46Var4), null, null, 0, y72.j, 0L, null, af1.b0(289243597, new j41(a29Var, x16Var9, s69Var2, 11), l46Var4), l46Var4, 806879670, 440);
                }
                break;
            case 5:
                x16 x16Var10 = (x16) obj8;
                v50 v50Var = (v50) obj7;
                e89 e89Var6 = (e89) obj4;
                x16 x16Var11 = (x16) obj6;
                a26 a26Var7 = (a26) obj9;
                String str2 = (String) obj5;
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    l46Var5.Z();
                } else {
                    xdc.a(b.c, af1.b0(-735306794, new m65(x16Var10, v50Var, e89Var6, i2), l46Var5), af1.b0(736971799, new m65(v50Var, x16Var11, a26Var7, 19), l46Var5), null, null, 0, y72.j, 0L, null, af1.b0(-254418079, new ob0(str2, 16), l46Var5), l46Var5, 806879670, 440);
                }
                break;
            case 6:
                wf3 wf3Var = (wf3) obj9;
                ma8 ma8Var = (ma8) obj7;
                e89 e89Var7 = (e89) obj4;
                ma8 ma8Var2 = (ma8) obj6;
                x16 x16Var12 = (x16) obj5;
                e89 e89Var8 = (e89) obj8;
                xw9 xw9Var2 = (xw9) obj;
                l46 l46Var6 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                xw9Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= l46Var6.g(xw9Var2) ? 4 : 2;
                }
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    l46Var6.Z();
                } else {
                    j09 j09VarZ = ynb.Z(mh3.d0(ynb.Y(b.c, xw9Var2), mh3.T(l46Var6), false, 14), 24.0f);
                    c92 c92VarA2 = a92.a(xc0.c, ndb.Z, l46Var6, 48);
                    ma8 ma8VarA = ma8Var;
                    int iHashCode2 = Long.hashCode(l46Var6.T);
                    u8a u8aVarM2 = l46Var6.m();
                    j09 j09VarJ2 = m93.J(l46Var6, j09VarZ);
                    lf2.q.getClass();
                    l46Var6.j0();
                    if (l46Var6.S) {
                        l46Var6.l(ov7Var);
                    } else {
                        l46Var6.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var6, c92VarA2);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var6, u8aVarM2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var6, numValueOf);
                    dec.k(l46Var6);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var6, j09VarJ2);
                    rs0.e(0, l46Var6, null, afc.q(R.string.onboarding_birthday_question, l46Var6));
                    o5c.f(l46Var6, b.d(g09Var, 24.0f));
                    xf3 xf3Var = (xf3) wf3Var;
                    Long lB = xf3Var.b();
                    if (lB != null) {
                        long jLongValue = lB.longValue();
                        th5 th5Var = cye.b;
                        th5Var.getClass();
                        w57 w57Var = w57.a;
                        ma8VarA = gcc.E(mh3.x(jLongValue), th5Var).a();
                    }
                    vdg vdgVarB = xdg.b(ma8VarA);
                    feg.j(od4.A(vdgVarB.a(), 0, l46Var6), null, b.l(g09Var, 130.0f), null, null, 0.0f, null, l46Var6, 440, 120);
                    String strQ = afc.q(vdgVarB.b(), l46Var6);
                    mue mueVar = pue.a;
                    mue mueVarC = pue.c(l46Var6);
                    pr4 pr4Var = l8b.a;
                    nte.b(strQ, null, ((e8b) l46Var6.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(mueVarC, 0L, 0L, null, null, w6c.k(k8b.f((e8b) l46Var6.k(pr4Var)) ? 0.102d : 0.085d), null, 0, 0L, null, null, 16777087), l46Var6, 0, 0, 130042);
                    ma8 ma8Var3 = ma8VarA;
                    j09 j09VarF = b.f(352.0f, 0.0f, kv2.e(g09Var, 24.0f, l46Var6, g09Var, 1.0f), 2);
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode3 = Long.hashCode(l46Var6.T);
                    u8a u8aVarM3 = l46Var6.m();
                    j09 j09VarJ3 = m93.J(l46Var6, j09VarF);
                    l46Var6.j0();
                    if (l46Var6.S) {
                        l46Var6.l(ov7Var);
                    } else {
                        l46Var6.s0();
                    }
                    dec.l(he2Var, l46Var6, xn8VarC);
                    dec.l(he2Var2, l46Var6, u8aVarM3);
                    ib8.s(iHashCode3, l46Var6, he2Var3, l46Var6);
                    dec.l(he2Var4, l46Var6, j09VarJ3);
                    j09 j09VarC2 = b.c(b.q(0.0f, 297.0f, g09Var, 1), 1.0f);
                    boolean zG = l46Var6.g(e89Var7);
                    Object objR = l46Var6.R();
                    if (zG || objR == i8cVar) {
                        objR = new vn9(e89Var7, 0);
                        l46Var6.p0(objR);
                    }
                    j09 j09VarA = ibe.a(j09VarC2, wefVar, (PointerInputEventHandler) objR);
                    boolean zG2 = l46Var6.g(x16Var12) | l46Var6.g(xf3Var);
                    Object objR2 = l46Var6.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new kz8(x16Var12, xf3Var, false, 10);
                        l46Var6.p0(objR2);
                    }
                    a26 a26Var8 = (a26) objR2;
                    Object objR3 = l46Var6.R();
                    if (objR3 == i8cVar) {
                        objR3 = new w77(e89Var8, 3);
                        l46Var6.p0(objR3);
                    }
                    mxb.d(ma8Var3, ma8Var2, a26Var8, (a26) objR3, j09VarA, l46Var6, 3072);
                    l46Var6.r(true);
                    l46Var6.r(true);
                }
                break;
            case 7:
                Context context = (Context) obj9;
                x16 x16Var13 = (x16) obj8;
                x16 x16Var14 = (x16) obj7;
                x16 x16Var15 = (x16) obj6;
                e89 e89Var9 = (e89) obj4;
                vz9 vz9Var = ((aba) obj5).d;
                c31 c31Var2 = (c31) obj;
                l46 l46Var7 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                c31Var2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= l46Var7.g(c31Var2) ? 4 : 2;
                }
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    l46Var7.Z();
                } else {
                    j09 j09VarD0 = ynb.d0(0.0f, 64.0f, 0.0f, 0.0f, 13, mh3.W(b.c));
                    String strJ = ib8.j("https://quin.love/quin-card-test-intro?lang=", vd8.d(), "&ap=android&av=5.23.0");
                    boolean zI = l46Var7.i(context);
                    Object objR4 = l46Var7.R();
                    if (zI || objR4 == i8cVar) {
                        objR4 = new i06(context, 4);
                        l46Var7.p0(objR4);
                    }
                    qk2.p(strJ, j09VarD0, (a26) objR4, null, null, null, l46Var7, 0, 120);
                    pa7.a(c31Var2.a(mh3.W(b.c(g09Var, 1.0f)), ndb.c), 0L, 0L, null, if9.d, af1.b0(1220059722, new ht5(x16Var14, x16Var15, 3), l46Var7), false, false, x16Var13, l46Var7, 221184, 206);
                    j09 j09VarA2 = c31Var2.a(tm7.o(oa7.E(b.d(ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(16.0f, 0.0f, mh3.N(b.c(g09Var, 1.0f)), 2)), 56.0f), a7c.a()), ((m82) l46Var7.k(o82.a)).a, g21.f), ndb.w);
                    Object objR5 = l46Var7.R();
                    if (objR5 == i8cVar) {
                        objR5 = new x08(e89Var9, 22);
                        l46Var7.p0(objR5);
                    }
                    j09 j09VarC3 = androidx.compose.foundation.b.c(j09VarA2, false, null, null, (x16) objR5, 15);
                    c92 c92VarA3 = a92.a(new uc0(0.0f, false, new jv2(2, ndb.z)), ndb.Z, l46Var7, 54);
                    int iHashCode4 = Long.hashCode(l46Var7.T);
                    u8a u8aVarM4 = l46Var7.m();
                    j09 j09VarJ4 = m93.J(l46Var7, j09VarC3);
                    lf2.q.getClass();
                    l46Var7.j0();
                    if (l46Var7.S) {
                        l46Var7.l(ov7Var);
                    } else {
                        l46Var7.s0();
                    }
                    dec.l(hj6.z, l46Var7, c92VarA3);
                    dec.l(hj6.y, l46Var7, u8aVarM4);
                    dec.l(hj6.X, l46Var7, Integer.valueOf(iHashCode4));
                    dec.k(l46Var7);
                    dec.l(hj6.x, l46Var7, j09VarJ4);
                    String strQ2 = afc.q(R.string.personality_test_right_now, l46Var7);
                    mue mueVar2 = pue.a;
                    mue mueVarA = pue.a(l46Var7);
                    pr4 pr4Var2 = l8b.a;
                    nte.b(strQ2, null, ((e8b) l46Var7.k(pr4Var2)).v, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var7, 0, 0, 131066);
                    if (((Number) vz9Var.getValue()).intValue() > 0) {
                        l46Var7.f0(-163477891);
                        nte.b(afc.r(R.string.personal_test_remain_count, new Object[]{Integer.valueOf(((Number) vz9Var.getValue()).intValue())}, l46Var7), null, ((e8b) l46Var7.k(pr4Var2)).w, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var7), l46Var7, 0, 0, 131066);
                        l46Var7.r(false);
                    } else {
                        l46Var7.f0(-163287365);
                        l46Var7.r(false);
                    }
                    l46Var7.r(true);
                }
                break;
            case 8:
                ghc ghcVar = (ghc) obj4;
                iwd iwdVar = (iwd) obj8;
                sz9 sz9Var = iwdVar.d;
                List list = (List) obj7;
                use useVar = (use) obj6;
                fo5 fo5Var = (fo5) obj5;
                a26 a26Var9 = (a26) obj9;
                xw9 xw9Var3 = (xw9) obj;
                l46 l46Var8 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                xw9Var3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= l46Var8.g(xw9Var3) ? 4 : 2;
                }
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    l46Var8.Z();
                } else {
                    jgb.l(0, l46Var8);
                    j09 j09VarB0 = ynb.b0(32.0f, 0.0f, mh3.d0(ynb.Y(b.c, xw9Var3), ghcVar, false, 14), 2);
                    c92 c92VarA4 = a92.a(xc0.c, ndb.Z, l46Var8, 48);
                    int iHashCode5 = Long.hashCode(l46Var8.T);
                    u8a u8aVarM5 = l46Var8.m();
                    j09 j09VarJ5 = m93.J(l46Var8, j09VarB0);
                    lf2.q.getClass();
                    l46Var8.j0();
                    if (l46Var8.S) {
                        l46Var8.l(ov7Var);
                    } else {
                        l46Var8.s0();
                    }
                    dec.l(hj6.z, l46Var8, c92VarA4);
                    dec.l(hj6.y, l46Var8, u8aVarM5);
                    dec.l(hj6.X, l46Var8, Integer.valueOf(iHashCode5));
                    dec.k(l46Var8);
                    dec.l(hj6.x, l46Var8, j09VarJ5);
                    o5c.f(l46Var8, b.d(g09Var, 12.0f));
                    o8c.a(sz9Var.j() + 1, 0, l46Var8);
                    nte.b(ks0.h(8.0f, R.string.card_meaning_subtitle, l46Var8, l46Var8, g09Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jgb.T(l46Var8), l46Var8, 0, 0, 131070);
                    o5c.f(l46Var8, b.d(g09Var, 8.0f));
                    n16.h(list.size(), sz9Var.j(), b.c(g09Var, 1.0f), false, null, af1.b0(223482525, new ed2(17), l46Var8), l46Var8, 196992, 24);
                    o5c.f(l46Var8, b.d(g09Var, 8.0f));
                    int i4 = (iwdVar.c || iwdVar.h()) ? 7 : 6;
                    boolean zI2 = l46Var8.i(iwdVar) | l46Var8.g(a26Var9);
                    Object objR6 = l46Var8.R();
                    if (zI2 || objR6 == i8cVar) {
                        z = true;
                        objR6 = new cwd(iwdVar, a26Var9, 1);
                        l46Var8.p0(objR6);
                    } else {
                        z = true;
                    }
                    o8c.c(useVar, fo5Var, i4, (x16) objR6, null, l46Var8, 48);
                    l46Var8.r(z);
                }
                break;
            default:
                u4g u4gVar = (u4g) obj9;
                String str3 = (String) obj8;
                String str4 = (String) obj7;
                x16 x16Var16 = (x16) obj6;
                x16 x16Var17 = (x16) obj5;
                e89 e89Var10 = (e89) obj4;
                c31 c31Var3 = (c31) obj;
                l46 l46Var9 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                c31Var3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= l46Var9.g(c31Var3) ? 4 : 2;
                }
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    l46Var9.Z();
                } else {
                    k8b.a(af1.b0(1373273977, new i4g(c31Var3, i3), l46Var9), l46Var9, 6);
                    boolean zK = v2c.k(e89Var10);
                    Object objR7 = l46Var9.R();
                    if (objR7 == i8cVar) {
                        objR7 = new xfc(e89Var10, 20);
                        l46Var9.p0(objR7);
                    }
                    x16 x16Var18 = (x16) objR7;
                    boolean zG3 = l46Var9.g(str3) | l46Var9.g(str4) | l46Var9.g(x16Var16);
                    Object objR8 = l46Var9.R();
                    if (zG3 || objR8 == i8cVar) {
                        objR8 = new smc(str3, str4, x16Var16, 12);
                        l46Var9.p0(objR8);
                    }
                    v2c.i(u4gVar, zK, x16Var18, (x16) objR8, l46Var9, 384);
                    v2c.f(c31Var3, x16Var17, l46Var9, 14 & iIntValue9);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ qi3(x16 x16Var, v50 v50Var, e89 e89Var, x16 x16Var2, a26 a26Var, String str) {
        this.a = 5;
        this.d = x16Var;
        this.e = v50Var;
        this.c = e89Var;
        this.f = x16Var2;
        this.b = a26Var;
        this.g = str;
    }

    public /* synthetic */ qi3(x16 x16Var, Object obj, a26 a26Var, s69 s69Var, x16 x16Var2, m26 m26Var, int i) {
        this.a = i;
        this.c = x16Var;
        this.d = obj;
        this.b = a26Var;
        this.e = s69Var;
        this.f = x16Var2;
        this.g = m26Var;
    }

    public /* synthetic */ qi3(a26 a26Var, e89 e89Var, e89 e89Var2, e89 e89Var3, e89 e89Var4, e89 e89Var5) {
        this.a = 0;
        this.b = a26Var;
        this.c = e89Var;
        this.d = e89Var2;
        this.e = e89Var3;
        this.f = e89Var4;
        this.g = e89Var5;
    }

    public /* synthetic */ qi3(wf3 wf3Var, ma8 ma8Var, e89 e89Var, ma8 ma8Var2, x16 x16Var, e89 e89Var2) {
        this.a = 6;
        this.b = wf3Var;
        this.e = ma8Var;
        this.c = e89Var;
        this.f = ma8Var2;
        this.g = x16Var;
        this.d = e89Var2;
    }

    public /* synthetic */ qi3(u4g u4gVar, String str, String str2, x16 x16Var, x16 x16Var2, e89 e89Var) {
        this.a = 9;
        this.b = u4gVar;
        this.d = str;
        this.e = str2;
        this.f = x16Var;
        this.g = x16Var2;
        this.c = e89Var;
    }

    public /* synthetic */ qi3(Context context, x16 x16Var, x16 x16Var2, x16 x16Var3, e89 e89Var, aba abaVar) {
        this.a = 7;
        this.b = context;
        this.d = x16Var;
        this.e = x16Var2;
        this.f = x16Var3;
        this.c = e89Var;
        this.g = abaVar;
    }

    public /* synthetic */ qi3(Object obj, Object obj2, Object obj3, a26 a26Var, m26 m26Var, x16 x16Var, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = a26Var;
        this.f = m26Var;
        this.g = x16Var;
    }
}
