package defpackage;

import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pt9 implements AutoCloseable {
    public final st9 a;
    public final Object b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long v;
    public final ArrayList w;
    public final LinkedHashMap x;

    public pt9(st9 st9Var) {
        st9Var.getClass();
        this.a = st9Var;
        this.b = new Object();
        this.d = 1L;
        this.e = Long.MIN_VALUE;
        this.f = Long.MIN_VALUE;
        this.g = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = new ArrayList();
        this.x = new LinkedHashMap();
    }

    public final void b(long j) {
        synchronized (this.b) {
            try {
                if (this.c) {
                    return;
                }
                this.g = j;
                Iterator it = this.w.iterator();
                ot9 ot9Var = null;
                boolean z = false;
                Object obj = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (z) {
                            break;
                        }
                    } else {
                        Object next = it.next();
                        if (((ot9) next).b == j) {
                            if (!z) {
                                obj = next;
                                z = true;
                            }
                        }
                    }
                    obj = null;
                    break;
                }
                ot9 ot9Var2 = (ot9) obj;
                if (ot9Var2 != null) {
                    this.v = ot9Var2.e;
                    this.w.remove(ot9Var2);
                    ot9Var = ot9Var2;
                }
                if (ot9Var != null) {
                    ot9Var.a(-1L, new vt9(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            this.c = true;
            ArrayList arrayListL1 = s72.l1(this.x.values());
            this.x.clear();
            ArrayList<ot9> arrayList = new ArrayList(this.w);
            this.w.clear();
            Iterator it = arrayListL1.iterator();
            while (it.hasNext()) {
                Object obj = ((tt9) it.next()).a;
            }
            for (ot9 ot9Var : arrayList) {
                ot9Var.getClass();
                ot9Var.a(-1L, new vt9(11));
            }
        }
    }

    public final void h(long j, Object obj) {
        Object tt9Var;
        ArrayList<ot9> arrayList;
        Object next;
        synchronized (this.b) {
            try {
                if (this.c || this.a.a(this.v, j)) {
                    tt9Var = new tt9(obj);
                } else {
                    Iterator it = this.w.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!this.a.a(((ot9) next).e, j));
                    ot9 ot9Var = (ot9) next;
                    if (ot9Var != null) {
                        ArrayList arrayListU = u(ot9Var.d, ot9Var.e, ot9Var.a);
                        ot9Var.a(j, obj);
                        this.w.remove(ot9Var);
                        arrayList = arrayListU;
                        tt9Var = null;
                    } else {
                        this.x.put(Long.valueOf(j), new tt9(obj));
                        if (this.x.size() > 3) {
                            tt9Var = this.x.remove(Long.valueOf(((Number) s72.u0(this.x.keySet())).longValue()));
                        } else {
                            tt9Var = null;
                            arrayList = null;
                        }
                    }
                }
                arrayList = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        tt9 tt9Var2 = (tt9) tt9Var;
        if (tt9Var2 == null || tt9.a(tt9Var2.a)) {
        }
        if (arrayList != null) {
            for (ot9 ot9Var2 : arrayList) {
                ot9Var2.getClass();
                ot9Var2.a(-1L, new vt9(12));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0162  */
    /* JADX WARN: Code duplicated, block: B:81:0x016c A[LOOP:2: B:79:0x0166->B:81:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0193  */
    /* JADX WARN: Code duplicated, block: B:91:0x019d  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a4  */
    public final void l(long j, long j2, long j3, nt9 nt9Var) throws Throwable {
        Object next;
        Object obj;
        Object next2;
        tt9 tt9Var;
        ArrayList<ot9> arrayListU;
        Object objRemove;
        boolean z;
        tt9 tt9Var2;
        Object vt9Var;
        Object next3;
        nt9Var.getClass();
        Object obj2 = this.b;
        synchronized (obj2) {
            try {
                Iterator it = this.w.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((ot9) next).b == j));
                ot9 ot9Var = (ot9) next;
                if (ot9Var != null) {
                    b1.l("CXCP", "onOutputStarted was invoked multiple times with a previously started output!onOutputStarted with " + ((Object) yy5.a(j)) + ", " + ((Object) ("CameraTimestamp(value=" + j2 + ')')) + ", " + j3 + ". Previously started output: " + ot9Var + ". Ignoring.");
                    return;
                }
                boolean z2 = this.c;
                long j4 = this.d;
                this.d = j4 + 1;
                try {
                    if (!z2 && this.g != j && this.v != j3) {
                        boolean z3 = j < this.f;
                        if (!z3) {
                            this.f = j;
                        }
                        boolean z4 = j3 < this.e;
                        if (!z4) {
                            this.e = j3;
                        }
                        boolean z5 = z3 || z4;
                        Iterator it2 = this.x.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = obj2;
                                next3 = null;
                                break;
                            } else {
                                next3 = it2.next();
                                obj = obj2;
                                if (this.a.a(j3, ((Number) next3).longValue())) {
                                    break;
                                } else {
                                    obj2 = obj;
                                }
                            }
                        }
                        Long l = (Long) next3;
                        if (l != null) {
                            objRemove = this.x.remove(l);
                            arrayListU = u(j4, j3, z5);
                            tt9Var = null;
                        } else {
                            this.w.add(new ot9(z5, j, j2, j4, j3, nt9Var));
                            z = false;
                            arrayListU = null;
                            tt9Var = null;
                            objRemove = null;
                        }
                        if (arrayListU != null) {
                            for (ot9 ot9Var2 : arrayListU) {
                                ot9Var2.getClass();
                                ot9Var2.a(-1L, new vt9(12));
                            }
                        }
                        if (tt9Var != null && !tt9.a(tt9Var.a)) {
                        }
                        if (z) {
                            if (z2) {
                                vt9Var = new vt9(11);
                            } else {
                                tt9Var2 = (tt9) objRemove;
                                if (tt9Var2 != null) {
                                    vt9Var = tt9Var2.a;
                                } else {
                                    vt9Var = new vt9(10);
                                }
                            }
                            nt9Var.b(vt9Var);
                        }
                    }
                    obj = obj2;
                    Iterator it3 = this.x.keySet().iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!this.a.a(j3, ((Number) next2).longValue()));
                    Long l2 = (Long) next2;
                    tt9Var = l2 != null ? (tt9) this.x.remove(l2) : null;
                    arrayListU = null;
                    objRemove = null;
                    z = true;
                    if (arrayListU != null) {
                        while (r0.hasNext()) {
                            ot9Var2.getClass();
                            ot9Var2.a(-1L, new vt9(12));
                        }
                    }
                    if (tt9Var != null) {
                    }
                    if (z) {
                        if (z2) {
                            vt9Var = new vt9(11);
                        } else {
                            tt9Var2 = (tt9) objRemove;
                            if (tt9Var2 != null) {
                                vt9Var = tt9Var2.a;
                            } else {
                                vt9Var = new vt9(10);
                            }
                        }
                        nt9Var.b(vt9Var);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final ArrayList u(long j, long j2, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.w;
        for (Object obj : arrayList2) {
            ot9 ot9Var = (ot9) obj;
            if (ot9Var.a == z && ot9Var.d < j && ot9Var.e < j2) {
                arrayList.add(obj);
            }
        }
        arrayList2.removeAll(arrayList);
        return arrayList;
    }
}
