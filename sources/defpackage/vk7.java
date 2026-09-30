package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vk7 extends kn2 {
    public final String E0;
    public final String F0;

    public vk7(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.E0 = str;
        this.F0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk7)) {
            return false;
        }
        vk7 vk7Var = (vk7) obj;
        return pa7.t(this.E0, vk7Var.E0) && pa7.t(this.F0, vk7Var.F0);
    }

    public final int hashCode() {
        return this.F0.hashCode() + (this.E0.hashCode() * 31);
    }

    public final String toString() {
        return this.E0 + this.F0;
    }
}
