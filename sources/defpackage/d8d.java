package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d8d {
    public static final pr4 a = new pr4(1, new gpc(28));

    public static j09 a(int i, l26 l26Var, j09 j09Var, Object obj, String str, boolean z, boolean z2, boolean z3) {
        j09Var.getClass();
        l26Var.getClass();
        return m93.u(j09Var, new z7d(str, obj, z, z2, i, z3, l26Var, null));
    }

    public static final long b(double d, int i) {
        if (i <= 0 || Math.abs(d) > Double.MAX_VALUE || d <= 0.0d) {
            qc0.j("Failed requirement.");
            return 0L;
        }
        double dCeil = Math.ceil((d * 2352.0d) / ((double) i));
        if (dCeil <= 2.147483647E9d) {
            return (((long) ((int) dCeil)) & 4294967295L) | 10101763080192L;
        }
        qc0.j("Share document is too tall to encode");
        return 0L;
    }
}
