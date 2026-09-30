package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tyg extends ryg {
    private final byte[] zzb;

    public tyg(byte[] bArr) {
        this.zzb = bArr;
    }

    @Override // defpackage.vyg
    public final byte a(int i) {
        return this.zzb[i];
    }

    @Override // defpackage.vyg
    public final int c(int i, int i2) {
        return y0h.a(i, this.zzb, 0, i2);
    }

    @Override // defpackage.vyg
    public final int d() {
        return this.zzb.length;
    }

    @Override // defpackage.vyg
    public final ryg e(int i, int i2) {
        byte[] bArr = this.zzb;
        int iK = vyg.k(0, i2, bArr.length);
        return iK == 0 ? vyg.a : new pyg(bArr, 0, iK);
    }

    @Override // defpackage.vyg
    public final void g(byte[] bArr, int i) {
        System.arraycopy(this.zzb, 0, bArr, 0, i);
    }

    @Override // defpackage.vyg
    public final void i(p90 p90Var) throws yyg {
        byte[] bArr = this.zzb;
        p90Var.u0(bArr, 0, bArr.length);
    }

    @Override // defpackage.vyg
    public final boolean j(vyg vygVar) {
        boolean z = vygVar instanceof tyg;
        if (z) {
            return Arrays.equals(this.zzb, ((tyg) vygVar).zzb);
        }
        boolean z2 = vygVar instanceof pyg;
        if (!z2) {
            return vygVar.j(this);
        }
        byte[] bArr = this.zzb;
        int iD = vygVar.d();
        int length = bArr.length;
        if (length > iD) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > vygVar.d()) {
            qc0.j(ks0.k("Ran off end of other: 0, ", length, ", ", vygVar.d()));
            return false;
        }
        if (z) {
            return vyg.n(0, 0, length, bArr, ((tyg) vygVar).zzb);
        }
        if (!z2) {
            return vygVar.e(0, length).equals(e(0, length));
        }
        pyg pygVar = (pyg) vygVar;
        return vyg.n(0, pygVar.zzc, length, bArr, pygVar.zzb);
    }
}
