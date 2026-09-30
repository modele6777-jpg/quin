package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u07 {
    public final int a;
    public final lu3 b;
    public final yf1 c;

    public u07(int i, lu3 lu3Var, yf1 yf1Var) {
        lu3Var.getClass();
        yf1Var.getClass();
        this.a = i;
        this.b = lu3Var;
        this.c = yf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u07)) {
            return false;
        }
        u07 u07Var = (u07) obj;
        return this.a == u07Var.a && pa7.t(this.b, u07Var.b) && pa7.t(this.c, u07Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredOutput(streamId=" + ((Object) e3e.a(this.a)) + ", deferrableSurface=" + this.b + ", graph=" + this.c + ')';
    }
}
