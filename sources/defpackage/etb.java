package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class etb extends ftb {
    public final /* synthetic */ oq8 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte[] d;

    public etb(oq8 oq8Var, int i, byte[] bArr) {
        this.b = oq8Var;
        this.c = i;
        this.d = bArr;
    }

    @Override // defpackage.ftb
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ftb
    public final oq8 b() {
        return this.b;
    }

    @Override // defpackage.ftb
    public final void d(u41 u41Var) {
        u41Var.Y(this.d, this.c);
    }
}
