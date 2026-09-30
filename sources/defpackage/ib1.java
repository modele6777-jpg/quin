package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ib1 implements n26 {
    public static final ib1 b = new ib1(0);
    public static final ib1 c = new ib1(1);
    public static final ib1 d = new ib1(2);
    public static final ib1 e = new ib1(3);
    public static final ib1 f = new ib1(4);
    public static final ib1 g = new ib1(5);
    public static final ib1 v = new ib1(6);
    public final /* synthetic */ int a;

    public /* synthetic */ ib1(int i) {
        this.a = i;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                try {
                    ks0.u((ryb) obj2);
                    break;
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused) {
                }
                return wefVar;
            case 1:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                }
                return wefVar;
            case 2:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                }
                return wefVar;
            case 3:
                ((Number) obj3).intValue();
                return wefVar;
            case 4:
                return wefVar;
            case 5:
                return null;
            case 6:
                sn4 sn4Var = (sn4) obj;
                long j = ((hl9) obj2).a;
                long j2 = ((y72) obj3).a;
                uod uodVar = uod.a;
                sn4.w0(sn4Var, j2, sn4Var.p0(uod.c) / 2.0f, j, null, 120);
                return wefVar;
            case 7:
                l46 l46Var3 = (l46) obj2;
                ((Number) obj3).intValue();
                bx9 bx9Var = kz1.a;
                l46Var3.f0(1575618259);
                l46Var3.r(false);
                Object objR = l46Var3.R();
                if (objR == i8cVar) {
                    objR = q1c.f(null);
                    l46Var3.p0(objR);
                }
                e89 e89Var = (e89) objR;
                xn8 xn8VarC = s21.c(ndb.f, false);
                int iW = an1.w(l46Var3);
                u8a u8aVarM = l46Var3.m();
                j09 j09VarJ = m93.J(l46Var3, g09Var);
                lf2.q.getClass();
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                dec.l(hj6.z, l46Var3, xn8VarC);
                dec.l(hj6.y, l46Var3, u8aVarM);
                he2 he2Var = hj6.X;
                if (l46Var3.S || !pa7.t(l46Var3.R(), Integer.valueOf(iW))) {
                    tec.r(iW, l46Var3, iW, he2Var);
                }
                dec.l(hj6.x, l46Var3, j09VarJ);
                l26 l26Var = (l26) e89Var.getValue();
                if (l26Var == null) {
                    l46Var3.f0(-1538103400);
                } else {
                    l46Var3.f0(-326710903);
                    l26Var.z(l46Var3, 0);
                }
                l46Var3.r(false);
                l46Var3.r(true);
                return wefVar;
            default:
                l46 l46Var4 = (l46) obj2;
                ((Number) obj3).intValue();
                bx9 bx9Var2 = kz1.a;
                l46Var4.f0(-1218863531);
                l46Var4.r(false);
                Object objR2 = l46Var4.R();
                if (objR2 == i8cVar) {
                    objR2 = q1c.f(null);
                    l46Var4.p0(objR2);
                }
                e89 e89Var2 = (e89) objR2;
                xn8 xn8VarC2 = s21.c(ndb.f, false);
                int iW2 = an1.w(l46Var4);
                u8a u8aVarM2 = l46Var4.m();
                j09 j09VarJ2 = m93.J(l46Var4, g09Var);
                lf2.q.getClass();
                l46Var4.j0();
                if (l46Var4.S) {
                    l46Var4.l(ov7Var);
                } else {
                    l46Var4.s0();
                }
                dec.l(hj6.z, l46Var4, xn8VarC2);
                dec.l(hj6.y, l46Var4, u8aVarM2);
                he2 he2Var2 = hj6.X;
                if (l46Var4.S || !pa7.t(l46Var4.R(), Integer.valueOf(iW2))) {
                    tec.r(iW2, l46Var4, iW2, he2Var2);
                }
                dec.l(hj6.x, l46Var4, j09VarJ2);
                l26 l26Var2 = (l26) e89Var2.getValue();
                if (l26Var2 == null) {
                    l46Var4.f0(-2101783313);
                } else {
                    l46Var4.f0(-344894126);
                    l26Var2.z(l46Var4, 0);
                }
                l46Var4.r(false);
                l46Var4.r(true);
                return wefVar;
        }
    }
}
