package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zp7 extends yp7 {
    public final long a;

    public zp7(long j) {
        this.a = j;
    }

    @Override // defpackage.yp7
    public final Object a() {
        return Long.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zp7) && this.a == ((zp7) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
