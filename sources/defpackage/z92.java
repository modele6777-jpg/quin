package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z92 {
    public final String a;
    public final int b;

    public z92(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z92)) {
            return false;
        }
        z92 z92Var = (z92) obj;
        return pa7.t(this.a, z92Var.a) && this.b == z92Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommentData(text=" + this.a + ", avatarRes=" + this.b + ")";
    }
}
