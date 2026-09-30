package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qp7 extends yp7 {
    public final boolean a;

    public qp7(boolean z) {
        this.a = z;
    }

    @Override // defpackage.yp7
    public final Object a() {
        return Boolean.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qp7) && this.a == ((qp7) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
