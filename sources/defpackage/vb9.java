package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vb9 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public vb9(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vb9.class == obj.getClass()) {
            vb9 vb9Var = (vb9) obj;
            return this.c == vb9Var.c && this.d == vb9Var.d && this.b == vb9Var.b && this.a == vb9Var.a && this.e == vb9Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ub3.b(this.a, ub3.a(this.b, ub3.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
