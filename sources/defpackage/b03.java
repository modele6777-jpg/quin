package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b03 extends an1 {
    public final kx0 Q0;

    public b03(kx0 kx0Var) {
        this.Q0 = kx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b03) && pa7.t(this.Q0, ((b03) obj).Q0);
    }

    public final int hashCode() {
        return this.Q0.hashCode();
    }

    @Override // defpackage.an1
    public final int j(int i, int i2, cv7 cv7Var) {
        return this.Q0.a(i2, i);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.Q0 + ")";
    }
}
