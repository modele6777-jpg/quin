package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dq7 extends yp7 {
    public final int a;

    public dq7(int i) {
        this.a = i;
    }

    @Override // defpackage.yp7
    public final Object a() {
        return new aaf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq7) && this.a == ((dq7) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
