package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class py5 implements l95 {
    public static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final rr5 O;
    public oy5 A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public n95 G;
    public k1f[] H;
    public k1f[] I;
    public boolean J;
    public boolean K;
    public long L;
    public long M;
    public final d8e a;
    public final int b;
    public final List c;
    public final SparseArray d;
    public final d0a e;
    public final d0a f;
    public final d0a g;
    public final byte[] h;
    public final d0a i;
    public final fz3 j;
    public final d0a k;
    public final ArrayDeque l;
    public final ArrayDeque m;
    public final a80 n;
    public final oz1 o;
    public yob p;
    public int q;
    public int r;
    public long s;
    public int t;
    public d0a u;
    public long v;
    public int w;
    public long x;
    public long y;
    public long z;

    static {
        qr5 qr5Var = new qr5();
        qr5Var.o = qv8.l("application/x-emsg");
        O = new rr5(qr5Var);
    }

    public py5(d8e d8eVar, int i) {
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
        this.a = d8eVar;
        this.b = i;
        this.c = Collections.unmodifiableList(yobVar);
        this.j = new fz3(5);
        this.k = new d0a(16);
        this.e = new d0a(n16.D);
        this.f = new d0a(6);
        this.g = new d0a();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new d0a(bArr);
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.d = new SparseArray();
        this.p = yobVar;
        this.y = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.G = n95.A;
        this.H = new k1f[0];
        this.I = new k1f[0];
        this.n = new a80(new r45(6, this));
        this.o = new oz1(0);
        this.L = -1L;
        this.M = -1L;
    }

    public static xp4 h(ArrayList arrayList) {
        UUID[] uuidArr;
        m6c m6cVar;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList2 = null;
        while (i2 < size) {
            n49 n49Var = (n49) arrayList.get(i2);
            if (n49Var.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = n49Var.c.a;
                d0a d0aVar = new d0a(bArr);
                if (d0aVar.c < 32) {
                    m6cVar = null;
                } else {
                    d0aVar.M(i);
                    int iA = d0aVar.a();
                    int iM = d0aVar.m();
                    if (iM != iA) {
                        xo1.V("PsshAtomUtil", "Advertised atom size (" + iM + ") does not match buffer size: " + iA);
                    } else {
                        int iM2 = d0aVar.m();
                        if (iM2 != 1886614376) {
                            kv2.w(iM2, "Atom type is not pssh: ", "PsshAtomUtil");
                        } else {
                            int iE = b31.e(d0aVar.m());
                            if (iE > 1) {
                                kv2.w(iE, "Unsupported pssh version: ", "PsshAtomUtil");
                            } else {
                                UUID uuid = new UUID(d0aVar.t(), d0aVar.t());
                                if (iE == 1) {
                                    int iD = d0aVar.D();
                                    uuidArr = new UUID[iD];
                                    int i3 = i;
                                    while (i3 < iD) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i4 = i3;
                                        uuidArr2[i4] = new UUID(d0aVar.t(), d0aVar.t());
                                        i3 = i4 + 1;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                int iD2 = d0aVar.D();
                                int iA2 = d0aVar.a();
                                if (iD2 != iA2) {
                                    xo1.V("PsshAtomUtil", "Atom data size (" + iD2 + ") does not match the bytes left: " + iA2);
                                } else {
                                    byte[] bArr2 = new byte[iD2];
                                    d0aVar.k(bArr2, 0, iD2);
                                    m6cVar = new m6c(uuid, iE, bArr2, uuidArr);
                                }
                            }
                        }
                    }
                    m6cVar = null;
                }
                UUID uuid2 = m6cVar == null ? null : (UUID) m6cVar.b;
                if (uuid2 == null) {
                    xo1.V("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new wp4(uuid2, null, "video/mp4", bArr));
                }
            }
            i2++;
            i = 0;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new xp4(null, false, (wp4[]) arrayList2.toArray(new wp4[0]));
    }

    public static void j(d0a d0aVar, int i, g1f g1fVar) throws l0a {
        d0aVar.M(i + 8);
        int iM = d0aVar.m();
        byte[] bArr = b31.a;
        if ((iM & 1) != 0) {
            throw l0a.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM & 2) != 0;
        int iD = d0aVar.D();
        if (iD == 0) {
            Arrays.fill(g1fVar.l, 0, g1fVar.e, false);
            return;
        }
        int i2 = g1fVar.e;
        d0a d0aVar2 = g1fVar.n;
        if (iD != i2) {
            StringBuilder sbN = ub3.n(iD, "Senc sample count ", " is different from fragment sample count");
            sbN.append(g1fVar.e);
            throw l0a.a(null, sbN.toString());
        }
        Arrays.fill(g1fVar.l, 0, iD, z);
        d0aVar2.J(d0aVar.a());
        g1fVar.k = true;
        g1fVar.o = true;
        d0aVar.k(d0aVar2.a, 0, d0aVar2.c);
        d0aVar2.M(0);
        g1fVar.o = false;
    }

    public static Pair k(long j, d0a d0aVar) throws l0a {
        long jF;
        long jF2;
        d0a d0aVar2 = d0aVar;
        d0aVar2.M(8);
        int iE = b31.e(d0aVar2.m());
        d0aVar2.N(4);
        long jB = d0aVar2.B();
        if (iE == 0) {
            jF = d0aVar2.B();
            jF2 = d0aVar2.B();
        } else {
            jF = d0aVar2.F();
            jF2 = d0aVar2.F();
        }
        long j2 = jF2 + j;
        String str = pqf.a;
        long jN = pqf.N(jF, 1000000L, jB, RoundingMode.DOWN);
        d0aVar2.N(2);
        int iG = d0aVar2.G();
        int[] iArr = new int[iG];
        long[] jArr = new long[iG];
        long[] jArr2 = new long[iG];
        long[] jArr3 = new long[iG];
        long j3 = j2;
        long j4 = jN;
        int i = 0;
        while (i < iG) {
            int iM = d0aVar2.m();
            if ((Integer.MIN_VALUE & iM) != 0) {
                throw l0a.a(null, "Unhandled indirect reference");
            }
            long jB2 = d0aVar2.B();
            iArr[i] = iM & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jF += jB2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jN2 = pqf.N(jF, 1000000L, jB, RoundingMode.DOWN);
            jArr4[i] = jN2 - jArr5[i];
            d0aVar2.N(4);
            j3 += (long) iArr[i];
            i++;
            iG = iG;
            d0aVar2 = d0aVar;
            j4 = jN2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jN), new nz1(iArr, jArr, jArr2, jArr3));
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        yob yobVarS;
        qsd qsdVarO = vpf.O(m95Var, true);
        if (qsdVarO != null) {
            yobVarS = jy6.s(qsdVarO);
        } else {
            ey6 ey6Var = jy6.b;
            yobVarS = yob.e;
        }
        this.p = yobVarS;
        return qsdVarO == null;
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((oy5) sparseArray.valueAt(i)).e();
        }
        this.m.clear();
        this.w = 0;
        ((PriorityQueue) this.n.f).clear();
        this.x = j2;
        this.l.clear();
        this.M = -1L;
        g();
    }

    @Override // defpackage.l95
    public final List d() {
        return this.p;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0213  */
    /* JADX WARN: Code duplicated, block: B:121:0x0253  */
    /* JADX WARN: Code duplicated, block: B:144:0x029c  */
    /* JADX WARN: Code duplicated, block: B:145:0x029e  */
    /* JADX WARN: Code duplicated, block: B:419:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:426:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:429:0x0907  */
    /* JADX WARN: Code duplicated, block: B:431:0x090e  */
    /* JADX WARN: Code duplicated, block: B:432:0x0938  */
    /* JADX WARN: Code duplicated, block: B:434:0x0944  */
    /* JADX WARN: Code duplicated, block: B:441:0x0964  */
    /* JADX WARN: Code duplicated, block: B:449:0x0991  */
    /* JADX WARN: Code duplicated, block: B:451:0x0998 A[LOOP:2: B:450:0x0996->B:451:0x0998, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:454:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:455:0x09bb  */
    /* JADX WARN: Code duplicated, block: B:457:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:551:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:553:0x0add  */
    /* JADX WARN: Code duplicated, block: B:558:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:559:0x0b0e  */
    /* JADX WARN: Code duplicated, block: B:564:0x0b19  */
    /* JADX WARN: Code duplicated, block: B:573:0x05bb A[SYNTHETIC] */
    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) throws l0a {
        ArrayDeque arrayDeque;
        a80 a80Var;
        oz1 oz1Var;
        int i;
        d0a d0aVar;
        ArrayDeque arrayDeque2;
        String strU;
        long jB;
        String str;
        long j;
        long j2;
        long j3;
        int i2;
        char c;
        oy5 oy5Var;
        boolean z;
        int iC;
        int i3;
        boolean z2;
        String strF;
        byte b;
        int i4;
        int iD;
        int i5;
        int i6;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long position;
        int i7;
        int i8;
        long j9;
        long j10;
        int size;
        int i9;
        m95 m95Var2 = m95Var;
        loop0: while (true) {
            d82 d82Var2 = d82Var;
            while (true) {
                int i10 = this.q;
                arrayDeque = this.l;
                a80Var = this.n;
                oz1Var = this.o;
                i = this.b;
                SparseArray sparseArray = this.d;
                d0aVar = this.i;
                boolean z3 = true;
                if (i10 != 0) {
                    arrayDeque2 = this.m;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            int i11 = 2;
                            c = 6;
                            if (i10 == 5) {
                                d0aVar.J(16);
                                if (m95Var2.a(d0aVar.a, 0, 16, true)) {
                                    d0aVar.M(0);
                                    int iM = d0aVar.m();
                                    int iM2 = d0aVar.m();
                                    if (iM == 16 && iM2 == 1835430511) {
                                        d0aVar.N(4);
                                        long jB2 = d0aVar.B();
                                        long length = m95Var2.getLength() - jB2;
                                        if (jB2 <= 0 || jB2 > 2147483647L || length < 0 || length < this.M) {
                                            i(new ir0(this.y, this.M), d82Var2);
                                        } else {
                                            d82Var2.b = length;
                                            this.q = 6;
                                        }
                                    } else {
                                        i(new ir0(this.y, this.M), d82Var2);
                                    }
                                } else {
                                    i(new ir0(this.y, this.M), d82Var2);
                                }
                                int i12 = this.q;
                                if (i12 == 6 || i12 == 0) {
                                    return 1;
                                }
                            } else if (i10 != 6) {
                                oy5Var = this.A;
                                if (oy5Var != null) {
                                    z = true;
                                    break loop0;
                                }
                                int size2 = sparseArray.size();
                                int i13 = 0;
                                oy5 oy5Var2 = null;
                                long j11 = Long.MAX_VALUE;
                                while (i13 < size2) {
                                    oy5 oy5Var3 = (oy5) sparseArray.valueAt(i13);
                                    boolean z4 = z3;
                                    boolean z5 = oy5Var3.n;
                                    g1f g1fVar = oy5Var3.b;
                                    if (z5) {
                                        i5 = size2;
                                    } else {
                                        i5 = size2;
                                        if (oy5Var3.f != oy5Var3.d.b) {
                                        }
                                        i13++;
                                        size2 = i5;
                                        z3 = z4;
                                    }
                                    if (!z5 || oy5Var3.h != g1fVar.d) {
                                        long j12 = !z5 ? oy5Var3.d.c[oy5Var3.f] : g1fVar.f[oy5Var3.h];
                                        if (j12 < j11) {
                                            oy5Var2 = oy5Var3;
                                            j11 = j12;
                                        }
                                    }
                                    i13++;
                                    size2 = i5;
                                    z3 = z4;
                                }
                                z = z3;
                                if (oy5Var2 != null) {
                                    int position2 = (int) ((!oy5Var2.n ? oy5Var2.d.c[oy5Var2.f] : oy5Var2.b.f[oy5Var2.h]) - m95Var2.getPosition());
                                    if (position2 < 0) {
                                        xo1.V("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                        position2 = 0;
                                    }
                                    m95Var2.l(position2);
                                    this.A = oy5Var2;
                                    oy5Var = oy5Var2;
                                    break loop0;
                                }
                                int position3 = (int) (this.v - m95Var2.getPosition());
                                if (position3 < 0) {
                                    throw l0a.a(null, "Offset to end of mdat was negative.");
                                }
                                m95Var2.l(position3);
                                g();
                            } else {
                                long length2 = m95Var2.getLength() - m95Var2.getPosition();
                                d0aVar.J(8);
                                if (m95Var2.d(d0aVar.a, 0, 8, true)) {
                                    d0aVar.M(0);
                                    int iM3 = d0aVar.m();
                                    if (d0aVar.m() != 1835430497) {
                                        i(new ir0(this.y, this.M), d82Var2);
                                    } else {
                                        int i14 = (int) length2;
                                        d0a d0aVar2 = new d0a(i14);
                                        m95Var2.readFully(d0aVar2.a, 0, i14);
                                        d0aVar2.M(iM3 == 1 ? 16 : 8);
                                        SparseArray sparseArray2 = new SparseArray();
                                        SparseArray sparseArray3 = new SparseArray();
                                        while (d0aVar2.a() >= 8) {
                                            int i15 = d0aVar2.b;
                                            long jB3 = d0aVar2.B();
                                            int iM4 = d0aVar2.m();
                                            if (jB3 == 1) {
                                                if (d0aVar2.a() < 8) {
                                                    break;
                                                }
                                                jB3 = d0aVar2.t();
                                            } else if (jB3 == 0) {
                                                jB3 = ((long) d0aVar2.c) - ((long) i15);
                                            }
                                            int i16 = jB3 == 1 ? 16 : 8;
                                            if (jB3 < i16) {
                                                break;
                                            }
                                            long j13 = i15;
                                            if (jB3 > ((long) d0aVar2.c) - j13) {
                                                break;
                                            }
                                            if (iM4 != 1952871009) {
                                                j4 = jB3;
                                                j5 = j13;
                                            } else if (jB3 < i16 + 16) {
                                                d0aVar2.M((int) (j13 + jB3));
                                            } else {
                                                int iE = b31.e(d0aVar2.m());
                                                int iM5 = d0aVar2.m();
                                                oy5 oy5Var4 = (oy5) sparseArray.get(iM5);
                                                if (oy5Var4 == null) {
                                                    d0aVar2.M((int) (j13 + jB3));
                                                } else {
                                                    long j14 = oy5Var4.d.a.c;
                                                    int iM6 = d0aVar2.m();
                                                    int i17 = (iM6 >> 4) & 3;
                                                    int i18 = (iM6 >> 2) & 3;
                                                    int i19 = iM6 & 3;
                                                    j4 = jB3;
                                                    long jB4 = d0aVar2.B();
                                                    int i20 = i17 + 1;
                                                    int i21 = i18 + 1;
                                                    j5 = j13;
                                                    int i22 = i19 + 1;
                                                    if (((iE == 1 ? 16L : 8L) + ((long) i20) + ((long) i21) + ((long) i22)) * jB4 > d0aVar2.a()) {
                                                        d0aVar2.M((int) (j5 + j4));
                                                    } else {
                                                        int i23 = (int) jB4;
                                                        long[] jArr = new long[i23];
                                                        long[] jArr2 = new long[i23];
                                                        int i24 = 0;
                                                        while (i24 < i23) {
                                                            int i25 = i23;
                                                            long jF = iE == 1 ? d0aVar2.F() : d0aVar2.B();
                                                            long jF2 = iE == 1 ? d0aVar2.F() : d0aVar2.B();
                                                            d0aVar2.N(i20 + i21 + i22);
                                                            if (j14 != -9223372036854775807L) {
                                                                jF = pqf.N(jF, 1000000L, j14, RoundingMode.DOWN);
                                                            }
                                                            jArr[i24] = jF;
                                                            jArr2[i24] = jF2;
                                                            i24++;
                                                            i23 = i25;
                                                        }
                                                        sparseArray2.put(iM5, jArr);
                                                        sparseArray3.put(iM5, jArr2);
                                                    }
                                                }
                                            }
                                            d0aVar2.M((int) (j5 + j4));
                                        }
                                        if (sparseArray2.size() == 0) {
                                            i(new ir0(this.y, this.M), d82Var2);
                                        } else {
                                            int iKeyAt = -1;
                                            int i26 = -1;
                                            int i27 = 0;
                                            while (i27 < sparseArray2.size()) {
                                                int iKeyAt2 = sparseArray2.keyAt(i27);
                                                oy5 oy5Var5 = (oy5) sparseArray.get(iKeyAt2);
                                                if (oy5Var5 != null) {
                                                    int i28 = oy5Var5.d.a.b;
                                                    if (iKeyAt == -1 && i28 == i11) {
                                                        iKeyAt = iKeyAt2;
                                                    } else if (i26 == -1 && i28 == 1) {
                                                        i26 = iKeyAt2;
                                                    }
                                                }
                                                i27++;
                                                i11 = 2;
                                            }
                                            if (iKeyAt != -1) {
                                                i6 = iKeyAt;
                                            } else if (i26 != -1) {
                                                i6 = i26;
                                            } else {
                                                iKeyAt = sparseArray2.keyAt(0);
                                                i6 = iKeyAt;
                                            }
                                            i(new ny5(sparseArray2, sparseArray3, this.y, this.M, i6), d82Var2);
                                        }
                                    }
                                } else {
                                    i(new ir0(this.y, this.M), d82Var2);
                                }
                                if (this.q == 0) {
                                    return 1;
                                }
                            }
                        } else {
                            int size3 = sparseArray.size();
                            oy5 oy5Var6 = null;
                            long j15 = Long.MAX_VALUE;
                            for (int i29 = 0; i29 < size3; i29++) {
                                g1f g1fVar2 = ((oy5) sparseArray.valueAt(i29)).b;
                                if (g1fVar2.o) {
                                    long j16 = g1fVar2.c;
                                    if (j16 < j15) {
                                        oy5Var6 = (oy5) sparseArray.valueAt(i29);
                                        j15 = j16;
                                    }
                                }
                            }
                            if (oy5Var6 == null) {
                                this.q = 3;
                            } else {
                                int position4 = (int) (j15 - m95Var2.getPosition());
                                if (position4 < 0) {
                                    throw l0a.a(null, "Offset to encryption data was negative.");
                                }
                                m95Var2.l(position4);
                                g1f g1fVar3 = oy5Var6.b;
                                d0a d0aVar3 = g1fVar3.n;
                                m95Var2.readFully(d0aVar3.a, 0, d0aVar3.c);
                                d0aVar3.M(0);
                                g1fVar3.o = false;
                            }
                        }
                    }
                } else {
                    int i30 = this.t;
                    d0a d0aVar4 = this.k;
                    if (i30 == 0) {
                        if (!m95Var2.a(d0aVar4.a, 0, 8, true)) {
                            long j17 = this.L;
                            if (j17 == -1) {
                                a80Var.o(0);
                                return -1;
                            }
                            d82Var.b = j17;
                            this.L = -1L;
                            this.G.q(oz1Var.d());
                            this.K = true;
                            return 1;
                        }
                        this.t = 8;
                        d0aVar4.M(0);
                        this.s = d0aVar4.B();
                        this.r = d0aVar4.m();
                    }
                    long j18 = this.s;
                    if (j18 == 1) {
                        m95Var2.readFully(d0aVar4.a, 8, 8);
                        this.t += 8;
                        this.s = d0aVar4.F();
                    } else {
                        if (j18 == 0) {
                            long length3 = m95Var2.getLength();
                            if (length3 == -1 && !arrayDeque.isEmpty()) {
                                length3 = ((m49) arrayDeque.peek()).c;
                            }
                            if (length3 != -1) {
                                this.s = (length3 - m95Var2.getPosition()) + ((long) this.t);
                            }
                        }
                        j6 = this.s;
                        int i31 = this.t;
                        j7 = i31;
                        if (j6 >= j7) {
                            j8 = j7;
                        } else {
                            if (this.r == 1718773093 || i31 != 8) {
                                throw l0a.b("Atom size less than header length (unsupported).");
                            }
                            this.s = j7;
                            j6 = j7;
                            j8 = j6;
                        }
                        if (this.L != r3) {
                            if (this.r == 1936286840) {
                                d0aVar.J((int) j6);
                                System.arraycopy(d0aVar4.a, 0, d0aVar.a, 0, 8);
                                m95Var2.readFully(d0aVar.a, 8, (int) (this.s - ((long) this.t)));
                                oz1Var.a((nz1) k(m95Var2.e(), d0aVar).second);
                            } else {
                                m95Var2.c((int) (j6 - j8), true);
                            }
                            g();
                        } else {
                            position = m95Var2.getPosition() - ((long) this.t);
                            i7 = this.r;
                            if ((i7 == 1836019558 && i7 != 1835295092) || this.J) {
                                if (this.r == 1836019558) {
                                    size = sparseArray.size();
                                    for (i9 = 0; i9 < size; i9++) {
                                        g1f g1fVar4 = ((oy5) sparseArray.valueAt(i9)).b;
                                        g1fVar4.getClass();
                                        g1fVar4.c = position;
                                        g1fVar4.b = position;
                                    }
                                }
                                i8 = this.r;
                                if (i8 == 1835295092) {
                                    this.A = null;
                                    this.v = position + this.s;
                                    this.q = 2;
                                } else if (i8 != 1836019574) {
                                    long position5 = m95Var2.getPosition();
                                    j9 = this.s;
                                    j10 = (position5 + j9) - 8;
                                    if (j9 != this.t) {
                                        d0aVar.J(8);
                                        m95Var2.o(d0aVar.a, 0, 8);
                                        b31.a(d0aVar);
                                        m95Var2.l(d0aVar.b);
                                        m95Var2.k();
                                    }
                                    arrayDeque.push(new m49(this.r, j10));
                                    if (this.s == this.t) {
                                        l(j10);
                                    } else {
                                        g();
                                    }
                                } else {
                                    long position6 = m95Var2.getPosition();
                                    j9 = this.s;
                                    j10 = (position6 + j9) - 8;
                                    if (j9 != this.t) {
                                        d0aVar.J(8);
                                        m95Var2.o(d0aVar.a, 0, 8);
                                        b31.a(d0aVar);
                                        m95Var2.l(d0aVar.b);
                                        m95Var2.k();
                                    }
                                    arrayDeque.push(new m49(this.r, j10));
                                    if (this.s == this.t) {
                                        l(j10);
                                    } else {
                                        g();
                                    }
                                }
                            } else if (m95Var2.getLength() == r3 && this.M == -1 && (i & 512) != 0) {
                                this.M = position;
                                d82Var.b = m95Var2.getLength() - 16;
                                this.q = 5;
                            } else {
                                this.G.q(new ir0(this.y, position));
                                this.J = true;
                                if (this.r == 1836019558) {
                                    size = sparseArray.size();
                                    while (i9 < size) {
                                        g1f g1fVar5 = ((oy5) sparseArray.valueAt(i9)).b;
                                        g1fVar5.getClass();
                                        g1fVar5.c = position;
                                        g1fVar5.b = position;
                                    }
                                }
                                i8 = this.r;
                                if (i8 == 1835295092) {
                                    this.A = null;
                                    this.v = position + this.s;
                                    this.q = 2;
                                } else if (i8 != 1836019574 || i8 == 1953653099 || i8 == 1835297121 || i8 == 1835626086 || i8 == 1937007212 || i8 == 1836019558 || i8 == 1953653094 || i8 == 1836475768 || i8 == 1701082227 || i8 == 1835365473) {
                                    long position7 = m95Var2.getPosition();
                                    j9 = this.s;
                                    j10 = (position7 + j9) - 8;
                                    if (j9 != this.t && this.r == 1835365473) {
                                        d0aVar.J(8);
                                        m95Var2.o(d0aVar.a, 0, 8);
                                        b31.a(d0aVar);
                                        m95Var2.l(d0aVar.b);
                                        m95Var2.k();
                                    }
                                    arrayDeque.push(new m49(this.r, j10));
                                    if (this.s == this.t) {
                                        l(j10);
                                    } else {
                                        g();
                                    }
                                } else if (i8 == 1751411826 || i8 == 1835296868 || i8 == 1836476516 || i8 == 1936286840 || i8 == 1937011556 || i8 == 1937011827 || i8 == 1668576371 || i8 == 1937011555 || i8 == 1937011578 || i8 == 1937013298 || i8 == 1937007471 || i8 == 1668232756 || i8 == 1937011571 || i8 == 1952867444 || i8 == 1952868452 || i8 == 1953196132 || i8 == 1953654136 || i8 == 1953658222 || i8 == 1886614376 || i8 == 1935763834 || i8 == 1935763823 || i8 == 1936027235 || i8 == 1970628964 || i8 == 1935828848 || i8 == 1936158820 || i8 == 1701606260 || i8 == 1835362404 || i8 == 1701671783 || i8 == 1969517665 || i8 == 1801812339 || i8 == 1768715124) {
                                    if (this.t != 8) {
                                        throw l0a.b("Leaf atom defines extended atom size (unsupported).");
                                    }
                                    if (this.s > 2147483647L) {
                                        throw l0a.b("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                    d0a d0aVar5 = new d0a((int) this.s);
                                    System.arraycopy(d0aVar4.a, 0, d0aVar5.a, 0, 8);
                                    this.u = d0aVar5;
                                    this.q = 1;
                                } else {
                                    if (this.s > 2147483647L) {
                                        throw l0a.b("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                    this.u = null;
                                    this.q = 1;
                                }
                            }
                        }
                        if (this.q == 5) {
                            return 1;
                        }
                        d82Var2 = d82Var;
                    }
                    j6 = this.s;
                    int i32 = this.t;
                    j7 = i32;
                    if (j6 >= j7) {
                        if (this.r == 1718773093) {
                        }
                        throw l0a.b("Atom size less than header length (unsupported).");
                    }
                    j8 = j7;
                    if (this.L != r3) {
                        if (this.r == 1936286840) {
                            d0aVar.J((int) j6);
                            System.arraycopy(d0aVar4.a, 0, d0aVar.a, 0, 8);
                            m95Var2.readFully(d0aVar.a, 8, (int) (this.s - ((long) this.t)));
                            oz1Var.a((nz1) k(m95Var2.e(), d0aVar).second);
                        } else {
                            m95Var2.c((int) (j6 - j8), true);
                        }
                        g();
                    } else {
                        position = m95Var2.getPosition() - ((long) this.t);
                        i7 = this.r;
                        if (i7 == 1836019558) {
                            if (m95Var2.getLength() == r3) {
                            }
                            this.G.q(new ir0(this.y, position));
                            this.J = true;
                            if (this.r == 1836019558) {
                                size = sparseArray.size();
                                while (i9 < size) {
                                    g1f g1fVar6 = ((oy5) sparseArray.valueAt(i9)).b;
                                    g1fVar6.getClass();
                                    g1fVar6.c = position;
                                    g1fVar6.b = position;
                                }
                            }
                            i8 = this.r;
                            if (i8 == 1835295092) {
                                this.A = null;
                                this.v = position + this.s;
                                this.q = 2;
                            } else if (i8 != 1836019574) {
                                long position8 = m95Var2.getPosition();
                                j9 = this.s;
                                j10 = (position8 + j9) - 8;
                                if (j9 != this.t) {
                                    d0aVar.J(8);
                                    m95Var2.o(d0aVar.a, 0, 8);
                                    b31.a(d0aVar);
                                    m95Var2.l(d0aVar.b);
                                    m95Var2.k();
                                }
                                arrayDeque.push(new m49(this.r, j10));
                                if (this.s == this.t) {
                                    l(j10);
                                } else {
                                    g();
                                }
                            } else {
                                long position9 = m95Var2.getPosition();
                                j9 = this.s;
                                j10 = (position9 + j9) - 8;
                                if (j9 != this.t) {
                                    d0aVar.J(8);
                                    m95Var2.o(d0aVar.a, 0, 8);
                                    b31.a(d0aVar);
                                    m95Var2.l(d0aVar.b);
                                    m95Var2.k();
                                }
                                arrayDeque.push(new m49(this.r, j10));
                                if (this.s == this.t) {
                                    l(j10);
                                } else {
                                    g();
                                }
                            }
                        } else {
                            if (m95Var2.getLength() == r3) {
                            }
                            this.G.q(new ir0(this.y, position));
                            this.J = true;
                            if (this.r == 1836019558) {
                                size = sparseArray.size();
                                while (i9 < size) {
                                    g1f g1fVar7 = ((oy5) sparseArray.valueAt(i9)).b;
                                    g1fVar7.getClass();
                                    g1fVar7.c = position;
                                    g1fVar7.b = position;
                                }
                            }
                            i8 = this.r;
                            if (i8 == 1835295092) {
                                this.A = null;
                                this.v = position + this.s;
                                this.q = 2;
                            } else if (i8 != 1836019574) {
                                long position10 = m95Var2.getPosition();
                                j9 = this.s;
                                j10 = (position10 + j9) - 8;
                                if (j9 != this.t) {
                                    d0aVar.J(8);
                                    m95Var2.o(d0aVar.a, 0, 8);
                                    b31.a(d0aVar);
                                    m95Var2.l(d0aVar.b);
                                    m95Var2.k();
                                }
                                arrayDeque.push(new m49(this.r, j10));
                                if (this.s == this.t) {
                                    l(j10);
                                } else {
                                    g();
                                }
                            } else {
                                long position11 = m95Var2.getPosition();
                                j9 = this.s;
                                j10 = (position11 + j9) - 8;
                                if (j9 != this.t) {
                                    d0aVar.J(8);
                                    m95Var2.o(d0aVar.a, 0, 8);
                                    b31.a(d0aVar);
                                    m95Var2.l(d0aVar.b);
                                    m95Var2.k();
                                }
                                arrayDeque.push(new m49(this.r, j10));
                                if (this.s == this.t) {
                                    l(j10);
                                } else {
                                    g();
                                }
                            }
                        }
                    }
                    if (this.q == 5) {
                        return 1;
                    }
                    d82Var2 = d82Var;
                }
            }
            int i33 = (int) (this.s - ((long) this.t));
            d0a d0aVar6 = this.u;
            if (d0aVar6 != null) {
                m95Var2.readFully(d0aVar6.a, 8, i33);
                int i34 = this.r;
                n49 n49Var = new n49(i34, d0aVar6);
                if (!arrayDeque.isEmpty()) {
                    ((m49) arrayDeque.peek()).d.add(n49Var);
                } else if (i34 == 1936286840) {
                    Pair pairK = k(m95Var2.getPosition(), d0aVar6);
                    oz1Var.a((nz1) pairK.second);
                    LinkedHashMap linkedHashMap = oz1Var.a;
                    this.z = ((Long) pairK.first).longValue();
                    if (this.K) {
                        i2 = 1;
                    } else {
                        i2 = 1;
                        this.G.q(linkedHashMap.size() == 1 ? (xsc) pairK.second : oz1Var.d());
                        this.J = true;
                    }
                    if ((i & 256) != 0 && !this.K && linkedHashMap.size() > i2) {
                        this.L = m95Var2.getPosition();
                    }
                } else if (i34 == 1701671783 && this.H.length != 0) {
                    d0aVar6.M(8);
                    int iE2 = b31.e(d0aVar6.m());
                    if (iE2 == 0) {
                        strU = d0aVar6.u();
                        strU.getClass();
                        String strU2 = d0aVar6.u();
                        strU2.getClass();
                        long jB5 = d0aVar6.B();
                        long jB6 = d0aVar6.B();
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        long jN = pqf.N(jB6, 1000000L, jB5, roundingMode);
                        long j19 = this.z;
                        long j20 = j19 != -9223372036854775807L ? j19 + jN : -9223372036854775807L;
                        long jN2 = pqf.N(d0aVar6.B(), 1000L, jB5, roundingMode);
                        jB = d0aVar6.B();
                        str = strU2;
                        j = j20;
                        j2 = jN2;
                        j3 = jN;
                    } else if (iE2 != 1) {
                        kv2.w(iE2, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                    } else {
                        long jB7 = d0aVar6.B();
                        long jF3 = d0aVar6.F();
                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                        long jN3 = pqf.N(jF3, 1000000L, jB7, roundingMode2);
                        long jN4 = pqf.N(d0aVar6.B(), 1000L, jB7, roundingMode2);
                        long jB8 = d0aVar6.B();
                        strU = d0aVar6.u();
                        strU.getClass();
                        String strU3 = d0aVar6.u();
                        strU3.getClass();
                        jB = jB8;
                        str = strU3;
                        j2 = jN4;
                        j3 = -9223372036854775807L;
                        j = jN3;
                    }
                    byte[] bArr = new byte[d0aVar6.a()];
                    d0aVar6.k(bArr, 0, d0aVar6.a());
                    fz3 fz3Var = this.j;
                    DataOutputStream dataOutputStream = (DataOutputStream) fz3Var.c;
                    ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) fz3Var.b;
                    byteArrayOutputStream.reset();
                    try {
                        dataOutputStream.writeBytes(strU);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeBytes(str);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeLong(j2);
                        dataOutputStream.writeLong(jB);
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        d0a d0aVar7 = new d0a(byteArrayOutputStream.toByteArray());
                        int iA = d0aVar7.a();
                        for (k1f k1fVar : this.H) {
                            d0aVar7.M(0);
                            k1fVar.e(iA, d0aVar7);
                        }
                        if (j == -9223372036854775807L) {
                            arrayDeque2.addLast(new my5(iA, j3, true));
                            this.w += iA;
                        } else if (arrayDeque2.isEmpty()) {
                            for (k1f k1fVar2 : this.H) {
                                k1fVar2.a(j, 1, iA, 0, null);
                            }
                        } else {
                            arrayDeque2.addLast(new my5(iA, j, false));
                            this.w += iA;
                        }
                    } catch (IOException e) {
                        yg5.p(e);
                        return 0;
                    }
                }
                m95Var2 = m95Var;
            } else {
                m95Var2.l(i33);
            }
            l(m95Var2.getPosition());
        }
        k1f k1fVar3 = oy5Var.a;
        g1f g1fVar8 = oy5Var.b;
        String str2 = "video/hevc";
        if (this.q == 3) {
            this.B = !oy5Var.n ? oy5Var.d.d[oy5Var.f] : g1fVar8.h[oy5Var.f];
            rr5 rr5Var = oy5Var.d.a.g;
            this.E = !((!Objects.equals(rr5Var.p, "video/avc") ? !(!Objects.equals(rr5Var.p, "video/hevc") || (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) : (i & 64) != 0) ? false : z);
            if (oy5Var.f < oy5Var.i) {
                m95Var2.l(this.B);
                f1f f1fVarB = oy5Var.b();
                if (f1fVarB != null) {
                    d0a d0aVar8 = g1fVar8.n;
                    int i35 = f1fVarB.d;
                    if (i35 != 0) {
                        d0aVar8.N(i35);
                    }
                    int i36 = oy5Var.f;
                    if (g1fVar8.k && g1fVar8.l[i36]) {
                        d0aVar8.N(d0aVar8.G() * 6);
                    }
                }
                if (!oy5Var.c()) {
                    this.A = null;
                }
                this.q = 3;
                return 0;
            }
            if (oy5Var.d.a.h == z) {
                this.B -= 8;
                m95Var2.l(8);
            }
            boolean zEquals = "audio/ac4".equals(oy5Var.d.a.g.p);
            int i37 = this.B;
            if (zEquals) {
                this.C = oy5Var.d(i37, 7);
                g21.N(this.B, d0aVar);
                k1fVar3.e(7, d0aVar);
                iD = this.C + 7;
                this.C = iD;
                i4 = 0;
            } else {
                i4 = 0;
                iD = oy5Var.d(i37, 0);
                this.C = iD;
            }
            this.B += iD;
            this.q = 4;
            this.D = i4;
        }
        n1f n1fVar = oy5Var.d;
        d1f d1fVar = n1fVar.a;
        long j21 = !oy5Var.n ? n1fVar.f[oy5Var.f] : g1fVar8.i[oy5Var.f];
        int i38 = d1fVar.k;
        rr5 rr5Var2 = d1fVar.g;
        if (i38 == 0) {
            rr5 rr5Var3 = oy5Var.l;
            if (rr5Var3 != null && y41.z(rr5Var2.p)) {
                rr5 rr5VarV = y41.V(m95Var2, this.B, oy5Var.m);
                oy5Var.m = rr5VarV;
                qr5 qr5VarA = rr5VarV.a();
                qr5VarA.s = rr5Var3.t;
                k1fVar3.g(new rr5(qr5VarA));
                oy5Var.l = null;
            }
            while (true) {
                int i39 = this.C;
                int i40 = this.B;
                if (i39 >= i40) {
                    break;
                }
                this.C += k1fVar3.c(m95Var2, i40 - i39, false);
            }
        } else {
            d0a d0aVar9 = this.f;
            byte[] bArr2 = d0aVar9.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i41 = 4 - i38;
            while (true) {
                i38 = i38;
                if (this.C < this.B) {
                    int i42 = this.D;
                    if (i42 == 0) {
                        if (this.I.length > 0 || !this.E) {
                            int iK = n16.K(rr5Var2);
                            if (i38 + iK <= this.B - this.C) {
                                i3 = iK;
                            } else {
                                i3 = 0;
                            }
                        } else {
                            i3 = 0;
                        }
                        m95Var2.readFully(bArr2, i41, i38 + i3);
                        d0aVar9.M(0);
                        int iM7 = d0aVar9.m();
                        if (iM7 < 0) {
                            throw l0a.a(null, "Invalid NAL length");
                        }
                        this.D = iM7 - i3;
                        d0a d0aVar10 = this.e;
                        int i43 = i41;
                        d0aVar10.M(0);
                        k1fVar3.e(4, d0aVar10);
                        this.C += 4;
                        this.B += i43;
                        if (this.I.length > 0 && i3 > 0 && (strF = n16.F(rr5Var2)) != null) {
                            switch (strF.hashCode()) {
                                case -1662541442:
                                    if (strF.equals(str2)) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1331836730:
                                    if (strF.equals("video/avc")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1331856911:
                                    if (strF.equals("video/vvc")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                    if (((bArr2[4] & 126) >> 1) == 39) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    break;
                                case 1:
                                    if ((bArr2[4] & 31) == c) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    break;
                                case 2:
                                    if (((bArr2[5] & 248) >> 3) == 23) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    break;
                                default:
                                    z2 = false;
                                    break;
                            }
                        } else {
                            z2 = false;
                        }
                        this.F = z2;
                        k1fVar3.e(i3, d0aVar9);
                        this.C += i3;
                        if (i3 > 0 && !this.E && n16.G(bArr2, i3, rr5Var2)) {
                            this.E = true;
                        }
                        i41 = i43;
                    } else {
                        int i44 = i41;
                        if (this.F) {
                            d0a d0aVar11 = this.g;
                            d0aVar11.J(i42);
                            m95Var2.readFully(d0aVar11.a, 0, this.D);
                            k1fVar3.e(this.D, d0aVar11);
                            int i45 = this.D;
                            int iA0 = n16.a0(d0aVar11.a, d0aVar11.c);
                            d0aVar11.M(0);
                            d0aVar11.L(iA0);
                            int i46 = rr5Var2.r;
                            if (i46 == -1) {
                                if (a80Var.b != 0) {
                                    a80Var.D(0);
                                }
                            } else if (a80Var.b != i46) {
                                a80Var.D(i46);
                            }
                            a80Var.a(j21, d0aVar11);
                            if ((oy5Var.a() & 4) != 0) {
                                a80Var.o(0);
                            }
                            iC = i45;
                        } else {
                            iC = k1fVar3.c(m95Var2, i42, false);
                        }
                        this.C += iC;
                        this.D -= iC;
                        i41 = i44;
                        str2 = str2;
                    }
                    c = 6;
                }
            }
        }
        int iA2 = oy5Var.a();
        if (!this.E) {
            iA2 |= 67108864;
        }
        int i47 = iA2;
        f1f f1fVarB2 = oy5Var.b();
        long j22 = j21;
        k1fVar3.a(j22, i47, this.B, 0, f1fVarB2 != null ? f1fVarB2.c : null);
        while (!arrayDeque2.isEmpty()) {
            my5 my5Var = (my5) arrayDeque2.removeFirst();
            this.w -= my5Var.c;
            long j23 = my5Var.a;
            if (my5Var.b) {
                j23 += j22;
            }
            long j24 = j23;
            for (k1f k1fVar4 : this.H) {
                k1fVar4.a(j24, 1, my5Var.c, this.w, null);
            }
        }
        if (!oy5Var.c()) {
            this.A = null;
        }
        this.q = 3;
        return 0;
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            n95Var = new zi0(n95Var, this.a);
        }
        this.G = n95Var;
        g();
        k1f[] k1fVarArr = new k1f[2];
        this.H = k1fVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            k1fVarArr[0] = this.G.n(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        k1f[] k1fVarArr2 = (k1f[]) pqf.J(i, this.H);
        this.H = k1fVarArr2;
        for (k1f k1fVar : k1fVarArr2) {
            k1fVar.g(O);
        }
        List list = this.c;
        this.I = new k1f[list.size()];
        while (i4 < this.I.length) {
            k1f k1fVarN = this.G.n(i3, 3);
            k1fVarN.g((rr5) list.get(i4));
            this.I[i4] = k1fVarN;
            i4++;
            i3++;
        }
    }

    public final void g() {
        this.q = 0;
        this.t = 0;
    }

    public final void i(xsc xscVar, d82 d82Var) {
        this.G.q(xscVar);
        this.J = true;
        d82Var.b = this.M;
        g();
    }

    /* JADX WARN: Code duplicated, block: B:194:0x047e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0493 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x0495  */
    /* JADX WARN: Code duplicated, block: B:200:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:203:0x04ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:205:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:207:0x04bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x04be  */
    /* JADX WARN: Code duplicated, block: B:209:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:216:0x04db  */
    /* JADX WARN: Code duplicated, block: B:219:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:220:0x0501  */
    /* JADX WARN: Code duplicated, block: B:226:0x0515  */
    /* JADX WARN: Code duplicated, block: B:302:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:393:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x052a A[SYNTHETIC] */
    public final void l(long j) throws l0a {
        su8 su8Var;
        long j2;
        is3 is3Var;
        int i;
        is3 is3Var2;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i3;
        byte[] bArr;
        int i4;
        boolean z;
        oy5 oy5Var;
        int i5;
        d0a d0aVar;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z2;
        int i6;
        oy5 oy5Var2;
        long j3;
        long j4;
        int i7;
        int iM;
        long[] jArr2;
        int iM2;
        int iM3;
        int iM4;
        long jN;
        oy5 oy5Var3;
        boolean z3;
        int i8;
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty() || ((m49) arrayDeque.peek()).c != j) {
                break;
            }
            m49 m49Var = (m49) arrayDeque.pop();
            int i9 = m49Var.b;
            ArrayList arrayList4 = m49Var.e;
            ArrayList arrayList5 = m49Var.d;
            int i10 = 12;
            SparseArray sparseArray = this.d;
            int i11 = this.b;
            if (i9 == 1836019574) {
                xp4 xp4VarH = h(arrayList5);
                m49 m49VarE = m49Var.e(1836475768);
                m49VarE.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = m49VarE.d;
                int size = arrayList6.size();
                int i12 = 0;
                long jB = -9223372036854775807L;
                while (i12 < size) {
                    n49 n49Var = (n49) arrayList6.get(i12);
                    int i13 = n49Var.b;
                    d0a d0aVar2 = n49Var.c;
                    if (i13 == 1953654136) {
                        d0aVar2.M(i10);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(d0aVar2.m()), new is3(d0aVar2.m() - 1, d0aVar2.m(), d0aVar2.m(), d0aVar2.m()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (is3) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i13 == 1835362404) {
                            d0aVar2.M(8);
                            jB = b31.e(d0aVar2.m()) == 0 ? d0aVar2.B() : d0aVar2.F();
                        }
                    }
                    i12++;
                    arrayList6 = arrayList;
                    i10 = 12;
                }
                int i14 = 0;
                m49 m49VarE2 = m49Var.e(1835365473);
                su8 su8VarF = m49VarE2 != null ? b31.f(m49VarE2) : null;
                s46 s46Var = new s46();
                n49 n49VarG = m49Var.g(1969517665);
                if (n49VarG != null) {
                    su8 su8VarK = b31.k(n49VarG, (i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0);
                    s46Var.b(su8VarK);
                    su8Var = su8VarK;
                } else {
                    su8Var = null;
                }
                n49 n49VarG2 = m49Var.g(1836476516);
                n49VarG2.getClass();
                su8 su8Var2 = new su8(b31.g(n49VarG2.c));
                ArrayList arrayListJ = b31.j(m49Var, s46Var, jB, xp4VarH, (i11 & 16) != 0, false, new t51(this), false);
                int size2 = arrayListJ.size();
                if (sparseArray.size() == 0) {
                    String strK = kn2.K(arrayListJ);
                    int i15 = 0;
                    while (i15 < size2) {
                        n1f n1fVar = (n1f) arrayListJ.get(i15);
                        d1f d1fVar = n1fVar.a;
                        boolean z4 = d1fVar.m;
                        int i16 = d1fVar.a;
                        rr5 rr5Var = d1fVar.g;
                        int i17 = size2;
                        String str = strK;
                        long j5 = d1fVar.e;
                        int i18 = d1fVar.b;
                        if (z4) {
                            k1f k1fVarN = this.G.n(i15, i18);
                            k1fVarN.d(j5);
                            qr5 qr5VarA = rr5Var.a();
                            qr5VarA.n = qv8.l(str);
                            if (i18 == 1) {
                                int i19 = s46Var.a;
                                j2 = j5;
                                if (i19 != -1 && (i = s46Var.b) != -1) {
                                    qr5VarA.M = i19;
                                    qr5VarA.N = i;
                                }
                            } else {
                                j2 = j5;
                            }
                            cn1.T(i18, su8VarF, qr5VarA, rr5Var.m, su8Var, su8Var2);
                            if (sparseArray2.size() == 1) {
                                is3Var = (is3) sparseArray2.valueAt(i14);
                            } else {
                                is3Var = (is3) sparseArray2.get(i16);
                                is3Var.getClass();
                            }
                            sparseArray.put(i16, new oy5(k1fVarN, n1fVar, is3Var, new rr5(qr5VarA)));
                            this.y = Math.max(this.y, j2);
                        }
                        i15++;
                        size2 = i17;
                        strK = str;
                        arrayListJ = arrayListJ;
                        i14 = 0;
                    }
                    this.G.j();
                } else {
                    ArrayList arrayList7 = arrayListJ;
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < size2) {
                        ArrayList arrayList8 = arrayList7;
                        if (((n1f) arrayList8.get(i20)).a.m) {
                            i21++;
                        }
                        i20++;
                        arrayList7 = arrayList8;
                    }
                    ArrayList arrayList9 = arrayList7;
                    pa7.J(sparseArray.size() == i21);
                    for (int i22 = 0; i22 < size2; i22++) {
                        n1f n1fVar2 = (n1f) arrayList9.get(i22);
                        d1f d1fVar2 = n1fVar2.a;
                        boolean z5 = d1fVar2.m;
                        int i23 = d1fVar2.a;
                        if (z5) {
                            oy5 oy5Var4 = (oy5) sparseArray.get(i23);
                            if (sparseArray2.size() == 1) {
                                is3Var2 = (is3) sparseArray2.valueAt(0);
                            } else {
                                is3Var2 = (is3) sparseArray2.get(i23);
                                is3Var2.getClass();
                            }
                            oy5Var4.d = n1fVar2;
                            oy5Var4.e = is3Var2;
                            if (oy5Var4.l == null) {
                                oy5Var4.a.g(oy5Var4.m);
                            }
                            oy5Var4.e();
                        }
                    }
                }
            } else if (i9 == 1836019558) {
                int size3 = arrayList4.size();
                int i24 = 0;
                while (i24 < size3) {
                    m49 m49Var2 = (m49) arrayList4.get(i24);
                    if (m49Var2.b == 1953653094) {
                        n49 n49VarG3 = m49Var2.g(1952868452);
                        ArrayList arrayList10 = m49Var2.d;
                        n49VarG3.getClass();
                        d0a d0aVar3 = n49VarG3.c;
                        d0aVar3.M(8);
                        int iM5 = d0aVar3.m();
                        byte[] bArr2 = b31.a;
                        oy5 oy5Var5 = (oy5) sparseArray.get(d0aVar3.m());
                        if (oy5Var5 == null) {
                            size3 = size3;
                            oy5Var5 = null;
                        } else {
                            g1f g1fVar = oy5Var5.b;
                            if ((iM5 & 1) != 0) {
                                long jF = d0aVar3.F();
                                g1fVar.b = jF;
                                g1fVar.c = jF;
                            }
                            is3 is3Var3 = oy5Var5.e;
                            g1fVar.a = new is3((iM5 & 2) != 0 ? d0aVar3.m() - 1 : is3Var3.a, (iM5 & 8) != 0 ? d0aVar3.m() : is3Var3.b, (iM5 & 16) != 0 ? d0aVar3.m() : is3Var3.c, (iM5 & 32) != 0 ? d0aVar3.m() : is3Var3.d);
                        }
                        if (oy5Var5 != null) {
                            g1f g1fVar2 = oy5Var5.b;
                            long j6 = g1fVar2.p;
                            boolean z6 = g1fVar2.q;
                            oy5Var5.e();
                            oy5Var5.n = true;
                            n49 n49VarG4 = m49Var2.g(1952867444);
                            if (n49VarG4 == null || (i11 & 2) != 0) {
                                g1fVar2.p = j6;
                                g1fVar2.q = z6;
                            } else {
                                d0a d0aVar4 = n49VarG4.c;
                                d0aVar4.M(8);
                                g1fVar2.p = b31.e(d0aVar4.m()) == 1 ? d0aVar4.F() : d0aVar4.B();
                                g1fVar2.q = true;
                            }
                            int size4 = arrayList10.size();
                            int i25 = 0;
                            int i26 = 0;
                            int i27 = 0;
                            while (true) {
                                i3 = 1953658222;
                                if (i25 >= size4) {
                                    break;
                                }
                                n49 n49Var2 = (n49) arrayList10.get(i25);
                                int i28 = i24;
                                if (n49Var2.b == 1953658222) {
                                    d0a d0aVar5 = n49Var2.c;
                                    d0aVar5.M(12);
                                    int iD = d0aVar5.D();
                                    if (iD > 0) {
                                        i27 += iD;
                                        i26++;
                                    }
                                }
                                i25++;
                                i24 = i28;
                            }
                            i2 = i24;
                            oy5Var5.h = 0;
                            oy5Var5.g = 0;
                            oy5Var5.f = 0;
                            g1fVar2.d = i26;
                            g1fVar2.e = i27;
                            if (g1fVar2.g.length < i26) {
                                g1fVar2.f = new long[i26];
                                g1fVar2.g = new int[i26];
                            }
                            if (g1fVar2.h.length < i27) {
                                int i29 = (i27 * 125) / 100;
                                g1fVar2.h = new int[i29];
                                g1fVar2.i = new long[i29];
                                g1fVar2.j = new boolean[i29];
                                g1fVar2.l = new boolean[i29];
                            }
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            while (true) {
                                long jA = 0;
                                if (i30 >= size4) {
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                    d1f d1fVar3 = oy5Var5.d.a;
                                    is3 is3Var4 = g1fVar2.a;
                                    is3Var4.getClass();
                                    int i33 = is3Var4.a;
                                    f1f[] f1fVarArr = d1fVar3.n;
                                    f1f f1fVar = f1fVarArr == null ? null : f1fVarArr[i33];
                                    n49 n49VarG5 = m49Var2.g(1935763834);
                                    if (n49VarG5 != null) {
                                        f1fVar.getClass();
                                        d0a d0aVar6 = n49VarG5.c;
                                        int i34 = f1fVar.d;
                                        d0aVar6.M(8);
                                        int iM6 = d0aVar6.m();
                                        byte[] bArr3 = b31.a;
                                        if ((iM6 & 1) == 1) {
                                            d0aVar6.N(8);
                                        }
                                        int iZ = d0aVar6.z();
                                        int iD2 = d0aVar6.D();
                                        if (iD2 > g1fVar2.e) {
                                            StringBuilder sbN = ub3.n(iD2, "Saiz sample count ", " is greater than fragment sample count");
                                            sbN.append(g1fVar2.e);
                                            throw l0a.a(null, sbN.toString());
                                        }
                                        if (iZ == 0) {
                                            boolean[] zArr2 = g1fVar2.l;
                                            i4 = 0;
                                            for (int i35 = 0; i35 < iD2; i35++) {
                                                int iZ2 = d0aVar6.z();
                                                i4 += iZ2;
                                                zArr2[i35] = iZ2 > i34;
                                            }
                                            z = false;
                                        } else {
                                            boolean z7 = iZ > i34;
                                            i4 = iZ * iD2;
                                            z = false;
                                            Arrays.fill(g1fVar2.l, 0, iD2, z7);
                                        }
                                        Arrays.fill(g1fVar2.l, iD2, g1fVar2.e, z);
                                        if (i4 > 0) {
                                            g1fVar2.n.J(i4);
                                            g1fVar2.k = true;
                                            g1fVar2.o = true;
                                        }
                                    }
                                    n49 n49VarG6 = m49Var2.g(1935763823);
                                    if (n49VarG6 != null) {
                                        d0a d0aVar7 = n49VarG6.c;
                                        d0aVar7.M(8);
                                        int iM7 = d0aVar7.m();
                                        byte[] bArr4 = b31.a;
                                        if ((iM7 & 1) == 1) {
                                            d0aVar7.N(8);
                                        }
                                        int iD3 = d0aVar7.D();
                                        if (iD3 != 1) {
                                            throw l0a.a(null, "Unexpected saio entry count: " + iD3);
                                        }
                                        g1fVar2.c += b31.e(iM7) == 0 ? d0aVar7.B() : d0aVar7.F();
                                    }
                                    n49 n49VarG7 = m49Var2.g(1936027235);
                                    if (n49VarG7 != null) {
                                        j(n49VarG7.c, 0, g1fVar2);
                                    }
                                    String str2 = f1fVar != null ? f1fVar.b : null;
                                    d0a d0aVar8 = null;
                                    d0a d0aVar9 = null;
                                    for (int i36 = 0; i36 < arrayList10.size(); i36++) {
                                        n49 n49Var3 = (n49) arrayList10.get(i36);
                                        d0a d0aVar10 = n49Var3.c;
                                        int i37 = n49Var3.b;
                                        if (i37 == 1935828848) {
                                            d0aVar10.M(12);
                                            if (d0aVar10.m() == 1936025959) {
                                                d0aVar9 = d0aVar10;
                                            }
                                        } else if (i37 == 1936158820) {
                                            d0aVar10.M(12);
                                            if (d0aVar10.m() == 1936025959) {
                                                d0aVar8 = d0aVar10;
                                            }
                                        }
                                    }
                                    if (d0aVar9 != null && d0aVar8 != null) {
                                        d0aVar9.M(8);
                                        int iE = b31.e(d0aVar9.m());
                                        d0aVar9.N(4);
                                        if (iE == 1) {
                                            d0aVar9.N(4);
                                        }
                                        if (d0aVar9.m() != 1) {
                                            throw l0a.b("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        d0aVar8.M(8);
                                        int iE2 = b31.e(d0aVar8.m());
                                        d0aVar8.N(4);
                                        long jB2 = iE2 >= 1 ? d0aVar8.B() : 0L;
                                        if (iE2 >= 2) {
                                            d0aVar8.N(4);
                                        }
                                        if (d0aVar8.B() != 1) {
                                            throw l0a.b("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        if (iE2 >= 1 && jB2 == 0) {
                                            d0aVar8.N(4);
                                        }
                                        d0aVar8.N(1);
                                        int iZ3 = d0aVar8.z();
                                        int i38 = (iZ3 & 240) >> 4;
                                        int i39 = iZ3 & 15;
                                        boolean z8 = d0aVar8.z() == 1;
                                        if (z8) {
                                            int iZ4 = d0aVar8.z();
                                            byte[] bArr5 = new byte[16];
                                            d0aVar8.k(bArr5, 0, 16);
                                            if (iZ4 == 0) {
                                                int iZ5 = d0aVar8.z();
                                                byte[] bArr6 = new byte[iZ5];
                                                d0aVar8.k(bArr6, 0, iZ5);
                                                bArr = bArr6;
                                            } else {
                                                bArr = null;
                                            }
                                            g1fVar2.k = true;
                                            g1fVar2.m = new f1f(z8, str2, iZ4, bArr5, i38, i39, bArr);
                                        }
                                    }
                                    int size5 = arrayList10.size();
                                    for (int i40 = 0; i40 < size5; i40++) {
                                        n49 n49Var4 = (n49) arrayList10.get(i40);
                                        if (n49Var4.b == 1970628964) {
                                            d0a d0aVar11 = n49Var4.c;
                                            d0aVar11.M(8);
                                            byte[] bArr7 = this.h;
                                            d0aVar11.k(bArr7, 0, 16);
                                            if (Arrays.equals(bArr7, N)) {
                                                j(d0aVar11, 16, g1fVar2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                n49 n49Var5 = (n49) arrayList10.get(i30);
                                if (n49Var5.b == i3) {
                                    int i41 = i31 + 1;
                                    d0a d0aVar12 = n49Var5.c;
                                    d0aVar12.M(8);
                                    int iM8 = d0aVar12.m();
                                    byte[] bArr8 = b31.a;
                                    d1f d1fVar4 = oy5Var5.d.a;
                                    is3 is3Var5 = g1fVar2.a;
                                    String str3 = pqf.a;
                                    g1fVar2.g[i31] = d0aVar12.D();
                                    long[] jArr3 = g1fVar2.f;
                                    long j7 = g1fVar2.b;
                                    jArr3[i31] = j7;
                                    if ((iM8 & 1) != 0) {
                                        jArr3[i31] = j7 + ((long) d0aVar12.m());
                                    }
                                    boolean z9 = (iM8 & 4) != 0;
                                    int iM9 = is3Var5.d;
                                    if (z9) {
                                        iM9 = d0aVar12.m();
                                    }
                                    boolean z10 = z9;
                                    boolean z11 = (iM8 & 256) != 0;
                                    boolean z12 = (iM8 & 512) != 0;
                                    boolean z13 = (iM8 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0;
                                    boolean z14 = (iM8 & 2048) != 0;
                                    boolean z15 = z13;
                                    ky6 ky6Var = d1fVar4.i;
                                    int i42 = iM9;
                                    ky6 ky6Var2 = d1fVar4.j;
                                    int i43 = i31;
                                    if (ky6Var != null) {
                                        i5 = i32;
                                        if (ky6Var.b() == 1 && ky6Var2 != null) {
                                            if (ky6Var.a(0) == 0) {
                                                oy5Var5 = oy5Var5;
                                                d0aVar = d0aVar12;
                                            } else {
                                                long jA2 = ky6Var.a(0);
                                                oy5Var5 = oy5Var5;
                                                long j8 = d1fVar4.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                                long jN2 = pqf.N(jA2, 1000000L, j8, roundingMode);
                                                d0aVar = d0aVar12;
                                                i8 = jN2 + pqf.N(ky6Var2.a(0), 1000000L, d1fVar4.c, roundingMode) >= d1fVar4.e ? 0 : 0;
                                            }
                                            jA = ky6Var2.a(i8);
                                        }
                                        iArr = g1fVar2.h;
                                        jArr = g1fVar2.i;
                                        zArr = g1fVar2.j;
                                        if (d1fVar4.b == 2 || (i11 & 1) == 0) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        i6 = i5 + g1fVar2.g[i43];
                                        oy5Var2 = oy5Var5;
                                        j3 = d1fVar4.c;
                                        j4 = g1fVar2.p;
                                        i7 = i5;
                                        while (i7 < i6) {
                                            if (z11) {
                                                iM = d0aVar.m();
                                            } else {
                                                iM = is3Var5.b;
                                            }
                                            jArr2 = jArr;
                                            if (iM >= 0) {
                                                throw l0a.a(null, "Unexpected negative value: " + iM);
                                            }
                                            if (z12) {
                                                iM2 = d0aVar.m();
                                            } else {
                                                iM2 = is3Var5.c;
                                            }
                                            if (iM2 >= 0) {
                                                throw l0a.a(null, "Unexpected negative value: " + iM2);
                                            }
                                            if (z15) {
                                                iM3 = d0aVar.m();
                                            } else if (i7 == 0 || !z10) {
                                                iM3 = is3Var5.d;
                                            } else {
                                                iM3 = i42;
                                            }
                                            if (z14) {
                                                iM4 = d0aVar.m();
                                            } else {
                                                iM4 = 0;
                                            }
                                            boolean z16 = z2;
                                            int i44 = i6;
                                            jN = pqf.N((((long) iM4) + j4) - jA, 1000000L, j3, RoundingMode.DOWN);
                                            jArr2[i7] = jN;
                                            if (g1fVar2.q) {
                                                oy5Var3 = oy5Var2;
                                            } else {
                                                oy5Var3 = oy5Var2;
                                                jArr2[i7] = jN + oy5Var3.d.i;
                                            }
                                            iArr[i7] = iM2;
                                            if (((iM3 >> 16) & 1) == 0 || (z16 && i7 != 0)) {
                                                z3 = false;
                                            } else {
                                                z3 = true;
                                            }
                                            zArr[i7] = z3;
                                            j4 += (long) iM;
                                            i7++;
                                            oy5Var2 = oy5Var3;
                                            jArr = jArr2;
                                            zArr = zArr;
                                            is3Var5 = is3Var5;
                                            z2 = z16;
                                            i6 = i44;
                                        }
                                        oy5Var = oy5Var2;
                                        g1fVar2.p = j4;
                                        i31 = i41;
                                        i32 = i6;
                                    } else {
                                        i5 = i32;
                                    }
                                    d0aVar = d0aVar12;
                                    iArr = g1fVar2.h;
                                    jArr = g1fVar2.i;
                                    zArr = g1fVar2.j;
                                    if (d1fVar4.b == 2) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    i6 = i5 + g1fVar2.g[i43];
                                    oy5Var2 = oy5Var5;
                                    j3 = d1fVar4.c;
                                    j4 = g1fVar2.p;
                                    i7 = i5;
                                    while (i7 < i6) {
                                        if (z11) {
                                            iM = d0aVar.m();
                                        } else {
                                            iM = is3Var5.b;
                                        }
                                        jArr2 = jArr;
                                        if (iM >= 0) {
                                            throw l0a.a(null, "Unexpected negative value: " + iM);
                                        }
                                        if (z12) {
                                            iM2 = d0aVar.m();
                                        } else {
                                            iM2 = is3Var5.c;
                                        }
                                        if (iM2 >= 0) {
                                            throw l0a.a(null, "Unexpected negative value: " + iM2);
                                        }
                                        if (z15) {
                                            iM3 = d0aVar.m();
                                        } else if (i7 == 0) {
                                            iM3 = is3Var5.d;
                                        } else {
                                            iM3 = is3Var5.d;
                                        }
                                        if (z14) {
                                            iM4 = d0aVar.m();
                                        } else {
                                            iM4 = 0;
                                        }
                                        boolean z17 = z2;
                                        int i45 = i6;
                                        jN = pqf.N((((long) iM4) + j4) - jA, 1000000L, j3, RoundingMode.DOWN);
                                        jArr2[i7] = jN;
                                        if (g1fVar2.q) {
                                            oy5Var3 = oy5Var2;
                                            jArr2[i7] = jN + oy5Var3.d.i;
                                        } else {
                                            oy5Var3 = oy5Var2;
                                        }
                                        iArr[i7] = iM2;
                                        if (((iM3 >> 16) & 1) == 0) {
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                        }
                                        zArr[i7] = z3;
                                        j4 += (long) iM;
                                        i7++;
                                        oy5Var2 = oy5Var3;
                                        jArr = jArr2;
                                        zArr = zArr;
                                        is3Var5 = is3Var5;
                                        z2 = z17;
                                        i6 = i45;
                                    }
                                    oy5Var = oy5Var2;
                                    g1fVar2.p = j4;
                                    i31 = i41;
                                    i32 = i6;
                                } else {
                                    oy5Var = oy5Var5;
                                }
                                i30++;
                                oy5Var5 = oy5Var;
                                arrayList4 = arrayList4;
                                arrayList5 = arrayList5;
                                size4 = size4;
                                i3 = 1953658222;
                            }
                        } else {
                            i2 = i24;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                        }
                    } else {
                        size3 = size3;
                        i2 = i24;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                    }
                    i24 = i2 + 1;
                    size3 = size3;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                }
                xp4 xp4VarH2 = h(arrayList5);
                if (xp4VarH2 != null) {
                    int size6 = sparseArray.size();
                    for (int i46 = 0; i46 < size6; i46++) {
                        oy5 oy5Var6 = (oy5) sparseArray.valueAt(i46);
                        d1f d1fVar5 = oy5Var6.d.a;
                        is3 is3Var6 = oy5Var6.b.a;
                        String str4 = pqf.a;
                        int i47 = is3Var6.a;
                        f1f[] f1fVarArr2 = d1fVar5.n;
                        f1f f1fVar2 = f1fVarArr2 == null ? null : f1fVarArr2[i47];
                        xp4 xp4VarA = xp4VarH2.a(f1fVar2 != null ? f1fVar2.b : null);
                        qr5 qr5VarA2 = oy5Var6.m.a();
                        qr5VarA2.s = xp4VarA;
                        rr5 rr5Var2 = new rr5(qr5VarA2);
                        if (oy5Var6.l != null) {
                            oy5Var6.l = rr5Var2;
                        } else {
                            oy5Var6.a.g(rr5Var2);
                        }
                    }
                }
                if (this.x != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i48 = 0; i48 < size7; i48++) {
                        oy5 oy5Var7 = (oy5) sparseArray.valueAt(i48);
                        long j9 = this.x;
                        int i49 = oy5Var7.f;
                        while (true) {
                            g1f g1fVar3 = oy5Var7.b;
                            if (i49 >= g1fVar3.e || g1fVar3.i[i49] > j9) {
                                break;
                            }
                            if (g1fVar3.j[i49]) {
                                oy5Var7.i = i49;
                            }
                            i49++;
                        }
                    }
                    this.x = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((m49) arrayDeque.peek()).e.add(m49Var);
            }
        }
        g();
    }

    @Override // defpackage.l95
    public final void a() {
    }
}
