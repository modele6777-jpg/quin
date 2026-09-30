package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b0f implements lla {
    public final int a;

    public b0f(int i) {
        this.a = i;
    }

    @Override // defpackage.lla
    public final long x(a77 a77Var, long j, cv7 cv7Var, long j2) {
        int i = (int) (j2 >> 32);
        int iD = ((a77Var.d() - i) / 2) + a77Var.a;
        if (iD < 0) {
            iD = a77Var.a;
        } else if (iD + i > ((int) (j >> 32))) {
            iD = a77Var.c - i;
        }
        int i2 = a77Var.b - ((int) (j2 & 4294967295L));
        int i3 = this.a;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = a77Var.d + i3;
        }
        return (((long) iD) << 32) | (((long) i4) & 4294967295L);
    }
}
