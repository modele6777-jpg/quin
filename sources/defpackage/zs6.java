package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zs6 extends at6 {
    public final x91 d;
    public final boolean e;

    public zs6(otb otbVar, hm9 hm9Var, cu2 cu2Var, x91 x91Var, boolean z) {
        super(otbVar, hm9Var, cu2Var);
        this.d = x91Var;
        this.e = z;
    }

    @Override // defpackage.at6
    public final Object a(fm9 fm9Var, Object[] objArr) {
        u91 u91Var = (u91) this.d.l(fm9Var);
        xn2 xn2Var = (xn2) objArr[objArr.length - 1];
        try {
            try {
                if (!this.e) {
                    return y7h.l(u91Var, xn2Var);
                }
                try {
                    u91Var.getClass();
                    return y7h.m(u91Var, xn2Var);
                } catch (LinkageError e) {
                    throw e;
                } catch (ThreadDeath e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                y7h.O(th, xn2Var);
                return bw2.a;
            }
        } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
            throw e3;
        }
    }
}
