package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q68 implements wtd {
    public final s68 a;
    public final int b;
    public final int c;

    public q68(s68 s68Var, int i, int i2) {
        this.a = s68Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.wtd
    public final int getBeginIndex() {
        return this.b;
    }

    @Override // defpackage.wtd
    public final int getEndIndex() {
        return this.c;
    }

    public final String toString() {
        return tec.g(this.c, "}", ks0.p("Link{type=", String.valueOf(this.a), ", beginIndex=", this.b, ", endIndex="));
    }
}
