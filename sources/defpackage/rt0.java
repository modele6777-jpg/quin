package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rt0 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    public rt0(String str, char[] cArr, byte[] bArr, boolean z) {
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iZ = od4.z(length);
            this.d = iZ;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZ);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.e = i;
            this.f = iZ >> iNumberOfTrailingZeros;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f; i2++) {
                int i3 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[od4.n(i2 * 8, i3)] = true;
            }
            this.h = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rt0)) {
            return false;
        }
        rt0 rt0Var = (rt0) obj;
        return this.h == rt0Var.h && Arrays.equals(this.b, rt0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rt0(String str, char[] cArr) {
        byte[] bArr = new byte[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    qc0.j(rfc.l("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                qc0.j(rfc.l("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}
