package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v79 {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public v79(v79 v79Var) {
        this.a = 1;
        this.b = v79Var.b;
        this.c = v79Var.c;
        this.d = v79Var.d;
        this.e = v79Var.e;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.b = Math.max(f, this.b);
        this.c = Math.max(f2, this.c);
        this.d = Math.min(f3, this.d);
        this.e = Math.min(f4, this.e);
    }

    public boolean b() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public float c() {
        return this.b + this.d;
    }

    public float d() {
        return this.c + this.e;
    }

    public void e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.b += fIntBitsToFloat;
        this.c += fIntBitsToFloat2;
        this.d += fIntBitsToFloat;
        this.e += fIntBitsToFloat2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ks0.m(ib8.o("MutableRect(", k99.O(this.b), ", ", k99.O(this.c), ", "), k99.O(this.d), ", ", k99.O(this.e), ")");
            default:
                return "[" + this.b + " " + this.c + " " + this.d + " " + this.e + "]";
        }
    }

    public v79(float f, float f2, float f3, float f4) {
        this.a = 1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public v79() {
        this.a = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
    }
}
