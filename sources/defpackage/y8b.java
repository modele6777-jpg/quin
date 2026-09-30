package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y8b {
    public final yp5 a;
    public final yp5 b;
    public final yp5 c;
    public final yp5 d;

    public y8b(yp5 yp5Var, yp5 yp5Var2, yp5 yp5Var3, yp5 yp5Var4) {
        yp5Var.getClass();
        yp5Var2.getClass();
        yp5Var3.getClass();
        yp5Var4.getClass();
        this.a = yp5Var;
        this.b = yp5Var2;
        this.c = yp5Var3;
        this.d = yp5Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8b)) {
            return false;
        }
        y8b y8bVar = (y8b) obj;
        return pa7.t(this.a, y8bVar.a) && pa7.t(this.b, y8bVar.b) && pa7.t(this.c, y8bVar.c) && pa7.t(this.d, y8bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "QuinTypographyScheme(featureFont=" + this.a + ", defaultFont=" + this.b + ", titleFont=" + this.c + ", eventSwei=" + this.d + ")";
    }
}
