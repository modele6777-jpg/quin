package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nzg extends pzg {
    /* JADX WARN: Illegal instructions before constructor call */
    public nzg(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new izg(str, charArray), (Character) '=');
        if (charArray.length == 64) {
            return;
        }
        cva.s();
        throw null;
    }

    @Override // defpackage.pzg
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        v2c.C(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            izg izgVar = this.a;
            char[] cArr = izgVar.b;
            char[] cArr2 = izgVar.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
