package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d38 {
    public final int a;
    public final boolean b;

    public d38(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d38)) {
            return false;
        }
        d38 d38Var = (d38) obj;
        return this.a == d38Var.a && this.b == d38Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LegacyImportUploadResult(uploaded=" + this.a + ", hasPermanentFailure=" + this.b + ")";
    }
}
