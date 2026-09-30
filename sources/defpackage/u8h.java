package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u8h implements Runnable {
    public final /* synthetic */ t8h a;
    public final /* synthetic */ t8h b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ b9h e;

    public u8h(b9h b9hVar, t8h t8hVar, t8h t8hVar2, long j, boolean z) {
        this.a = t8hVar;
        this.b = t8hVar2;
        this.c = j;
        this.d = z;
        this.e = b9hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.G0(this.a, this.b, this.c, this.d, null);
    }
}
