package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qq3 {
    public static final ov3 a;

    static {
        String property;
        wg6 wg6Var;
        ov3 ov3Var;
        int i = sce.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            js3 js3Var = ga4.a;
            wg6Var = mk8.a;
            wg6 wg6Var2 = wg6Var.f;
            if (wg6Var == null) {
                ov3Var = wg6Var;
                ov3Var = pq3.y;
            }
        } else {
            ov3Var = pq3.y;
        }
        ov3Var = wg6Var;
        a = ov3Var;
    }
}
