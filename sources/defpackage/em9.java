package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class em9 extends vyb {
    public final oq8 c;
    public final long d;

    public em9(oq8 oq8Var, long j) {
        this.c = oq8Var;
        this.d = j;
    }

    @Override // defpackage.vyb
    public final v41 P0() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // defpackage.vyb
    public final long h() {
        return this.d;
    }

    @Override // defpackage.vyb
    public final oq8 l() {
        return this.c;
    }
}
