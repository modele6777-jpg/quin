package defpackage;

import android.util.LongSparseArray;
import android.util.SparseArray;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class en8 implements l95 {
    public static final byte[] q0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] r0;
    public static final byte[] s0;
    public static final byte[] t0;
    public static final UUID u0;
    public static final Map v0;
    public dn8 A;
    public boolean B;
    public int C;
    public long D;
    public final SparseArray E;
    public boolean F;
    public long G;
    public int H;
    public long I;
    public long J;
    public int K;
    public boolean L;
    public long M;
    public long N;
    public long O;
    public boolean P;
    public long Q;
    public boolean R;
    public long S;
    public boolean T;
    public int U;
    public long V;
    public long W;
    public int X;
    public int Y;
    public int[] Z;
    public final nq3 a;
    public int a0;
    public final fsf b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final LongSparseArray d;
    public int d0;
    public final boolean e;
    public boolean e0;
    public final boolean f;
    public long f0;
    public final d8e g;
    public int g0;
    public final d0a h;
    public int h0;
    public final d0a i;
    public int i0;
    public final d0a j;
    public boolean j0;
    public final d0a k;
    public boolean k0;
    public final d0a l;
    public boolean l0;
    public final d0a m;
    public int m0;
    public final d0a n;
    public byte n0;
    public final d0a o;
    public boolean o0;
    public final d0a p;
    public n95 p0;
    public final d0a q;
    public ByteBuffer r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public boolean x;
    public boolean y;
    public an8 z;

    static {
        String str = pqf.a;
        r0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        s0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        t0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        u0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        ks0.r(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        ks0.r(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        v0 = Collections.unmodifiableMap(map);
    }

    public en8(d8e d8eVar, int i) {
        nq3 nq3Var = new nq3();
        this.t = -1L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.G = -9223372036854775807L;
        this.H = -1;
        this.I = -1L;
        this.J = -1L;
        this.K = -1;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.Q = -1L;
        this.S = -9223372036854775807L;
        this.a = nq3Var;
        nq3Var.d = new mjg(this);
        this.g = d8eVar;
        this.E = new SparseArray();
        this.e = (i & 1) == 0;
        this.f = (i & 2) == 0;
        this.b = new fsf();
        this.d = new LongSparseArray();
        this.c = new SparseArray();
        this.j = new d0a(4);
        this.k = new d0a(ByteBuffer.allocate(4).putInt(-1).array());
        this.l = new d0a(4);
        this.h = new d0a(n16.D);
        this.i = new d0a(4);
        this.m = new d0a();
        this.n = new d0a();
        this.o = new d0a(8);
        this.p = new d0a();
        this.q = new d0a();
        this.Z = new int[1];
        this.y = true;
    }

    public static byte[] j(String str, long j, long j2) {
        pa7.A(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = pqf.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        sug sugVar = new sug(17, (byte) 0);
        d0a d0aVar = (d0a) sugVar.c;
        rq3 rq3Var = (rq3) m95Var;
        long j = rq3Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        rq3Var.d(d0aVar.a, 0, 4, false);
        sugVar.b = 4;
        for (long jB = d0aVar.B(); jB != 440786851; jB = ((long) (d0aVar.a[0] & 255)) | ((jB << 8) & (-256))) {
            int i2 = sugVar.b + 1;
            sugVar.b = i2;
            if (i2 == i) {
                return false;
            }
            rq3Var.d(d0aVar.a, 0, 1, false);
        }
        long jO = sugVar.o(rq3Var);
        long j3 = sugVar.b;
        if (jO != Long.MIN_VALUE && (j == -1 || j3 + jO < j)) {
            while (true) {
                long j4 = sugVar.b;
                long j5 = j3 + jO;
                if (j4 < j5) {
                    if (sugVar.o(rq3Var) == Long.MIN_VALUE) {
                        break;
                    }
                    long jO2 = sugVar.o(rq3Var);
                    if (jO2 < 0 || jO2 > 2147483647L) {
                        break;
                    }
                    if (jO2 != 0) {
                        int i3 = (int) jO2;
                        rq3Var.j(i3, false);
                        sugVar.b += i3;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        this.S = -9223372036854775807L;
        this.U = 0;
        nq3 nq3Var = this.a;
        nq3Var.e = 0;
        nq3Var.b.clear();
        fsf fsfVar = nq3Var.c;
        fsfVar.b = 0;
        fsfVar.c = 0;
        fsf fsfVar2 = this.b;
        fsfVar2.b = 0;
        fsfVar2.c = 0;
        n();
        this.F = false;
        this.G = -9223372036854775807L;
        this.H = -1;
        this.I = -1L;
        this.J = -1L;
        if (!this.B) {
            this.E.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            o5f o5fVar = ((dn8) sparseArray.valueAt(i)).W;
            if (o5fVar != null) {
                o5fVar.b = false;
                o5fVar.c = 0;
            }
            i++;
        }
    }

    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) throws l0a {
        int i = 0;
        this.T = false;
        boolean zA = true;
        while (zA && !this.T) {
            zA = this.a.a(m95Var);
            if (zA) {
                long position = m95Var.getPosition();
                if (this.P) {
                    this.Q = position;
                    d82Var.b = this.O;
                    this.P = false;
                    return 1;
                }
                if (this.R) {
                    long j = this.Q;
                    if (j != -1) {
                        d82Var.b = j;
                        this.Q = -1L;
                        return 1;
                    }
                }
                long position2 = m95Var.getPosition();
                if (this.L) {
                    this.N = position2;
                    d82Var.b = this.M;
                    this.L = false;
                    return 1;
                }
                if (this.B) {
                    long j2 = this.N;
                    if (j2 != -1) {
                        d82Var.b = j2;
                        this.N = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
        }
        if (zA) {
            return 0;
        }
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return -1;
            }
            dn8 dn8Var = (dn8) sparseArray.valueAt(i);
            dn8Var.d0.getClass();
            o5f o5fVar = dn8Var.W;
            if (o5fVar != null) {
                o5fVar.a(dn8Var.d0, dn8Var.l);
            }
            i++;
        }
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        if (this.f) {
            n95Var = new zi0(n95Var, this.g);
        }
        this.p0 = n95Var;
    }

    public final void g(int i) {
        if (this.F) {
            return;
        }
        throw l0a.a(null, "Element " + i + " must be in a Cues");
    }

    public final void h(int i) {
        if (this.A != null) {
            return;
        }
        throw l0a.a(null, "Element " + i + " must be in a TrackEntry");
    }

    public final void i(dn8 dn8Var, long j, int i, int i2, int i3) {
        byte[] bArrJ;
        int i4;
        int i5;
        o5f o5fVar = dn8Var.W;
        if (o5fVar != null) {
            o5fVar.b(dn8Var.d0, j, i, i2, i3, dn8Var.l);
        } else {
            if ("S_TEXT/UTF8".equals(dn8Var.c) || "S_TEXT/ASS".equals(dn8Var.c) || "S_TEXT/SSA".equals(dn8Var.c) || "S_TEXT/WEBVTT".equals(dn8Var.c)) {
                if (this.Y > 1) {
                    xo1.V("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.W;
                    if (j2 == -9223372036854775807L) {
                        xo1.V("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = dn8Var.c;
                        d0a d0aVar = this.n;
                        byte[] bArr = d0aVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrJ = j("%01d:%02d:%02d:%02d", j2, 10000L);
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrJ = j("%02d:%02d:%02d.%03d", j2, 1000L);
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrJ = j("%02d:%02d:%02d,%03d", j2, 1000L);
                                i4 = 19;
                                break;
                            default:
                                cva.s();
                                return;
                        }
                        System.arraycopy(bArrJ, 0, bArr, i4, bArrJ.length);
                        for (int i6 = d0aVar.b; i6 < d0aVar.c; i6++) {
                            if (d0aVar.a[i6] == 0) {
                                d0aVar.L(i6);
                                dn8Var.d0.e(d0aVar.c, d0aVar);
                                i5 = i2 + d0aVar.c;
                            }
                        }
                        dn8Var.d0.e(d0aVar.c, d0aVar);
                        i5 = i2 + d0aVar.c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.Y;
                d0a d0aVar2 = this.q;
                if (i7 > 1) {
                    d0aVar2.J(0);
                } else {
                    int i8 = d0aVar2.c;
                    dn8Var.d0.b(d0aVar2, i8, 2);
                    i5 += i8;
                }
            }
            dn8Var.d0.a(j, i, i5, i3, dn8Var.l);
        }
        this.T = true;
    }

    public final an8 k(int i) throws l0a {
        an8 an8Var = this.z;
        if (an8Var != null) {
            return an8Var;
        }
        throw l0a.a(null, "Element " + i + " must be in an EditionEntry");
    }

    public final void l() {
        if (!this.y) {
            return;
        }
        if (this.O != -1 && !this.R) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                n95 n95Var = this.p0;
                n95Var.getClass();
                n95Var.j();
                this.y = false;
                return;
            }
            if (((dn8) sparseArray.valueAt(i)).X) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void m(m95 m95Var, int i) {
        d0a d0aVar = this.j;
        if (d0aVar.c >= i) {
            return;
        }
        byte[] bArr = d0aVar.a;
        if (bArr.length < i) {
            d0aVar.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = d0aVar.a;
        int i2 = d0aVar.c;
        m95Var.readFully(bArr2, i2, i - i2);
        d0aVar.L(i);
    }

    public final void n() {
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = false;
        this.k0 = false;
        this.l0 = false;
        this.m0 = 0;
        this.n0 = (byte) 0;
        this.o0 = false;
        this.m.J(0);
    }

    public final long o(long j) throws l0a {
        long j2 = this.u;
        if (j2 == -9223372036854775807L) {
            throw l0a.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = pqf.a;
        return pqf.N(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Code duplicated, block: B:76:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0188  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public final void p(dn8 dn8Var) {
        long j;
        char c;
        long j2;
        long j3;
        long j4;
        long j5;
        su8 su8Var;
        bxe bxeVar;
        boolean z;
        su8 su8VarA;
        long j6 = 0;
        int i = 1;
        char c2 = 0;
        if (!dn8Var.Y) {
            LongSparseArray longSparseArray = this.d;
            if (longSparseArray.size() != 0) {
                ArrayList arrayList = new ArrayList(longSparseArray.size());
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    an8 an8Var = (an8) longSparseArray.valueAt(i2);
                    long j7 = an8Var.e;
                    if (j7 == 0 || j7 == dn8Var.e) {
                        long j8 = an8Var.b;
                        String str = pqf.a;
                        if (j8 != -9223372036854775807L && j8 != Long.MIN_VALUE) {
                            j8 /= 1000000;
                        }
                        long j9 = j8;
                        long j10 = an8Var.c;
                        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
                            j10 /= 1000000;
                        }
                        arrayList.add(new ww1(j9, j10, an8Var.d, an8Var.f != null ? new fu7(an8Var.g, an8Var.f) : null));
                    }
                }
                if (!arrayList.isEmpty()) {
                    rr5 rr5Var = dn8Var.e0;
                    rr5Var.getClass();
                    qr5 qr5VarA = rr5Var.a();
                    su8 su8Var2 = dn8Var.e0.m;
                    qr5VarA.l = su8Var2 != null ? su8Var2.a((qu8[]) arrayList.toArray(new uw1[0])) : new su8(arrayList);
                    dn8Var.e0 = new rr5(qr5VarA);
                    dn8Var.Y = true;
                }
            }
        }
        long j11 = this.w;
        long j12 = this.t;
        long j13 = this.s;
        if (dn8Var.f != 2) {
            return;
        }
        List list = (List) this.E.get(dn8Var.d);
        if (dn8Var.Z || list == null || list.isEmpty()) {
            return;
        }
        if (!list.isEmpty()) {
            int iMin = Math.min(list.size(), 20);
            double d = 0.0d;
            j = -9223372036854775807L;
            int i3 = 0;
            int i4 = -1;
            while (true) {
                if (i3 >= iMin) {
                    c = c2;
                    break;
                }
                long j14 = j6;
                bn8 bn8Var = (bn8) list.get(i3);
                char c3 = c2;
                long j15 = j11;
                long j16 = bn8Var.a;
                c = c3;
                int i5 = i;
                long j17 = bn8Var.c;
                long j18 = j12;
                long j19 = bn8Var.b;
                if (j16 > 10000000) {
                    break;
                }
                if (i3 < list.size() - i5) {
                    bn8 bn8Var2 = (bn8) list.get(i3 + 1);
                    j3 = j13;
                    j4 = (bn8Var2.b + bn8Var2.c) - (j19 + j17);
                    j5 = bn8Var2.a - j16;
                } else {
                    j3 = j13;
                    j4 = (j18 + j3) - (j19 + j17);
                    j5 = j15 - j16;
                }
                if (j5 > j14) {
                    double d2 = j4 / j5;
                    if (d2 > d) {
                        i4 = i3;
                        d = d2;
                    }
                }
                i3++;
                c2 = c;
                j6 = j14;
                j11 = j15;
                j12 = j18;
                j13 = j3;
                i = 1;
            }
            if (i4 != -1) {
                j2 = ((bn8) list.get(i4)).a;
            }
            if (j2 != j) {
                rr5 rr5Var2 = dn8Var.e0;
                rr5Var2.getClass();
                su8Var = rr5Var2.m;
                bxeVar = new bxe(j2);
                if (su8Var == null) {
                    z = true;
                    qu8[] qu8VarArr = new qu8[1];
                    qu8VarArr[c] = bxeVar;
                    su8VarA = new su8(qu8VarArr);
                } else {
                    z = true;
                    qu8[] qu8VarArr2 = new qu8[1];
                    qu8VarArr2[c] = bxeVar;
                    su8VarA = su8Var.a(qu8VarArr2);
                }
                qr5 qr5VarA2 = dn8Var.e0.a();
                qr5VarA2.l = su8VarA;
                dn8Var.e0 = new rr5(qr5VarA2);
                dn8Var.Z = z;
            }
        }
        j = -9223372036854775807L;
        c = 0;
        j2 = j;
        if (j2 != j) {
            rr5 rr5Var3 = dn8Var.e0;
            rr5Var3.getClass();
            su8Var = rr5Var3.m;
            bxeVar = new bxe(j2);
            if (su8Var == null) {
                z = true;
                qu8[] qu8VarArr3 = new qu8[1];
                qu8VarArr3[c] = bxeVar;
                su8VarA = new su8(qu8VarArr3);
            } else {
                z = true;
                qu8[] qu8VarArr4 = new qu8[1];
                qu8VarArr4[c] = bxeVar;
                su8VarA = su8Var.a(qu8VarArr4);
            }
            qr5 qr5VarA3 = dn8Var.e0.a();
            qr5VarA3.l = su8VarA;
            dn8Var.e0 = new rr5(qr5VarA3);
            dn8Var.Z = z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0188  */
    public final int q(m95 m95Var, dn8 dn8Var, int i, boolean z) {
        int iC;
        int iC2;
        int i2;
        boolean z2;
        int i3;
        if ("S_TEXT/UTF8".equals(dn8Var.c)) {
            r(m95Var, q0, i);
            int i4 = this.h0;
            n();
            return i4;
        }
        if ("S_TEXT/ASS".equals(dn8Var.c) || "S_TEXT/SSA".equals(dn8Var.c)) {
            r(m95Var, s0, i);
            int i5 = this.h0;
            n();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(dn8Var.c)) {
            r(m95Var, t0, i);
            int i6 = this.h0;
            n();
            return i6;
        }
        if (dn8Var.X) {
            dn8Var.e0.getClass();
            rr5 rr5VarV = y41.V(m95Var, i, dn8Var.e0);
            dn8Var.e0 = rr5VarV;
            dn8Var.d0.g(rr5VarV);
            dn8Var.X = false;
            l();
        }
        k1f k1fVar = dn8Var.d0;
        boolean z3 = this.j0;
        d0a d0aVar = this.m;
        int i7 = 2;
        if (!z3) {
            boolean z4 = dn8Var.j;
            d0a d0aVar2 = this.j;
            if (z4) {
                this.c0 &= -1073741825;
                boolean z5 = this.k0;
                int i8 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (!z5) {
                    m95Var.readFully(d0aVar2.a, 0, 1);
                    this.g0++;
                    byte b = d0aVar2.a[0];
                    if ((b & 128) == 128) {
                        throw l0a.a(null, "Extension bit is set in signal byte");
                    }
                    this.n0 = b;
                    this.k0 = true;
                }
                byte b2 = this.n0;
                if ((b2 & 1) != 1) {
                    i2 = 2;
                } else {
                    boolean z6 = (b2 & 2) == 2;
                    this.c0 |= 1073741824;
                    if (!this.o0) {
                        d0a d0aVar3 = this.o;
                        m95Var.readFully(d0aVar3.a, 0, 8);
                        this.g0 += 8;
                        this.o0 = true;
                        byte[] bArr = d0aVar2.a;
                        if (!z6) {
                            i8 = 0;
                        }
                        bArr[0] = (byte) (i8 | 8);
                        d0aVar2.M(0);
                        k1fVar.b(d0aVar2, 1, 1);
                        this.h0++;
                        d0aVar3.M(0);
                        k1fVar.b(d0aVar3, 8, 1);
                        this.h0 += 8;
                    }
                    if (z6) {
                        if (!this.l0) {
                            m95Var.readFully(d0aVar2.a, 0, 1);
                            this.g0++;
                            d0aVar2.M(0);
                            this.m0 = d0aVar2.z();
                            this.l0 = true;
                        }
                        int i9 = this.m0 * 4;
                        d0aVar2.J(i9);
                        m95Var.readFully(d0aVar2.a, 0, i9);
                        this.g0 += i9;
                        short s = (short) ((this.m0 / 2) + 1);
                        int i10 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.r;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.r = ByteBuffer.allocate(i10);
                        }
                        this.r.position(0);
                        this.r.putShort(s);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i3 = this.m0;
                            if (i11 >= i3) {
                                break;
                            }
                            int iD = d0aVar2.D();
                            int i13 = i11 % 2;
                            int i14 = i7;
                            ByteBuffer byteBuffer2 = this.r;
                            if (i13 == 0) {
                                byteBuffer2.putShort((short) (iD - i12));
                            } else {
                                byteBuffer2.putInt(iD - i12);
                            }
                            i11++;
                            i12 = iD;
                            i7 = i14;
                        }
                        i2 = i7;
                        int i15 = (i - this.g0) - i12;
                        int i16 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.r;
                        if (i16 == 1) {
                            byteBuffer3.putInt(i15);
                        } else {
                            byteBuffer3.putShort((short) i15);
                            this.r.putInt(0);
                        }
                        byte[] bArrArray = this.r.array();
                        d0a d0aVar4 = this.p;
                        d0aVar4.K(bArrArray, i10);
                        k1fVar.b(d0aVar4, i10, 1);
                        this.h0 += i10;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 2;
                byte[] bArr2 = dn8Var.k;
                if (bArr2 != null) {
                    d0aVar.K(bArr2, bArr2.length);
                }
            }
            if ("A_OPUS".equals(dn8Var.c)) {
                z2 = z;
            } else {
                z2 = dn8Var.h > 0;
            }
            if (z2) {
                this.c0 |= 268435456;
                this.q.J(0);
                int i17 = (d0aVar.c + i) - this.g0;
                d0aVar2.J(4);
                byte[] bArr3 = d0aVar2.a;
                bArr3[0] = (byte) ((i17 >> 24) & 255);
                bArr3[1] = (byte) ((i17 >> 16) & 255);
                bArr3[i2] = (byte) ((i17 >> 8) & 255);
                bArr3[3] = (byte) (i17 & 255);
                k1fVar.b(d0aVar2, 4, i2);
                this.h0 += 4;
            }
            this.j0 = true;
        }
        int i18 = i + d0aVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(dn8Var.c) && !"V_MPEGH/ISO/HEVC".equals(dn8Var.c)) {
            if (dn8Var.W != null) {
                pa7.J(d0aVar.c == 0);
                dn8Var.W.c(m95Var);
            }
            while (true) {
                int i19 = this.g0;
                if (i19 >= i18) {
                    break;
                }
                int i20 = i18 - i19;
                int iA = d0aVar.a();
                if (iA > 0) {
                    iC2 = Math.min(i20, iA);
                    k1fVar.e(iC2, d0aVar);
                } else {
                    iC2 = k1fVar.c(m95Var, i20, false);
                }
                this.g0 += iC2;
                this.h0 += iC2;
            }
        } else {
            d0a d0aVar5 = this.i;
            byte[] bArr4 = d0aVar5.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i21 = dn8Var.f0;
            int i22 = 4 - i21;
            while (this.g0 < i18) {
                int i23 = this.i0;
                if (i23 == 0) {
                    int iMin = Math.min(i21, d0aVar.a());
                    m95Var.readFully(bArr4, i22 + iMin, i21 - iMin);
                    if (iMin > 0) {
                        d0aVar.k(bArr4, i22, iMin);
                    }
                    this.g0 += i21;
                    d0aVar5.M(0);
                    this.i0 = d0aVar5.D();
                    d0a d0aVar6 = this.h;
                    d0aVar6.M(0);
                    k1fVar.e(4, d0aVar6);
                    this.h0 += 4;
                } else {
                    int iA2 = d0aVar.a();
                    if (iA2 > 0) {
                        iC = Math.min(i23, iA2);
                        k1fVar.e(iC, d0aVar);
                    } else {
                        iC = k1fVar.c(m95Var, i23, false);
                    }
                    this.g0 += iC;
                    this.h0 += iC;
                    this.i0 -= iC;
                }
            }
        }
        if ("A_VORBIS".equals(dn8Var.c)) {
            d0a d0aVar7 = this.k;
            d0aVar7.M(0);
            k1fVar.e(4, d0aVar7);
            this.h0 += 4;
        }
        int i24 = this.h0;
        n();
        return i24;
    }

    public final void r(m95 m95Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        d0a d0aVar = this.n;
        byte[] bArr2 = d0aVar.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            d0aVar.getClass();
            d0aVar.K(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        m95Var.readFully(d0aVar.a, bArr.length, i);
        d0aVar.M(0);
        d0aVar.L(length);
    }

    @Override // defpackage.l95
    public final void a() {
    }
}
