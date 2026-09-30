package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yx8 {
    public final boolean a;
    public final boolean b;

    public /* synthetic */ yx8(boolean z, int i) {
        this(false, (i & 2) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx8)) {
            return false;
        }
        yx8 yx8Var = (yx8) obj;
        return this.a == yx8Var.a && this.b == yx8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MixpanelAuthorizationGateResult(isFirstAuthorization=" + this.a + ", didEstablishFreshBaseline=" + this.b + ")";
    }

    public yx8(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
