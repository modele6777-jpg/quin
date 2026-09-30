package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w8e implements u8e {
    public static final bl0 d = new bl0(5);
    public final Object a = new Object();
    public volatile u8e b;
    public Object c;

    public w8e(u8e u8eVar) {
        u8eVar.getClass();
        this.b = u8eVar;
    }

    @Override // defpackage.u8e
    public final Object get() {
        u8e u8eVar = this.b;
        bl0 bl0Var = d;
        if (u8eVar != bl0Var) {
            synchronized (this.a) {
                try {
                    if (this.b != bl0Var) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = bl0Var;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
