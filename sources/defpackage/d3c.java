package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d3c {
    public final boolean a;
    public final boolean b;

    public d3c(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static d3c a(d3c d3cVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = d3cVar.a;
        }
        if ((i & 2) != 0) {
            z2 = d3cVar.b;
        }
        d3cVar.getClass();
        return new d3c(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3c)) {
            return false;
        }
        d3c d3cVar = (d3c) obj;
        return this.a == d3cVar.a && this.b == d3cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ReviewRewardUiState(showPrompt=" + this.a + ", showSnackbar=" + this.b + ")";
    }
}
