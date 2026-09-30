package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gbc extends fbc {
    public float a = 0.0f;
    public final /* synthetic */ hbc b;

    public gbc(hbc hbcVar) {
        this.b = hbcVar;
    }

    @Override // defpackage.fbc
    public final void j(String str) {
        this.a = ((ebc) this.b.c).d.measureText(str) + this.a;
    }
}
