package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nsd {
    public final a26 a;
    public boolean c;
    public hrd h;
    public msd i;
    public final AtomicReference b = new AtomicReference(null);
    public final z8d d = new z8d(5, this);
    public final trd e = new trd(3, this);
    public final p89 f = new p89(0, new msd[16]);
    public final Object g = new Object();
    public long j = -1;

    public nsd(a26 a26Var) {
        this.a = a26Var;
    }

    public final void a() {
        synchronized (this.g) {
            p89 p89Var = this.f;
            Object[] objArr = p89Var.a;
            int i = p89Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                msd msdVar = (msd) objArr[i2];
                msdVar.e.a();
                msdVar.f.a();
                msdVar.l.a();
                msdVar.m.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[Catch: all -> 0x008e, LOOP:1: B:14:0x002d->B:26:0x0074, LOOP_END, TryCatch #0 {all -> 0x008e, blocks: (B:4:0x0007, B:8:0x0011, B:27:0x0078, B:29:0x0080, B:34:0x0090, B:31:0x0085, B:11:0x0021, B:14:0x002d, B:16:0x0041, B:18:0x004f, B:20:0x0059, B:22:0x0069, B:26:0x0074, B:35:0x0094), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:27:0x0078 BREAK  A[LOOP:1: B:14:0x002d->B:26:0x0074], SYNTHETIC] */
    public final void b(Object obj) {
        int i;
        synchronized (this.g) {
            try {
                p89 p89Var = this.f;
                int i2 = p89Var.c;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = p89Var.a;
                    if (i3 < i2) {
                        msd msdVar = (msd) objArr[i3];
                        e79 e79Var = (e79) msdVar.f.k(obj);
                        if (e79Var == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = e79Var.b;
                            int[] iArr = e79Var.c;
                            long[] jArr = e79Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((j & 255) < 128) {
                                                int i8 = (i5 << 3) + i7;
                                                Object obj2 = objArr2[i8];
                                                int i9 = iArr[i8];
                                                msdVar.c(obj, obj2);
                                            }
                                            j >>= 8;
                                        }
                                        if (i6 != 8) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    } else if (i5 != length) {
                                        break;
                                        break;
                                    } else {
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!msdVar.f.j()) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = p89Var.a;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i10 = i2 - i4;
                        Arrays.fill(objArr, i10, i2, (Object) null);
                        p89Var.c = i10;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        wf2.b("Unexpected notification");
                        oo3.f();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                p89 p89Var = this.f;
                Object[] objArr = p89Var.a;
                int i = p89Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((msd) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d8  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Object obj, a26 a26Var, x16 x16Var) {
        p89 p89Var;
        Object obj2;
        msd msdVar;
        boolean z;
        msd msdVar2;
        long j;
        long j2;
        msd msdVar3;
        ird t3fVar;
        long j3;
        e79 e79Var;
        int i;
        long j4;
        e79 e79Var2;
        long jK = o8c.k();
        synchronized (this.g) {
            p89Var = this.f;
            Object[] objArr = p89Var.a;
            int i2 = p89Var.c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((msd) obj2).a == a26Var) {
                    break;
                } else {
                    i3++;
                }
            }
            msdVar = (msd) obj2;
            z = true;
            if (msdVar == null) {
                a26Var.getClass();
                z7f.t(1, a26Var);
                msdVar = new msd(a26Var);
                p89Var.b(msdVar);
            }
            msdVar2 = this.i;
            j = this.j;
        }
        Object obj3 = p89Var;
        if (j != -1 && j != jK) {
            obj3 = p89Var;
            String name = Thread.currentThread().getName();
            StringBuilder sbP = ub3.p("Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=", j);
            sbP.append(jK);
            sbP.append(", name=");
            sbP.append(name);
            sbP.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            epa.a(sbP.toString());
            obj3 = sbP;
        }
        try {
            obj3 = p89Var;
            synchronized (this.g) {
                try {
                    this.i = msdVar;
                    this.j = jK;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            trd trdVar = this.e;
            Object obj4 = msdVar.b;
            e79 e79Var3 = msdVar.c;
            int i4 = msdVar.d;
            msdVar.b = obj;
            msdVar.c = (e79) msdVar.f.g(obj);
            if (msdVar.d == -1) {
                msdVar.d = Long.hashCode(qrd.h().g());
            }
            k46 k46Var = msdVar.i;
            p89 p89VarA = zrd.a();
            try {
                p89VarA.b(k46Var);
                if (trdVar == null) {
                    x16Var.invoke();
                    msdVar3 = msdVar;
                } else {
                    ird irdVar = (ird) qrd.b.get();
                    if (irdVar instanceof t3f) {
                        msdVar3 = msdVar;
                        if (((t3f) irdVar).t == o8c.k()) {
                            a26 a26Var2 = ((t3f) irdVar).r;
                            a26 a26Var3 = ((t3f) irdVar).s;
                            try {
                                ((t3f) irdVar).r = qrd.i(trdVar, a26Var2, true);
                                ((t3f) irdVar).s = a26Var3;
                                x16Var.invoke();
                                ((t3f) irdVar).r = a26Var2;
                                ((t3f) irdVar).s = a26Var3;
                            } catch (Throwable th2) {
                                ((t3f) irdVar).r = a26Var2;
                                ((t3f) irdVar).s = a26Var3;
                                throw th2;
                            }
                        }
                    } else {
                        msdVar3 = msdVar;
                    }
                    if (irdVar == null || (irdVar instanceof c89)) {
                        t3fVar = new t3f(irdVar instanceof c89 ? (c89) irdVar : null, trdVar, null, true, false);
                    } else {
                        t3fVar = irdVar.u(trdVar);
                    }
                    try {
                        ird irdVarJ = t3fVar.j();
                        try {
                            x16Var.invoke();
                            ird.q(irdVarJ);
                            t3fVar.c();
                        } catch (Throwable th3) {
                            try {
                                ird.q(irdVarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    t3fVar.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    p89VarA.k(p89VarA.c - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                p89VarA.k(p89VarA.c - 1);
                msd msdVar4 = msdVar3;
                Object obj5 = msdVar4.b;
                obj5.getClass();
                int i5 = msdVar4.d;
                e79 e79Var4 = msdVar4.c;
                if (e79Var4 != null) {
                    try {
                        long[] jArr = e79Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                e79 e79Var5 = e79Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            e79Var2 = e79Var5;
                                            Object obj6 = e79Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = e79Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    msdVar4.c(obj5, obj6);
                                                }
                                                if (z3) {
                                                    e79Var2.f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                    this.i = msdVar2;
                                                    this.j = j2;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j5;
                                            e79Var2 = e79Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        e79Var5 = e79Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                    }
                                    e79Var = e79Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    e79Var = e79Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                e79Var4 = e79Var;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                            this.i = msdVar2;
                            this.j = j2;
                            throw th;
                        }
                    }
                } else {
                    j3 = j;
                }
                msdVar4.b = obj4;
                msdVar4.c = e79Var3;
                msdVar4.d = i4;
                synchronized (this.g) {
                    this.i = msdVar2;
                    this.j = j3;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void e() {
        z8d z8dVar = this.d;
        qrd.b(qrd.a);
        synchronized (qrd.c) {
            qrd.h = s72.R0(qrd.h, z8dVar);
        }
        this.h = new hrd(z8dVar);
    }
}
