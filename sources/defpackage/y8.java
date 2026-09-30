package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.annual.AnnualMonthlyShortSummaryRoute;
import ai.askquin.ui.annual.AnnualReportGeneratingRoute;
import ai.askquin.ui.annual.h;
import ai.askquin.ui.annual.model.AnnualActionFor;
import ai.askquin.ui.dailycard.DailyCardDrawRoute;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$DeckCarousel;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$Detail;
import ai.askquin.ui.fourseasons.FourSeasonsEntry;
import ai.askquin.ui.fourseasons.FourSeasonsShareURLRoute;
import ai.askquin.ui.seasonal.SeasonalLoadingRoute;
import ai.askquin.ui.seasonal.SeasonalReadingRoute;
import android.content.Context;
import defpackage.e3b;
import defpackage.ka9;
import defpackage.wef;
import defpackage.xfb;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y8 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka9 b;

    public /* synthetic */ y8(ka9 ka9Var, int i) {
        this.a = i;
        this.b = ka9Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Object next;
        pwf pwfVarH;
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).getClass();
        ((ly) obj).getClass();
        ((da9) obj2).getClass();
        nfc nfcVarB = kr7.b(l46Var);
        boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
        i8c i8cVar = sf2.a;
        if (zBooleanValue) {
            pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
        } else {
            l46Var.f0(1471494731);
            Object objK = l46Var.k(uq.b);
            Object objR = l46Var.R();
            if (objR == i8cVar) {
                objR = v8.x;
                l46Var.p0(objR);
            }
            Iterator it = fyc.u((a26) objR, objK).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Context) next) instanceof pwf));
            pwfVarH = (pwf) next;
            l46Var.r(false);
        }
        if (pwfVarH == null) {
            qc0.p("No ViewModelStoreOwner found in the context chain");
            return null;
        }
        h hVar = (h) z5c.G(job.a.b(h.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null);
        boolean zI = l46Var.i(hVar);
        ka9 ka9Var = this.b;
        boolean zI2 = zI | l46Var.i(ka9Var);
        Object objR2 = l46Var.R();
        if (zI2 || objR2 == i8cVar) {
            objR2 = new v6(10, hVar, ka9Var);
            l46Var.p0(objR2);
        }
        x16 x16Var = (x16) objR2;
        boolean zI3 = l46Var.i(ka9Var);
        Object objR3 = l46Var.R();
        if (zI3 || objR3 == i8cVar) {
            objR3 = new y30(ka9Var, 1);
            l46Var.p0(objR3);
        }
        x16 x16Var2 = (x16) objR3;
        boolean zI4 = l46Var.i(ka9Var);
        Object objR4 = l46Var.R();
        if (zI4 || objR4 == i8cVar) {
            objR4 = new y30(ka9Var, 2);
            l46Var.p0(objR4);
        }
        kn2.e(x16Var, x16Var2, (x16) objR4, l46Var, 0);
        return wef.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).getClass();
        ((ly) obj).getClass();
        da9Var.getClass();
        AnnualActionFor actionFor = ((AnnualReportGeneratingRoute) vfh.S(da9Var, job.a.b(AnnualReportGeneratingRoute.class))).getActionFor();
        ka9 ka9Var = this.b;
        boolean zI = l46Var.i(ka9Var);
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (zI || objR == i8cVar) {
            objR = new y30(ka9Var, 0);
            l46Var.p0(objR);
        }
        x16 x16Var = (x16) objR;
        boolean zI2 = l46Var.i(ka9Var);
        Object objR2 = l46Var.R();
        if (zI2 || objR2 == i8cVar) {
            objR2 = new z8(ka9Var, 2);
            l46Var.p0(objR2);
        }
        ym8.b(actionFor, x16Var, (a26) objR2, l46Var, 0);
        return wef.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).getClass();
        ((ly) obj).getClass();
        ((da9) obj2).getClass();
        ka9 ka9Var = this.b;
        boolean zI = l46Var.i(ka9Var);
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (zI || objR == i8cVar) {
            objR = new y30(ka9Var, 14);
            l46Var.p0(objR);
        }
        x16 x16Var = (x16) objR;
        boolean zI2 = l46Var.i(ka9Var);
        Object objR2 = l46Var.R();
        if (zI2 || objR2 == i8cVar) {
            objR2 = new y30(ka9Var, 15);
            l46Var.p0(objR2);
        }
        x16 x16Var2 = (x16) objR2;
        boolean zI3 = l46Var.i(ka9Var);
        Object objR3 = l46Var.R();
        if (zI3 || objR3 == i8cVar) {
            objR3 = new z8(ka9Var, 3);
            l46Var.p0(objR3);
        }
        k99.j(0, x16Var, x16Var2, (a26) objR3, l46Var);
        return wef.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        Object next;
        pwf pwfVarH;
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).getClass();
        ((ly) obj).getClass();
        da9Var.getClass();
        nfc nfcVarB = kr7.b(l46Var);
        boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
        i8c i8cVar = sf2.a;
        if (zBooleanValue) {
            pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
        } else {
            l46Var.f0(1471494731);
            Object objK = l46Var.k(uq.b);
            Object objR = l46Var.R();
            if (objR == i8cVar) {
                objR = v8.y;
                l46Var.p0(objR);
            }
            Iterator it = fyc.u((a26) objR, objK).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Context) next) instanceof pwf));
            pwfVarH = (pwf) next;
            l46Var.r(false);
        }
        if (pwfVarH == null) {
            qc0.p("No ViewModelStoreOwner found in the context chain");
            return null;
        }
        gy2 gy2VarR = b21.r(pwfVarH);
        kob kobVar = job.a;
        h hVar = (h) z5c.G(kobVar.b(h.class), pwfVarH.g(), null, gy2VarR, nfcVarB, null);
        e89 e89VarT = tm7.t(hVar.f, l46Var);
        String summary = ((AnnualMonthlyShortSummaryRoute) vfh.S(da9Var, kobVar.b(AnnualMonthlyShortSummaryRoute.class))).getSummary();
        v50 v50Var = (v50) e89VarT.getValue();
        ka9 ka9Var = this.b;
        boolean zI = l46Var.i(ka9Var);
        Object objR2 = l46Var.R();
        if (zI || objR2 == i8cVar) {
            objR2 = new y30(ka9Var, 16);
            l46Var.p0(objR2);
        }
        x16 x16Var = (x16) objR2;
        boolean zI2 = l46Var.i(ka9Var);
        Object objR3 = l46Var.R();
        if (zI2 || objR3 == i8cVar) {
            objR3 = new y30(ka9Var, 17);
            l46Var.p0(objR3);
        }
        x16 x16Var2 = (x16) objR3;
        boolean zI3 = l46Var.i(ka9Var);
        Object objR4 = l46Var.R();
        if (zI3 || objR4 == i8cVar) {
            objR4 = new z8(ka9Var, 4);
            l46Var.p0(objR4);
        }
        bm8.n(v50Var, summary, x16Var, x16Var2, (a26) objR4, l46Var, 0);
        boolean zI4 = l46Var.i(hVar);
        Object objR5 = l46Var.R();
        if (zI4 || objR5 == i8cVar) {
            objR5 = new e40(hVar, null);
            l46Var.p0(objR5);
        }
        wef wefVar = wef.a;
        af1.o((l26) objR5, l46Var, wefVar);
        return wefVar;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        Object next;
        pwf pwfVarH;
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).getClass();
        ((ly) obj).getClass();
        ((da9) obj2).getClass();
        nfc nfcVarB = kr7.b(l46Var);
        boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
        i8c i8cVar = sf2.a;
        if (zBooleanValue) {
            pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
        } else {
            l46Var.f0(1471494731);
            Object objK = l46Var.k(uq.b);
            Object objR = l46Var.R();
            if (objR == i8cVar) {
                objR = v8.z;
                l46Var.p0(objR);
            }
            Iterator it = fyc.u((a26) objR, objK).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Context) next) instanceof pwf));
            pwfVarH = (pwf) next;
            l46Var.r(false);
        }
        if (pwfVarH == null) {
            qc0.p("No ViewModelStoreOwner found in the context chain");
            return null;
        }
        pu1 pu1Var = ((w50) tm7.t(((h) z5c.G(job.a.b(h.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null)).e, l46Var).getValue()).d;
        boolean zN = pu1Var != null ? abg.N(pu1Var) : false;
        ka9 ka9Var = this.b;
        boolean zI = l46Var.i(ka9Var);
        Object objR2 = l46Var.R();
        if (zI || objR2 == i8cVar) {
            objR2 = new y30(ka9Var, 18);
            l46Var.p0(objR2);
        }
        x16 x16Var = (x16) objR2;
        boolean zI2 = l46Var.i(ka9Var);
        Object objR3 = l46Var.R();
        if (zI2 || objR3 == i8cVar) {
            objR3 = new y30(ka9Var, 20);
            l46Var.p0(objR3);
        }
        ynb.h(0, x16Var, (x16) objR3, l46Var, zN);
        return wef.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).getClass();
        ((ly) obj).getClass();
        da9Var.getClass();
        kob kobVar = job.a;
        DailyCardDrawRoute dailyCardDrawRoute = (DailyCardDrawRoute) vfh.S(da9Var, kobVar.b(DailyCardDrawRoute.class));
        nfc nfcVarB = kr7.b(l46Var);
        boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (zG || objR == i8cVar) {
            objR = nfcVarB.b(kobVar.b(e3b.class), null, null);
            l46Var.p0(objR);
        }
        final e3b e3bVar = (e3b) objR;
        final String date = dailyCardDrawRoute.getDate();
        final String segmentId = dailyCardDrawRoute.getSegmentId();
        String strR = urg.r(((die) l46Var.k(snd.a)).a);
        boolean zG2 = l46Var.g(segmentId) | l46Var.g(strR);
        Object objR2 = l46Var.R();
        if (zG2 || objR2 == i8cVar) {
            objR2 = new r93(segmentId, strR, null);
            l46Var.p0(objR2);
        }
        af1.o((l26) objR2, l46Var, segmentId);
        boolean zIsTomorrow = dailyCardDrawRoute.isTomorrow();
        boolean zG3 = l46Var.g(date) | l46Var.i(e3bVar) | l46Var.g(segmentId);
        final ka9 ka9Var = this.b;
        boolean zI = zG3 | l46Var.i(ka9Var);
        Object objR3 = l46Var.R();
        if (zI || objR3 == i8cVar) {
            objR3 = new a26() { // from class: ai.askquin.ui.dailycard.f
                @Override // defpackage.a26
                public final Object d(Object obj5) {
                    ((TarotCardChoice) obj5).getClass();
                    LocalDateTime localDateTimeA = e3b.a(e3bVar);
                    String str = date;
                    boolean zD = o.d(str, localDateTimeA);
                    String str2 = segmentId;
                    ka9 ka9Var2 = ka9Var;
                    wef wefVar = wef.a;
                    if (!zD) {
                        ConcurrentHashMap concurrentHashMap = xfb.a;
                        xfb.e(0, str2, (6 & 2) != 0 ? null : "reading_done");
                        ka9.h(ka9Var2, DailyCardShuffleRoute.INSTANCE, true);
                        return wefVar;
                    }
                    ConcurrentHashMap concurrentHashMap2 = xfb.a;
                    xfb.d(str2);
                    xfb.i(str2, "deck_select");
                    ka9Var2.d(new h(0), new DailyCardSkinPickerRoute(str, str2));
                    return wefVar;
                }
            };
            l46Var.p0(objR3);
        }
        a26 a26Var = (a26) objR3;
        boolean zG4 = l46Var.g(segmentId) | l46Var.i(ka9Var);
        Object objR4 = l46Var.R();
        if (zG4 || objR4 == i8cVar) {
            objR4 = new x16() { // from class: ai.askquin.ui.dailycard.g
                @Override // defpackage.x16
                public final Object invoke() {
                    ConcurrentHashMap concurrentHashMap = xfb.a;
                    xfb.e(0, segmentId, (6 & 2) != 0 ? null : "reading_done");
                    ka9.h(ka9Var, DailyCardShuffleRoute.INSTANCE, true);
                    return wef.a;
                }
            };
            l46Var.p0(objR4);
        }
        db6.c(date, zIsTomorrow, a26Var, (x16) objR4, l46Var, 0);
        return wef.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((ly) obj).getClass();
        da9Var.getClass();
        ka9 ka9Var = this.b;
        k75 k75VarG0 = lmg.g0(da9Var, ka9Var, ((ExploreTarotRoute$DeckCarousel) vfh.S(da9Var, job.a.b(ExploreTarotRoute$DeckCarousel.class))).getInitialSkin(), l46Var, (iIntValue >> 3) & 14);
        boolean zI = l46Var.i(ka9Var);
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (zI || objR == i8cVar) {
            objR = new y8(ka9Var, 22);
            l46Var.p0(objR);
        }
        o26 o26Var = (o26) objR;
        boolean zI2 = l46Var.i(ka9Var);
        Object objR2 = l46Var.R();
        if (zI2 || objR2 == i8cVar) {
            objR2 = new z8(ka9Var, 10);
            l46Var.p0(objR2);
        }
        a26 a26Var = (a26) objR2;
        boolean zI3 = l46Var.i(ka9Var);
        Object objR3 = l46Var.R();
        if (zI3 || objR3 == i8cVar) {
            a9 a9Var = new a9(0, ka9Var, ka9.class, "popBackStack", "popBackStack()Z", 8, 13);
            l46Var.p0(a9Var);
            objR3 = a9Var;
        }
        xj3.i(k75VarG0, o26Var, a26Var, (x16) objR3, l46Var, 8);
        return wef.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        ly lyVar = (ly) obj;
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        lyVar.getClass();
        da9Var.getClass();
        ExploreTarotRoute$Detail exploreTarotRoute$Detail = (ExploreTarotRoute$Detail) vfh.S(da9Var, job.a.b(ExploreTarotRoute$Detail.class));
        ka9 ka9Var = this.b;
        mh3.a(ndd.b.a(lyVar), af1.b0(-545102752, new m65(lmg.g0(da9Var, ka9Var, exploreTarotRoute$Detail.getSkin(), l46Var, (iIntValue >> 3) & 14), exploreTarotRoute$Detail, ka9Var, 0), l46Var), l46Var, 48);
        return wef.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
        String str = (String) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int iIntValue2 = ((Integer) obj4).intValue();
        tarotSkinIdentify.getClass();
        str.getClass();
        ka9.e(this.b, new ExploreTarotRoute$Detail(tarotSkinIdentify, str, iIntValue, iIntValue2), null, 6);
        return wef.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        Object dzbVar;
        Object next;
        pwf pwfVarH;
        Object nt5Var;
        final yic yicVar;
        final SolarTerm solarTerm;
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).getClass();
        ((ly) obj).getClass();
        da9Var.getClass();
        boolean zG = l46Var.g(da9Var);
        final ka9 ka9Var = this.b;
        boolean zG2 = zG | l46Var.g(ka9Var);
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (zG2 || objR == i8cVar) {
            ya9 ya9Var = da9Var.b.c;
            if (ya9Var == null || (str = (String) ya9Var.b.f) == null) {
                objR = null;
            } else {
                try {
                    dzbVar = (FourSeasonsEntry) vfh.S(ka9Var.b(str), job.a.b(FourSeasonsEntry.class));
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                if (dzbVar instanceof dzb) {
                    dzbVar = null;
                }
                objR = (FourSeasonsEntry) dzbVar;
            }
            l46Var.p0(objR);
        }
        FourSeasonsEntry fourSeasonsEntry = (FourSeasonsEntry) objR;
        yic campaign = fourSeasonsEntry != null ? fourSeasonsEntry.getCampaign() : null;
        if (campaign == null) {
            l46Var.f0(1457663504);
            boolean zI = l46Var.i(ka9Var);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                objR2 = new yu5(ka9Var, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, fourSeasonsEntry);
            l46Var.r(false);
        } else {
            l46Var.f0(1457812459);
            l46Var.r(false);
            if (campaign.b() == null) {
                l46Var.f0(1457888626);
                boolean zI2 = l46Var.i(ka9Var);
                Object objR3 = l46Var.R();
                if (zI2 || objR3 == i8cVar) {
                    objR3 = new zu5(ka9Var, null);
                    l46Var.p0(objR3);
                }
                yic yicVar2 = yic.c;
                af1.o((l26) objR3, l46Var, campaign);
                l46Var.r(false);
            } else {
                l46Var.f0(1458035659);
                l46Var.r(false);
                SolarTerm solarTerm2 = campaign.b;
                String source = fourSeasonsEntry.getSource();
                final boolean z = !pa7.t(source, "qa");
                nfc nfcVarB = kr7.b(l46Var);
                if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                    pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
                } else {
                    l46Var.f0(1471494731);
                    Object objK = l46Var.k(uq.b);
                    Object objR4 = l46Var.R();
                    if (objR4 == i8cVar) {
                        objR4 = z03.J0;
                        l46Var.p0(objR4);
                    }
                    Iterator it = fyc.u((a26) objR4, objK).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((Context) next) instanceof pwf));
                    l46Var.r(false);
                    pwfVarH = (pwf) next;
                }
                if (pwfVarH == null) {
                    qc0.p("No ViewModelStoreOwner found in the context chain");
                    return null;
                }
                xqc xqcVar = (xqc) z5c.G(job.a.b(xqc.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null);
                boolean zI3 = l46Var.i(xqcVar) | l46Var.i(campaign);
                Object objR5 = l46Var.R();
                if (zI3 || objR5 == i8cVar) {
                    objR5 = new av5(xqcVar, campaign, null);
                    l46Var.p0(objR5);
                }
                yic yicVar3 = yic.c;
                af1.o((l26) objR5, l46Var, campaign);
                int i = campaign.a;
                boolean zI4 = l46Var.i(xqcVar) | l46Var.i(campaign) | l46Var.i(ka9Var) | l46Var.h(z);
                Object objR6 = l46Var.R();
                if (zI4 || objR6 == i8cVar) {
                    yicVar = campaign;
                    nt5Var = new nt5(xqcVar, yicVar, ka9Var, z, 1);
                    ka9Var = ka9Var;
                    l46Var.p0(nt5Var);
                } else {
                    nt5Var = objR6;
                    yicVar = campaign;
                }
                x16 x16Var = (x16) nt5Var;
                boolean zI5 = l46Var.i(ka9Var) | l46Var.i(yicVar) | l46Var.e(solarTerm2.ordinal()) | l46Var.h(z);
                Object objR7 = l46Var.R();
                if (zI5 || objR7 == i8cVar) {
                    final int i2 = 0;
                    solarTerm = solarTerm2;
                    objR7 = new x16() { // from class: xu5
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i3 = i2;
                            wef wefVar = wef.a;
                            boolean z2 = z;
                            SolarTerm solarTerm3 = solarTerm;
                            yic yicVar4 = yicVar;
                            ka9 ka9Var2 = ka9Var;
                            switch (i3) {
                                case 0:
                                    ka9.e(ka9Var2, new SeasonalLoadingRoute(yicVar4.a, solarTerm3.getWireValue(), z2, true), null, 6);
                                    break;
                                case 1:
                                    ka9.e(ka9Var2, new SeasonalReadingRoute(yicVar4.a, solarTerm3.getWireValue(), true, z2), null, 6);
                                    break;
                                default:
                                    ka9.e(ka9Var2, new FourSeasonsShareURLRoute(yicVar4.a, solarTerm3.getWireValue(), z2), null, 6);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var.p0(objR7);
                } else {
                    solarTerm = solarTerm2;
                }
                x16 x16Var2 = (x16) objR7;
                boolean zI6 = l46Var.i(ka9Var) | l46Var.i(yicVar) | l46Var.e(solarTerm.ordinal()) | l46Var.h(z);
                Object objR8 = l46Var.R();
                if (zI6 || objR8 == i8cVar) {
                    final int i3 = 1;
                    x16 x16Var3 = new x16() { // from class: xu5
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i4 = i3;
                            wef wefVar = wef.a;
                            boolean z2 = z;
                            SolarTerm solarTerm3 = solarTerm;
                            yic yicVar4 = yicVar;
                            ka9 ka9Var2 = ka9Var;
                            switch (i4) {
                                case 0:
                                    ka9.e(ka9Var2, new SeasonalLoadingRoute(yicVar4.a, solarTerm3.getWireValue(), z2, true), null, 6);
                                    break;
                                case 1:
                                    ka9.e(ka9Var2, new SeasonalReadingRoute(yicVar4.a, solarTerm3.getWireValue(), true, z2), null, 6);
                                    break;
                                default:
                                    ka9.e(ka9Var2, new FourSeasonsShareURLRoute(yicVar4.a, solarTerm3.getWireValue(), z2), null, 6);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var.p0(x16Var3);
                    objR8 = x16Var3;
                }
                x16 x16Var4 = (x16) objR8;
                boolean zI7 = l46Var.i(ka9Var);
                Object objR9 = l46Var.R();
                if (zI7 || objR9 == i8cVar) {
                    objR9 = new a40(ka9Var, 25);
                    l46Var.p0(objR9);
                }
                x16 x16Var5 = (x16) objR9;
                boolean zI8 = l46Var.i(ka9Var) | l46Var.i(yicVar) | l46Var.e(solarTerm.ordinal()) | l46Var.h(z);
                Object objR10 = l46Var.R();
                if (zI8 || objR10 == i8cVar) {
                    final int i4 = 2;
                    x16 x16Var6 = new x16() { // from class: xu5
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i5 = i4;
                            wef wefVar = wef.a;
                            boolean z2 = z;
                            SolarTerm solarTerm3 = solarTerm;
                            yic yicVar4 = yicVar;
                            ka9 ka9Var2 = ka9Var;
                            switch (i5) {
                                case 0:
                                    ka9.e(ka9Var2, new SeasonalLoadingRoute(yicVar4.a, solarTerm3.getWireValue(), z2, true), null, 6);
                                    break;
                                case 1:
                                    ka9.e(ka9Var2, new SeasonalReadingRoute(yicVar4.a, solarTerm3.getWireValue(), true, z2), null, 6);
                                    break;
                                default:
                                    ka9.e(ka9Var2, new FourSeasonsShareURLRoute(yicVar4.a, solarTerm3.getWireValue(), z2), null, 6);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var.p0(x16Var6);
                    objR10 = x16Var6;
                }
                x16 x16Var7 = (x16) objR10;
                boolean zI9 = l46Var.i(ka9Var) | l46Var.h(z);
                Object objR11 = l46Var.R();
                if (zI9 || objR11 == i8cVar) {
                    objR11 = new bs0(ka9Var, z, 7);
                    l46Var.p0(objR11);
                }
                kj0.m(i, solarTerm, source, x16Var, x16Var2, x16Var4, x16Var5, x16Var7, (a26) objR11, l46Var, 0);
            }
        }
        return wef.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).intValue();
        ((ly) obj).getClass();
        da9Var.getClass();
        ka9 ka9Var = this.b;
        uqc uqcVarO = an1.O(ka9Var, da9Var, l46Var);
        wef wefVar = wef.a;
        if (uqcVarO == null) {
            return wefVar;
        }
        xqc xqcVar = uqcVarO.a;
        lsc lscVar = uqcVarO.b;
        bx5.a(lscVar.e, af1.b0(-1052555693, new uw5(uqcVarO, lscVar, xqcVar, ka9Var, 2), l46Var), l46Var, 48);
        return wefVar;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).intValue();
        ((ly) obj).getClass();
        da9Var.getClass();
        ka9 ka9Var = this.b;
        uqc uqcVarO = an1.O(ka9Var, da9Var, l46Var);
        wef wefVar = wef.a;
        if (uqcVarO == null) {
            return wefVar;
        }
        xqc xqcVar = uqcVarO.a;
        lsc lscVar = uqcVarO.b;
        bx5.a(lscVar.e, af1.b0(-1361430326, new uw5(uqcVarO, lscVar, xqcVar, ka9Var, 1), l46Var), l46Var, 48);
        return wefVar;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).intValue();
        ((ly) obj).getClass();
        da9Var.getClass();
        ka9 ka9Var = this.b;
        uqc uqcVarO = an1.O(ka9Var, da9Var, l46Var);
        wef wefVar = wef.a;
        if (uqcVarO == null) {
            return wefVar;
        }
        xqc xqcVar = uqcVarO.a;
        lsc lscVar = uqcVarO.b;
        bx5.a(lscVar.e, af1.b0(1893245131, new uw5(uqcVarO, lscVar, xqcVar, ka9Var, 0), l46Var), l46Var, 48);
        return wefVar;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).intValue();
        ((ly) obj).getClass();
        da9Var.getClass();
        ka9 ka9Var = this.b;
        uqc uqcVarO = an1.O(ka9Var, da9Var, l46Var);
        wef wefVar = wef.a;
        if (uqcVarO == null) {
            return wefVar;
        }
        lsc lscVar = uqcVarO.b;
        bx5.a(lscVar.e, af1.b0(852953292, new m65(uqcVarO, lscVar, ka9Var, 3), l46Var), l46Var, 48);
        return wefVar;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
        Object next;
        pwf pwfVarH;
        da9 da9Var = (da9) obj2;
        l46 l46Var = (l46) obj3;
        ((Integer) obj4).intValue();
        ((ly) obj).getClass();
        da9Var.getClass();
        ka9 ka9Var = this.b;
        uqc uqcVarO = an1.O(ka9Var, da9Var, l46Var);
        wef wefVar = wef.a;
        if (uqcVarO == null) {
            return wefVar;
        }
        lsc lscVar = uqcVarO.b;
        nfc nfcVarB = kr7.b(l46Var);
        if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
            pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
        } else {
            l46Var.f0(1471494731);
            Object objK = l46Var.k(uq.b);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = z03.K0;
                l46Var.p0(objR);
            }
            Iterator it = fyc.u((a26) objR, objK).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Context) next) instanceof pwf));
            pwfVarH = (pwf) next;
            l46Var.r(false);
        }
        if (pwfVarH == null) {
            qc0.p("No ViewModelStoreOwner found in the context chain");
            return null;
        }
        bx5.a(lscVar.e, af1.b0(-187338547, new q8(lscVar, uqcVarO, (orc) z5c.G(job.a.b(orc.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null), ka9Var, 20), l46Var), l46Var, 48);
        return wefVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v9 java.lang.Object, still in use, count: 2, list:
          (r3v9 java.lang.Object) from 0x0c47: PHI (r3 I:??) = (r3v7 java.lang.Object), (r3v9 java.lang.Object) binds: [B:429:0x0c46, B:483:0x0c47] A[DONT_GENERATE, DONT_INLINE]
          (r3v9 java.lang.Object) from 0x0c3f: CHECK_CAST (android.content.Context) (r3v9 java.lang.Object)
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
    public final java.lang.Object t(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 3306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8.t(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
