package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class m8c implements f21, frd, pj5, tc0, wc0, u52, cce, bn2, fu2, ejb {
    public static final m8c b = new m8c(1);
    public static final /* synthetic */ m8c c = new m8c(2);
    public static final m8c d = new m8c(3);
    public static final m8c e = new m8c(4);
    public static final m8c f = new m8c(5);
    public static final m8c g = new m8c(6);
    public static final m8c v = new m8c(7);
    public static final s8f w = new s8f(11);
    public final /* synthetic */ int a;

    public m8c() {
        this.a = 25;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static a71 A(byte[] bArr) {
        a71 a71Var = a71.c;
        int length = bArr.length;
        vpf.s(bArr.length, 0L, length);
        return new a71(qd0.e0(bArr, 0, length));
    }

    public static l8c B(ke7 ke7Var) {
        ke7Var.getClass();
        return new l8c((jnb) ke7Var);
    }

    public static gog C(Object obj) {
        omg omgVar = (omg) obj;
        gog gogVar = omgVar.zzc;
        if (gogVar != gog.f) {
            return gogVar;
        }
        gog gogVarA = gog.a();
        omgVar.zzc = gogVarA;
        return gogVarA;
    }

    public static boolean D(int i, k01 k01Var, Object obj) throws bng {
        amg amgVar = (amg) k01Var.d;
        int i2 = k01Var.a;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            k01Var.w(0);
            ((gog) obj).d(i3 << 3, Long.valueOf(amgVar.r()));
            return true;
        }
        if (i4 == 1) {
            k01Var.w(1);
            ((gog) obj).d((i3 << 3) | 1, Long.valueOf(amgVar.t()));
            return true;
        }
        if (i4 == 2) {
            ((gog) obj).d((i3 << 3) | 2, k01Var.E());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                s8f.q("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                s8f.m();
                return false;
            }
            k01Var.w(5);
            ((gog) obj).d(5 | (i3 << 3), Integer.valueOf(amgVar.u()));
            return true;
        }
        gog gogVarA = gog.a();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            s8f.q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (k01Var.D() != Integer.MAX_VALUE && D(i6, k01Var, gogVarA)) {
        }
        if ((i5 | 4) != k01Var.a) {
            s8f.q("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (gogVarA.e) {
            gogVarA.e = false;
        }
        ((gog) obj).d(i5 | 3, gogVarA);
        return true;
    }

    public static wne p(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, l46 l46Var, int i) {
        long j9 = y72.k;
        return s((m82) l46Var.k(o82.a), (hue) l46Var.k(iue.a)).a(j9, j9, j9, j9, j, j2, j9, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? j9 : j3, (i & 256) != 0 ? j9 : j4, j9, null, (i & 2048) != 0 ? j9 : j5, (i & 4096) != 0 ? j9 : j6, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, (134217728 & i) != 0 ? j9 : j7, (i & 268435456) != 0 ? j9 : j8, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6 A[RETURN] */
    public static a71 q(String str) {
        int i;
        char cCharAt;
        str.getClass();
        byte[] bArr = a.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 >= length) {
                int i7 = i4 % 4;
                if (i7 != 1) {
                    if (i7 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i7 == 3) {
                        int i8 = i5 << 6;
                        int i9 = i6 + 1;
                        bArrCopyOf[i6] = (byte) (i8 >> 16);
                        i6 += 2;
                        bArrCopyOf[i9] = (byte) (i8 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                    }
                }
                if (bArrCopyOf != null) {
                    return new a71(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i3);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i = 63;
                }
                i3++;
            }
            i5 = (i5 << 6) | i;
            i4++;
            if (i4 % 4 == 0) {
                bArrCopyOf[i6] = (byte) (i5 >> 16);
                int i10 = i6 + 2;
                bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                i6 += 3;
                bArrCopyOf[i10] = (byte) i5;
            }
            i3++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new a71(bArrCopyOf);
        }
        return null;
    }

    public static a71 r(String str) {
        if (str.length() % 2 != 0) {
            qc0.o("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (bzd.q(str.charAt(i2 + 1)) + (bzd.q(str.charAt(i2)) << 4));
        }
        return new a71(bArr);
    }

    public static wne s(m82 m82Var, hue hueVar) {
        wne wneVar = m82Var.n0;
        if (wneVar != null) {
            if (pa7.t(wneVar.k, hueVar)) {
                return wneVar;
            }
            wne wneVarA = wneVar.a(wneVar.a, wneVar.b, wneVar.c, wneVar.d, wneVar.e, wneVar.f, wneVar.g, wneVar.h, wneVar.i, wneVar.j, hueVar, wneVar.l, wneVar.m, wneVar.n, wneVar.o, wneVar.p, wneVar.q, wneVar.r, wneVar.s, wneVar.t, wneVar.u, wneVar.v, wneVar.w, wneVar.x, wneVar.y, wneVar.z, wneVar.A, wneVar.B, wneVar.C, wneVar.D, wneVar.E, wneVar.F, wneVar.G, wneVar.H, wneVar.I, wneVar.J, wneVar.K, wneVar.L, wneVar.M, wneVar.N, wneVar.O, wneVar.P, wneVar.Q);
            m82Var.n0 = wneVarA;
            return wneVarA;
        }
        long jC = o82.c(m82Var, od4.I);
        long jC2 = o82.c(m82Var, od4.N);
        n82 n82Var = od4.q;
        long jC3 = o82.c(m82Var, n82Var);
        float f2 = od4.r;
        long jB = y72.b(jC3, f2);
        long jC4 = o82.c(m82Var, od4.C);
        n82 n82Var2 = od4.m;
        long jC5 = o82.c(m82Var, n82Var2);
        long jC6 = o82.c(m82Var, n82Var2);
        long jC7 = o82.c(m82Var, n82Var2);
        long jC8 = o82.c(m82Var, n82Var2);
        long jC9 = o82.c(m82Var, od4.l);
        long jC10 = o82.c(m82Var, od4.B);
        long jC11 = o82.c(m82Var, od4.H);
        long jC12 = o82.c(m82Var, od4.k);
        long jB2 = y72.b(o82.c(m82Var, od4.o), od4.p);
        long jC13 = o82.c(m82Var, od4.A);
        long jC14 = o82.c(m82Var, od4.K);
        long jC15 = o82.c(m82Var, od4.S);
        long jB3 = y72.b(o82.c(m82Var, od4.u), od4.v);
        long jC16 = o82.c(m82Var, od4.E);
        long jC17 = o82.c(m82Var, od4.M);
        long jC18 = o82.c(m82Var, od4.U);
        long jB4 = y72.b(o82.c(m82Var, od4.y), od4.z);
        long jC19 = o82.c(m82Var, od4.G);
        long jC20 = o82.c(m82Var, od4.J);
        long jC21 = o82.c(m82Var, od4.R);
        long jB5 = y72.b(o82.c(m82Var, od4.s), od4.t);
        long jC22 = o82.c(m82Var, od4.D);
        n82 n82Var3 = od4.O;
        long jC23 = o82.c(m82Var, n82Var3);
        long jC24 = o82.c(m82Var, n82Var3);
        long jB6 = y72.b(o82.c(m82Var, n82Var), f2);
        long jC25 = o82.c(m82Var, n82Var3);
        long jC26 = o82.c(m82Var, od4.L);
        long jC27 = o82.c(m82Var, od4.T);
        long jB7 = y72.b(o82.c(m82Var, od4.w), od4.x);
        long jC28 = o82.c(m82Var, od4.F);
        n82 n82Var4 = od4.P;
        long jC29 = o82.c(m82Var, n82Var4);
        long jC30 = o82.c(m82Var, n82Var4);
        long jB8 = y72.b(o82.c(m82Var, n82Var4), f2);
        long jC31 = o82.c(m82Var, n82Var4);
        n82 n82Var5 = od4.Q;
        wne wneVar2 = new wne(jC, jC2, jB, jC4, jC5, jC6, jC7, jC8, jC9, jC10, hueVar, jC11, jC12, jB2, jC13, jC14, jC15, jB3, jC16, jC17, jC18, jB4, jC19, jC20, jC21, jB5, jC22, jC23, jC24, jB6, jC25, jC26, jC27, jB7, jC28, jC29, jC30, jB8, jC31, o82.c(m82Var, n82Var5), o82.c(m82Var, n82Var5), y72.b(o82.c(m82Var, n82Var5), f2), o82.c(m82Var, n82Var5));
        m82Var.n0 = wneVar2;
        return wneVar2;
    }

    public static byte[] t(jy6 jy6Var, long j) {
        t51 t51Var = new t51(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(jy6Var.size());
        Iterator<E> it = jy6Var.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) t51Var.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static a71 u(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(ox1.a);
        bytes.getClass();
        a71 a71Var = new a71(bytes);
        a71Var.b = str;
        return a71Var;
    }

    public static pu1 v(String str) {
        Object next;
        mx4 mx4Var = pu1.e;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            next = l2Var.next();
            if (pa7.t(((pu1) next).a(), str)) {
                return (pu1) next;
            }
        }
        next = null;
        return (pu1) next;
    }

    public static int z() {
        int i = ez3.d;
        ez3.d = i << 1;
        return i;
    }

    @Override // defpackage.fu2
    public void c(ct6 ct6Var, List list) {
        ct6Var.getClass();
    }

    @Override // defpackage.fu2
    public List d(ct6 ct6Var) {
        ct6Var.getClass();
        return pu4.a;
    }

    @Override // defpackage.pj5
    public float e() {
        return 0.0f;
    }

    @Override // defpackage.tc0, defpackage.wc0
    public float f() {
        return 0.0f;
    }

    @Override // defpackage.frd
    public int g(int i, int i2, int i3, int i4) {
        return (((i - i3) - i4) / 2) - (i2 / 2);
    }

    @Override // defpackage.ejb, defpackage.prf
    public tt7 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    public void h(final boolean z, final m77 m77Var, j09 j09Var, final wne wneVar, final x4d x4dVar, float f2, float f3, l46 l46Var, final int i, final int i2) {
        float f4;
        float f5;
        final float f6;
        final float f7;
        final j09 j09Var2;
        int i3;
        j09 j09Var3;
        long j;
        l46Var.h0(-818661242);
        int i4 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.h(false) ? 32 : 16) | (l46Var.g(m77Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | 3072 | (l46Var.g(wneVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.g(x4dVar) ? 131072 : 65536);
        if ((i & 1572864) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                int i5 = l46Var.d(f4) ? 1048576 : 524288;
                i4 |= i5;
            } else {
                f4 = f2;
            }
            i4 |= i5;
        } else {
            f4 = f2;
        }
        if ((i & 12582912) == 0) {
            if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                f5 = f3;
                int i6 = l46Var.d(f5) ? 8388608 : 4194304;
                i4 |= i6;
            } else {
                f5 = f3;
            }
            i4 |= i6;
        } else {
            f5 = f3;
        }
        if (l46Var.W(i4 & 1, (38347923 & i4) != 38347922)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                if ((i2 & 64) != 0) {
                    i4 &= -3670017;
                    f4 = 2.0f;
                }
                int i7 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                g09 g09Var = g09.a;
                if (i7 != 0) {
                    i4 &= -29360129;
                    f5 = 1.0f;
                }
                i3 = i4;
                j09Var3 = g09Var;
            } else {
                l46Var.Z();
                if ((i2 & 64) != 0) {
                    i4 &= -3670017;
                }
                if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    i4 &= -29360129;
                }
                i3 = i4;
                j09Var3 = j09Var;
            }
            l46Var.s();
            boolean zBooleanValue = ((Boolean) z7f.w(m77Var, l46Var, (i3 >> 6) & 14).getValue()).booleanValue();
            if (z) {
                j = zBooleanValue ? wneVar.e : wneVar.f;
            } else {
                j = wneVar.g;
            }
            float f8 = f4;
            float f9 = f5;
            s21.a(b21.t(j09Var3, new i2e(5, x4dVar, new cpe(new uw7(0, 5, h0e.class, qkd.a(j, vpf.Z(t39.d, l46Var), null, l46Var, 0, 12), "value", "getValue()Ljava/lang/Object;")))).D(new s17(z, m77Var, wneVar, x4dVar, f8, f9)), l46Var, 0);
            f6 = f8;
            f7 = f9;
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            f6 = f4;
            f7 = f5;
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: bpe
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.a.h(z, m77Var, j09Var2, wneVar, x4dVar, f6, f7, (l46) obj, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    @Override // defpackage.pj5
    public float i(float f2, float f3, long j) {
        return 0.0f;
    }

    @Override // defpackage.f21
    public long j(guc gucVar, int i) {
        return gucVar.f.m(i);
    }

    @Override // defpackage.bn2
    public long k(long j, long j2) {
        switch (this.a) {
            case 20:
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i = cec.a;
                return jFloatToRawIntBits;
            default:
                float fQ = ok8.q(j, j2);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fQ)) << 32) | (((long) Float.floatToRawIntBits(fQ)) & 4294967295L);
                int i2 = cec.a;
                return jFloatToRawIntBits2;
        }
    }

    @Override // defpackage.pj5
    public long l(float f2) {
        return 0L;
    }

    @Override // defpackage.tc0
    public void m(sw3 sw3Var, int i, int[] iArr, cv7 cv7Var, int[] iArr2) {
        if (cv7Var == cv7.a) {
            xc0.b(i, iArr, iArr2, false);
        } else {
            xc0.b(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.pj5
    public float n(float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.pj5
    public float o(long j, float f2) {
        return 0.0f;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "Center";
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.wc0
    public void w(sw3 sw3Var, int i, int[] iArr, int[] iArr2) {
        xc0.b(i, iArr, iArr2, false);
    }

    public ja4 x(Context context) {
        ja4 ja4Var;
        context.getClass();
        ja4 ja4Var2 = ja4.k;
        if (ja4Var2 != null) {
            return ja4Var2;
        }
        synchronized (this) {
            ja4Var = ja4.k;
            if (ja4Var == null) {
                Context contextA = sn2.a(context);
                contextA.getClass();
                ja4Var = new ja4(contextA);
                ja4.k = ja4Var;
            }
        }
        return ja4Var;
    }

    public Signature[] y(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public /* synthetic */ m8c(int i) {
        this.a = i;
    }

    @Override // defpackage.u52
    public void a() {
    }

    @Override // defpackage.u52
    public void b() {
    }

    @Override // defpackage.u52
    public void close() {
    }
}
