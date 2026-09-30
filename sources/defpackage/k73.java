package defpackage;

import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k73 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final DailyFortuneGuideTrigger e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public k73(String str, boolean z, boolean z2, boolean z3, DailyFortuneGuideTrigger dailyFortuneGuideTrigger, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = dailyFortuneGuideTrigger;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k73)) {
            return false;
        }
        k73 k73Var = (k73) obj;
        return pa7.t(this.a, k73Var.a) && this.b == k73Var.b && this.c == k73Var.c && this.d == k73Var.d && this.e == k73Var.e && this.f == k73Var.f && this.g == k73Var.g && this.h == k73Var.h && this.i == k73Var.i && this.j == k73Var.j && this.k == k73Var.k && this.l == k73Var.l && this.m == k73Var.m;
    }

    public final int hashCode() {
        int iD = ub3.d(ub3.d(ub3.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        DailyFortuneGuideTrigger dailyFortuneGuideTrigger = this.e;
        return Boolean.hashCode(this.m) + ub3.d(ub3.d(ub3.d(ub3.d(ub3.d(ub3.d(ub3.d((iD + (dailyFortuneGuideTrigger == null ? 0 : dailyFortuneGuideTrigger.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyFortuneGuideDebugState(accountId=");
        sb.append(this.a);
        sb.append(", exists=");
        sb.append(this.b);
        sb.append(", firstReadingEligible=");
        ib8.w(sb, this.c, ", firstReadingEvaluated=", this.d, ", pendingTrigger=");
        sb.append(this.e);
        sb.append(", consumed=");
        sb.append(this.f);
        sb.append(", tomorrowReminderLaunchCohortCaptured=");
        ib8.w(sb, this.g, ", tomorrowReminderLaunchCohort=", this.h, ", tomorrowReminderPending=");
        ib8.w(sb, this.i, ", tomorrowReminderShown=", this.j, ", homeTooltipPending=");
        ib8.w(sb, this.k, ", homeTooltipShown=", this.l, ", dailyFortuneCompletedToday=");
        return ub3.m(sb, this.m, ")");
    }
}
