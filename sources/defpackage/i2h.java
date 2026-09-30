package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i2h extends r2h {
    public final long a;

    public i2h(long j) {
        this.a = j;
    }

    @Override // defpackage.r2h
    public final int a() {
        return r2h.d(this.a >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        r2h r2hVar = (r2h) obj;
        if (a() != r2hVar.a()) {
            return a() - r2hVar.a();
        }
        long jAbs = Math.abs(this.a);
        long jAbs2 = Math.abs(((i2h) r2hVar).a);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i2h.class == obj.getClass() && this.a == ((i2h) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
