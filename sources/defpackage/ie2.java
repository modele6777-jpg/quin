package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.b;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ie2 implements n26 {
    public final /* synthetic */ int a;

    public /* synthetic */ ie2(x16 x16Var) {
        this.a = 10;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        iy9 iy9Var;
        long jD;
        Bitmap bitmap;
        int i = this.a;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        ks ksVar = null;
        wef wefVar = wef.a;
        int i2 = 1;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nte.b(afc.q(R.string.button_renew_now, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nte.b(afc.q(R.string.button_remind_later, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 262142);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strQ = afc.q(R.string.seasonal_suggested_refresh, l46Var3);
                    mue mueVar = pue.a;
                    nte.b(strQ, null, ((e8b) l46Var3.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.i(l46Var3), l46Var3, 0, 0, 131066);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String strQ2 = afc.q(R.string.template_change, l46Var4);
                    long jL = w6c.l(14);
                    long jL2 = w6c.l(22);
                    pr4 pr4Var = o82.a;
                    nte.b(strQ2, null, ((m82) l46Var4.k(pr4Var)).a, jL, ar5.c, null, 0L, null, null, jL2, 0, false, 0, 0, null, null, l46Var4, 1597440, 48, 260010);
                    gu6.a(rxg.H(), "", b.l(g09Var, 16.0f), ((m82) l46Var4.k(pr4Var)).a, l46Var4, 432, 0);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    String strQ3 = afc.q(R.string.more_questions, l46Var5);
                    ar5 ar5Var = ar5.c;
                    mue mueVar2 = pue.a;
                    nte.b(strQ3, null, 0L, 0L, ar5Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.i(l46Var5), l46Var5, 1572864, 0, 131006);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                l46 l46Var6 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    String strQ4 = afc.q(R.string.tts_listen_reading, l46Var6);
                    mue mueVar3 = pue.a;
                    nte.b(strQ4, null, ((e8b) l46Var6.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.h(l46Var6), l46Var6, 0, 0, 131066);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 6:
                u7c u7cVar = (u7c) obj;
                l46 l46Var7 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                u7cVar.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= l46Var7.g(u7cVar) ? 4 : 2;
                }
                if (l46Var7.W(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    gu6.b(od4.A(R.drawable.ic_share, 0, l46Var7), null, ynb.Z(b.l(ynb.b0(10.0f, 0.0f, g09Var, 2), 28.0f), 4.0f), 0L, l46Var7, 440, 8);
                    oa7.n(b.d(g09Var, 20.0f), 0.0f, 0L, l46Var7, 54, 4);
                    nte.b(afc.q(R.string.share_button, l46Var7), u7cVar.a(g09Var, 1.0f, true), 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var7, 0, 0, 261116);
                    o5c.f(l46Var7, b.p(g09Var, 48.0f));
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 7:
                l46 l46Var8 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var8.W(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    nte.b(afc.q(R.string.button_cancel, l46Var8), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var8, 0, 0, 262142);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 8:
                l46 l46Var9 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var9.W(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    nte.b(afc.q(R.string.upgrade_paywall_check_purchase, l46Var9), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var9, 0, 0, 262142);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 9:
                l46 l46Var10 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var10.W(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    s21.a(b.l(g09Var, 48.0f), l46Var10, 6);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var11 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var11.W(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    g21.p(af1.b0(555438287, new ie2(11), l46Var11), l46Var11, 6);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ms8 ms8Var = (ms8) obj;
                l46 l46Var12 = (l46) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ms8Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= (iIntValue12 & 8) == 0 ? l46Var12.g(ms8Var) : l46Var12.i(ms8Var) ? 4 : 2;
                }
                if (!l46Var12.W(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    l46Var12.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                j09 j09Var = (j09) obj;
                l46 l46Var13 = (l46) obj2;
                ((Integer) obj3).intValue();
                j09Var.getClass();
                l46Var13.f0(-1102352987);
                j09 j09VarZ = ynb.Z(j09Var, 24.0f);
                l46Var13.r(false);
                return j09VarZ;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                j09 j09Var2 = (j09) obj;
                l46 l46Var14 = (l46) obj2;
                ((Integer) obj3).intValue();
                j09Var2.getClass();
                l46Var14.f0(2093991997);
                j09 j09VarZ2 = ynb.Z(j09Var2, 24.0f);
                l46Var14.r(false);
                return j09VarZ2;
            case 14:
                ((Integer) obj).getClass();
                l46 l46Var15 = (l46) obj2;
                ((Integer) obj3).getClass();
                l46Var15.f0(1417076546);
                String strQ5 = afc.q(h7d.i(e8d.Screenshot), l46Var15);
                l46Var15.r(false);
                return strQ5;
            case 15:
                j09 j09Var3 = (j09) obj;
                l46 l46Var16 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var3.getClass();
                l46Var16.f0(382166376);
                j09 j09VarO = tm7.o(oa7.E(b.d(j09Var3, 48.0f), a7c.b(20.0f)), g21.S(l46Var16) ? abg.c(867086064) : abg.c(856492066), g21.f);
                l46Var16.r(false);
                return j09VarO;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                j09 j09VarN = (j09) obj;
                l46 l46Var17 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09VarN.getClass();
                l46Var17.f0(-1920969919);
                if (g21.S(l46Var17)) {
                    j09VarN = tm7.n(j09VarN, gec.O(new iy9[]{new iy9(Float.valueOf(0.0f), new y72(abg.d(4294176708L))), new iy9(Float.valueOf(0.32f), new y72(abg.d(4294503644L))), new iy9(Float.valueOf(0.6f), new y72(y72.j))}, 0.0f, 0.0f, 14), null, 6);
                }
                l46Var17.r(false);
                return j09VarN;
            case 17:
                j09 j09Var4 = (j09) obj;
                l46 l46Var18 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var4.getClass();
                l46Var18.f0(-343543681);
                j09 j09VarO2 = tm7.o(oa7.E(j09Var4, ((s5d) l46Var18.k(u5d.a)).e), ((m82) l46Var18.k(o82.a)).p, g21.f);
                l46Var18.r(false);
                return j09VarO2;
            case 18:
                j09 j09Var5 = (j09) obj;
                l46 l46Var19 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var5.getClass();
                l46Var19.f0(1119954440);
                j09 j09VarF = b.f(48.0f, 0.0f, j09Var5, 2);
                l46Var19.r(false);
                return j09VarF;
            case 19:
                t27 t27Var = (t27) obj;
                l46 l46Var20 = (l46) obj2;
                ((Integer) obj3).getClass();
                t27Var.getClass();
                l46Var20.f0(-1998730632);
                Object objR = l46Var20.R();
                if (objR == i8cVar) {
                    int iOrdinal = t27Var.ordinal();
                    if (iOrdinal == 0) {
                        iy9Var = new iy9(new y72(abg.d(4290304767L)), new y72(abg.d(4291618303L)));
                    } else if (iOrdinal == 1) {
                        iy9Var = new iy9(new y72(abg.d(4292270299L)), new y72(abg.d(4293059557L)));
                    } else if (iOrdinal == 2) {
                        iy9Var = new iy9(new y72(abg.d(4291028683L)), new y72(abg.d(4292144602L)));
                    } else if (iOrdinal == 3) {
                        iy9Var = new iy9(new y72(abg.d(4294297291L)), new y72(abg.d(4294498266L)));
                    } else {
                        if (iOrdinal != 4) {
                            ap.c();
                            return null;
                        }
                        iy9Var = new iy9(new y72(abg.d(4294962874L)), new y72(abg.d(4294964173L)));
                    }
                    objR = tm7.o(db6.w(g09Var, 1.0f, ((y72) iy9Var.a()).a, a7c.b(4.0f)), ((y72) iy9Var.b()).a, a7c.b(4.0f));
                    l46Var20.p0(objR);
                }
                j09 j09Var6 = (j09) objR;
                l46Var20.r(false);
                return j09Var6;
            case 20:
                t27 t27Var2 = (t27) obj;
                l46 l46Var21 = (l46) obj2;
                ((Integer) obj3).getClass();
                t27Var2.getClass();
                l46Var21.f0(818489191);
                Object objR2 = l46Var21.R();
                if (objR2 == i8cVar) {
                    int iOrdinal2 = t27Var2.ordinal();
                    if (iOrdinal2 == 0) {
                        jD = abg.d(4278206597L);
                    } else if (iOrdinal2 == 1) {
                        jD = abg.d(4281875777L);
                    } else if (iOrdinal2 == 2) {
                        jD = abg.d(4279588644L);
                    } else if (iOrdinal2 == 3) {
                        jD = abg.d(4285668388L);
                    } else {
                        if (iOrdinal2 != 4) {
                            ap.c();
                            return null;
                        }
                        jD = abg.d(4286931972L);
                    }
                    mue mueVar4 = new mue(jD, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214);
                    l46Var21.p0(mueVar4);
                    objR2 = mueVar4;
                }
                mue mueVar5 = (mue) objR2;
                l46Var21.r(false);
                return mueVar5;
            case 21:
                j09 j09VarS = (j09) obj;
                l46 l46Var22 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09VarS.getClass();
                l46Var22.f0(-868541400);
                Context context = (Context) l46Var22.k(uq.b);
                Object objR3 = l46Var22.R();
                if (objR3 == i8cVar) {
                    Drawable drawableT = x57.T(context, R.drawable.share_background_greyscale);
                    BitmapDrawable bitmapDrawable = drawableT instanceof BitmapDrawable ? (BitmapDrawable) drawableT : null;
                    if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                        ksVar = new ks(bitmap);
                    }
                    l46Var22.p0(ksVar);
                    objR3 = ksVar;
                }
                cv6 cv6Var = (cv6) objR3;
                if (cv6Var != null) {
                    l46Var22.f0(-1444622369);
                    boolean zI = l46Var22.i(cv6Var);
                    Object objR4 = l46Var22.R();
                    if (zI || objR4 == i8cVar) {
                        objR4 = new ob(cv6Var, i2);
                        l46Var22.p0(objR4);
                    }
                    j09VarS = b21.s(j09VarS, (a26) objR4);
                    l46Var22.r(false);
                } else {
                    l46Var22.f0(-1444616500);
                    l46Var22.r(false);
                }
                l46Var22.r(false);
                return j09VarS;
            case 22:
                j09 j09Var7 = (j09) obj;
                l46 l46Var23 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var7.getClass();
                l46Var23.f0(-1735000639);
                j09 j09VarB0 = ynb.b0(16.0f, 0.0f, j09Var7, 2);
                l46Var23.r(false);
                return j09VarB0;
            case 23:
                j09 j09Var8 = (j09) obj;
                l46 l46Var24 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var8.getClass();
                l46Var24.f0(-1908484453);
                j09 j09VarO3 = tm7.o(j09Var8, ((e8b) l46Var24.k(l8b.a)).a, g21.f);
                l46Var24.r(false);
                return j09VarO3;
            case 24:
                j09 j09Var9 = (j09) obj;
                l46 l46Var25 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var9.getClass();
                l46Var25.f0(-1000223040);
                j09 j09VarO4 = tm7.o(j09Var9, ((e8b) l46Var25.k(l8b.a)).a, g21.f);
                l46Var25.r(false);
                return j09VarO4;
            case 25:
                j09 j09Var10 = (j09) obj;
                l46 l46Var26 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var10.getClass();
                l46Var26.f0(-724796230);
                j09 j09VarN2 = tm7.n(j09Var10, hy9.e(l46Var26), null, 6);
                l46Var26.r(false);
                return j09VarN2;
            case 26:
                j09 j09Var11 = (j09) obj;
                l46 l46Var27 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var11.getClass();
                l46Var27.f0(-1963195944);
                j09 j09VarO5 = tm7.o(j09Var11, y72.e, g21.f);
                l46Var27.r(false);
                return j09VarO5;
            case 27:
                j09 j09Var12 = (j09) obj;
                l46 l46Var28 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var12.getClass();
                l46Var28.f0(695007483);
                j09 j09VarL = mxb.l(j09Var12, a7c.a);
                l46Var28.r(false);
                return j09VarL;
            case 28:
                p79 p79Var = (p79) obj;
                hs3 hs3Var = (hs3) obj2;
                p79Var.getClass();
                hs3Var.getClass();
                ((hs3) obj3).getClass();
                p79Var.f(hs3Var.a, Boolean.TRUE);
                return wefVar;
            default:
                j09 j09Var13 = (j09) obj;
                l46 l46Var29 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var13.getClass();
                l46Var29.f0(-1566106974);
                j09 j09VarO6 = tm7.o(oa7.E(j09Var13, ((s5d) l46Var29.k(u5d.a)).e), ((m82) l46Var29.k(o82.a)).p, g21.f);
                l46Var29.r(false);
                return j09VarO6;
        }
    }

    public /* synthetic */ ie2(int i) {
        this.a = i;
    }
}
