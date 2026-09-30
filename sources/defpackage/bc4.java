package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bc4 {
    public abstract w57 a();

    public abstract w57 b();

    public final w57 c() {
        w57 w57VarB = b();
        return w57VarB == null ? a() : w57VarB;
    }
}
