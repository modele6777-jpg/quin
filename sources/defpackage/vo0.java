package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vo0 {
    public final Object a;
    public final lua b;
    public final yp0 c;

    public vo0(Object obj, lua luaVar, yp0 yp0Var) {
        if (obj == null) {
            r82.g("Null payload");
            throw null;
        }
        this.a = obj;
        this.b = luaVar;
        this.c = yp0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vo0)) {
            return false;
        }
        vo0 vo0Var = (vo0) obj;
        if (!this.a.equals(vo0Var.a) || !this.b.equals(vo0Var.b)) {
            return false;
        }
        yp0 yp0Var = vo0Var.c;
        yp0 yp0Var2 = this.c;
        if (yp0Var2 == null) {
            return yp0Var == null;
        }
        return yp0Var2.equals(yp0Var);
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        yp0 yp0Var = this.c;
        return ((yp0Var == null ? 0 : yp0Var.hashCode()) ^ iHashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
