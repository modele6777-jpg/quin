package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i6c extends q98 {
    public final w5c l;
    public final w84 m;
    public final f6c o;
    public final pv2 s;
    public final boolean n = true;
    public final AtomicBoolean p = new AtomicBoolean(true);
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean r = new AtomicBoolean(false);

    public i6c(w5c w5cVar, w84 w84Var, String[] strArr) {
        pv2 pv2Var;
        this.l = w5cVar;
        this.m = w84Var;
        this.o = new f6c(strArr, this);
        if (w5cVar.k()) {
            pv2Var = w5cVar.b;
            if (pv2Var == null) {
                pa7.g0("transactionContext");
                throw null;
            }
        } else {
            pv2Var = nu4.a;
        }
        this.s = pv2Var;
    }

    @Override // defpackage.q98
    public final void g() {
        w84 w84Var = this.m;
        w84Var.getClass();
        ((Set) w84Var.c).add(this);
        qn2 qn2Var = this.l.a;
        if (qn2Var == null) {
            pa7.g0("coroutineScope");
            throw null;
        }
        ynb.V(qn2Var, this.s, null, new g6c(this, null), 2);
    }

    @Override // defpackage.q98
    public final void h() {
        w84 w84Var = this.m;
        w84Var.getClass();
        ((Set) w84Var.c).remove(this);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba A[Catch: all -> 0x0031, Exception -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0034, blocks: (B:12:0x0029, B:44:0x00ba), top: B:64:0x0029, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0 A[LOOP:0: B:42:0x00b4->B:48:0x00d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x0029, B:42:0x00b4, B:44:0x00ba, B:52:0x00dd, B:49:0x00d3, B:50:0x00da), top: B:62:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00b2 -> B:42:0x00b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e8 -> B:57:0x00e9). Please report as a decompilation issue!!! */
    public final Object l(zn2 zn2Var) {
        h6c h6cVar;
        int i;
        Object obj;
        Object objK;
        bw2 bw2Var;
        if (zn2Var instanceof h6c) {
            h6cVar = (h6c) zn2Var;
            int i2 = h6cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h6cVar.label = i2 - Integer.MIN_VALUE;
            } else {
                h6cVar = new h6c(this, zn2Var);
            }
        } else {
            h6cVar = new h6c(this, zn2Var);
        }
        Object obj2 = h6cVar.result;
        int i3 = h6cVar.label;
        AtomicBoolean atomicBoolean = this.p;
        AtomicBoolean atomicBoolean2 = this.q;
        try {
            if (i3 == 0) {
                jzb.q(obj2);
                if (this.r.compareAndSet(false, true)) {
                    jb7 jb7VarF = this.l.f();
                    f6c f6cVar = this.o;
                    f6cVar.getClass();
                    f0g f0gVar = new f0g(jb7VarF, f6cVar);
                    LinkedHashMap linkedHashMap = jb7VarF.c;
                    j5f j5fVar = jb7VarF.b;
                    iy9 iy9VarG = j5fVar.g(f0gVar.a);
                    String[] strArr = (String[]) iy9VarG.a();
                    int[] iArr = (int[]) iy9VarG.b();
                    cl9 cl9Var = new cl9(f0gVar, iArr, strArr);
                    ReentrantLock reentrantLock = jb7VarF.d;
                    reentrantLock.lock();
                    try {
                        cl9 cl9Var2 = linkedHashMap.containsKey(f0gVar) ? (cl9) bm8.B(linkedHashMap, f0gVar) : (cl9) linkedHashMap.put(f0gVar, cl9Var);
                        reentrantLock.unlock();
                        if (cl9Var2 == null && j5fVar.h.a(iArr)) {
                            d8c.r(new gb7(jb7VarF, null));
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                if (atomicBoolean2.compareAndSet(false, true)) {
                    obj = null;
                    i = 0;
                    while (atomicBoolean.compareAndSet(true, false)) {
                        h6cVar.I$0 = 1;
                        h6cVar.label = 1;
                        b6c b6cVar = (b6c) this;
                        objK = urg.K(h6cVar, b6cVar.t, b6cVar.l, true, b6cVar.n);
                        bw2Var = bw2.a;
                        if (objK == bw2Var) {
                            return bw2Var;
                        }
                        obj = objK;
                        i = 1;
                    }
                    if (i != 0) {
                        i(obj);
                    }
                    atomicBoolean2.set(false);
                } else {
                    i = 0;
                }
                if (i != 0) {
                }
                return wef.a;
            }
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = h6cVar.I$0;
            try {
                jzb.q(obj2);
                obj = obj2;
                i = i4;
                while (atomicBoolean.compareAndSet(true, false)) {
                    h6cVar.I$0 = 1;
                    h6cVar.label = 1;
                    b6c b6cVar2 = (b6c) this;
                    objK = urg.K(h6cVar, b6cVar2.t, b6cVar2.l, true, b6cVar2.n);
                    bw2Var = bw2.a;
                    if (objK == bw2Var) {
                        return bw2Var;
                    }
                    obj = objK;
                    i = 1;
                }
                if (i != 0) {
                    i(obj);
                }
                atomicBoolean2.set(false);
                if (i != 0 || !atomicBoolean.get()) {
                    return wef.a;
                }
                if (atomicBoolean2.compareAndSet(false, true)) {
                    obj = null;
                    i = 0;
                    while (atomicBoolean.compareAndSet(true, false)) {
                        h6cVar.I$0 = 1;
                        h6cVar.label = 1;
                        b6c b6cVar3 = (b6c) this;
                        objK = urg.K(h6cVar, b6cVar3.t, b6cVar3.l, true, b6cVar3.n);
                        bw2Var = bw2.a;
                        if (objK == bw2Var) {
                            return bw2Var;
                        }
                        obj = objK;
                        i = 1;
                    }
                    if (i != 0) {
                        i(obj);
                    }
                    atomicBoolean2.set(false);
                } else {
                    i = 0;
                }
                if (i != 0) {
                }
                return wef.a;
            } catch (Exception e) {
                throw new RuntimeException("Exception while computing database live data.", e);
            }
        } catch (Throwable th2) {
            atomicBoolean2.set(false);
            throw th2;
        }
    }
}
