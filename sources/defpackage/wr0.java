package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wr0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public wr0(vb9 vb9Var) {
        vb9Var.getClass();
        float f = vb9Var.c;
        float f2 = vb9Var.d;
        float f3 = vb9Var.b;
        int i = vb9Var.a;
        long j = vb9Var.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
