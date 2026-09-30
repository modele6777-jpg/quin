package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class da7 {
    public final int a;
    public final int b;
    public final az7 c;

    public da7(int i, int i2, az7 az7Var) {
        this.a = i;
        this.b = i2;
        this.c = az7Var;
        if (i < 0) {
            l37.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        l37.a("size should be > 0");
    }
}
