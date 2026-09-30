package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y86 implements e96 {
    public final String a;
    public final Throwable b;
    public final boolean c;

    public y86(String str, Throwable th, boolean z) {
        str.getClass();
        th.getClass();
        this.a = str;
        this.b = th;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y86)) {
            return false;
        }
        y86 y86Var = (y86) obj;
        return pa7.t(this.a, y86Var.a) && pa7.t(this.b, y86Var.b) && this.c == y86Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmationFailed(orderRef=");
        sb.append(this.a);
        sb.append(", cause=");
        sb.append(this.b);
        sb.append(", dialogVisible=");
        return ub3.m(sb, this.c, ")");
    }
}
