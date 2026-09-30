package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lj0 {
    public boolean a;
    public boolean b;
    public boolean c;

    public mj0 a() {
        if (this.a || !(this.b || this.c)) {
            return new mj0(this);
        }
        qc0.p("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}
