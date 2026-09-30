package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q81 {
    public final rte a;

    public q81(rte rteVar) {
        this.a = rteVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q81)) {
            return false;
        }
        rte rteVar = this.a;
        k00 k00Var = rteVar.a;
        rte rteVar2 = ((q81) obj).a;
        return pa7.t(k00Var, rteVar2.a) && rteVar.b.d(rteVar2.b) && pa7.t(rteVar.c, rteVar2.c) && rteVar.d == rteVar2.d && rteVar.e == rteVar2.e && rteVar.f == rteVar2.f && pa7.t(rteVar.g, rteVar2.g) && rteVar.h == rteVar2.h && rteVar.i == rteVar2.i && kl2.b(rteVar.j, rteVar2.j);
    }

    public final int hashCode() {
        rte rteVar = this.a;
        int iHashCode = rteVar.a.hashCode() * 31;
        mue mueVar = rteVar.b;
        xtd xtdVar = mueVar.a;
        long j = xtdVar.b;
        xue[] xueVarArr = wue.b;
        int iHashCode2 = Long.hashCode(j) * 31;
        ar5 ar5Var = xtdVar.c;
        int i = (iHashCode2 + (ar5Var != null ? ar5Var.a : 0)) * 31;
        wq5 wq5Var = xtdVar.d;
        int iHashCode3 = (i + (wq5Var != null ? Integer.hashCode(wq5Var.a) : 0)) * 31;
        xq5 xq5Var = xtdVar.e;
        int iHashCode4 = (iHashCode3 + (xq5Var != null ? Integer.hashCode(xq5Var.a) : 0)) * 31;
        yp5 yp5Var = xtdVar.f;
        int iHashCode5 = (iHashCode4 + (yp5Var != null ? yp5Var.hashCode() : 0)) * 31;
        String str = xtdVar.g;
        int iB = ib8.b((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, xtdVar.h);
        ou0 ou0Var = xtdVar.i;
        int iHashCode6 = (iB + (ou0Var != null ? Float.hashCode(ou0Var.a) : 0)) * 31;
        cte cteVar = xtdVar.j;
        int iHashCode7 = (iHashCode6 + (cteVar != null ? cteVar.hashCode() : 0)) * 31;
        sd8 sd8Var = xtdVar.k;
        int iHashCode8 = (iHashCode7 + (sd8Var != null ? sd8Var.a.hashCode() : 0)) * 31;
        long j2 = xtdVar.l;
        int i2 = y72.l;
        int iB2 = ib8.b(iHashCode8, 31, j2);
        aga agaVar = xtdVar.o;
        int iHashCode9 = (mueVar.b.hashCode() + ((iB2 + (agaVar != null ? agaVar.hashCode() : 0)) * 31)) * 31;
        iga igaVar = mueVar.c;
        return Long.hashCode(rteVar.j) + ((rteVar.i.hashCode() + ((rteVar.h.hashCode() + ((rteVar.g.hashCode() + ub3.b(rteVar.f, ub3.d((tec.a((iHashCode9 + (igaVar != null ? igaVar.hashCode() : 0) + iHashCode) * 31, 31, rteVar.c) + rteVar.d) * 31, 31, rteVar.e), 31)) * 31)) * 31)) * 31);
    }
}
