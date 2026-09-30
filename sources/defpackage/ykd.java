package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ykd {
    public static final ykd c;
    public final b94 a;
    public final b94 b;

    static {
        a94 a94Var = a94.a;
        c = new ykd(a94Var, a94Var);
    }

    public ykd(b94 b94Var, b94 b94Var2) {
        this.a = b94Var;
        this.b = b94Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykd)) {
            return false;
        }
        ykd ykdVar = (ykd) obj;
        return this.a.equals(ykdVar.a) && this.b.equals(ykdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
