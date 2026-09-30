package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g8 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ g8(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        boolean z = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else if (!z) {
                    l46Var.f0(63196885);
                    String strQ = afc.q(R.string.account_delete_account, l46Var);
                    long jD = abg.d(4294916912L);
                    mue mueVar = pue.a;
                    nte.b(strQ, null, jD, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var), l46Var, 384, 0, 131066);
                    l46Var.r(false);
                } else {
                    l46Var.f0(63037049);
                    axa.a(2.0f, 0.0f, 0, 384, 58, 0L, 0L, l46Var, b.l(g09Var, v51.e));
                    l46Var.r(false);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, g09Var);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, t7cVarA);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    j09 j09VarQ = b.q(0.0f, 100.0f, g09Var, 1);
                    String strQ2 = afc.q(R.string.spread_more, l46Var2);
                    mue mueVar2 = pue.a;
                    nte.b(strQ2, j09VarQ, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var2, 48, 0, 130044);
                    gu6.a(z ? if9.v() : bm8.z(), null, b.l(g09Var, 20.0f), 0L, l46Var2, 432, 8);
                    l46Var2.r(true);
                }
                break;
            case 2:
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var3.Z();
                } else {
                    nte.b(afc.q(z ? R.string.invitation_friends_to_try : R.string.invitation_button, l46Var3), null, 0L, 0L, ar5.d, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var3, 1572864, 0, 262078);
                }
                break;
            case 3:
                yge ygeVar = (yge) obj;
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? l46Var4.g(ygeVar) : l46Var4.i(ygeVar) ? 4 : 2;
                }
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    l46Var4.Z();
                } else if (ygeVar != null) {
                    l46Var4.f0(1449362130);
                    feg.k(ygeVar.a, null, b.c, an2.b, 0, l46Var4, 25008, 232);
                    l46Var4.r(false);
                } else if (!z) {
                    l46Var4.f0(-1061610692);
                    l46Var4.r(false);
                } else {
                    l46Var4.f0(-1061615972);
                    l46Var4.r(false);
                }
                break;
            case 4:
                xw9 xw9Var = (xw9) obj;
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= l46Var5.g(xw9Var) ? 4 : 2;
                }
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    l46Var5.Z();
                } else {
                    j09 j09VarD0 = ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, ynb.Y(b.c, xw9Var));
                    c92 c92VarA = a92.a(new uc0(8.0f, false, new jv2(2, ndb.y)), ndb.Z, l46Var5, 54);
                    int iHashCode2 = Long.hashCode(l46Var5.T);
                    u8a u8aVarM2 = l46Var5.m();
                    j09 j09VarJ2 = m93.J(l46Var5, j09VarD0);
                    lf2.q.getClass();
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    dec.l(hj6.z, l46Var5, c92VarA);
                    dec.l(hj6.y, l46Var5, u8aVarM2);
                    dec.l(hj6.X, l46Var5, Integer.valueOf(iHashCode2));
                    dec.k(l46Var5);
                    dec.l(hj6.x, l46Var5, j09VarJ2);
                    j09 j09VarB0 = ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                    String strQ3 = afc.q(R.string.annual_domain_pattern_title, l46Var5);
                    mue mueVar3 = pue.a;
                    mue mueVarP = pue.p(l46Var5);
                    pr4 pr4Var = x8b.a;
                    yp5 yp5Var = ((y8b) l46Var5.k(pr4Var)).a;
                    pr4 pr4Var2 = l8b.a;
                    nte.b(strQ3, j09VarB0, ((e8b) l46Var5.k(pr4Var2)).s, 0L, null, yp5Var, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarP, l46Var5, 48, 0, 129912);
                    String strQ4 = afc.q(R.string.annual_domain_pattern_subtitle_1, l46Var5);
                    j09 j09VarB1 = ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                    mue mueVarN = pue.n(l46Var5);
                    long j = ((e8b) l46Var5.k(pr4Var2)).u;
                    ar5 ar5Var = ar5.y;
                    nte.b(strQ4, j09VarB1, j, 0L, ar5Var, ((y8b) l46Var5.k(pr4Var)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarN, l46Var5, 1572912, 0, 129848);
                    nte.b(afc.q(R.string.annual_domain_pattern_subtitle_2, l46Var5), ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2), ((e8b) l46Var5.k(pr4Var2)).q, 0L, ar5Var, ((y8b) l46Var5.k(pr4Var)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.n(l46Var5), l46Var5, 1572912, 0, 129848);
                    y8c.f(kg4.c, this.b, pue.n(l46Var5), pue.j(l46Var5), kv2.e(g09Var, 20.0f, l46Var5, g09Var, 1.0f), b.p(b.d(g09Var, 105.0f), 60.0f), l46Var5, 1794048);
                    l46Var5.r(true);
                }
                break;
            case 5:
                l46 l46Var6 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    l46Var6.Z();
                } else {
                    kn2.c(Boolean.valueOf(z), null, null, null, "seasonal-reading-cta", null, y7h.h, l46Var6, 1597440, 46);
                }
                break;
            case 6:
                l46 l46Var7 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    l46Var7.Z();
                } else {
                    String strQ5 = afc.q(R.string.startup_update_now, l46Var7);
                    mue mueVar4 = oue.a;
                    nte.b(strQ5, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.a(l46Var7), 0L, 0L, z ? ar5.y : ar5.x, null, 0L, null, 0, 0L, null, null, 16777211), l46Var7, 0, 0, 131070);
                }
                break;
            default:
                l46 l46Var8 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    l46Var8.Z();
                } else if (!z) {
                    l46Var8.f0(262515663);
                    nte.b(afc.q(R.string.paywall_congratulation_button, l46Var8), null, 0L, 0L, jgb.S(l46Var8), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var8, 0, 0, 262078);
                    l46Var8.r(false);
                } else {
                    l46Var8.f0(262347953);
                    String strQ6 = afc.q(R.string.paywall_congratulation_button, l46Var8);
                    mue mueVar5 = pue.a;
                    nte.b(strQ6, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var8), l46Var8, 0, 0, 131070);
                    l46Var8.r(false);
                }
                break;
        }
        return wefVar;
    }
}
