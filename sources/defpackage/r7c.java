package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r7c {
    public float a = 0.0f;
    public boolean b = true;
    public an1 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7c)) {
            return false;
        }
        r7c r7cVar = (r7c) obj;
        return Float.compare(this.a, r7cVar.a) == 0 && this.b == r7cVar.b && pa7.t(this.c, r7cVar.c);
    }

    public final int hashCode() {
        int iD = ub3.d(Float.hashCode(this.a) * 31, 31, this.b);
        an1 an1Var = this.c;
        return (iD + (an1Var == null ? 0 : an1Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
