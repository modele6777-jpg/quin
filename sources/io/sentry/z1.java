package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z1 implements b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2 b;

    public /* synthetic */ z1(h2 h2Var, j2 j2Var) {
        this.a = 1;
        this.b = j2Var;
    }

    @Override // io.sentry.b2
    public final Object a() {
        int i = this.a;
        j2 j2Var = this.b;
        switch (i) {
            case 0:
                return j2Var.nextString();
            case 1:
                double dNextDouble = j2Var.nextDouble();
                int i2 = (int) dNextDouble;
                return ((double) i2) == dNextDouble ? Integer.valueOf(i2) : Double.valueOf(dNextDouble);
            default:
                return Boolean.valueOf(j2Var.l());
        }
    }

    public /* synthetic */ z1(j2 j2Var, int i) {
        this.a = i;
        this.b = j2Var;
    }
}
