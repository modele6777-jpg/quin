package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k43 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k43(float f, Object obj, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        float f = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                d63 d63Var = (d63) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var.W(1 & iIntValue, (iIntValue & 17) != 16)) {
                    k8b.a(af1.b0(-601313837, new m43(d63Var, 0), l46Var), l46Var, 6);
                    k8b.b(af1.b0(-246995046, new xh1(d63Var, f), l46Var), l46Var, 6);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                h0e h0eVar = (h0e) obj4;
                e31 e31Var = (e31) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                e31Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(e31Var) ? 4 : 2;
                }
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    j09 j09VarE = oa7.E(b.d(b.c(g09Var, 1.0f), f), a7c.a);
                    pr4 pr4Var = l8b.a;
                    j09 j09VarO = tm7.o(j09VarE, y72.b(((e8b) l46Var2.k(pr4Var)).u, 0.2f), g21.f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int i2 = iIntValue2;
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarO);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    s21.a(tm7.n(b.c(g09Var, ((Number) h0eVar.getValue()).floatValue()).D(b.b), gec.D(t72.I(new y72(((e8b) l46Var2.k(pr4Var)).u), new y72(abg.d(4290360831L)))), a7c.a(), 4), l46Var2, 0);
                    l46Var2.r(true);
                    j09 j09VarM = tm7.M(b.m(g09Var, 61.5f, 70.0f), -30.75f, 4.0f);
                    boolean zG = l46Var2.g(h0eVar) | ((i2 & 14) == 4);
                    Object objR = l46Var2.R();
                    if (zG || objR == i8cVar) {
                        objR = new kz8(28, e31Var, h0eVar);
                        l46Var2.p0(objR);
                    }
                    feg.j(od4.A(R.drawable.card_progress_indicator, 0, l46Var2), null, tm7.L(j09VarM, (a26) objR), null, null, 0.0f, null, l46Var2, 56, 120);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                t6b t6bVar = (t6b) obj4;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    if (!we6.e(l46Var3)) {
                        f = 0.0f;
                    }
                    j09 j09VarZ = ynb.Z(tq.M(l46Var3, ynb.b0(f, 0.0f, g09Var, 2)), 20.0f);
                    xn8 xn8VarC2 = s21.c(ndb.b, false);
                    int iHashCode2 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM2 = l46Var3.m();
                    j09 j09VarJ2 = m93.J(l46Var3, j09VarZ);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, xn8VarC2);
                    dec.l(hj6.y, l46Var3, u8aVarM2);
                    dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode2));
                    dec.k(l46Var3);
                    dec.l(hj6.x, l46Var3, j09VarJ2);
                    tq.j(0, l46Var3, null, t6bVar.d, t6bVar.e);
                    l46Var3.r(true);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                x16 x16Var = (x16) obj4;
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    tq.g(0, x16Var, l46Var4, ynb.a0(g09Var, f, 12.0f));
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                ii6 ii6Var = (ii6) obj4;
                j09 j09Var = (j09) obj;
                l46 l46Var5 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var.getClass();
                l46Var5.f0(-1548798996);
                long j = y72.j;
                ji6 ji6Var = new ji6(j, t72.H(new li6(j)), 24.0f, 0.0f, new li6(j));
                boolean zD = l46Var5.d(f);
                Object objR2 = l46Var5.R();
                if (zD || objR2 == i8cVar) {
                    objR2 = new uc2(9, f);
                    l46Var5.p0(objR2);
                }
                j09 j09VarI = z7f.I(j09Var, ii6Var, ji6Var, (a26) objR2);
                l46Var5.r(false);
                return j09VarI;
            default:
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj4;
                l46 l46Var6 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var6.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    o7c.d(b.c(g09Var, 1.0f), q7c.r(tarotCardChoice), null, false, null, eze.a(l46Var6).a.f, null, false, l46Var6, 6, 220);
                    ib8.r(f, -1377468183, l46Var6, l46Var6, g09Var);
                    j09 j09VarZ2 = ynb.Z(b.c(tm7.o(g09Var, y72.b, g21.f), 1.0f), 4.0f);
                    xn8 xn8VarC3 = s21.c(ndb.f, false);
                    int iHashCode3 = Long.hashCode(l46Var6.T);
                    u8a u8aVarM3 = l46Var6.m();
                    j09 j09VarJ3 = m93.J(l46Var6, j09VarZ2);
                    lf2.q.getClass();
                    l46Var6.j0();
                    if (l46Var6.S) {
                        l46Var6.l(ov7Var);
                    } else {
                        l46Var6.s0();
                    }
                    dec.l(hj6.z, l46Var6, xn8VarC3);
                    dec.l(hj6.y, l46Var6, u8aVarM3);
                    dec.l(hj6.X, l46Var6, Integer.valueOf(iHashCode3));
                    dec.k(l46Var6);
                    dec.l(hj6.x, l46Var6, j09VarJ3);
                    nte.b(afc.q(tarotCardChoice.getCard().getTitleRes(), l46Var6), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var6.k(nte.a), y72.e, w6c.l(12), null, null, w6c.k(0.07d), null, 0, 0L, null, null, 16777084), l46Var6, 0, 0, 131070);
                    l46Var6.r(true);
                    l46Var6.r(false);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ k43(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }
}
