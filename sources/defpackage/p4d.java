package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp4d;", "Ls09;", "Lc01;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class p4d extends s09 {
    public final float a;
    public final x4d b;
    public final boolean c;
    public final long d;
    public final long e;

    public p4d(float f, x4d x4dVar, boolean z, long j, long j2) {
        this.a = f;
        this.b = x4dVar;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new c01(new ckb(21, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4d)) {
            return false;
        }
        p4d p4dVar = (p4d) obj;
        if (!yi4.b(this.a, p4dVar.a) || !pa7.t(this.b, p4dVar.b) || this.c != p4dVar.c) {
            return false;
        }
        long j = p4dVar.d;
        int i = y72.l;
        return faf.a(this.d, j) && faf.a(this.e, p4dVar.e);
    }

    public final int hashCode() {
        int iD = ub3.d((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31, this.c);
        int i = y72.l;
        return Long.hashCode(this.e) + ib8.b(iD, 31, this.d);
    }

    public final String toString() {
        String strC = yi4.c(this.a);
        String strH = y72.h(this.d);
        String strH2 = y72.h(this.e);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(strC);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", clip=");
        sb.append(this.c);
        sb.append(", ambientColor=");
        sb.append(strH);
        sb.append(", spotColor=");
        return ks0.l(sb, strH2, ")");
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        c01 c01Var = (c01) i09Var;
        ckb ckbVar = new ckb(21, this);
        c01Var.Z = ckbVar;
        rs0.Q(c01Var, ckbVar);
    }
}
