package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pi4 implements f1b {
    public static final Object c = new Object();
    public volatile f1b a;
    public volatile Object b;

    public static f1b a(f1b f1bVar) {
        if (f1bVar instanceof pi4) {
            return f1bVar;
        }
        pi4 pi4Var = new pi4();
        pi4Var.b = c;
        pi4Var.a = f1bVar;
        return pi4Var;
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
