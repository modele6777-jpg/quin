package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.io.Serializable;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j43 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j43(float f, List list, a26 a26Var, e89 e89Var) {
        this.a = 1;
        this.b = f;
        this.d = list;
        this.c = a26Var;
        this.e = e89Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        ov7 ov7Var = LayoutNode.h1;
        float f = this.b;
        wef wefVar = wef.a;
        g09 g09Var = g09.a;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                d63 d63Var = (d63) obj6;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj5;
                a26 a26Var = (a26) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    if (!we6.e(l46Var)) {
                        f = 0.0f;
                    }
                    j09 j09VarB0 = ynb.b0(0.0f, 20.0f, dj6.H(ynb.b0(f, 0.0f, g09Var, 2), l46Var, 1), 1);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarB0);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    String str = d63Var.a;
                    String str2 = d63Var.b;
                    TarotCardChoice tarotCardChoice = d63Var.c;
                    String str3 = d63Var.d;
                    boolean zG = l46Var.g(a26Var);
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new zh1(a26Var, 5);
                        l46Var.p0(objR);
                    }
                    dj6.e(str, str2, tarotCardChoice, str3, tarotSkinIdentify, (x16) objR, l46Var, 196608);
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                List list = (List) obj6;
                a26 a26Var2 = (a26) obj4;
                e89 e89Var = (e89) obj5;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    j09 j09VarB1 = ynb.b0(f, 0.0f, g09Var, 2);
                    boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                    boolean zG2 = l46Var2.g(e89Var);
                    Object objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new x08(e89Var, 17);
                        l46Var2.p0(objR2);
                    }
                    njb.c(0, (x16) objR2, a26Var2, l46Var2, j09VarB1, list, zBooleanValue);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                t6b t6bVar = (t6b) obj6;
                TarotCardChoice tarotCardChoice2 = (TarotCardChoice) obj5;
                l26 l26Var = (l26) obj4;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    if (!we6.e(l46Var3)) {
                        f = 0.0f;
                    }
                    j09 j09VarB2 = ynb.b0(0.0f, 20.0f, tq.M(l46Var3, ynb.b0(f, 0.0f, g09Var, 2)), 1);
                    xn8 xn8VarC2 = s21.c(ndb.b, false);
                    int iHashCode2 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM2 = l46Var3.m();
                    j09 j09VarJ2 = m93.J(l46Var3, j09VarB2);
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
                    tq.b(t6bVar.c, tarotCardChoice2, l26Var, l46Var3, 0);
                    l46Var3.r(true);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            default:
                kn2 kn2Var = (kn2) obj6;
                u51 u51Var = (u51) obj5;
                String str4 = (String) obj4;
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    l46Var4.Z();
                } else if (pa7.t(kn2Var, ed.E0)) {
                    l46Var4.f0(-1762517173);
                    axa.a(this.b, 0.0f, 0, 0, 56, u51Var.b, 0L, l46Var4, b.l(g09Var, v51.e));
                    l46Var4.r(false);
                } else {
                    if (!pa7.t(kn2Var, dd.E0)) {
                        throw tec.d(-333951255, l46Var4, false);
                    }
                    l46Var4.f0(-1762320013);
                    pr4 pr4Var = nte.a;
                    mue mueVar = pue.a;
                    mh3.a(pr4Var.a(pue.a(l46Var4)), af1.b0(607859818, new o8(str4, 26), l46Var4), l46Var4, 56);
                    l46Var4.r(false);
                }
                return wefVar;
        }
    }

    public /* synthetic */ j43(float f, Object obj, Serializable serializable, m26 m26Var, int i) {
        this.a = i;
        this.b = f;
        this.d = obj;
        this.e = serializable;
        this.c = m26Var;
    }

    public /* synthetic */ j43(kn2 kn2Var, u51 u51Var, float f, String str) {
        this.a = 3;
        this.d = kn2Var;
        this.e = u51Var;
        this.b = f;
        this.c = str;
    }
}
