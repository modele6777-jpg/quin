package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fp7 {
    public final Float a;
    public fs4 b;

    public fp7(Float f, fs4 fs4Var) {
        this.a = f;
        this.b = fs4Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fp7)) {
            return false;
        }
        fp7 fp7Var = (fp7) obj;
        return fp7Var.a.equals(this.a) && pa7.t(fp7Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ub3.b(0, this.a.hashCode() * 31, 31);
    }
}
