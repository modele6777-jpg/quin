package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wlg extends vlg {
    private final byte[] zzb;

    public wlg(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // defpackage.xlg
    public final byte a(int i) {
        return this.zzb[i];
    }

    @Override // defpackage.xlg
    public final int c() {
        return this.zzb.length;
    }

    @Override // defpackage.xlg
    public final vlg d(int i, int i2) {
        byte[] bArr = this.zzb;
        int iO = xlg.o(0, i2, bArr.length);
        return iO == 0 ? xlg.a : new ulg(bArr, 0, iO);
    }

    @Override // defpackage.xlg
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.zzb, 0, bArr, 0, i);
    }

    @Override // defpackage.xlg
    public final void g(gmg gmgVar) {
        byte[] bArr = this.zzb;
        gmgVar.c(bArr, 0, bArr.length);
    }

    @Override // defpackage.xlg
    public final boolean i(xlg xlgVar) {
        boolean z = xlgVar instanceof wlg;
        if (z) {
            return Arrays.equals(this.zzb, ((wlg) xlgVar).zzb);
        }
        boolean z2 = xlgVar instanceof ulg;
        if (!z2) {
            return xlgVar.i(this);
        }
        byte[] bArr = this.zzb;
        int iC = xlgVar.c();
        int length = bArr.length;
        if (length > iC) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length <= xlgVar.c()) {
            if (z) {
                return xlg.p(0, 0, length, bArr, ((wlg) xlgVar).zzb);
            }
            if (!z2) {
                return xlgVar.d(0, length).equals(d(0, length));
            }
            ulg ulgVar = (ulg) xlgVar;
            return xlg.p(0, ulgVar.r(), length, bArr, ulgVar.q());
        }
        int iC2 = xlgVar.c();
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(iC2).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(length);
        sb2.append(", ");
        sb2.append(iC2);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // defpackage.xlg
    public final int j(int i, int i2) {
        return xmg.a(i, this.zzb, 0, i2);
    }

    public final /* synthetic */ byte[] q() {
        return this.zzb;
    }
}
