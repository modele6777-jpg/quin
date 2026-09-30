package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zxb {
    public final int a;
    public final ar5 b;
    public final int c;
    public final zq5 d;

    public zxb(int i, ar5 ar5Var, int i2, zq5 zq5Var) {
        this.a = i;
        this.b = ar5Var;
        this.c = i2;
        this.d = zq5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxb)) {
            return false;
        }
        zxb zxbVar = (zxb) obj;
        return this.a == zxbVar.a && pa7.t(this.b, zxbVar.b) && this.c == zxbVar.c && this.d.equals(zxbVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ub3.b(0, ub3.b(this.c, ((this.a * 31) + this.b.a) * 31, 31), 31);
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        StringBuilder sb = new StringBuilder("ResourceFont(resId=");
        sb.append(this.a);
        sb.append(", weight=");
        sb.append(this.b);
        sb.append(", style=");
        return ks0.l(sb, str, ", loadingStrategy=Blocking)");
    }
}
