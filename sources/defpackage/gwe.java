package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gwe {
    public static final ThreadLocal a = new ThreadLocal();

    public static vz4 a() {
        ThreadLocal threadLocal = a;
        vz4 vz4Var = (vz4) threadLocal.get();
        if (vz4Var != null) {
            return vz4Var;
        }
        n01 n01Var = new n01(Thread.currentThread());
        threadLocal.set(n01Var);
        return n01Var;
    }
}
