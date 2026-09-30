package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sq6 implements iv7 {
    public final pqe a;
    public final int b;
    public final w2f c;
    public final x16 d;

    public sq6(pqe pqeVar, int i, w2f w2fVar, x16 x16Var) {
        this.a = pqeVar;
        this.b = i;
        this.c = w2fVar;
        this.d = x16Var;
    }

    @Override // defpackage.iv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        long j2;
        if (tn8Var.q(kl2.g(j)) < kl2.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = kl2.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        cea ceaVarV = tn8Var.v(j);
        int iMin = Math.min(ceaVarV.a, kl2.h(j2));
        return zn8Var.n0(iMin, ceaVarV.b, qu4.a, new kx3(iMin, this, zn8Var, ceaVarV, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sq6) {
            sq6 sq6Var = (sq6) obj;
            if (this.a == sq6Var.a && this.b == sq6Var.b && this.c.equals(sq6Var.c) && pa7.t(this.d, sq6Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ub3.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
