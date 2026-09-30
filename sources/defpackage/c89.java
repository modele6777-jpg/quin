package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class c89 extends ird {
    public static final int[] n = new int[0];
    public final a26 e;
    public final a26 f;
    public int g;
    public x79 h;
    public ArrayList i;
    public ord j;
    public int[] k;
    public int l;
    public boolean m;

    public c89(long j, ord ordVar, a26 a26Var, a26 a26Var2) {
        super(j, ordVar);
        this.e = a26Var;
        this.f = a26Var2;
        this.j = ord.e;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (qrd.c) {
            this.j = this.j.g(j);
        }
    }

    public void B(x79 x79Var) {
        this.h = x79Var;
    }

    public c89 C(a26 a26Var, a26 a26Var2) {
        nc9 nc9Var;
        if (this.c) {
            epa.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            epa.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = qrd.c;
        synchronized (obj) {
            long j = qrd.e;
            qrd.e = j + 1;
            qrd.d = qrd.d.g(j);
            ord ordVarD = d();
            r(ordVarD.g(j));
            nc9Var = new nc9(j, qrd.a(ordVarD, g() + 1, j), qrd.i(a26Var, e(), true), qrd.j(a26Var2, i()), this);
        }
        if (this.m || this.c) {
            return nc9Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = qrd.e;
            qrd.e = j2 + 1;
            s(j2);
            qrd.d = qrd.d.g(g());
        }
        r(qrd.a(d(), jG + 1, g()));
        return nc9Var;
    }

    @Override // defpackage.ird
    public final void b() {
        qrd.d = qrd.d.d(g()).c(this.j);
    }

    @Override // defpackage.ird
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (qrd.c) {
            o();
        }
        l();
    }

    @Override // defpackage.ird
    public boolean f() {
        return false;
    }

    @Override // defpackage.ird
    public int h() {
        return this.g;
    }

    @Override // defpackage.ird
    public a26 i() {
        return this.f;
    }

    @Override // defpackage.ird
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // defpackage.ird
    public void l() {
        if (this.l <= 0) {
            epa.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        x79 x79VarX = x();
        if (x79VarX != null) {
            if (this.m) {
                epa.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = x79VarX.b;
            long[] jArr = x79VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (f1e f1eVarC = ((c1e) objArr[(i2 << 3) + i4]).c(); f1eVarC != null; f1eVarC = f1eVarC.b) {
                                    long j2 = f1eVarC.a;
                                    if (j2 == jG || s72.o0(this.j, Long.valueOf(j2))) {
                                        znd zndVar = qrd.a;
                                        f1eVarC.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.ird
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.ird
    public void n(c1e c1eVar) {
        x79 x79VarX = x();
        if (x79VarX == null) {
            x79 x79Var = mec.a;
            x79VarX = new x79();
            B(x79VarX);
        }
        x79VarX.e(c1eVar);
    }

    @Override // defpackage.ird
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            qrd.t(this.k[i]);
        }
        o();
    }

    @Override // defpackage.ird
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.ird
    public ird u(a26 a26Var) {
        oc9 oc9Var;
        if (this.c) {
            epa.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            epa.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = qrd.c;
        synchronized (obj) {
            long j = qrd.e;
            qrd.e = j + 1;
            qrd.d = qrd.d.g(j);
            oc9Var = new oc9(j, qrd.a(d(), jG + 1, j), qrd.i(a26Var, e(), true), this);
        }
        if (this.m || this.c) {
            return oc9Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = qrd.e;
            qrd.e = j2 + 1;
            s(j2);
            qrd.d = qrd.d.g(g());
        }
        r(qrd.a(d(), jG2 + 1, g()));
        return oc9Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (qrd.c) {
            long j = qrd.e;
            qrd.e = j + 1;
            s(j);
            qrd.d = qrd.d.g(g());
        }
        r(qrd.a(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    public vtb w() {
        HashMap mapM;
        List list;
        x79 x79Var;
        long j;
        long j2;
        x79 x79VarX = x();
        if (x79VarX != null) {
            long j3 = qrd.j.b;
            mapM = qrd.m(j3, this, qrd.d.d(j3));
        } else {
            mapM = null;
        }
        pu4 pu4Var = pu4.a;
        synchronized (qrd.c) {
            try {
                qrd.v(this);
                if (x79VarX == null || x79VarX.d == 0) {
                    b();
                    qb6 qb6Var = qrd.j;
                    x79 x79Var2 = qb6Var.h;
                    qrd.u(qb6Var, qrd.a);
                    if (x79Var2 == null || !x79Var2.d()) {
                        list = pu4Var;
                        x79Var = null;
                    } else {
                        list = qrd.h;
                        x79Var = x79Var2;
                    }
                } else {
                    qb6 qb6Var2 = qrd.j;
                    vtb vtbVarZ = z(qrd.e, x79VarX, mapM, qrd.d.d(qb6Var2.b));
                    if (!vtbVarZ.equals(lrd.a)) {
                        return vtbVarZ;
                    }
                    b();
                    x79Var = qb6Var2.h;
                    qrd.u(qb6Var2, qrd.a);
                    B(null);
                    qb6Var2.h = null;
                    list = qrd.h;
                }
                this.m = true;
                if (x79Var != null) {
                    oec oecVar = new oec(x79Var);
                    if (!x79Var.c()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((l26) list.get(i)).z(oecVar, this);
                        }
                    }
                }
                if (x79VarX != null && x79VarX.d()) {
                    oec oecVar2 = new oec(x79VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((l26) list.get(i2)).z(oecVar2, this);
                    }
                }
                synchronized (qrd.c) {
                    try {
                        p();
                        qrd.d();
                        if (x79Var != null) {
                            Object[] objArr = x79Var.b;
                            long[] jArr = x79Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                qrd.p((c1e) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
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
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (x79VarX != null) {
                            Object[] objArr2 = x79VarX.b;
                            long[] jArr2 = x79VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                qrd.p((c1e) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                qrd.p((c1e) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return lrd.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public x79 x() {
        return this.h;
    }

    @Override // defpackage.ird
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public a26 e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab A[LOOP:3: B:79:0x01a9->B:80:0x01ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final vtb z(long j, x79 x79Var, HashMap map, ord ordVar) {
        ArrayList arrayList;
        ArrayList arrayListQ0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        c1e c1eVar;
        f1e f1eVar;
        ord ordVar2;
        Object[] objArr;
        long[] jArr;
        ord ordVar3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        f1e f1eVarD;
        ord ordVarF = d().g(g()).f(this.j);
        Object[] objArr3 = x79Var.b;
        long[] jArr3 = x79Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListQ0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            c1e c1eVar2 = (c1e) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            f1e f1eVarC = c1eVar2.c();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            f1e f1eVarR = qrd.r(f1eVarC, j, ordVar);
                            if (f1eVarR == null) {
                                arrayList4 = arrayListQ0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListQ0;
                                j2 = j3;
                                f1e f1eVarR2 = qrd.r(f1eVarC, g(), ordVarF);
                                if (f1eVarR2 != null && f1eVarR2.a != 1 && !f1eVarR.equals(f1eVarR2)) {
                                    ordVar3 = ordVarF;
                                    f1e f1eVarR3 = qrd.r(f1eVarC, g(), d());
                                    if (f1eVarR3 == null) {
                                        qrd.q();
                                        throw null;
                                    }
                                    if (map == null || (f1eVarD = (f1e) map.get(f1eVarR)) == null) {
                                        f1eVarD = c1eVar2.d(f1eVarR2, f1eVarR, f1eVarR3);
                                    }
                                    if (f1eVarD == null) {
                                        return new krd(this);
                                    }
                                    if (!f1eVarD.equals(f1eVarR3)) {
                                        if (f1eVarD.equals(f1eVarR)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new iy9(c1eVar2, f1eVarR.c(g())));
                                            arrayListQ0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListQ0.add(c1eVar2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!f1eVarD.equals(f1eVarR2) ? new iy9(c1eVar2, f1eVarD) : new iy9(c1eVar2, f1eVarR2.c(g())));
                                        }
                                    }
                                    arrayListQ0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListQ0 = arrayList4;
                            }
                            ordVar3 = ordVarF;
                            arrayList2 = arrayList5;
                            arrayListQ0 = arrayList4;
                        } else {
                            ordVar3 = ordVarF;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        ordVarF = ordVar3;
                    }
                    ordVar2 = ordVarF;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    ordVar2 = ordVarF;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    ordVarF = ordVar2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    iy9 iy9Var = (iy9) arrayList2.get(i2);
                    c1eVar = (c1e) iy9Var.a();
                    f1eVar = (f1e) iy9Var.b();
                    f1eVar.a = j;
                    synchronized (qrd.c) {
                        f1eVar.b = c1eVar.c();
                        c1eVar.f(f1eVar);
                    }
                }
            }
            if (arrayListQ0 != null) {
                size = arrayListQ0.size();
                for (i = 0; i < size; i++) {
                    x79Var.m((c1e) arrayListQ0.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListQ0 = s72.Q0(arrayList3, arrayListQ0);
                }
                this.i = arrayListQ0;
            }
            return lrd.a;
        }
        arrayList = null;
        arrayListQ0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                iy9 iy9Var2 = (iy9) arrayList2.get(i2);
                c1eVar = (c1e) iy9Var2.a();
                f1eVar = (f1e) iy9Var2.b();
                f1eVar.a = j;
                synchronized (qrd.c) {
                    f1eVar.b = c1eVar.c();
                    c1eVar.f(f1eVar);
                }
            }
        }
        if (arrayListQ0 != null) {
            size = arrayListQ0.size();
            while (i < size) {
                x79Var.m((c1e) arrayListQ0.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListQ0 = s72.Q0(arrayList3, arrayListQ0);
            }
            this.i = arrayListQ0;
        }
        return lrd.a;
    }
}
