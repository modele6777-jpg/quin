package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi4 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;

    public /* synthetic */ fi4(int i, int i2, x16 x16Var) {
        this.a = i2;
        this.b = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        int i2 = 9;
        g09 g09Var = g09.a;
        i8c i8cVar = sf2.a;
        x16 x16Var = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09VarF = b.f(56.0f, 0.0f, mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(32.0f, 0.0f, b.c(g09Var, 1.0f), 2))), 2);
                    String strQ = afc.q(R.string.text_next_step, l46Var);
                    boolean zG = l46Var.g(x16Var);
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new c20(15, x16Var);
                        l46Var.p0(objR);
                    }
                    c8b.i(j09VarF, strQ, null, null, 0L, 0.0f, false, null, null, false, null, null, (x16) objR, l46Var, 0, 0, 4092);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                g21.n(x16Var, (l46) obj, k99.P(1));
                break;
            case 2:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    boolean zG2 = l46Var2.g(x16Var);
                    Object objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new c20(26, x16Var);
                        l46Var2.p0(objR2);
                    }
                    pa7.d(null, 0L, 0L, null, null, null, false, (x16) objR2, l46Var2, 0, 127);
                }
                break;
            case 3:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    pa7.d(null, 0L, 0L, null, null, null, false, this.b, l46Var3, 0, 127);
                }
                break;
            case 4:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    mxb.c(6, x16Var, l46Var4, b.s(b.c, ndb.g, 2));
                }
                break;
            case 5:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var5.W(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    l46Var5.Z();
                } else {
                    pa7.a(b.c(g09Var, 1.0f), 0L, 0L, null, rxg.d, null, false, false, this.b, l46Var5, 24582, 238);
                }
                break;
            case 6:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var6.Z();
                } else {
                    dd2 dd2Var = kj0.e;
                    boolean zG3 = l46Var6.g(x16Var);
                    Object objR3 = l46Var6.R();
                    if (zG3 || objR3 == i8cVar) {
                        objR3 = new fn6(4, x16Var);
                        l46Var6.p0(objR3);
                    }
                    pa7.a(null, 0L, 0L, null, dd2Var, null, false, false, (x16) objR3, l46Var6, 24576, 239);
                }
                break;
            case 7:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var7.W(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    l46Var7.Z();
                } else {
                    x16 x16Var2 = this.b;
                    wi.a(x16Var2, null, null, af1.b0(1007842683, new fi4(i2, x16Var2), l46Var7), l46Var7, 3072, 6);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                ynb.l(x16Var, (l46) obj, k99.P(1));
                break;
            case 9:
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    l46Var8.Z();
                } else {
                    c92 c92VarA = a92.a(new uc0(20.0f, true, new qc0(0)), ndb.Y, l46Var8, 6);
                    int iHashCode = Long.hashCode(l46Var8.T);
                    u8a u8aVarM = l46Var8.m();
                    j09 j09VarJ = m93.J(l46Var8, g09Var);
                    lf2.q.getClass();
                    l46Var8.j0();
                    if (l46Var8.S) {
                        l46Var8.l(ov7Var);
                    } else {
                        l46Var8.s0();
                    }
                    dec.l(hj6.z, l46Var8, c92VarA);
                    dec.l(hj6.y, l46Var8, u8aVarM);
                    dec.l(hj6.X, l46Var8, Integer.valueOf(iHashCode));
                    dec.k(l46Var8);
                    dec.l(hj6.x, l46Var8, j09VarJ);
                    nae.a(null, ((s5d) l46Var8.k(u5d.a)).e, abg.d(4284639663L), 0L, 0.0f, 0.0f, null, rs0.j, l46Var8, 12583296, 121);
                    bm8.h(this.b, new mq6(ndb.Z), false, null, null, rs0.k, l46Var8, 1572864, 60);
                    l46Var8.r(true);
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                z5c.c(x16Var, (l46) obj, k99.P(1));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!l46Var9.W(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    l46Var9.Z();
                } else {
                    pa7.a(null, 0L, 0L, null, null, null, false, false, this.b, l46Var9, 0, 255);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    l46Var10.Z();
                } else {
                    j09 j09VarF2 = b.f(48.0f, 0.0f, mh3.N(b.c(g09Var, 1.0f)), 2);
                    String strQ2 = afc.q(R.string.annual_view_monthly_explain, l46Var10);
                    boolean zG4 = l46Var10.g(x16Var);
                    Object objR4 = l46Var10.R();
                    if (zG4 || objR4 == i8cVar) {
                        objR4 = new fn6(13, x16Var);
                        l46Var10.p0(objR4);
                    }
                    b21.a(strQ2, j09VarF2, false, true, null, (x16) objR4, l46Var10, 221184, 10);
                }
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    l46Var11.Z();
                } else {
                    boolean zG5 = l46Var11.g(x16Var);
                    Object objR5 = l46Var11.R();
                    if (zG5 || objR5 == i8cVar) {
                        objR5 = new fn6(15, x16Var);
                        l46Var11.p0(objR5);
                    }
                    pa7.d(null, 0L, 0L, null, null, null, false, (x16) objR5, l46Var11, 0, 127);
                }
                break;
            case 14:
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    l46Var12.Z();
                } else {
                    j09 j09VarF3 = b.f(56.0f, 0.0f, mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(32.0f, 0.0f, b.c(g09Var, 1.0f), 2))), 2);
                    String strQ3 = afc.q(R.string.annual_monthly_entry_main_button_text, l46Var12);
                    boolean zG6 = l46Var12.g(x16Var);
                    Object objR6 = l46Var12.R();
                    if (zG6 || objR6 == i8cVar) {
                        objR6 = new fn6(16, x16Var);
                        l46Var12.p0(objR6);
                    }
                    c8b.i(j09VarF3, strQ3, null, null, 0L, 0.0f, false, null, null, false, null, null, (x16) objR6, l46Var12, 0, 0, 4092);
                }
                break;
            case 15:
                l46 l46Var13 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!l46Var13.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    l46Var13.Z();
                } else {
                    boolean zG7 = l46Var13.g(x16Var);
                    Object objR7 = l46Var13.R();
                    if (zG7 || objR7 == i8cVar) {
                        objR7 = new fn6(20, x16Var);
                        l46Var13.p0(objR7);
                    }
                    pa7.d(null, 0L, 0L, null, null, null, false, (x16) objR7, l46Var13, 0, 127);
                }
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l46 l46Var14 = (l46) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!l46Var14.W(1 & iIntValue14, (iIntValue14 & 3) != 2)) {
                    l46Var14.Z();
                } else {
                    pa7.a(null, 0L, 0L, null, null, null, false, false, this.b, l46Var14, 0, 255);
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                pa7.k(x16Var, (l46) obj, k99.P(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                pi9.d(x16Var, (l46) obj, k99.P(1));
                break;
            case 19:
                l46 l46Var15 = (l46) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!l46Var15.W(1 & iIntValue15, (iIntValue15 & 3) != 2)) {
                    l46Var15.Z();
                } else {
                    pa7.a(null, 0L, 0L, null, n16.d, null, false, false, this.b, l46Var15, 24576, 239);
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                pi9.a(x16Var, (l46) obj, k99.P(1));
                break;
            case 21:
                l46 l46Var16 = (l46) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!l46Var16.W(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    l46Var16.Z();
                } else {
                    j09 j09VarZ = ynb.Z(mh3.d0(tm7.o(oa7.E(b.c(b.q(0.0f, 369.0f, ynb.b0(12.0f, 0.0f, g09Var, 2), 1), 1.0f), a7c.b(32.0f)), ((m82) l46Var16.k(o82.a)).p, g21.f), mh3.T(l46Var16), false, 14), 32.0f);
                    c92 c92VarA2 = a92.a(xc0.c, ndb.Z, l46Var16, 48);
                    int iHashCode2 = Long.hashCode(l46Var16.T);
                    u8a u8aVarM2 = l46Var16.m();
                    j09 j09VarJ2 = m93.J(l46Var16, j09VarZ);
                    lf2.q.getClass();
                    l46Var16.j0();
                    if (l46Var16.S) {
                        l46Var16.l(ov7Var);
                    } else {
                        l46Var16.s0();
                    }
                    dec.l(hj6.z, l46Var16, c92VarA2);
                    dec.l(hj6.y, l46Var16, u8aVarM2);
                    dec.l(hj6.X, l46Var16, Integer.valueOf(iHashCode2));
                    dec.k(l46Var16);
                    dec.l(hj6.x, l46Var16, j09VarJ2);
                    pr4 pr4Var = l8b.a;
                    feg.j(od4.A(k8b.f((e8b) l46Var16.k(pr4Var)) ? R.drawable.onboarding_age_restriction_neo : R.drawable.onboarding_age_restriction_classic, 0, l46Var16), null, dj6.w(b.c(b.q(0.0f, 280.0f, g09Var, 1), 1.0f), 1.6666666f), null, null, 0.0f, null, l46Var16, 440, 120);
                    String strQ4 = afc.q(R.string.onboarding_age_restriction_title, l46Var16);
                    mue mueVar = pue.a;
                    nte.b(strQ4, null, y72.b(((e8b) l46Var16.k(pr4Var)).q, 0.95f), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var16), 0L, 0L, ar5.y, ((y8b) l46Var16.k(x8b.a)).a, w6c.k(0.162d), null, 0, w6c.k(k8b.f((e8b) l46Var16.k(pr4Var)) ? 36.45d : 40.5d), null, null, 16645979), l46Var16, 0, 0, 130042);
                    nte.b(ks0.h(8.0f, R.string.onboarding_age_restriction_body, l46Var16, l46Var16, g09Var), null, ((e8b) l46Var16.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.c(l46Var16), 0L, 0L, null, null, w6c.k(k8b.f((e8b) l46Var16.k(pr4Var)) ? 0.102d : 0.085d), null, 0, 0L, null, null, 16777087), l46Var16, 0, 0, 130042);
                    c8b.i(b.f(56.0f, 0.0f, kv2.e(g09Var, 24.0f, l46Var16, g09Var, 1.0f), 2), afc.q(R.string.onboarding_age_restriction_confirm, l46Var16), null, null, 0L, 0.0f, false, null, null, false, null, null, this.b, l46Var16, 6, 0, 4092);
                    l46Var16.r(true);
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                feg.n(x16Var, (l46) obj, k99.P(1));
                break;
            case 23:
                l46 l46Var17 = (l46) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!l46Var17.W(1 & iIntValue17, (iIntValue17 & 3) != 2)) {
                    l46Var17.Z();
                } else {
                    c8b.i(b.f(56.0f, 0.0f, mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(32.0f, 0.0f, b.c(g09Var, 1.0f), 2))), 2), afc.q(R.string.text_next_step, l46Var17), null, null, 0L, 0.0f, false, null, null, false, null, null, this.b, l46Var17, 0, 0, 4092);
                }
                break;
            case 24:
                l46 l46Var18 = (l46) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!l46Var18.W(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    l46Var18.Z();
                } else {
                    c8b.h(null, false, 0L, 0L, null, this.b, l46Var18, 0, 31);
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                e6a.c(x16Var, (l46) obj, k99.P(1));
                break;
            case 26:
                l46 l46Var19 = (l46) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!l46Var19.W(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    l46Var19.Z();
                } else {
                    e6a.c(x16Var, l46Var19, 0);
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                i7h.e(x16Var, (l46) obj, k99.P(1));
                break;
            case 28:
                l46 l46Var20 = (l46) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!l46Var20.W(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    l46Var20.Z();
                } else {
                    pa7.a(null, 0L, 0L, null, vpf.d, vpf.e, false, false, this.b, l46Var20, 221184, 207);
                }
                break;
            default:
                l46 l46Var21 = (l46) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!l46Var21.W(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    l46Var21.Z();
                } else {
                    boolean zG8 = l46Var21.g(x16Var);
                    Object objR8 = l46Var21.R();
                    if (zG8 || objR8 == i8cVar) {
                        objR8 = new yca(i2, x16Var);
                        l46Var21.p0(objR8);
                    }
                    pa7.d(null, 0L, 0L, null, null, null, false, (x16) objR8, l46Var21, 0, 127);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ fi4(int i, x16 x16Var) {
        this.a = i;
        this.b = x16Var;
    }
}
