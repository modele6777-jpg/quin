package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w4h implements Runnable {
    public final gle a;

    public w4h() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            gle gleVar = this.a;
            if (gleVar != null) {
                gleVar.b(e);
            }
        }
    }

    public w4h(gle gleVar) {
        this.a = gleVar;
    }
}
