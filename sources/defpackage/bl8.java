package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bl8 implements st8 {
    public st8[] a;

    @Override // defpackage.st8
    public final idb a(Class cls) {
        for (st8 st8Var : this.a) {
            if (st8Var.b(cls)) {
                return st8Var.a(cls);
            }
        }
        s8f.i("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.st8
    public final boolean b(Class cls) {
        for (st8 st8Var : this.a) {
            if (st8Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
