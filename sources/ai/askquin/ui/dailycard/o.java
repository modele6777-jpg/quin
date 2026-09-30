package ai.askquin.ui.dailycard;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import defpackage.a26;
import defpackage.a9;
import defpackage.af1;
import defpackage.b21;
import defpackage.b53;
import defpackage.b93;
import defpackage.da9;
import defpackage.dba;
import defpackage.dd2;
import defpackage.dj6;
import defpackage.dzb;
import defpackage.e3b;
import defpackage.e73;
import defpackage.em7;
import defpackage.i8c;
import defpackage.job;
import defpackage.ka9;
import defpackage.kob;
import defpackage.kr7;
import defpackage.l26;
import defpackage.l46;
import defpackage.ly;
import defpackage.n26;
import defpackage.n93;
import defpackage.nfc;
import defpackage.o26;
import defpackage.o93;
import defpackage.p50;
import defpackage.p93;
import defpackage.pa7;
import defpackage.qu4;
import defpackage.rp3;
import defpackage.rs0;
import defpackage.s84;
import defpackage.s93;
import defpackage.sf2;
import defpackage.t8;
import defpackage.vfh;
import defpackage.w33;
import defpackage.wef;
import defpackage.wl6;
import defpackage.x16;
import defpackage.x57;
import defpackage.xad;
import defpackage.xfb;
import defpackage.y8;
import defpackage.z8;
import defpackage.za9;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final TarotSkinIdentify a(String str) {
        Object next;
        str.getClass();
        Iterator<E> it = TarotSkinIdentify.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (pa7.t(((TarotSkinIdentify) next).name(), str)) {
                return (TarotSkinIdentify) next;
            }
        }
        next = null;
        return (TarotSkinIdentify) next;
    }

    public static final String b(String str, LocalDate localDate) {
        Object dzbVar;
        str.getClass();
        localDate.getClass();
        try {
            dzbVar = LocalDate.parse(str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        LocalDate localDate2 = (LocalDate) dzbVar;
        return (localDate2 == null || !localDate2.isAfter(localDate)) ? "today" : "tomorrow";
    }

    public static final void c(za9 za9Var, final ka9 ka9Var, final dba dbaVar, final wl6 wl6Var) {
        dd2 dd2Var = new dd2(new p93(ka9Var, dbaVar, wl6Var, 0), true, -800605575);
        kob kobVar = job.a;
        rs0.o(za9Var, kobVar.b(ViewDailyCardRoute.class), qu4.a, null, null, null, null, dd2Var);
        b21.I(za9Var, kobVar.b(DailyCardEntry.class), DailyCardShuffleRoute.INSTANCE, new a26() { // from class: ai.askquin.ui.dailycard.j
            @Override // defpackage.a26
            public final Object d(Object obj) {
                za9 za9Var2 = (za9) obj;
                za9Var2.getClass();
                final ka9 ka9Var2 = ka9Var;
                final dba dbaVar2 = dbaVar;
                dd2 dd2Var2 = new dd2(new p50(2, ka9Var2, dbaVar2), true, 1732906526);
                kob kobVar2 = job.a;
                em7 em7VarB = kobVar2.b(DailyCardShuffleRoute.class);
                qu4 qu4Var = qu4.a;
                rs0.o(za9Var2, em7VarB, qu4Var, null, null, null, null, dd2Var2);
                rs0.o(za9Var2, kobVar2.b(DailyCardDrawRoute.class), qu4Var, null, null, null, null, new dd2(new y8(ka9Var2, 19), true, 1479346901));
                rs0.o(za9Var2, kobVar2.b(DailyCardSkinPickerRoute.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: ai.askquin.ui.dailycard.i
                    @Override // defpackage.o26
                    public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                        da9 da9Var = (da9) obj3;
                        l46 l46Var = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        da9Var.getClass();
                        kob kobVar3 = job.a;
                        final DailyCardSkinPickerRoute dailyCardSkinPickerRoute = (DailyCardSkinPickerRoute) vfh.S(da9Var, kobVar3.b(DailyCardSkinPickerRoute.class));
                        nfc nfcVarB = kr7.b(l46Var);
                        boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
                        Object objR = l46Var.R();
                        i8c i8cVar = sf2.a;
                        if (zG || objR == i8cVar) {
                            objR = nfcVarB.b(kobVar3.b(e3b.class), null, null);
                            l46Var.p0(objR);
                        }
                        final e3b e3bVar = (e3b) objR;
                        boolean zG2 = l46Var.g(dailyCardSkinPickerRoute) | l46Var.i(e3bVar);
                        final ka9 ka9Var3 = ka9Var2;
                        boolean zI = zG2 | l46Var.i(ka9Var3);
                        final dba dbaVar3 = dbaVar2;
                        boolean zG3 = zI | l46Var.g(dbaVar3);
                        Object objR2 = l46Var.R();
                        if (zG3 || objR2 == i8cVar) {
                            objR2 = new l26() { // from class: ai.askquin.ui.dailycard.e
                                @Override // defpackage.l26
                                public final Object z(Object obj6, Object obj7) {
                                    TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj6;
                                    tarotSkinIdentify.getClass();
                                    ((w33) obj7).getClass();
                                    DailyCardSkinPickerRoute dailyCardSkinPickerRoute2 = dailyCardSkinPickerRoute;
                                    String date = dailyCardSkinPickerRoute2.getDate();
                                    LocalDateTime localDateTimeA = e3b.a(e3bVar);
                                    String segmentId = dailyCardSkinPickerRoute2.getSegmentId();
                                    date.getClass();
                                    segmentId.getClass();
                                    boolean zD = o.d(date, localDateTimeA);
                                    wef wefVar = wef.a;
                                    if (!zD) {
                                        ConcurrentHashMap concurrentHashMap = xfb.a;
                                        xfb.e(0, segmentId, (6 & 2) != 0 ? null : "reading_done");
                                        dbaVar3.invoke();
                                        return wefVar;
                                    }
                                    ConcurrentHashMap concurrentHashMap2 = xfb.a;
                                    xfb.i(segmentId, "reading");
                                    DailyCardReadingRoute dailyCardReadingRoute = new DailyCardReadingRoute(dailyCardSkinPickerRoute2.getDate(), dailyCardSkinPickerRoute2.getSegmentId(), tarotSkinIdentify.name());
                                    ka9Var3.d(new h(1), dailyCardReadingRoute);
                                    return wefVar;
                                }
                            };
                            l46Var.p0(objR2);
                        }
                        l26 l26Var = (l26) objR2;
                        String date = dailyCardSkinPickerRoute.getDate();
                        boolean zI2 = l46Var.i(ka9Var3);
                        Object objR3 = l46Var.R();
                        if (zI2 || objR3 == i8cVar) {
                            objR3 = new z8(ka9Var3, 6);
                            l46Var.p0(objR3);
                        }
                        x57.p(date, l26Var, (a26) objR3, l46Var, 0);
                        return wef.a;
                    }
                }, true, -672136234));
                final wl6 wl6Var2 = wl6Var;
                rs0.o(za9Var2, kobVar2.b(DailyCardReadingRoute.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: ai.askquin.ui.dailycard.k
                    @Override // defpackage.o26
                    public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                        Object dzbVar;
                        da9 da9Var = (da9) obj3;
                        l46 l46Var = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        da9Var.getClass();
                        kob kobVar3 = job.a;
                        DailyCardReadingRoute dailyCardReadingRoute = (DailyCardReadingRoute) vfh.S(da9Var, kobVar3.b(DailyCardReadingRoute.class));
                        String date = dailyCardReadingRoute.getDate();
                        String segmentId = dailyCardReadingRoute.getSegmentId();
                        nfc nfcVarB = kr7.b(l46Var);
                        boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
                        Object objR = l46Var.R();
                        i8c i8cVar = sf2.a;
                        if (zG || objR == i8cVar) {
                            objR = nfcVarB.b(kobVar3.b(e3b.class), null, null);
                            l46Var.p0(objR);
                        }
                        e3b e3bVar = (e3b) objR;
                        TarotSkinIdentify tarotSkinIdentifyA = o.a(dailyCardReadingRoute.getSkinName());
                        dba dbaVar3 = dbaVar2;
                        wef wefVar = wef.a;
                        int i = 0;
                        if (tarotSkinIdentifyA == null) {
                            l46Var.f0(-1509875455);
                            String skinName = dailyCardReadingRoute.getSkinName();
                            boolean zG2 = l46Var.g(segmentId) | l46Var.g(dbaVar3);
                            Object objR2 = l46Var.R();
                            if (zG2 || objR2 == i8cVar) {
                                objR2 = new s93(segmentId, dbaVar3, null);
                                l46Var.p0(objR2);
                            }
                            af1.p(segmentId, skinName, (l26) objR2, l46Var);
                            l46Var.r(false);
                            return wefVar;
                        }
                        l46Var.f0(-1509712085);
                        l46Var.r(false);
                        boolean zG3 = l46Var.g(segmentId) | l46Var.g(dailyCardReadingRoute);
                        Object objR3 = l46Var.R();
                        if (zG3 || objR3 == i8cVar) {
                            objR3 = new n(segmentId, dailyCardReadingRoute, null);
                            l46Var.p0(objR3);
                        }
                        af1.p(segmentId, tarotSkinIdentifyA, (l26) objR3, l46Var);
                        ka9 ka9Var3 = ka9Var2;
                        boolean zI = l46Var.i(ka9Var3);
                        Object objR4 = l46Var.R();
                        if (zI || objR4 == i8cVar) {
                            objR4 = new o93(ka9Var3, i);
                            l46Var.p0(objR4);
                        }
                        l26 l26Var = (l26) objR4;
                        boolean zG4 = l46Var.g(segmentId) | l46Var.g(dbaVar3);
                        Object objR5 = l46Var.R();
                        int i2 = 1;
                        if (zG4 || objR5 == i8cVar) {
                            objR5 = new n93(segmentId, dbaVar3, 1);
                            l46Var.p0(objR5);
                        }
                        x16 x16Var = (x16) objR5;
                        boolean zI2 = l46Var.i(ka9Var3);
                        Object objR6 = l46Var.R();
                        if (zI2 || objR6 == i8cVar) {
                            objR6 = new o93(ka9Var3, i2);
                            l46Var.p0(objR6);
                        }
                        l26 l26Var2 = (l26) objR6;
                        LocalDate localDate = e3b.a(e3bVar).toLocalDate();
                        localDate.getClass();
                        date.getClass();
                        try {
                            dzbVar = LocalDate.parse(date);
                        } catch (Throwable th) {
                            dzbVar = new dzb(th);
                        }
                        boolean zT = pa7.t(dzbVar instanceof dzb ? null : dzbVar, localDate);
                        boolean zG5 = l46Var.g(segmentId);
                        Object objR7 = l46Var.R();
                        if (zG5 || objR7 == i8cVar) {
                            objR7 = new t8(segmentId, 5);
                            l46Var.p0(objR7);
                        }
                        x16 x16Var2 = (x16) objR7;
                        boolean zI3 = l46Var.i(ka9Var3);
                        Object objR8 = l46Var.R();
                        if (zI3 || objR8 == i8cVar) {
                            objR8 = new z8(ka9Var3, 7);
                            l46Var.p0(objR8);
                        }
                        dj6.h(date, tarotSkinIdentifyA, l26Var, x16Var, l26Var2, true, zT, x16Var2, wl6Var2, (a26) objR8, l46Var, 196608, 0);
                        return wefVar;
                    }
                }, true, 1471347927));
                rs0.t(za9Var2, kobVar2.b(DailyCardShareRoute.class), new s84(false, false, false, false, 228), new dd2(new n26() { // from class: ai.askquin.ui.dailycard.l
                    @Override // defpackage.n26
                    public final Object m(Object obj2, Object obj3, Object obj4) {
                        da9 da9Var = (da9) obj2;
                        l46 l46Var = (l46) obj3;
                        ((Integer) obj4).getClass();
                        da9Var.getClass();
                        final DailyCardShareRoute dailyCardShareRoute = (DailyCardShareRoute) vfh.S(da9Var, job.a.b(DailyCardShareRoute.class));
                        final ka9 ka9Var3 = ka9Var2;
                        dj6.k(null, af1.b0(-722701677, new l26() { // from class: ai.askquin.ui.dailycard.m
                            @Override // defpackage.l26
                            public final Object z(Object obj5, Object obj6) {
                                Object next;
                                l46 l46Var2 = (l46) obj5;
                                int iIntValue = ((Integer) obj6).intValue();
                                if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    DailyCardShareRoute dailyCardShareRoute2 = dailyCardShareRoute;
                                    String date = dailyCardShareRoute2.getDate();
                                    String affirmation = dailyCardShareRoute2.getAffirmation();
                                    TarotCardChoice tarotCardChoice = new TarotCardChoice(dailyCardShareRoute2.getCardType(), dailyCardShareRoute2.isReversed(), (String) null, 4, (rp3) null);
                                    String cardDescription = dailyCardShareRoute2.getCardDescription();
                                    String explain = dailyCardShareRoute2.getExplain();
                                    List<String> dos = dailyCardShareRoute2.getDos();
                                    List<String> donts = dailyCardShareRoute2.getDonts();
                                    Iterator<E> it = TarotSkinIdentify.getEntries().iterator();
                                    do {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!pa7.t(((TarotSkinIdentify) next).name(), dailyCardShareRoute2.getSkinName()));
                                    DailyCardBasicInfo dailyCardBasicInfo = new DailyCardBasicInfo(date, affirmation, tarotCardChoice, cardDescription, explain, dos, donts, (TarotSkinIdentify) next);
                                    String source = dailyCardShareRoute2.getSource();
                                    xad xadVar = xad.DailyCardScreenshot;
                                    if (!pa7.t(source, xadVar.a())) {
                                        xadVar = xad.DailyCard;
                                    }
                                    ka9 ka9Var4 = ka9Var3;
                                    boolean zI = l46Var2.i(ka9Var4);
                                    Object objR = l46Var2.R();
                                    if (zI || objR == sf2.a) {
                                        a9 a9Var = new a9(0, ka9Var4, ka9.class, "popBackStack", "popBackStack()Z", 8, 7);
                                        l46Var2.p0(a9Var);
                                        objR = a9Var;
                                    }
                                    b53.c(dailyCardBasicInfo, xadVar, (x16) objR, l46Var2, DailyCardBasicInfo.$stable);
                                } else {
                                    l46Var2.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var), l46Var, 48, 1);
                        return wef.a;
                    }
                }, true, -2011568895));
                return wef.a;
            }
        });
    }

    public static final boolean d(String str, LocalDateTime localDateTime) {
        Object dzbVar;
        str.getClass();
        try {
            dzbVar = LocalDate.parse(str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        LocalDate localDate = (LocalDate) dzbVar;
        if (localDate == null) {
            return false;
        }
        b93 b93VarB = e73.b(localDateTime);
        return localDate.compareTo((Object) b93VarB.a()) <= 0 && localDate.compareTo((Object) b93VarB.a) >= 0;
    }

    public static final DailyCardShareRoute e(DailyCardBasicInfo dailyCardBasicInfo, xad xadVar) {
        String date = dailyCardBasicInfo.getDate();
        String affirmation = dailyCardBasicInfo.getAffirmation();
        TarotCardType card = dailyCardBasicInfo.getTarotCard().getCard();
        boolean zIsReversed = dailyCardBasicInfo.getTarotCard().isReversed();
        String cardDescription = dailyCardBasicInfo.getCardDescription();
        String explain = dailyCardBasicInfo.getExplain();
        List<String> dos = dailyCardBasicInfo.getDos();
        List<String> donts = dailyCardBasicInfo.getDonts();
        TarotSkinIdentify skin = dailyCardBasicInfo.getSkin();
        return new DailyCardShareRoute(date, affirmation, card, zIsReversed, cardDescription, explain, dos, donts, skin != null ? skin.name() : null, xadVar.a());
    }
}
