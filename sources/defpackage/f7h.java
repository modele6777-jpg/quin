package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f7h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5h b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ c8h e;

    public /* synthetic */ f7h(c8h c8hVar, q5h q5hVar, long j, boolean z, int i) {
        this.a = i;
        this.b = q5hVar;
        this.c = j;
        this.d = z;
        this.e = c8hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        boolean z = this.d;
        q5h q5hVar = this.b;
        c8h c8hVar = this.e;
        switch (i) {
            case 0:
                c8hVar.a1(q5hVar);
                c8hVar.Q0(q5hVar, j, z);
                break;
            default:
                c8hVar.a1(q5hVar);
                c8hVar.Q0(q5hVar, j, z);
                break;
        }
    }
}
