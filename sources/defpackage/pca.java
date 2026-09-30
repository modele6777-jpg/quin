package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pca implements rca {
    public final int a;
    public final String b;

    public pca(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pca)) {
            return false;
        }
        pca pcaVar = (pca) obj;
        return this.a == pcaVar.a && pa7.t(this.b, pcaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PhoneVerifyError(errorCode=" + this.a + ", errorMessage=" + this.b + ")";
    }
}
