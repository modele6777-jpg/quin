package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gzd implements psf {
    public final psf a;
    public final long b;

    public gzd(psf psfVar, long j) {
        this.a = psfVar;
        this.b = j;
    }

    @Override // defpackage.psf
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.psf
    public final long c(b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return this.a.c(b00Var, b00Var2, b00Var3) + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gzd)) {
            return false;
        }
        gzd gzdVar = (gzd) obj;
        return gzdVar.b == this.b && pa7.t(gzdVar.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.psf
    public final b00 i(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        long j2 = this.b;
        return j < j2 ? b00Var3 : this.a.i(j - j2, b00Var, b00Var2, b00Var3);
    }

    @Override // defpackage.psf
    public final b00 t(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        long j2 = this.b;
        return j < j2 ? b00Var : this.a.t(j - j2, b00Var, b00Var2, b00Var3);
    }
}
