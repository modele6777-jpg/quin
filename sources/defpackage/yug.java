package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yug implements Runnable {
    public final zwg a;
    public final vwg b;

    public yug(zwg zwgVar, vwg vwgVar) {
        this.a = zwgVar;
        this.b = vwgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        vwg vwgVar = this.b;
        if (ivg.g.B(this.a, this, zwg.h(vwgVar))) {
            zwg.j(this.a);
        }
    }
}
