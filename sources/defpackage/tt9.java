package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tt9 {
    public final Object a;

    public /* synthetic */ tt9(Object obj) {
        this.a = obj;
    }

    public static final boolean a(Object obj) {
        return ((obj instanceof vt9) || obj == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tt9) {
            return pa7.t(this.a, ((tt9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "OutputResult(result=" + this.a + ')';
    }
}
