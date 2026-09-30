package defpackage;

import ai.askquin.R;
import ai.askquin.ui.divination.k;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ce2 implements n26 {
    public final /* synthetic */ int a;

    public /* synthetic */ ce2(int i) {
        this.a = i;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    s21.a(b.l(g09Var, 48.0f), l46Var, 6);
                }
                break;
            case 1:
                d92 d92Var = (d92) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                d92Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(d92Var) ? 4 : 2;
                }
                if (!l46Var2.W(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                } else {
                    pr4 pr4Var = l8b.a;
                    if (k8b.e((e8b) l46Var2.k(pr4Var))) {
                        l46Var2.f0(-1020329160);
                        o5c.f(l46Var2, d92.a(d92Var, g09Var, 1.5f));
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1020276305);
                        l46Var2.r(false);
                    }
                    k99.a(6, l46Var2);
                    o5c.f(l46Var2, b.d(g09Var, 24.0f));
                    if (!k8b.e((e8b) l46Var2.k(pr4Var))) {
                        l46Var2.f0(-1020077905);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1020128838);
                        o5c.f(l46Var2, d92.a(d92Var, g09Var, 1.0f));
                        l46Var2.r(false);
                    }
                }
                break;
            case 2:
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var3.Z();
                } else {
                    s21.a(b.l(g09Var, 48.0f), l46Var3, 6);
                }
                break;
            case 3:
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    l46Var4.Z();
                } else {
                    k.b(ynb.b0(0.0f, 18.0f, b.c(g09Var, 1.0f), 1), ((e8b) l46Var4.k(l8b.a)).A, 0.0f, 0.0f, l46Var4, 6);
                }
                break;
            case 4:
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    l46Var5.Z();
                } else {
                    j09 j09VarQ = b.q(0.0f, 360.0f, b.c(b.d(g09Var, 48.0f), 1.0f), 1);
                    t7c t7cVarA = s7c.a(new uc0(8.0f, true, new jv2(3, ndb.Z)), ndb.z, l46Var5, 54);
                    int iHashCode = Long.hashCode(l46Var5.T);
                    u8a u8aVarM = l46Var5.m();
                    j09 j09VarJ = m93.J(l46Var5, j09VarQ);
                    lf2.q.getClass();
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    dec.l(hj6.z, l46Var5, t7cVarA);
                    dec.l(hj6.y, l46Var5, u8aVarM);
                    dec.l(hj6.X, l46Var5, Integer.valueOf(iHashCode));
                    dec.k(l46Var5);
                    dec.l(hj6.x, l46Var5, j09VarJ);
                    gu6.b(o7c.x(u3c.g(), l46Var5), afc.q(R.string.chat_button_share, l46Var5), null, 0L, l46Var5, 8, 12);
                    nte.b(afc.q(R.string.chat_button_share, l46Var5), null, 0L, w6c.l(17), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var5, 24576, 0, 262126);
                    l46Var5.r(true);
                }
                break;
            case 5:
                l46 l46Var6 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    l46Var6.Z();
                } else {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Z, l46Var6, 54);
                    int iHashCode2 = Long.hashCode(l46Var6.T);
                    u8a u8aVarM2 = l46Var6.m();
                    j09 j09VarJ2 = m93.J(l46Var6, j09VarC);
                    lf2.q.getClass();
                    l46Var6.j0();
                    if (l46Var6.S) {
                        l46Var6.l(ov7Var);
                    } else {
                        l46Var6.s0();
                    }
                    dec.l(hj6.z, l46Var6, c92VarA);
                    dec.l(hj6.y, l46Var6, u8aVarM2);
                    dec.l(hj6.X, l46Var6, Integer.valueOf(iHashCode2));
                    dec.k(l46Var6);
                    dec.l(hj6.x, l46Var6, j09VarJ2);
                    jgb.q(0, 1, l46Var6, null, afc.q(R.string.here_is_your_deck, l46Var6));
                    l46Var6.r(true);
                }
                break;
            case 6:
                l46 l46Var7 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    l46Var7.Z();
                } else {
                    s21.a(b.l(g09Var, 48.0f), l46Var7, 6);
                }
                break;
            case 7:
                l46 l46Var8 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    l46Var8.Z();
                } else {
                    nte.b(afc.q(R.string.update_button_nevigative, l46Var8), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var8, 0, 0, 262142);
                }
                break;
            case 8:
                l46 l46Var9 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    l46Var9.Z();
                } else {
                    nte.b(afc.q(R.string.update_button_positive, l46Var9), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var9, 0, 0, 262142);
                }
                break;
            case 9:
                l46 l46Var10 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    l46Var10.Z();
                } else {
                    gu6.a(k99.B(), null, null, 0L, l46Var10, 48, 12);
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var11 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var11.W(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    l46Var11.Z();
                } else {
                    nte.b(afc.q(R.string.personality_finish_test, l46Var11), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var11, 0, 0, 262142);
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var12 = (l46) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var12.W(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    l46Var12.Z();
                } else {
                    gu6.a(if9.v(), null, null, 0L, l46Var12, 48, 12);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var13 = (l46) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var13.W(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    l46Var13.Z();
                } else {
                    s21.a(b.l(g09Var, 48.0f), l46Var13, 6);
                }
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                fqd fqdVar = (fqd) obj;
                l46 l46Var14 = (l46) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                fqdVar.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= l46Var14.g(fqdVar) ? 4 : 2;
                }
                if (!l46Var14.W(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    l46Var14.Z();
                } else {
                    an1.i(fqdVar, l46Var14, iIntValue14 & 14);
                }
                break;
            case 14:
                l46 l46Var15 = (l46) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var15.W(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    l46Var15.Z();
                } else {
                    pr4 pr4Var2 = nte.a;
                    mue mueVar = pue.a;
                    mh3.a(pr4Var2.a(pue.a(l46Var15)), urg.k, l46Var15, 56);
                }
                break;
            case 15:
                l46 l46Var16 = (l46) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var16.W(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    l46Var16.Z();
                } else {
                    nte.b(afc.q(R.string.seasonal_summary_follow_up, l46Var16), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var16, 0, 0, 262142);
                }
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l46 l46Var17 = (l46) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var17.W(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    l46Var17.Z();
                } else {
                    gu6.a(iqf.k(), null, null, bx5.d(l46Var17), l46Var17, 48, 4);
                    o5c.f(l46Var17, b.p(g09Var, 8.0f));
                    nte.b(afc.q(R.string.seasonal_summary_replay, l46Var17), null, bx5.d(l46Var17), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var17, 0, 0, 262138);
                }
                break;
            case 17:
                l46 l46Var18 = (l46) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var18.W(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    l46Var18.Z();
                } else {
                    long j = ((y72) l46Var18.k(em2.a)).a;
                    gu6.a(t72.C(), null, null, j, l46Var18, 48, 4);
                    o5c.f(l46Var18, b.p(g09Var, 8.0f));
                    nte.b(afc.q(R.string.seasonal_summary_share, l46Var18), null, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var18, 0, 0, 262138);
                }
                break;
            case 18:
                l46 l46Var19 = (l46) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var19.W(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    l46Var19.Z();
                } else {
                    nte.b(afc.q(R.string.button_cancel, l46Var19), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var19.k(nte.a), y72.b(((m82) l46Var19.k(o82.a)).o, 0.88f), w6c.l(19), ar5.y, cr5.h, 0L, null, 0, w6c.l(24), null, null, 16646104), l46Var19, 0, 0, 131070);
                }
                break;
            case 19:
                ((Integer) obj).intValue();
                l46 l46Var20 = (l46) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if (!l46Var20.W(1 & iIntValue20, (iIntValue20 & 17) != 16)) {
                    l46Var20.Z();
                }
                break;
            case 20:
                l46 l46Var21 = (l46) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var21.W(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    l46Var21.Z();
                }
                break;
            case 21:
                l46 l46Var22 = (l46) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var22.W(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    l46Var22.Z();
                } else {
                    eec.e(b.d(b.c(g09Var, 0.3f), 16.0f), l46Var22, 6);
                    eec.e(b.d(kv2.e(g09Var, 12.0f, l46Var22, g09Var, 1.0f), 20.0f), l46Var22, 6);
                    eec.e(b.d(kv2.e(g09Var, 8.0f, l46Var22, g09Var, 0.7f), 20.0f), l46Var22, 6);
                }
                break;
            case 22:
                l46 l46Var23 = (l46) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var23.W(1 & iIntValue23, (iIntValue23 & 17) != 16)) {
                    l46Var23.Z();
                } else {
                    int i2 = 0;
                    while (i2 < 6) {
                        eec.e(b.d(b.c(g09Var, i2 == 5 ? 0.4f : 1.0f), 18.0f), l46Var23, 0);
                        if (i2 < 5) {
                            ib8.r(8.0f, -1120068491, l46Var23, l46Var23, g09Var);
                        } else {
                            l46Var23.f0(-362356982);
                        }
                        l46Var23.r(false);
                        i2++;
                    }
                }
                break;
            case 23:
                l46 l46Var24 = (l46) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var24.W(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    l46Var24.Z();
                } else {
                    eec.d(null, af1.v, l46Var24, 48);
                }
                break;
            case 24:
                l46 l46Var25 = (l46) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var25.W(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    l46Var25.Z();
                } else {
                    s21.a(b.l(g09Var, 48.0f), l46Var25, 6);
                }
                break;
            case 25:
                l46 l46Var26 = (l46) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var26.W(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    l46Var26.Z();
                } else {
                    s21.a(b.l(g09Var, 48.0f), l46Var26, 6);
                }
                break;
            case 26:
                l46 l46Var27 = (l46) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var27.W(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    l46Var27.Z();
                } else {
                    nte.b(afc.q(R.string.previous_card, l46Var27), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var27, 0, 0, 262142);
                }
                break;
            case 27:
                l46 l46Var28 = (l46) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var28.W(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    l46Var28.Z();
                } else {
                    s21.a(b.l(g09Var, 48.0f), l46Var28, 6);
                }
                break;
            case 28:
                l46 l46Var29 = (l46) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var29.W(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    l46Var29.Z();
                } else {
                    j09 j09VarZ = ynb.Z(g09Var, 24.0f);
                    c92 c92VarA2 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var29, 6);
                    int iHashCode3 = Long.hashCode(l46Var29.T);
                    u8a u8aVarM3 = l46Var29.m();
                    j09 j09VarJ3 = m93.J(l46Var29, j09VarZ);
                    lf2.q.getClass();
                    l46Var29.j0();
                    if (l46Var29.S) {
                        l46Var29.l(ov7Var);
                    } else {
                        l46Var29.s0();
                    }
                    dec.l(hj6.z, l46Var29, c92VarA2);
                    dec.l(hj6.y, l46Var29, u8aVarM3);
                    dec.l(hj6.X, l46Var29, Integer.valueOf(iHashCode3));
                    dec.k(l46Var29);
                    dec.l(hj6.x, l46Var29, j09VarJ3);
                    String strQ = afc.q(R.string.spread_loading_recommend, l46Var29);
                    mue mueVar2 = pue.a;
                    nte.b(strQ, null, ((e8b) l46Var29.k(l8b.a)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.d(l46Var29), l46Var29, 0, 0, 131066);
                    jgb.B(null, l46Var29, 0);
                    l46Var29.r(true);
                }
                break;
            default:
                l46 l46Var30 = (l46) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var30.W(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    l46Var30.Z();
                } else {
                    String strQ2 = afc.q(R.string.startup_update_later, l46Var30);
                    mue mueVar3 = oue.a;
                    nte.b(strQ2, null, ((e8b) l46Var30.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.d(l46Var30), l46Var30, 0, 0, 131066);
                }
                break;
        }
        return wefVar;
    }
}
