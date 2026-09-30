package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ut0 {
    public static final tt0 d;
    public static final st0 e;
    public final rt0 a;
    public final Character b;
    public volatile ut0 c;

    static {
        new tt0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        d = new tt0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new ut0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new ut0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        e = new st0(new rt0("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public ut0(rt0 rt0Var, Character ch) {
        boolean z;
        this.a = rt0Var;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = rt0Var.g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        pa7.B(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public final String a(byte[] bArr, int i) {
        pa7.H(0, i, bArr.length);
        rt0 rt0Var = this.a;
        int i2 = rt0Var.e;
        int i3 = rt0Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(od4.n(i, i3) * i2);
        try {
            c(sb, bArr, i);
            return sb.toString();
        } catch (IOException e2) {
            qc0.i(e2);
            return null;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        pa7.H(i, i + i2, bArr.length);
        rt0 rt0Var = this.a;
        int i3 = rt0Var.f;
        int i4 = rt0Var.d;
        int i5 = 0;
        pa7.A(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(rt0Var.b[((int) (j >>> (i7 - i5))) & rt0Var.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < rt0Var.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        pa7.H(0, i, bArr.length);
        while (i2 < i) {
            rt0 rt0Var = this.a;
            b(sb, bArr, i2, Math.min(rt0Var.f, i - i2));
            i2 += rt0Var.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ut0) {
            ut0 ut0Var = (ut0) obj;
            if (this.a.equals(ut0Var.a) && Objects.equals(this.b, ut0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        rt0 rt0Var = this.a;
        sb.append(rt0Var);
        if (8 % rt0Var.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public ut0(String str, String str2) {
        this(new rt0(str, str2.toCharArray()), (Character) '=');
    }
}
