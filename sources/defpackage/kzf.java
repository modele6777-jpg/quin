package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kzf {
    public final aw2 a;
    public final v6 b;
    public final Object c;
    public int d;
    public lyd e;
    public boolean f;

    public kzf(aw2 aw2Var, v6 v6Var) {
        aw2Var.getClass();
        this.a = aw2Var;
        this.b = v6Var;
        Object obj = new Object();
        this.c = obj;
        synchronized (obj) {
            this.e = ynb.V(aw2Var, null, null, new izf(this, null), 3);
        }
    }

    public final void a() {
        synchronized (this.c) {
            try {
                if (this.f) {
                    return;
                }
                this.f = true;
                lyd lydVar = this.e;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                this.e = null;
                ynb.V(this.a, null, null, new hzf(this, null), 3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
