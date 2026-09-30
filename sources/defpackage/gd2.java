package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd2 implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ gd2(int i) {
        this.a = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    nte.b(afc.q(R.string.auth_login_please_change_phone, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var.k(nte.a), 0L, w6c.l(17), new ar5(Constants.MINIMAL_ERROR_STATUS_CODE), null, 0L, null, 0, w6c.l(27), null, null, 16646137), l46Var, 0, 0, 131070);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    Object objR = l46Var2.R();
                    if (objR == i8cVar) {
                        objR = q1c.f(Boolean.TRUE);
                        l46Var2.p0(objR);
                    }
                    e89 e89Var = (e89) objR;
                    boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                    Object objR2 = l46Var2.R();
                    if (objR2 == i8cVar) {
                        objR2 = new r02(16);
                        l46Var2.p0(objR2);
                    }
                    x16 x16Var = (x16) objR2;
                    Object objR3 = l46Var2.R();
                    if (objR3 == i8cVar) {
                        objR3 = new i8(e89Var, 23);
                        l46Var2.p0(objR3);
                    }
                    tm7.l(432, x16Var, (x16) objR3, l46Var2, zBooleanValue);
                }
                break;
            case 2:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    gu6.b(od4.A(R.drawable.ic_photo_close, 0, l46Var3), null, b.l(g09Var, 16.0f), y72.e, l46Var3, 3512, 0);
                }
                break;
            case 3:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    gu6.b(od4.A(R.drawable.ic_photo_camera_switch, 0, l46Var4), null, b.l(g09Var, 24.0f), y72.e, l46Var4, 3512, 0);
                }
                break;
            case 4:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var5.Z();
                } else {
                    gu6.b(od4.A(R.drawable.ic_capture, 0, l46Var5), null, null, y72.e, l46Var5, 3128, 4);
                }
                break;
            case 5:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var6.Z();
                } else {
                    gu6.b(od4.A(R.drawable.ic_photo_gallery, 0, l46Var6), null, b.l(g09Var, 24.0f), y72.e, l46Var6, 3512, 0);
                }
                break;
            case 6:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    l46Var7.Z();
                } else {
                    gx6 gx6VarB = rs0.o;
                    if (gx6VarB == null) {
                        fx6 fx6Var = new fx6("Filled.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = msf.a;
                        dtd dtdVar = new dtd(y72.b);
                        s71 s71Var = new s71(1);
                        s71Var.p(6.0f, 19.0f);
                        s71Var.j(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        s71Var.m(8.0f);
                        s71Var.j(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        s71Var.s(7.0f);
                        s71Var.l(6.0f);
                        s71Var.t(12.0f);
                        s71Var.h();
                        s71Var.p(19.0f, 4.0f);
                        s71Var.m(-3.5f);
                        s71Var.o(-1.0f, -1.0f);
                        s71Var.m(-5.0f);
                        s71Var.o(-1.0f, 1.0f);
                        s71Var.l(5.0f);
                        s71Var.t(2.0f);
                        s71Var.m(14.0f);
                        s71Var.s(4.0f);
                        s71Var.h();
                        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                        gx6VarB = fx6Var.b();
                        rs0.o = gx6VarB;
                    }
                    gu6.a(gx6VarB, null, null, y72.e, l46Var7, 3120, 4);
                }
                break;
            case 7:
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    l46Var8.Z();
                } else {
                    gu6.b(od4.A(R.drawable.ic_rotate_left, 0, l46Var8), null, null, y72.e, l46Var8, 3128, 4);
                }
                break;
            case 8:
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    l46Var9.Z();
                } else {
                    gu6.b(od4.A(R.drawable.ic_rotate_right, 0, l46Var9), null, null, y72.e, l46Var9, 3128, 4);
                }
                break;
            case 9:
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    l46Var10.Z();
                } else {
                    gx6 gx6VarB2 = if9.t;
                    if (gx6VarB2 == null) {
                        fx6 fx6Var2 = new fx6("Filled.Build", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = msf.a;
                        dtd dtdVar2 = new dtd(y72.b);
                        s71 s71Var2 = new s71(1);
                        s71Var2.p(22.7f, 19.0f);
                        s71Var2.o(-9.1f, -9.1f);
                        s71Var2.j(0.9f, -2.3f, 0.4f, -5.0f, -1.5f, -6.9f);
                        s71Var2.j(-2.0f, -2.0f, -5.0f, -2.4f, -7.4f, -1.3f);
                        s71Var2.n(9.0f, 6.0f);
                        s71Var2.n(6.0f, 9.0f);
                        s71Var2.n(1.6f, 4.7f);
                        s71Var2.i(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f);
                        s71Var2.j(1.9f, 1.9f, 4.6f, 2.4f, 6.9f, 1.5f);
                        s71Var2.o(9.1f, 9.1f);
                        s71Var2.j(0.4f, 0.4f, 1.0f, 0.4f, 1.4f, 0.0f);
                        s71Var2.o(2.3f, -2.3f);
                        s71Var2.j(0.5f, -0.4f, 0.5f, -1.1f, 0.1f, -1.4f);
                        s71Var2.h();
                        fx6.a(fx6Var2, s71Var2.b, dtdVar2, 1.0f, 1.0f, 2, 1.0f);
                        gx6VarB2 = fx6Var2.b();
                        if9.t = gx6VarB2;
                    }
                    gu6.a(gx6VarB2, "Debug: Simulate 1 card", null, y72.h, l46Var10, 3120, 4);
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    l46Var11.Z();
                } else {
                    String strQ = afc.q(R.string.explore_detail_title, l46Var11);
                    mue mueVar = pue.a;
                    nte.b(strQ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var11), l46Var11, 0, 0, 131070);
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    l46Var12.Z();
                } else {
                    nte.b("Card Layout Debug", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var12, 6, 0, 262142);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var13 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!l46Var13.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    l46Var13.Z();
                } else {
                    gu6.b(od4.A(2131231291, 0, l46Var13), null, null, y72.e, l46Var13, 3128, 4);
                }
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var14 = (l46) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!l46Var14.W(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    l46Var14.Z();
                } else {
                    jgb.B(null, l46Var14, 0);
                }
                break;
            case 14:
                l46 l46Var15 = (l46) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!l46Var15.W(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    l46Var15.Z();
                } else {
                    String strQ2 = afc.q(R.string.divination_error_retry_message, l46Var15);
                    mue mueVar2 = pue.a;
                    nte.b(strQ2, null, ((e8b) l46Var15.k(l8b.a)).q, 0L, null, null, 0L, null, null, w6c.l(24), 0, false, 0, 0, null, pue.c(l46Var15), l46Var15, 0, 48, 129018);
                }
                break;
            case 15:
                l46 l46Var16 = (l46) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!l46Var16.W(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    l46Var16.Z();
                }
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l46 l46Var17 = (l46) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!l46Var17.W(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    l46Var17.Z();
                } else {
                    nte.b(afc.q(R.string.alert_exit_desc, l46Var17), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var17, 0, 0, 262142);
                }
                break;
            case 17:
                l46 l46Var18 = (l46) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!l46Var18.W(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    l46Var18.Z();
                } else {
                    gu6.a(u3c.g(), null, null, 0L, l46Var18, 48, 12);
                }
                break;
            case 18:
                l46 l46Var19 = (l46) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!l46Var19.W(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    l46Var19.Z();
                } else {
                    Object objR4 = l46Var19.R();
                    if (objR4 == i8cVar) {
                        objR4 = new r02(17);
                        l46Var19.p0(objR4);
                    }
                    x16 x16Var2 = (x16) objR4;
                    Object objR5 = l46Var19.R();
                    if (objR5 == i8cVar) {
                        objR5 = new r02(18);
                        l46Var19.p0(objR5);
                    }
                    v2c.c(x16Var2, (x16) objR5, null, l46Var19, 438, 8);
                }
                break;
            case 19:
                l46 l46Var20 = (l46) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!l46Var20.W(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    l46Var20.Z();
                } else {
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var20, 0);
                    int iHashCode = Long.hashCode(l46Var20.T);
                    u8a u8aVarM = l46Var20.m();
                    j09 j09VarJ = m93.J(l46Var20, g09Var);
                    lf2.q.getClass();
                    l46Var20.j0();
                    if (l46Var20.S) {
                        l46Var20.l(ov7Var);
                    } else {
                        l46Var20.s0();
                    }
                    dec.l(hj6.z, l46Var20, c92VarA);
                    dec.l(hj6.y, l46Var20, u8aVarM);
                    dec.l(hj6.X, l46Var20, Integer.valueOf(iHashCode));
                    dec.k(l46Var20);
                    dec.l(hj6.x, l46Var20, j09VarJ);
                    jgb.c(null, l46Var20, 6);
                    l46Var20.r(true);
                }
                break;
            case 20:
                l46 l46Var21 = (l46) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!l46Var21.W(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    l46Var21.Z();
                } else {
                    h7d.h(0, 1, l46Var21, null);
                }
                break;
            case 21:
                l46 l46Var22 = (l46) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (!l46Var22.W(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    l46Var22.Z();
                } else {
                    gu6.a(u3c.g(), afc.q(R.string.share_button, l46Var22), null, ((m82) l46Var22.k(o82.a)).q, l46Var22, 0, 4);
                }
                break;
            case 22:
                l46 l46Var23 = (l46) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (!l46Var23.W(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    l46Var23.Z();
                } else {
                    oa7.d(null, 0.5f, ((e8b) l46Var23.k(l8b.a)).A, l46Var23, 48, 1);
                }
                break;
            case 23:
                l46 l46Var24 = (l46) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (!l46Var24.W(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    l46Var24.Z();
                } else {
                    gu6.a(vd0.V(), null, b.l(g09Var, 18.0f), 0L, l46Var24, 432, 8);
                }
                break;
            case 24:
                l46 l46Var25 = (l46) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!l46Var25.W(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    l46Var25.Z();
                } else {
                    String strQ3 = afc.q(R.string.explore_deck_carousel_title, l46Var25);
                    mue mueVar3 = pue.a;
                    nte.b(strQ3, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var25), l46Var25, 0, 0, 131070);
                }
                break;
            case 25:
                l46 l46Var26 = (l46) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (!l46Var26.W(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    l46Var26.Z();
                } else {
                    gu6.a(vd0.V(), null, b.l(g09Var, 18.0f), 0L, l46Var26, 432, 8);
                }
                break;
            case 26:
                l46 l46Var27 = (l46) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (!l46Var27.W(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    l46Var27.Z();
                } else {
                    gu6.a(vd0.V(), null, b.l(g09Var, 18.0f), 0L, l46Var27, 432, 8);
                }
                break;
            case 27:
                l46 l46Var28 = (l46) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (!l46Var28.W(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    l46Var28.Z();
                } else {
                    t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var28, 48);
                    int iHashCode2 = Long.hashCode(l46Var28.T);
                    u8a u8aVarM2 = l46Var28.m();
                    j09 j09VarJ2 = m93.J(l46Var28, g09Var);
                    lf2.q.getClass();
                    l46Var28.j0();
                    if (l46Var28.S) {
                        l46Var28.l(ov7Var);
                    } else {
                        l46Var28.s0();
                    }
                    dec.l(hj6.z, l46Var28, t7cVarA);
                    dec.l(hj6.y, l46Var28, u8aVarM2);
                    dec.l(hj6.X, l46Var28, Integer.valueOf(iHashCode2));
                    dec.k(l46Var28);
                    dec.l(hj6.x, l46Var28, j09VarJ2);
                    gu6.b(od4.A(R.drawable.deck_label_lock, 0, l46Var28), null, b.l(g09Var, 16.0f), 0L, l46Var28, 440, 8);
                    nte.b(afc.q(R.string.deck_selection_locked, l46Var28), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var28, 0, 0, 262142);
                    l46Var28.r(true);
                }
                break;
            case 28:
                l46 l46Var29 = (l46) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (!l46Var29.W(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    l46Var29.Z();
                } else {
                    nte.b("Dev", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var29, 6, 0, 262142);
                }
                break;
            default:
                l46 l46Var30 = (l46) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (!l46Var30.W(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    l46Var30.Z();
                } else {
                    j74.k(null, l46Var30, 0);
                    j74.F(0, l46Var30);
                }
                break;
        }
        return wefVar;
    }
}
