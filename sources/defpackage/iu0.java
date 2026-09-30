package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iu0 implements ltb {
    public final dg7 a;

    public /* synthetic */ iu0(dg7 dg7Var) {
        this.a = dg7Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iu0) {
            return this.a.equals(((iu0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.a + ")";
    }
}
