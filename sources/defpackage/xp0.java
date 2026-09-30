package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xp0 {
    public final uva a;
    public final iw6 b;

    public xp0(uva uvaVar, iw6 iw6Var) {
        if (uvaVar == null) {
            r82.g("Null processingRequest");
            throw null;
        }
        this.a = uvaVar;
        this.b = iw6Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xp0)) {
            return false;
        }
        xp0 xp0Var = (xp0) obj;
        return this.a.equals(xp0Var.a) && this.b.equals(xp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
