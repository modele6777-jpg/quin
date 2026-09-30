package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class st3 extends yt3 implements Comparable {
    public final int e;
    public final int f;

    public st3(int i, h1f h1fVar, int i2, vt3 vt3Var, int i3) {
        int i4;
        super(i, h1fVar, i2);
        this.e = hu0.n(i3, vt3Var.C) ? 1 : 0;
        rr5 rr5Var = this.d;
        int i5 = rr5Var.w;
        int i6 = -1;
        if (i5 != -1 && (i4 = rr5Var.x) != -1) {
            i6 = i5 * i4;
        }
        this.f = i6;
    }

    @Override // defpackage.yt3
    public final int a() {
        return this.e;
    }

    @Override // defpackage.yt3
    public final boolean b(yt3 yt3Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((st3) obj).f);
    }
}
