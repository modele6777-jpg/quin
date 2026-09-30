package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ulg extends vlg {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public ulg(byte[] bArr, int i, int i2) {
        xlg.o(i, i + i2, bArr.length);
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // defpackage.xlg
    public final byte a(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // defpackage.xlg
    public final int c() {
        return this.zzd;
    }

    @Override // defpackage.xlg
    public final vlg d(int i, int i2) {
        int iO = xlg.o(i, i2, this.zzd);
        return iO == 0 ? xlg.a : new ulg(this.zzb, this.zzc + i, iO);
    }

    @Override // defpackage.xlg
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.zzb, this.zzc, bArr, 0, i);
    }

    @Override // defpackage.xlg
    public final void g(gmg gmgVar) {
        gmgVar.c(this.zzb, this.zzc, this.zzd);
    }

    @Override // defpackage.xlg
    public final boolean i(xlg xlgVar) {
        boolean z = xlgVar instanceof wlg;
        if (!z && !(xlgVar instanceof ulg)) {
            return xlgVar.i(this);
        }
        int i = this.zzd;
        if (i > xlgVar.c()) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i > xlgVar.c()) {
            int iC = xlgVar.c();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(iC).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(iC);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (z) {
            return xlg.p(this.zzc, 0, i, this.zzb, ((wlg) xlgVar).q());
        }
        if (!(xlgVar instanceof ulg)) {
            vlg vlgVarD = xlgVar.d(0, i);
            int i2 = this.zzc;
            return vlgVarD.equals(d(i2, i + i2));
        }
        ulg ulgVar = (ulg) xlgVar;
        byte[] bArr = this.zzb;
        return xlg.p(this.zzc, ulgVar.zzc, i, bArr, ulgVar.zzb);
    }

    @Override // defpackage.xlg
    public final int j(int i, int i2) {
        return xmg.a(i, this.zzb, this.zzc, i2);
    }

    public final /* synthetic */ byte[] q() {
        return this.zzb;
    }

    public final /* synthetic */ int r() {
        return this.zzc;
    }
}
