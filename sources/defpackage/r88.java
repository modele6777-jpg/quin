package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r88 extends u88 {
    public final bb3 a;

    public r88(bb3 bb3Var) {
        this.a = bb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r88.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((r88) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (r88.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }

    public r88() {
        this(bb3.b);
    }
}
