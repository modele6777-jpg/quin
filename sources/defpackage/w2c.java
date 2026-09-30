package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w2c {
    public final r0c a;
    public final String b;

    public w2c(r0c r0cVar, String str) {
        r0cVar.getClass();
        str.getClass();
        this.a = r0cVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2c)) {
            return false;
        }
        w2c w2cVar = (w2c) obj;
        return pa7.t(this.a, w2cVar.a) && pa7.t(this.b, w2cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReviewRewardSnackbarOwnership(session=" + this.a + ", exposureId=" + this.b + ")";
    }
}
