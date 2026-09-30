package ai.askquin.ui.popup.dailyfortune;

import defpackage.a26;
import defpackage.bm8;
import defpackage.bsa;
import defpackage.bw2;
import defpackage.cye;
import defpackage.d99;
import defpackage.dzb;
import defpackage.f99;
import defpackage.fbc;
import defpackage.fzc;
import defpackage.g3b;
import defpackage.gcc;
import defpackage.gd8;
import defpackage.hf8;
import defpackage.hs3;
import defpackage.iy9;
import defpackage.ize;
import defpackage.jzb;
import defpackage.jze;
import defpackage.k73;
import defpackage.lb8;
import defpackage.lw2;
import defpackage.ma8;
import defpackage.mo3;
import defpackage.nh7;
import defpackage.nu4;
import defpackage.p4e;
import defpackage.p57;
import defpackage.pa7;
import defpackage.qc0;
import defpackage.qh6;
import defpackage.qu4;
import defpackage.rp3;
import defpackage.t7;
import defpackage.th5;
import defpackage.ti7;
import defpackage.tm7;
import defpackage.u73;
import defpackage.v4e;
import defpackage.v73;
import defpackage.wc8;
import defpackage.wef;
import defpackage.x73;
import defpackage.xh7;
import defpackage.xqa;
import defpackage.yyc;
import defpackage.z57;
import defpackage.z5c;
import defpackage.zn2;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements hf8 {
    public static final /* synthetic */ int d = 0;
    public final t7 a;
    public final gd8 b;
    public final f99 c = new f99();

    public v(t7 t7Var, gd8 gd8Var) {
        this.a = t7Var;
        this.b = gd8Var;
    }

    public static Object o(LinkedHashMap linkedHashMap, zn2 zn2Var) {
        hs3 hs3Var = xqa.K;
        xh7 xh7Var = fzc.a;
        xh7Var.getClass();
        return bsa.n(hs3Var.a, xh7Var.d(new qh6(p4e.a, DailyFortuneGuideStore$AccountState.Companion.serializer(), 1), linkedHashMap), zn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    public static k73 t(DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState, String str, boolean z, boolean z2) {
        boolean z3;
        hs3 hs3Var = xqa.N;
        ize izeVar = new ize(hs3Var.a, hs3Var.b, null);
        nu4 nu4Var = nu4.a;
        boolean zBooleanValue = ((Boolean) z5c.I(nu4Var, izeVar)).booleanValue();
        if (zBooleanValue) {
            hs3 hs3Var2 = xqa.O;
            if (((Boolean) z5c.I(nu4Var, new jze(hs3Var2.a, hs3Var2.b, null))).booleanValue()) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        return new k73(str, z, dailyFortuneGuideStore$AccountState.getFirstReadingEligible(), dailyFortuneGuideStore$AccountState.getFirstReadingEvaluated(), dailyFortuneGuideStore$AccountState.getPendingTrigger(), dailyFortuneGuideStore$AccountState.getConsumed(), zBooleanValue, z3, dailyFortuneGuideStore$AccountState.getTomorrowReminderPending(), dailyFortuneGuideStore$AccountState.getTomorrowReminderShown(), dailyFortuneGuideStore$AccountState.getHomeTooltipPending(), dailyFortuneGuideStore$AccountState.getHomeTooltipShown(), z2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) throws Throwable {
        f fVar;
        String str;
        final boolean zBooleanValue;
        final ma8 ma8Var;
        Object objU;
        if (zn2Var instanceof f) {
            fVar = (f) zn2Var;
            int i = fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.label = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, zn2Var);
            }
        } else {
            fVar = new f(this, zn2Var);
        }
        Object obj = fVar.result;
        int i2 = fVar.label;
        Object obj2 = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            String strF = f();
            if (strF == null) {
                return wef.a;
            }
            fVar.L$0 = strF;
            fVar.label = 1;
            Object objC = p57.a.c(strF, fVar);
            if (objC != obj2) {
                str = strF;
                obj = objC;
            }
            return obj2;
        }
        if (i2 == 1) {
            String str2 = (String) fVar.L$0;
            jzb.q(obj);
            str = str2;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                return obj;
            }
            zBooleanValue = fVar.Z$0;
            ma8Var = (ma8) fVar.L$1;
            str = (String) fVar.L$0;
            jzb.q(obj);
        }
        final ma8 ma8Var2 = (ma8) obj;
        a26 a26Var = new a26() { // from class: ai.askquin.ui.popup.dailyfortune.c
            @Override // defpackage.a26
            public final Object d(Object obj3) {
                DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) obj3;
                dailyFortuneGuideStore$AccountState.getClass();
                if ((!dailyFortuneGuideStore$AccountState.getFirstReadingEligible() && !zBooleanValue) || dailyFortuneGuideStore$AccountState.getFirstReadingEvaluated() || dailyFortuneGuideStore$AccountState.getConsumed()) {
                    return dailyFortuneGuideStore$AccountState;
                }
                DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountStateCopy$default = DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountState, false, true, null, null, false, false, false, false, false, 508, null);
                ma8 ma8Var3 = ma8Var2;
                ma8 ma8Var4 = ma8Var;
                if (pa7.t(ma8Var3, ma8Var4)) {
                    return DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountStateCopy$default, false, false, null, null, true, false, false, false, false, 483, null);
                }
                DailyFortuneGuideTrigger pendingTrigger = dailyFortuneGuideStore$AccountState.getPendingTrigger();
                if (pendingTrigger == null) {
                    pendingTrigger = DailyFortuneGuideTrigger.FirstReadingCompleted;
                }
                DailyFortuneGuideTrigger dailyFortuneGuideTrigger = pendingTrigger;
                ma8 pendingDate = dailyFortuneGuideStore$AccountState.getPendingDate();
                return DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountStateCopy$default, false, false, dailyFortuneGuideTrigger, pendingDate == null ? ma8Var4 : pendingDate, false, false, false, false, false, 499, null);
            }
        };
        fVar.L$0 = null;
        fVar.L$1 = null;
        fVar.L$2 = null;
        fVar.Z$0 = zBooleanValue;
        fVar.label = 3;
        objU = u(str, a26Var, fVar);
        if (objU != obj2) {
            return obj2;
        }
        return objU;
        zBooleanValue = ((Boolean) obj).booleanValue();
        th5 th5Var = cye.b;
        ma8 ma8VarA = gcc.E(z57.a.a(), fbc.d()).a();
        fVar.L$0 = str;
        fVar.L$1 = ma8VarA;
        fVar.Z$0 = zBooleanValue;
        fVar.label = 2;
        Object objJ = j(fVar);
        if (objJ != obj2) {
            ma8Var = ma8VarA;
            obj = objJ;
            final ma8 ma8Var3 = (ma8) obj;
            a26 a26Var2 = new a26() { // from class: ai.askquin.ui.popup.dailyfortune.c
                @Override // defpackage.a26
                public final Object d(Object obj3) {
                    DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) obj3;
                    dailyFortuneGuideStore$AccountState.getClass();
                    if ((!dailyFortuneGuideStore$AccountState.getFirstReadingEligible() && !zBooleanValue) || dailyFortuneGuideStore$AccountState.getFirstReadingEvaluated() || dailyFortuneGuideStore$AccountState.getConsumed()) {
                        return dailyFortuneGuideStore$AccountState;
                    }
                    DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountStateCopy$default = DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountState, false, true, null, null, false, false, false, false, false, 508, null);
                    ma8 ma8Var4 = ma8Var3;
                    ma8 ma8Var5 = ma8Var;
                    if (pa7.t(ma8Var4, ma8Var5)) {
                        return DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountStateCopy$default, false, false, null, null, true, false, false, false, false, 483, null);
                    }
                    DailyFortuneGuideTrigger pendingTrigger = dailyFortuneGuideStore$AccountState.getPendingTrigger();
                    if (pendingTrigger == null) {
                        pendingTrigger = DailyFortuneGuideTrigger.FirstReadingCompleted;
                    }
                    DailyFortuneGuideTrigger dailyFortuneGuideTrigger = pendingTrigger;
                    ma8 pendingDate = dailyFortuneGuideStore$AccountState.getPendingDate();
                    return DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountStateCopy$default, false, false, dailyFortuneGuideTrigger, pendingDate == null ? ma8Var5 : pendingDate, false, false, false, false, false, 499, null);
                }
            };
            fVar.L$0 = null;
            fVar.L$1 = null;
            fVar.L$2 = null;
            fVar.Z$0 = zBooleanValue;
            fVar.label = 3;
            objU = u(str, a26Var2, fVar);
            if (objU != obj2) {
                return objU;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zn2 zn2Var) {
        g gVar;
        final ma8 ma8VarA;
        if (zn2Var instanceof g) {
            gVar = (g) zn2Var;
            int i = gVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.label = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, zn2Var);
            }
        } else {
            gVar = new g(this, zn2Var);
        }
        Object objJ = gVar.result;
        int i2 = gVar.label;
        Object obj = bw2.a;
        if (i2 == 0) {
            jzb.q(objJ);
            th5 th5Var = cye.b;
            ma8VarA = gcc.E(z57.a.a(), fbc.d()).a();
            gVar.L$0 = ma8VarA;
            gVar.label = 1;
            objJ = j(gVar);
            if (objJ != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objJ);
            return objJ;
        }
        ma8VarA = (ma8) gVar.L$0;
        jzb.q(objJ);
        final ma8 ma8Var = (ma8) objJ;
        a26 a26Var = new a26() { // from class: ai.askquin.ui.popup.dailyfortune.a
            @Override // defpackage.a26
            public final Object d(Object obj2) {
                DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) obj2;
                dailyFortuneGuideStore$AccountState.getClass();
                if (!dailyFortuneGuideStore$AccountState.getConsumed()) {
                    ma8 ma8Var2 = ma8Var;
                    ma8 ma8Var3 = ma8VarA;
                    if (pa7.t(ma8Var2, ma8Var3) && dailyFortuneGuideStore$AccountState.getPendingTrigger() != null) {
                        return DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountState, false, false, null, null, true, false, false, false, false, 483, null);
                    }
                    if (!pa7.t(ma8Var2, ma8Var3) && dailyFortuneGuideStore$AccountState.getPendingTrigger() == null) {
                        return DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountState, false, false, DailyFortuneGuideTrigger.PaywallInterceptClose, ma8Var3, false, false, false, false, false, 499, null);
                    }
                }
                return dailyFortuneGuideStore$AccountState;
            }
        };
        gVar.L$0 = null;
        gVar.L$1 = null;
        gVar.label = 2;
        String strF = f();
        Object objU = strF == null ? wef.a : u(strF, a26Var, gVar);
        return objU == obj ? obj : objU;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:14:0x0037, B:35:0x00aa, B:37:0x00b4, B:43:0x00d0), top: B:52:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(zn2 zn2Var) throws Throwable {
        h hVar;
        String strF;
        d99 d99Var;
        d99 d99Var2;
        Object objL;
        String str;
        DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState;
        DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState2;
        if (zn2Var instanceof h) {
            hVar = (h) zn2Var;
            int i = hVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.label = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, zn2Var);
            }
        } else {
            hVar = new h(this, zn2Var);
        }
        Object obj = hVar.result;
        Object obj2 = bw2.a;
        int i2 = hVar.label;
        boolean z = true;
        if (i2 == 0) {
            jzb.q(obj);
            strF = f();
            if (strF == null) {
                return null;
            }
            gd8 gd8Var = this.b;
            Long l = g3b.a;
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            zoneIdSystemDefault.getClass();
            LocalDate localDate = g3b.a(zoneIdSystemDefault).toLocalDate();
            localDate.getClass();
            ma8 ma8Var = new ma8(localDate);
            hVar.L$0 = strF;
            hVar.label = 1;
            if (gd8Var.e(ma8Var, hVar) != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) hVar.L$1;
                str = (String) hVar.L$0;
                try {
                    jzb.q(obj);
                    dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) ((Map) obj).get(str);
                    if (dailyFortuneGuideStore$AccountState == null) {
                        dailyFortuneGuideStore$AccountState2 = new DailyFortuneGuideStore$AccountState(false, false, (DailyFortuneGuideTrigger) null, (ma8) null, false, false, false, false, false, 511, (rp3) null);
                    } else {
                        dailyFortuneGuideStore$AccountState2 = dailyFortuneGuideStore$AccountState;
                    }
                    if (dailyFortuneGuideStore$AccountState == null) {
                        z = false;
                    }
                    k73 k73VarT = t(dailyFortuneGuideStore$AccountState2, str, z, false);
                    d99Var2.h(null);
                    return k73VarT;
                } catch (Throwable th) {
                    th = th;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99 d99Var3 = (d99) hVar.L$1;
            String str2 = (String) hVar.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            strF = str2;
            try {
                hVar.L$0 = strF;
                hVar.L$1 = d99Var;
                hVar.label = 3;
                objL = l(hVar);
                if (objL != obj2) {
                    d99Var2 = d99Var;
                    obj = objL;
                    str = strF;
                    dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) ((Map) obj).get(str);
                    if (dailyFortuneGuideStore$AccountState == null) {
                        dailyFortuneGuideStore$AccountState2 = new DailyFortuneGuideStore$AccountState(false, false, (DailyFortuneGuideTrigger) null, (ma8) null, false, false, false, false, false, 511, (rp3) null);
                    } else {
                        dailyFortuneGuideStore$AccountState2 = dailyFortuneGuideStore$AccountState;
                    }
                    if (dailyFortuneGuideStore$AccountState == null) {
                        z = false;
                    }
                    k73 k73VarT2 = t(dailyFortuneGuideStore$AccountState2, str, z, false);
                    d99Var2.h(null);
                    return k73VarT2;
                }
                return obj2;
            } catch (Throwable th2) {
                th = th2;
                d99Var2 = d99Var;
                d99Var2.h(null);
                throw th;
            }
        }
        strF = (String) hVar.L$0;
        jzb.q(obj);
        d99Var = this.c;
        hVar.L$0 = strF;
        hVar.L$1 = d99Var;
        hVar.label = 2;
        if (d99Var.b(hVar) != obj2) {
            hVar.L$0 = strF;
            hVar.L$1 = d99Var;
            hVar.label = 3;
            objL = l(hVar);
            if (objL != obj2) {
                d99Var2 = d99Var;
                obj = objL;
                str = strF;
                dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) ((Map) obj).get(str);
                if (dailyFortuneGuideStore$AccountState == null) {
                    dailyFortuneGuideStore$AccountState2 = new DailyFortuneGuideStore$AccountState(false, false, (DailyFortuneGuideTrigger) null, (ma8) null, false, false, false, false, false, 511, (rp3) null);
                } else {
                    dailyFortuneGuideStore$AccountState2 = dailyFortuneGuideStore$AccountState;
                }
                if (dailyFortuneGuideStore$AccountState == null) {
                    z = false;
                }
                k73 k73VarT3 = t(dailyFortuneGuideStore$AccountState2, str, z, false);
                d99Var2.h(null);
                return k73VarT3;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(zn2 zn2Var) {
        i iVar;
        if (zn2Var instanceof i) {
            iVar = (i) zn2Var;
            int i = iVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.label = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, zn2Var);
            }
        } else {
            iVar = new i(this, zn2Var);
        }
        Object objJ = iVar.result;
        int i2 = iVar.label;
        if (i2 == 0) {
            jzb.q(objJ);
            iVar.label = 1;
            objJ = j(iVar);
            Object obj = bw2.a;
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objJ);
        }
        th5 th5Var = cye.b;
        return Boolean.valueOf(pa7.t(objJ, gcc.E(z57.a.a(), fbc.d()).a()));
    }

    public final String f() {
        String strA = ((mo3) this.a).a();
        if (v4e.Q(strA)) {
            hs3 hs3Var = xqa.A;
            strA = (String) z5c.I(nu4.a, new u73(hs3Var.a, hs3Var.b, null));
        }
        if (v4e.Q(strA)) {
            return null;
        }
        return strA;
    }

    public final Map g(String str) {
        Object dzbVar;
        iy9 iy9Var;
        if (!v4e.Q(str)) {
            try {
                Object objE = fzc.a.e(str);
                dzbVar = objE instanceof ti7 ? (ti7) objE : null;
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            ti7 ti7Var = (ti7) dzbVar;
            if (ti7Var != null) {
                Set<Map.Entry> setEntrySet = ti7Var.a.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : setEntrySet) {
                    String str2 = (String) entry.getKey();
                    try {
                        iy9Var = new iy9(str2, fzc.a.a(DailyFortuneGuideStore$AccountState.Companion.serializer(), (nh7) entry.getValue()));
                    } catch (yyc e) {
                        d().g("Skip unparseable daily fortune guide state for " + str2 + ": " + e.getMessage());
                        iy9Var = null;
                    }
                    if (iy9Var != null) {
                        arrayList.add(iy9Var);
                    }
                }
                return bm8.W(arrayList);
            }
        }
        return qu4.a;
    }

    public final boolean h() {
        String strF = f();
        if (strF == null) {
            return false;
        }
        hs3 hs3Var = xqa.K;
        DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) g((String) z5c.I(nu4.a, new v73(hs3Var.a, hs3Var.b, null))).get(strF);
        return (dailyFortuneGuideStore$AccountState != null ? dailyFortuneGuideStore$AccountState.getPendingTrigger() : null) != null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0038, B:36:0x009f, B:38:0x00a9, B:43:0x00c3), top: B:52:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object i(zn2 zn2Var) throws Throwable {
        j jVar;
        String strF;
        boolean zBooleanValue;
        d99 d99Var;
        d99 d99Var2;
        Object objL;
        boolean z;
        String str;
        DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState;
        DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState2;
        if (zn2Var instanceof j) {
            jVar = (j) zn2Var;
            int i = jVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jVar.label = i - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, zn2Var);
            }
        } else {
            jVar = new j(this, zn2Var);
        }
        Object objE = jVar.result;
        int i2 = jVar.label;
        boolean z2 = true;
        Object obj = bw2.a;
        if (i2 == 0) {
            jzb.q(objE);
            strF = f();
            if (strF == null) {
                return null;
            }
            jVar.L$0 = strF;
            jVar.label = 1;
            objE = e(jVar);
            if (objE != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = jVar.Z$0;
                d99Var2 = (d99) jVar.L$1;
                str = (String) jVar.L$0;
                try {
                    jzb.q(objE);
                    dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) ((Map) objE).get(str);
                    if (dailyFortuneGuideStore$AccountState == null) {
                        dailyFortuneGuideStore$AccountState2 = new DailyFortuneGuideStore$AccountState(false, false, (DailyFortuneGuideTrigger) null, (ma8) null, false, false, false, false, false, 511, (rp3) null);
                    } else {
                        dailyFortuneGuideStore$AccountState2 = dailyFortuneGuideStore$AccountState;
                    }
                    if (dailyFortuneGuideStore$AccountState == null) {
                        z2 = false;
                    }
                    k73 k73VarT = t(dailyFortuneGuideStore$AccountState2, str, z2, z);
                    d99Var2.h(null);
                    return k73VarT;
                } catch (Throwable th) {
                    th = th;
                    d99Var2.h(null);
                    throw th;
                }
            }
            boolean z3 = jVar.Z$0;
            d99Var = (d99) jVar.L$1;
            String str2 = (String) jVar.L$0;
            jzb.q(objE);
            zBooleanValue = z3;
            strF = str2;
            try {
                jVar.L$0 = strF;
                jVar.L$1 = d99Var;
                jVar.Z$0 = zBooleanValue;
                jVar.label = 3;
                objL = l(jVar);
                if (objL != obj) {
                    boolean z4 = zBooleanValue;
                    objE = objL;
                    z = z4;
                    str = strF;
                    d99Var2 = d99Var;
                    dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) ((Map) objE).get(str);
                    if (dailyFortuneGuideStore$AccountState == null) {
                        dailyFortuneGuideStore$AccountState2 = new DailyFortuneGuideStore$AccountState(false, false, (DailyFortuneGuideTrigger) null, (ma8) null, false, false, false, false, false, 511, (rp3) null);
                    } else {
                        dailyFortuneGuideStore$AccountState2 = dailyFortuneGuideStore$AccountState;
                    }
                    if (dailyFortuneGuideStore$AccountState == null) {
                        z2 = false;
                    }
                    k73 k73VarT2 = t(dailyFortuneGuideStore$AccountState2, str, z2, z);
                    d99Var2.h(null);
                    return k73VarT2;
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                d99Var2 = d99Var;
                d99Var2.h(null);
                throw th;
            }
        }
        strF = (String) jVar.L$0;
        jzb.q(objE);
        zBooleanValue = ((Boolean) objE).booleanValue();
        jVar.L$0 = strF;
        f99 f99Var = this.c;
        jVar.L$1 = f99Var;
        jVar.Z$0 = zBooleanValue;
        jVar.label = 2;
        if (f99Var.b(jVar) != obj) {
            d99Var = f99Var;
            jVar.L$0 = strF;
            jVar.L$1 = d99Var;
            jVar.Z$0 = zBooleanValue;
            jVar.label = 3;
            objL = l(jVar);
            if (objL != obj) {
                boolean z5 = zBooleanValue;
                objE = objL;
                z = z5;
                str = strF;
                d99Var2 = d99Var;
                dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) ((Map) objE).get(str);
                if (dailyFortuneGuideStore$AccountState == null) {
                    dailyFortuneGuideStore$AccountState2 = new DailyFortuneGuideStore$AccountState(false, false, (DailyFortuneGuideTrigger) null, (ma8) null, false, false, false, false, false, 511, (rp3) null);
                } else {
                    dailyFortuneGuideStore$AccountState2 = dailyFortuneGuideStore$AccountState;
                }
                if (dailyFortuneGuideStore$AccountState == null) {
                    z2 = false;
                }
                k73 k73VarT3 = t(dailyFortuneGuideStore$AccountState2, str, z2, z);
                d99Var2.h(null);
                return k73VarT3;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(zn2 zn2Var) {
        k kVar;
        if (zn2Var instanceof k) {
            kVar = (k) zn2Var;
            int i = kVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.label = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, zn2Var);
            }
        } else {
            kVar = new k(this, zn2Var);
        }
        Object objB = kVar.result;
        int i2 = kVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            wc8 wc8Var = this.b.d;
            kVar.label = 1;
            objB = tm7.B(wc8Var, kVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
        }
        lb8 lb8Var = (lb8) objB;
        ma8 ma8Var = lb8Var.o;
        return ma8Var == null ? lb8Var.m : ma8Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x0100 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:15:0x004e, B:22:0x006d, B:40:0x00ef, B:43:0x0100, B:46:0x0107, B:50:0x0110, B:57:0x0120, B:54:0x0119, B:36:0x00d9), top: B:64:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:15:0x004e, B:22:0x006d, B:40:0x00ef, B:43:0x0100, B:46:0x0107, B:50:0x0110, B:57:0x0120, B:54:0x0119, B:36:0x00d9), top: B:64:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:15:0x004e, B:22:0x006d, B:40:0x00ef, B:43:0x0100, B:46:0x0107, B:50:0x0110, B:57:0x0120, B:54:0x0119, B:36:0x00d9), top: B:64:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x011f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0120 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:15:0x004e, B:22:0x006d, B:40:0x00ef, B:43:0x0100, B:46:0x0107, B:50:0x0110, B:57:0x0120, B:54:0x0119, B:36:0x00d9), top: B:64:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014f, code lost:
    
        if (o(r1, r2) == r9) goto L59;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [d99, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Enum k(defpackage.zn2 r24) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.popup.dailyfortune.v.k(zn2):java.lang.Enum");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(zn2 zn2Var) {
        m mVar;
        if (zn2Var instanceof m) {
            mVar = (m) zn2Var;
            int i = mVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.label = i - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, zn2Var);
            }
        } else {
            mVar = new m(this, zn2Var);
        }
        Object objB = mVar.result;
        int i2 = mVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            x73 x73Var = new x73(2, null);
            mVar.L$0 = this;
            mVar.label = 1;
            objB = lw2.b(x73Var, mVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (v) mVar.L$0;
            jzb.q(objB);
        }
        return this.g((String) objB);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (o(r1, r2) == r8) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [ai.askquin.ui.popup.dailyfortune.v] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v5, types: [d99] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.String r23, defpackage.zn2 r24) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.popup.dailyfortune.v.m(java.lang.String, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object n(DailyFortuneGuideTrigger dailyFortuneGuideTrigger, zn2 zn2Var) throws Throwable {
        o oVar;
        DailyFortuneGuideTrigger dailyFortuneGuideTrigger2;
        String str;
        d99 d99Var;
        DailyFortuneGuideTrigger dailyFortuneGuideTrigger3;
        boolean z;
        d99 d99Var2;
        boolean z2;
        d99 d99Var3;
        String str2;
        DailyFortuneGuideTrigger dailyFortuneGuideTrigger4;
        LinkedHashMap linkedHashMapY;
        DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState;
        boolean z3;
        DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState2;
        if (zn2Var instanceof o) {
            oVar = (o) zn2Var;
            int i = oVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.label = i - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, zn2Var);
            }
        } else {
            oVar = new o(this, zn2Var);
        }
        Object objL = oVar.result;
        int i2 = oVar.label;
        Object obj = bw2.a;
        if (i2 == 0) {
            jzb.q(objL);
            String strF = f();
            if (strF == null) {
                return null;
            }
            dailyFortuneGuideTrigger2 = dailyFortuneGuideTrigger;
            oVar.L$0 = dailyFortuneGuideTrigger2;
            oVar.L$1 = strF;
            oVar.label = 1;
            Object objE = e(oVar);
            if (objE != obj) {
                str = strF;
                objL = objE;
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z = oVar.Z$0;
                d99Var = (d99) oVar.L$2;
                str = (String) oVar.L$1;
                dailyFortuneGuideTrigger3 = (DailyFortuneGuideTrigger) oVar.L$0;
                jzb.q(objL);
                try {
                    oVar.L$0 = dailyFortuneGuideTrigger3;
                    oVar.L$1 = str;
                    oVar.L$2 = d99Var;
                    oVar.Z$0 = z;
                    oVar.label = 3;
                    objL = l(oVar);
                    if (objL != obj) {
                        z2 = z;
                        d99Var3 = d99Var;
                        str2 = str;
                        dailyFortuneGuideTrigger4 = dailyFortuneGuideTrigger3;
                        linkedHashMapY = bm8.Y((Map) objL);
                        if (dailyFortuneGuideTrigger4 == DailyFortuneGuideTrigger.FirstReadingCompleted) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        th5 th5Var = cye.b;
                        dailyFortuneGuideStore$AccountState = new DailyFortuneGuideStore$AccountState(false, z3, dailyFortuneGuideTrigger4, gcc.E(z57.a.a(), fbc.d()).a(), false, false, false, false, false, 497, (rp3) null);
                        linkedHashMapY.put(str2, dailyFortuneGuideStore$AccountState);
                        oVar.L$0 = null;
                        oVar.L$1 = str2;
                        oVar.L$2 = d99Var3;
                        oVar.L$3 = null;
                        oVar.L$4 = dailyFortuneGuideStore$AccountState;
                        oVar.Z$0 = z2;
                        oVar.label = 4;
                        if (o(linkedHashMapY, oVar) != obj) {
                            d99Var2 = d99Var3;
                            dailyFortuneGuideStore$AccountState2 = dailyFortuneGuideStore$AccountState;
                            k73 k73VarT = t(dailyFortuneGuideStore$AccountState2, str2, true, z2);
                            d99Var2.h(null);
                            return k73VarT;
                        }
                    }
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    d99Var2 = d99Var;
                    d99Var2.h(null);
                    throw th;
                }
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = oVar.Z$0;
                dailyFortuneGuideStore$AccountState2 = (DailyFortuneGuideStore$AccountState) oVar.L$4;
                d99Var2 = (d99) oVar.L$2;
                str2 = (String) oVar.L$1;
                try {
                    jzb.q(objL);
                    k73 k73VarT2 = t(dailyFortuneGuideStore$AccountState2, str2, true, z2);
                    d99Var2.h(null);
                    return k73VarT2;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            z2 = oVar.Z$0;
            d99Var3 = (d99) oVar.L$2;
            str2 = (String) oVar.L$1;
            DailyFortuneGuideTrigger dailyFortuneGuideTrigger5 = (DailyFortuneGuideTrigger) oVar.L$0;
            try {
                jzb.q(objL);
                dailyFortuneGuideTrigger4 = dailyFortuneGuideTrigger5;
                linkedHashMapY = bm8.Y((Map) objL);
                if (dailyFortuneGuideTrigger4 == DailyFortuneGuideTrigger.FirstReadingCompleted) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                th5 th5Var2 = cye.b;
                dailyFortuneGuideStore$AccountState = new DailyFortuneGuideStore$AccountState(false, z3, dailyFortuneGuideTrigger4, gcc.E(z57.a.a(), fbc.d()).a(), false, false, false, false, false, 497, (rp3) null);
                linkedHashMapY.put(str2, dailyFortuneGuideStore$AccountState);
                oVar.L$0 = null;
                oVar.L$1 = str2;
                oVar.L$2 = d99Var3;
                oVar.L$3 = null;
                oVar.L$4 = dailyFortuneGuideStore$AccountState;
                oVar.Z$0 = z2;
                oVar.label = 4;
                if (o(linkedHashMapY, oVar) != obj) {
                    d99Var2 = d99Var3;
                    dailyFortuneGuideStore$AccountState2 = dailyFortuneGuideStore$AccountState;
                    k73 k73VarT3 = t(dailyFortuneGuideStore$AccountState2, str2, true, z2);
                    d99Var2.h(null);
                    return k73VarT3;
                }
                return obj;
            } catch (Throwable th3) {
                th = th3;
                d99Var2 = d99Var3;
                d99Var2.h(null);
                throw th;
            }
        }
        String str3 = (String) oVar.L$1;
        DailyFortuneGuideTrigger dailyFortuneGuideTrigger6 = (DailyFortuneGuideTrigger) oVar.L$0;
        jzb.q(objL);
        str = str3;
        dailyFortuneGuideTrigger2 = dailyFortuneGuideTrigger6;
        boolean zBooleanValue = ((Boolean) objL).booleanValue();
        oVar.L$0 = dailyFortuneGuideTrigger2;
        oVar.L$1 = str;
        f99 f99Var = this.c;
        oVar.L$2 = f99Var;
        oVar.Z$0 = zBooleanValue;
        oVar.label = 2;
        if (f99Var.b(oVar) != obj) {
            d99Var = f99Var;
            dailyFortuneGuideTrigger3 = dailyFortuneGuideTrigger2;
            z = zBooleanValue;
            oVar.L$0 = dailyFortuneGuideTrigger3;
            oVar.L$1 = str;
            oVar.L$2 = d99Var;
            oVar.Z$0 = z;
            oVar.label = 3;
            objL = l(oVar);
            if (objL != obj) {
                z2 = z;
                d99Var3 = d99Var;
                str2 = str;
                dailyFortuneGuideTrigger4 = dailyFortuneGuideTrigger3;
                linkedHashMapY = bm8.Y((Map) objL);
                if (dailyFortuneGuideTrigger4 == DailyFortuneGuideTrigger.FirstReadingCompleted) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                th5 th5Var3 = cye.b;
                dailyFortuneGuideStore$AccountState = new DailyFortuneGuideStore$AccountState(false, z3, dailyFortuneGuideTrigger4, gcc.E(z57.a.a(), fbc.d()).a(), false, false, false, false, false, 497, (rp3) null);
                linkedHashMapY.put(str2, dailyFortuneGuideStore$AccountState);
                oVar.L$0 = null;
                oVar.L$1 = str2;
                oVar.L$2 = d99Var3;
                oVar.L$3 = null;
                oVar.L$4 = dailyFortuneGuideStore$AccountState;
                oVar.Z$0 = z2;
                oVar.label = 4;
                if (o(linkedHashMapY, oVar) != obj) {
                    d99Var2 = d99Var3;
                    dailyFortuneGuideStore$AccountState2 = dailyFortuneGuideStore$AccountState;
                    k73 k73VarT4 = t(dailyFortuneGuideStore$AccountState2, str2, true, z2);
                    d99Var2.h(null);
                    return k73VarT4;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object p(zn2 zn2Var) throws Throwable {
        q qVar;
        String str;
        boolean zBooleanValue;
        d99 d99Var;
        d99 d99Var2;
        Object objL;
        boolean z;
        d99 d99Var3;
        String str2;
        LinkedHashMap linkedHashMapY;
        DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState;
        String str3;
        DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState2;
        if (zn2Var instanceof q) {
            qVar = (q) zn2Var;
            int i = qVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.label = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, zn2Var);
            }
        } else {
            qVar = new q(this, zn2Var);
        }
        Object obj = qVar.result;
        int i2 = qVar.label;
        Object obj2 = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            String strF = f();
            if (strF == null) {
                return null;
            }
            qVar.L$0 = strF;
            qVar.label = 1;
            Object objE = e(qVar);
            if (objE != obj2) {
                str = strF;
                obj = objE;
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                zBooleanValue = qVar.Z$0;
                d99 d99Var4 = (d99) qVar.L$1;
                str = (String) qVar.L$0;
                jzb.q(obj);
                d99Var = d99Var4;
                try {
                    qVar.L$0 = str;
                    qVar.L$1 = d99Var;
                    qVar.Z$0 = zBooleanValue;
                    qVar.label = 3;
                    objL = l(qVar);
                    if (objL != obj2) {
                        d99 d99Var5 = d99Var;
                        obj = objL;
                        z = zBooleanValue;
                        d99Var3 = d99Var5;
                        str2 = str;
                        linkedHashMapY = bm8.Y((Map) obj);
                        dailyFortuneGuideStore$AccountState = new DailyFortuneGuideStore$AccountState(true, false, (DailyFortuneGuideTrigger) null, (ma8) null, false, false, false, false, false, 510, (rp3) null);
                        linkedHashMapY.put(str2, dailyFortuneGuideStore$AccountState);
                        qVar.L$0 = str2;
                        qVar.L$1 = d99Var3;
                        qVar.L$2 = null;
                        qVar.L$3 = dailyFortuneGuideStore$AccountState;
                        qVar.Z$0 = z;
                        qVar.label = 4;
                        if (o(linkedHashMapY, qVar) != obj2) {
                            d99Var2 = d99Var3;
                            str3 = str2;
                            dailyFortuneGuideStore$AccountState2 = dailyFortuneGuideStore$AccountState;
                            k73 k73VarT = t(dailyFortuneGuideStore$AccountState2, str3, true, z);
                            d99Var2.h(null);
                            return k73VarT;
                        }
                    }
                    return obj2;
                } catch (Throwable th) {
                    th = th;
                    d99Var2 = d99Var;
                    d99Var2.h(null);
                    throw th;
                }
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = qVar.Z$0;
                dailyFortuneGuideStore$AccountState2 = (DailyFortuneGuideStore$AccountState) qVar.L$3;
                d99Var2 = (d99) qVar.L$1;
                str3 = (String) qVar.L$0;
                try {
                    jzb.q(obj);
                    k73 k73VarT2 = t(dailyFortuneGuideStore$AccountState2, str3, true, z);
                    d99Var2.h(null);
                    return k73VarT2;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            z = qVar.Z$0;
            d99Var3 = (d99) qVar.L$1;
            str2 = (String) qVar.L$0;
            try {
                jzb.q(obj);
                linkedHashMapY = bm8.Y((Map) obj);
                dailyFortuneGuideStore$AccountState = new DailyFortuneGuideStore$AccountState(true, false, (DailyFortuneGuideTrigger) null, (ma8) null, false, false, false, false, false, 510, (rp3) null);
                linkedHashMapY.put(str2, dailyFortuneGuideStore$AccountState);
                qVar.L$0 = str2;
                qVar.L$1 = d99Var3;
                qVar.L$2 = null;
                qVar.L$3 = dailyFortuneGuideStore$AccountState;
                qVar.Z$0 = z;
                qVar.label = 4;
                if (o(linkedHashMapY, qVar) != obj2) {
                    d99Var2 = d99Var3;
                    str3 = str2;
                    dailyFortuneGuideStore$AccountState2 = dailyFortuneGuideStore$AccountState;
                    k73 k73VarT3 = t(dailyFortuneGuideStore$AccountState2, str3, true, z);
                    d99Var2.h(null);
                    return k73VarT3;
                }
                return obj2;
            } catch (Throwable th3) {
                th = th3;
                d99Var2 = d99Var3;
                d99Var2.h(null);
                throw th;
            }
        }
        String str4 = (String) qVar.L$0;
        jzb.q(obj);
        str = str4;
        zBooleanValue = ((Boolean) obj).booleanValue();
        qVar.L$0 = str;
        d99Var = this.c;
        qVar.L$1 = d99Var;
        qVar.Z$0 = zBooleanValue;
        qVar.label = 2;
        if (d99Var.b(qVar) != obj2) {
            qVar.L$0 = str;
            qVar.L$1 = d99Var;
            qVar.Z$0 = zBooleanValue;
            qVar.label = 3;
            objL = l(qVar);
            if (objL != obj2) {
                d99 d99Var6 = d99Var;
                obj = objL;
                z = zBooleanValue;
                d99Var3 = d99Var6;
                str2 = str;
                linkedHashMapY = bm8.Y((Map) obj);
                dailyFortuneGuideStore$AccountState = new DailyFortuneGuideStore$AccountState(true, false, (DailyFortuneGuideTrigger) null, (ma8) null, false, false, false, false, false, 510, (rp3) null);
                linkedHashMapY.put(str2, dailyFortuneGuideStore$AccountState);
                qVar.L$0 = str2;
                qVar.L$1 = d99Var3;
                qVar.L$2 = null;
                qVar.L$3 = dailyFortuneGuideStore$AccountState;
                qVar.Z$0 = z;
                qVar.label = 4;
                if (o(linkedHashMapY, qVar) != obj2) {
                    d99Var2 = d99Var3;
                    str3 = str2;
                    dailyFortuneGuideStore$AccountState2 = dailyFortuneGuideStore$AccountState;
                    k73 k73VarT4 = t(dailyFortuneGuideStore$AccountState2, str3, true, z);
                    d99Var2.h(null);
                    return k73VarT4;
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [ai.askquin.ui.popup.dailyfortune.v] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v7, types: [d99] */
    public final Object q(zn2 zn2Var) {
        r rVar;
        String str;
        d99 d99Var;
        boolean z;
        Object objL;
        boolean z2;
        String str2;
        d99 d99Var2;
        LinkedHashMap linkedHashMapY;
        String str3;
        if (zn2Var instanceof r) {
            rVar = (r) zn2Var;
            int i = rVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.label = i - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, zn2Var);
            }
        } else {
            rVar = new r(this, zn2Var);
        }
        Object obj = rVar.result;
        ?? r3 = rVar.label;
        bw2 bw2Var = bw2.a;
        try {
            if (r3 == 0) {
                jzb.q(obj);
                String strF = f();
                if (strF == null) {
                    return null;
                }
                rVar.L$0 = strF;
                rVar.label = 1;
                Object objE = e(rVar);
                if (objE != bw2Var) {
                    str = strF;
                    obj = objE;
                }
                return bw2Var;
            }
            if (r3 == 1) {
                String str4 = (String) rVar.L$0;
                jzb.q(obj);
                str = str4;
            } else {
                if (r3 == 2) {
                    boolean z3 = rVar.Z$0;
                    d99 d99Var3 = (d99) rVar.L$1;
                    str = (String) rVar.L$0;
                    jzb.q(obj);
                    z = z3;
                    d99Var = d99Var3;
                    rVar.L$0 = str;
                    rVar.L$1 = d99Var;
                    rVar.Z$0 = z;
                    rVar.label = 3;
                    objL = l(rVar);
                    if (objL == bw2Var) {
                        boolean z4 = z;
                        obj = objL;
                        z2 = z4;
                        str2 = str;
                        d99Var2 = d99Var;
                        linkedHashMapY = bm8.Y((Map) obj);
                        linkedHashMapY.remove(str2);
                        rVar.L$0 = str2;
                        rVar.L$1 = d99Var2;
                        rVar.L$2 = null;
                        rVar.Z$0 = z2;
                        rVar.label = 4;
                        if (o(linkedHashMapY, rVar) != bw2Var) {
                            str3 = str2;
                            r3 = d99Var2;
                        }
                    }
                    return bw2Var;
                }
                if (r3 == 3) {
                    z2 = rVar.Z$0;
                    d99 d99Var4 = (d99) rVar.L$1;
                    str2 = (String) rVar.L$0;
                    jzb.q(obj);
                    d99Var2 = d99Var4;
                    linkedHashMapY = bm8.Y((Map) obj);
                    linkedHashMapY.remove(str2);
                    rVar.L$0 = str2;
                    rVar.L$1 = d99Var2;
                    rVar.L$2 = null;
                    rVar.Z$0 = z2;
                    rVar.label = 4;
                    if (o(linkedHashMapY, rVar) != bw2Var) {
                        str3 = str2;
                        r3 = d99Var2;
                    }
                    return bw2Var;
                }
                if (r3 != 4) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = rVar.Z$0;
                d99 d99Var5 = (d99) rVar.L$1;
                str3 = (String) rVar.L$0;
                jzb.q(obj);
                r3 = d99Var5;
            }
            k73 k73VarT = t(new DailyFortuneGuideStore$AccountState(false, false, (DailyFortuneGuideTrigger) null, (ma8) null, false, false, false, false, false, 511, (rp3) null), str3, false, z2);
            r3.h(null);
            return k73VarT;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            rVar.L$0 = str;
            f99 f99Var = this.c;
            rVar.L$1 = f99Var;
            rVar.Z$0 = zBooleanValue;
            rVar.label = 2;
            if (f99Var.b(rVar) != bw2Var) {
                d99Var = f99Var;
                z = zBooleanValue;
                rVar.L$0 = str;
                rVar.L$1 = d99Var;
                rVar.Z$0 = z;
                rVar.label = 3;
                objL = l(rVar);
                if (objL == bw2Var) {
                    boolean z5 = z;
                    obj = objL;
                    z2 = z5;
                    str2 = str;
                    d99Var2 = d99Var;
                    linkedHashMapY = bm8.Y((Map) obj);
                    linkedHashMapY.remove(str2);
                    rVar.L$0 = str2;
                    rVar.L$1 = d99Var2;
                    rVar.L$2 = null;
                    rVar.Z$0 = z2;
                    rVar.label = 4;
                    if (o(linkedHashMapY, rVar) != bw2Var) {
                        str3 = str2;
                        r3 = d99Var2;
                        k73 k73VarT2 = t(new DailyFortuneGuideStore$AccountState(false, false, (DailyFortuneGuideTrigger) null, (ma8) null, false, false, false, false, false, 511, (rp3) null), str3, false, z2);
                        r3.h(null);
                        return k73VarT2;
                    }
                }
            }
            return bw2Var;
        } catch (Throwable th) {
            r3.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(zn2 zn2Var) throws Throwable {
        s sVar;
        if (zn2Var instanceof s) {
            sVar = (s) zn2Var;
            int i = sVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sVar.label = i - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, zn2Var);
            }
        } else {
            sVar = new s(this, zn2Var);
        }
        Object obj = sVar.result;
        int i2 = sVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            String strF = f();
            if (strF == null) {
                return Boolean.FALSE;
            }
            a26 bVar = new b(2);
            sVar.L$0 = null;
            sVar.label = 1;
            Object objU = u(strF, bVar, sVar);
            Object obj2 = bw2.a;
            if (objU == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(zn2 zn2Var) throws Throwable {
        t tVar;
        String strF;
        d99 d99Var;
        d99 d99Var2;
        String str;
        if (zn2Var instanceof t) {
            tVar = (t) zn2Var;
            int i = tVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tVar.label = i - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, zn2Var);
            }
        } else {
            tVar = new t(this, zn2Var);
        }
        Object obj = tVar.result;
        int i2 = tVar.label;
        Object obj2 = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                strF = f();
                if (strF == null) {
                    return Boolean.FALSE;
                }
                tVar.L$0 = strF;
                d99Var = this.c;
                tVar.L$1 = d99Var;
                tVar.label = 1;
                if (d99Var.b(tVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) tVar.L$1;
                str = (String) tVar.L$0;
                try {
                    jzb.q(obj);
                    DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) ((Map) obj).get(str);
                    Boolean boolValueOf = Boolean.valueOf(dailyFortuneGuideStore$AccountState == null && dailyFortuneGuideStore$AccountState.getTomorrowReminderPending() && !dailyFortuneGuideStore$AccountState.getTomorrowReminderShown());
                    d99Var2.h(null);
                    return boolValueOf;
                } catch (Throwable th) {
                    th = th;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99Var = (d99) tVar.L$1;
            String str2 = (String) tVar.L$0;
            jzb.q(obj);
            strF = str2;
            tVar.L$0 = strF;
            tVar.L$1 = d99Var;
            tVar.label = 2;
            Object objL = l(tVar);
            if (objL != obj2) {
                str = strF;
                obj = objL;
                d99Var2 = d99Var;
                DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState2 = (DailyFortuneGuideStore$AccountState) ((Map) obj).get(str);
                Boolean boolValueOf2 = Boolean.valueOf(dailyFortuneGuideStore$AccountState2 == null && dailyFortuneGuideStore$AccountState2.getTomorrowReminderPending() && !dailyFortuneGuideStore$AccountState2.getTomorrowReminderShown());
                d99Var2.h(null);
                return boolValueOf2;
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            d99Var2 = d99Var;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0047, B:21:0x0062, B:31:0x00a4, B:33:0x00b2, B:34:0x00c8, B:36:0x00d4), top: B:47:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0047, B:21:0x0062, B:31:0x00a4, B:33:0x00b2, B:34:0x00c8, B:36:0x00d4), top: B:47:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e9, code lost:
    
        if (o(r1, r2) == r8) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [ai.askquin.ui.popup.dailyfortune.v] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(java.lang.String r22, defpackage.a26 r23, defpackage.zn2 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.popup.dailyfortune.v.u(java.lang.String, a26, zn2):java.lang.Object");
    }
}
