package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xkd {
    public static final xkd c = new xkd(-1, -1);
    public final int a;
    public final int b;

    static {
        new xkd(0, 0);
        pqf.D(0);
        pqf.D(1);
    }

    public xkd(int i, int i2) {
        pa7.A((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof xkd) {
            xkd xkdVar = (xkd) obj;
            if (this.a == xkdVar.a && this.b == xkdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
