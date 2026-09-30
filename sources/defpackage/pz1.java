package defpackage;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pz1 {
    public final lr0 a;
    public final k1f b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public long[] n;
    public int[] o;

    public pz1(int i, lr0 lr0Var, k1f k1fVar, boolean z) {
        int i2 = lr0Var.d;
        this.a = lr0Var;
        this.f = z;
        int iA = lr0Var.a();
        boolean z2 = true;
        if (iA != 1 && iA != 2) {
            z2 = false;
        }
        pa7.A(z2);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) lr0Var.b) * 1000000;
        long j2 = lr0Var.c;
        String str = pqf.a;
        this.e = pqf.N(i2, j, j2, RoundingMode.DOWN);
        this.b = k1fVar;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.m = -1L;
        this.n = new long[512];
        this.o = new int[512];
        this.g = i2;
    }

    public final zsc a(int i) {
        return new zsc((this.e / ((long) this.g)) * ((long) this.o[i]), this.n[i]);
    }

    public final wsc b(long j) {
        if (this.l == 0) {
            zsc zscVar = new zsc(0L, this.m);
            return new wsc(zscVar, zscVar);
        }
        int i = (int) (j / (this.e / ((long) this.g)));
        int iC = pqf.c(this.o, i, true, true);
        if (this.o[iC] == i) {
            zsc zscVarA = a(iC);
            return new wsc(zscVarA, zscVarA);
        }
        zsc zscVarA2 = a(iC);
        int i2 = iC + 1;
        return i2 < this.n.length ? new wsc(zscVarA2, a(i2)) : new wsc(zscVarA2, zscVarA2);
    }
}
