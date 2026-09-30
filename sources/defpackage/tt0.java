package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tt0 extends ut0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public tt0(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new rt0(str, charArray), (Character) '=');
        pa7.A(charArray.length == 64);
    }

    @Override // defpackage.ut0
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        pa7.H(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            rt0 rt0Var = this.a;
            char[] cArr = rt0Var.b;
            char[] cArr2 = rt0Var.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
