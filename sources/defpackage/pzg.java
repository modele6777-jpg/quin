package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class pzg {
    public static final mzg d;
    public final izg a;
    public final Character b;
    public volatile pzg c;

    static {
        new nzg("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new nzg("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new pzg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new pzg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new mzg(new izg("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public pzg(izg izgVar, Character ch) {
        this.a = izgVar;
        if (ch != null) {
            byte[] bArr = izgVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                qc0.j(q3c.s("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        v2c.C(0, i, bArr.length);
        while (i2 < i) {
            izg izgVar = this.a;
            b(sb, bArr, i2, Math.min(izgVar.f, i - i2));
            i2 += izgVar.f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        v2c.C(i, i + i2, bArr.length);
        izg izgVar = this.a;
        int i3 = izgVar.f;
        int i4 = izgVar.d;
        if (i2 > i3) {
            cva.s();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = (i2 + 1) * 8;
        while (i5 < i2 * 8) {
            sb.append(izgVar.b[((int) (j >>> ((i7 - i4) - i5))) & izgVar.c]);
            i5 += i4;
        }
        if (this.b != null) {
            while (i5 < izgVar.f * 8) {
                sb.append('=');
                i5 += i4;
            }
        }
    }

    public final String c(byte[] bArr, int i) {
        v2c.C(0, i, bArr.length);
        izg izgVar = this.a;
        int i2 = izgVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(izgVar.e * gcc.H(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            qc0.i(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pzg) {
            pzg pzgVar = (pzg) obj;
            if (this.a.equals(pzgVar.a) && Objects.equals(this.b, pzgVar.b)) {
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
        izg izgVar = this.a;
        sb.append(izgVar);
        if (8 % izgVar.d != 0) {
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

    public pzg(String str, String str2) {
        this(new izg(str, str2.toCharArray()), (Character) '=');
    }
}
