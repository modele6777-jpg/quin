package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i9f {
    public final yp5 a;
    public final ar5 b;
    public final int c;
    public final int d;
    public final Object e;

    public i9f(yp5 yp5Var, ar5 ar5Var, int i, int i2, Object obj) {
        this.a = yp5Var;
        this.b = ar5Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9f)) {
            return false;
        }
        i9f i9fVar = (i9f) obj;
        return pa7.t(this.a, i9fVar.a) && pa7.t(this.b, i9fVar.b) && this.c == i9fVar.c && this.d == i9fVar.d && pa7.t(this.e, i9fVar.e);
    }

    public final int hashCode() {
        yp5 yp5Var = this.a;
        int iB = ub3.b(this.d, ub3.b(this.c, (((yp5Var == null ? 0 : yp5Var.hashCode()) * 31) + this.b.a) * 31, 31), 31);
        Object obj = this.e;
        return iB + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        ub3.v(sb, str, ", fontSynthesis=", str2, ", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
