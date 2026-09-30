package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t88 extends u88 {
    public final bb3 a = bb3.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t88.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((t88) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (t88.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
