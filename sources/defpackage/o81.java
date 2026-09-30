package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o81 {
    public static final o81 b = new o81();
    public final me9 a;

    public o81() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o81) {
            return pa7.t(this.a, ((o81) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        me9 me9Var = this.a;
        if (me9Var != null) {
            return me9Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ")";
    }

    public o81(me9 me9Var) {
        this.a = me9Var;
    }
}
