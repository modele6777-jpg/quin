package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wbh extends obh {
    public boolean d;

    public wbh(ich ichVar) {
        super(ichVar);
        this.c.G0++;
    }

    public final void B0() {
        if (this.d) {
            return;
        }
        qc0.p("Not initialized");
    }

    public final void C0() {
        if (this.d) {
            qc0.p("Can't initialize twice");
            return;
        }
        D0();
        this.c.H0++;
        this.d = true;
    }

    public abstract void D0();
}
