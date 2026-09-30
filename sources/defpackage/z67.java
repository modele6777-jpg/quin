package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z67 extends x67 implements c62 {
    public static final z67 d = new z67(1, 0, 1);

    @Override // defpackage.c62
    public final Comparable c() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.c62
    public final Comparable d() {
        return Integer.valueOf(this.b);
    }

    public final boolean e(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // defpackage.x67
    public final boolean equals(Object obj) {
        if (!(obj instanceof z67)) {
            return false;
        }
        if (isEmpty() && ((z67) obj).isEmpty()) {
            return true;
        }
        z67 z67Var = (z67) obj;
        return this.a == z67Var.a && this.b == z67Var.b;
    }

    @Override // defpackage.x67
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.x67, defpackage.c62
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.x67
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
