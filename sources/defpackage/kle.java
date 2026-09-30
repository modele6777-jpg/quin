package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kle {
    public static final Logger k;
    public static final kle l;
    public final vrb a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final wwg j;

    static {
        Logger logger = Logger.getLogger(kle.class.getName());
        logger.getClass();
        k = logger;
        l = new kle(new vrb(new jeg(ks0.l(new StringBuilder(), keg.b, " TaskRunner"), true)));
    }

    public kle(vrb vrbVar) {
        Logger logger = k;
        logger.getClass();
        this.a = vrbVar;
        this.b = logger;
        this.c = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new wwg(25, this);
    }

    public final void a(ele eleVar, long j, boolean z) {
        TimeZone timeZone = keg.a;
        jle jleVar = eleVar.c;
        jleVar.getClass();
        if (jleVar.d != eleVar) {
            qc0.p("Check failed.");
            return;
        }
        boolean z2 = jleVar.f;
        jleVar.f = false;
        jleVar.d = null;
        this.h.remove(jleVar);
        if (j != -1 && !z2 && !jleVar.c) {
            jleVar.e(eleVar, j, true);
        }
        if (jleVar.e.isEmpty()) {
            return;
        }
        this.i.add(jleVar);
        if (z) {
            return;
        }
        e();
    }

    public final ele b() {
        boolean z;
        TimeZone timeZone = keg.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            ele eleVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ele eleVar2 = (ele) ((jle) it.next()).e.get(0);
                long jMax = Math.max(0L, eleVar2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (eleVar != null) {
                        z = true;
                        break;
                    }
                    eleVar = eleVar2;
                }
            }
            ArrayList arrayList2 = this.h;
            if (eleVar != null) {
                TimeZone timeZone2 = keg.a;
                eleVar.d = -1L;
                jle jleVar = eleVar.c;
                jleVar.getClass();
                jleVar.e.remove(eleVar);
                arrayList.remove(jleVar);
                jleVar.d = eleVar;
                arrayList2.add(jleVar);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return eleVar;
            }
            if (this.d) {
                if (jMin >= this.e - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.d = true;
            this.e = jNanoTime + jMin;
            try {
                try {
                    TimeZone timeZone3 = keg.a;
                    if (jMin > 0) {
                        long j = jMin / 1000000;
                        long j2 = jMin - (1000000 * j);
                        if (j > 0 || jMin > 0) {
                            wait(j, (int) j2);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = keg.a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((jle) arrayList2.get(size)).a();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        jle jleVar2 = (jle) arrayList.get(size2);
                        jleVar2.a();
                        if (jleVar2.e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.d = false;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
        return null;
    }

    public final void c(jle jleVar) {
        jleVar.getClass();
        TimeZone timeZone = keg.a;
        if (jleVar.d == null) {
            boolean zIsEmpty = jleVar.e.isEmpty();
            ArrayList arrayList = this.i;
            if (zIsEmpty) {
                arrayList.remove(jleVar);
            } else {
                byte[] bArr = ieg.a;
                if (!arrayList.contains(jleVar)) {
                    arrayList.add(jleVar);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final jle d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new jle(this, tec.e(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = keg.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        ((ThreadPoolExecutor) this.a.b).execute(this.j);
    }
}
