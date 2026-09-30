package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class akd implements g1b {
    public static final Object c = new Object();
    public volatile sug a;
    public volatile Object b;

    @Override // defpackage.h1b
    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        sug sugVar = this.a;
        if (sugVar == null) {
            return this.b;
        }
        Object obj2 = sugVar.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}
