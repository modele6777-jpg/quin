package defpackage;

import ai.askquin.qa.bridge.QaResult;
import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j73 {
    public static final QaResult.Err a(ti7 ti7Var) {
        nh7 nh7Var = (nh7) ti7Var.get("trigger");
        String strC = null;
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            if (!(yi7VarI instanceof qi7)) {
                strC = yi7VarI.c();
            }
        }
        if (strC == null) {
            strC = "";
        }
        return new QaResult.Err(ub3.k("invalid trigger '", strC, "'; expected ", s72.D0(DailyFortuneGuideTrigger.getEntries(), null, null, null, new i73(0), 31)), "invalid_params");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public static final DailyFortuneGuideTrigger b(ti7 ti7Var) {
        String strC;
        nh7 nh7Var = (nh7) ti7Var.get("trigger");
        Object obj = null;
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            if (yi7VarI instanceof qi7) {
                strC = null;
            } else {
                strC = yi7VarI.c();
            }
        } else {
            strC = null;
        }
        for (Object obj2 : DailyFortuneGuideTrigger.getEntries()) {
            if (pa7.t(((DailyFortuneGuideTrigger) obj2).getAnalyticsValue(), strC)) {
                obj = obj2;
                break;
            }
        }
        return (DailyFortuneGuideTrigger) obj;
    }

    public static final ti7 c(k73 k73Var, iy9... iy9VarArr) {
        fl8 fl8Var = new fl8();
        fl8Var.put("accountId", oh7.c(k73Var.a));
        fl8Var.put("exists", oh7.a(Boolean.valueOf(k73Var.b)));
        fl8Var.put("firstReadingEligible", oh7.a(Boolean.valueOf(k73Var.c)));
        fl8Var.put("firstReadingEvaluated", oh7.a(Boolean.valueOf(k73Var.d)));
        DailyFortuneGuideTrigger dailyFortuneGuideTrigger = k73Var.e;
        String analyticsValue = dailyFortuneGuideTrigger != null ? dailyFortuneGuideTrigger.getAnalyticsValue() : null;
        if (analyticsValue == null) {
            analyticsValue = "";
        }
        fl8Var.put("pendingTrigger", oh7.c(analyticsValue));
        fl8Var.put("consumed", oh7.a(Boolean.valueOf(k73Var.f)));
        fl8Var.put("tomorrowReminderLaunchCohortCaptured", oh7.a(Boolean.valueOf(k73Var.g)));
        fl8Var.put("tomorrowReminderLaunchCohort", oh7.a(Boolean.valueOf(k73Var.h)));
        fl8Var.put("tomorrowReminderPending", oh7.a(Boolean.valueOf(k73Var.i)));
        fl8Var.put("tomorrowReminderShown", oh7.a(Boolean.valueOf(k73Var.j)));
        fl8Var.put("homeTooltipPending", oh7.a(Boolean.valueOf(k73Var.k)));
        fl8Var.put("homeTooltipShown", oh7.a(Boolean.valueOf(k73Var.l)));
        fl8Var.put("dailyFortuneCompletedToday", oh7.a(Boolean.valueOf(k73Var.m)));
        bm8.O(fl8Var, iy9VarArr);
        return new ti7(fl8Var.j());
    }
}
