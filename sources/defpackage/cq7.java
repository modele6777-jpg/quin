package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cq7 extends yp7 {
    public final byte a;

    public cq7(byte b) {
        this.a = b;
    }

    @Override // defpackage.yp7
    public final Object a() {
        return new u9f(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq7) && this.a == ((cq7) obj).a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }
}
