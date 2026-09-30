package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xp8 {
    public final ro3 c;
    public final jce d;
    public final r45 e;
    public long f;
    public int g;
    public boolean h;
    public vp8 i;
    public final vp8[] j;
    public final vp8[] k;
    public vp8 l;
    public vp8 m;
    public int n;
    public Object o;
    public long p;
    public final eye a = new eye();
    public final fye b = new fye();
    public ArrayList q = new ArrayList();

    public xp8(ro3 ro3Var, jce jceVar, r45 r45Var, int i) {
        this.c = ro3Var;
        this.d = jceVar;
        this.e = r45Var;
        this.j = new vp8[i];
        this.k = new vp8[i];
    }

    public static boolean m(vp8[] vp8VarArr, long[] jArr, vp8 vp8Var, long j) {
        for (int i = 0; i < vp8VarArr.length; i++) {
            vp8 vp8Var2 = vp8VarArr[i];
            if (vp8Var2 != null) {
                for (vp8 vp8Var3 = vp8Var.m; vp8Var3 != null; vp8Var3 = vp8Var3.m) {
                    if (vp8Var3 == vp8Var2) {
                        return true;
                    }
                }
                if (vp8Var2 != vp8Var) {
                    continue;
                } else {
                    long j2 = jArr[i];
                    if (j2 == Long.MIN_VALUE || j2 >= j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static zp8 t(gye gyeVar, Object obj, long j, long j2, fye fyeVar, eye eyeVar) {
        gyeVar.g(obj, eyeVar);
        gyeVar.n(eyeVar.c, fyeVar);
        gyeVar.b(obj);
        int i = qf.c.a;
        if (i != 0) {
            if (i == 1) {
                eyeVar.f(0);
            }
            eyeVar.g(0);
        }
        gyeVar.g(obj, eyeVar);
        int iC = eyeVar.c(j);
        return iC == -1 ? new zp8(obj, j2, eyeVar.b(j)) : new zp8(obj, iC, eyeVar.e(iC), j2, -1);
    }

    public final vp8 a() {
        vp8 vp8Var;
        if (this.i == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            vp8[] vp8VarArr = this.j;
            if (i2 >= vp8VarArr.length) {
                break;
            }
            if (this.i.equals(vp8VarArr[i2])) {
                vp8VarArr[i2] = this.i.m;
            }
            i2++;
        }
        this.i.getClass();
        while (true) {
            vp8[] vp8VarArr2 = this.k;
            int length = vp8VarArr2.length;
            vp8Var = this.i;
            if (i >= length) {
                break;
            }
            if (vp8Var.equals(vp8VarArr2[i])) {
                vp8VarArr2[i] = this.i.m;
            }
            i++;
        }
        vp8Var.getClass();
        this.i.i();
        int i3 = this.n - 1;
        this.n = i3;
        if (i3 == 0) {
            this.l = null;
            vp8 vp8Var2 = this.i;
            this.o = vp8Var2.b;
            this.p = vp8Var2.g.a.d;
        }
        this.i = this.i.m;
        q();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        vp8 vp8Var = this.i;
        vp8Var.getClass();
        this.o = vp8Var.b;
        this.p = vp8Var.g.a.d;
        while (vp8Var != null) {
            vp8Var.i();
            vp8Var = vp8Var.m;
        }
        this.i = null;
        this.l = null;
        Arrays.fill(this.j, (Object) null);
        Arrays.fill(this.k, (Object) null);
        this.n = 0;
        q();
    }

    public final vp8 c() {
        vp8 vp8Var = this.i;
        while (vp8Var != null) {
            for (vp8 vp8Var2 : this.k) {
                if (vp8Var == vp8Var2) {
                    return vp8Var;
                }
            }
            vp8Var = vp8Var.m;
        }
        return vp8Var;
    }

    public final vp8 d() {
        vp8 vp8Var = this.i;
        while (vp8Var != null) {
            for (vp8 vp8Var2 : this.j) {
                if (vp8Var == vp8Var2) {
                    return vp8Var;
                }
            }
            vp8Var = vp8Var.m;
        }
        return vp8Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    public final wp8 e(gye gyeVar, vp8 vp8Var, long j) {
        gye gyeVar2;
        qf qfVar;
        wp8 wp8Var;
        Object obj;
        long j2;
        long j3;
        fye fyeVar;
        long j4;
        long jMax;
        long jV;
        wp8 wp8Var2 = vp8Var.g;
        long j5 = (vp8Var.p + wp8Var2.e) - j;
        long j6 = 0;
        long jMax2 = -9223372036854775807L;
        if (!wp8Var2.g) {
            zp8 zp8Var = wp8Var2.a;
            Object obj2 = zp8Var.a;
            int i = zp8Var.e;
            eye eyeVar = this.a;
            gyeVar.g(obj2, eyeVar);
            if (!zp8Var.c()) {
                if (i != -1) {
                    eyeVar.f(i);
                }
                int iE = eyeVar.e(i);
                eyeVar.g(i);
                qf qfVar2 = qf.c;
                if (iE != qfVar2.a(i).a) {
                    return i(gyeVar, zp8Var.a, zp8Var.e, iE, wp8Var2.e, zp8Var.d);
                }
                gyeVar.g(obj2, eyeVar);
                eyeVar.d(i);
                qfVar2.a(i).getClass();
                return j(gyeVar, zp8Var.a, 0L, -9223372036854775807L, wp8Var2.e, zp8Var.d);
            }
            int i2 = zp8Var.b;
            qf qfVar3 = qf.c;
            int i3 = qfVar3.a(i2).a;
            if (i3 != -1) {
                int iA = qfVar3.a(i2).a(zp8Var.c);
                if (iA < i3) {
                    return i(gyeVar, zp8Var.a, i2, iA, wp8Var2.d, zp8Var.d);
                }
                long jLongValue = wp8Var2.d;
                if (jLongValue == -9223372036854775807L) {
                    int i4 = eyeVar.c;
                    long j7 = eyeVar.d;
                    fye fyeVar2 = this.b;
                    if (j7 == -9223372036854775807L) {
                        gyeVar.n(i4, fyeVar2);
                        if (fyeVar2.g && !fyeVar2.i) {
                            jMax2 = Math.max(0L, j5);
                        }
                    }
                    gyeVar2 = gyeVar;
                    qfVar = qfVar3;
                    long j8 = jMax2;
                    Pair pairJ = gyeVar2.j(fyeVar2, eyeVar, eyeVar.c, -9223372036854775807L, j8);
                    if (pairJ != null) {
                        jMax2 = j8;
                        jLongValue = ((Long) pairJ.second).longValue();
                    }
                } else {
                    gyeVar2 = gyeVar;
                    qfVar = qfVar3;
                }
                int i5 = zp8Var.b;
                gyeVar2.g(obj2, eyeVar);
                eyeVar.d(i5);
                qfVar.a(i5).getClass();
                return j(gyeVar2, zp8Var.a, Math.max(0L, jLongValue), jMax2, wp8Var2.d, zp8Var.d);
            }
            return null;
        }
        wp8 wp8Var3 = vp8Var.g;
        zp8 zp8Var2 = wp8Var3.a;
        long j9 = wp8Var3.d;
        int iB = gyeVar.b(zp8Var2.a);
        int i6 = this.g;
        boolean z = this.h;
        eye eyeVar2 = this.a;
        fye fyeVar3 = this.b;
        int iD = gyeVar.d(iB, eyeVar2, fyeVar3, i6, z);
        if (iD != -1) {
            int i7 = gyeVar.f(iD, eyeVar2, true).c;
            Object obj3 = eyeVar2.b;
            obj3.getClass();
            long j10 = zp8Var2.d;
            wp8Var = null;
            if (gyeVar.m(i7, fyeVar3, 0L).l == iD) {
                int i8 = eyeVar2.c;
                if (eyeVar2.d != -9223372036854775807L) {
                    jMax = -9223372036854775807L;
                } else {
                    gyeVar.n(i8, fyeVar3);
                    if (!fyeVar3.g || fyeVar3.i) {
                        jMax = -9223372036854775807L;
                    } else {
                        jMax = Math.max(0L, j5);
                    }
                }
                long j11 = jMax;
                Pair pairJ2 = gyeVar.j(fyeVar3, eyeVar2, i7, -9223372036854775807L, j11);
                if (pairJ2 != null) {
                    Object obj4 = pairJ2.first;
                    long jLongValue2 = ((Long) pairJ2.second).longValue();
                    vp8 vp8Var2 = vp8Var.m;
                    if (vp8Var2 == null || !vp8Var2.b.equals(obj4)) {
                        jV = v(obj4);
                        if (jV == -1) {
                            jV = this.f;
                            this.f = 1 + jV;
                        }
                    } else {
                        jV = vp8Var2.g.a.d;
                    }
                    j3 = j11;
                    fyeVar = fyeVar3;
                    obj = obj4;
                    j2 = jV;
                    j4 = jLongValue2;
                    j6 = -9223372036854775807L;
                }
            } else {
                obj = obj3;
                j2 = j10;
                j3 = -9223372036854775807L;
                fyeVar = fyeVar3;
                j4 = 0;
            }
            zp8 zp8VarT = t(gyeVar, obj, j4, j2, fyeVar, eyeVar2);
            long j12 = j4;
            if (j6 != -9223372036854775807L && j9 != -9223372036854775807L) {
                gyeVar.g(zp8Var2.a, eyeVar2).getClass();
                if (qf.c.a > 0) {
                    eyeVar2.g(0);
                }
            }
            return h(gyeVar, zp8VarT, j6, j12, j3);
        }
        wp8Var = null;
        return wp8Var;
    }

    public final vp8 f() {
        vp8[] vp8VarArr = this.j;
        if (vp8VarArr.length == 0) {
            return null;
        }
        vp8 vp8Var = vp8VarArr[0];
        for (vp8 vp8Var2 = this.i; vp8Var2 != null; vp8Var2 = vp8Var2.m) {
            for (vp8 vp8Var3 : vp8VarArr) {
                if (vp8Var2 == vp8Var3) {
                    vp8Var = vp8Var2;
                    break;
                }
            }
        }
        return vp8Var;
    }

    public final long g(gye gyeVar, zp8 zp8Var) {
        Object obj = zp8Var.a;
        eye eyeVar = this.a;
        gyeVar.g(obj, eyeVar);
        if (zp8Var.c()) {
            return eyeVar.a(zp8Var.b, zp8Var.c);
        }
        int i = zp8Var.e;
        if (i == -1) {
            return eyeVar.d;
        }
        eyeVar.d(i);
        return 0L;
    }

    public final wp8 h(gye gyeVar, zp8 zp8Var, long j, long j2, long j3) {
        gyeVar.g(zp8Var.a, this.a);
        boolean zC = zp8Var.c();
        Object obj = zp8Var.a;
        return zC ? i(gyeVar, obj, zp8Var.b, zp8Var.c, j, zp8Var.d) : j(gyeVar, obj, j2, j3, j, zp8Var.d);
    }

    public final wp8 i(gye gyeVar, Object obj, int i, int i2, long j, long j2) {
        zp8 zp8Var = new zp8(obj, i, i2, j2, -1);
        eye eyeVar = this.a;
        long jA = gyeVar.g(obj, eyeVar).a(i, i2);
        if (i2 == eyeVar.e(i)) {
            qf qfVar = qf.c;
        }
        eyeVar.g(i);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new wp8(zp8Var, jMax, -9223372036854775807L, j, jA, false, false, false, false);
    }

    public final wp8 j(gye gyeVar, Object obj, long j, long j2, long j3, long j4) {
        eye eyeVar = this.a;
        gyeVar.g(obj, eyeVar);
        int iB = eyeVar.b(j);
        if (iB != -1) {
            eyeVar.g(iB);
        }
        if (iB != -1) {
            eyeVar.g(iB);
        }
        zp8 zp8Var = new zp8(obj, j4, iB);
        boolean z = !zp8Var.c() && iB == -1;
        boolean zO = o(gyeVar, zp8Var);
        boolean zN = n(gyeVar, zp8Var, z);
        long jG = g(gyeVar, zp8Var);
        return new wp8(zp8Var, (jG == -9223372036854775807L || j < jG) ? j : Math.max(0L, jG - 1), j2, j3, jG, false, z, zO, zN);
    }

    public final vp8 k(int i) {
        return this.k[i];
    }

    public final wp8 l(gye gyeVar, wp8 wp8Var) {
        zp8 zp8Var = wp8Var.a;
        int i = zp8Var.e;
        boolean z = !zp8Var.c() && i == -1;
        boolean zO = o(gyeVar, zp8Var);
        boolean zN = n(gyeVar, zp8Var, z);
        long jG = g(gyeVar, zp8Var);
        Object obj = zp8Var.a;
        eye eyeVar = this.a;
        gyeVar.g(obj, eyeVar);
        if (zp8Var.c()) {
            eyeVar.g(zp8Var.b);
        } else if (i != -1) {
            eyeVar.g(i);
        }
        return new wp8(zp8Var, wp8Var.b, wp8Var.c, wp8Var.d, jG, false, z, zO, zN);
    }

    public final boolean n(gye gyeVar, zp8 zp8Var, boolean z) {
        int iB = gyeVar.b(zp8Var.a);
        eye eyeVar = this.a;
        int i = gyeVar.f(iB, eyeVar, false).c;
        fye fyeVar = this.b;
        return !gyeVar.m(i, fyeVar, 0L).g && gyeVar.d(iB, eyeVar, fyeVar, this.g, this.h) == -1 && z;
    }

    public final boolean o(gye gyeVar, zp8 zp8Var) {
        boolean z = !zp8Var.c() && zp8Var.e == -1;
        Object obj = zp8Var.a;
        if (z) {
            if (gyeVar.m(gyeVar.g(obj, this.a).c, this.b, 0L).m == gyeVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        vp8 vp8Var = this.m;
        if (vp8Var == null || vp8Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                vp8 vp8Var2 = (vp8) this.q.get(i);
                if (!vp8Var2.h()) {
                    this.m = vp8Var2;
                    return;
                }
            }
        }
    }

    public final void q() {
        vp8 vp8Var;
        dy6 dy6VarM = jy6.m();
        for (vp8 vp8Var2 = this.i; vp8Var2 != null; vp8Var2 = vp8Var2.m) {
            dy6VarM.b(vp8Var2.g.a);
        }
        vp8[] vp8VarArr = this.j;
        this.d.e(new c0(this, dy6VarM, (vp8VarArr.length == 0 || (vp8Var = vp8VarArr[0]) == null) ? null : vp8Var.g.a, 21));
    }

    public final void r(long j) {
        vp8 vp8Var = this.l;
        if (vp8Var != null) {
            pa7.J(vp8Var.m == null);
            if (vp8Var.e) {
                vp8Var.a.r(j - vp8Var.p);
            }
        }
    }

    public final int s(vp8 vp8Var) {
        vp8[] vp8VarArr;
        vp8[] vp8VarArr2;
        vp8Var.getClass();
        if (vp8Var == this.l) {
            return 0;
        }
        this.l = vp8Var;
        int i = 0;
        while (true) {
            vp8Var = vp8Var.m;
            if (vp8Var == null) {
                break;
            }
            int i2 = 0;
            while (true) {
                vp8VarArr = this.j;
                int length = vp8VarArr.length;
                vp8VarArr2 = this.k;
                if (i2 >= length) {
                    break;
                }
                if (vp8Var == vp8VarArr[i2]) {
                    vp8 vp8Var2 = this.i;
                    vp8VarArr[i2] = vp8Var2;
                    vp8VarArr2[i2] = vp8Var2;
                    i = 3;
                }
                i2++;
            }
            for (int i3 = 0; i3 < vp8VarArr2.length; i3++) {
                if (vp8Var == vp8VarArr2[i3]) {
                    vp8VarArr2[i3] = vp8VarArr[i3];
                    i |= 2;
                }
            }
            vp8Var.i();
            this.n--;
        }
        vp8 vp8Var3 = this.l;
        vp8Var3.getClass();
        if (vp8Var3.m != null) {
            vp8Var3.b();
            vp8Var3.m = null;
            vp8Var3.c();
        }
        q();
        return i;
    }

    public final zp8 u(mga mgaVar, gye gyeVar, Object obj, long j, boolean z, boolean z2) {
        long jV;
        int iB;
        eye eyeVar = this.a;
        int i = gyeVar.g(obj, eyeVar).c;
        Object obj2 = this.o;
        boolean z3 = false;
        if (obj2 == null || (iB = gyeVar.b(obj2)) == -1 || gyeVar.f(iB, eyeVar, false).c != i) {
            vp8 vp8Var = this.i;
            while (true) {
                if (vp8Var == null) {
                    vp8 vp8Var2 = this.i;
                    while (true) {
                        if (vp8Var2 != null) {
                            int iB2 = gyeVar.b(vp8Var2.b);
                            if (iB2 != -1 && gyeVar.f(iB2, eyeVar, false).c == i) {
                                jV = vp8Var2.g.a.d;
                                break;
                            }
                            vp8Var2 = vp8Var2.m;
                        } else {
                            jV = v(obj);
                            if (jV != -1) {
                                break;
                            }
                            jV = this.f;
                            this.f = 1 + jV;
                            if (this.i != null) {
                                break;
                            }
                            this.o = obj;
                            this.p = jV;
                            break;
                        }
                    }
                } else {
                    if (vp8Var.b.equals(obj)) {
                        jV = vp8Var.g.a.d;
                        break;
                    }
                    vp8Var = vp8Var.m;
                }
            }
        } else {
            jV = this.p;
        }
        fye fyeVar = this.b;
        if (!z && !z2) {
            zp8 zp8Var = mgaVar.b;
            long j2 = jV;
            zp8 zp8VarT = t(gyeVar, obj, j, j2, fyeVar, eyeVar);
            if (zp8Var.c() && zp8Var.equals(zp8VarT)) {
                return zp8Var;
            }
            gyeVar.g(obj, eyeVar);
            return new zp8(obj, j2, eyeVar.b(j));
        }
        Object obj3 = obj;
        long j3 = jV;
        gyeVar.g(obj3, eyeVar);
        gyeVar.n(eyeVar.c, fyeVar);
        int iB3 = gyeVar.b(obj);
        boolean z4 = false;
        while (iB3 >= fyeVar.l) {
            gyeVar.f(iB3, eyeVar, true);
            boolean z5 = qf.c.a <= 0 ? z3 : true;
            z4 |= z5;
            fye fyeVar2 = fyeVar;
            if (eyeVar.c(eyeVar.d) != -1) {
                obj3 = eyeVar.b;
                obj3.getClass();
            }
            if (z4 && (!z5 || eyeVar.d != 0)) {
                fyeVar = fyeVar2;
                break;
            }
            iB3--;
            z3 = false;
            fyeVar = fyeVar2;
        }
        zp8 zp8VarT2 = t(gyeVar, obj3, j, j3, fyeVar, eyeVar);
        Object obj4 = zp8VarT2.a;
        int i2 = zp8VarT2.b;
        if (i2 != -1 && !z) {
            gyeVar.g(obj4, eyeVar);
            qf.c.a(i2).getClass();
            if (0 != j) {
                return new zp8(obj4, zp8VarT2.d, eyeVar.b(j));
            }
        }
        return zp8VarT2;
    }

    public final long v(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            vp8 vp8Var = (vp8) this.q.get(i);
            if (vp8Var.b.equals(obj)) {
                return vp8Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int w(gye gyeVar) {
        gye gyeVar2;
        vp8 vp8Var;
        vp8 vp8Var2 = this.i;
        if (vp8Var2 == null) {
            return 0;
        }
        int iB = gyeVar.b(vp8Var2.b);
        while (true) {
            gyeVar2 = gyeVar;
            iB = gyeVar2.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                vp8Var = vp8Var2.m;
                if (vp8Var == null || vp8Var2.g.g) {
                    break;
                }
                vp8Var2 = vp8Var;
            }
            if (iB == -1 || vp8Var == null || gyeVar2.b(vp8Var.b) != iB) {
                break;
            }
            vp8Var2 = vp8Var;
            gyeVar = gyeVar2;
        }
        int iS = s(vp8Var2);
        vp8Var2.g = l(gyeVar2, vp8Var2.g);
        return iS;
    }

    public final int x(gye gyeVar, long j, long[] jArr, long[] jArr2) {
        long j2;
        int i;
        wp8 wp8VarB;
        vp8 vp8Var = null;
        for (vp8 vp8Var2 = this.i; vp8Var2 != null; vp8Var2 = vp8Var2.m) {
            wp8 wp8Var = vp8Var2.g;
            zp8 zp8Var = wp8Var.a;
            if (vp8Var != null) {
                wp8 wp8VarE = e(gyeVar, vp8Var, j);
                if (wp8VarE != null) {
                    long j3 = wp8VarE.b;
                    long j4 = wp8Var.c;
                    j2 = -9223372036854775807L;
                    long j5 = wp8Var.b;
                    i = 0;
                    if (zp8Var.equals(wp8VarE.a)) {
                        if (j5 != j3) {
                            if (j4 != -9223372036854775807L) {
                                long j6 = wp8VarE.c;
                                if (j6 != -9223372036854775807L) {
                                    if (Math.abs((j3 - j6) - (j5 - j4)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        wp8VarB = j5 != j3 ? wp8VarE.b(j5, j4) : wp8VarE;
                    }
                }
                return s(vp8Var);
            }
            wp8VarB = l(gyeVar, wp8Var);
            j2 = -9223372036854775807L;
            i = 0;
            long j7 = wp8Var.d;
            long j8 = wp8Var.e;
            wp8 wp8VarA = wp8VarB.a(j7);
            vp8Var2.g = wp8VarA;
            long j9 = wp8VarB.e;
            if (j8 != j9) {
                long j10 = j9 == j2 ? Long.MAX_VALUE : j9 + vp8Var2.p;
                int i2 = (wp8VarA.f || !m(this.j, jArr, vp8Var2, j10)) ? i : 1;
                boolean zM = m(this.k, jArr2, vp8Var2, j10);
                int iS = s(vp8Var2);
                if (iS != 0) {
                    return iS;
                }
                int i3 = (i2 == 0 || (j8 == j2 && zp8Var.e == -1)) ? i : 1;
                return zM ? i3 | 2 : i3;
            }
            vp8Var = vp8Var2;
        }
        return 0;
    }
}
