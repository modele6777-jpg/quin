package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u5d {
    public static final pr4 a = new pr4(1, new gpc(26));

    public static final x4d a(s5d s5dVar, g5d g5dVar) {
        switch (g5dVar.ordinal()) {
            case 0:
                return s5dVar.h;
            case 1:
                return s5dVar.e;
            case 2:
                return s5dVar.g;
            case 3:
                return c(s5dVar.e);
            case 4:
                return s5dVar.a;
            case 5:
                return c(s5dVar.a);
            case 6:
                return a7c.a;
            case 7:
                return s5dVar.d;
            case 8:
                y6c y6cVar = s5dVar.d;
                zi4 zi4Var = b5d.i;
                return y6c.c(y6cVar, zi4Var, null, null, zi4Var, 6);
            case 9:
                return s5dVar.f;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                y6c y6cVar2 = s5dVar.d;
                zi4 zi4Var2 = b5d.i;
                return y6c.c(y6cVar2, null, zi4Var2, zi4Var2, null, 9);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return c(s5dVar.d);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return s5dVar.c;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return g21.f;
            case 14:
                return s5dVar.b;
            default:
                ap.c();
                return null;
        }
    }

    public static final x4d b(g5d g5dVar, l46 l46Var) {
        return a((s5d) l46Var.k(a), g5dVar);
    }

    public static y6c c(y6c y6cVar) {
        zi4 zi4Var = b5d.i;
        return y6c.c(y6cVar, null, null, zi4Var, zi4Var, 3);
    }
}
