package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob0 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ob0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        g09 g09Var = g09.a;
        ov7 ov7Var = LayoutNode.h1;
        sc0 sc0Var = xc0.c;
        String str = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                j09 j09Var = (j09) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j09Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(j09Var) ? 4 : 2;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    l46Var.Z();
                } else {
                    String str2 = this.b;
                    if (str2 != null) {
                        l46Var.f0(-893313852);
                        long j = ((e8b) l46Var.k(l8b.a)).q;
                        mue mueVar = pue.a;
                        nte.b(str2, j09Var, j, 0L, null, null, 0L, null, new jme(3), 0L, 2, false, 1, 0, null, pue.b(l46Var), l46Var, (iIntValue << 3) & 112, 24960, 109560);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-893313853);
                        l46Var.r(false);
                    }
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    c92 c92VarA = a92.a(sc0Var, ndb.Z, l46Var2, 48);
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
                    dec.l(hj6.z, l46Var2, c92VarA);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    nte.b(this.b, null, ((m82) l46Var2.k(o82.a)).e, w6c.l(19), jgb.S(l46Var2), null, 0L, null, null, w6c.l(24), 0, false, 0, 0, null, null, l46Var2, 24576, 48, 260010);
                    l46Var2.f0(-2101234468);
                    l46Var2.r(false);
                    l46Var2.r(true);
                }
                break;
            case 2:
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var3.Z();
                } else {
                    n3d.b(0, 1, l46Var3, null, str);
                }
                break;
            case 3:
                c4c c4cVar = (c4c) obj;
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                c4cVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= l46Var4.g(c4cVar) ? 4 : 2;
                }
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    l46Var4.Z();
                } else {
                    b4c.b(c4cVar, this.b, null, null, 0, false, 0, l46Var4, iIntValue4 & 14);
                }
                break;
            case 4:
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    l46Var5.Z();
                } else {
                    g09 g09Var2 = g09.a;
                    j09 j09VarZ = ynb.Z(b.c(g09Var2, 1.0f), 16.0f);
                    c92 c92VarA2 = a92.a(sc0Var, ndb.Z, l46Var5, 48);
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
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var5, c92VarA2);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var5, u8aVarM2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var5, numValueOf);
                    dec.k(l46Var5);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var5, j09VarJ2);
                    j09 j09VarE = oa7.E(b.c(g09Var2, 1.0f), a7c.b(16.0f));
                    t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var5, 48);
                    int iHashCode3 = Long.hashCode(l46Var5.T);
                    u8a u8aVarM3 = l46Var5.m();
                    j09 j09VarJ3 = m93.J(l46Var5, j09VarE);
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    dec.l(he2Var, l46Var5, t7cVarA);
                    dec.l(he2Var2, l46Var5, u8aVarM3);
                    ib8.s(iHashCode3, l46Var5, he2Var3, l46Var5);
                    dec.l(he2Var4, l46Var5, j09VarJ3);
                    v7c v7cVar = v7c.a;
                    kj0.K(v7cVar.a(g09Var2, 1.0f, true), od4.A(R.drawable.ic_invitation_share, 0, l46Var5), afc.q(R.string.invitation_rule_1, l46Var5), l46Var5, 64);
                    feg.j(od4.A(R.drawable.ic_invitation_rule_arrow, 0, l46Var5), null, ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, g09Var2), null, null, 0.0f, null, l46Var5, 440, 120);
                    kj0.K(v7cVar.a(g09Var2, 1.0f, true), od4.A(R.drawable.ic_invitation_copy, 0, l46Var5), afc.q(R.string.invitation_rule_2, l46Var5), l46Var5, 64);
                    feg.j(od4.A(R.drawable.ic_invitation_rule_arrow, 0, l46Var5), null, ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, g09Var2), null, null, 0.0f, null, l46Var5, 440, 120);
                    kj0.K(v7cVar.a(g09Var2, 1.0f, true), od4.A(R.drawable.ic_invitation_git, 0, l46Var5), afc.q(R.string.invitation_rule_3, l46Var5), l46Var5, 64);
                    ib8.t(l46Var5, true, g09Var2, 12.0f, l46Var5);
                    String strQ = afc.q(R.string.invitation_code, l46Var5);
                    mue mueVar2 = pue.a;
                    nte.b(strQ, null, ((e8b) l46Var5.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var5), l46Var5, 0, 0, 131066);
                    o5c.f(l46Var5, b.d(g09Var2, 10.0f));
                    kj0.w(0, l46Var5, null, str);
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
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var6, 0, 0, 262142);
                }
                break;
            case 6:
                l46 l46Var7 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    l46Var7.Z();
                } else {
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var7, 0, 0, 262142);
                }
                break;
            case 7:
                l46 l46Var8 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    l46Var8.Z();
                } else {
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var8.k(r9f.a)).n, l46Var8, 0, 0, 131070);
                }
                break;
            case 8:
                l46 l46Var9 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    l46Var9.Z();
                } else {
                    ap5.a(str, l46Var9, 0);
                }
                break;
            case 9:
                l46 l46Var10 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    l46Var10.Z();
                } else {
                    ap5.a(str, l46Var10, 0);
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var11 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var11.W(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    l46Var11.Z();
                } else {
                    mue mueVar3 = pue.a;
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.d(l46Var11), 0L, 0L, null, null, w6c.l(0), null, 0, 0L, null, null, 16777087), l46Var11, 0, 0, 131070);
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var12 = (l46) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var12.W(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    l46Var12.Z();
                } else {
                    mue mueVar4 = pue.a;
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.d(l46Var12), 0L, 0L, null, null, w6c.l(0), null, 0, 0L, null, null, 16777087), l46Var12, 0, 0, 131070);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var13 = (l46) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var13.W(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    l46Var13.Z();
                } else {
                    nte.b(this.b, null, 0L, w6c.l(19), jgb.S(l46Var13), null, w6c.k(0.114d), null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var13, 100687872, 0, 260782);
                }
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var14 = (l46) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var14.W(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    l46Var14.Z();
                } else {
                    nte.b(this.b, null, 0L, w6c.l(19), jgb.S(l46Var14), null, w6c.k(0.114d), null, null, 0L, 0, false, 0, 0, null, null, l46Var14, 100687872, 0, 261806);
                }
                break;
            case 14:
                c4c c4cVar2 = (c4c) obj;
                l46 l46Var15 = (l46) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                c4cVar2.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= l46Var15.g(c4cVar2) ? 4 : 2;
                }
                if (!l46Var15.W(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    l46Var15.Z();
                } else {
                    z5c.d(c4cVar2, w4e.p(str), null, l46Var15, iIntValue15 & 14);
                }
                break;
            case 15:
                j09 j09Var2 = (j09) obj;
                l46 l46Var16 = (l46) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                j09Var2.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= l46Var16.g(j09Var2) ? 4 : 2;
                }
                if (!l46Var16.W(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    l46Var16.Z();
                } else {
                    bm8.m(iIntValue16 & 14, 0, l46Var16, j09Var2, str);
                }
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                xw9 xw9Var = (xw9) obj;
                l46 l46Var17 = (l46) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= l46Var17.g(xw9Var) ? 4 : 2;
                }
                if (!l46Var17.W(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    l46Var17.Z();
                } else {
                    j09 j09VarB0 = ynb.b0(20.0f, 0.0f, mh3.d0(ynb.Y(b.c, xw9Var), mh3.T(l46Var17), false, 14), 2);
                    c92 c92VarA3 = a92.a(sc0Var, ndb.Z, l46Var17, 48);
                    int iHashCode4 = Long.hashCode(l46Var17.T);
                    u8a u8aVarM4 = l46Var17.m();
                    j09 j09VarJ4 = m93.J(l46Var17, j09VarB0);
                    lf2.q.getClass();
                    l46Var17.j0();
                    if (l46Var17.S) {
                        l46Var17.l(ov7Var);
                    } else {
                        l46Var17.s0();
                    }
                    dec.l(hj6.z, l46Var17, c92VarA3);
                    dec.l(hj6.y, l46Var17, u8aVarM4);
                    dec.l(hj6.X, l46Var17, Integer.valueOf(iHashCode4));
                    dec.k(l46Var17);
                    dec.l(hj6.x, l46Var17, j09VarJ4);
                    o5c.f(l46Var17, b.d(g09Var, 24.0f));
                    bm8.m(0, 1, l46Var17, null, str);
                    l46Var17.r(true);
                }
                break;
            case 17:
                l46 l46Var18 = (l46) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var18.W(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    l46Var18.Z();
                } else {
                    c92 c92VarA4 = a92.a(sc0Var, ndb.Y, l46Var18, 0);
                    int iHashCode5 = Long.hashCode(l46Var18.T);
                    u8a u8aVarM5 = l46Var18.m();
                    j09 j09VarJ5 = m93.J(l46Var18, g09Var);
                    lf2.q.getClass();
                    l46Var18.j0();
                    if (l46Var18.S) {
                        l46Var18.l(ov7Var);
                    } else {
                        l46Var18.s0();
                    }
                    dec.l(hj6.z, l46Var18, c92VarA4);
                    dec.l(hj6.y, l46Var18, u8aVarM5);
                    dec.l(hj6.X, l46Var18, Integer.valueOf(iHashCode5));
                    dec.k(l46Var18);
                    dec.l(hj6.x, l46Var18, j09VarJ5);
                    mue mueVar5 = pue.a;
                    nte.b(this.b, null, ((e8b) l46Var18.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var18), l46Var18, 0, 0, 131066);
                    if (ca2.a.a()) {
                        l46Var18.f0(-415741448);
                        jgb.c(null, l46Var18, 6);
                        l46Var18.r(false);
                    } else {
                        l46Var18.f0(-415703008);
                        l46Var18.r(false);
                    }
                    l46Var18.r(true);
                }
                break;
            case 18:
                c4c c4cVar3 = (c4c) obj;
                l46 l46Var19 = (l46) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                c4cVar3.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= l46Var19.g(c4cVar3) ? 4 : 2;
                }
                if (!l46Var19.W(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    l46Var19.Z();
                } else {
                    z5c.d(c4cVar3, str, null, l46Var19, iIntValue19 & 14);
                }
                break;
            case 19:
                l46 l46Var20 = (l46) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var20.W(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    l46Var20.Z();
                } else {
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, kj0.e0(l46Var20), l46Var20, 0, 0, 131070);
                }
                break;
            case 20:
                l46 l46Var21 = (l46) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var21.W(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    l46Var21.Z();
                } else {
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, kj0.e0(l46Var21), l46Var21, 0, 0, 131070);
                }
                break;
            case 21:
                l46 l46Var22 = (l46) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var22.W(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    l46Var22.Z();
                } else {
                    mue mueVar6 = pue.a;
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var22), l46Var22, 0, 0, 131070);
                }
                break;
            case 22:
                l46 l46Var23 = (l46) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var23.W(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    l46Var23.Z();
                } else {
                    mue mueVar7 = pue.a;
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var23), l46Var23, 0, 0, 131070);
                }
                break;
            case 23:
                l46 l46Var24 = (l46) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var24.W(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    l46Var24.Z();
                } else {
                    mue mueVar8 = pue.a;
                    nte.b(this.b, null, ((e8b) l46Var24.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var24), l46Var24, 0, 0, 131066);
                }
                break;
            case 24:
                l46 l46Var25 = (l46) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var25.W(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    l46Var25.Z();
                } else {
                    mue mueVar9 = pue.a;
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var25), l46Var25, 0, 0, 131070);
                }
                break;
            case 25:
                l46 l46Var26 = (l46) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var26.W(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    l46Var26.Z();
                } else {
                    mue mueVar10 = pue.a;
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var26), l46Var26, 0, 0, 131070);
                }
                break;
            case 26:
                l46 l46Var27 = (l46) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var27.W(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    l46Var27.Z();
                } else {
                    mue mueVar11 = pue.a;
                    nte.b(this.b, null, 0L, 0L, ar5.y, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var27), l46Var27, 1572864, 0, 131006);
                }
                break;
            case 27:
                l46 l46Var28 = (l46) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var28.W(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    l46Var28.Z();
                } else {
                    mue mueVar12 = pue.a;
                    nte.b(this.b, null, 0L, 0L, ar5.y, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var28), l46Var28, 1572864, 0, 131006);
                }
                break;
            default:
                l46 l46Var29 = (l46) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var29.W(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    l46Var29.Z();
                } else {
                    mue mueVar13 = oue.a;
                    nte.b(this.b, null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.a(l46Var29), l46Var29, 0, 0, 130046);
                }
                break;
        }
        return wefVar;
    }
}
