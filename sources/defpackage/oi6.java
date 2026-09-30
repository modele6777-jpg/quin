package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oi6 {
    public static final a71 d;
    public static final a71 e;
    public static final a71 f;
    public static final a71 g;
    public static final a71 h;
    public static final a71 i;
    public final a71 a;
    public final a71 b;
    public final int c;

    static {
        a71 a71Var = a71.c;
        d = m8c.u(":");
        e = m8c.u(":status");
        f = m8c.u(":method");
        g = m8c.u(":path");
        h = m8c.u(":scheme");
        i = m8c.u(":authority");
    }

    public oi6(a71 a71Var, a71 a71Var2) {
        a71Var.getClass();
        a71Var2.getClass();
        this.a = a71Var;
        this.b = a71Var2;
        this.c = a71Var2.e() + a71Var.e() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi6)) {
            return false;
        }
        oi6 oi6Var = (oi6) obj;
        return pa7.t(this.a, oi6Var.a) && pa7.t(this.b, oi6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.t() + ": " + this.b.t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oi6(String str, String str2) {
        this(m8c.u(str), m8c.u(str2));
        a71 a71Var = a71.c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oi6(a71 a71Var, String str) {
        this(a71Var, m8c.u(str));
        a71Var.getClass();
        str.getClass();
        a71 a71Var2 = a71.c;
    }
}
