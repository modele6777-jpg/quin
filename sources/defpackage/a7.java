package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a7 implements n26 {
    public final /* synthetic */ int a;

    public /* synthetic */ a7(int i) {
        this.a = i;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        Object obj4;
        j09 j09VarD0;
        int i;
        int i2 = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        switch (i2) {
            case 0:
                zn8 zn8Var = (zn8) obj;
                final int iD0 = zn8Var.D0(10.0f);
                int i3 = iD0 * 2;
                final cea ceaVarV = ((tn8) obj2).v(ll2.i(i3, 0, ((kl2) obj3).a));
                int i4 = ceaVarV.b;
                int i5 = ceaVarV.a - i3;
                final boolean z = true ? 1 : 0;
                return zn8Var.n0(i5, i4, qu4.a, new a26() { // from class: b7
                    @Override // defpackage.a26
                    public final Object d(Object obj5) {
                        int i6 = z;
                        wef wefVar2 = wef.a;
                        int i7 = iD0;
                        cea ceaVar = ceaVarV;
                        bea beaVar = (bea) obj5;
                        switch (i6) {
                            case 0:
                                beaVar.g(ceaVar, 0, -i7, 0.0f);
                                break;
                            default:
                                beaVar.g(ceaVar, -i7, 0, 0.0f);
                                break;
                        }
                        return wefVar2;
                    }
                });
            case 1:
                zn8 zn8Var2 = (zn8) obj;
                final int iD1 = zn8Var2.D0(10.0f);
                int i6 = iD1 * 2;
                final cea ceaVarV2 = ((tn8) obj2).v(ll2.i(0, i6, ((kl2) obj3).a));
                int i7 = ceaVarV2.b - i6;
                int i8 = ceaVarV2.a;
                final int i9 = false ? 1 : 0;
                return zn8Var2.n0(i8, i7, qu4.a, new a26() { // from class: b7
                    @Override // defpackage.a26
                    public final Object d(Object obj5) {
                        int i10 = i9;
                        wef wefVar2 = wef.a;
                        int i11 = iD1;
                        cea ceaVar = ceaVarV2;
                        bea beaVar = (bea) obj5;
                        switch (i10) {
                            case 0:
                                beaVar.g(ceaVar, 0, -i11, 0.0f);
                                break;
                            default:
                                beaVar.g(ceaVar, -i11, 0, 0.0f);
                                break;
                        }
                        return wefVar2;
                    }
                });
            case 2:
                ((Integer) obj).intValue();
                l46 l46Var = (l46) obj2;
                ((Integer) obj3).intValue();
                l46Var.f0(659368205);
                l46Var.r(false);
                return "";
            case 3:
                nz0 nz0Var = nz0.a;
                ((Throwable) obj).getClass();
                ((pv2) obj3).getClass();
                if (obj2 != null) {
                    nz0Var.d(obj2);
                }
                return wefVar;
            case 4:
                j09 j09Var = (j09) obj;
                l46 l46Var2 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var.getClass();
                l46Var2.f0(564626711);
                j09 j09VarO = tm7.o(j09Var, ((e8b) l46Var2.k(l8b.a)).a, g21.f);
                l46Var2.r(false);
                return j09VarO;
            case 5:
                j09 j09Var2 = (j09) obj;
                l46 l46Var3 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var2.getClass();
                l46Var3.f0(1671292636);
                j09 j09VarB0 = ynb.b0(0.0f, 24.0f, j09Var2, 1);
                l46Var3.r(false);
                return j09VarB0;
            case 6:
                j09 j09Var3 = (j09) obj;
                l46 l46Var4 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var3.getClass();
                l46Var4.f0(-521007607);
                if (Build.VERSION.SDK_INT >= 30) {
                    l46Var4.f0(1822865109);
                    l46Var4.r(false);
                    j09VarD0 = mh3.L(j09Var3);
                } else {
                    l46Var4.f0(674271898);
                    Context context = (Context) l46Var4.k(uq.b);
                    boolean zI = l46Var4.i(context);
                    Object objR = l46Var4.R();
                    if (zI || objR == sf2.a) {
                        obj4 = objR;
                        wc2 wc2Var = new wc2(context, null);
                        l46Var4.p0(wc2Var);
                        obj4 = wc2Var;
                    }
                    obj4 = objR;
                    j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, ((Number) uyb.x((l26) obj4, l46Var4, 0).getValue()).intValue() / ((sw3) l46Var4.k(zg2.h)).getDensity(), 7, j09Var3);
                    l46Var4.r(false);
                }
                l46Var4.r(false);
                return j09VarD0;
            case 7:
                l46 l46Var5 = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var5.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nte.b(afc.q(R.string.about_update_has_newer_version, l46Var5), null, ((m82) l46Var5.k(o82.a)).a, w6c.l(17), null, null, 0L, mne.c, null, 0L, 0, false, 0, 0, null, null, l46Var5, 805330944, 0, 261610);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 8:
                l46 l46Var6 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var6.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strQ = afc.q(R.string.account_sign_out, l46Var6);
                    mue mueVar = pue.a;
                    nte.b(strQ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var6), l46Var6, 0, 0, 131070);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 9:
                l46 l46Var7 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var7.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    String strQ2 = afc.q(R.string.all_content_shown, l46Var7);
                    mue mueVar2 = pue.a;
                    nte.b(strQ2, j09VarC, y72.b(((m82) l46Var7.k(o82.a)).q, 0.32f), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.j(l46Var7), l46Var7, 48, 0, 130040);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                xw9 xw9Var = (xw9) obj;
                l46 l46Var8 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= l46Var8.g(xw9Var) ? 4 : 2;
                }
                if (l46Var8.W(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    kn2.r(b.c, xw9Var, l46Var8, ((iIntValue4 << 3) & 112) | 6);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var9 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var9.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    n16.o(fj8.RoseQuartz, null, l46Var9, 6, 2);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var10 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var10.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    gx6 gx6VarK = iqf.k();
                    pr4 pr4Var = l8b.a;
                    gu6.a(gx6VarK, null, null, ((e8b) l46Var10.k(pr4Var)).q, l46Var10, 48, 4);
                    String strQ3 = afc.q(R.string.annual_forward_replay, l46Var10);
                    mue mueVar3 = pue.a;
                    vd0.e(strQ3, null, mue.a(pue.a(l46Var10), ((e8b) l46Var10.k(pr4Var)).q, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), null, 0, false, 0, 0, new co0(w6c.l(12), w6c.l(19), w6c.k(0.25d)), l46Var10, 0, 506);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var11 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var11.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    long j = ((y72) l46Var11.k(em2.a)).a;
                    gu6.a(t72.C(), null, null, j, l46Var11, 48, 4);
                    String strQ4 = afc.q(R.string.annual_share_to_friend_try, l46Var11);
                    mue mueVar4 = pue.a;
                    vd0.e(strQ4, null, mue.a(pue.a(l46Var11), j, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), null, 0, false, 0, 0, new co0(w6c.l(12), w6c.l(19), w6c.k(0.25d)), l46Var11, 0, 506);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case 14:
                l46 l46Var12 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var12.W(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    String strY = c5e.y(5, "这是一个示例内容区域，用于展示年运分享预览效果。在实际使用中，这里会显示月度报告、领域报告等详细内容。");
                    mue mueVar5 = pue.a;
                    nte.b(strY, null, ((e8b) l46Var12.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var12), l46Var12, 0, 0, 131066);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case 15:
                l46 l46Var13 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var13.W(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    l46Var13.Z();
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l46 l46Var14 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var14.W(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    l46Var14.Z();
                }
                return wefVar;
            case 17:
                l46 l46Var15 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var15.W(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    l46Var15.Z();
                }
                return wefVar;
            case 18:
                l46 l46Var16 = (l46) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var16.W(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    l46Var16.Z();
                }
                return wefVar;
            case 19:
                l46 l46Var17 = (l46) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var17.W(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    j09 j09VarA0 = ynb.a0(g09Var, 24.0f, 36.0f);
                    t7c t7cVarA = s7c.a(new uc0(16.0f, true, new qc0(0)), ndb.z, l46Var17, 54);
                    int iHashCode = Long.hashCode(l46Var17.T);
                    u8a u8aVarM = l46Var17.m();
                    j09 j09VarJ = m93.J(l46Var17, j09VarA0);
                    lf2.q.getClass();
                    l46Var17.j0();
                    if (l46Var17.S) {
                        l46Var17.l(ov7Var);
                    } else {
                        l46Var17.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var17, t7cVarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var17, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var17, numValueOf);
                    dec.k(l46Var17);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var17, j09VarJ);
                    gu6.b(od4.A(we6.e(l46Var17) ? R.drawable.ic_deck_greyscale : R.drawable.ic_deck, 0, l46Var17), null, null, 0L, l46Var17, 56, 12);
                    jw7 jw7Var = new jw7(1.0f, true);
                    c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Y, l46Var17, 6);
                    int iHashCode2 = Long.hashCode(l46Var17.T);
                    u8a u8aVarM2 = l46Var17.m();
                    j09 j09VarJ2 = m93.J(l46Var17, jw7Var);
                    l46Var17.j0();
                    if (l46Var17.S) {
                        l46Var17.l(ov7Var);
                    } else {
                        l46Var17.s0();
                    }
                    dec.l(he2Var, l46Var17, c92VarA);
                    dec.l(he2Var2, l46Var17, u8aVarM2);
                    ib8.s(iHashCode2, l46Var17, he2Var3, l46Var17);
                    dec.l(he2Var4, l46Var17, j09VarJ2);
                    String strQ5 = afc.q(R.string.photo_select_from_deck, l46Var17);
                    pr4 pr4Var2 = nte.a;
                    mue mueVar6 = (mue) l46Var17.k(pr4Var2);
                    pr4 pr4Var3 = o82.a;
                    nte.b(strQ5, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVar6, y72.b(((m82) l46Var17.k(pr4Var3)).o, 0.88f), w6c.l(17), null, null, 0L, null, 0, 0L, null, null, 16777212), l46Var17, 0, 0, 131070);
                    nte.b(afc.q(R.string.photo_select_multiple_cards_at_a_time, l46Var17), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var17.k(pr4Var2), y72.b(((m82) l46Var17.k(pr4Var3)).o, 0.64f), w6c.l(13), null, null, 0L, null, 0, 0L, null, null, 16777212), l46Var17, 0, 0, 131070);
                    l46Var17.r(true);
                    l46Var17.r(true);
                } else {
                    l46Var17.Z();
                }
                return wefVar;
            case 20:
                l46 l46Var18 = (l46) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var18.W(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode3 = Long.hashCode(l46Var18.T);
                    u8a u8aVarM3 = l46Var18.m();
                    j09 j09VarJ3 = m93.J(l46Var18, g09Var);
                    lf2.q.getClass();
                    l46Var18.j0();
                    if (l46Var18.S) {
                        l46Var18.l(ov7Var);
                    } else {
                        l46Var18.s0();
                    }
                    he2 he2Var5 = hj6.z;
                    dec.l(he2Var5, l46Var18, xn8VarC);
                    he2 he2Var6 = hj6.y;
                    dec.l(he2Var6, l46Var18, u8aVarM3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    he2 he2Var7 = hj6.X;
                    dec.l(he2Var7, l46Var18, numValueOf2);
                    dec.k(l46Var18);
                    he2 he2Var8 = hj6.x;
                    dec.l(he2Var8, l46Var18, j09VarJ3);
                    j09 j09VarA1 = ynb.a0(g09Var, 24.0f, 36.0f);
                    t7c t7cVarA2 = s7c.a(new uc0(16.0f, true, new qc0(0)), ndb.z, l46Var18, 54);
                    int iHashCode4 = Long.hashCode(l46Var18.T);
                    u8a u8aVarM4 = l46Var18.m();
                    j09 j09VarJ4 = m93.J(l46Var18, j09VarA1);
                    l46Var18.j0();
                    if (l46Var18.S) {
                        l46Var18.l(ov7Var);
                    } else {
                        l46Var18.s0();
                    }
                    dec.l(he2Var5, l46Var18, t7cVarA2);
                    dec.l(he2Var6, l46Var18, u8aVarM4);
                    ib8.s(iHashCode4, l46Var18, he2Var7, l46Var18);
                    dec.l(he2Var8, l46Var18, j09VarJ4);
                    gu6.b(od4.A(we6.e(l46Var18) ? R.drawable.ic_camera_greyscale : R.drawable.ic_camera, 0, l46Var18), null, null, 0L, l46Var18, 56, 12);
                    jw7 jw7Var2 = new jw7(1.0f, true);
                    c92 c92VarA2 = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Y, l46Var18, 6);
                    int iHashCode5 = Long.hashCode(l46Var18.T);
                    u8a u8aVarM5 = l46Var18.m();
                    j09 j09VarJ5 = m93.J(l46Var18, jw7Var2);
                    l46Var18.j0();
                    if (l46Var18.S) {
                        l46Var18.l(ov7Var);
                    } else {
                        l46Var18.s0();
                    }
                    dec.l(he2Var5, l46Var18, c92VarA2);
                    dec.l(he2Var6, l46Var18, u8aVarM5);
                    ib8.s(iHashCode5, l46Var18, he2Var7, l46Var18);
                    dec.l(he2Var8, l46Var18, j09VarJ5);
                    String strQ6 = afc.q(R.string.photo_recognize_your_draw, l46Var18);
                    pr4 pr4Var4 = nte.a;
                    mue mueVar7 = (mue) l46Var18.k(pr4Var4);
                    pr4 pr4Var5 = o82.a;
                    nte.b(strQ6, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVar7, y72.b(((m82) l46Var18.k(pr4Var5)).o, 0.88f), w6c.l(17), null, null, 0L, null, 0, 0L, null, null, 16777212), l46Var18, 0, 0, 131070);
                    nte.b(afc.q(R.string.photo_shot_multiple_cards_at_a_time, l46Var18), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var18.k(pr4Var4), y72.b(((m82) l46Var18.k(pr4Var5)).o, 0.64f), w6c.l(13), null, null, 0L, null, 0, 0L, null, null, 16777212), l46Var18, 0, 0, 131070);
                    tec.s(l46Var18, true, true, true);
                } else {
                    l46Var18.Z();
                }
                return wefVar;
            case 21:
                l46 l46Var19 = (l46) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var19.W(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    nte.b(afc.q(R.string.button_cancel, l46Var19), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var19, 0, 0, 262142);
                } else {
                    l46Var19.Z();
                }
                return wefVar;
            case 22:
                l46 l46Var20 = (l46) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var20.W(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    s21.a(b.l(g09Var, 48.0f), l46Var20, 6);
                } else {
                    l46Var20.Z();
                }
                return wefVar;
            case 23:
                l46 l46Var21 = (l46) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var21.W(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    nte.b("Export Config JSON", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var21, 6, 0, 262142);
                } else {
                    l46Var21.Z();
                }
                return wefVar;
            case 24:
                l46 l46Var22 = (l46) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var22.W(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    nte.b(afc.q(R.string.button_try_again, l46Var22), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var22, 0, 0, 262142);
                } else {
                    l46Var22.Z();
                }
                return wefVar;
            case 25:
                l46 l46Var23 = (l46) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var23.W(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    nte.b(afc.q(R.string.button_re_ask, l46Var23), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var23, 0, 0, 262142);
                } else {
                    l46Var23.Z();
                }
                return wefVar;
            case 26:
                l46 l46Var24 = (l46) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var24.W(1 & iIntValue20, (iIntValue20 & 17) != 16)) {
                    s21.a(tm7.o(b.d(b.c(g09Var, 1.0f), 0.5f), ((e8b) l46Var24.k(l8b.a)).z, g21.f), l46Var24, 0);
                } else {
                    l46Var24.Z();
                }
                return wefVar;
            case 27:
                l46 l46Var25 = (l46) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var25.W(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    gu6.b(o7c.x(z5c.v(), l46Var25), "Send", null, 0L, l46Var25, 56, 12);
                } else {
                    l46Var25.Z();
                }
                return wefVar;
            case 28:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l46 l46Var26 = (l46) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                if ((iIntValue22 & 6) == 0) {
                    iIntValue22 |= l46Var26.h(zBooleanValue) ? 4 : 2;
                }
                if (l46Var26.W(1 & iIntValue22, (iIntValue22 & 19) != 18)) {
                    pr4 pr4Var6 = l8b.a;
                    if (k8b.f((e8b) l46Var26.k(pr4Var6))) {
                        i = zBooleanValue ? R.drawable.arrow_fold_greyscale : R.drawable.arrow_unfold_greyscale;
                    } else {
                        i = zBooleanValue ? R.drawable.arrow_fold : R.drawable.arrow_unfold;
                    }
                    gu6.b(od4.A(i, 0, l46Var26), zBooleanValue ? "Collapse" : "Expand", b.l(g09Var, 28.0f), ((e8b) l46Var26.k(pr4Var6)).u, l46Var26, 392, 0);
                } else {
                    l46Var26.Z();
                }
                return wefVar;
            default:
                l46 l46Var27 = (l46) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var27.W(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    gu6.b(o7c.x(z5c.v(), l46Var27), "", null, 0L, l46Var27, 56, 12);
                } else {
                    l46Var27.Z();
                }
                return wefVar;
        }
    }
}
