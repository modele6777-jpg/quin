package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wuf extends gf6 {
    public static final vuf c = vuf.c;
    public final vuf a = vuf.e;
    public final mb5 b = mb5.c;

    @Override // defpackage.gf6
    public final mb5 a() {
        return this.b;
    }

    @Override // defpackage.gf6
    public final boolean b(ng1 ng1Var, hc2 hc2Var) {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return ng1Var.c();
        }
        if (iOrdinal == 3) {
            return ng1Var.y();
        }
        ap.c();
        return false;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.a.name() + ')';
    }
}
