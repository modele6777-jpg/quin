package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lb8 {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final ma8 h;
    public final va8 i;
    public final boolean j;
    public final List k;
    public final int l;
    public final ma8 m;
    public final List n;
    public final ma8 o;
    public final boolean p;
    public final boolean q;
    public final p40 r;
    public final String s;
    public final Map t;
    public final Map u;
    public final boolean v;

    public lb8(List list, List list2, List list3, List list4, boolean z, int i, boolean z2, ma8 ma8Var, va8 va8Var, boolean z3, List list5, int i2, ma8 ma8Var2, List list6, ma8 ma8Var3, boolean z4, boolean z5, p40 p40Var, String str, Map map, Map map2, boolean z6) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        map.getClass();
        map2.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = z;
        this.f = i;
        this.g = z2;
        this.h = ma8Var;
        this.i = va8Var;
        this.j = z3;
        this.k = list5;
        this.l = i2;
        this.m = ma8Var2;
        this.n = list6;
        this.o = ma8Var3;
        this.p = z4;
        this.q = z5;
        this.r = p40Var;
        this.s = str;
        this.t = map;
        this.u = map2;
        this.v = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb8)) {
            return false;
        }
        lb8 lb8Var = (lb8) obj;
        return pa7.t(this.a, lb8Var.a) && pa7.t(this.b, lb8Var.b) && pa7.t(this.c, lb8Var.c) && pa7.t(this.d, lb8Var.d) && this.e == lb8Var.e && this.f == lb8Var.f && this.g == lb8Var.g && pa7.t(this.h, lb8Var.h) && pa7.t(this.i, lb8Var.i) && this.j == lb8Var.j && pa7.t(this.k, lb8Var.k) && this.l == lb8Var.l && pa7.t(this.m, lb8Var.m) && this.n.equals(lb8Var.n) && pa7.t(this.o, lb8Var.o) && this.p == lb8Var.p && this.q == lb8Var.q && pa7.t(this.r, lb8Var.r) && pa7.t(this.s, lb8Var.s) && pa7.t(this.t, lb8Var.t) && pa7.t(this.u, lb8Var.u) && this.v == lb8Var.v;
    }

    public final int hashCode() {
        int iD = ub3.d(ub3.b(this.f, ub3.d(tec.a(tec.a(tec.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g);
        ma8 ma8Var = this.h;
        int iHashCode = (iD + (ma8Var == null ? 0 : ma8Var.hashCode())) * 31;
        va8 va8Var = this.i;
        int iB = ub3.b(this.l, tec.a(ub3.d((iHashCode + (va8Var == null ? 0 : va8Var.hashCode())) * 31, 31, this.j), 31, this.k), 31);
        ma8 ma8Var2 = this.m;
        int iA = tec.a((iB + (ma8Var2 == null ? 0 : ma8Var2.hashCode())) * 31, 31, this.n);
        ma8 ma8Var3 = this.o;
        int iD2 = ub3.d(ub3.d((iA + (ma8Var3 == null ? 0 : ma8Var3.hashCode())) * 31, 31, this.p), 31, this.q);
        p40 p40Var = this.r;
        int iHashCode2 = (iD2 + (p40Var == null ? 0 : p40Var.hashCode())) * 31;
        String str = this.s;
        return Boolean.hashCode(this.v) + ib8.c(this.u, ib8.c(this.t, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "LocalStorage(visitedDays=" + this.a + ", visitedEventIds=" + this.b + ", consumedDailyMonthEventIds=" + this.c + ", drawFreeSingleCardDays=" + this.d + ", hasNewMessage=" + this.e + ", appOpenTimes=" + this.f + ", visitedSkinBanner=" + this.g + ", lastExpirationAlertDate=" + this.h + ", discountStartDateTime=" + this.i + ", visitedGuide=" + this.j + ", divinationCompletedDates=" + this.k + ", dailyFortuneCompletedCount=" + this.l + ", lastDailyFortuneCompletedDate=" + this.m + ", dailyFortuneCompletedDates=" + this.n + ", lastDailyFortuneCompletionEventDate=" + this.o + ", firstDailyFortuneCompleted=" + this.p + ", firstDivinationCompletedSinceUpdate=" + this.q + ", annualReportProgress=" + this.r + ", dailyFortuneSkinType=" + this.s + ", skinUsageHistory=" + this.t + ", dailyFortuneSkinPerDate=" + this.u + ", dailyFortuneSkinBackfilled=" + this.v + ")";
    }
}
