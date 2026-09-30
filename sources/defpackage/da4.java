package defpackage;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class da4 {
    public int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public da4() {
        this.a = 64;
        this.b = 5;
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
    }

    public static void e(da4 da4Var, zhb zhbVar, cib cibVar, zhb zhbVar2, int i) {
        vd9 vd9Var;
        if ((i & 1) != 0) {
            zhbVar = null;
        }
        if ((i & 2) != 0) {
            cibVar = null;
        }
        if ((i & 4) != 0) {
            zhbVar2 = null;
        }
        da4Var.getClass();
        TimeZone timeZone = keg.a;
        boolean zIsShutdown = da4Var.b().isShutdown();
        synchronized (da4Var) {
            if (cibVar != null) {
                try {
                    if (!((ArrayDeque) da4Var.f).remove(cibVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zhbVar2 != null) {
                zhbVar2.b.decrementAndGet();
                if (!((ArrayDeque) da4Var.e).remove(zhbVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (zhbVar != null) {
                ((ArrayDeque) da4Var.d).add(zhbVar);
                zhb zhbVarC = da4Var.c(zhbVar.c.b.a.d);
                if (zhbVarC != null) {
                    zhbVar.b = zhbVarC.b;
                }
            }
            if ((cibVar != null || zhbVar2 != null) && (zIsShutdown || ((ArrayDeque) da4Var.e).isEmpty())) {
                ((ArrayDeque) da4Var.f).isEmpty();
            }
            int i2 = 16;
            if (zIsShutdown) {
                List listJ1 = s72.j1((ArrayDeque) da4Var.d);
                ((ArrayDeque) da4Var.d).clear();
                vd9Var = new vd9(i2, listJ1);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) da4Var.d).iterator();
                it.getClass();
                while (it.hasNext()) {
                    zhb zhbVar3 = (zhb) it.next();
                    if (((ArrayDeque) da4Var.e).size() >= da4Var.a) {
                        break;
                    }
                    if (zhbVar3.b.get() < da4Var.b) {
                        it.remove();
                        zhbVar3.b.incrementAndGet();
                        arrayList.add(zhbVar3);
                        ((ArrayDeque) da4Var.e).add(zhbVar3);
                    }
                }
                vd9Var = new vd9(i2, arrayList);
            }
        }
        int size = ((List) vd9Var.b).size();
        boolean z = true;
        for (int i3 = 0; i3 < size; i3++) {
            zhb zhbVar4 = (zhb) ((List) vd9Var.b).get(i3);
            if (zhbVar4 == zhbVar) {
                z = false;
            } else {
                zhbVar4.c.d.getClass();
            }
            if (zIsShutdown) {
                zhbVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                cib cibVar2 = zhbVar4.c;
                cibVar2.g(interruptedIOException);
                zhbVar4.a.h(cibVar2, interruptedIOException);
            } else {
                ExecutorService executorServiceB = da4Var.b();
                zhbVar4.getClass();
                cib cibVar3 = zhbVar4.c;
                cibVar3.a.a.getClass();
                try {
                    try {
                        executorServiceB.execute(zhbVar4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        cib cibVar4 = zhbVar4.c;
                        cibVar4.g(interruptedIOException2);
                        zhbVar4.a.h(cibVar4, interruptedIOException2);
                        da4 da4Var2 = cibVar3.a.a;
                        da4Var2.getClass();
                        e(da4Var2, null, null, zhbVar4, 3);
                    }
                } catch (Throwable th2) {
                    da4 da4Var3 = cibVar3.a.a;
                    da4Var3.getClass();
                    e(da4Var3, null, null, zhbVar4, 3);
                    throw th2;
                }
            }
        }
        if (!z || zhbVar == null) {
            return;
        }
        zhbVar.c.d.getClass();
    }

    public long a(int i, int i2) {
        int i3;
        fz3 fz3Var = (fz3) this.c;
        int[] iArr = (int[]) fz3Var.b;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) fz3Var.c;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            k37.a("width must be >= 0");
        }
        return ll2.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public synchronized ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = (ThreadPoolExecutor) this.c;
        if (threadPoolExecutor == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new jeg(keg.b + " Dispatcher", false));
            this.c = threadPoolExecutor2;
            threadPoolExecutor = threadPoolExecutor2;
        }
        return threadPoolExecutor;
    }

    public zhb c(String str) {
        Iterator it = ((ArrayDeque) this.e).iterator();
        it.getClass();
        while (it.hasNext()) {
            zhb zhbVar = (zhb) it.next();
            if (pa7.t(zhbVar.c.b.a.d, str)) {
                return zhbVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.d).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            zhb zhbVar2 = (zhb) it2.next();
            if (pa7.t(zhbVar2.c.b.a.d, str)) {
                return zhbVar2;
            }
        }
        return null;
    }

    public bx7 d(int i) {
        dr5 dr5VarB = ((fx7) this.e).b(i);
        int i2 = dr5VarB.a;
        int size = dr5VarB.b.size();
        int i3 = 0;
        int i4 = (size == 0 || i2 + size == this.a) ? 0 : this.b;
        ax7[] ax7VarArr = new ax7[size];
        int i5 = 0;
        while (true) {
            List list = dr5VarB.b;
            if (i3 >= size) {
                return new bx7(i, ax7VarArr, (fz3) this.f, list, i4);
            }
            int i6 = (int) ((af6) list.get(i3)).a;
            int i7 = i4;
            ax7 ax7VarB0 = ((ww7) this.d).B0(a(i5, i6), i2 + i3, i5, i6, i7);
            i5 += i6;
            ax7VarArr[i3] = ax7VarB0;
            i3++;
            i4 = i7;
        }
    }

    public void f(int i) {
        if (i < 1) {
            qc0.o(tec.e(i, "max < 1: "));
            return;
        }
        synchronized (this) {
            this.a = i;
        }
        e(this, null, null, null, 7);
    }

    public void g(int i) {
        if (i < 1) {
            qc0.o(tec.e(i, "max < 1: "));
            return;
        }
        synchronized (this) {
            this.b = i;
        }
        e(this, null, null, null, 7);
    }

    public da4(fz3 fz3Var, int i, int i2, ww7 ww7Var, fx7 fx7Var) {
        this.f = fz3Var;
        this.c = fz3Var;
        this.a = i;
        this.b = i2;
        this.d = ww7Var;
        this.e = fx7Var;
    }
}
