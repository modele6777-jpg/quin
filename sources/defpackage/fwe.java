package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fwe implements nv2 {
    public final Object a;
    public final ThreadLocal b;
    public final hwe c;

    public fwe(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new hwe(threadLocal);
    }

    @Override // defpackage.pv2
    public final nv2 F0(ov2 ov2Var) {
        if (this.c.equals(ov2Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.pv2
    public final pv2 U(ov2 ov2Var) {
        return this.c.equals(ov2Var) ? nu4.a : this;
    }

    @Override // defpackage.pv2
    public final Object V0(l26 l26Var, Object obj) {
        return l26Var.z(obj, this);
    }

    public final void a(Object obj) {
        this.b.set(obj);
    }

    public final Object c() {
        ThreadLocal threadLocal = this.b;
        Object obj = threadLocal.get();
        threadLocal.set(this.a);
        return obj;
    }

    @Override // defpackage.nv2
    public final ov2 getKey() {
        return this.c;
    }

    @Override // defpackage.pv2
    public final pv2 p0(pv2 pv2Var) {
        return i7h.I(this, pv2Var);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}
