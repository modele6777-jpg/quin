package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wf0 extends df0 {
    public final int l;
    public final char m;

    public wf0(int i, char c) {
        this.l = i;
        this.m = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf0)) {
            return false;
        }
        wf0 wf0Var = (wf0) obj;
        return this.l == wf0Var.l && this.m == wf0Var.m;
    }

    public final int hashCode() {
        return Character.hashCode(this.m) + (Integer.hashCode(this.l) * 31);
    }

    public final String toString() {
        return "AstOrderedList(startNumber=" + this.l + ", delimiter=" + this.m + ")";
    }
}
