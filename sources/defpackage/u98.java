package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u98 {
    public long a;
    public long b;
    public long c;
    public long d;
    public final Object e;
    public Object f;
    public Object g;

    public u98() {
        q69 q69Var = v67.a;
        this.e = new q69();
        this.a = -1L;
        this.b = 0L;
        this.c = 0L;
    }

    public void a(rwe rweVar, long j, long j2, float[] fArr, long j3) {
        long j4 = rweVar.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            rweVar.g = j3;
            rweVar.a(rweVar.e, rweVar.f, j, j2, fArr);
        }
    }

    public boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (w67.b(j2, this.b)) {
            z = false;
        } else {
            this.b = j2;
            z = true;
        }
        if (!w67.b(j, this.c)) {
            this.c = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.d) {
            return z;
        }
        this.d = j3;
        return true;
    }

    public u98(long j, dc3 dc3Var, long j2) {
        this.a = j;
        this.e = dc3Var;
        this.f = dc3Var.a;
        this.b = j2;
        this.g = dpb.g;
    }
}
