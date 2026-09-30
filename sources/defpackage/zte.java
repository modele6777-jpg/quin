package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zte {
    public final xtd a;
    public final xtd b;
    public final xtd c;
    public final xtd d;

    public zte(xtd xtdVar, xtd xtdVar2, xtd xtdVar3, xtd xtdVar4) {
        this.a = xtdVar;
        this.b = xtdVar2;
        this.c = xtdVar3;
        this.d = xtdVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zte)) {
            return false;
        }
        zte zteVar = (zte) obj;
        return pa7.t(this.a, zteVar.a) && pa7.t(this.b, zteVar.b) && pa7.t(this.c, zteVar.c) && pa7.t(this.d, zteVar.d);
    }

    public final int hashCode() {
        xtd xtdVar = this.a;
        int iHashCode = (xtdVar != null ? xtdVar.hashCode() : 0) * 31;
        xtd xtdVar2 = this.b;
        int iHashCode2 = (iHashCode + (xtdVar2 != null ? xtdVar2.hashCode() : 0)) * 31;
        xtd xtdVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (xtdVar3 != null ? xtdVar3.hashCode() : 0)) * 31;
        xtd xtdVar4 = this.d;
        return iHashCode3 + (xtdVar4 != null ? xtdVar4.hashCode() : 0);
    }

    public /* synthetic */ zte(xtd xtdVar, xtd xtdVar2, int i) {
        this(xtdVar, null, (i & 4) != 0 ? null : xtdVar2, null);
    }
}
