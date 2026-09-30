package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ol4 {
    public final hkb a;
    public final int b;

    public ol4(hkb hkbVar, int i) {
        hkbVar.getClass();
        this.a = hkbVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol4)) {
            return false;
        }
        ol4 ol4Var = (ol4) obj;
        return pa7.t(this.a, ol4Var.a) && this.b == ol4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoundsWithScroll(bounds=" + this.a + ", scrollPosition=" + this.b + ")";
    }
}
