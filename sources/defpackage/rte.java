package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rte {
    public final k00 a;
    public final mue b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final sw3 g;
    public final cv7 h;
    public final xp5 i;
    public final long j;

    public rte(k00 k00Var, mue mueVar, List list, int i, boolean z, int i2, sw3 sw3Var, cv7 cv7Var, xp5 xp5Var, long j) {
        this.a = k00Var;
        this.b = mueVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = sw3Var;
        this.h = cv7Var;
        this.i = xp5Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rte)) {
            return false;
        }
        rte rteVar = (rte) obj;
        return pa7.t(this.a, rteVar.a) && pa7.t(this.b, rteVar.b) && pa7.t(this.c, rteVar.c) && this.d == rteVar.d && this.e == rteVar.e && this.f == rteVar.f && pa7.t(this.g, rteVar.g) && this.h == rteVar.h && pa7.t(this.i, rteVar.i) && kl2.b(this.j, rteVar.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ub3.b(this.f, ub3.d((tec.a(tec.b(this.b, this.a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + jzb.s(this.f) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + kl2.l(this.j) + ")";
    }
}
