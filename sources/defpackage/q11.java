package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q11 {
    public final float a;
    public final dtd b;

    public q11(float f, dtd dtdVar) {
        this.a = f;
        this.b = dtdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q11)) {
            return false;
        }
        q11 q11Var = (q11) obj;
        return yi4.b(this.a, q11Var.a) && this.b.equals(q11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + yi4.c(this.a) + ", brush=" + this.b + ")";
    }
}
