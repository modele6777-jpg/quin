package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b62 implements c62 {
    public final float a;
    public final float b;

    public b62(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // defpackage.c62
    public final Comparable c() {
        return Float.valueOf(this.a);
    }

    @Override // defpackage.c62
    public final Comparable d() {
        return Float.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b62)) {
            return false;
        }
        if (isEmpty() && ((b62) obj).isEmpty()) {
            return true;
        }
        b62 b62Var = (b62) obj;
        return this.a == b62Var.a && this.b == b62Var.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.c62
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
