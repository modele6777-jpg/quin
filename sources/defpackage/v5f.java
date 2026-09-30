package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v5f implements l95 {
    public final int a;
    public final List b;
    public final d0a c = new d0a(new byte[9400], 0);
    public final SparseIntArray d;
    public final bu3 e;
    public final d8e f;
    public final SparseArray g;
    public final SparseBooleanArray h;
    public final SparseBooleanArray i;
    public final g2b j;
    public yh5 k;
    public n95 l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;

    public v5f(int i, d8e d8eVar, rye ryeVar, bu3 bu3Var) {
        this.e = bu3Var;
        this.a = i;
        this.f = d8eVar;
        this.b = Collections.singletonList(ryeVar);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.h = sparseBooleanArray;
        this.i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.d = new SparseIntArray();
        this.j = new g2b(1);
        this.l = n95.A;
        this.q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), (x5f) sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new tsc(new vea(this)));
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) throws EOFException, InterruptedIOException {
        byte[] bArr = this.c.a;
        rq3 rq3Var = (rq3) m95Var;
        rq3Var.d(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    rq3Var.c(i, false);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        yh5 yh5Var;
        long j3;
        SparseArray sparseArray = this.g;
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rye ryeVar = (rye) list.get(i);
            synchronized (ryeVar) {
                j3 = ryeVar.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jD = ryeVar.d();
                z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z) {
                ryeVar.e(j2);
            }
        }
        if (j2 != 0 && (yh5Var = this.k) != null) {
            yh5Var.d(j2);
        }
        this.c.J(0);
        this.d.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((x5f) sparseArray.valueAt(i2)).d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [x5f] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) {
        m95 m95Var2;
        int i;
        ?? r1;
        ?? r7;
        x5f x5fVar;
        int i2;
        boolean z;
        long jO;
        long length = m95Var.getLength();
        if (this.n) {
            long j = -9223372036854775807L;
            g2b g2bVar = this.j;
            if (length != -1 && !g2bVar.d) {
                int i3 = this.q;
                rye ryeVar = g2bVar.b;
                d0a d0aVar = g2bVar.c;
                if (i3 <= 0) {
                    g2bVar.a(m95Var);
                    return 0;
                }
                if (g2bVar.f) {
                    if (g2bVar.h == -9223372036854775807L) {
                        g2bVar.a(m95Var);
                        return 0;
                    }
                    if (g2bVar.e) {
                        long j2 = g2bVar.g;
                        if (j2 == -9223372036854775807L) {
                            g2bVar.a(m95Var);
                            return 0;
                        }
                        g2bVar.i = ryeVar.c(g2bVar.h) - ryeVar.b(j2);
                        g2bVar.a(m95Var);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, m95Var.getLength());
                    if (m95Var.getPosition() != 0) {
                        d82Var.b = 0L;
                        return 1;
                    }
                    d0aVar.J(iMin);
                    m95Var.k();
                    m95Var.o(d0aVar.a, 0, iMin);
                    int i4 = d0aVar.c;
                    for (int i5 = d0aVar.b; i5 < i4; i5++) {
                        if (d0aVar.a[i5] == 71) {
                            jO = iqf.o(d0aVar, i5, i3);
                            if (jO != -9223372036854775807L) {
                                g2bVar.g = jO;
                                g2bVar.e = true;
                                return 0;
                            }
                        }
                    }
                    jO = -9223372036854775807L;
                    g2bVar.g = jO;
                    g2bVar.e = true;
                    return 0;
                }
                long length2 = m95Var.getLength();
                int iMin2 = (int) Math.min(112800L, length2);
                long j3 = length2 - ((long) iMin2);
                if (m95Var.getPosition() != j3) {
                    d82Var.b = j3;
                    return 1;
                }
                d0aVar.J(iMin2);
                m95Var.k();
                m95Var.o(d0aVar.a, 0, iMin2);
                int i6 = d0aVar.b;
                int i7 = d0aVar.c;
                for (int i8 = i7 - 188; i8 >= i6; i8--) {
                    byte[] bArr = d0aVar.a;
                    int i9 = 0;
                    for (int i10 = -4; i10 <= 4; i10++) {
                        int i11 = (i10 * 188) + i8;
                        if (i11 >= i6 && i11 < i7 && bArr[i11] == 71) {
                            i9++;
                            if (i9 == 5) {
                                long jO2 = iqf.o(d0aVar, i8, i3);
                                if (jO2 == -9223372036854775807L) {
                                    break;
                                }
                                j = jO2;
                                break;
                            }
                        } else {
                            i9 = 0;
                        }
                    }
                }
                g2bVar.h = j;
                g2bVar.f = true;
                return 0;
            }
            if (this.o) {
                i = 1;
                z = false;
            } else {
                this.o = true;
                long j4 = g2bVar.i;
                if (j4 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    yh5 yh5Var = new yh5(new i8c(14), new os(this.q, g2bVar.b), j4, j4 + 1, 0L, length, 188L, 940);
                    this.k = yh5Var;
                    this.l.q(yh5Var.a);
                } else {
                    z = false;
                    i = 1;
                    this.l.q(new ir0(j4));
                }
            }
            if (this.p) {
                this.p = z;
                c(0L, 0L);
                if (m95Var.getPosition() != 0) {
                    d82Var.b = 0L;
                    return i;
                }
            }
            yh5 yh5Var2 = this.k;
            if (yh5Var2 != null && yh5Var2.c != null) {
                return yh5Var2.a(m95Var, d82Var);
            }
            m95Var2 = m95Var;
            r1 = z;
        } else {
            m95Var2 = m95Var;
            i = 1;
            r1 = 0;
        }
        d0a d0aVar2 = this.c;
        byte[] bArr2 = d0aVar2.a;
        if (9400 - d0aVar2.b < 188) {
            int iA = d0aVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, d0aVar2.b, bArr2, r1, iA);
            }
            d0aVar2.K(bArr2, iA);
        }
        while (true) {
            int iA2 = d0aVar2.a();
            ?? r8 = this.g;
            if (iA2 >= 188) {
                int i12 = d0aVar2.b;
                int i13 = d0aVar2.c;
                byte[] bArr3 = d0aVar2.a;
                while (i12 < i13 && bArr3[i12] != 71) {
                    i12++;
                }
                d0aVar2.M(i12);
                int i14 = i12 + 188;
                int i15 = d0aVar2.c;
                if (i14 > i15) {
                    return r1;
                }
                int iM = d0aVar2.m();
                if ((8388608 & iM) != 0) {
                    d0aVar2.M(i14);
                    return r1;
                }
                ?? r6 = (4194304 & iM) != 0 ? 1 : r1;
                int i16 = (2096896 & iM) >> 8;
                ?? r9 = (iM & 32) != 0 ? 1 : r1;
                if ((iM & 16) != 0) {
                    x5fVar = (x5f) r8.get(i16);
                } else {
                    r7 = 0;
                }
                if (r7 == 0) {
                    r7 = x5fVar;
                    d0aVar2.M(i14);
                    return r1;
                }
                int i17 = iM & 15;
                SparseIntArray sparseIntArray = this.d;
                int i18 = sparseIntArray.get(i16, i17 - 1);
                sparseIntArray.put(i16, i17);
                if (i18 == i17) {
                    r7 = x5fVar;
                    d0aVar2.M(i14);
                    return r1;
                }
                if (i17 != ((i18 + 1) & 15)) {
                    r7 = x5fVar;
                    r7.d();
                }
                if (r9 != 0) {
                    int iZ = d0aVar2.z();
                    r6 = (r6 == true ? 1 : 0) | ((d0aVar2.z() & 64) != 0 ? 2 : r1);
                    d0aVar2.N(iZ - 1);
                }
                boolean z2 = this.n;
                if (z2 || !this.i.get(i16, r1)) {
                    d0aVar2.L(i14);
                    r7.a(r6, d0aVar2);
                    d0aVar2.L(i15);
                }
                if (!z2 && this.n && length != -1) {
                    this.p = true;
                }
                d0aVar2.M(i14);
                return r1;
            }
            int i19 = d0aVar2.c;
            int i20 = m95Var2.read(bArr2, i19, 9400 - i19);
            if (i20 == -1) {
                for (?? r10 = r1; r10 < r8.size(); r10++) {
                    x5f x5fVar2 = (x5f) r8.valueAt(r10);
                    if (x5fVar2 instanceof lca) {
                        lca lcaVar = (lca) x5fVar2;
                        int i21 = lcaVar.c;
                        if (i21 == 3 && lcaVar.j == -1) {
                            i2 = i;
                        } else {
                            i2 = i;
                            if (i21 == i2) {
                            }
                        }
                        lcaVar.a(i2, new d0a());
                    }
                    i = 1;
                }
                return -1;
            }
            d0aVar2.L(i19 + i20);
            i = 1;
        }
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        if ((this.a & 1) == 0) {
            n95Var = new zi0(n95Var, this.f);
        }
        this.l = n95Var;
    }

    @Override // defpackage.l95
    public final void a() {
    }
}
