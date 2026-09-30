package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gle {
    public final gfh a = new gfh();

    public gle(oid oidVar) {
        ((gfh) oidVar.b).e(hle.a, new yea(oidVar, new yea(this)));
    }

    public final void a(Object obj) {
        this.a.p(obj);
    }

    public final boolean b(Exception exc) {
        gfh gfhVar = this.a;
        gfhVar.getClass();
        oa7.B(exc, "Exception must not be null");
        synchronized (gfhVar.a) {
            try {
                if (gfhVar.c) {
                    return false;
                }
                gfhVar.c = true;
                gfhVar.f = exc;
                gfhVar.b.n(gfhVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        this.a.q(obj);
    }

    public gle() {
    }
}
