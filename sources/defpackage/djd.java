package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class djd extends Thread {
    public final /* synthetic */ ejd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djd(ejd ejdVar) {
        super("ExoPlayer:SimpleDecoder");
        this.a = ejdVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.a.k());
    }
}
