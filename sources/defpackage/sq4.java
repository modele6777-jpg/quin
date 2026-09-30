package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sq4 {
    public final int a;
    public final long b;
    public final int c;
    public final int d;
    public final Object e;

    public sq4(int i, bn5 bn5Var, long j, int i2, int i3) {
        this.a = i;
        this.e = bn5Var;
        this.b = j;
        this.c = i2;
        this.d = i3;
    }

    public bm8 a(ym5 ym5Var, boolean z, int i, int i2, int i3, int i4) {
        if (!ym5Var.b) {
            return null;
        }
        ((bn5) this.e).getClass();
        return null;
    }

    public ym5 b(boolean z, int i, long j, o67 o67Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        bn5 bn5Var = (bn5) this.e;
        int i5 = i3 + i4;
        if (o67Var == null) {
            return new ym5(true, true);
        }
        long j2 = o67Var.a;
        bn5Var.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new ym5(true, true);
        }
        if (i != 0 && (i >= this.a || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new ym5(true, true) : new ym5(true, b(z, 0, o67.a(kl2.h(this.b), (((int) (j & 4294967295L)) - this.d) - i4), new o67(o67.a(((int) (j2 >> 32)) - this.c, (int) (4294967295L & j2))), i2 + 1, i5, 0, true, false).b);
        }
        Math.max(i4, (int) (j2 & 4294967295L));
        return new ym5(false, false);
    }

    public sq4(int i, int i2, int i3, long j, String str) {
        this.e = str;
        this.c = i;
        this.a = i2;
        this.d = i3;
        this.b = j;
    }
}
