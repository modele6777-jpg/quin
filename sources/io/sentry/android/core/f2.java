package io.sentry.android.core;

import io.sentry.g3;
import io.sentry.i3;
import io.sentry.y5;
import io.sentry.z4;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f2 implements io.sentry.android.core.internal.util.n, io.sentry.b1 {
    public static final y5 h = new y5(0, 0);
    public final boolean a;
    public final io.sentry.android.core.internal.util.o c;
    public volatile String d;
    public final TreeSet e;
    public final io.sentry.util.a b = new io.sentry.util.a();
    public final ConcurrentSkipListSet f = new ConcurrentSkipListSet();
    public long g = 16666666;

    public f2(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.o oVar) {
        boolean z = false;
        z = false;
        this.e = new TreeSet(new d2(z ? 1 : 0));
        this.c = oVar;
        if (sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking()) {
            z = true;
        }
        this.a = z;
    }

    public static long g(z4 z4Var) {
        if (z4Var instanceof y5) {
            return z4Var.b(h);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - z4Var.d());
    }

    @Override // io.sentry.android.core.internal.util.n
    public final void b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j5 = (long) (1.0E9d / ((double) f));
        this.g = j5;
        if (z || z2) {
            concurrentSkipListSet.add(new e2(j, j2, j3, j4, z, z2, j5));
        }
    }

    public final void d() {
        io.sentry.util.a aVar = this.b;
        aVar.b();
        try {
            if (this.d != null) {
                this.c.c(this.d);
                this.d = null;
            }
            this.f.clear();
            this.e.clear();
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x015e  */
    public final void e(io.sentry.o1 o1Var) throws Throwable {
        io.sentry.util.a aVar;
        z4 z4VarV;
        ConcurrentSkipListSet concurrentSkipListSet;
        TreeSet treeSet;
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        long jLongValue;
        ConcurrentSkipListSet concurrentSkipListSet2;
        ConcurrentSkipListSet concurrentSkipListSet3 = this.f;
        io.sentry.util.a aVar2 = this.b;
        TreeSet treeSet2 = this.e;
        if (!this.a || (o1Var instanceof g3) || (o1Var instanceof i3)) {
            return;
        }
        aVar2.b();
        try {
            if (!treeSet2.contains(o1Var)) {
                aVar2.close();
                return;
            }
            aVar2.close();
            aVar2.b();
            try {
                if (treeSet2.remove(o1Var) && (z4VarV = o1Var.v()) != null) {
                    long jG = g(o1Var.z());
                    long jG2 = g(z4VarV);
                    long j4 = jG2 - jG;
                    if (j4 <= 0) {
                        aVar2.close();
                        concurrentSkipListSet = concurrentSkipListSet3;
                        aVar = aVar2;
                        treeSet = treeSet2;
                    } else {
                        long j5 = this.g;
                        int i3 = 1;
                        if (concurrentSkipListSet3.isEmpty()) {
                            concurrentSkipListSet = concurrentSkipListSet3;
                            aVar = aVar2;
                            treeSet = treeSet2;
                            i = 0;
                            i2 = 0;
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                        } else {
                            Iterator it = concurrentSkipListSet3.tailSet(new e2(jG)).iterator();
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                            i = 0;
                            i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    aVar = aVar2;
                                    treeSet = treeSet2;
                                    break;
                                }
                                e2 e2Var = (e2) it.next();
                                aVar = aVar2;
                                treeSet = treeSet2;
                                try {
                                    long j6 = e2Var.a;
                                    long j7 = e2Var.d;
                                    long j8 = e2Var.g;
                                    long j9 = e2Var.b;
                                    if (j6 > jG2) {
                                        break;
                                    }
                                    if (j6 < jG || j9 > jG2) {
                                        if ((jG > j6 && jG < j9) || (jG2 > j6 && jG2 < j9)) {
                                            concurrentSkipListSet2 = concurrentSkipListSet3;
                                            long jMin = Math.min(j7 - Math.max(0L, Math.max(0L, jG - j6) - j8), j4);
                                            long jMin2 = Math.min(jG2, j9) - Math.max(jG, e2Var.a);
                                            boolean z = jMin2 > j8;
                                            j3 += jMin2;
                                            if (jMin2 > 700000000) {
                                                j2 += jMin;
                                                i2++;
                                            } else if (z) {
                                                j += jMin;
                                                i++;
                                            }
                                        }
                                        aVar2 = aVar;
                                        treeSet2 = treeSet;
                                        concurrentSkipListSet3 = concurrentSkipListSet2;
                                        j5 = j8;
                                    } else {
                                        long j10 = e2Var.c;
                                        boolean z2 = e2Var.e;
                                        j3 += j10;
                                        if (e2Var.f) {
                                            j2 += j7;
                                            i2++;
                                        } else if (z2) {
                                            j += j7;
                                            i++;
                                        }
                                    }
                                    concurrentSkipListSet2 = concurrentSkipListSet3;
                                    aVar2 = aVar;
                                    treeSet2 = treeSet;
                                    concurrentSkipListSet3 = concurrentSkipListSet2;
                                    j5 = j8;
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    try {
                                        aVar.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            }
                            concurrentSkipListSet = concurrentSkipListSet3;
                        }
                        int iCeil = i + i2;
                        io.sentry.android.core.internal.util.o oVar = this.c;
                        if (oVar.y == null || oVar.z == null) {
                            jLongValue = -1;
                        } else {
                            try {
                                Long l = (Long) oVar.z.get(oVar.y);
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                            } catch (IllegalAccessException unused) {
                            }
                        }
                        if (jLongValue != -1) {
                            long jMax = Math.max(0L, jG2 - jLongValue);
                            if (jMax > j5) {
                                boolean z3 = jMax > 700000000;
                                long jMax2 = Math.max(0L, jMax - j5);
                                j3 += jMax;
                                if (z3) {
                                    j2 += jMax2;
                                    i2++;
                                } else {
                                    j += jMax2;
                                    i++;
                                }
                            } else {
                                i3 = 0;
                            }
                            long j11 = j4 - j3;
                            iCeil = iCeil + i3 + (j11 > 0 ? (int) Math.ceil(j11 / j5) : 0);
                        }
                        double d = (j + j2) / 1.0E9d;
                        o1Var.k(Integer.valueOf(iCeil), "frames.total");
                        o1Var.k(Integer.valueOf(i), "frames.slow");
                        o1Var.k(Integer.valueOf(i2), "frames.frozen");
                        o1Var.k(Double.valueOf(d), "frames.delay");
                        if (o1Var instanceof io.sentry.q1) {
                            o1Var.w("frames_total", Integer.valueOf(iCeil));
                            o1Var.w("frames_slow", Integer.valueOf(i));
                            o1Var.w("frames_frozen", Integer.valueOf(i2));
                            o1Var.w("frames_delay", Double.valueOf(d));
                        }
                        aVar.close();
                    }
                } else {
                    aVar2.close();
                    concurrentSkipListSet = concurrentSkipListSet3;
                    aVar = aVar2;
                    treeSet = treeSet2;
                }
                aVar.b();
                try {
                    if (treeSet.isEmpty()) {
                        d();
                    } else {
                        concurrentSkipListSet.headSet(new e2(g(((io.sentry.o1) treeSet.first()).z()))).clear();
                    }
                    aVar.close();
                } catch (Throwable th4) {
                    try {
                        aVar.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                aVar = aVar2;
            }
        } catch (Throwable th7) {
            try {
                aVar2.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    public final void f(io.sentry.o1 o1Var) {
        if (!this.a || (o1Var instanceof g3) || (o1Var instanceof i3)) {
            return;
        }
        io.sentry.util.a aVar = this.b;
        aVar.b();
        try {
            this.e.add(o1Var);
            if (this.d == null) {
                this.d = this.c.b(this);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
