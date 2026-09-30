package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class oh6 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof oh6) {
            nh6 nh6Var = (nh6) this;
            byte[] bArr = nh6Var.bytes;
            int length = bArr.length * 8;
            nh6 nh6Var2 = (nh6) ((oh6) obj);
            byte[] bArr2 = nh6Var2.bytes;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    int i = 0;
                    z = true;
                    while (true) {
                        byte[] bArr3 = nh6Var.bytes;
                        if (i >= bArr3.length) {
                            break;
                        }
                        z &= bArr3[i] == nh6Var2.bytes[i];
                        i++;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((nh6) this).bytes;
        if (bArr.length * 8 < 32) {
            int i = bArr[0] & 255;
            for (int i2 = 1; i2 < bArr.length; i2++) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            return i;
        }
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (z) {
            return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        }
        qc0.p(rfc.l("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        return 0;
    }

    public final String toString() {
        byte[] bArr = ((nh6) this).bytes;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
