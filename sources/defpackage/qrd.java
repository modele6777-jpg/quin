package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qrd {
    public static final znd a = new znd(1);
    public static final psd b = new psd(0, (byte) 0);
    public static final Object c = new Object();
    public static ord d;
    public static long e;
    public static final rw f;
    public static final os g;
    public static List h;
    public static List i;
    public static final qb6 j;
    public static final xh0 k;

    static {
        char c2 = 0;
        ord ordVar = ord.e;
        d = ordVar;
        e = 2L;
        rw rwVar = new rw();
        rwVar.c = new long[16];
        rwVar.d = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        rwVar.e = iArr;
        f = rwVar;
        os osVar = new os(12, c2);
        osVar.c = new int[16];
        osVar.d = new h0g[16];
        g = osVar;
        pu4 pu4Var = pu4.a;
        h = pu4Var;
        i = pu4Var;
        long j2 = e;
        e = 1 + j2;
        qb6 qb6Var = new qb6(j2, ordVar, null, new oz5(17));
        d = d.g(qb6Var.b);
        j = qb6Var;
        k = new xh0(0);
    }

    public static final ord a(ord ordVar, long j2, long j3) {
        while (pa7.M(j2, j3) < 0) {
            ordVar = ordVar.g(j2);
            j2++;
        }
        return ordVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    public static final Object b(a26 a26Var) {
        x79 x79Var;
        Object objU;
        qb6 qb6Var = j;
        synchronized (c) {
            try {
                x79Var = qb6Var.h;
                if (x79Var != null) {
                    k.addAndGet(1);
                }
                objU = u(qb6Var, a26Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (x79Var != null) {
            try {
                List list = h;
                oec oecVar = new oec(x79Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l26) list.get(i2)).z(oecVar, qb6Var);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (c) {
            d();
            if (x79Var != null) {
                Object[] objArr = x79Var.b;
                long[] jArr = x79Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    p((c1e) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                            if (i3 != length) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        return objU;
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        os osVar = g;
        int i2 = osVar.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            h0g h0gVar = ((h0g[]) osVar.d)[i3];
            Object obj = h0gVar != null ? h0gVar.get() : null;
            if (obj != null && o((c1e) obj)) {
                if (i4 != i3) {
                    ((h0g[]) osVar.d)[i4] = h0gVar;
                    int[] iArr = (int[]) osVar.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((h0g[]) osVar.d)[i5] = null;
            ((int[]) osVar.c)[i5] = 0;
        }
        if (i4 != i2) {
            osVar.b = i4;
        }
    }

    public static final ird e(ird irdVar, a26 a26Var, boolean z) {
        boolean z2 = irdVar instanceof c89;
        if (z2 || irdVar == null) {
            return new t3f(z2 ? (c89) irdVar : null, a26Var, null, false, z);
        }
        return new u3f(irdVar, a26Var, false, z);
    }

    public static final f1e f(f1e f1eVar) {
        f1e f1eVarR;
        ird irdVarH = h();
        f1e f1eVarR2 = r(f1eVar, irdVarH.g(), irdVarH.d());
        if (f1eVarR2 != null) {
            return f1eVarR2;
        }
        synchronized (c) {
            ird irdVarH2 = h();
            f1eVarR = r(f1eVar, irdVarH2.g(), irdVarH2.d());
        }
        if (f1eVarR != null) {
            return f1eVarR;
        }
        q();
        throw null;
    }

    public static final f1e g(f1e f1eVar, ird irdVar) {
        f1e f1eVarR;
        f1e f1eVarR2 = r(f1eVar, irdVar.g(), irdVar.d());
        if (f1eVarR2 != null) {
            return f1eVarR2;
        }
        synchronized (c) {
            f1eVarR = r(f1eVar, irdVar.g(), irdVar.d());
        }
        if (f1eVarR != null) {
            return f1eVarR;
        }
        q();
        throw null;
    }

    public static final ird h() {
        ird irdVar = (ird) b.get();
        return irdVar == null ? j : irdVar;
    }

    public static final a26 i(a26 a26Var, a26 a26Var2, boolean z) {
        if (!z) {
            a26Var2 = null;
        }
        if (a26Var == null || a26Var2 == null || a26Var == a26Var2) {
            return a26Var == null ? a26Var2 : a26Var;
        }
        return new prd(a26Var, a26Var2, 0);
    }

    public static final a26 j(a26 a26Var, a26 a26Var2) {
        if (a26Var == null || a26Var2 == null || a26Var == a26Var2) {
            return a26Var == null ? a26Var2 : a26Var;
        }
        return new prd(a26Var, a26Var2, 1);
    }

    public static final f1e k(f1e f1eVar, c1e c1eVar) {
        long j2 = e;
        rw rwVar = f;
        if (rwVar.a > 0) {
            j2 = ((long[]) rwVar.c)[0];
        }
        long j3 = j2 - 1;
        f1e f1eVar2 = null;
        f1e f1eVar3 = null;
        for (f1e f1eVarC = c1eVar.c(); f1eVarC != null; f1eVarC = f1eVarC.b) {
            long j4 = f1eVarC.a;
            if (j4 != 0) {
                if (j4 != 0 && pa7.M(j4, j3) <= 0 && !ord.e.e(j4)) {
                    if (f1eVar3 != null) {
                        if (pa7.M(f1eVarC.a, f1eVar3.a) >= 0) {
                            f1eVar2 = f1eVar3;
                            break;
                        }
                        break;
                    }
                    f1eVar3 = f1eVarC;
                }
            }
            f1eVar2 = f1eVarC;
            break;
        }
        if (f1eVar2 != null) {
            f1eVar2.a = Long.MAX_VALUE;
            return f1eVar2;
        }
        f1e f1eVarC2 = f1eVar.c(Long.MAX_VALUE);
        f1eVarC2.b = c1eVar.c();
        c1eVar.f(f1eVarC2);
        return f1eVarC2;
    }

    public static final void l(ird irdVar, c1e c1eVar) {
        irdVar.t(irdVar.h() + 1);
        a26 a26VarI = irdVar.i();
        if (a26VarI != null) {
            a26VarI.d(c1eVar);
        }
    }

    public static final HashMap m(long j2, c89 c89Var, ord ordVar) {
        long[] jArr;
        ord ordVar2;
        long[] jArr2;
        int i2;
        int i3;
        f1e f1eVarR;
        x79 x79VarX = c89Var.x();
        if (x79VarX != null) {
            long jG = c89Var.g();
            ord ordVarF = c89Var.d().g(jG).f(c89Var.j);
            Object[] objArr = x79VarX.b;
            long[] jArr3 = x79VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                c1e c1eVar = (c1e) objArr[(i4 << 3) + i7];
                                f1e f1eVarC = c1eVar.c();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                f1e f1eVarR2 = r(f1eVarC, j2, ordVar);
                                if (f1eVarR2 != null && (f1eVarR = r(f1eVarC, jG, ordVarF)) != null && !f1eVarR2.equals(f1eVarR)) {
                                    f1e f1eVarR3 = r(f1eVarC, jG, c89Var.d());
                                    if (f1eVarR3 == null) {
                                        q();
                                        throw null;
                                    }
                                    f1e f1eVarD = c1eVar.d(f1eVarR, f1eVarR2, f1eVarR3);
                                    if (f1eVarD == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(f1eVarR2, f1eVarD);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            ordVarF = ordVarF;
                        }
                        jArr = jArr3;
                        ordVar2 = ordVarF;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        ordVar2 = ordVarF;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    ordVarF = ordVar2;
                }
            }
        }
        return null;
    }

    public static final f1e n(f1e f1eVar, d1e d1eVar, ird irdVar, f1e f1eVar2) {
        f1e f1eVarK;
        if (irdVar.f()) {
            irdVar.n(d1eVar);
        }
        long jG = irdVar.g();
        if (f1eVar2.a == jG) {
            return f1eVar2;
        }
        synchronized (c) {
            f1eVarK = k(f1eVar, d1eVar);
        }
        f1eVarK.a = jG;
        irdVar.n(d1eVar);
        return f1eVarK;
    }

    public static final boolean o(c1e c1eVar) {
        f1e f1eVar;
        long j2 = e;
        rw rwVar = f;
        if (rwVar.a > 0) {
            j2 = ((long[]) rwVar.c)[0];
        }
        f1e f1eVar2 = null;
        f1e f1eVarC = null;
        int i2 = 0;
        for (f1e f1eVarC2 = c1eVar.c(); f1eVarC2 != null; f1eVarC2 = f1eVarC2.b) {
            long j3 = f1eVarC2.a;
            if (j3 != 0) {
                if (pa7.M(j3, j2) >= 0) {
                    i2++;
                } else if (f1eVar2 == null) {
                    i2++;
                    f1eVar2 = f1eVarC2;
                } else {
                    if (pa7.M(f1eVarC2.a, f1eVar2.a) < 0) {
                        f1eVar = f1eVar2;
                        f1eVar2 = f1eVarC2;
                    } else {
                        f1eVar = f1eVarC2;
                    }
                    if (f1eVarC == null) {
                        f1eVarC = c1eVar.c();
                        f1e f1eVar3 = f1eVarC;
                        while (true) {
                            if (f1eVarC == null) {
                                f1eVarC = f1eVar3;
                                break;
                            }
                            if (pa7.M(f1eVarC.a, j2) >= 0) {
                                break;
                            }
                            if (pa7.M(f1eVar3.a, f1eVarC.a) < 0) {
                                f1eVar3 = f1eVarC;
                            }
                            f1eVarC = f1eVarC.b;
                        }
                    }
                    f1eVar2.a = 0L;
                    f1eVar2.a(f1eVarC);
                    f1eVar2 = f1eVar;
                }
            }
        }
        return i2 > 1;
    }

    public static final void p(c1e c1eVar) {
        if (o(c1eVar)) {
            os osVar = g;
            int i2 = osVar.b;
            int iIdentityHashCode = System.identityHashCode(c1eVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = osVar.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) osVar.c)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        h0g h0gVar = ((h0g[]) osVar.d)[i6];
                        if (c1eVar == (h0gVar != null ? h0gVar.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        int i8 = i6 - 1;
                        while (true) {
                            if (-1 >= i8 || ((int[]) osVar.c)[i8] != iIdentityHashCode) {
                                i6++;
                                int i9 = osVar.b;
                                while (true) {
                                    if (i6 >= i9) {
                                        i3 = -(osVar.b + 1);
                                        break;
                                    }
                                    if (((int[]) osVar.c)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    h0g h0gVar2 = ((h0g[]) osVar.d)[i6];
                                    if ((h0gVar2 != null ? h0gVar2.get() : null) == c1eVar) {
                                        i3 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                h0g h0gVar3 = ((h0g[]) osVar.d)[i8];
                                if ((h0gVar3 != null ? h0gVar3.get() : null) == c1eVar) {
                                    i3 = i8;
                                    break;
                                }
                                i8--;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            h0g[] h0gVarArr = (h0g[]) osVar.d;
            int length = h0gVarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                h0g[] h0gVarArr2 = new h0g[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(h0gVarArr, i10, h0gVarArr2, i12, i2 - i10);
                System.arraycopy((h0g[]) osVar.d, 0, h0gVarArr2, 0, i10);
                qd0.Y(i12, i10, i2, (int[]) osVar.c, iArr);
                qd0.c0(0, i10, 6, (int[]) osVar.c, iArr);
                osVar.d = h0gVarArr2;
                osVar.c = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(h0gVarArr, i10, h0gVarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) osVar.c;
                qd0.Y(i13, i10, i2, iArr2, iArr2);
            }
            ((h0g[]) osVar.d)[i10] = new h0g(c1eVar);
            ((int[]) osVar.c)[i10] = iIdentityHashCode;
            osVar.b++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final f1e r(f1e f1eVar, long j2, ord ordVar) {
        f1e f1eVar2 = null;
        while (f1eVar != null) {
            long j3 = f1eVar.a;
            if (j3 != 0 && pa7.M(j3, j2) <= 0 && !ordVar.e(j3) && (f1eVar2 == null || pa7.M(f1eVar2.a, f1eVar.a) < 0)) {
                f1eVar2 = f1eVar;
            }
            f1eVar = f1eVar.b;
        }
        if (f1eVar2 != null) {
            return f1eVar2;
        }
        return null;
    }

    public static final f1e s(f1e f1eVar, c1e c1eVar) {
        f1e f1eVarR;
        ird irdVarH = h();
        a26 a26VarE = irdVarH.e();
        if (a26VarE != null) {
            a26VarE.d(c1eVar);
        }
        f1e f1eVarR2 = r(f1eVar, irdVarH.g(), irdVarH.d());
        if (f1eVarR2 != null) {
            return f1eVarR2;
        }
        synchronized (c) {
            ird irdVarH2 = h();
            f1e f1eVarC = c1eVar.c();
            f1eVarC.getClass();
            f1eVarR = r(f1eVarC, irdVarH2.g(), irdVarH2.d());
            if (f1eVarR == null) {
                q();
                throw null;
            }
        }
        return f1eVarR;
    }

    public static final void t(int i2) {
        rw rwVar = f;
        int i3 = ((int[]) rwVar.e)[i2];
        rwVar.j(i3, rwVar.a - 1);
        rwVar.a--;
        long[] jArr = (long[]) rwVar.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (pa7.M(jArr[i5], j2) <= 0) {
                break;
            }
            rwVar.j(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) rwVar.c;
        int i6 = rwVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < rwVar.a && pa7.M(jArr2[i7], jArr2[i8]) < 0) {
                if (pa7.M(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                rwVar.j(i7, i3);
                i3 = i7;
            } else {
                if (pa7.M(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                rwVar.j(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) rwVar.e)[i2] = rwVar.b;
        rwVar.b = i2;
    }

    public static final Object u(qb6 qb6Var, a26 a26Var) {
        long j2 = qb6Var.b;
        Object objD = a26Var.d(d.d(j2));
        long j3 = e;
        e = 1 + j3;
        ord ordVarD = d.d(j2);
        d = ordVarD;
        qb6Var.b = j3;
        qb6Var.a = ordVarD;
        qb6Var.g = 0;
        qb6Var.h = null;
        qb6Var.o();
        d = d.g(j3);
        return objD;
    }

    public static final void v(ird irdVar) {
        Long lValueOf;
        if (d.e(irdVar.g())) {
            return;
        }
        long jG = irdVar.g();
        boolean z = irdVar.c;
        c89 c89Var = irdVar instanceof c89 ? (c89) irdVar : null;
        Object objValueOf = c89Var != null ? Boolean.valueOf(c89Var.m) : "read-only";
        synchronized (c) {
            rw rwVar = f;
            lValueOf = Long.valueOf(rwVar.a > 0 ? ((long[]) rwVar.c)[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jG + ", disposed=" + z + ", applied=" + objValueOf + ", lowestPin=" + lValueOf).toString());
    }

    public static final f1e w(f1e f1eVar, c1e c1eVar, ird irdVar) {
        f1e f1eVarR;
        f1e f1eVarR2;
        if (irdVar.f()) {
            irdVar.n(c1eVar);
        }
        long jG = irdVar.g();
        f1e f1eVarR3 = r(f1eVar, jG, irdVar.d());
        if (f1eVarR3 == null) {
            synchronized (c) {
                ird irdVarH = h();
                f1e f1eVarC = c1eVar.c();
                f1eVarC.getClass();
                f1eVarR2 = r(f1eVarC, irdVarH.g(), irdVarH.d());
                if (f1eVarR2 == null) {
                    q();
                    throw null;
                }
            }
            f1eVarR3 = f1eVarR2;
        }
        if (f1eVarR3.a == irdVar.g()) {
            return f1eVarR3;
        }
        synchronized (c) {
            f1eVarR = r(c1eVar.c(), jG, irdVar.d());
            if (f1eVarR == null) {
                q();
                throw null;
            }
            if (f1eVarR.a != jG) {
                f1e f1eVarK = k(f1eVarR, c1eVar);
                f1eVarK.a(f1eVarR);
                f1eVarK.a = irdVar.g();
                f1eVarR = f1eVarK;
            }
        }
        irdVar.n(c1eVar);
        return f1eVarR;
    }
}
