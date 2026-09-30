package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1e {
    public long a;
    public f1e b;

    public f1e(long j) {
        this.a = j;
    }

    public abstract void a(f1e f1eVar);

    public abstract f1e b();

    public f1e c(long j) {
        f1e f1eVarB = b();
        f1eVarB.a = j;
        return f1eVarB;
    }
}
