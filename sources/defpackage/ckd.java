package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ckd extends u57 {
    public volatile Object b;

    public ckd(yw0 yw0Var) {
        super(yw0Var);
    }

    @Override // defpackage.u57
    public final Object a(hbc hbcVar) {
        if (this.b == null) {
            return super.a(hbcVar);
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        qc0.p("Single instance created couldn't return value");
        return null;
    }

    @Override // defpackage.u57
    public final Object b(hbc hbcVar) {
        if (this.b == null) {
            synchronized (this) {
                if (!(this.b != null)) {
                    this.b = a(hbcVar);
                }
            }
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        qc0.p("Single instance created couldn't return value");
        return null;
    }
}
