package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yj3 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yj3(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        fy9 fy9VarA;
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        Object obj5 = this.d;
        Object obj6 = this.b;
        Object obj7 = this.c;
        int i2 = 6;
        boolean z = false;
        switch (i) {
            case 0:
                vw7 vw7Var = (vw7) obj;
                int iIntValue = ((Number) obj2).intValue();
                l46 l46Var = (l46) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                l26 l26Var = (l26) obj7;
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (l46Var.g(vw7Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= l46Var.e(iIntValue) ? 32 : 16;
                }
                if (!l46Var.W(i3 & 1, (i3 & 147) != 146)) {
                    l46Var.Z();
                } else {
                    TarotCardType tarotCardType = (TarotCardType) ((List) obj6).get(iIntValue);
                    l46Var.f0(651506317);
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    boolean zG = l46Var.g(l26Var) | l46Var.e(tarotCardType.ordinal());
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new n5(l26Var, tarotCardType, z, i2);
                        l46Var.p0(objR);
                    }
                    j09 j09VarC2 = androidx.compose.foundation.b.c(j09VarC, false, null, null, (x16) objR, 15);
                    c92 c92VarA = a92.a(new uc0(6.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarC2);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    o7c.d(vt1.a(b.c(g09Var, 1.0f), tarotCardType.getCardKey(), null, l46Var, 6, 14), new qhe(tarotCardType.getCardKey(), 1), (TarotSkinIdentify) obj5, false, null, 8.0f, null, false, l46Var, 196608, 216);
                    nte.b(afc.q(tarotCardType.getTitleRes(), l46Var), null, ((e8b) l46Var.k(l8b.a)).r, 0L, null, null, 0L, null, new jme(3), 0L, 2, false, 1, 0, null, pue.a, l46Var, 0, 24960, 109562);
                    l46Var.r(true);
                    l46Var.r(false);
                }
                break;
            case 1:
                mx7 mx7Var = (mx7) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l46 l46Var2 = (l46) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                a26 a26Var = (a26) obj7;
                e89 e89Var = (e89) obj5;
                int i4 = (iIntValue4 & 6) == 0 ? iIntValue4 | (l46Var2.g(mx7Var) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= l46Var2.e(iIntValue3) ? 32 : 16;
                }
                if (!l46Var2.W(i4 & 1, (i4 & 147) != 146)) {
                    l46Var2.Z();
                } else {
                    Locale locale = (Locale) ((Object[]) obj6)[iIntValue3];
                    l46Var2.f0(-1047384673);
                    locale.getClass();
                    boolean zT = pa7.t(vd8.c(locale), vd8.c((Locale) e89Var.getValue()));
                    boolean zG2 = l46Var2.g(locale) | l46Var2.g(a26Var);
                    Object objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new mz0(locale, a26Var, e89Var, 2);
                        l46Var2.p0(objR2);
                    }
                    vfh.e(locale, zT, (a26) objR2, l46Var2, 0);
                    jgb.t(6, 0, l46Var2, ynb.b0(24.0f, 0.0f, g09Var, 2));
                    l46Var2.r(false);
                }
                break;
            default:
                vw7 vw7Var2 = (vw7) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                l46 l46Var3 = (l46) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                xzf xzfVar = (xzf) obj7;
                int i5 = (iIntValue6 & 6) == 0 ? iIntValue6 | (l46Var3.g(vw7Var2) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i5 |= l46Var3.e(iIntValue5) ? 32 : 16;
                }
                if (!l46Var3.W(i5 & 1, (i5 & 147) != 146)) {
                    l46Var3.Z();
                } else {
                    rzf rzfVar = (rzf) ((List) obj6).get(iIntValue5);
                    l46Var3.f0(1181244532);
                    boolean zContains = ((Set) ((h0e) obj5).getValue()).contains(rzfVar);
                    j09 j09VarW = dj6.w(b.c(g09Var, 1.0f), 1.4f);
                    Integer numA = rzfVar.a();
                    if (numA == null) {
                        l46Var3.f0(1181489988);
                        l46Var3.r(false);
                        fy9VarA = null;
                    } else {
                        l46Var3.f0(1181489989);
                        fy9VarA = od4.A(numA.intValue(), 0, l46Var3);
                        l46Var3.r(false);
                    }
                    fy9 fy9Var = fy9VarA;
                    String strQ = afc.q(rzfVar.b(), l46Var3);
                    boolean zI = l46Var3.i(xzfVar) | l46Var3.e(rzfVar.ordinal());
                    Object objR3 = l46Var3.R();
                    if (zI || objR3 == i8cVar) {
                        objR3 = new tzf(xzfVar, rzfVar, 1);
                        l46Var3.p0(objR3);
                    }
                    af1.e(j09VarW, zContains, strQ, fy9Var, (a26) objR3, l46Var3, 4102);
                    l46Var3.r(false);
                }
                break;
        }
        return wefVar;
    }
}
