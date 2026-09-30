package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ncc implements k1f {
    public rr5 C;
    public boolean E;
    public final lcc a;
    public final dq4 d;
    public final aq4 e;
    public lxa f;
    public rr5 g;
    public ssg h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean z;
    public final ri1 b = new ri1();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public j1f[] o = new j1f[1000];
    public final os c = new os(new cva(16));
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean B = true;
    public boolean A = true;
    public boolean D = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;
    public int y = -1;

    public ncc(ta0 ta0Var, dq4 dq4Var, aq4 aq4Var) {
        this.d = dq4Var;
        this.e = aq4Var;
        this.a = new lcc(ta0Var);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cc A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:41:0x00b1, B:60:0x0122, B:62:0x012b, B:43:0x00cc, B:45:0x00e8, B:49:0x00f1, B:50:0x00f6, B:52:0x00fc, B:56:0x010a, B:58:0x010f, B:59:0x011f), top: B:67:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:41:0x00b1, B:60:0x0122, B:62:0x012b, B:43:0x00cc, B:45:0x00e8, B:49:0x00f1, B:50:0x00f6, B:52:0x00fc, B:56:0x010a, B:58:0x010f, B:59:0x011f), top: B:67:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:41:0x00b1, B:60:0x0122, B:62:0x012b, B:43:0x00cc, B:45:0x00e8, B:49:0x00f1, B:50:0x00f6, B:52:0x00fc, B:56:0x010a, B:58:0x010f, B:59:0x011f), top: B:67:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x010f A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:41:0x00b1, B:60:0x0122, B:62:0x012b, B:43:0x00cc, B:45:0x00e8, B:49:0x00f1, B:50:0x00f6, B:52:0x00fc, B:56:0x010a, B:58:0x010f, B:59:0x011f), top: B:67:0x0045 }] */
    @Override // defpackage.k1f
    public final void a(long j, int i, int i2, int i3, j1f j1fVar) {
        os osVar;
        int i4;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        int i5 = i & 1;
        boolean z3 = i5 != 0;
        if (this.A) {
            if (!z3) {
                return;
            } else {
                this.A = false;
            }
        }
        if (this.D) {
            if (j < this.t) {
                return;
            }
            if (i5 == 0) {
                if (!this.E) {
                    xo1.V("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.C);
                    this.E = true;
                }
                i |= 1;
            }
        }
        long j2 = (this.a.g - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i6 = this.p;
                if (i6 > 0) {
                    int iK = k(i6 - 1);
                    pa7.A(this.k[iK] + ((long) this.l[iK]) <= j2);
                }
                this.z = (536870912 & i) != 0;
                this.w = Math.max(this.w, j);
                r(this.q + this.p, i, j);
                int iK2 = k(this.p);
                this.n[iK2] = j;
                this.k[iK2] = j2;
                this.l[iK2] = i2;
                this.m[iK2] = i;
                this.o[iK2] = j1fVar;
                this.j[iK2] = 0;
                if (((SparseArray) this.c.c).size() == 0) {
                    rr5 rr5Var = this.C;
                    rr5Var.getClass();
                    l81 l81Var = l81.c;
                    osVar = this.c;
                    i4 = this.q + this.p;
                    mcc mccVar = new mcc(rr5Var, l81Var);
                    sparseArray = (SparseArray) osVar.c;
                    if (osVar.b == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        pa7.J(z2);
                        osVar.b = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i4 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        pa7.A(z);
                        if (iKeyAt == i4) {
                            ((cva) osVar.d).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i4, mccVar);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.c.c;
                    if (!((mcc) sparseArray2.valueAt(sparseArray2.size() - 1)).a.equals(this.C)) {
                        rr5 rr5Var2 = this.C;
                        rr5Var2.getClass();
                        l81 l81Var2 = l81.c;
                        osVar = this.c;
                        i4 = this.q + this.p;
                        mcc mccVar2 = new mcc(rr5Var2, l81Var2);
                        sparseArray = (SparseArray) osVar.c;
                        if (osVar.b == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            pa7.J(z2);
                            osVar.b = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i4 >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            pa7.A(z);
                            if (iKeyAt == i4) {
                                ((cva) osVar.d).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i4, mccVar2);
                    }
                }
                int i7 = this.p + 1;
                this.p = i7;
                int i8 = this.i;
                if (i7 == i8) {
                    int i9 = i8 + 1000;
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    long[] jArr3 = new long[i9];
                    int[] iArr = new int[i9];
                    int[] iArr2 = new int[i9];
                    j1f[] j1fVarArr = new j1f[i9];
                    int i10 = this.r;
                    int i11 = i8 - i10;
                    System.arraycopy(this.k, i10, jArr2, 0, i11);
                    System.arraycopy(this.n, this.r, jArr3, 0, i11);
                    System.arraycopy(this.m, this.r, iArr, 0, i11);
                    System.arraycopy(this.l, this.r, iArr2, 0, i11);
                    System.arraycopy(this.o, this.r, j1fVarArr, 0, i11);
                    System.arraycopy(this.j, this.r, jArr, 0, i11);
                    int i12 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i11, i12);
                    System.arraycopy(this.n, 0, jArr3, i11, i12);
                    System.arraycopy(this.m, 0, iArr, i11, i12);
                    System.arraycopy(this.l, 0, iArr2, i11, i12);
                    System.arraycopy(this.o, 0, j1fVarArr, i11, i12);
                    System.arraycopy(this.j, 0, jArr, i11, i12);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.o = j1fVarArr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.k1f
    public final void b(d0a d0aVar, int i, int i2) {
        while (i > 0) {
            lcc lccVar = this.a;
            int iB = lccVar.b(i);
            y21 y21Var = lccVar.f;
            mj mjVar = (mj) y21Var.c;
            d0aVar.k(mjVar.a, ((int) (lccVar.g - y21Var.a)) + mjVar.b, iB);
            i -= iB;
            long j = lccVar.g + ((long) iB);
            lccVar.g = j;
            y21 y21Var2 = lccVar.f;
            if (j == y21Var2.b) {
                lccVar.f = (y21) y21Var2.d;
            }
        }
    }

    @Override // defpackage.k1f
    public final int f(sb3 sb3Var, int i, boolean z) throws EOFException {
        lcc lccVar = this.a;
        int iB = lccVar.b(i);
        y21 y21Var = lccVar.f;
        mj mjVar = (mj) y21Var.c;
        int i2 = sb3Var.read(mjVar.a, ((int) (lccVar.g - y21Var.a)) + mjVar.b, iB);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = lccVar.g + ((long) i2);
        lccVar.g = j;
        y21 y21Var2 = lccVar.f;
        if (j == y21Var2.b) {
            lccVar.f = (y21) y21Var2.d;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x0020, B:15:0x0039, B:19:0x0053, B:21:0x005f, B:25:0x0068, B:18:0x0051), top: B:35:0x0002 }] */
    @Override // defpackage.k1f
    public final void g(rr5 rr5Var) {
        boolean z;
        synchronized (this) {
            z = false;
            try {
                this.B = false;
                if (!Objects.equals(rr5Var, this.C)) {
                    if (((SparseArray) this.c.c).size() == 0) {
                        this.C = rr5Var;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.c.c;
                        if (((mcc) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(rr5Var)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.c;
                            rr5Var = ((mcc) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            this.C = rr5Var;
                        } else {
                            this.C = rr5Var;
                        }
                    }
                    boolean z2 = this.D;
                    String str = rr5Var.p;
                    this.D = (qv8.g(str) == 1 && qv8.a(str, rr5Var.l)) & z2;
                    this.E = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lxa lxaVar = this.f;
        if (lxaVar == null || !z) {
            return;
        }
        lxaVar.F0.post(lxaVar.Z);
    }

    public final long h(int i) {
        long j = this.v;
        int i2 = 0;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iK = k(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                jMax = Math.max(jMax, this.n[iK]);
                if ((this.m[iK] & 1) != 0) {
                    break;
                }
                iK--;
                if (iK == -1) {
                    iK = this.i - 1;
                }
            }
        }
        this.v = Math.max(j, jMax);
        this.p -= i;
        int i4 = this.q + i;
        this.q = i4;
        int i5 = this.r + i;
        this.r = i5;
        int i6 = this.i;
        if (i5 >= i6) {
            this.r = i5 - i6;
        }
        int i7 = this.s - i;
        this.s = i7;
        if (i7 < 0) {
            this.s = 0;
        }
        os osVar = this.c;
        SparseArray sparseArray = (SparseArray) osVar.c;
        while (i2 < sparseArray.size() - 1) {
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ((cva) osVar.d).accept(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i9 = osVar.b;
            if (i9 > 0) {
                osVar.b = i9 - 1;
            }
            i2 = i8;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i10 = this.r;
        if (i10 == 0) {
            i10 = this.i;
        }
        int i11 = i10 - 1;
        return this.k[i11] + ((long) this.l[i11]);
    }

    public final void i() {
        long jH;
        lcc lccVar = this.a;
        synchronized (this) {
            int i = this.p;
            jH = i == 0 ? -1L : h(i);
        }
        lccVar.a(jH);
    }

    public final int j(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public final int k(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized rr5 l() {
        return this.B ? null : this.C;
    }

    public final synchronized boolean m(boolean z) {
        rr5 rr5Var;
        int i;
        try {
            int i2 = this.q;
            int i3 = this.s;
            int i4 = i2 + i3;
            int i5 = this.x;
            boolean z2 = true;
            if (i5 != -1 && i4 >= i5) {
                return true;
            }
            if (i3 != this.p) {
                if (!(i5 == -1 && (i = this.y) != -1 && i2 + i3 >= i)) {
                    if (((mcc) this.c.g(i4)).a != this.g) {
                        return true;
                    }
                    return n(k(this.s));
                }
            }
            if (!z && !this.z && ((rr5Var = this.C) == null || rr5Var == this.g)) {
                z2 = false;
            }
            return z2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean n(int i) {
        ssg ssgVar = this.h;
        if (ssgVar == null || ssgVar.I() == 4) {
            return true;
        }
        if ((this.m[i] & 1073741824) != 0) {
            return false;
        }
        this.h.getClass();
        return false;
    }

    public final void o(rr5 rr5Var, fz3 fz3Var) {
        rr5 rr5Var2 = this.g;
        boolean z = rr5Var2 == null;
        xp4 xp4Var = rr5Var2 == null ? null : rr5Var2.t;
        this.g = rr5Var;
        xp4 xp4Var2 = rr5Var.t;
        dq4 dq4Var = this.d;
        int iE = dq4Var.e(rr5Var);
        qr5 qr5VarA = rr5Var.a();
        qr5VarA.S = iE;
        fz3Var.c = new rr5(qr5VarA);
        fz3Var.b = this.h;
        if (z || !Objects.equals(xp4Var, xp4Var2)) {
            ssg ssgVar = this.h;
            aq4 aq4Var = this.e;
            ssg ssgVarB = dq4Var.b(aq4Var, rr5Var);
            this.h = ssgVarB;
            fz3Var.b = ssgVarB;
            if (ssgVar != null) {
                ssgVar.M(aq4Var);
            }
        }
    }

    public final void p(boolean z) {
        lcc lccVar = this.a;
        ta0 ta0Var = lccVar.a;
        y21 y21Var = lccVar.d;
        if (((mj) y21Var.c) != null) {
            synchronized (ta0Var) {
                ((ur3) ta0Var.b).c.d(y21Var);
                y21 y21Var2 = y21Var;
                while (y21Var2 != null) {
                    mj mjVar = (mj) y21Var2.c;
                    mjVar.getClass();
                    ta0Var.L(mjVar);
                    y21Var2 = (y21) y21Var2.d;
                    if (y21Var2 == null || ((mj) y21Var2.c) == null) {
                        y21Var2 = null;
                    }
                }
            }
            y21Var.c = null;
            y21Var.d = null;
        }
        y21 y21Var3 = lccVar.d;
        int i = lccVar.b;
        pa7.J(((mj) y21Var3.c) == null);
        y21Var3.a = 0L;
        y21Var3.b = i;
        y21 y21Var4 = lccVar.d;
        lccVar.e = y21Var4;
        lccVar.f = y21Var4;
        lccVar.g = 0L;
        synchronized (ta0Var) {
            ((ur3) ta0Var.b).c.f();
        }
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.y = -1;
        this.A = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.z = false;
        os osVar = this.c;
        SparseArray sparseArray = (SparseArray) osVar.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((cva) osVar.d).accept(sparseArray.valueAt(i2));
        }
        osVar.b = -1;
        sparseArray.clear();
        if (z) {
            this.C = null;
            this.B = true;
            this.D = true;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0091 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean q(long r12, boolean r14) throws java.lang.Throwable {
        /*
            r11 = this;
            monitor-enter(r11)
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L82
            r0 = 0
            r11.s = r0     // Catch: java.lang.Throwable -> L8a
            lcc r1 = r11.a     // Catch: java.lang.Throwable -> L8a
            y21 r2 = r1.d     // Catch: java.lang.Throwable -> L8a
            r1.e = r2     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L87
            int r4 = r11.k(r0)     // Catch: java.lang.Throwable -> L7d
            long r1 = r11.u     // Catch: java.lang.Throwable -> L7d
            r5 = -9223372036854775808
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            long r5 = r11.w
            if (r3 == 0) goto L24
            long r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.Throwable -> L1f
            goto L24
        L1f:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto L93
        L24:
            int r1 = r11.s     // Catch: java.lang.Throwable -> L82
            int r2 = r11.p     // Catch: java.lang.Throwable -> L82
            r9 = 1
            if (r1 == r2) goto L2d
            r3 = r9
            goto L2e
        L2d:
            r3 = r0
        L2e:
            if (r3 == 0) goto L3e
            long[] r3 = r11.n     // Catch: java.lang.Throwable -> L7d
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L7d
            int r3 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r3 < 0) goto L3e
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 <= 0) goto L40
            if (r14 != 0) goto L40
        L3e:
            r3 = r11
            goto L80
        L40:
            boolean r3 = r11.D     // Catch: java.lang.Throwable -> L7d
            r10 = -1
            if (r3 == 0) goto L64
            int r2 = r2 - r1
            r1 = r0
        L47:
            if (r1 >= r2) goto L5d
            long[] r3 = r11.n     // Catch: java.lang.Throwable -> L1f
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L1f
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 < 0) goto L53
            r2 = r1
            goto L61
        L53:
            int r4 = r4 + 1
            int r3 = r11.i     // Catch: java.lang.Throwable -> L1f
            if (r4 != r3) goto L5a
            r4 = r0
        L5a:
            int r1 = r1 + 1
            goto L47
        L5d:
            if (r14 == 0) goto L60
            goto L61
        L60:
            r2 = r10
        L61:
            r3 = r11
            r6 = r12
            goto L6d
        L64:
            int r5 = r2 - r1
            r8 = 1
            r3 = r11
            r6 = r12
            int r2 = r3.j(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L7a
        L6d:
            if (r2 != r10) goto L71
            monitor-exit(r3)
            return r0
        L71:
            r3.t = r6     // Catch: java.lang.Throwable -> L7a
            int r11 = r3.s     // Catch: java.lang.Throwable -> L7a
            int r11 = r11 + r2
            r3.s = r11     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r3)
            return r9
        L7a:
            r0 = move-exception
        L7b:
            r12 = r0
            goto L93
        L7d:
            r0 = move-exception
            r3 = r11
            goto L7b
        L80:
            monitor-exit(r3)
            return r0
        L82:
            r0 = move-exception
            r3 = r11
        L84:
            r11 = r0
            r12 = r11
            goto L93
        L87:
            r0 = move-exception
            r3 = r11
            goto L84
        L8a:
            r0 = move-exception
            r3 = r11
        L8c:
            r11 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L91
            throw r11     // Catch: java.lang.Throwable -> L8f
        L8f:
            r0 = move-exception
            goto L84
        L91:
            r0 = move-exception
            goto L8c
        L93:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7a
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncc.q(long, boolean):boolean");
    }

    public final void r(int i, int i2, long j) {
        int i3;
        long j2 = this.u;
        if (j2 != Long.MIN_VALUE && this.x == -1) {
            if (j < j2) {
                this.y = -1;
                return;
            }
            int i4 = this.y;
            if (i4 == -1) {
                this.y = i;
                i4 = i;
            }
            int i5 = (i - i4) + 1;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & 536870912) != 0;
            rr5 rr5Var = this.C;
            if (rr5Var == null || (i3 = rr5Var.r) == -1) {
                i3 = 16;
            }
            if (i5 >= i3 + 1 || z || z2) {
                this.x = i4;
                this.y = -1;
            }
        }
    }
}
