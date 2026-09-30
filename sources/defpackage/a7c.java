package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a7c {
    public static final y6c a = a();

    public static final y6c a() {
        g8a g8aVar = new g8a(50.0f);
        return new y6c(g8aVar, g8aVar, g8aVar, g8aVar);
    }

    public static final y6c b(float f) {
        zi4 zi4Var = new zi4(f);
        return new y6c(zi4Var, zi4Var, zi4Var, zi4Var);
    }

    public static final y6c c(float f, float f2, float f3, float f4) {
        return new y6c(new zi4(f), new zi4(f2), new zi4(f3), new zi4(f4));
    }

    public static y6c d(float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        float f4 = (i & 4) != 0 ? 0.0f : 24.0f;
        if ((i & 8) != 0) {
            f3 = 0.0f;
        }
        return c(f, f2, f4, f3);
    }
}
