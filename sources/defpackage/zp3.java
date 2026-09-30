package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zp3 implements aq3 {
    public final String a;
    public final k11 b;
    public final za2 c;

    public zp3(String str, k11 k11Var, za2 za2Var) {
        this.a = str;
        this.b = k11Var;
        this.c = za2Var;
    }

    @Override // defpackage.aq3
    public final ya2 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zp3) {
            zp3 zp3Var = (zp3) obj;
            return this.a.equals(zp3Var.a) && this.b == zp3Var.b && this.c == zp3Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TerminalTransform(existingId=" + this.a + ", transform=" + this.b + ", completion=" + this.c + ")";
    }
}
