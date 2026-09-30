package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p86 {
    public final wa6 a;
    public final List b;
    public final boolean c;
    public final Throwable d;

    public /* synthetic */ p86(wa6 wa6Var, List list, int i) {
        this((i & 1) != 0 ? wa6.Sent : wa6Var, (i & 2) != 0 ? pu4.a : list, (i & 4) != 0, null);
    }

    public static p86 a(p86 p86Var, wa6 wa6Var, List list, boolean z, Exception exc, int i) {
        if ((i & 1) != 0) {
            wa6Var = p86Var.a;
        }
        if ((i & 2) != 0) {
            list = p86Var.b;
        }
        if ((i & 4) != 0) {
            z = p86Var.c;
        }
        Throwable th = exc;
        if ((i & 8) != 0) {
            th = p86Var.d;
        }
        p86Var.getClass();
        wa6Var.getClass();
        list.getClass();
        return new p86(wa6Var, list, z, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p86)) {
            return false;
        }
        p86 p86Var = (p86) obj;
        return this.a == p86Var.a && pa7.t(this.b, p86Var.b) && this.c == p86Var.c && pa7.t(this.d, p86Var.d);
    }

    public final int hashCode() {
        int iD = ub3.d(tec.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Throwable th = this.d;
        return iD + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "GiftCardListState(tab=" + this.a + ", items=" + this.b + ", loading=" + this.c + ", error=" + this.d + ")";
    }

    public p86(wa6 wa6Var, List list, boolean z, Throwable th) {
        wa6Var.getClass();
        list.getClass();
        this.a = wa6Var;
        this.b = list;
        this.c = z;
        this.d = th;
    }
}
