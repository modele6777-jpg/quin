package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinDetailRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinGraphEntryRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinMallRoute;
import android.content.Context;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xw5 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka9 b;

    public /* synthetic */ xw5(ka9 ka9Var, int i) {
        this.a = i;
        this.b = ka9Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objD;
        kob kobVar;
        ewf ewfVarG;
        String str;
        Object dzbVar;
        Object dbaVar;
        ka9 ka9Var;
        mmd mmdVar;
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        ib8.u((Integer) obj4, (ly) obj, da9Var);
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = new ead(24);
            l46Var.p0(objR);
        }
        x16 x16Var = (x16) objR;
        l46Var.f0(-1133765112);
        ya9 ya9Var = da9Var.b.c;
        Object obj5 = null;
        String str2 = ya9Var != null ? (String) ya9Var.b.f : null;
        ka9 ka9Var2 = this.b;
        if (str2 == null) {
            l46Var.f0(-373403315);
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
            gy2 gy2VarR = b21.r(pwfVarA);
            nfc nfcVarB = kr7.b(l46Var);
            kobVar = job.a;
            ewfVarG = z5c.G(kobVar.b(and.class), pwfVarA.g(), null, gy2VarR, nfcVarB, x16Var);
            l46Var.r(false);
        } else {
            l46Var.f0(1373427154);
            l46Var.r(false);
            boolean zI = l46Var.i(ka9Var2);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                vx7 vx7Var = new vx7(1, ka9Var2, ka9.class, "getBackStackEntry", "getBackStackEntry(Ljava/lang/String;)Landroidx/navigation/NavBackStackEntry;", 0, 23);
                l46Var.p0(vx7Var);
                objR2 = vx7Var;
            }
            a26 a26Var = (a26) ((ym7) objR2);
            a26Var.getClass();
            try {
                objD = a26Var.d(str2);
            } catch (IllegalArgumentException unused) {
                objD = null;
            }
            if (objD == null) {
                objD = da9Var;
            }
            da9 da9Var2 = (da9) objD;
            gy2 gy2VarR2 = b21.r(da9Var2);
            nfc nfcVarB2 = kr7.b(l46Var);
            kobVar = job.a;
            ewfVarG = z5c.G(kobVar.b(and.class), da9Var2.g(), null, gy2VarR2, nfcVarB2, x16Var);
        }
        l46Var.r(false);
        and andVar = (and) ewfVarG;
        whb whbVar = andVar.b1;
        e89 e89VarT = tm7.t(whbVar, l46Var);
        Context context = (Context) l46Var.k(uq.b);
        boolean zI2 = l46Var.i(context) | l46Var.i(andVar);
        Object objR3 = l46Var.R();
        if (zI2 || objR3 == i8cVar) {
            objR3 = new fnd(null, andVar, context);
            l46Var.p0(objR3);
        }
        int i = and.q1;
        af1.o((l26) objR3, l46Var, andVar);
        boolean zG = l46Var.g(da9Var);
        Object objR4 = l46Var.R();
        if (zG || objR4 == i8cVar) {
            ya9 ya9Var2 = da9Var.b.c;
            if (ya9Var2 == null || (str = (String) ya9Var2.b.f) == null) {
                objR4 = null;
            } else {
                try {
                    dzbVar = (SkinNavigationRoute$SkinGraphEntryRoute) vfh.S(ka9Var2.b(str), kobVar.b(SkinNavigationRoute$SkinGraphEntryRoute.class));
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                if (dzbVar instanceof dzb) {
                    dzbVar = null;
                }
                objR4 = (SkinNavigationRoute$SkinGraphEntryRoute) dzbVar;
            }
            l46Var.p0(objR4);
        }
        SkinNavigationRoute$SkinGraphEntryRoute skinNavigationRoute$SkinGraphEntryRoute = (SkinNavigationRoute$SkinGraphEntryRoute) objR4;
        if (skinNavigationRoute$SkinGraphEntryRoute != null && skinNavigationRoute$SkinGraphEntryRoute.getFromDeckSelection()) {
            andVar.T0.setValue(Boolean.TRUE);
        }
        if (skinNavigationRoute$SkinGraphEntryRoute != null && skinNavigationRoute$SkinGraphEntryRoute.getFromDailyFortune()) {
            andVar.U0.setValue(Boolean.TRUE);
        }
        SkinNavigationRoute$SkinMallRoute skinNavigationRoute$SkinMallRoute = (SkinNavigationRoute$SkinMallRoute) vfh.S(da9Var, job.a.b(SkinNavigationRoute$SkinMallRoute.class));
        TarotSkinIdentify tarotSkinIdentify = skinNavigationRoute$SkinMallRoute.getTarotSkinIdentify();
        if (tarotSkinIdentify == null) {
            tarotSkinIdentify = skinNavigationRoute$SkinGraphEntryRoute != null ? skinNavigationRoute$SkinGraphEntryRoute.getTarotSkinIdentify() : null;
        }
        for (Object obj6 : ((zke) whbVar.a.getValue()).b) {
            if (((mmd) obj6).a == tarotSkinIdentify) {
                obj5 = obj6;
                break;
            }
        }
        mmd mmdVar2 = (mmd) obj5;
        zke zkeVar = (zke) e89VarT.getValue();
        boolean zI3 = l46Var.i(ka9Var2);
        Object objR5 = l46Var.R();
        if (zI3 || objR5 == i8cVar) {
            objR5 = new z8(ka9Var2, 20);
            l46Var.p0(objR5);
        }
        a26 a26Var2 = (a26) objR5;
        boolean zI4 = l46Var.i(ka9Var2);
        Object objR6 = l46Var.R();
        if (zI4 || objR6 == i8cVar) {
            objR6 = new z8(ka9Var2, 21);
            l46Var.p0(objR6);
        }
        a26 a26Var3 = (a26) objR6;
        boolean zI5 = l46Var.i(ka9Var2);
        Object objR7 = l46Var.R();
        if (zI5 || objR7 == i8cVar) {
            dbaVar = new dba(0, ka9Var2, ka9.class, "popBackStack", "popBackStack()Z", 8, 6);
            ka9Var = ka9Var2;
            l46Var.p0(dbaVar);
        } else {
            dbaVar = objR7;
            ka9Var = ka9Var2;
        }
        tgc.a(zkeVar, a26Var2, a26Var3, (x16) dbaVar, l46Var, 0);
        Boolean bool = (Boolean) andVar.S0.getValue();
        bool.booleanValue();
        boolean zG2 = l46Var.g(mmdVar2) | l46Var.i(andVar) | l46Var.g(skinNavigationRoute$SkinMallRoute) | l46Var.i(ka9Var);
        Object objR8 = l46Var.R();
        if (zG2 || objR8 == i8cVar) {
            gnd gndVar = new gnd(mmdVar2, andVar, skinNavigationRoute$SkinMallRoute, ka9Var, null);
            mmdVar = mmdVar2;
            l46Var.p0(gndVar);
            objR8 = gndVar;
        } else {
            mmdVar = mmdVar2;
        }
        af1.p(mmdVar, bool, (l26) objR8, l46Var);
        return wef.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objD;
        kob kobVar;
        boolean z;
        ewf ewfVarG;
        Object next;
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).getClass();
        ((ly) obj).getClass();
        da9Var.getClass();
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = new ead(25);
            l46Var.p0(objR);
        }
        x16 x16Var = (x16) objR;
        l46Var.f0(-1133765112);
        ya9 ya9Var = da9Var.b.c;
        mmd mmdVar = null;
        String str = ya9Var != null ? (String) ya9Var.b.f : null;
        final ka9 ka9Var = this.b;
        if (str == null) {
            l46Var.f0(-373403315);
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
            gy2 gy2VarR = b21.r(pwfVarA);
            nfc nfcVarB = kr7.b(l46Var);
            kobVar = job.a;
            ewf ewfVarG2 = z5c.G(kobVar.b(and.class), pwfVarA.g(), null, gy2VarR, nfcVarB, x16Var);
            l46Var.r(false);
            l46Var.r(false);
            ewfVarG = ewfVarG2;
            z = false;
        } else {
            l46Var.f0(1373427154);
            l46Var.r(false);
            boolean zI = l46Var.i(ka9Var);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                vx7 vx7Var = new vx7(1, ka9Var, ka9.class, "getBackStackEntry", "getBackStackEntry(Ljava/lang/String;)Landroidx/navigation/NavBackStackEntry;", 0, 24);
                l46Var.p0(vx7Var);
                objR2 = vx7Var;
            }
            a26 a26Var = (a26) ((ym7) objR2);
            a26Var.getClass();
            try {
                objD = a26Var.d(str);
            } catch (IllegalArgumentException unused) {
                objD = null;
            }
            if (objD == null) {
                objD = da9Var;
            }
            da9 da9Var2 = (da9) objD;
            gy2 gy2VarR2 = b21.r(da9Var2);
            nfc nfcVarB2 = kr7.b(l46Var);
            kobVar = job.a;
            em7 em7VarB = kobVar.b(and.class);
            owf owfVarG = da9Var2.g();
            z = false;
            ewfVarG = z5c.G(em7VarB, owfVarG, null, gy2VarR2, nfcVarB2, x16Var);
            l46Var.r(false);
        }
        final and andVar = (and) ewfVarG;
        Context context = (Context) l46Var.k(uq.b);
        boolean zI2 = l46Var.i(context) | l46Var.i(andVar);
        Object objR3 = l46Var.R();
        if (zI2 || objR3 == i8cVar) {
            objR3 = new hnd(null, andVar, context);
            l46Var.p0(objR3);
        }
        int i = and.q1;
        af1.o((l26) objR3, l46Var, andVar);
        SkinNavigationRoute$SkinDetailRoute skinNavigationRoute$SkinDetailRoute = (SkinNavigationRoute$SkinDetailRoute) vfh.S(da9Var, kobVar.b(SkinNavigationRoute$SkinDetailRoute.class));
        Iterator it = ((zke) tm7.t(andVar.b1, l46Var).getValue()).b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((mmd) next).a != skinNavigationRoute$SkinDetailRoute.getTarotSkinIdentify());
        mmd mmdVar2 = (mmd) next;
        wef wefVar = wef.a;
        if (mmdVar2 != null) {
            TarotSkinIdentify tarotSkinIdentify = mmdVar2.a;
            if (tarotSkinIdentify != TarotSkinIdentify.Classic && tarotSkinIdentify != TarotSkinIdentify.NeoRiderWaite) {
                mmdVar = mmdVar2;
            }
            if (mmdVar != null) {
                boolean z2 = (mmdVar.c || andVar.Q()) ? true : z;
                TarotSkinIdentify tarotSkinIdentify2 = mmdVar.a;
                n07 n07Var = mmdVar.b;
                gmd gmdVar = mmdVar.d;
                float f = mmdVar.e;
                tarotSkinIdentify2.getClass();
                gmdVar.getClass();
                mmd mmdVar3 = new mmd(tarotSkinIdentify2, n07Var, z2, gmdVar, f);
                ij ijVarP = andVar.P();
                boolean z3 = (andVar.q() || ((Boolean) andVar.X0.getValue()).booleanValue()) ? true : z;
                boolean zS = andVar.S();
                boolean zT = andVar.T();
                boolean zI3 = l46Var.i(andVar);
                Object objR4 = l46Var.R();
                if (zI3 || objR4 == i8cVar) {
                    objR4 = new yv9(0, andVar, and.class, "refreshPurchaseEntitlement", "refreshPurchaseEntitlement()V", 0, 18);
                    l46Var.p0(objR4);
                }
                ym7 ym7Var = (ym7) objR4;
                ynd yndVar = (ynd) andVar.a1.getValue();
                String str2 = (String) andVar.c1.getValue();
                boolean zI4 = l46Var.i(andVar);
                Object objR5 = l46Var.R();
                if (zI4 || objR5 == i8cVar) {
                    yv9 yv9Var = new yv9(0, andVar, and.class, "hidePurchaseSuccessDialog", "hidePurchaseSuccessDialog()V", 0, 19);
                    l46Var.p0(yv9Var);
                    objR5 = yv9Var;
                }
                ym7 ym7Var2 = (ym7) objR5;
                boolean zBooleanValue = ((Boolean) andVar.T0.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) andVar.U0.getValue()).booleanValue();
                boolean zI5 = l46Var.i(andVar);
                Object objR6 = l46Var.R();
                if (zI5 || objR6 == i8cVar) {
                    yv9 yv9Var2 = new yv9(0, andVar, and.class, "purchaseYearly", "purchaseYearly()V", 0, 20);
                    l46Var.p0(yv9Var2);
                    objR6 = yv9Var2;
                }
                ym7 ym7Var3 = (ym7) objR6;
                boolean zI6 = l46Var.i(andVar) | l46Var.g(mmdVar);
                Object objR7 = l46Var.R();
                if (zI6 || objR7 == i8cVar) {
                    objR7 = new ykc(10, andVar, mmdVar);
                    l46Var.p0(objR7);
                }
                x16 x16Var2 = (x16) objR7;
                x16 x16Var3 = (x16) ym7Var3;
                boolean zI7 = l46Var.i(andVar) | l46Var.g(skinNavigationRoute$SkinDetailRoute);
                Object objR8 = l46Var.R();
                if (zI7 || objR8 == i8cVar) {
                    objR8 = new ykc(11, andVar, skinNavigationRoute$SkinDetailRoute);
                    l46Var.p0(objR8);
                }
                x16 x16Var4 = (x16) objR8;
                Object objR9 = l46Var.R();
                if (objR9 == i8cVar) {
                    objR9 = new ead(26);
                    l46Var.p0(objR9);
                }
                x16 x16Var5 = (x16) objR9;
                x16 x16Var6 = (x16) ym7Var;
                boolean zI8 = l46Var.i(andVar) | l46Var.i(ka9Var);
                Object objR10 = l46Var.R();
                if (zI8 || objR10 == i8cVar) {
                    objR10 = new h6b(28, andVar, ka9Var);
                    l46Var.p0(objR10);
                }
                a26 a26Var2 = (a26) objR10;
                boolean zI9 = l46Var.i(andVar) | l46Var.i(ka9Var);
                Object objR11 = l46Var.R();
                if (zI9 || objR11 == i8cVar) {
                    final int i2 = 2;
                    objR11 = new x16() { // from class: end
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i3 = i2;
                            wef wefVar2 = wef.a;
                            ka9 ka9Var2 = ka9Var;
                            and andVar2 = andVar;
                            switch (i3) {
                                case 0:
                                    andVar2.a0(null);
                                    ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    break;
                                case 1:
                                    if (((Boolean) andVar2.T0.getValue()).booleanValue() || ((Boolean) andVar2.U0.getValue()).booleanValue()) {
                                        ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    } else {
                                        ka9Var2.g();
                                    }
                                    break;
                                case 2:
                                    andVar2.a0(null);
                                    ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    break;
                                default:
                                    andVar2.a0(null);
                                    ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    break;
                            }
                            return wefVar2;
                        }
                    };
                    l46Var.p0(objR11);
                }
                x16 x16Var7 = (x16) objR11;
                boolean zI10 = l46Var.i(andVar) | l46Var.i(ka9Var);
                Object objR12 = l46Var.R();
                if (zI10 || objR12 == i8cVar) {
                    final int i3 = 3;
                    objR12 = new x16() { // from class: end
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i4 = i3;
                            wef wefVar2 = wef.a;
                            ka9 ka9Var2 = ka9Var;
                            and andVar2 = andVar;
                            switch (i4) {
                                case 0:
                                    andVar2.a0(null);
                                    ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    break;
                                case 1:
                                    if (((Boolean) andVar2.T0.getValue()).booleanValue() || ((Boolean) andVar2.U0.getValue()).booleanValue()) {
                                        ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    } else {
                                        ka9Var2.g();
                                    }
                                    break;
                                case 2:
                                    andVar2.a0(null);
                                    ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    break;
                                default:
                                    andVar2.a0(null);
                                    ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    break;
                            }
                            return wefVar2;
                        }
                    };
                    l46Var.p0(objR12);
                }
                x16 x16Var8 = (x16) objR12;
                boolean zI11 = l46Var.i(andVar) | l46Var.i(ka9Var);
                Object objR13 = l46Var.R();
                if (zI11 || objR13 == i8cVar) {
                    final int i4 = 0;
                    objR13 = new x16() { // from class: end
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i5 = i4;
                            wef wefVar2 = wef.a;
                            ka9 ka9Var2 = ka9Var;
                            and andVar2 = andVar;
                            switch (i5) {
                                case 0:
                                    andVar2.a0(null);
                                    ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    break;
                                case 1:
                                    if (((Boolean) andVar2.T0.getValue()).booleanValue() || ((Boolean) andVar2.U0.getValue()).booleanValue()) {
                                        ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    } else {
                                        ka9Var2.g();
                                    }
                                    break;
                                case 2:
                                    andVar2.a0(null);
                                    ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    break;
                                default:
                                    andVar2.a0(null);
                                    ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    break;
                            }
                            return wefVar2;
                        }
                    };
                    l46Var.p0(objR13);
                }
                x16 x16Var9 = (x16) objR13;
                x16 x16Var10 = (x16) ym7Var2;
                boolean zI12 = l46Var.i(andVar) | l46Var.i(ka9Var);
                Object objR14 = l46Var.R();
                if (zI12 || objR14 == i8cVar) {
                    final int i5 = 1;
                    objR14 = new x16() { // from class: end
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i6 = i5;
                            wef wefVar2 = wef.a;
                            ka9 ka9Var2 = ka9Var;
                            and andVar2 = andVar;
                            switch (i6) {
                                case 0:
                                    andVar2.a0(null);
                                    ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    break;
                                case 1:
                                    if (((Boolean) andVar2.T0.getValue()).booleanValue() || ((Boolean) andVar2.U0.getValue()).booleanValue()) {
                                        ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    } else {
                                        ka9Var2.g();
                                    }
                                    break;
                                case 2:
                                    andVar2.a0(null);
                                    ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    break;
                                default:
                                    andVar2.a0(null);
                                    ka9Var2.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                                    break;
                            }
                            return wefVar2;
                        }
                    };
                    l46Var.p0(objR14);
                }
                xld.c(null, mmdVar3, yndVar, true, str2, zBooleanValue, zBooleanValue2, x16Var2, x16Var3, x16Var4, x16Var5, x16Var6, zS, zT, ijVarP, z3, a26Var2, x16Var7, x16Var8, x16Var9, x16Var10, (x16) objR14, l46Var, 3072);
                return wefVar;
            }
        }
        ka9Var.g();
        return wefVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v19 java.lang.Object, still in use, count: 2, list:
          (r3v19 java.lang.Object) from 0x0a30: PHI (r3 I:??) = (r3v17 java.lang.Object), (r3v19 java.lang.Object) binds: [B:298:0x0a2f, B:374:0x0a30] A[DONT_GENERATE, DONT_INLINE]
          (r3v19 java.lang.Object) from 0x0a28: CHECK_CAST (android.content.Context) (r3v19 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.o26
    public final java.lang.Object t(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30, java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 3152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw5.t(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
