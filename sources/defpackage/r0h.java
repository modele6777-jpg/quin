package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0h extends x0h {
    private final int zzc;
    private final int zzd;

    public r0h(byte[] bArr, int i, int i2) {
        super(bArr);
        d1h.i(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // defpackage.x0h, defpackage.d1h
    public final byte a(int i) {
        int i2 = this.zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[this.zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(tec.e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(ks0.k("Index > length: ", i, ", ", i2));
    }

    @Override // defpackage.x0h, defpackage.d1h
    public final byte c(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // defpackage.x0h, defpackage.d1h
    public final int d() {
        return this.zzd;
    }

    @Override // defpackage.x0h, defpackage.d1h
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i);
    }

    @Override // defpackage.x0h
    public final int n() {
        return this.zzc;
    }
}
