package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qw9 implements y12 {
    public final Class a;

    public qw9(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.y12
    public final Class d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qw9) {
            return pa7.t(this.a, ((qw9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
