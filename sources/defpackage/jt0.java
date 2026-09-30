package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jt0 {
    public static final char[] a = new char[64];
    public static final byte[] b;

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            a[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            a[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            a[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char[] cArr = a;
        cArr[i] = '+';
        cArr[i + 1] = '/';
        b = new byte[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];
        int i2 = 0;
        while (true) {
            byte[] bArr = b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            b[a[i3]] = (byte) i3;
        }
    }

    public static String a(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        int i5 = ((length * 4) + 2) / 3;
        char[] cArr = new char[((length + 2) / 3) * 4];
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int i8 = i6 + 1;
            byte b2 = bytes[i6];
            int i9 = b2 & 255;
            if (i8 < length) {
                i = i6 + 2;
                i2 = bytes[i8] & 255;
            } else {
                i = i8;
                i2 = 0;
            }
            if (i < length) {
                i3 = i + 1;
                i4 = bytes[i] & 255;
            } else {
                i3 = i;
                i4 = 0;
            }
            int i10 = ((b2 & 3) << 4) | (i2 >>> 4);
            int i11 = ((i2 & 15) << 2) | (i4 >>> 6);
            int i12 = i4 & 63;
            char[] cArr2 = a;
            cArr[i7] = cArr2[i9 >>> 2];
            int i13 = i7 + 2;
            cArr[i7 + 1] = cArr2[i10];
            char c = '=';
            cArr[i13] = i13 < i5 ? cArr2[i11] : '=';
            int i14 = i7 + 3;
            if (i14 < i5) {
                c = cArr2[i12];
            }
            cArr[i14] = c;
            i7 += 4;
            i6 = i3;
        }
        return new String(cArr);
    }
}
