package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x36 extends b2 implements Runnable {
    public m88 v;

    @Override // defpackage.f2
    public final void d() {
        this.v = null;
    }

    @Override // defpackage.f2
    public final String k() {
        m88 m88Var = this.v;
        if (m88Var == null) {
            return null;
        }
        return "delegate=[" + m88Var + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        m88 m88Var = this.v;
        if (m88Var != null) {
            o(m88Var);
        }
    }
}
