package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cbf extends sv2 {
    public static final cbf c = new cbf();

    @Override // defpackage.sv2
    public final void Z0(pv2 pv2Var, Runnable runnable) {
        ldg ldgVar = (ldg) pv2Var.F0(ldg.c);
        if (ldgVar != null) {
            ldgVar.b = true;
        } else {
            s8f.i("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.sv2
    public final sv2 c1(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.sv2
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
