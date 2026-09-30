package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ts3 implements AutoCloseable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ts3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ys3 ys3Var = (ys3) this.b;
                Object obj = this.c;
                synchronized (ys3Var.e) {
                    ys3Var.e.remove(obj);
                }
                return;
            default:
                ((h48) this.b).b((rr3) this.c);
                return;
        }
    }
}
