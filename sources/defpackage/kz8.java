package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.photo.homepage.SpreadInfoInputRoute;
import ai.askquin.ui.draw.photo.homepage.SpreadPreviewRoute;
import ai.askquin.ui.onboard.OnboardAuthRoute;
import ai.askquin.ui.onboard.OnboardBirthdayRoute;
import ai.askquin.ui.onboard.OnboardHearFromRoute;
import ai.askquin.ui.onboard.OnboardNotificationRoute;
import ai.askquin.ui.onboard.OnboardOverviewRoute;
import ai.askquin.ui.onboard.OnboardProfileSyncRoute;
import ai.askquin.ui.onboard.OnboardRealTarotRoute;
import ai.askquin.ui.onboard.OnboardThemeSelectionRoute;
import ai.askquin.ui.onboard.OnboardWantKnowRoute;
import ai.askquin.ui.onboard.OnboardWelcomeBackFromUpgrade;
import ai.askquin.ui.onboard.OnboardWelcomeBackRoute;
import ai.askquin.ui.onboard.OnboardWelcomeRoute;
import ai.askquin.ui.onboard.PendingUserProfile;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$Analyzing;
import android.view.MotionEvent;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.RecommendQuestion;
import tech.chatmind.api.RecommendQuestionType;
import tech.chatmind.api.events.model.EventInfo;
import tech.chatmind.api.events.model.EventType;
import tech.chatmind.api.events.model.Popup;
import tech.chatmind.api.events.model.PopupActionType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kz8 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kz8(o19 o19Var, m25 m25Var, jr2 jr2Var) {
        this.a = 1;
        this.b = o19Var;
        this.c = jr2Var;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x04bd A[PHI: r1
  0x04bd: PHI (r1v53 java.lang.Boolean) = (r1v34 java.lang.Boolean), (r1v37 java.lang.Boolean) binds: [B:123:0x04bb, B:130:0x04d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x0515  */
    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        h48 h48VarK;
        py0 py0Var;
        String str;
        n07 n07Var;
        int i = this.a;
        int i2 = 8;
        p05 p05Var = p05.a;
        int i3 = 6;
        int i4 = 2;
        int i5 = 3;
        int i6 = 4;
        boolean zBooleanValue = false;
        z = false;
        boolean z = false;
        final int i7 = 1;
        wef wefVar = wef.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                hxc hxcVar = (hxc) obj;
                wn7[] wn7VarArr = exc.a;
                gxc gxcVar = cxc.u;
                wn7 wn7Var = exc.a[11];
                Float fValueOf = Float.valueOf(1.0f);
                gxcVar.getClass();
                hxcVar.c(gxcVar, fValueOf);
                exc.f(hxcVar, (String) obj3);
                hxcVar.c(swc.b, new f6(null, new fn6(i2, (x16) obj2)));
                return wefVar;
            case 1:
                o19 o19Var = (o19) obj3;
                jr2 jr2Var = (jr2) obj2;
                PopupActionType popupActionType = (PopupActionType) obj;
                popupActionType.getClass();
                hf8.Q.getClass();
                m8b m8bVarA = ef8.a("Quin.MonthEvent");
                String str2 = o19Var.a;
                m8bVarA.e("Monthly event clicked: " + popupActionType + ", id: " + str2);
                EventType eventType = EventType.MONTH;
                int i8 = m25.g;
                eventType.getClass();
                str2.getClass();
                qn2 qn2Var = lw2.a;
                js3 js3Var = ga4.a;
                ynb.V(qn2Var, hr3.c, null, new g15(eventType, str2, null), 2);
                if (n19.a[popupActionType.ordinal()] == 1) {
                    EventInfo eventInfo = o19Var.b;
                    jr2Var.getClass();
                    jr2Var.b.h(new fr2(eventInfo));
                    jr2Var.b();
                }
                return wefVar;
            case 2:
                ((v59) obj3).d.add(new s59((qxc) obj2, obj));
                return wefVar;
            case 3:
                awa awaVar = (awa) obj2;
                if (pa7.t((String) obj, ((File) obj3).getName())) {
                    rxg.b0(awaVar, wefVar);
                }
                return wefVar;
            case 4:
                ua9 ua9Var = (ua9) obj3;
                ma9 ma9Var = ((ka9) obj2).b;
                qb9 qb9Var = (qb9) obj;
                qb9Var.getClass();
                ob9 ob9Var = qb9Var.a;
                ob9Var.a = 0;
                ob9Var.b = 0;
                if (ua9Var instanceof ya9) {
                    int i9 = ua9.e;
                    for (ua9 ua9Var2 : kj0.h0(ua9Var)) {
                        ua9 ua9VarI = ma9Var.i();
                        if (pa7.t(ua9Var2, ua9VarI != null ? ua9VarI.c : null)) {
                        }
                    }
                    int i10 = ya9.g;
                    qb9Var.a(((ua9) fyc.w(fyc.u(new d59(12), ma9Var.j()))).b.b);
                    qb9Var.e = false;
                    qb9Var.f = true;
                }
                return wefVar;
            case 5:
                return new oe0(22, (h0e) obj3, (se2) obj2);
            case 6:
                cb9 cb9Var = (cb9) obj3;
                x48 x48Var = (x48) obj2;
                cb9Var.getClass();
                x48Var.getClass();
                ma9 ma9Var2 = cb9Var.b;
                y6 y6Var = ma9Var2.r;
                if (!x48Var.equals(ma9Var2.n)) {
                    x48 x48Var2 = ma9Var2.n;
                    if (x48Var2 != null && (h48VarK = x48Var2.k()) != null) {
                        h48VarK.b(y6Var);
                    }
                    ma9Var2.n = x48Var;
                    x48Var.k().a(y6Var);
                }
                return new ou(i6);
            case 7:
                ((lyd) obj3).h(null);
                ((zva) ((awa) obj2)).d((ql2) obj);
                return wefVar;
            case 8:
                tl9 tl9Var = (tl9) obj3;
                cea ceaVar = (cea) obj2;
                bea beaVar = (bea) obj;
                boolean z2 = tl9Var.F0;
                float f = tl9Var.Z;
                if (z2) {
                    beaVar.k(ceaVar, beaVar.D0(f), beaVar.D0(tl9Var.E0), 0.0f);
                } else {
                    beaVar.g(ceaVar, beaVar.D0(f), beaVar.D0(tl9Var.E0), 0.0f);
                }
                return wefVar;
            case 9:
                wl9 wl9Var = (wl9) obj3;
                cea ceaVar2 = (cea) obj2;
                bea beaVar2 = (bea) obj;
                long j = ((w67) wl9Var.Z.d(beaVar2)).a;
                if (wl9Var.E0) {
                    bea.n(beaVar2, ceaVar2, (int) (j >> 32), (int) (j & 4294967295L));
                } else {
                    bea.q(beaVar2, ceaVar2, (int) (j >> 32), (int) (j & 4294967295L), null, 12);
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ma8 ma8Var = (ma8) obj;
                ma8Var.getClass();
                ((x16) obj2).invoke();
                ((xf3) ((wf3) obj3)).c(Long.valueOf(gcc.c(ma8Var, cye.b).e()));
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                bo9 bo9Var = (bo9) obj3;
                e89 e89Var = (e89) obj2;
                ma8 ma8Var2 = (ma8) obj;
                ma8Var2.getClass();
                s0e s0eVar = bo9Var.g;
                if (!((Boolean) s0eVar.getValue()).booleanValue() && !((Boolean) bo9Var.w.a.getValue()).booleanValue()) {
                    Boolean boolValueOf = (Boolean) bo9Var.b.a("edited");
                    if (boolValueOf == null) {
                        PendingUserProfile pendingUserProfile = bo9Var.e;
                        boolValueOf = pendingUserProfile != null ? Boolean.valueOf(pendingUserProfile.getBirthdayWasEdited()) : null;
                        zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
                    }
                    boolean z3 = zBooleanValue;
                    th5 th5Var = cye.b;
                    ma8 ma8VarA = gcc.E(z57.a.a(), fbc.d()).a();
                    ma8 ma8Var3 = co9.a;
                    if (ma8Var2.compareTo(ma8VarA) > 0) {
                        py0Var = py0.b;
                    } else if (z3 || !ma8Var2.equals(co9.a)) {
                        int i11 = qa8.c;
                        if (((int) ma8Var2.i().until(ma8VarA.i(), ChronoUnit.YEARS)) < 14) {
                            py0Var = py0.c;
                        } else {
                            py0Var = py0.a;
                        }
                    } else {
                        py0Var = py0.a;
                    }
                    int iOrdinal = py0Var.ordinal();
                    if (iOrdinal == 0) {
                        s0eVar.n(null, Boolean.TRUE);
                        ynb.V(hwf.a(bo9Var), null, null, new ao9(ma8Var2, bo9Var, z3, ((mo3) bo9Var.c).a(), null), 3);
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            ap.c();
                            return null;
                        }
                        e89Var.setValue(Boolean.TRUE);
                    }
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                final cb9 cb9Var2 = (cb9) obj3;
                final e89 e89Var2 = (e89) obj2;
                za9 za9Var = (za9) obj;
                za9Var.getClass();
                xn9 xn9Var = new xn9(i5);
                dd2 dd2Var = new dd2(new o26() { // from class: do9
                    @Override // defpackage.o26
                    public final Object t(Object obj4, Object obj5, Object obj6, Object obj7) {
                        x16 x16Var;
                        int i12 = i7;
                        wef wefVar2 = wef.a;
                        i8c i8cVar = sf2.a;
                        e89 e89Var3 = e89Var2;
                        switch (i12) {
                            case 0:
                                da9 da9Var = (da9) obj5;
                                l46 l46Var = (l46) obj6;
                                ((Integer) obj7).getClass();
                                ((ly) obj4).getClass();
                                da9Var.getClass();
                                whb whbVarN = if9.n(da9Var.v.j.j);
                                boolean z4 = !((Boolean) e89Var3.getValue()).booleanValue() || ((g48) jzb.i(whbVarN, whbVarN.getValue(), l46Var, 0, 0).getValue()) == g48.e;
                                Boolean boolValueOf2 = Boolean.valueOf(z4);
                                boolean zH = l46Var.h(z4);
                                Object objR = l46Var.R();
                                if (zH || objR == i8cVar) {
                                    objR = new io9(z4, e89Var3, null);
                                    l46Var.p0(objR);
                                }
                                af1.o((l26) objR, l46Var, boolValueOf2);
                                cb9 cb9Var3 = cb9Var2;
                                boolean zI = l46Var.i(cb9Var3);
                                Object objR2 = l46Var.R();
                                if (zI || objR2 == i8cVar) {
                                    a9 a9Var = new a9(0, cb9Var3, cb9.class, "popBackStack", "popBackStack()Z", 8, 21);
                                    l46Var.p0(a9Var);
                                    objR2 = a9Var;
                                }
                                x16 x16Var2 = (x16) objR2;
                                boolean zI2 = l46Var.i(cb9Var3);
                                Object objR3 = l46Var.R();
                                if (zI2 || objR3 == i8cVar) {
                                    objR3 = new r14(cb9Var3, 5);
                                    l46Var.p0(objR3);
                                }
                                pp1.a(0, (x16) objR3, x16Var2, l46Var, z4);
                                break;
                            default:
                                l46 l46Var2 = (l46) obj6;
                                ((Integer) obj7).getClass();
                                ((ly) obj4).getClass();
                                ((da9) obj5).getClass();
                                cb9 cb9Var4 = cb9Var2;
                                boolean zI3 = l46Var2.i(cb9Var4);
                                Object objR4 = l46Var2.R();
                                if (zI3 || objR4 == i8cVar) {
                                    objR4 = new ek9(2, cb9Var4, e89Var3);
                                    l46Var2.p0(objR4);
                                }
                                x16 x16Var3 = (x16) objR4;
                                ca2.a.getClass();
                                if (ca2.c) {
                                    l46Var2.f0(-557426023);
                                    boolean zI4 = l46Var2.i(cb9Var4);
                                    Object objR5 = l46Var2.R();
                                    if (zI4 || objR5 == i8cVar) {
                                        objR5 = new r14(cb9Var4, 7);
                                        l46Var2.p0(objR5);
                                    }
                                    x16Var = (x16) objR5;
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(-557306550);
                                    l46Var2.r(false);
                                    x16Var = null;
                                }
                                i3g.e(x16Var3, x16Var, null, l46Var2, 0);
                                break;
                        }
                        return wefVar2;
                    }
                }, true, -467417741);
                kob kobVar = job.a;
                em7 em7VarB = kobVar.b(OnboardWelcomeRoute.class);
                qu4 qu4Var = qu4.a;
                rs0.o(za9Var, em7VarB, qu4Var, null, xn9Var, null, xn9Var, dd2Var);
                rs0.o(za9Var, kobVar.b(OnboardWelcomeBackRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var2, 9), true, 763394332));
                rs0.o(za9Var, kobVar.b(OnboardWelcomeBackFromUpgrade.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var2, 10), true, -1654304069));
                xn9 xn9Var2 = new xn9(i7);
                final int i12 = zBooleanValue ? 1 : 0;
                rs0.o(za9Var, kobVar.b(OnboardRealTarotRoute.class), qu4Var, xn9Var2, null, xn9Var2, null, new dd2(new o26() { // from class: do9
                    @Override // defpackage.o26
                    public final Object t(Object obj4, Object obj5, Object obj6, Object obj7) {
                        x16 x16Var;
                        int i13 = i12;
                        wef wefVar2 = wef.a;
                        i8c i8cVar = sf2.a;
                        e89 e89Var3 = e89Var2;
                        switch (i13) {
                            case 0:
                                da9 da9Var = (da9) obj5;
                                l46 l46Var = (l46) obj6;
                                ((Integer) obj7).getClass();
                                ((ly) obj4).getClass();
                                da9Var.getClass();
                                whb whbVarN = if9.n(da9Var.v.j.j);
                                boolean z4 = !((Boolean) e89Var3.getValue()).booleanValue() || ((g48) jzb.i(whbVarN, whbVarN.getValue(), l46Var, 0, 0).getValue()) == g48.e;
                                Boolean boolValueOf2 = Boolean.valueOf(z4);
                                boolean zH = l46Var.h(z4);
                                Object objR = l46Var.R();
                                if (zH || objR == i8cVar) {
                                    objR = new io9(z4, e89Var3, null);
                                    l46Var.p0(objR);
                                }
                                af1.o((l26) objR, l46Var, boolValueOf2);
                                cb9 cb9Var3 = cb9Var2;
                                boolean zI = l46Var.i(cb9Var3);
                                Object objR2 = l46Var.R();
                                if (zI || objR2 == i8cVar) {
                                    a9 a9Var = new a9(0, cb9Var3, cb9.class, "popBackStack", "popBackStack()Z", 8, 21);
                                    l46Var.p0(a9Var);
                                    objR2 = a9Var;
                                }
                                x16 x16Var2 = (x16) objR2;
                                boolean zI2 = l46Var.i(cb9Var3);
                                Object objR3 = l46Var.R();
                                if (zI2 || objR3 == i8cVar) {
                                    objR3 = new r14(cb9Var3, 5);
                                    l46Var.p0(objR3);
                                }
                                pp1.a(0, (x16) objR3, x16Var2, l46Var, z4);
                                break;
                            default:
                                l46 l46Var2 = (l46) obj6;
                                ((Integer) obj7).getClass();
                                ((ly) obj4).getClass();
                                ((da9) obj5).getClass();
                                cb9 cb9Var4 = cb9Var2;
                                boolean zI3 = l46Var2.i(cb9Var4);
                                Object objR4 = l46Var2.R();
                                if (zI3 || objR4 == i8cVar) {
                                    objR4 = new ek9(2, cb9Var4, e89Var3);
                                    l46Var2.p0(objR4);
                                }
                                x16 x16Var3 = (x16) objR4;
                                ca2.a.getClass();
                                if (ca2.c) {
                                    l46Var2.f0(-557426023);
                                    boolean zI4 = l46Var2.i(cb9Var4);
                                    Object objR5 = l46Var2.R();
                                    if (zI4 || objR5 == i8cVar) {
                                        objR5 = new r14(cb9Var4, 7);
                                        l46Var2.p0(objR5);
                                    }
                                    x16Var = (x16) objR5;
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(-557306550);
                                    l46Var2.r(false);
                                    x16Var = null;
                                }
                                i3g.e(x16Var3, x16Var, null, l46Var2, 0);
                                break;
                        }
                        return wefVar2;
                    }
                }, true, 222964826));
                rs0.o(za9Var, kobVar.b(OnboardAuthRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var2, i7), true, 2100233721));
                rs0.o(za9Var, kobVar.b(OnboardProfileSyncRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var2, i4), true, -317464680));
                rs0.o(za9Var, kobVar.b(OnboardHearFromRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var2, i5), true, 1559804215));
                rs0.o(za9Var, kobVar.b(OnboardWantKnowRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var2, i6), true, -857894186));
                rs0.o(za9Var, kobVar.b(OnboardBirthdayRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var2, 5), true, 1019374709));
                rs0.o(za9Var, kobVar.b(OnboardNotificationRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var2, i3), true, -1398323692));
                rs0.o(za9Var, kobVar.b(OnboardOverviewRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var2, 7), true, 825248134));
                rs0.o(za9Var, kobVar.b(OnboardThemeSelectionRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var2, i2), true, -1592450267));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                r0 r0Var = (r0) obj3;
                tr2 tr2Var = (tr2) obj2;
                sfb sfbVar = (sfb) obj;
                sfbVar.getClass();
                r0Var.getClass();
                m8b m8bVarD = r0Var.d();
                vz9 vz9Var = r0Var.r1;
                m8bVarD.e("onReadingFeedbackClick: type=" + sfbVar + ", current=" + ((sfb) vz9Var.getValue()));
                if (((sfb) vz9Var.getValue()) != sfbVar) {
                    r0Var.s1 = (sfb) vz9Var.getValue();
                    vz9 vz9Var2 = r0Var.t1;
                    Boolean bool = Boolean.TRUE;
                    vz9Var2.setValue(bool);
                    vz9Var.setValue(sfbVar);
                    int iOrdinal2 = sfbVar.ordinal();
                    if (iOrdinal2 == 0) {
                        r0Var.v1.setValue(pu4.a);
                        ynb.V(hwf.a(r0Var), null, null, new le4(r0Var, null), 3);
                        r0Var.u1.setValue(bool);
                    } else {
                        if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                            ap.c();
                            return null;
                        }
                        r0Var.P1(sfbVar, r0Var.T(), null, null);
                    }
                    int iOrdinal3 = sfbVar.ordinal();
                    if (iOrdinal3 == 0) {
                        str = "dislike";
                    } else if (iOrdinal3 == 1) {
                        str = "like";
                    } else {
                        if (iOrdinal3 != 2) {
                            ap.c();
                            return null;
                        }
                        str = "love";
                    }
                    x1f x1fVar = x1f.a;
                    x1f.k(p05Var, new el(str, r0Var, i7), 2);
                    if (sfbVar == sfb.LOVE) {
                        p3c p3cVar = tr2Var.e;
                        r0c r0cVarF = p3cVar.f();
                        long j2 = 1 + p3cVar.v;
                        p3cVar.v = j2;
                        ynb.V(hwf.a(p3cVar), null, null, new i3c(p3cVar, r0cVarF, j2, null), 3);
                    }
                }
                return wefVar;
            case 14:
                r0 r0Var2 = (r0) obj3;
                a26 a26Var = (a26) obj2;
                RecommendQuestion recommendQuestion = (RecommendQuestion) obj;
                recommendQuestion.getClass();
                String strK1 = r0Var2.V() != null ? r0Var2.k1() : r0Var2.o0() ? "homepage_photoReading" : "reading_general";
                if (strK1 != null) {
                    RecommendQuestionType type = recommendQuestion.getType();
                    type.getClass();
                    x1f x1fVar2 = x1f.a;
                    x1f.g(p05Var, m1f.a, new so5(i7, strK1, type));
                }
                a26Var.d(recommendQuestion);
                return wefVar;
            case 15:
                ww9 ww9Var = (ww9) obj3;
                cea ceaVar3 = (cea) obj2;
                bea beaVar3 = (bea) obj;
                boolean z4 = ww9Var.H0;
                float f2 = ww9Var.Z;
                if (z4) {
                    beaVar3.k(ceaVar3, beaVar3.D0(f2), beaVar3.D0(ww9Var.E0), 0.0f);
                } else {
                    beaVar3.g(ceaVar3, beaVar3.D0(f2), beaVar3.D0(ww9Var.E0), 0.0f);
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((l26) obj3).z(Integer.valueOf(((vsa) obj).a), Integer.valueOf(((gg7) obj2).n().b));
                return wefVar;
            case 17:
                bea beaVar4 = (bea) obj;
                lr lrVar = new lr(i6, (ArrayList) obj2);
                beaVar4.a = true;
                lrVar.d(beaVar4);
                beaVar4.a = false;
                ((e89) obj3).getValue();
                return wefVar;
            case 18:
                p5a p5aVar = (p5a) obj2;
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "popup", "paywall_d", "pathway", "paywall_d");
                l1fVar.a((String) obj3, "triggered_by");
                if9.o(l1fVar, p5aVar);
                if9.p(l1fVar, p5aVar);
                return wefVar;
            case 19:
                x5a x5aVar = (x5a) obj3;
                y3a y3aVar = (y3a) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (x5aVar != null) {
                    int i13 = e6a.b;
                    c78 c78VarW = t72.w();
                    r3a r3aVar = x5aVar.a;
                    Map map = r3aVar.b;
                    z6e z6eVar = (z6e) map.get(v2a.Month);
                    if (z6eVar != null) {
                        c78VarW.add(z6eVar);
                    }
                    z6e z6eVar2 = (z6e) map.get(v2a.Year);
                    if (z6eVar2 != null) {
                        c78VarW.add(z6eVar2);
                    }
                    if (!x5aVar.e && (n07Var = (n07) s72.x0(r3aVar.a)) != null) {
                        c78VarW.add(n07Var);
                    }
                    bwa bwaVar = (bwa) s72.y0(iIntValue, c78VarW.n());
                    if (bwaVar != null) {
                        s0e s0eVar2 = y3aVar.U0;
                        s0eVar2.getClass();
                        s0eVar2.n(null, bwaVar);
                    }
                }
                return wefVar;
            case 20:
                ((String) obj).getClass();
                x1f x1fVar3 = x1f.a;
                x1f.k(new r05("report_finish"), null, 4);
                ka9.e((ka9) obj2, new PersonalityRoutes$Analyzing((String) obj3), null, 6);
                return wefVar;
            case 21:
                l26 l26Var = (l26) obj3;
                h0e h0eVar = (h0e) obj2;
                if (((Boolean) obj).booleanValue()) {
                    l26Var.z(s72.t0(((dda) h0eVar.getValue()).b), Integer.valueOf(((dda) h0eVar.getValue()).a.size()));
                } else {
                    jcc.k(0, Integer.valueOf(R.string.camera_permission_denied));
                }
                return wefVar;
            case 22:
                SpreadPreviewRoute spreadPreviewRoute = (SpreadPreviewRoute) obj2;
                ka9.e((ka9) obj3, new SpreadInfoInputRoute(spreadPreviewRoute.getCards(), spreadPreviewRoute.getMeanings(), ((Integer) obj).intValue()), null, 6);
                return wefVar;
            case 23:
                szc szcVar = (szc) obj3;
                via viaVar = (via) obj2;
                MotionEvent motionEvent = (MotionEvent) obj;
                if (motionEvent.getActionMasked() == 0) {
                    szcVar.c = ((Boolean) ((uw) viaVar.a()).d(motionEvent)).booleanValue() ? uia.b : uia.c;
                } else {
                    ((uw) viaVar.a()).d(motionEvent);
                }
                return wefVar;
            case 24:
                ued uedVar = (ued) obj;
                uedVar.getClass();
                boolean canClose = ((Popup) obj3).getCanClose();
                boolean zBooleanValue2 = ((Boolean) ((e89) obj2).getValue()).booleanValue();
                if (uedVar != ued.a || (canClose && zBooleanValue2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                soa soaVar = (soa) obj3;
                az1 az1Var = (az1) obj2;
                if (((Boolean) obj).booleanValue()) {
                    soaVar.l(az1Var);
                } else {
                    jcc.k(0, Integer.valueOf(R.string.voice_mic_unavailable));
                }
                return wefVar;
            case 26:
                zr0 zr0Var = (zr0) obj3;
                af2 af2Var = (af2) obj2;
                zr0Var.a(af2Var);
                return new oe0(24, zr0Var, af2Var);
            case 27:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                ((aqa) obj3).b.Q(q8cVar, (zpa) obj2);
                return wefVar;
            case 28:
                sw3 sw3Var = (sw3) obj;
                sw3Var.getClass();
                return new w67(((long) ym8.L(((Number) ((h0e) obj2).getValue()).floatValue() * sw3Var.p0(((e31) obj3).d()))) << 32);
            default:
                List list = (List) obj2;
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                x8c x8cVarW0 = q8cVar2.W0((String) obj3);
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        x8cVarW0.Q(i7, (String) it.next());
                        i7++;
                    }
                    x8cVarW0.R0();
                    return wefVar;
                } finally {
                    x8cVarW0.close();
                }
        }
    }

    public /* synthetic */ kz8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ kz8(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
