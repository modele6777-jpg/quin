package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x87 extends ru6 {
    public final String b;
    public final String c;
    public final String d;

    public x87(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x87.class != obj.getClass()) {
            return false;
        }
        x87 x87Var = (x87) obj;
        return this.c.equals(x87Var.c) && this.b.equals(x87Var.b) && this.d.equals(x87Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.c(ub3.c(527, 31, this.b), 31, this.c);
    }

    @Override // defpackage.ru6
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
