package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m0b {
    public final u99 a;
    public final bu3 b;
    public final ntd c;

    public m0b(u99 u99Var, bu3 bu3Var, ntd ntdVar) {
        this.a = u99Var;
        this.b = bu3Var;
        this.c = ntdVar;
    }

    public abstract dx5 a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
