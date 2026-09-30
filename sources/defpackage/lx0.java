package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lx0 implements yi {
    public final float a;
    public final float b;

    public lx0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.yi
    public final long a(long j, long j2, cv7 cv7Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        cv7 cv7Var2 = cv7.a;
        float f3 = this.a;
        if (cv7Var != cv7Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx0)) {
            return false;
        }
        lx0 lx0Var = (lx0) obj;
        return Float.compare(this.a, lx0Var.a) == 0 && Float.compare(this.b, lx0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return kv2.k("BiasAlignment(horizontalBias=", this.a, ", verticalBias=", this.b, ")");
    }
}
