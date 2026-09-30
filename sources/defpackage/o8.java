package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o8 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ o8(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        String strI = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    kx0 kx0Var = ndb.z;
                    t7c t7cVarA = s7c.a(new uc0(16.0f, true, new qc0(0)), kx0Var, l46Var, 54);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarC);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var, t7cVarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    nte.b("ID", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p8c.r(l46Var), l46Var, 6, 0, 131070);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    t7c t7cVarA2 = s7c.a(new uc0(8.0f, true, new jv2(3, ndb.E0)), kx0Var, l46Var, 54);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, jw7Var);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, t7cVarA2);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    jw7 jw7Var2 = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    mue mueVarS = p8c.s(l46Var);
                    long jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.48f);
                    jme jmeVar = new jme(6);
                    String str = this.b;
                    nte.b(str, jw7Var2, jB, 0L, null, null, 0L, null, jmeVar, 0L, 2, false, 1, 0, null, mueVarS, l46Var, 0, 24960, 109560);
                    j09 j09VarE = oa7.E(b.m(g09Var, 40.0f, 24.0f), a7c.a());
                    pr4 pr4Var = l8b.a;
                    j09 j09VarO = tm7.o(j09VarE, ((e8b) l46Var.k(pr4Var)).m, g21.f);
                    boolean zG = l46Var.g(str);
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        z = false;
                        t8 t8Var = new t8(str, false ? 1 : 0);
                        l46Var.p0(t8Var);
                        obj3 = t8Var;
                    } else {
                        z = false;
                        obj3 = objR;
                    }
                    j09 j09VarC2 = androidx.compose.foundation.b.c(j09VarO, false, null, null, (x16) obj3, 15);
                    xn8 xn8VarC = s21.c(ndb.f, z);
                    int iHashCode3 = Long.hashCode(l46Var.T);
                    u8a u8aVarM3 = l46Var.m();
                    j09 j09VarJ3 = m93.J(l46Var, j09VarC2);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, xn8VarC);
                    dec.l(he2Var2, l46Var, u8aVarM3);
                    ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ3);
                    gu6.a(hkg.u0(), null, null, ((e8b) l46Var.k(pr4Var)).s, l46Var, 48, 4);
                    tec.s(l46Var, true, true, true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                lc.x(strI, (l46) obj, k99.P(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                lc.x(strI, (l46) obj, k99.P(1));
                break;
            case 3:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    mue mueVar = pue.a;
                    nte.b(this.b, null, ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, null, w6c.l(24), 0, false, 0, 0, null, pue.c(l46Var2), l46Var2, 0, 48, 129018);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                kn2.k(strI, (l46) obj, k99.P(1));
                break;
            case 5:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    mue mueVar2 = pue.a;
                    nte.b(this.b, ynb.a0(g09Var, 16.0f, 4.0f), ((e8b) l46Var3.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mue.a(pue.e(l46Var3), 0L, w6c.l(13), null, null, 0L, null, 0, w6c.k(17.55d), null, null, 16646141), l46Var3, 48, 27648, 106488);
                }
                break;
            case 6:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    nte.b(afc.r(R.string.auto_renew_cancel_dialog, new Object[]{strI}, l46Var4), null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, oue.a, l46Var4, 0, 0, 130046);
                }
                break;
            case 7:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var5.Z();
                } else {
                    j09 j09VarA0 = ynb.a0(g09Var, 8.0f, 2.0f);
                    mue mueVar3 = pue.a;
                    nte.b(this.b, j09VarA0, ((e8b) l46Var5.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.i(l46Var5), l46Var5, 48, 0, 131064);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                uq1.g(strI, (l46) obj, k99.P(1));
                break;
            case 9:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var6.Z();
                } else {
                    mue mueVar4 = pue.a;
                    nte.b(this.b, null, ((e8b) l46Var6.k(l8b.a)).q, 0L, null, null, 0L, null, null, w6c.l(24), 0, false, 0, 0, null, pue.c(l46Var6), l46Var6, 0, 48, 129018);
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    l46Var7.Z();
                } else {
                    kn2.i(null, strI, l46Var7, 0, 1);
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                b53.h(strI, (l46) obj, k99.P(1));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                z83.i(strI, (l46) obj, k99.P(1));
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                ap5.a(strI, (l46) obj, k99.P(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                kj0.p(strI, (l46) obj, k99.P(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                kj0.g(strI, (l46) obj, k99.P(1));
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                eb3.r(strI, (l46) obj, k99.P(1));
                break;
            case 17:
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    l46Var8.Z();
                } else {
                    long j = ((e8b) l46Var8.k(l8b.a)).t;
                    mue mueVar5 = oue.a;
                    nte.b(this.b, null, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var8), l46Var8, 0, 0, 131066);
                }
                break;
            case 18:
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    l46Var9.Z();
                } else {
                    nte.b(this.b, null, ((e8b) l46Var9.k(l8b.a)).r, w6c.l(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var9, 24576, 0, 262122);
                }
                break;
            case 19:
                ((Integer) obj2).getClass();
                dj6.q(strI, (l46) obj, k99.P(1));
                break;
            case 20:
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    l46Var10.Z();
                } else {
                    nte.b(afc.r(R.string.paywall_upgrade_warning_text, new Object[]{strI}, l46Var10), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var10, 0, 0, 262142);
                }
                break;
            case 21:
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    l46Var11.Z();
                } else {
                    if (strI == null) {
                        strI = tec.i(l46Var11, -1557639080, R.string.personality_test_title, l46Var11, false);
                    } else {
                        l46Var11.f0(-1557639359);
                        l46Var11.r(false);
                    }
                    String str2 = strI;
                    mue mueVar6 = pue.a;
                    nte.b(str2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.q(l46Var11), 0L, w6c.l(17), ar5.d, null, 0L, null, 0, 0L, null, null, 16777209), l46Var11, 0, 0, 131070);
                }
                break;
            case 22:
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    l46Var12.Z();
                } else {
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var12, 0, 0, 262142);
                }
                break;
            case 23:
                l46 l46Var13 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!l46Var13.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    l46Var13.Z();
                } else {
                    String str3 = this.b;
                    if (str3 != null) {
                        l46Var13.f0(677661152);
                        nte.b(str3, null, y72.b(((m82) l46Var13.k(o82.a)).q, 0.48f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(0L, w6c.l(17), ar5.w, null, ((y8b) l46Var13.k(x8b.a)).b, 0L, 0L, 3, 0, w6c.l(24), null, null, 16613337), l46Var13, 0, 0, 131066);
                        l46Var13.r(false);
                    } else {
                        l46Var13.f0(677661151);
                        l46Var13.r(false);
                    }
                }
                break;
            case 24:
                l46 l46Var14 = (l46) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!l46Var14.W(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    l46Var14.Z();
                } else {
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var14, 0, 0, 262142);
                }
                break;
            case 25:
                l46 l46Var15 = (l46) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!l46Var15.W(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    l46Var15.Z();
                } else {
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var15, 48);
                    int iHashCode4 = Long.hashCode(l46Var15.T);
                    u8a u8aVarM4 = l46Var15.m();
                    j09 j09VarJ4 = m93.J(l46Var15, g09Var);
                    lf2.q.getClass();
                    l46Var15.j0();
                    if (l46Var15.S) {
                        l46Var15.l(ov7Var);
                    } else {
                        l46Var15.s0();
                    }
                    dec.l(hj6.z, l46Var15, c92VarA);
                    dec.l(hj6.y, l46Var15, u8aVarM4);
                    dec.l(hj6.X, l46Var15, Integer.valueOf(iHashCode4));
                    dec.k(l46Var15);
                    dec.l(hj6.x, l46Var15, j09VarJ4);
                    nte.b(this.b, null, eze.a(l46Var15).b.y(l46Var15), 0L, jgb.S(l46Var15), null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var15, 0, 0, 261050);
                    l46Var15.r(true);
                }
                break;
            case 26:
                l46 l46Var16 = (l46) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!l46Var16.W(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    l46Var16.Z();
                } else {
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var16, 0, 0, 262142);
                }
                break;
            case 27:
                l46 l46Var17 = (l46) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!l46Var17.W(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    l46Var17.Z();
                } else {
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var17, 0, 0, 262142);
                }
                break;
            case 28:
                l46 l46Var18 = (l46) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!l46Var18.W(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    l46Var18.Z();
                } else {
                    oa7.i(strI, l46Var18, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                oa7.i(strI, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ o8(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
    }
}
