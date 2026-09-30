package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t62 {
    public static final t62 e = new t62(null, null, null, null);
    public final mue a;
    public final j09 b;
    public final wue c;
    public final Boolean d;

    public t62(mue mueVar, j09 j09Var, wue wueVar, Boolean bool) {
        this.a = mueVar;
        this.b = j09Var;
        this.c = wueVar;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t62)) {
            return false;
        }
        t62 t62Var = (t62) obj;
        return pa7.t(this.a, t62Var.a) && pa7.t(this.b, t62Var.b) && pa7.t(this.c, t62Var.c) && pa7.t(this.d, t62Var.d);
    }

    public final int hashCode() {
        mue mueVar = this.a;
        int iHashCode = (mueVar == null ? 0 : mueVar.hashCode()) * 31;
        j09 j09Var = this.b;
        int iHashCode2 = (iHashCode + (j09Var == null ? 0 : j09Var.hashCode())) * 31;
        wue wueVar = this.c;
        int iHashCode3 = (iHashCode2 + (wueVar == null ? 0 : Long.hashCode(wueVar.a))) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CodeBlockStyle(textStyle=" + this.a + ", modifier=" + this.b + ", padding=" + this.c + ", wordWrap=" + this.d + ")";
    }
}
