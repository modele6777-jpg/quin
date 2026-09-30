package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kp8 {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        new kp8(new jp8());
        pqf.D(0);
        pqf.D(1);
        pqf.D(2);
        pqf.D(3);
        pqf.D(4);
    }

    public kp8(jp8 jp8Var) {
        long j = jp8Var.a;
        long j2 = jp8Var.b;
        long j3 = jp8Var.c;
        float f = jp8Var.d;
        float f2 = jp8Var.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    public final jp8 a() {
        jp8 jp8Var = new jp8();
        jp8Var.a = this.a;
        jp8Var.b = this.b;
        jp8Var.c = this.c;
        jp8Var.d = this.d;
        jp8Var.e = this.e;
        return jp8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp8)) {
            return false;
        }
        kp8 kp8Var = (kp8) obj;
        return this.a == kp8Var.a && this.b == kp8Var.b && this.c == kp8Var.c && this.d == kp8Var.d && this.e == kp8Var.e;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.d;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.e;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
