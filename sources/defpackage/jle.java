package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jle {
    public final kle a;
    public final String b;
    public boolean c;
    public ele d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public jle(kle kleVar, String str) {
        this.a = kleVar;
        this.b = str;
    }

    public static void b(jle jleVar, String str, x16 x16Var) {
        jleVar.getClass();
        str.getClass();
        x16Var.getClass();
        jleVar.c(new s94(str, x16Var), 0L);
    }

    public final boolean a() {
        ele eleVar = this.d;
        if (eleVar != null && eleVar.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((ele) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                ele eleVar2 = (ele) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    gcc.v(logger, eleVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(ele eleVar, long j) {
        eleVar.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (e(eleVar, j, false)) {
                    this.a.c(this);
                }
                return;
            }
            boolean z = eleVar.b;
            Logger logger = this.a.b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    gcc.v(logger, eleVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    gcc.v(logger, eleVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[LOOP:0: B:23:0x0062->B:28:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[EDGE_INSN: B:40:0x007a->B:30:0x007a BREAK  A[LOOP:0: B:23:0x0062->B:28:0x0076], SYNTHETIC] */
    public final boolean e(ele eleVar, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        Logger logger = this.a.b;
        eleVar.getClass();
        jle jleVar = eleVar.c;
        if (jleVar != this) {
            if (jleVar != null) {
                qc0.p("task is in multiple queues");
                return false;
            }
            eleVar.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(eleVar);
        if (iIndexOf == -1) {
            eleVar.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(gcc.p(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(gcc.p(j2 - jNanoTime));
                }
                gcc.v(logger, eleVar, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((ele) it.next()).d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, eleVar);
            if (size == 0) {
                return true;
            }
        } else if (eleVar.d > j2) {
            arrayList.remove(iIndexOf);
            eleVar.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(gcc.p(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(gcc.p(j2 - jNanoTime));
                }
                gcc.v(logger, eleVar, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((ele) it.next()).d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, eleVar);
            if (size == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            gcc.v(logger, eleVar, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void f() {
        kle kleVar = this.a;
        TimeZone timeZone = keg.a;
        synchronized (kleVar) {
            this.c = true;
            if (a()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
