package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qi9 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;

    public qi9(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, int i3, int i4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = i3;
        this.h = i4;
        this.i = z5;
        this.j = z6;
    }

    public static qi9 a(qi9 qi9Var, boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, int i3, int i4, boolean z5, boolean z6, int i5) {
        if ((i5 & 1) != 0) {
            z = qi9Var.a;
        }
        boolean z7 = z;
        if ((i5 & 2) != 0) {
            z2 = qi9Var.b;
        }
        boolean z8 = z2;
        if ((i5 & 4) != 0) {
            i = qi9Var.c;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = qi9Var.d;
        }
        int i7 = i2;
        boolean z9 = (i5 & 16) != 0 ? qi9Var.e : z3;
        boolean z10 = (i5 & 32) != 0 ? qi9Var.f : z4;
        int i8 = (i5 & 64) != 0 ? qi9Var.g : i3;
        int i9 = (i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? qi9Var.h : i4;
        boolean z11 = (i5 & 256) != 0 ? qi9Var.i : z5;
        boolean z12 = (i5 & 512) != 0 ? qi9Var.j : z6;
        qi9Var.getClass();
        return new qi9(z7, z8, i6, i7, z9, z10, i8, i9, z11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi9)) {
            return false;
        }
        qi9 qi9Var = (qi9) obj;
        return this.a == qi9Var.a && this.b == qi9Var.b && this.c == qi9Var.c && this.d == qi9Var.d && this.e == qi9Var.e && this.f == qi9Var.f && this.g == qi9Var.g && this.h == qi9Var.h && this.i == qi9Var.i && this.j == qi9Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ub3.d(ub3.b(this.h, ub3.b(this.g, ub3.d(ub3.d(ub3.b(this.d, ub3.b(this.c, ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbP = ib8.p("NotificationSettingsUiState(systemEnabled=", ", todayEnabled=", ", todayHour=", this.a, this.b);
        ub3.u(sbP, this.c, ", todayMinute=", this.d, ", showTodayTimePicker=");
        ib8.w(sbP, this.e, ", tomorrowEnabled=", this.f, ", tomorrowHour=");
        ub3.u(sbP, this.g, ", tomorrowMinute=", this.h, ", showTomorrowTimePicker=");
        sbP.append(this.i);
        sbP.append(", msgEnabled=");
        sbP.append(this.j);
        sbP.append(")");
        return sbP.toString();
    }
}
