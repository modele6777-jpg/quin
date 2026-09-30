package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h88 {
    public static final h88 f = new h88(null, 31);
    public final wue a;
    public final wue b;
    public final wue c;
    public final a26 d;
    public final a26 e;

    public /* synthetic */ h88(a26 a26Var, int i) {
        this(null, null, null, (i & 8) != 0 ? null : a26Var, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h88)) {
            return false;
        }
        h88 h88Var = (h88) obj;
        return pa7.t(this.a, h88Var.a) && pa7.t(this.b, h88Var.b) && pa7.t(this.c, h88Var.c) && pa7.t(this.d, h88Var.d) && pa7.t(this.e, h88Var.e);
    }

    public final int hashCode() {
        wue wueVar = this.a;
        int iHashCode = (wueVar == null ? 0 : Long.hashCode(wueVar.a)) * 31;
        wue wueVar2 = this.b;
        int iHashCode2 = (iHashCode + (wueVar2 == null ? 0 : Long.hashCode(wueVar2.a))) * 31;
        wue wueVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (wueVar3 == null ? 0 : Long.hashCode(wueVar3.a))) * 31;
        a26 a26Var = this.d;
        int iHashCode4 = (iHashCode3 + (a26Var == null ? 0 : a26Var.hashCode())) * 31;
        a26 a26Var2 = this.e;
        return iHashCode4 + (a26Var2 != null ? a26Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ListStyle(markerIndent=" + this.a + ", contentsIndent=" + this.b + ", itemSpacing=" + this.c + ", orderedMarkers=" + this.d + ", unorderedMarkers=" + this.e + ")";
    }

    public h88(wue wueVar, wue wueVar2, wue wueVar3, a26 a26Var, a26 a26Var2) {
        this.a = wueVar;
        this.b = wueVar2;
        this.c = wueVar3;
        this.d = a26Var;
        this.e = a26Var2;
    }
}
