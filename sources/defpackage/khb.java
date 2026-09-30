package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class khb {
    public final boolean a;
    public final boolean b;
    public final x16 c;
    public final x16 d;

    public khb(x16 x16Var, x16 x16Var2, boolean z, boolean z2) {
        x16Var.getClass();
        x16Var2.getClass();
        this.a = z;
        this.b = z2;
        this.c = x16Var;
        this.d = x16Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khb)) {
            return false;
        }
        khb khbVar = (khb) obj;
        return this.a == khbVar.a && this.b == khbVar.b && pa7.t(this.c, khbVar.c) && pa7.t(this.d, khbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = ib8.p("ReadingTextActions(enabled=", ", listenEnabled=", ", onListen=", this.a, this.b);
        sbP.append(this.c);
        sbP.append(", onShare=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
