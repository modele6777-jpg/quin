package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jx0 implements xi {
    public final float a;

    public jx0(float f) {
        this.a = f;
    }

    @Override // defpackage.xi
    public final int a(int i, int i2, cv7 cv7Var) {
        float f = (i2 - i) / 2.0f;
        cv7 cv7Var2 = cv7.a;
        float f2 = this.a;
        if (cv7Var != cv7Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx0) && Float.compare(this.a, ((jx0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return kv2.j("Horizontal(bias=", this.a, ")");
    }
}
