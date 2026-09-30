package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ze implements f1b {
    public Object a;

    public /* synthetic */ ze(Object obj) {
        this.a = obj;
    }

    public static ze a(Object obj) {
        if (obj != null) {
            return new ze(obj);
        }
        r82.g("instance cannot be null");
        return null;
    }

    public Object b(x16 x16Var) {
        Object objInvoke;
        synchronized (this.a) {
            objInvoke = x16Var.invoke();
        }
        return objInvoke;
    }

    @Override // defpackage.h1b
    public Object get() {
        return this.a;
    }
}
