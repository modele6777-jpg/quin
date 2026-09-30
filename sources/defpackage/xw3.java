package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xw3 {
    public final y3b a;
    public final int b;
    public final int c;

    public xw3(y3b y3bVar, int i, int i2) {
        tm7.q(y3bVar, "Null dependency anInterface.");
        this.a = y3bVar;
        this.b = i;
        this.c = i2;
    }

    public static xw3 a(Class cls) {
        return new xw3(0, 1, cls);
    }

    public static xw3 b(y3b y3bVar) {
        return new xw3(y3bVar, 1, 0);
    }

    public static xw3 c(Class cls) {
        return new xw3(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xw3)) {
            return false;
        }
        xw3 xw3Var = (xw3) obj;
        return this.a.equals(xw3Var.a) && this.b == xw3Var.b && this.c == xw3Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                qc0.i(tec.e(i2, "Unsupported injection: "));
                return null;
            }
            str2 = "deferred";
        }
        return ks0.l(sb, str2, "}");
    }

    public xw3(int i, int i2, Class cls) {
        this(y3b.a(cls), i, i2);
    }
}
