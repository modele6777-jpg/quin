package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cn6 {
    public final LocalDate a;
    public final LocalDate b;
    public final LocalDate c;
    public final LocalDate d;
    public final List e;
    public final List f;
    public final z63 g;
    public final z63 h;
    public final LocalDate i;
    public final z63 j;
    public final h73 k;
    public final h73 l;
    public final List m;
    public final List n;
    public final TarotSkinIdentify o;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ cn6(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, List list, ArrayList arrayList, z63 z63Var, z63 z63Var2, LocalDate localDate5, z63 z63Var3, h73 h73Var, h73 h73Var2, List list2, List list3, TarotSkinIdentify tarotSkinIdentify, int i) {
        int i2 = i & 16;
        pu4 pu4Var = pu4.a;
        List list4 = i2 != 0 ? pu4Var : list;
        List list5 = (i & 32) != 0 ? pu4Var : arrayList;
        z63 z63Var4 = (i & 64) != 0 ? null : z63Var;
        z63 z63Var5 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : z63Var2;
        z63 z63Var6 = (i & 512) != 0 ? null : z63Var3;
        int i3 = i & UserMetadata.MAX_ATTRIBUTE_SIZE;
        h73 h73Var3 = h73.a;
        this(localDate, localDate2, localDate3, localDate4, list4, list5, z63Var4, z63Var5, localDate5, z63Var6, i3 != 0 ? h73Var3 : h73Var, (i & 2048) != 0 ? h73Var3 : h73Var2, (i & 4096) != 0 ? pu4Var : list2, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? pu4Var : list3, (i & 16384) != 0 ? null : tarotSkinIdentify);
    }

    public static cn6 a(cn6 cn6Var, h73 h73Var, h73 h73Var2, List list, int i) {
        LocalDate localDate = cn6Var.a;
        LocalDate localDate2 = cn6Var.b;
        LocalDate localDate3 = cn6Var.c;
        LocalDate localDate4 = cn6Var.d;
        List list2 = cn6Var.e;
        List list3 = cn6Var.f;
        z63 z63Var = cn6Var.g;
        z63 z63Var2 = cn6Var.h;
        LocalDate localDate5 = cn6Var.i;
        z63 z63Var3 = cn6Var.j;
        h73 h73Var3 = (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? cn6Var.k : h73Var;
        h73 h73Var4 = (i & 2048) != 0 ? cn6Var.l : h73Var2;
        List list4 = (i & 4096) != 0 ? cn6Var.m : list;
        List list5 = cn6Var.n;
        TarotSkinIdentify tarotSkinIdentify = cn6Var.o;
        cn6Var.getClass();
        localDate.getClass();
        localDate2.getClass();
        localDate3.getClass();
        localDate4.getClass();
        list2.getClass();
        list3.getClass();
        localDate5.getClass();
        h73Var3.getClass();
        h73Var4.getClass();
        list4.getClass();
        list5.getClass();
        return new cn6(localDate, localDate2, localDate3, localDate4, list2, list3, z63Var, z63Var2, localDate5, z63Var3, h73Var3, h73Var4, list4, list5, tarotSkinIdentify);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn6)) {
            return false;
        }
        cn6 cn6Var = (cn6) obj;
        return pa7.t(this.a, cn6Var.a) && pa7.t(this.b, cn6Var.b) && pa7.t(this.c, cn6Var.c) && pa7.t(this.d, cn6Var.d) && pa7.t(this.e, cn6Var.e) && pa7.t(this.f, cn6Var.f) && pa7.t(this.g, cn6Var.g) && pa7.t(this.h, cn6Var.h) && pa7.t(this.i, cn6Var.i) && pa7.t(this.j, cn6Var.j) && this.k == cn6Var.k && this.l == cn6Var.l && pa7.t(this.m, cn6Var.m) && pa7.t(this.n, cn6Var.n) && this.o == cn6Var.o;
    }

    public final int hashCode() {
        int iA = tec.a(tec.a((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
        z63 z63Var = this.g;
        int iHashCode = (iA + (z63Var == null ? 0 : z63Var.hashCode())) * 31;
        z63 z63Var2 = this.h;
        int iHashCode2 = (this.i.hashCode() + ((iHashCode + (z63Var2 == null ? 0 : z63Var2.hashCode())) * 31)) * 31;
        z63 z63Var3 = this.j;
        int iA2 = tec.a(tec.a((this.l.hashCode() + ((this.k.hashCode() + ((iHashCode2 + (z63Var3 == null ? 0 : z63Var3.hashCode())) * 31)) * 31)) * 31, 31, this.m), 31, this.n);
        TarotSkinIdentify tarotSkinIdentify = this.o;
        return iA2 + (tarotSkinIdentify != null ? tarotSkinIdentify.hashCode() : 0);
    }

    public final String toString() {
        return "HomeHistoryUiState(startDate=" + this.a + ", endDate=" + this.b + ", todayTargetDate=" + this.c + ", selectedDate=" + this.d + ", allDailyCards=" + this.e + ", historyExistDays=" + this.f + ", currentDailyCard=" + this.g + ", todayDailyCard=" + this.h + ", tomorrowTargetDate=" + this.i + ", tomorrowDailyCard=" + this.j + ", focusedDailyFortune=" + this.k + ", defaultDailyFortuneFocus=" + this.l + ", dailyFortuneCompletedDates=" + this.m + ", history=" + this.n + ", dailyFortuneSkin=" + this.o + ")";
    }

    public cn6(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, List list, List list2, z63 z63Var, z63 z63Var2, LocalDate localDate5, z63 z63Var3, h73 h73Var, h73 h73Var2, List list3, List list4, TarotSkinIdentify tarotSkinIdentify) {
        localDate.getClass();
        localDate2.getClass();
        localDate4.getClass();
        list.getClass();
        list2.getClass();
        localDate5.getClass();
        h73Var.getClass();
        h73Var2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = localDate;
        this.b = localDate2;
        this.c = localDate3;
        this.d = localDate4;
        this.e = list;
        this.f = list2;
        this.g = z63Var;
        this.h = z63Var2;
        this.i = localDate5;
        this.j = z63Var3;
        this.k = h73Var;
        this.l = h73Var2;
        this.m = list3;
        this.n = list4;
        this.o = tarotSkinIdentify;
    }
}
