package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qi4 implements g1b {
    public static final Object c = new Object();
    public volatile g1b a;
    public volatile Object b;

    public static g1b a(g1b g1bVar) {
        if (g1bVar instanceof qi4) {
            return g1bVar;
        }
        qi4 qi4Var = new qi4();
        qi4Var.b = c;
        qi4Var.a = g1bVar;
        return qi4Var;
    }

    @Override // defpackage.h1b
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
