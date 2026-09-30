package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mv6 extends ov6 {
    public final String a;
    public final Exception b;

    public mv6(String str) {
        this.a = str;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv6)) {
            return false;
        }
        mv6 mv6Var = (mv6) obj;
        return pa7.t(this.a, mv6Var.a) && pa7.t(this.b, mv6Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Exception exc = this.b;
        return iHashCode + (exc == null ? 0 : exc.hashCode());
    }

    public final String toString() {
        return "Error(error=" + this.a + ", exception=" + this.b + ")";
    }

    public mv6(Exception exc, String str) {
        this.a = str;
        this.b = exc;
    }
}
