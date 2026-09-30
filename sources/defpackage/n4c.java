package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n4c {
    public static final n4c i;
    public final xtd a;
    public final xtd b;
    public final xtd c;
    public final xtd d;
    public final xtd e;
    public final xtd f;
    public final xtd g;
    public final zte h;

    static {
        xtd xtdVar = null;
        i = new n4c(xtdVar, xtdVar, 255);
    }

    public /* synthetic */ n4c(xtd xtdVar, xtd xtdVar2, int i2) {
        this((i2 & 1) != 0 ? null : xtdVar, null, null, (i2 & 8) != 0 ? null : xtdVar2, null, null, null, null);
    }

    public final n4c a() {
        xtd xtdVar = this.a;
        if (xtdVar == null) {
            d4c d4cVar = d4c.d;
            xtdVar = d4c.e;
        }
        xtd xtdVar2 = this.b;
        if (xtdVar2 == null) {
            f4c f4cVar = f4c.d;
            xtdVar2 = f4c.e;
        }
        xtd xtdVar3 = this.c;
        if (xtdVar3 == null) {
            k4c k4cVar = k4c.d;
            xtdVar3 = k4c.e;
        }
        xtd xtdVar4 = this.d;
        if (xtdVar4 == null) {
            h4c h4cVar = h4c.d;
            xtdVar4 = h4c.e;
        }
        xtd xtdVar5 = this.e;
        if (xtdVar5 == null) {
            i4c i4cVar = i4c.d;
            xtdVar5 = i4c.e;
        }
        xtd xtdVar6 = this.f;
        if (xtdVar6 == null) {
            j4c j4cVar = j4c.d;
            xtdVar6 = j4c.e;
        }
        xtd xtdVar7 = this.g;
        if (xtdVar7 == null) {
            e4c e4cVar = e4c.d;
            xtdVar7 = e4c.e;
        }
        zte zteVar = this.h;
        if (zteVar == null) {
            zte zteVar2 = g4c.e;
            zteVar = g4c.e;
        }
        return new n4c(xtdVar, xtdVar2, xtdVar3, xtdVar4, xtdVar5, xtdVar6, xtdVar7, zteVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4c)) {
            return false;
        }
        n4c n4cVar = (n4c) obj;
        return pa7.t(this.a, n4cVar.a) && pa7.t(this.b, n4cVar.b) && pa7.t(this.c, n4cVar.c) && pa7.t(this.d, n4cVar.d) && pa7.t(this.e, n4cVar.e) && pa7.t(this.f, n4cVar.f) && pa7.t(this.g, n4cVar.g) && pa7.t(this.h, n4cVar.h);
    }

    public final int hashCode() {
        xtd xtdVar = this.a;
        int iHashCode = (xtdVar != null ? xtdVar.hashCode() : 0) * 31;
        xtd xtdVar2 = this.b;
        int iHashCode2 = (iHashCode + (xtdVar2 != null ? xtdVar2.hashCode() : 0)) * 31;
        xtd xtdVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (xtdVar3 != null ? xtdVar3.hashCode() : 0)) * 31;
        xtd xtdVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (xtdVar4 != null ? xtdVar4.hashCode() : 0)) * 31;
        xtd xtdVar5 = this.e;
        int iHashCode5 = (iHashCode4 + (xtdVar5 != null ? xtdVar5.hashCode() : 0)) * 31;
        xtd xtdVar6 = this.f;
        int iHashCode6 = (iHashCode5 + (xtdVar6 != null ? xtdVar6.hashCode() : 0)) * 31;
        xtd xtdVar7 = this.g;
        int iHashCode7 = (iHashCode6 + (xtdVar7 != null ? xtdVar7.hashCode() : 0)) * 31;
        zte zteVar = this.h;
        return iHashCode7 + (zteVar != null ? zteVar.hashCode() : 0);
    }

    public final String toString() {
        return "RichTextStringStyle(boldStyle=" + this.a + ", italicStyle=" + this.b + ", underlineStyle=" + this.c + ", strikethroughStyle=" + this.d + ", subscriptStyle=" + this.e + ", superscriptStyle=" + this.f + ", codeStyle=" + this.g + ", linkStyle=" + this.h + ")";
    }

    public n4c(xtd xtdVar, xtd xtdVar2, xtd xtdVar3, xtd xtdVar4, xtd xtdVar5, xtd xtdVar6, xtd xtdVar7, zte zteVar) {
        this.a = xtdVar;
        this.b = xtdVar2;
        this.c = xtdVar3;
        this.d = xtdVar4;
        this.e = xtdVar5;
        this.f = xtdVar6;
        this.g = xtdVar7;
        this.h = zteVar;
    }
}
