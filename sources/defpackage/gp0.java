package defpackage;

import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gp0 implements vv6 {
    public final wde a;
    public final long b;
    public final int c;
    public final Matrix d;
    public final int e;

    public gp0(wde wdeVar, long j, int i, Matrix matrix, int i2) {
        if (wdeVar == null) {
            r82.g("Null tagBundle");
            throw null;
        }
        this.a = wdeVar;
        this.b = j;
        this.c = i;
        this.d = matrix;
        this.e = i2;
    }

    @Override // defpackage.vv6
    public final int a() {
        return this.c;
    }

    @Override // defpackage.vv6
    public final void b(i35 i35Var) {
        i35Var.d(this.c);
    }

    @Override // defpackage.vv6
    public final wde c() {
        return this.a;
    }

    @Override // defpackage.vv6
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gp0)) {
            return false;
        }
        gp0 gp0Var = (gp0) obj;
        return this.a.equals(gp0Var.a) && this.b == gp0Var.b && this.c == gp0Var.c && this.d.equals(gp0Var.d) && this.e == gp0Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return this.e ^ ((((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    @Override // defpackage.vv6
    public final long i() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        sb.append(this.c);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.d);
        sb.append(", flashState=");
        return tec.g(this.e, "}", sb);
    }
}
