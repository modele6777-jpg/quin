package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface k1f {
    void a(long j, int i, int i2, int i3, j1f j1fVar);

    void b(d0a d0aVar, int i, int i2);

    default int c(sb3 sb3Var, int i, boolean z) {
        return f(sb3Var, i, z);
    }

    default void e(int i, d0a d0aVar) {
        b(d0aVar, i, 0);
    }

    int f(sb3 sb3Var, int i, boolean z);

    void g(rr5 rr5Var);

    default void d(long j) {
    }
}
