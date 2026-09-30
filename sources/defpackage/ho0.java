package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ho0 {
    public final int a;
    public final io0 b;

    public ho0(int i, io0 io0Var) {
        if (i == 0) {
            r82.g("Null type");
            throw null;
        }
        this.a = i;
        this.b = io0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ho0)) {
            return false;
        }
        ho0 ho0Var = (ho0) obj;
        if (!kv2.a(this.a, ho0Var.a)) {
            return false;
        }
        io0 io0Var = ho0Var.b;
        io0 io0Var2 = this.b;
        if (io0Var2 == null) {
            return io0Var == null;
        }
        return io0Var2.equals(io0Var);
    }

    public final int hashCode() {
        int iB = (kv2.B(this.a) ^ 1000003) * 1000003;
        io0 io0Var = this.b;
        return (io0Var == null ? 0 : io0Var.hashCode()) ^ iB;
    }

    public final String toString() {
        return "CameraState{type=" + ks0.A(this.a) + ", error=" + this.b + "}";
    }
}
