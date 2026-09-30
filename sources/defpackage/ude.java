package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ude {
    public static final ude e = new ude(null, null, null, null);
    public final mue a;
    public final wue b;
    public final y72 c;
    public final Float d;

    public ude(mue mueVar, wue wueVar, y72 y72Var, Float f) {
        this.a = mueVar;
        this.b = wueVar;
        this.c = y72Var;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ude)) {
            return false;
        }
        ude udeVar = (ude) obj;
        return pa7.t(this.a, udeVar.a) && pa7.t(this.b, udeVar.b) && pa7.t(this.c, udeVar.c) && pa7.t(this.d, udeVar.d);
    }

    public final int hashCode() {
        mue mueVar = this.a;
        int iHashCode = (mueVar == null ? 0 : mueVar.hashCode()) * 31;
        wue wueVar = this.b;
        int iHashCode2 = (iHashCode + (wueVar == null ? 0 : Long.hashCode(wueVar.a))) * 31;
        y72 y72Var = this.c;
        int iHashCode3 = (iHashCode2 + (y72Var == null ? 0 : Long.hashCode(y72Var.a))) * 31;
        Float f = this.d;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "TableStyle(headerTextStyle=" + this.a + ", cellPadding=" + this.b + ", borderColor=" + this.c + ", borderStrokeWidth=" + this.d + ")";
    }
}
