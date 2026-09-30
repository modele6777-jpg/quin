package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class al8 implements rt8 {
    public rt8[] a;

    @Override // defpackage.rt8
    public final hdb a(Class cls) {
        for (rt8 rt8Var : this.a) {
            if (rt8Var.b(cls)) {
                return rt8Var.a(cls);
            }
        }
        s8f.i("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.rt8
    public final boolean b(Class cls) {
        for (rt8 rt8Var : this.a) {
            if (rt8Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
