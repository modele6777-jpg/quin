package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v7c implements u7c {
    public static final v7c a = new v7c();

    @Override // defpackage.u7c
    public final j09 a(j09 j09Var, float f, boolean z) {
        if (f <= 0.0d) {
            g37.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return j09Var.D(new jw7(f, z));
    }
}
