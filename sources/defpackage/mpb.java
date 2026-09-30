package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mpb {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final qr0 g;

    public mpb(long j, long j2, long j3, long j4, long j5, float[] fArr, qr0 qr0Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = qr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && mpb.class == obj.getClass()) {
            mpb mpbVar = (mpb) obj;
            if (this.a == mpbVar.a && this.b == mpbVar.b && this.e == mpbVar.e && w67.b(this.c, mpbVar.c) && w67.b(this.d, mpbVar.d)) {
                float[] fArr = mpbVar.f;
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    if (fArr == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (fArr == null) {
                    zEquals = false;
                } else {
                    zEquals = fArr2.equals(fArr);
                }
                return zEquals && this.g == mpbVar.g;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = ib8.b(ib8.b(ib8.b(ib8.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iB + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
