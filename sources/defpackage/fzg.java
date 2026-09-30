package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fzg extends cyg {
    public boolean c;

    public fzg(w3h w3hVar) {
        super(w3hVar);
        ((w3h) this.b).P0++;
    }

    public final void B0() {
        if (this.c) {
            return;
        }
        qc0.p("Not initialized");
    }

    public final void C0() {
        if (this.c) {
            qc0.p("Can't initialize twice");
        } else {
            if (D0()) {
                return;
            }
            ((w3h) this.b).R0.incrementAndGet();
            this.c = true;
        }
    }

    public abstract boolean D0();
}
