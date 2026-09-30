package defpackage;

import ai.askquin.ui.account.component.AuthOption;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc2 implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pc2(jkc jkcVar, xw9 xw9Var, mic micVar, boolean z, x16 x16Var, a26 a26Var) {
        this.d = jkcVar;
        this.e = xw9Var;
        this.f = micVar;
        this.b = z;
        this.c = x16Var;
        this.g = a26Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        ?? r12;
        jkc jkcVar;
        l46 l46Var;
        int i = this.a;
        boolean z = this.b;
        x16 x16Var = null;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        int i2 = 2;
        Object obj4 = this.c;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (i) {
            case 0:
                String str = (String) obj8;
                String str2 = (String) obj7;
                x16 x16Var2 = (x16) obj4;
                String str3 = (String) obj6;
                yxd yxdVar = (yxd) obj5;
                d92 d92Var = (d92) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                d92Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var2.g(d92Var) ? 4 : 2;
                }
                if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    int i3 = iIntValue & 14;
                    vd0.q(d92Var, null, str, l46Var2, i3, 1);
                    boolean z2 = !z;
                    vd0.p(d92Var, null, str2, z2, x16Var2, l46Var2, i3);
                    if (str3 == null) {
                        l46Var2.f0(-1099443667);
                        r12 = 0;
                        l46Var2.r(false);
                    } else {
                        r12 = 0;
                        l46Var2.f0(-1099443666);
                        vd0.C(0, l46Var2);
                        vd0.p(d92Var, null, str3, z2, x16Var2, l46Var2, i3);
                        l46Var2.r(false);
                    }
                    if (yxdVar == null) {
                        l46Var2.f0(-1099230449);
                        l46Var2.r(r12);
                    } else {
                        l46Var2.f0(-1099230448);
                        if (str3 == null || z) {
                            l46Var2.f0(674485958);
                            vd0.C(r12, l46Var2);
                            if (yxdVar instanceof xxd) {
                                l46Var2.f0(575949773);
                                vd0.p(d92Var, null, ((xxd) yxdVar).a, z2, x16Var2, l46Var2, i3);
                                l46Var2.r(r12);
                            } else {
                                if (!(yxdVar instanceof wxd)) {
                                    throw tec.d(575948139, l46Var2, r12);
                                }
                                l46Var2.f0(575956497);
                                wxd wxdVar = (wxd) yxdVar;
                                ynb.a(r12, l46Var2, null, wxdVar.a, wxdVar.b);
                                l46Var2.r(r12);
                            }
                            l46Var2.r(r12);
                        } else {
                            l46Var2.f0(674903993);
                            l46Var2.r(r12);
                        }
                        l46Var2.r(r12);
                    }
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 1:
                jkc jkcVar2 = (jkc) obj8;
                final xw9 xw9Var = (xw9) obj7;
                final mic micVar = (mic) obj6;
                final x16 x16Var3 = (x16) obj4;
                final a26 a26Var = (a26) obj5;
                final sdd sddVar = (sdd) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                sddVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var3.g(sddVar) ? 4 : 2;
                }
                int i4 = iIntValue2;
                if (l46Var3.W(i4 & 1, (i4 & 19) != 18)) {
                    boolean z3 = jkcVar2.g() == tn4.b;
                    Integer numH = jkcVar2.h();
                    boolean zI = l46Var3.i(jkcVar2);
                    Object objR = l46Var3.R();
                    if (zI || objR == i8cVar) {
                        jkcVar = jkcVar2;
                        l46Var = l46Var3;
                        d60 d60Var = new d60(1, jkcVar, jkc.class, "createSeasonalCard", "createSeasonalCard()Ltech/chatmind/api/TarotCardChoice;", 4, 4);
                        l46Var.p0(d60Var);
                        objR = d60Var;
                    } else {
                        jkcVar = jkcVar2;
                        l46Var = l46Var3;
                    }
                    a26 a26Var2 = (a26) objR;
                    boolean zI2 = l46Var.i(jkcVar);
                    Object objR2 = l46Var.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new v5c(2, jkcVar, jkc.class, "onCardConfirmed", "onCardConfirmed(Ltech/chatmind/api/TarotCardChoice;I)V", 0, 3);
                        l46Var.p0(objR2);
                    }
                    ym7 ym7Var = (ym7) objR2;
                    boolean zI3 = l46Var.i(jkcVar);
                    Object objR3 = l46Var.R();
                    if (zI3 || objR3 == i8cVar) {
                        yv9 yv9Var = new yv9(0, jkcVar, jkc.class, "onCardDiscard", "onCardDiscard()V", 0, 8);
                        l46Var.p0(yv9Var);
                        objR3 = yv9Var;
                    }
                    x16 x16Var4 = (x16) ((ym7) objR3);
                    final boolean z4 = this.b;
                    final jkc jkcVar3 = jkcVar;
                    b21.e(sddVar, null, xw9Var, numH, z3, a26Var2, (l26) ym7Var, x16Var4, af1.b0(-2001869617, new o26() { // from class: hkc
                        @Override // defpackage.o26
                        public final Object t(Object obj9, Object obj10, Object obj11, Object obj12) {
                            int i5;
                            c31 c31Var = (c31) obj9;
                            ft1 ft1Var = (ft1) obj10;
                            l46 l46Var4 = (l46) obj11;
                            int iIntValue3 = ((Integer) obj12).intValue();
                            c31Var.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                i5 = (l46Var4.g(c31Var) ? 4 : 2) | iIntValue3;
                            } else {
                                i5 = iIntValue3;
                            }
                            if ((iIntValue3 & 48) == 0) {
                                i5 |= l46Var4.g(ft1Var) ? 32 : 16;
                            }
                            if (l46Var4.W(i5 & 1, (i5 & 147) != 146)) {
                                jkc jkcVar4 = jkcVar3;
                                boolean zE = l46Var4.e(jkcVar4.q().ordinal());
                                Object objR4 = l46Var4.R();
                                i8c i8cVar2 = sf2.a;
                                if (zE || objR4 == i8cVar2) {
                                    objR4 = new egd();
                                    l46Var4.p0(objR4);
                                }
                                egd egdVar = (egd) objR4;
                                sw3 sw3Var = (sw3) l46Var4.k(zg2.h);
                                WeakHashMap weakHashMap = m8g.w;
                                float fA = m93.q(q7c.k(l46Var4).e, l46Var4).a();
                                Object objR5 = l46Var4.R();
                                if (objR5 == i8cVar2) {
                                    objR5 = kv2.f(0, l46Var4);
                                }
                                s69 s69Var = (s69) objR5;
                                sz9 sz9Var = (sz9) s69Var;
                                float fZ = sz9Var.j() > 0 ? sw3Var.Z(sz9Var.j()) : 148.0f + fA;
                                s21.a(g21.M(l46Var4, b.c), l46Var4, 0);
                                bx9 bx9VarR = ynb.r(0.0f, 0.0f, 0.0f, fZ, 7);
                                int i6 = jkc.Y;
                                sdd sddVar2 = sddVar;
                                mic micVar2 = micVar;
                                xw9 xw9Var2 = xw9Var;
                                vtb.g(sddVar2, jkcVar4, micVar2, egdVar, xw9Var2, bx9VarR, ft1Var, l46Var4, ((i5 << 15) & 3670016) | 64);
                                j09 j09VarY = ynb.Y(c31Var.a(g09.a, ndb.w), xw9Var2);
                                Object objR6 = l46Var4.R();
                                if (objR6 == i8cVar2) {
                                    objR6 = new pr1(s69Var, 9);
                                    l46Var4.p0(objR6);
                                }
                                j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(24.0f, 0.0f, mh3.N(ym8.D(j09VarY, (a26) objR6)), 2));
                                a26 a26Var3 = a26Var;
                                boolean zG = l46Var4.g(a26Var3) | l46Var4.i(jkcVar4);
                                Object objR7 = l46Var4.R();
                                if (zG || objR7 == i8cVar2) {
                                    objR7 = new ek9(29, a26Var3, jkcVar4);
                                    l46Var4.p0(objR7);
                                }
                                vtb.b(jkcVar4, egdVar, z4, x16Var3, (x16) objR7, j09VarD0, l46Var4, 8);
                            } else {
                                l46Var4.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, (i4 & 14) | 100663296, 1);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 2:
                jnc jncVar = (jnc) obj8;
                yk8 yk8Var = (yk8) obj7;
                a26 a26Var3 = (a26) obj6;
                s69 s69Var = (s69) obj4;
                e89 e89Var = (e89) obj5;
                xw9 xw9Var2 = (xw9) obj;
                l46 l46Var4 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                xw9Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var4.g(xw9Var2) ? 4 : 2;
                }
                if (l46Var4.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    FillElement fillElement = b.c;
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var4.T);
                    u8a u8aVarM = l46Var4.m();
                    j09 j09VarJ = m93.J(l46Var4, fillElement);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(LayoutNode.h1);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(hj6.z, l46Var4, xn8VarC);
                    dec.l(hj6.y, l46Var4, u8aVarM);
                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode));
                    dec.k(l46Var4);
                    dec.l(hj6.x, l46Var4, j09VarJ);
                    ghc ghcVarT = mh3.T(l46Var4);
                    sw3 sw3Var = (sw3) l46Var4.k(zg2.h);
                    WeakHashMap weakHashMap = m8g.w;
                    float fA = m93.q(q7c.k(l46Var4).e, l46Var4).a();
                    Object objR4 = l46Var4.R();
                    if (objR4 == i8cVar) {
                        objR4 = kv2.f(0, l46Var4);
                    }
                    s69 s69Var2 = (s69) objR4;
                    sz9 sz9Var = (sz9) s69Var2;
                    nk8.d(ynb.Y(fillElement, g21.W(xw9Var2, ynb.r(0.0f, 0.0f, 0.0f, (sz9Var.j() > 0 ? sw3Var.Z(sz9Var.j()) : 148.0f + fA) + 12.0f, 7), l46Var4)), null, af1.b0(-1261758255, new sz7(ghcVarT, jncVar, s69Var, e89Var, 14), l46Var4), l46Var4, 3072, 6);
                    j09 j09VarY = ynb.Y(d31.a.a(g09.a, ndb.w), xw9Var2);
                    Object objR5 = l46Var4.R();
                    if (objR5 == i8cVar) {
                        objR5 = new pr1(s69Var2, 10);
                        l46Var4.p0(objR5);
                    }
                    j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(24.0f, 0.0f, mh3.N(ym8.D(j09VarY, (a26) objR5)), 2));
                    boolean zF = jncVar.f();
                    boolean z5 = (s72.t0(jncVar.e).isEmpty() || jncVar.f()) ? false : true;
                    boolean zH = l46Var4.h(z) | l46Var4.i(yk8Var);
                    Object objR6 = l46Var4.R();
                    if (zH || objR6 == i8cVar) {
                        objR6 = new mv0(z, yk8Var, 9);
                        l46Var4.p0(objR6);
                    }
                    x16 x16Var5 = (x16) objR6;
                    boolean zH2 = l46Var4.h(z);
                    Object objR7 = l46Var4.R();
                    if (zH2 || objR7 == i8cVar) {
                        objR7 = new va4(z, s69Var, e89Var, 6);
                        l46Var4.p0(objR7);
                    }
                    x16 x16Var6 = (x16) objR7;
                    boolean zH3 = l46Var4.h(z) | l46Var4.g(a26Var3) | l46Var4.i(jncVar);
                    Object objR8 = l46Var4.R();
                    if (zH3 || objR8 == i8cVar) {
                        objR8 = new va4(z, a26Var3, jncVar, 7);
                        l46Var4.p0(objR8);
                    }
                    jzb.a(zF, z5, x16Var5, x16Var6, (x16) objR8, j09VarD0, l46Var4, 0);
                    l46Var4.r(true);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            default:
                qmf qmfVar = (qmf) obj8;
                vb2 vb2Var = (vb2) obj7;
                a26 a26Var4 = (a26) obj6;
                Context context = (Context) obj5;
                x16 x16Var7 = (x16) obj4;
                l46 l46Var5 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var5.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zI4 = l46Var5.i(qmfVar);
                    Object objR9 = l46Var5.R();
                    if (zI4 || objR9 == i8cVar) {
                        objR9 = new v5c(2, qmfVar, qmf.class, "mockDevLogin", "mockDevLogin$Quin_component_account_release(Ljava/lang/String;Z)V", 0, 15);
                        l46Var5.p0(objR9);
                    }
                    ym7 ym7Var2 = (ym7) objR9;
                    if (vb2Var == null) {
                        l46Var5.f0(790386774);
                    } else {
                        l46Var5.f0(790386775);
                        boolean zI5 = l46Var5.i(qmfVar) | l46Var5.i(vb2Var);
                        Object objR10 = l46Var5.R();
                        if (zI5 || objR10 == i8cVar) {
                            objR10 = new fhf(i2, qmfVar, vb2Var);
                            l46Var5.p0(objR10);
                        }
                        x16Var = (x16) objR10;
                    }
                    l46Var5.r(false);
                    x16 x16Var8 = x16Var;
                    AuthOption authOptionG = qmfVar.g();
                    use useVar = qmfVar.g;
                    boolean zBooleanValue = ((Boolean) qmfVar.w.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) qmfVar.y.getValue()).booleanValue();
                    boolean zI6 = l46Var5.i(qmfVar);
                    Object objR11 = l46Var5.R();
                    if (zI6 || objR11 == i8cVar) {
                        objR11 = new dne(1, qmfVar, qmf.class, "onPrivacyCheckedChange", "onPrivacyCheckedChange(Z)V", 0, 6);
                        l46Var5.p0(objR11);
                    }
                    ym7 ym7Var3 = (ym7) objR11;
                    boolean z6 = ((x16) qmfVar.z.getValue()) != null;
                    boolean zG = l46Var5.g(a26Var4) | l46Var5.i(context) | l46Var5.i(qmfVar);
                    Object objR12 = l46Var5.R();
                    if (zG || objR12 == i8cVar) {
                        objR12 = new bv9(a26Var4, context, qmfVar, 22);
                        l46Var5.p0(objR12);
                    }
                    a26 a26Var5 = (a26) objR12;
                    a26 a26Var6 = (a26) ym7Var3;
                    boolean zI7 = l46Var5.i(qmfVar) | l46Var5.g(a26Var4);
                    Object objR13 = l46Var5.R();
                    if (zI7 || objR13 == i8cVar) {
                        objR13 = new i2e(28, qmfVar, a26Var4);
                        l46Var5.p0(objR13);
                    }
                    aic.d(authOptionG, a26Var5, useVar, x16Var7, zBooleanValue2, a26Var6, z6, zBooleanValue, this.b, (a26) objR13, (l26) ym7Var2, x16Var8, l46Var5, 0, 0, 0);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ pc2(jnc jncVar, boolean z, yk8 yk8Var, a26 a26Var, s69 s69Var, e89 e89Var) {
        this.d = jncVar;
        this.b = z;
        this.e = yk8Var;
        this.f = a26Var;
        this.c = s69Var;
        this.g = e89Var;
    }

    public /* synthetic */ pc2(qmf qmfVar, vb2 vb2Var, a26 a26Var, Context context, x16 x16Var, boolean z) {
        this.d = qmfVar;
        this.e = vb2Var;
        this.f = a26Var;
        this.g = context;
        this.c = x16Var;
        this.b = z;
    }

    public /* synthetic */ pc2(String str, String str2, boolean z, x16 x16Var, String str3, yxd yxdVar) {
        this.d = str;
        this.e = str2;
        this.b = z;
        this.c = x16Var;
        this.f = str3;
        this.g = yxdVar;
    }
}
