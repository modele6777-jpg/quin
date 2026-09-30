package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class mxc {
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long v;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final jxc b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = ud0.a;
        g = unsafe.objectFieldOffset(mxc.class.getDeclaredField("head$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(mxc.class, "deqIdx$volatile");
        v = unsafe.objectFieldOffset(mxc.class.getDeclaredField("tail$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(mxc.class, "enqIdx$volatile");
        e = AtomicIntegerFieldUpdater.newUpdater(mxc.class, "_availablePermits$volatile");
        f = unsafe.objectFieldOffset(mxc.class.getDeclaredField("_availablePermits$volatile"));
    }

    public mxc(int i) {
        this.a = i;
        if (i <= 0) {
            qc0.o(tec.e(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            qc0.o(tec.e(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        pxc pxcVar = new pxc(0L, null, 2);
        this.head$volatile = pxcVar;
        this.tail$volatile = pxcVar;
        this._availablePermits$volatile = i;
        this.b = new jxc(0, this);
    }

    public final Object a(zn2 zn2Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = e;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.a;
        } while (andDecrement > i);
        wef wefVar = wef.a;
        if (andDecrement <= 0) {
            pl1 pl1VarW = pa7.W(k99.D(zn2Var));
            try {
                if (!c(pl1VarW)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                pl1VarW.n(wefVar, this.b);
                                break;
                            }
                            if (c(pl1VarW)) {
                                break;
                            }
                        }
                    }
                }
                Object objT = pl1VarW.t();
                bw2 bw2Var = bw2.a;
                if (objT != bw2Var) {
                    objT = wefVar;
                }
                if (objT == bw2Var) {
                    return objT;
                }
            } catch (Throwable th) {
                pl1VarW.D();
                throw th;
            }
        }
        return wefVar;
    }

    public final boolean c(fzf fzfVar) {
        Object objA;
        Unsafe unsafe;
        mxc mxcVar = this;
        Unsafe unsafe2 = ud0.a;
        long j = v;
        pxc pxcVar = (pxc) unsafe2.getObjectVolatile(mxcVar, j);
        long andIncrement = d.getAndIncrement(mxcVar);
        kxc kxcVar = kxc.a;
        long j2 = andIncrement / ((long) oxc.f);
        loop0: while (true) {
            objA = kh2.a(pxcVar, j2, kxcVar);
            if (r8c.i(objA)) {
                break;
            }
            rtc rtcVarG = r8c.g(objA);
            while (true) {
                rtc rtcVar = (rtc) ud0.a.getObjectVolatile(mxcVar, j);
                if (rtcVar.d >= rtcVarG.d) {
                    mxcVar = this;
                    break loop0;
                }
                if (!rtcVarG.j()) {
                    break;
                }
                do {
                    unsafe = ud0.a;
                    mxcVar = this;
                    if (unsafe.compareAndSwapObject(mxcVar, v, rtcVar, rtcVarG)) {
                        if (!rtcVar.f()) {
                            break loop0;
                        }
                        rtcVar.e();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(mxcVar, j) == rtcVar);
                if (rtcVarG.f()) {
                    rtcVarG.e();
                }
            }
            mxcVar = this;
        }
        pxc pxcVar2 = (pxc) r8c.g(objA);
        AtomicReferenceArray atomicReferenceArray = pxcVar2.g;
        int i = (int) (andIncrement % ((long) oxc.f));
        while (!atomicReferenceArray.compareAndSet(i, null, fzfVar)) {
            if (atomicReferenceArray.get(i) != null) {
                ig4 ig4Var = oxc.b;
                ig4 ig4Var2 = oxc.c;
                while (!atomicReferenceArray.compareAndSet(i, ig4Var, ig4Var2)) {
                    if (atomicReferenceArray.get(i) != ig4Var) {
                        return false;
                    }
                }
                ((ol1) fzfVar).n(wef.a, mxcVar.b);
                return true;
            }
        }
        fzfVar.a(pxcVar2, i);
        return true;
    }

    public final void d() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object objA;
        boolean zI;
        Unsafe unsafe2;
        do {
            int andIncrement = e.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    unsafe = ud0.a;
                    j = f;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.a;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                cva.h(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = ud0.a;
            long j2 = g;
            pxc pxcVar = (pxc) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = c.getAndIncrement(this);
            long j3 = andIncrement2 / ((long) oxc.f);
            lxc lxcVar = lxc.a;
            while (true) {
                objA = kh2.a(pxcVar, j3, lxcVar);
                if (!r8c.i(objA)) {
                    rtc rtcVarG = r8c.g(objA);
                    while (true) {
                        rtc rtcVar = (rtc) ud0.a.getObjectVolatile(this, j2);
                        if (rtcVar.d >= rtcVarG.d) {
                            break;
                        }
                        if (!rtcVarG.j()) {
                            break;
                        }
                        do {
                            unsafe2 = ud0.a;
                            if (unsafe2.compareAndSwapObject(this, g, rtcVar, rtcVarG)) {
                                if (!rtcVar.f()) {
                                    break;
                                }
                                rtcVar.e();
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(this, j2) == rtcVar);
                        if (rtcVarG.f()) {
                            rtcVarG.e();
                        }
                    }
                } else {
                    break;
                }
            }
            pxc pxcVar2 = (pxc) r8c.g(objA);
            AtomicReferenceArray atomicReferenceArray = pxcVar2.g;
            pxcVar2.a();
            zI = false;
            if (pxcVar2.d <= j3) {
                int i3 = (int) (andIncrement2 % ((long) oxc.f));
                Object andSet = atomicReferenceArray.getAndSet(i3, oxc.b);
                if (andSet == null) {
                    int i4 = oxc.a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            ig4 ig4Var = oxc.b;
                            ig4 ig4Var2 = oxc.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i3, ig4Var, ig4Var2)) {
                                    zI = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i3) == ig4Var);
                            zI = !zI;
                            break;
                        }
                        if (atomicReferenceArray.get(i3) == oxc.c) {
                            zI = true;
                            break;
                        }
                        i5++;
                    }
                } else if (andSet != oxc.e) {
                    boolean z = andSet instanceof ol1;
                    wef wefVar = wef.a;
                    if (z) {
                        ol1 ol1Var = (ol1) andSet;
                        ig4 ig4VarJ = ol1Var.j(wefVar, this.b);
                        if (ig4VarJ != null) {
                            ol1Var.q(ig4VarJ);
                            zI = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof ytc)) {
                            pd4.i(andSet, "unexpected: ");
                            return;
                        }
                        zI = ((ytc) andSet).i(this, wefVar);
                    }
                }
            }
        } while (!zI);
    }
}
