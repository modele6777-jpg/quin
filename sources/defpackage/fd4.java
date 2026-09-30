package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fd4 implements ed4 {
    public final gd4 a;
    public final String b;

    public fd4(gd4 gd4Var, String str) {
        this.a = gd4Var;
        this.b = str;
    }

    public static fd4 b(fd4 fd4Var, gd4 gd4Var, String str, int i) {
        if ((i & 1) != 0) {
            gd4Var = fd4Var.a;
        }
        if ((i & 2) != 0) {
            str = fd4Var.b;
        }
        fd4Var.getClass();
        return new fd4(gd4Var, str);
    }

    @Override // defpackage.ed4
    public final String a() {
        return this.a.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd4)) {
            return false;
        }
        fd4 fd4Var = (fd4) obj;
        return this.a.equals(fd4Var.a) && pa7.t(this.b, fd4Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "WaitAdditionalInfo(prev=" + this.a + ", additionalInfo=" + this.b + ")";
    }
}
