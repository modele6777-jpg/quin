package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class p90 implements s9c {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public p90(CharSequence charSequence, int i, Locale locale) {
        this.a = 10;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            j37.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            j37.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new hx1(charSequence, i));
    }

    public static int G0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int H0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static boolean J(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public static p90 K(OutputStream outputStream, int i) {
        return new p90(outputStream, new byte[i]);
    }

    public static int n(int i, int i2) {
        return p(i2) + u(i);
    }

    public static int o(int i, int i2) {
        return p(i2) + u(i);
    }

    public static int p(int i) {
        if (i >= 0) {
            return s(i);
        }
        return 10;
    }

    public static int q(int i, ut8 ut8Var) {
        return r(ut8Var) + u(i);
    }

    public static int r(ut8 ut8Var) {
        int iE = ut8Var.e();
        return s(iE) + iE;
    }

    public static int s(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int t(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int u(int i) {
        return s(i << 3);
    }

    public void A(s9c s9cVar) {
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            byte b = ((byte[]) this.d)[i2];
            if (b == 0) {
                float[] fArr = (float[]) this.e;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                s9cVar.b(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = (float[]) this.e;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                s9cVar.e(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = (float[]) this.e;
                s9cVar.c(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i += 6;
            } else if (b == 3) {
                float[] fArr4 = (float[]) this.e;
                float f3 = fArr4[i];
                float f4 = fArr4[i + 1];
                int i5 = i + 3;
                float f5 = fArr4[i + 2];
                i += 4;
                s9cVar.a(f3, f4, f5, fArr4[i5]);
            } else if (b != 8) {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = (float[]) this.e;
                s9cVar.d(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                i += 5;
            } else {
                s9cVar.close();
            }
        }
    }

    public void A0(int i) throws yyg {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i >= 0) {
            D0(i);
            return;
        }
        int i2 = this.c;
        try {
            byte[] bArr = (byte[]) this.e;
            long j = i;
            int i3 = i2 + 1;
            try {
                bArr[i2] = (byte) (((int) j) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                int i4 = i2 + 2;
                try {
                    bArr[i3] = (byte) (((int) (j >>> 7)) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    int i5 = i2 + 3;
                    bArr[i4] = (byte) (((int) (j >>> 14)) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    i4 = i2 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    int i6 = i2 + 5;
                    bArr[i4] = (byte) (((int) (j >>> 28)) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    int i7 = i2 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i2 + 7;
                        bArr[i7] = -1;
                        i7 = i2 + 8;
                        bArr[i8] = -1;
                        i3 = i2 + 9;
                        bArr[i7] = -1;
                        i2 += 10;
                        bArr[i3] = 1;
                        this.c = i2;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i2 = i7;
                        throw new yyg(i2, this.b, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i2 = i4;
                }
            } catch (IndexOutOfBoundsException e3) {
                i2 = i3;
                indexOutOfBoundsException = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    public void B() throws IOException {
        b0();
    }

    public void B0(int i, int i2) throws yyg {
        D0((i << 3) | i2);
    }

    public int C() {
        g46 g46Var = (g46) this.e;
        String str = (String) this.d;
        if (g46Var == null) {
            return str.length();
        }
        return (g46Var.b - g46Var.a()) + (str.length() - (this.c - this.b));
    }

    public void C0(int i, int i2) throws yyg {
        D0(i << 3);
        D0(i2);
    }

    public boolean D(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!jt4.d()) {
                    return false;
                }
                jt4 jt4VarA = jt4.a();
                if (jt4VarA.c() != 1 || jt4VarA.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public void D0(int i) throws yyg {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.c;
        int i3 = i & (-128);
        byte[] bArr = (byte[]) this.e;
        try {
            if (i3 == 0) {
                int i4 = i2 + 1;
                bArr[i2] = (byte) i;
                this.c = i4;
                return;
            }
            int i5 = i2 + 1;
            bArr[i2] = (byte) (i | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            int i6 = i >>> 7;
            try {
                if ((i6 & (-128)) == 0) {
                    int i7 = i2 + 2;
                    bArr[i5] = (byte) i6;
                    this.c = i7;
                    return;
                }
                int i8 = i2 + 2;
                try {
                    bArr[i5] = (byte) (i6 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    int i9 = i >>> 14;
                    if ((i9 & (-128)) == 0) {
                        int i10 = i2 + 3;
                        bArr[i8] = (byte) i9;
                        this.c = i10;
                        return;
                    }
                    int i11 = i2 + 3;
                    try {
                        bArr[i8] = (byte) (i9 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        int i12 = i >>> 21;
                        if ((i12 & (-128)) == 0) {
                            int i13 = i2 + 4;
                            bArr[i11] = (byte) i12;
                            this.c = i13;
                            return;
                        } else {
                            i8 = i2 + 4;
                            bArr[i11] = (byte) (i12 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                            int i14 = i2 + 5;
                            bArr[i8] = (byte) (i >>> 28);
                            this.c = i14;
                            return;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i11;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i3 = i8;
                }
                throw new yyg(i3, this.b, 1, indexOutOfBoundsException);
            } catch (IndexOutOfBoundsException e3) {
                i3 = i;
                indexOutOfBoundsException = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    public boolean E(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return r8c.l(Character.codePointBefore((CharSequence) this.d, i));
    }

    public void E0(int i, long j) throws yyg {
        D0(i << 3);
        F0(j);
    }

    public boolean F(int i) {
        j(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (H(i) && H(i - 1) && H(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(G(i) || G(i + 1));
    }

    public void F0(long j) throws yyg {
        long j2 = j & (-128);
        int i = this.c;
        byte[] bArr = (byte[]) this.e;
        try {
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.c = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            int i2 = i + 1;
            long j3 = j >>> 7;
            long j4 = j3 & (-128);
            int i3 = (int) j3;
            if (j4 == 0) {
                bArr[i2] = (byte) i3;
                this.c = i + 2;
                return;
            }
            bArr[i2] = (byte) (i3 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            int i4 = i + 2;
            long j5 = j >>> 14;
            long j6 = j5 & (-128);
            int i5 = (int) j5;
            if (j6 == 0) {
                bArr[i4] = (byte) i5;
                this.c = i + 3;
                return;
            }
            bArr[i4] = (byte) (i5 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            int i6 = i + 3;
            long j7 = j >>> 21;
            long j8 = j7 & (-128);
            int i7 = (int) j7;
            if (j8 == 0) {
                bArr[i6] = (byte) i7;
                this.c = i + 4;
                return;
            }
            bArr[i6] = (byte) (i7 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            int i8 = i + 4;
            long j9 = j >>> 28;
            long j10 = j9 & (-128);
            int i9 = (int) j9;
            if (j10 == 0) {
                bArr[i8] = (byte) i9;
                this.c = i + 5;
                return;
            }
            bArr[i8] = (byte) (i9 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            int i10 = i + 5;
            long j11 = j >>> 35;
            long j12 = j11 & (-128);
            int i11 = (int) j11;
            if (j12 == 0) {
                bArr[i10] = (byte) i11;
                this.c = i + 6;
                return;
            }
            bArr[i10] = (byte) (i11 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            int i12 = i + 6;
            long j13 = j >>> 42;
            long j14 = j13 & (-128);
            int i13 = (int) j13;
            if (j14 == 0) {
                bArr[i12] = (byte) i13;
                this.c = i + 7;
                return;
            }
            bArr[i12] = (byte) (i13 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            int i14 = i + 7;
            long j15 = j >>> 49;
            long j16 = j15 & (-128);
            int i15 = (int) j15;
            if (j16 == 0) {
                bArr[i14] = (byte) i15;
                this.c = i + 8;
                return;
            }
            bArr[i14] = (byte) (i15 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            int i16 = i + 8;
            long j17 = j >>> 56;
            int i17 = (int) j17;
            if (((-128) & j17) == 0) {
                bArr[i16] = (byte) i17;
                this.c = i + 9;
            } else {
                bArr[i16] = (byte) (i17 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                bArr[i + 9] = (byte) (j >>> 63);
                this.c = i + 10;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new yyg(i, this.b, 1, e);
        }
    }

    public boolean G(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (pa7.t(unicodeBlockOf, unicodeBlock) && pa7.t(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return pa7.t(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && pa7.t(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean H(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!jt4.d()) {
                return false;
            }
            jt4 jt4VarA = jt4.a();
            if (jt4VarA.c() != 1 || jt4VarA.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean I(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return r8c.l(Character.codePointAt((CharSequence) this.d, i));
    }

    public int L(int i) {
        j(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (H(iFollowing + (-1)) && H(iFollowing) && !G(iFollowing)) ? L(iFollowing) : iFollowing;
    }

    public Integer M() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        String str = (String) this.d;
        this.b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public float N() {
        ff8 ff8Var = (ff8) this.e;
        float fM = ff8Var.m(this.b, this.c, (String) this.d);
        if (!Float.isNaN(fM)) {
            this.b = ff8Var.b;
        }
        return fM;
    }

    public l9c O() {
        float fN = N();
        if (Float.isNaN(fN)) {
            return null;
        }
        int iS = S();
        return iS == 0 ? new l9c(1, fN) : new l9c(iS, fN);
    }

    public String P() {
        String str = (String) this.d;
        if (z()) {
            return null;
        }
        int i = this.b;
        char cCharAt = str.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iH = h();
        while (iH != -1 && iH != cCharAt) {
            iH = h();
        }
        if (iH == -1) {
            this.b = i;
            return null;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        return str.substring(i + 1, i2);
    }

    public String Q() {
        return R(' ', false);
    }

    public String R(char c, boolean z) {
        String str = (String) this.d;
        if (z()) {
            return null;
        }
        char cCharAt = str.charAt(this.b);
        if ((!z && J(cCharAt)) || cCharAt == c) {
            return null;
        }
        int i = this.b;
        int iH = h();
        while (iH != -1 && iH != c && (z || !J(iH))) {
            iH = h();
        }
        return str.substring(i, this.b);
    }

    public int S() {
        String str = (String) this.d;
        if (z()) {
            return 0;
        }
        char cCharAt = str.charAt(this.b);
        int i = this.b;
        if (cCharAt == '%') {
            this.b = i + 1;
            return 9;
        }
        if (i > this.c - 2) {
            return 0;
        }
        try {
            int iZ = ib8.z(str.substring(i, i + 2).toLowerCase(Locale.US));
            this.b += 2;
            return iZ;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public void U(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
            typeface = s.g(typeface, i, (this.c & 2) != 0);
        }
        u90 u90Var = (u90) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (u90Var.n) {
            u90Var.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = u90Var.j;
                if (zIsAttachedToWindow) {
                    textView.post(new q90(textView, typeface, i2));
                    return;
                }
                ej8 ej8Var = s90.a;
                String fontVariationSettings = textView.getFontVariationSettings();
                if (!TextUtils.isEmpty(fontVariationSettings)) {
                    s90.a(textView, null);
                }
                textView.setTypeface(typeface, i2);
                if (TextUtils.isEmpty(fontVariationSettings)) {
                    return;
                }
                s90.a(textView, fontVariationSettings);
            }
        }
    }

    public Object V(long j, boolean z) {
        Object objY = null;
        long j2 = Long.MAX_VALUE;
        while (this.c > 0) {
            long j3 = j - ((long[]) this.d)[this.b];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objY = Y();
            j2 = j3;
        }
        return objY;
    }

    public synchronized Object W() {
        return this.c == 0 ? null : Y();
    }

    public synchronized Object X(long j) {
        return V(j, true);
    }

    public Object Y() {
        pa7.J(this.c > 0);
        Object[] objArr = (Object[]) this.e;
        int i = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.b = (i + 1) % objArr.length;
        this.c--;
        return obj;
    }

    public float Z() {
        e0();
        ff8 ff8Var = (ff8) this.e;
        float fM = ff8Var.m(this.b, this.c, (String) this.d);
        if (!Float.isNaN(fM)) {
            this.b = ff8Var.b;
        }
        return fM;
    }

    @Override // defpackage.s9c
    public void a(float f, float f2, float f3, float f4) {
        g((byte) 3);
        x(4);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        this.c = i + 4;
        fArr[i4] = f4;
    }

    public int a0(int i) {
        j(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (H(iPreceding) && D(iPreceding) && !G(iPreceding)) ? a0(iPreceding) : iPreceding;
    }

    @Override // defpackage.s9c
    public void b(float f, float f2) {
        g((byte) 0);
        x(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    public void b0() throws IOException {
        ((OutputStream) this.e).write((byte[]) this.d, 0, this.c);
        this.c = 0;
    }

    @Override // defpackage.s9c
    public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        g((byte) 2);
        x(6);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.c = i6;
        fArr[i5] = f5;
        this.c = i + 6;
        fArr[i6] = f6;
    }

    public void c0(int i, int i2, String str) {
        if (i > i2) {
            j37.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            j37.a("start must be non-negative, but was " + i);
        }
        g46 g46Var = (g46) this.e;
        if (g46Var == null) {
            int iMax = Math.max(255, str.length() + UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            g46 g46Var2 = new g46(0);
            g46Var2.b = iMax;
            g46Var2.c = cArr;
            g46Var2.d = length;
            g46Var2.e = i4;
            this.e = g46Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > g46Var.b - g46Var.a()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            c0(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > g46Var.a()) {
            int iA = length2 - g46Var.a();
            int i9 = g46Var.b;
            do {
                i9 *= 2;
            } while (i9 - g46Var.b < iA);
            char[] cArr2 = new char[i9];
            qd0.a0(g46Var.c, cArr2, 0, 0, g46Var.d);
            int i10 = g46Var.b;
            int i11 = g46Var.e;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            qd0.a0(g46Var.c, cArr2, i13, i11, i12 + i11);
            g46Var.c = cArr2;
            g46Var.b = i9;
            g46Var.e = i13;
        }
        int i14 = g46Var.d;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = g46Var.c;
            qd0.a0(cArr3, cArr3, g46Var.e - i15, i8, i14);
            g46Var.d = i7;
            g46Var.e -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = g46Var.a() + i7;
            int iA3 = g46Var.a() + i8;
            int i16 = g46Var.e;
            char[] cArr4 = g46Var.c;
            qd0.a0(cArr4, cArr4, g46Var.d, i16, iA2);
            i7 = g46Var.d + (iA2 - i16);
            g46Var.d = i7;
            g46Var.e = iA3;
        } else {
            g46Var.e = g46Var.a() + i8;
            g46Var.d = i7;
        }
        str.getChars(0, str.length(), g46Var.c, i7);
        g46Var.d = str.length() + g46Var.d;
    }

    @Override // defpackage.s9c
    public void close() {
        g((byte) 8);
    }

    @Override // defpackage.s9c
    public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        g((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        x(5);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        this.c = i + 5;
        fArr[i5] = f5;
    }

    public synchronized int d0() {
        return this.c;
    }

    @Override // defpackage.s9c
    public void e(float f, float f2) {
        g((byte) 1);
        x(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    public boolean e0() {
        f0();
        int i = this.b;
        if (i == this.c || ((String) this.d).charAt(i) != ',') {
            return false;
        }
        this.b++;
        f0();
        return true;
    }

    public synchronized void f(long j, Object obj) {
        int i = this.c;
        if (i > 0) {
            if (j <= ((long[]) this.d)[((this.b + i) - 1) % ((Object[]) this.e).length]) {
                m();
            }
        }
        y();
        int i2 = this.b;
        int i3 = this.c;
        Object[] objArr = (Object[]) this.e;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.d)[length] = j;
        objArr[length] = obj;
        this.c = i3 + 1;
    }

    public void f0() {
        while (true) {
            int i = this.b;
            if (i >= this.c || !J(((String) this.d).charAt(i))) {
                return;
            } else {
                this.b++;
            }
        }
    }

    public void g(byte b) {
        int i = this.b;
        byte[] bArr = (byte[]) this.d;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.d = bArr2;
            bArr = bArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        bArr[i2] = b;
    }

    public void g0(int i, int i2) throws IOException {
        s0(i, 0);
        i0(i2);
    }

    public int h() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.b = i3;
        if (i3 < i2) {
            return ((String) this.d).charAt(i3);
        }
        return -1;
    }

    public void h0(int i, int i2) throws IOException {
        s0(i, 0);
        i0(i2);
    }

    public void i(int i) {
        new Handler(Looper.getMainLooper()).post(new hw(this, i, 5));
    }

    public void i0(int i) throws IOException {
        if (i >= 0) {
            q0(i);
        } else {
            r0(i);
        }
    }

    public void j(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbN = ib8.n(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbN.append(i3);
        sbN.append("]");
        j37.a(sbN.toString());
    }

    public void j0(int i, ut8 ut8Var) throws IOException {
        s0(i, 2);
        k0(ut8Var);
    }

    public Boolean k(Object obj) {
        if (obj == null) {
            return null;
        }
        e0();
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        char cCharAt = ((String) this.d).charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.b++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public void k0(ut8 ut8Var) throws IOException {
        q0(ut8Var.e());
        ut8Var.d(this);
    }

    public float l(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        e0();
        return N();
    }

    public void l0(int i) throws IOException {
        byte b = (byte) i;
        if (this.c == this.b) {
            b0();
        }
        byte[] bArr = (byte[]) this.d;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr[i2] = b;
    }

    public synchronized void m() {
        this.b = 0;
        this.c = 0;
        Arrays.fill((Object[]) this.e, (Object) null);
    }

    public void m0(z61 z61Var) throws IOException {
        int size = z61Var.size();
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr = (byte[]) this.d;
        if (i3 >= size) {
            z61Var.d(0, bArr, i2, size);
            this.c += size;
            return;
        }
        z61Var.d(0, bArr, i2, i3);
        int i4 = size - i3;
        this.c = i;
        b0();
        if (i4 <= i) {
            z61Var.d(i3, bArr, 0, i4);
            this.c = i4;
            return;
        }
        OutputStream outputStream = (OutputStream) this.e;
        if (i3 < 0) {
            qc0.g(30, "Source offset < 0: ", i3);
            return;
        }
        if (i4 < 0) {
            qc0.g(23, "Length < 0: ", i4);
            return;
        }
        int i5 = i3 + i4;
        if (i5 > z61Var.size()) {
            qc0.g(39, "Source end offset exceeded: ", i5);
        } else if (i4 > 0) {
            z61Var.r(outputStream, i3, i4);
        }
    }

    public void n0(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr2 = (byte[]) this.d;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i2, length);
            this.c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i3);
        int i4 = length - i3;
        this.c = i;
        b0();
        if (i4 > i) {
            ((OutputStream) this.e).write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.c = i4;
        }
    }

    public void o0(int i) throws IOException {
        l0(i & 255);
        l0((i >> 8) & 255);
        l0((i >> 16) & 255);
        l0((i >> 24) & 255);
    }

    public void p0(long j) throws IOException {
        l0(((int) j) & 255);
        l0(((int) (j >> 8)) & 255);
        l0(((int) (j >> 16)) & 255);
        l0(((int) (j >> 24)) & 255);
        l0(((int) (j >> 32)) & 255);
        l0(((int) (j >> 40)) & 255);
        l0(((int) (j >> 48)) & 255);
        l0(((int) (j >> 56)) & 255);
    }

    public void q0(int i) throws IOException {
        while ((i & (-128)) != 0) {
            l0((i & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            i >>>= 7;
        }
        l0(i);
    }

    public void r0(long j) throws IOException {
        while (((-128) & j) != 0) {
            l0((((int) j) & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            j >>>= 7;
        }
        l0((int) j);
    }

    public void s0(int i, int i2) throws IOException {
        q0((i << 3) | i2);
    }

    public void t0(byte b) throws yyg {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.c;
        try {
            int i2 = i + 1;
            try {
                ((byte[]) this.e)[i] = b;
                this.c = i2;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new yyg(i, this.b, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                g46 g46Var = (g46) this.e;
                String str = (String) this.d;
                if (g46Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append(g46Var.c, 0, g46Var.d);
                char[] cArr = g46Var.c;
                int i = g46Var.e;
                sb.append(cArr, i, g46Var.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u0(byte[] bArr, int i, int i2) throws yyg {
        try {
            System.arraycopy(bArr, i, (byte[]) this.e, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new yyg(this.c, this.b, i2, e);
        }
    }

    public boolean v(char c) {
        int i = this.b;
        boolean z = i < this.c && ((String) this.d).charAt(i) == c;
        if (z) {
            this.b++;
        }
        return z;
    }

    public void v0(int i, int i2) throws yyg {
        D0((i << 3) | 5);
        w0(i2);
    }

    public boolean w(String str) {
        int length = str.length();
        int i = this.b;
        boolean z = i <= this.c - length && ((String) this.d).substring(i, i + length).equals(str);
        if (z) {
            this.b += length;
        }
        return z;
    }

    public void w0(int i) throws yyg {
        int i2 = this.c;
        try {
            byte[] bArr = (byte[]) this.e;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new yyg(i2, this.b, 4, e);
        }
    }

    public void x(int i) {
        float[] fArr = (float[]) this.e;
        if (fArr.length < this.c + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.e = fArr2;
        }
    }

    public void x0(int i, long j) throws yyg {
        D0((i << 3) | 1);
        y0(j);
    }

    public void y() {
        int length = ((Object[]) this.e).length;
        if (this.c < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.b;
        int i3 = length - i2;
        System.arraycopy((long[]) this.d, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.e, this.b, objArr, 0, i3);
        int i4 = this.b;
        if (i4 > 0) {
            System.arraycopy((long[]) this.d, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.e, 0, objArr, i3, this.b);
        }
        this.d = jArr;
        this.e = objArr;
        this.b = 0;
    }

    public void y0(long j) throws yyg {
        int i = this.c;
        try {
            byte[] bArr = (byte[]) this.e;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.c = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new yyg(i, this.b, 8, e);
        }
    }

    public boolean z() {
        return this.b == this.c;
    }

    public void z0(int i, int i2) throws yyg {
        D0(i << 3);
        A0(i2);
    }

    public void T(int i) {
    }

    public p90(byte[] bArr, int i) {
        this.a = 11;
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.e = bArr;
            this.c = 0;
            this.b = i;
        } else {
            Locale locale = Locale.US;
            qc0.j(ks0.k("Array range is invalid. Buffer.length=", length, ", offset=0, length=", i));
            throw null;
        }
    }

    public /* synthetic */ p90(int i, byte b) {
        this.a = i;
    }

    public p90() {
        this.a = 9;
        this.d = new long[10];
        this.e = new Object[10];
    }

    public p90(String str, int i, String str2, int i2) {
        this.a = 8;
        this.b = i;
        this.d = str;
        this.c = i2;
        this.e = str2;
    }

    public p90(OutputStream outputStream, byte[] bArr) {
        this.a = 2;
        this.e = outputStream;
        this.d = bArr;
        this.c = 0;
        this.b = bArr.length;
    }

    public p90(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = 4;
        this.b = i;
        pa7.A(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.d = fArr;
        this.e = fArr2;
        this.c = i2;
    }

    public p90(p90 p90Var) {
        this.a = 5;
        float[] fArr = (float[]) p90Var.d;
        this.b = fArr.length / 3;
        this.d = hkg.h0(fArr);
        this.e = hkg.h0((float[]) p90Var.e);
        int i = p90Var.c;
        if (i == 1) {
            this.c = 5;
        } else if (i != 2) {
            this.c = 4;
        } else {
            this.c = 6;
        }
    }

    public p90(u90 u90Var, int i, int i2, WeakReference weakReference) {
        this.a = 0;
        this.e = u90Var;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }

    public p90(String str) {
        this.a = 7;
        this.b = 0;
        this.c = 0;
        this.e = new ff8(1);
        String strTrim = str.trim();
        this.d = strTrim;
        this.c = strTrim.length();
    }

    public p90(int i) {
        this.a = 1;
        this.d = new f1f[i];
        this.c = 0;
    }
}
