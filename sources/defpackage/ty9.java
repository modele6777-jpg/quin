package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ty9 implements g00 {
    public final int a;
    public final int b;
    public final long c;
    public final ete d;
    public final ofa e;
    public final y58 f;
    public final int g;
    public final int h;
    public final cue i;

    public ty9(int i, int i2, long j, ete eteVar, ofa ofaVar, y58 y58Var, int i3, int i4, cue cueVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = eteVar;
        this.e = ofaVar;
        this.f = y58Var;
        this.g = i3;
        this.h = i4;
        this.i = cueVar;
        xue[] xueVarArr = wue.b;
        if (wue.a(j, wue.c)) {
            return;
        }
        if (wue.c(j) >= 0.0f) {
            return;
        }
        j37.c("lineHeight can't be negative (" + wue.c(j) + ")");
    }

    public final ty9 a(ty9 ty9Var) {
        return ty9Var == null ? this : uy9.a(this, ty9Var.a, ty9Var.b, ty9Var.c, ty9Var.d, ty9Var.e, ty9Var.f, ty9Var.g, ty9Var.h, ty9Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty9)) {
            return false;
        }
        ty9 ty9Var = (ty9) obj;
        return this.a == ty9Var.a && this.b == ty9Var.b && wue.a(this.c, ty9Var.c) && pa7.t(this.d, ty9Var.d) && pa7.t(this.e, ty9Var.e) && pa7.t(this.f, ty9Var.f) && this.g == ty9Var.g && this.h == ty9Var.h && pa7.t(this.i, ty9Var.i);
    }

    public final int hashCode() {
        int iB = ub3.b(this.b, Integer.hashCode(this.a) * 31, 31);
        xue[] xueVarArr = wue.b;
        int iB2 = ib8.b(iB, 31, this.c);
        ete eteVar = this.d;
        int iHashCode = (iB2 + (eteVar != null ? eteVar.hashCode() : 0)) * 31;
        ofa ofaVar = this.e;
        int iHashCode2 = (iHashCode + (ofaVar != null ? ofaVar.hashCode() : 0)) * 31;
        y58 y58Var = this.f;
        int iB3 = ub3.b(this.h, ub3.b(this.g, (iHashCode2 + (y58Var != null ? y58Var.hashCode() : 0)) * 31, 31), 31);
        cue cueVar = this.i;
        return iB3 + (cueVar != null ? cueVar.hashCode() : 0);
    }

    public final String toString() {
        String strA = jme.a(this.a);
        String strA2 = pne.a(this.b);
        String strE = wue.e(this.c);
        String strA3 = q58.a(this.g);
        String strA4 = ft6.a(this.h);
        StringBuilder sbO = ib8.o("ParagraphStyle(textAlign=", strA, ", textDirection=", strA2, ", lineHeight=");
        sbO.append(strE);
        sbO.append(", textIndent=");
        sbO.append(this.d);
        sbO.append(", platformStyle=");
        sbO.append(this.e);
        sbO.append(", lineHeightStyle=");
        sbO.append(this.f);
        sbO.append(", lineBreak=");
        ub3.v(sbO, strA3, ", hyphens=", strA4, ", textMotion=");
        sbO.append(this.i);
        sbO.append(")");
        return sbO.toString();
    }

    public ty9(int i, ete eteVar, int i2) {
        this((i2 & 1) != 0 ? 0 : i, 0, wue.c, (i2 & 8) != 0 ? null : eteVar, null, null, 0, 0, null);
    }
}
