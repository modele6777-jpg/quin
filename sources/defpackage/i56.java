package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i56 implements rt8 {
    public static final i56 b = new i56(0);
    public final /* synthetic */ int a;

    public /* synthetic */ i56(int i) {
        this.a = i;
    }

    @Override // defpackage.rt8
    public final hdb a(Class cls) {
        switch (this.a) {
            case 0:
                if (!t56.class.isAssignableFrom(cls)) {
                    qc0.j("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (hdb) t56.j(cls.asSubclass(t56.class)).i(3);
                } catch (Exception e) {
                    cva.q("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.rt8
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return t56.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
