package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ju5 {
    public final n07 a;
    public final n07 b;
    public final z6e c;
    public final ax5 d;
    public final qs5 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public ju5(n07 n07Var, n07 n07Var2, z6e z6eVar, ax5 ax5Var, qs5 qs5Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ax5Var.getClass();
        qs5Var.getClass();
        this.a = n07Var;
        this.b = n07Var2;
        this.c = z6eVar;
        this.d = ax5Var;
        this.e = qs5Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public static ju5 a(ju5 ju5Var, n07 n07Var, n07 n07Var2, z6e z6eVar, ax5 ax5Var, qs5 qs5Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            n07Var = ju5Var.a;
        }
        n07 n07Var3 = n07Var;
        if ((i & 2) != 0) {
            n07Var2 = ju5Var.b;
        }
        n07 n07Var4 = n07Var2;
        if ((i & 4) != 0) {
            z6eVar = ju5Var.c;
        }
        z6e z6eVar2 = z6eVar;
        if ((i & 8) != 0) {
            ax5Var = ju5Var.d;
        }
        ax5 ax5Var2 = ax5Var;
        qs5 qs5Var2 = (i & 16) != 0 ? ju5Var.e : qs5Var;
        boolean z5 = (i & 32) != 0 ? ju5Var.f : z;
        boolean z6 = (i & 64) != 0 ? ju5Var.g : z2;
        boolean z7 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? ju5Var.h : z3;
        boolean z8 = (i & 256) != 0 ? ju5Var.i : true;
        boolean z9 = (i & 512) != 0 ? ju5Var.j : z4;
        ju5Var.getClass();
        ax5Var2.getClass();
        qs5Var2.getClass();
        return new ju5(n07Var3, n07Var4, z6eVar2, ax5Var2, qs5Var2, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju5)) {
            return false;
        }
        ju5 ju5Var = (ju5) obj;
        return pa7.t(this.a, ju5Var.a) && pa7.t(this.b, ju5Var.b) && pa7.t(this.c, ju5Var.c) && this.d == ju5Var.d && this.e == ju5Var.e && this.f == ju5Var.f && this.g == ju5Var.g && this.h == ju5Var.h && this.i == ju5Var.i && this.j == ju5Var.j;
    }

    public final int hashCode() {
        n07 n07Var = this.a;
        int iHashCode = (n07Var == null ? 0 : n07Var.hashCode()) * 31;
        n07 n07Var2 = this.b;
        int iHashCode2 = (iHashCode + (n07Var2 == null ? 0 : n07Var2.hashCode())) * 31;
        z6e z6eVar = this.c;
        return Boolean.hashCode(this.j) + ub3.d(ub3.d(ub3.d(ub3.d((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (z6eVar != null ? z6eVar.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FourSeasonsIntroState(product=");
        sb.append(this.a);
        sb.append(", earlyBirdProduct=");
        sb.append(this.b);
        sb.append(", subscription=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", ctaState=");
        sb.append(this.e);
        sb.append(", isInAppLoading=");
        sb.append(this.f);
        sb.append(", isSubscriptionLoading=");
        ib8.w(sb, this.g, ", pricesFailed=", this.h, ", statusLoaded=");
        sb.append(this.i);
        sb.append(", statusFailed=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
