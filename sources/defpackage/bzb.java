package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bzb extends pt0 {
    public bzb(xn2 xn2Var) {
        super(xn2Var);
        if (xn2Var == null || xn2Var.getContext() == nu4.a) {
            return;
        }
        qc0.j("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.xn2
    public final pv2 getContext() {
        return nu4.a;
    }
}
