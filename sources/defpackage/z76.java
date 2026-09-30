package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z76 {
    public final y76 a;
    public final boolean b;
    public final Throwable c;

    public /* synthetic */ z76(y76 y76Var, int i) {
        this((i & 1) != 0 ? null : y76Var, (i & 2) != 0, null);
    }

    public static z76 a(z76 z76Var, y76 y76Var, boolean z, Exception exc, int i) {
        if ((i & 1) != 0) {
            y76Var = z76Var.a;
        }
        Throwable th = exc;
        if ((i & 4) != 0) {
            th = z76Var.c;
        }
        z76Var.getClass();
        return new z76(y76Var, z, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z76)) {
            return false;
        }
        z76 z76Var = (z76) obj;
        return pa7.t(this.a, z76Var.a) && this.b == z76Var.b && pa7.t(this.c, z76Var.c);
    }

    public final int hashCode() {
        y76 y76Var = this.a;
        int iD = ub3.d((y76Var == null ? 0 : y76Var.hashCode()) * 31, 31, this.b);
        Throwable th = this.c;
        return iD + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "GiftCardDetailState(detail=" + this.a + ", loading=" + this.b + ", error=" + this.c + ")";
    }

    public z76(y76 y76Var, boolean z, Throwable th) {
        this.a = y76Var;
        this.b = z;
        this.c = th;
    }
}
