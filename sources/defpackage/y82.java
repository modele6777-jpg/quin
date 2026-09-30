package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y82 {
    public final vz9 a;
    public final vz9 b;
    public final vz9 c;
    public final vz9 d;
    public final vz9 e;
    public final vz9 f;
    public final vz9 g;
    public final vz9 h;
    public final vz9 i;
    public final vz9 j;
    public final vz9 k;
    public final vz9 l;
    public final vz9 m;

    public y82(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        y72 y72Var = new y72(j);
        i8c i8cVar = i8c.f;
        this.a = new vz9(y72Var, i8cVar);
        this.b = new vz9(new y72(j2), i8cVar);
        this.c = new vz9(new y72(j3), i8cVar);
        this.d = new vz9(new y72(j4), i8cVar);
        this.e = new vz9(new y72(j5), i8cVar);
        this.f = new vz9(new y72(j6), i8cVar);
        this.g = new vz9(new y72(j7), i8cVar);
        this.h = new vz9(new y72(j8), i8cVar);
        this.i = new vz9(new y72(j9), i8cVar);
        this.j = new vz9(new y72(j10), i8cVar);
        this.k = new vz9(new y72(j11), i8cVar);
        this.l = new vz9(new y72(j12), i8cVar);
        this.m = new vz9(Boolean.TRUE, i8cVar);
    }

    public final String toString() {
        String strH = y72.h(((y72) this.a.getValue()).a);
        String strH2 = y72.h(((y72) this.b.getValue()).a);
        String strH3 = y72.h(((y72) this.c.getValue()).a);
        String strH4 = y72.h(((y72) this.d.getValue()).a);
        String strH5 = y72.h(((y72) this.e.getValue()).a);
        String strH6 = y72.h(((y72) this.f.getValue()).a);
        String strH7 = y72.h(((y72) this.g.getValue()).a);
        String strH8 = y72.h(((y72) this.h.getValue()).a);
        String strH9 = y72.h(((y72) this.i.getValue()).a);
        String strH10 = y72.h(((y72) this.j.getValue()).a);
        String strH11 = y72.h(((y72) this.k.getValue()).a);
        String strH12 = y72.h(((y72) this.l.getValue()).a);
        boolean zBooleanValue = ((Boolean) this.m.getValue()).booleanValue();
        StringBuilder sbO = ib8.o("Colors(primary=", strH, ", primaryVariant=", strH2, ", secondary=");
        ub3.v(sbO, strH3, ", secondaryVariant=", strH4, ", background=");
        ub3.v(sbO, strH5, ", surface=", strH6, ", error=");
        ub3.v(sbO, strH7, ", onPrimary=", strH8, ", onSecondary=");
        ub3.v(sbO, strH9, ", onBackground=", strH10, ", onSurface=");
        ub3.v(sbO, strH11, ", onError=", strH12, ", isLight=");
        return ub3.m(sbO, zBooleanValue, ")");
    }
}
