package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pxf {
    public final int a;
    public final int b;
    public final wy6 c;
    public final String d;

    public pxf(int i, int i2, wy6 wy6Var, String str) {
        this.a = i;
        this.b = i2;
        this.c = wy6Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxf)) {
            return false;
        }
        pxf pxfVar = (pxf) obj;
        return this.a == pxfVar.a && this.b == pxfVar.b && this.c == pxfVar.c && this.d.equals(pxfVar.d);
    }

    public final int hashCode() {
        int iB = ub3.b(this.b, Integer.hashCode(this.a) * 31, 31);
        wy6 wy6Var = this.c;
        return this.d.hashCode() + ((iB + (wy6Var != null ? wy6Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewfinderSurfaceRequest(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", implementationMode=");
        sb.append(this.c);
        sb.append(", requestId=");
        return ub3.l(sb, this.d, ')');
    }
}
