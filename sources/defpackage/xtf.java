package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xtf implements iv7 {
    public final pqe a;
    public final int b;
    public final w2f c;
    public final x16 d;

    public xtf(pqe pqeVar, int i, w2f w2fVar, x16 x16Var) {
        this.a = pqeVar;
        this.b = i;
        this.c = w2fVar;
        this.d = x16Var;
    }

    @Override // defpackage.iv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        cea ceaVarV = tn8Var.v(kl2.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(ceaVarV.b, kl2.g(j));
        return zn8Var.n0(ceaVarV.a, iMin, qu4.a, new g01(this, ceaVarV, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xtf) {
            xtf xtfVar = (xtf) obj;
            if (this.a == xtfVar.a && this.b == xtfVar.b && this.c.equals(xtfVar.c) && pa7.t(this.d, xtfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ub3.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
