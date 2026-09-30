package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0b implements rrf {
    public boolean a = false;
    public boolean b = false;
    public rc5 c;
    public final y0b d;

    public z0b(y0b y0bVar) {
        this.d = y0bVar;
    }

    @Override // defpackage.rrf
    public final rrf b(String str) {
        if (this.a) {
            throw new kv4("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.i(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.rrf
    public final rrf c(boolean z) {
        if (this.a) {
            throw new kv4("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
