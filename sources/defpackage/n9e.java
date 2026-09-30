package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n9e implements x8c {
    public final f9e a;
    public final String b;
    public boolean c;

    public n9e(f9e f9eVar, String str) {
        this.a = f9eVar;
        this.b = str;
    }

    public final void b() {
        if (this.c) {
            p8c.x(21, "statement is closed");
            throw null;
        }
    }

    @Override // defpackage.x8c
    public void reset() {
        b();
    }

    @Override // defpackage.x8c
    public void s() {
        b();
    }
}
