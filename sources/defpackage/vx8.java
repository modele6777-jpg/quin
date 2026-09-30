package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vx8 {
    public final boolean a;
    public final boolean b;

    public vx8(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx8)) {
            return false;
        }
        vx8 vx8Var = (vx8) obj;
        return this.a == vx8Var.a && this.b == vx8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MixpanelAuthorizationContext(isLegacyInstall=" + this.a + ", isAuthorized=" + this.b + ")";
    }
}
