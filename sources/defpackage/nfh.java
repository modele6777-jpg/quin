package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nfh {
    public static final lfh d = new lfh();
    public final nfh a;
    public final wid b;
    public boolean c = false;

    public /* synthetic */ nfh(nfh nfhVar, wid widVar) {
        if (nfhVar != null) {
            pa7.A(nfhVar.c);
        }
        this.a = nfhVar;
        this.b = widVar;
    }

    public final nfh a() {
        if (this.c) {
            qc0.p("Already frozen");
            return null;
        }
        this.c = true;
        nfh nfhVar = this.a;
        return (nfhVar == null || !this.b.isEmpty()) ? this : nfhVar;
    }

    public final boolean b() {
        if (this.b.containsKey(d)) {
            return true;
        }
        nfh nfhVar = this.a;
        return nfhVar != null && nfhVar.b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (nfh nfhVar = this; nfhVar != null; nfhVar = nfhVar.a) {
            for (int i = 0; i < nfhVar.b.c; i++) {
                sb.append("[");
                sb.append(this.b.i(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
