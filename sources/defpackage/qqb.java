package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qqb {
    public final float a;
    public final float b;
    public final float c;
    public final long d;
    public final long e;
    public final List f;
    public final float g;
    public final b41 h;
    public final ci6 i;
    public final int j;

    public qqb(float f, float f2, float f3, long j, long j2, List list, float f4, b41 b41Var, ci6 ci6Var, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = f4;
        this.h = b41Var;
        this.i = ci6Var;
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqb)) {
            return false;
        }
        qqb qqbVar = (qqb) obj;
        return yi4.b(this.a, qqbVar.a) && Float.compare(this.b, qqbVar.b) == 0 && Float.compare(this.c, qqbVar.c) == 0 && ald.a(this.d, qqbVar.d) && hl9.c(this.e, qqbVar.e) && this.f.equals(qqbVar.f) && Float.compare(this.g, qqbVar.g) == 0 && pa7.t(this.h, qqbVar.h) && pa7.t(this.i, qqbVar.i) && this.j == qqbVar.j;
    }

    public final int hashCode() {
        int iA = ub3.a(this.g, tec.a(ib8.b(ib8.b(ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31);
        b41 b41Var = this.h;
        int iHashCode = (iA + (b41Var == null ? 0 : b41Var.hashCode())) * 31;
        ci6 ci6Var = this.i;
        return Integer.hashCode(this.j) + ((iHashCode + (ci6Var != null ? ci6Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strC = yi4.c(this.a);
        String strG = ald.g(this.d);
        String strI = hl9.i(this.e);
        String strQ = y8c.q(this.j);
        StringBuilder sb = new StringBuilder("RenderEffectParams(blurRadius=");
        sb.append(strC);
        sb.append(", noiseFactor=");
        sb.append(this.b);
        sb.append(", scale=");
        sb.append(this.c);
        sb.append(", contentSize=");
        sb.append(strG);
        sb.append(", contentOffset=");
        ib8.v(sb, strI, ", tints=", this.f, ", tintAlphaModulate=");
        sb.append(this.g);
        sb.append(", mask=");
        sb.append(this.h);
        sb.append(", progressive=");
        sb.append(this.i);
        sb.append(", blurTileMode=");
        sb.append(strQ);
        sb.append(")");
        return sb.toString();
    }
}
