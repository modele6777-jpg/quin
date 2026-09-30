package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pyg extends ryg {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public pyg(byte[] bArr, int i, int i2) {
        vyg.k(i, i + i2, bArr.length);
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // defpackage.vyg
    public final byte a(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // defpackage.vyg
    public final int c(int i, int i2) {
        return y0h.a(i, this.zzb, this.zzc, i2);
    }

    @Override // defpackage.vyg
    public final int d() {
        return this.zzd;
    }

    @Override // defpackage.vyg
    public final ryg e(int i, int i2) {
        int iK = vyg.k(i, i2, this.zzd);
        return iK == 0 ? vyg.a : new pyg(this.zzb, this.zzc + i, iK);
    }

    @Override // defpackage.vyg
    public final void g(byte[] bArr, int i) {
        System.arraycopy(this.zzb, this.zzc, bArr, 0, i);
    }

    @Override // defpackage.vyg
    public final void i(p90 p90Var) throws yyg {
        p90Var.u0(this.zzb, this.zzc, this.zzd);
    }

    @Override // defpackage.vyg
    public final boolean j(vyg vygVar) {
        boolean z = vygVar instanceof tyg;
        if (!z && !(vygVar instanceof pyg)) {
            return vygVar.j(this);
        }
        int i = this.zzd;
        if (i > vygVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > vygVar.d()) {
            qc0.j(ks0.k("Ran off end of other: 0, ", i, ", ", vygVar.d()));
            return false;
        }
        if (z) {
            return vyg.n(this.zzc, 0, i, this.zzb, ((tyg) vygVar).zzb);
        }
        if (!(vygVar instanceof pyg)) {
            ryg rygVarE = vygVar.e(0, i);
            int i2 = this.zzc;
            return rygVarE.equals(e(i2, i + i2));
        }
        pyg pygVar = (pyg) vygVar;
        return vyg.n(this.zzc, pygVar.zzc, i, this.zzb, pygVar.zzb);
    }
}
