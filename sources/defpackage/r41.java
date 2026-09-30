package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class r41 implements yv1 {
    public static final /* synthetic */ long E0;
    public static final /* synthetic */ long F0;
    public static final /* synthetic */ long G0;
    public static final /* synthetic */ long X;
    public static final /* synthetic */ long Y;
    public static final /* synthetic */ long Z;
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(r41.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicLongFieldUpdater g;
    public static final /* synthetic */ AtomicReferenceFieldUpdater v;
    public static final /* synthetic */ AtomicReferenceFieldUpdater w;
    public static final /* synthetic */ long x;
    public static final /* synthetic */ long y;
    public static final /* synthetic */ long z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final a26 b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final g20 c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = ud0.a;
        G0 = unsafe.objectFieldOffset(r41.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(r41.class, "receivers$volatile");
        E0 = unsafe.objectFieldOffset(r41.class.getDeclaredField("receivers$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(r41.class, "bufferEnd$volatile");
        y = unsafe.objectFieldOffset(r41.class.getDeclaredField("bufferEnd$volatile"));
        g = AtomicLongFieldUpdater.newUpdater(r41.class, "completedExpandBuffersAndPauseFlag$volatile");
        Y = unsafe.objectFieldOffset(r41.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        v = AtomicReferenceFieldUpdater.newUpdater(r41.class, Object.class, "sendSegment$volatile");
        F0 = unsafe.objectFieldOffset(r41.class.getDeclaredField("sendSegment$volatile"));
        w = AtomicReferenceFieldUpdater.newUpdater(r41.class, Object.class, "receiveSegment$volatile");
        Z = unsafe.objectFieldOffset(r41.class.getDeclaredField("receiveSegment$volatile"));
        z = unsafe.objectFieldOffset(r41.class.getDeclaredField("bufferEndSegment$volatile"));
        x = unsafe.objectFieldOffset(r41.class.getDeclaredField("_closeCause$volatile"));
        X = unsafe.objectFieldOffset(r41.class.getDeclaredField("closeHandler$volatile"));
    }

    public r41(int i, a26 a26Var) {
        long j;
        this.a = i;
        this.b = a26Var;
        if (i < 0) {
            qc0.o(tec.f(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        sw1 sw1Var = t41.a;
        if (i != 0) {
            j = i != Integer.MAX_VALUE ? i : Long.MAX_VALUE;
        } else {
            j = 0;
        }
        this.bufferEnd$volatile = j;
        this.completedExpandBuffersAndPauseFlag$volatile = p();
        sw1 sw1Var2 = new sw1(0L, null, this, 3);
        this.sendSegment$volatile = sw1Var2;
        this.receiveSegment$volatile = sw1Var2;
        if (C()) {
            sw1Var2 = t41.a;
            sw1Var2.getClass();
        }
        this.bufferEndSegment$volatile = sw1Var2;
        this.c = a26Var != null ? new g20(4, this) : null;
        this._closeCause$volatile = t41.s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object G(r41 r41Var, zn2 zn2Var) {
        p41 p41Var;
        if (zn2Var instanceof p41) {
            p41Var = (p41) zn2Var;
            int i = p41Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                p41Var.label = i - Integer.MIN_VALUE;
            } else {
                p41Var = new p41(r41Var, zn2Var);
            }
        } else {
            p41Var = new p41(r41Var, zn2Var);
        }
        p41 p41Var2 = p41Var;
        Object obj = p41Var2.result;
        int i2 = p41Var2.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return ((rw1) obj).a;
        }
        jzb.q(obj);
        if (r41Var == null) {
            r3.f();
            return null;
        }
        sw1 sw1Var = (sw1) ud0.a.getObjectVolatile(r41Var, Z);
        while (!r41Var.z()) {
            long andIncrement = e.getAndIncrement(r41Var);
            long j = t41.b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (sw1Var.d != j2) {
                sw1 sw1VarL = r41Var.l(j2, sw1Var);
                if (sw1VarL == null) {
                    continue;
                } else {
                    sw1Var = sw1VarL;
                }
            }
            Object objM = r41Var.M(sw1Var, i3, andIncrement, null);
            if (objM == t41.m) {
                qc0.p("unexpected");
                return null;
            }
            if (objM != t41.o) {
                if (objM != t41.n) {
                    sw1Var.a();
                    return objM;
                }
                p41Var2.L$0 = null;
                p41Var2.L$1 = null;
                p41Var2.L$2 = null;
                p41Var2.L$3 = null;
                p41Var2.L$4 = null;
                p41Var2.I$0 = 0;
                p41Var2.J$0 = andIncrement;
                p41Var2.J$1 = j2;
                p41Var2.I$1 = i3;
                p41Var2.J$2 = andIncrement;
                p41Var2.I$2 = i3;
                p41Var2.I$3 = 0;
                p41Var2.label = 1;
                Object objH = r41Var.H(sw1Var, i3, andIncrement, p41Var2);
                Object obj2 = bw2.a;
                return objH == obj2 ? obj2 : objH;
            }
            if (andIncrement < r41Var.v()) {
                sw1Var.a();
            }
        }
        return new pw1(r41Var.q());
    }

    public final boolean A() {
        return y(ud0.a.getLongVolatile(this, G0), false);
    }

    public boolean B() {
        return false;
    }

    public final boolean C() {
        long jP = p();
        return jP == 0 || jP == Long.MAX_VALUE;
    }

    public final void D(long j, sw1 sw1Var) {
        r41 r41Var;
        sw1 sw1Var2;
        sw1 sw1Var3;
        while (sw1Var.d < j && (sw1Var3 = (sw1) sw1Var.c()) != null) {
            sw1Var = sw1Var3;
        }
        while (true) {
            sw1 sw1Var4 = sw1Var;
            while (sw1Var4.d() && (sw1Var2 = (sw1) sw1Var4.c()) != null) {
                sw1Var4 = sw1Var2;
            }
            while (true) {
                Unsafe unsafe = ud0.a;
                long j2 = z;
                rtc rtcVar = (rtc) unsafe.getObjectVolatile(this, j2);
                if (rtcVar.d >= sw1Var4.d) {
                    return;
                }
                if (!sw1Var4.j()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = ud0.a;
                    r41Var = this;
                    if (unsafe2.compareAndSwapObject(r41Var, z, rtcVar, sw1Var4)) {
                        if (rtcVar.f()) {
                            rtcVar.e();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(r41Var, j2) != rtcVar) {
                        break;
                    } else {
                        this = r41Var;
                    }
                }
                if (sw1Var4.f()) {
                    sw1Var4.e();
                }
                this = r41Var;
            }
            sw1Var = sw1Var4;
        }
    }

    public final Object E(xn2 xn2Var, Object obj) {
        ebf ebfVarR;
        pl1 pl1Var = new pl1(1, k99.D(xn2Var));
        pl1Var.v();
        a26 a26Var = this.b;
        if (a26Var == null || (ebfVarR = vpf.r(a26Var, obj, null)) == null) {
            pl1Var.g(new dzb(u()));
        } else {
            bzd.m(ebfVarR, u());
            pl1Var.g(new dzb(ebfVarR));
        }
        Object objT = pl1Var.t();
        return objT == bw2.a ? objT : wef.a;
    }

    public final void F(Object obj, pl1 pl1Var) {
        a26 a26Var = this.b;
        if (a26Var != null) {
            vpf.q(a26Var, obj, pl1Var.e);
        }
        pl1Var.g(new dzb(u()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object H(sw1 sw1Var, int i, long j, zn2 zn2Var) {
        q41 q41Var;
        rw1 rw1Var;
        cq cqVar;
        if (zn2Var instanceof q41) {
            q41Var = (q41) zn2Var;
            int i2 = q41Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q41Var.label = i2 - Integer.MIN_VALUE;
            } else {
                q41Var = new q41(this, zn2Var);
            }
        } else {
            q41Var = new q41(this, zn2Var);
        }
        Object objT = q41Var.result;
        int i3 = q41Var.label;
        cq cqVar2 = null;
        if (i3 == 0) {
            jzb.q(objT);
            q41Var.L$0 = sw1Var;
            q41Var.I$0 = i;
            q41Var.J$0 = j;
            q41Var.I$1 = 0;
            q41Var.label = 1;
            pl1 pl1VarW = pa7.W(k99.D(q41Var));
            try {
                xib xibVar = new xib(pl1VarW);
                Object objM = M(sw1Var, i, j, xibVar);
                if (objM == t41.m) {
                    xibVar.a(sw1Var, i);
                } else {
                    Object obj = t41.o;
                    a26 a26Var = this.b;
                    if (objM == obj) {
                        if (j < v()) {
                            sw1Var.a();
                        }
                        sw1 sw1Var2 = (sw1) ud0.a.getObjectVolatile(this, Z);
                        while (true) {
                            if (z()) {
                                pl1VarW.g(new rw1(new pw1(q())));
                            } else {
                                long andIncrement = e.getAndIncrement(this);
                                long j2 = t41.b;
                                long j3 = andIncrement / j2;
                                int i4 = (int) (andIncrement % j2);
                                if (sw1Var2.d != j3) {
                                    sw1 sw1VarL = l(j3, sw1Var2);
                                    if (sw1VarL != null) {
                                        sw1Var2 = sw1VarL;
                                    }
                                }
                                Object objM2 = M(sw1Var2, i4, andIncrement, xibVar);
                                if (objM2 == t41.m) {
                                    xibVar.a(sw1Var2, i4);
                                } else if (objM2 == t41.o) {
                                    if (andIncrement < v()) {
                                        sw1Var2.a();
                                    }
                                } else {
                                    if (objM2 == t41.n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    sw1Var2.a();
                                    rw1Var = new rw1(objM2);
                                    if (a26Var != null) {
                                        cqVar = new cq(3, this, r41.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 2);
                                        cqVar2 = cqVar;
                                    }
                                    pl1VarW.n(rw1Var, cqVar2);
                                }
                            }
                        }
                    } else {
                        sw1Var.a();
                        rw1Var = new rw1(objM);
                        if (a26Var != null) {
                            cqVar = new cq(3, this, r41.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 2);
                            cqVar2 = cqVar;
                        }
                        pl1VarW.n(rw1Var, cqVar2);
                    }
                }
                objT = pl1VarW.t();
                bw2 bw2Var = bw2.a;
                if (objT == bw2Var) {
                    return bw2Var;
                }
            } catch (Throwable th) {
                pl1VarW.D();
                throw th;
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objT);
        }
        return ((rw1) objT).a;
    }

    public final void I(ytc ytcVar) {
        sw1 sw1Var;
        ytc ytcVar2;
        sw1 sw1Var2 = (sw1) ud0.a.getObjectVolatile(this, Z);
        while (!this.z()) {
            long andIncrement = e.getAndIncrement(this);
            long j = t41.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (sw1Var2.d != j2) {
                sw1 sw1VarL = this.l(j2, sw1Var2);
                if (sw1VarL == null) {
                    continue;
                } else {
                    sw1Var = sw1VarL;
                }
            } else {
                sw1Var = sw1Var2;
            }
            Object objM = this.M(sw1Var, i, andIncrement, ytcVar);
            sw1Var2 = sw1Var;
            if (objM == t41.m) {
                if (ytcVar == 0) {
                    ytcVar2 = null;
                }
                if (ytcVar2 == null) {
                    ytcVar2 = ytcVar;
                    return;
                }
                ytcVar2 = ytcVar;
                ytcVar2.c = sw1Var2;
                ytcVar2.d = i;
                return;
            }
            if (objM != t41.o) {
                if (objM == t41.n) {
                    qc0.p("unexpected");
                    return;
                } else {
                    sw1Var2.a();
                    ytcVar.e = objM;
                    return;
                }
            }
            if (andIncrement < this.v()) {
                sw1Var2.a();
            }
            this = this;
            ytcVar = ytcVar;
        }
        ytcVar.e = t41.l;
    }

    public final void J(fzf fzfVar, boolean z2) {
        if (fzfVar instanceof ol1) {
            ((xn2) fzfVar).g(new dzb(z2 ? s() : u()));
            return;
        }
        if (fzfVar instanceof xib) {
            ((xib) fzfVar).a.g(new rw1(new pw1(q())));
            return;
        }
        if (!(fzfVar instanceof k41)) {
            if (fzfVar instanceof ytc) {
                ((ytc) fzfVar).i(this, t41.l);
                return;
            } else {
                pd4.i(fzfVar, "Unexpected waiter: ");
                return;
            }
        }
        k41 k41Var = (k41) fzfVar;
        pl1 pl1Var = k41Var.b;
        pl1Var.getClass();
        k41Var.b = null;
        k41Var.a = t41.l;
        Throwable thQ = k41Var.c.q();
        if (thQ == null) {
            pl1Var.g(Boolean.FALSE);
        } else {
            pl1Var.g(new dzb(thQ));
        }
    }

    public final boolean K(Object obj, Object obj2) {
        if (obj instanceof ytc) {
            return ((ytc) obj).i(this, obj2);
        }
        boolean z2 = obj instanceof xib;
        a26 a26Var = this.b;
        n26 cqVar = null;
        if (z2) {
            pl1 pl1Var = ((xib) obj).a;
            rw1 rw1Var = new rw1(obj2);
            if (a26Var != null) {
                cqVar = new cq(3, this, r41.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 2);
            }
            sw1 sw1Var = t41.a;
            ig4 ig4VarJ = pl1Var.j(rw1Var, cqVar);
            if (ig4VarJ == null) {
                return false;
            }
            pl1Var.q(ig4VarJ);
            return true;
        }
        if (!(obj instanceof k41)) {
            if (!(obj instanceof ol1)) {
                pd4.i(obj, "Unexpected receiver type: ");
                return false;
            }
            ol1 ol1Var = (ol1) obj;
            cqVar = a26Var != null ? new cq(3, this, r41.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1) : null;
            sw1 sw1Var2 = t41.a;
            ig4 ig4VarJ2 = ol1Var.j(obj2, cqVar);
            if (ig4VarJ2 == null) {
                return false;
            }
            ol1Var.q(ig4VarJ2);
            return true;
        }
        k41 k41Var = (k41) obj;
        pl1 pl1Var2 = k41Var.b;
        pl1Var2.getClass();
        k41Var.b = null;
        k41Var.a = obj2;
        Boolean bool = Boolean.TRUE;
        a26 a26Var2 = k41Var.c.b;
        cqVar = a26Var2 != null ? new w7(a26Var2, obj2, 9) : null;
        sw1 sw1Var3 = t41.a;
        ig4 ig4VarJ3 = pl1Var2.j(bool, cqVar);
        if (ig4VarJ3 == null) {
            return false;
        }
        pl1Var2.q(ig4VarJ3);
        return true;
    }

    public final boolean L(Object obj, sw1 sw1Var, int i) {
        u5f u5fVar;
        boolean z2 = obj instanceof ol1;
        wef wefVar = wef.a;
        if (z2) {
            ol1 ol1Var = (ol1) obj;
            sw1 sw1Var2 = t41.a;
            ig4 ig4VarJ = ol1Var.j(wefVar, null);
            if (ig4VarJ == null) {
                return false;
            }
            ol1Var.q(ig4VarJ);
            return true;
        }
        if (!(obj instanceof ytc)) {
            pd4.i(obj, "Unexpected waiter: ");
            return false;
        }
        int iJ = ((ytc) obj).j(this, wefVar);
        u5f u5fVar2 = u5f.a;
        u5f u5fVar3 = u5f.b;
        if (iJ == 0) {
            u5fVar = u5fVar2;
        } else if (iJ == 1) {
            u5fVar = u5fVar3;
        } else if (iJ == 2) {
            u5fVar = u5f.c;
        } else {
            if (iJ != 3) {
                cva.h(iJ, "Unexpected internal result: ");
                return false;
            }
            u5fVar = u5f.d;
        }
        if (u5fVar == u5fVar3) {
            sw1Var.n(i, null);
        }
        return u5fVar == u5fVar2;
    }

    public final Object M(sw1 sw1Var, int i, long j, Object obj) {
        Object objL = sw1Var.l(i);
        AtomicReferenceArray atomicReferenceArray = sw1Var.v;
        long j2 = G0;
        if (objL == null) {
            if (j >= (ud0.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return t41.n;
                }
                if (sw1Var.k(i, objL, obj)) {
                    j();
                    return t41.m;
                }
            }
        } else if (objL == t41.d && sw1Var.k(i, objL, t41.i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i * 2);
            sw1Var.n(i, null);
            return obj2;
        }
        while (true) {
            Object objL2 = sw1Var.l(i);
            if (objL2 == null || objL2 == t41.e) {
                if (j < (ud0.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (sw1Var.k(i, objL2, t41.h)) {
                        j();
                        return t41.o;
                    }
                } else {
                    if (obj == null) {
                        return t41.n;
                    }
                    if (sw1Var.k(i, objL2, obj)) {
                        j();
                        return t41.m;
                    }
                }
            } else if (objL2 != t41.d) {
                ig4 ig4Var = t41.j;
                if (objL2 == ig4Var) {
                    return t41.o;
                }
                if (objL2 == t41.h) {
                    return t41.o;
                }
                if (objL2 == t41.l) {
                    j();
                    return t41.o;
                }
                if (objL2 != t41.g && sw1Var.k(i, objL2, t41.f)) {
                    boolean z2 = objL2 instanceof gzf;
                    if (z2) {
                        objL2 = ((gzf) objL2).a;
                    }
                    if (L(objL2, sw1Var, i)) {
                        sw1Var.o(i, t41.i);
                        j();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        sw1Var.n(i, null);
                        return obj3;
                    }
                    sw1Var.o(i, ig4Var);
                    sw1Var.i();
                    if (z2) {
                        j();
                    }
                    return t41.o;
                }
            } else if (sw1Var.k(i, objL2, t41.i)) {
                j();
                Object obj4 = atomicReferenceArray.get(i * 2);
                sw1Var.n(i, null);
                return obj4;
            }
        }
    }

    public final int N(sw1 sw1Var, int i, Object obj, long j, Object obj2, boolean z2) {
        sw1Var.n(i, obj);
        if (z2) {
            return O(sw1Var, i, obj, j, obj2, z2);
        }
        Object objL = sw1Var.l(i);
        if (objL == null) {
            if (b(j)) {
                if (sw1Var.k(i, null, t41.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (sw1Var.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof fzf) {
            sw1Var.n(i, null);
            if (K(objL, obj)) {
                sw1Var.o(i, t41.i);
                return 0;
            }
            ig4 ig4Var = t41.k;
            if (sw1Var.v.getAndSet((i * 2) + 1, ig4Var) == ig4Var) {
                return 5;
            }
            sw1Var.m(i, true);
            return 5;
        }
        return O(sw1Var, i, obj, j, obj2, z2);
    }

    public final int O(sw1 sw1Var, int i, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object objL = sw1Var.l(i);
            if (objL == null) {
                if (!b(j) || z2) {
                    if (z2) {
                        if (sw1Var.k(i, null, t41.j)) {
                            sw1Var.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (sw1Var.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (sw1Var.k(i, null, t41.d)) {
                    break;
                }
            } else {
                if (objL != t41.e) {
                    ig4 ig4Var = t41.k;
                    if (objL == ig4Var) {
                        sw1Var.n(i, null);
                        return 5;
                    }
                    if (objL == t41.h) {
                        sw1Var.n(i, null);
                        return 5;
                    }
                    if (objL == t41.l) {
                        sw1Var.n(i, null);
                        A();
                        return 4;
                    }
                    sw1Var.n(i, null);
                    if (objL instanceof gzf) {
                        objL = ((gzf) objL).a;
                    }
                    if (K(objL, obj)) {
                        sw1Var.o(i, t41.i);
                        return 0;
                    }
                    if (sw1Var.v.getAndSet((i * 2) + 1, ig4Var) != ig4Var) {
                        sw1Var.m(i, true);
                    }
                    return 5;
                }
                if (sw1Var.k(i, objL, t41.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void P(long j) {
        r41 r41Var = this;
        if (r41Var.C()) {
            return;
        }
        while (r41Var.p() <= j) {
            r41Var = this;
        }
        int i = t41.c;
        int i2 = 0;
        while (true) {
            long j2 = Y;
            if (i2 < i) {
                long jP = r41Var.p();
                if (jP == (ud0.a.getLongVolatile(r41Var, j2) & 4611686018427387903L) && jP == r41Var.p()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = ud0.a;
                    long longVolatile = unsafe.getLongVolatile(r41Var, j2);
                    if (unsafe.compareAndSwapLong(r41Var, Y, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        r41Var = this;
                    }
                }
                while (true) {
                    long jP2 = r41Var.p();
                    Unsafe unsafe2 = ud0.a;
                    long longVolatile2 = unsafe2.getLongVolatile(r41Var, j2);
                    long j3 = longVolatile2 & 4611686018427387903L;
                    boolean z2 = (longVolatile2 & 4611686018427387904L) != 0;
                    if (jP2 == j3 && jP2 == r41Var.p()) {
                        break;
                    }
                    if (z2) {
                        r41Var = this;
                    } else {
                        r41Var = this;
                        unsafe2.compareAndSwapLong(r41Var, Y, longVolatile2, j3 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = ud0.a;
                    long longVolatile3 = unsafe3.getLongVolatile(r41Var, j2);
                    if (unsafe3.compareAndSwapLong(r41Var, Y, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        r41Var = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0162  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165 A[RETURN] */
    @Override // defpackage.qxc
    public Object a(xn2 xn2Var, Object obj) {
        wef wefVar;
        Object objT;
        bw2 bw2Var;
        int i;
        r41 r41Var = this;
        Unsafe unsafe = ud0.a;
        long j = F0;
        sw1 sw1Var = (sw1) unsafe.getObjectVolatile(r41Var, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(r41Var);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zY = r41Var.y(andIncrement, false);
            int i2 = t41.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = sw1Var.d;
            bw2 bw2Var2 = bw2.a;
            wefVar = wef.a;
            if (j5 != j4) {
                sw1 sw1VarN = r41Var.n(j4, sw1Var);
                if (sw1VarN != null) {
                    sw1Var = sw1VarN;
                } else if (zY) {
                    Object objE = E(xn2Var, obj);
                    if (objE == bw2Var2) {
                        return objE;
                    }
                }
            }
            int iN = r41Var.N(sw1Var, i3, obj, j2, null, zY);
            if (iN == 0) {
                sw1Var.a();
                return wefVar;
            }
            if (iN != 1) {
                if (iN == 2) {
                    if (!zY) {
                        break;
                    }
                    sw1Var.i();
                    Object objE2 = E(xn2Var, obj);
                    if (objE2 == bw2Var2) {
                        return objE2;
                    }
                } else if (iN == 3) {
                    pl1 pl1VarW = pa7.W(k99.D(xn2Var));
                    try {
                        int iN2 = N(sw1Var, i3, obj, j2, pl1VarW, false);
                        if (iN2 != 0) {
                            if (iN2 == 1) {
                                bw2Var2 = bw2Var2;
                                pl1VarW.g(wefVar);
                            } else if (iN2 != 2) {
                                if (iN2 != 4) {
                                    String str = "unexpected";
                                    if (iN2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    sw1Var.a();
                                    sw1 sw1Var2 = (sw1) ud0.a.getObjectVolatile(this, j);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean zY2 = y(andIncrement2, false);
                                        int i4 = t41.b;
                                        atomicLongFieldUpdater = atomicLongFieldUpdater;
                                        long j7 = i4;
                                        bw2Var2 = bw2Var2;
                                        long j8 = j6 / j7;
                                        int i5 = (int) (j6 % j7);
                                        if (sw1Var2.d != j8) {
                                            sw1 sw1VarN2 = n(j8, sw1Var2);
                                            if (sw1VarN2 != null) {
                                                i = i5;
                                                sw1Var2 = sw1VarN2;
                                            } else if (zY2) {
                                            }
                                        } else {
                                            i = i5;
                                        }
                                        int iN3 = N(sw1Var2, i, obj, j6, pl1VarW, zY2);
                                        if (iN3 == 0) {
                                            sw1Var2.a();
                                        } else if (iN3 != 1) {
                                            if (iN3 == 2) {
                                                if (!zY2) {
                                                    pl1VarW.a(sw1Var2, i + i4);
                                                    break;
                                                }
                                                sw1Var2.i();
                                            } else {
                                                if (iN3 == 3) {
                                                    throw new IllegalStateException(str);
                                                }
                                                if (iN3 != 4) {
                                                    if (iN3 == 5) {
                                                        sw1Var2.a();
                                                    }
                                                    str = str;
                                                } else if (j6 < t()) {
                                                    sw1Var2.a();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    bw2Var2 = bw2Var2;
                                    if (j2 < t()) {
                                        sw1Var.a();
                                    }
                                }
                                F(obj, pl1VarW);
                                break;
                            } else {
                                bw2Var2 = bw2Var2;
                                pl1VarW.a(sw1Var, i3 + i2);
                            }
                            objT = pl1VarW.t();
                            bw2Var = bw2Var2;
                            if (objT != bw2Var) {
                                objT = wefVar;
                            }
                            if (objT == bw2Var) {
                                return objT;
                            }
                        } else {
                            bw2Var2 = bw2Var2;
                            sw1Var.a();
                        }
                        pl1VarW.g(wefVar);
                        objT = pl1VarW.t();
                        bw2Var = bw2Var2;
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
                } else if (iN != 4) {
                    if (iN == 5) {
                        sw1Var.a();
                    }
                    r41Var = this;
                } else {
                    if (j2 < t()) {
                        sw1Var.a();
                    }
                    Object objE3 = E(xn2Var, obj);
                    if (objE3 == bw2Var2) {
                        return objE3;
                    }
                }
            } else {
                break;
            }
        }
        return wefVar;
    }

    public final boolean b(long j) {
        return j < p() || j < t() + ((long) this.a);
    }

    @Override // defpackage.qxc
    public final boolean c(Throwable th) {
        return e(th, false);
    }

    @Override // defpackage.qxc
    public Object d(Object obj) {
        r41 r41Var = this;
        Unsafe unsafe = ud0.a;
        long longVolatile = unsafe.getLongVolatile(r41Var, G0);
        long j = 1152921504606846975L;
        boolean z2 = r41Var.y(longVolatile, false) ? false : !r41Var.b(longVolatile & 1152921504606846975L);
        qw1 qw1Var = rw1.b;
        if (z2) {
            return qw1Var;
        }
        Object obj2 = t41.j;
        sw1 sw1Var = (sw1) unsafe.getObjectVolatile(r41Var, F0);
        while (true) {
            long andIncrement = d.getAndIncrement(r41Var);
            long j2 = andIncrement & j;
            boolean zY = r41Var.y(andIncrement, false);
            int i = t41.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (sw1Var.d != j4) {
                sw1 sw1VarN = r41Var.n(j4, sw1Var);
                if (sw1VarN != null) {
                    sw1Var = sw1VarN;
                } else {
                    if (zY) {
                        return new pw1(r41Var.u());
                    }
                    j = 1152921504606846975L;
                }
            }
            int iN = r41Var.N(sw1Var, i2, obj, j2, obj2, zY);
            wef wefVar = wef.a;
            if (iN == 0) {
                sw1Var.a();
                return wefVar;
            }
            if (iN == 1) {
                return wefVar;
            }
            if (iN == 2) {
                if (zY) {
                    sw1Var.i();
                    return new pw1(u());
                }
                fzf fzfVar = obj2 instanceof fzf ? (fzf) obj2 : null;
                if (fzfVar != null) {
                    fzfVar.a(sw1Var, i2 + i);
                }
                sw1Var.i();
                return qw1Var;
            }
            if (iN == 3) {
                qc0.p("unexpected");
                return null;
            }
            if (iN == 4) {
                if (j2 < t()) {
                    sw1Var.a();
                }
                return new pw1(u());
            }
            if (iN == 5) {
                sw1Var.a();
            }
            j = 1152921504606846975L;
            r41Var = this;
        }
    }

    public final boolean e(Throwable th, boolean z2) {
        boolean z3;
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j3;
        long longVolatile2;
        Unsafe unsafe4;
        long j4;
        long longVolatile3;
        if (z2) {
            do {
                unsafe4 = ud0.a;
                j4 = G0;
                longVolatile3 = unsafe4.getLongVolatile(this, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                sw1 sw1Var = t41.a;
            } while (!unsafe4.compareAndSwapLong(this, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L));
        }
        ig4 ig4Var = t41.s;
        while (true) {
            Unsafe unsafe5 = ud0.a;
            long j5 = x;
            if (unsafe5.compareAndSwapObject(this, j5, ig4Var, th)) {
                z3 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j5) != ig4Var) {
                z3 = false;
                break;
            }
        }
        if (z2) {
            do {
                unsafe3 = ud0.a;
                j3 = G0;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = ud0.a;
                j = G0;
                longVolatile = unsafe.getLongVolatile(this, j);
                int i = (int) (longVolatile >> 60);
                if (i == 0) {
                    j2 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        }
        A();
        if (z3) {
            loop3: while (true) {
                Unsafe unsafe6 = ud0.a;
                long j6 = X;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                ig4 ig4Var2 = objectVolatile == null ? t41.q : t41.r;
                do {
                    unsafe2 = ud0.a;
                    if (unsafe2.compareAndSwapObject(this, X, objectVolatile, ig4Var2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                z7f.t(1, objectVolatile);
                ((a26) objectVolatile).d(q());
                return z3;
            }
        }
        return z3;
    }

    public final sw1 f(long j) {
        lh2 lh2Var;
        long j2;
        Unsafe unsafe;
        long j3;
        Unsafe unsafe2 = ud0.a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, z);
        sw1 sw1Var = (sw1) unsafe2.getObjectVolatile(this, F0);
        if (sw1Var.d > ((sw1) objectVolatile).d) {
            objectVolatile = sw1Var;
        }
        sw1 sw1Var2 = (sw1) unsafe2.getObjectVolatile(this, Z);
        if (sw1Var2.d > ((sw1) objectVolatile).d) {
            objectVolatile = sw1Var2;
        }
        lh2 lh2Var2 = (lh2) objectVolatile;
        loop0: while (true) {
            lh2Var = lh2Var2;
            while (true) {
                int i = lh2.c;
                lh2Var.getClass();
                Object objectVolatile2 = ud0.a.getObjectVolatile(lh2Var, lh2.a);
                ig4 ig4Var = kh2.a;
                if (objectVolatile2 == ig4Var) {
                    break loop0;
                }
                lh2Var2 = (lh2) objectVolatile2;
                if (lh2Var2 == null) {
                    do {
                        unsafe = ud0.a;
                        j3 = lh2.a;
                        if (unsafe.compareAndSwapObject(lh2Var, j3, (Object) null, ig4Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(lh2Var, j3) == null);
                }
            }
        }
        sw1 sw1Var3 = (sw1) lh2Var;
        if (B()) {
            sw1 sw1Var4 = sw1Var3;
            loop3: while (true) {
                int i2 = t41.b - 1;
                while (true) {
                    if (-1 < i2) {
                        j2 = (sw1Var4.d * ((long) t41.b)) + ((long) i2);
                        if (j2 >= t()) {
                            while (true) {
                                Object objL = sw1Var4.l(i2);
                                if (objL != null && objL != t41.e) {
                                    if (objL != t41.d) {
                                        break;
                                    }
                                    break loop3;
                                }
                                if (sw1Var4.k(i2, objL, t41.l)) {
                                    sw1Var4.i();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        sw1Var4 = (sw1) ((lh2) ud0.a.getObjectVolatile(sw1Var4, lh2.b));
                        if (sw1Var4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                g(j2);
            }
        }
        Object objU = null;
        loop6: for (sw1 sw1Var5 = sw1Var3; sw1Var5 != null; sw1Var5 = (sw1) ((lh2) ud0.a.getObjectVolatile(sw1Var5, lh2.b))) {
            for (int i3 = t41.b - 1; -1 < i3; i3--) {
                if ((sw1Var5.d * ((long) t41.b)) + ((long) i3) < j) {
                    break loop6;
                }
                while (true) {
                    Object objL2 = sw1Var5.l(i3);
                    if (objL2 != null && objL2 != t41.e) {
                        if (!(objL2 instanceof gzf)) {
                            if (!(objL2 instanceof fzf)) {
                                break;
                            }
                            if (sw1Var5.k(i3, objL2, t41.l)) {
                                objU = kn2.U(objU, objL2);
                                sw1Var5.m(i3, true);
                                break;
                            }
                        } else {
                            if (sw1Var5.k(i3, objL2, t41.l)) {
                                objU = kn2.U(objU, ((gzf) objL2).a);
                                sw1Var5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (sw1Var5.k(i3, objL2, t41.l)) {
                            sw1Var5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objU != null) {
            if (!(objU instanceof ArrayList)) {
                J((fzf) objU, true);
                return sw1Var3;
            }
            ArrayList arrayList = (ArrayList) objU;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                J((fzf) arrayList.get(size), true);
            }
        }
        return sw1Var3;
    }

    public final void g(long j) {
        ebf ebfVarR;
        sw1 sw1Var = (sw1) ud0.a.getObjectVolatile(this, Z);
        while (true) {
            Unsafe unsafe = ud0.a;
            long j2 = E0;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(((long) this.a) + longVolatile, this.p())) {
                return;
            }
            this = this;
            if (unsafe.compareAndSwapLong(this, j2, longVolatile, 1 + longVolatile)) {
                long j3 = t41.b;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (sw1Var.d != j4) {
                    sw1 sw1VarL = this.l(j4, sw1Var);
                    if (sw1VarL != null) {
                        sw1Var = sw1VarL;
                    }
                }
                sw1 sw1Var2 = sw1Var;
                Object objM = this.M(sw1Var2, i, longVolatile, null);
                if (objM != t41.o) {
                    sw1Var2.a();
                    a26 a26Var = this.b;
                    if (a26Var != null && (ebfVarR = vpf.r(a26Var, objM, null)) != null) {
                        throw ebfVarR;
                    }
                } else if (longVolatile < this.v()) {
                    sw1Var2.a();
                }
                sw1Var = sw1Var2;
            }
        }
    }

    @Override // defpackage.yv1
    public final void h(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        e(cancellationException, true);
    }

    @Override // defpackage.yv1
    public final kxa i() {
        n41 n41Var = n41.a;
        z7f.t(3, n41Var);
        o41 o41Var = o41.a;
        z7f.t(3, o41Var);
        return new kxa(this, n41Var, o41Var, this.c);
    }

    @Override // defpackage.yv1
    public final k41 iterator() {
        return new k41(this);
    }

    public final void j() {
        Object objA;
        Unsafe unsafe;
        if (C()) {
            return;
        }
        Unsafe unsafe2 = ud0.a;
        long j = z;
        sw1 sw1Var = (sw1) unsafe2.getObjectVolatile(this, j);
        while (true) {
            long andIncrement = f.getAndIncrement(this);
            long j2 = andIncrement / ((long) t41.b);
            if (v() <= andIncrement) {
                if (sw1Var.d < j2 && sw1Var.c() != null) {
                    D(j2, sw1Var);
                }
                w(1L);
                return;
            }
            if (sw1Var.d != j2) {
                s41 s41Var = s41.a;
                while (true) {
                    objA = kh2.a(sw1Var, j2, s41Var);
                    if (!r8c.i(objA)) {
                        rtc rtcVarG = r8c.g(objA);
                        while (true) {
                            rtc rtcVar = (rtc) ud0.a.getObjectVolatile(this, j);
                            if (rtcVar.d >= rtcVarG.d) {
                                break;
                            }
                            if (!rtcVarG.j()) {
                                break;
                            }
                            do {
                                unsafe = ud0.a;
                                if (unsafe.compareAndSwapObject(this, z, rtcVar, rtcVarG)) {
                                    if (!rtcVar.f()) {
                                        break;
                                    }
                                    rtcVar.e();
                                    break;
                                }
                            } while (unsafe.getObjectVolatile(this, j) == rtcVar);
                            if (rtcVarG.f()) {
                                rtcVarG.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                sw1 sw1Var2 = null;
                if (r8c.i(objA)) {
                    A();
                    D(j2, sw1Var);
                    w(1L);
                } else {
                    sw1 sw1Var3 = (sw1) r8c.g(objA);
                    long j3 = sw1Var3.d;
                    if (j3 > j2) {
                        long j4 = ((long) t41.b) * j3;
                        if (ud0.a.compareAndSwapLong(this, y, 1 + andIncrement, j4)) {
                            w(j4 - andIncrement);
                        } else {
                            w(1L);
                        }
                    } else {
                        sw1Var2 = sw1Var3;
                    }
                }
                if (sw1Var2 == null) {
                    continue;
                } else {
                    sw1Var = sw1Var2;
                }
            }
            int i = (int) (andIncrement % ((long) t41.b));
            Object objL = sw1Var.l(i);
            boolean z2 = objL instanceof fzf;
            long j5 = E0;
            if (!z2 || andIncrement < ud0.a.getLongVolatile(this, j5) || !sw1Var.k(i, objL, t41.g)) {
                while (true) {
                    Object objL2 = sw1Var.l(i);
                    if (objL2 instanceof fzf) {
                        if (andIncrement < ud0.a.getLongVolatile(this, j5)) {
                            if (sw1Var.k(i, objL2, new gzf((fzf) objL2))) {
                                w(1L);
                                return;
                            }
                        } else if (sw1Var.k(i, objL2, t41.g)) {
                            if (!L(objL2, sw1Var, i)) {
                                sw1Var.o(i, t41.j);
                                sw1Var.i();
                                break;
                            } else {
                                sw1Var.o(i, t41.d);
                                w(1L);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == t41.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (sw1Var.k(i, objL2, t41.e)) {
                                w(1L);
                                return;
                            }
                        } else if (objL2 == t41.d || objL2 == t41.h || objL2 == t41.i || objL2 == t41.k || objL2 == t41.l) {
                            w(1L);
                            return;
                        } else if (objL2 != t41.f) {
                            pd4.i(objL2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                w(1L);
            } else if (L(objL, sw1Var, i)) {
                sw1Var.o(i, t41.d);
                w(1L);
                return;
            } else {
                sw1Var.o(i, t41.j);
                sw1Var.i();
                w(1L);
            }
        }
    }

    @Override // defpackage.yv1
    public final Object k() {
        sw1 sw1Var;
        Unsafe unsafe = ud0.a;
        long longVolatile = unsafe.getLongVolatile(this, E0);
        long longVolatile2 = unsafe.getLongVolatile(this, G0);
        if (y(longVolatile2, true)) {
            return new pw1(q());
        }
        long j = longVolatile2 & 1152921504606846975L;
        qw1 qw1Var = rw1.b;
        if (longVolatile >= j) {
            return qw1Var;
        }
        Object obj = t41.k;
        sw1 sw1Var2 = (sw1) unsafe.getObjectVolatile(this, Z);
        while (!this.z()) {
            long andIncrement = e.getAndIncrement(this);
            long j2 = t41.b;
            long j3 = andIncrement / j2;
            int i = (int) (andIncrement % j2);
            if (sw1Var2.d != j3) {
                sw1 sw1VarL = this.l(j3, sw1Var2);
                if (sw1VarL == null) {
                    continue;
                } else {
                    sw1Var = sw1VarL;
                }
            } else {
                sw1Var = sw1Var2;
            }
            r41 r41Var = this;
            Object objM = r41Var.M(sw1Var, i, andIncrement, obj);
            sw1Var2 = sw1Var;
            if (objM == t41.m) {
                fzf fzfVar = obj instanceof fzf ? (fzf) obj : null;
                if (fzfVar != null) {
                    fzfVar.a(sw1Var2, i);
                }
                r41Var.P(andIncrement);
                sw1Var2.i();
                return qw1Var;
            }
            if (objM != t41.o) {
                if (objM != t41.n) {
                    sw1Var2.a();
                    return objM;
                }
                qc0.p("unexpected");
                return null;
            }
            if (andIncrement < r41Var.v()) {
                sw1Var2.a();
            }
            this = r41Var;
        }
        return new pw1(this.q());
    }

    public final sw1 l(long j, sw1 sw1Var) {
        Object objA;
        sw1 sw1Var2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        Unsafe unsafe2;
        sw1 sw1Var3 = t41.a;
        s41 s41Var = s41.a;
        loop0: while (true) {
            objA = kh2.a(sw1Var, j, s41Var);
            if (!r8c.i(objA)) {
                rtc rtcVarG = r8c.g(objA);
                while (true) {
                    Unsafe unsafe3 = ud0.a;
                    long j3 = Z;
                    rtc rtcVar = (rtc) unsafe3.getObjectVolatile(this, j3);
                    if (rtcVar.d >= rtcVarG.d) {
                        break loop0;
                    }
                    if (!rtcVarG.j()) {
                        break;
                    }
                    do {
                        unsafe2 = ud0.a;
                        if (unsafe2.compareAndSwapObject(this, Z, rtcVar, rtcVarG)) {
                            if (!rtcVar.f()) {
                                break loop0;
                            }
                            rtcVar.e();
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(this, j3) == rtcVar);
                    if (rtcVarG.f()) {
                        rtcVarG.e();
                    }
                }
            } else {
                break;
            }
        }
        if (r8c.i(objA)) {
            A();
            if (sw1Var.d * ((long) t41.b) < v()) {
                sw1Var.a();
                return null;
            }
        } else {
            sw1 sw1Var4 = (sw1) r8c.g(objA);
            long j4 = sw1Var4.d;
            if (C() || j > p() / ((long) t41.b)) {
                sw1Var2 = sw1Var4;
                break;
            }
            loop3: while (true) {
                Unsafe unsafe4 = ud0.a;
                long j5 = z;
                rtc rtcVar2 = (rtc) unsafe4.getObjectVolatile(this, j5);
                if (rtcVar2.d >= j4 || !sw1Var4.j()) {
                    sw1Var2 = sw1Var4;
                    break;
                }
                while (true) {
                    Unsafe unsafe5 = ud0.a;
                    sw1Var2 = sw1Var4;
                    if (unsafe5.compareAndSwapObject(this, z, rtcVar2, sw1Var4)) {
                        if (!rtcVar2.f()) {
                            break loop3;
                        }
                        rtcVar2.e();
                        break loop3;
                    }
                    if (unsafe5.getObjectVolatile(this, j5) != rtcVar2) {
                        break;
                    }
                    sw1Var4 = sw1Var2;
                }
                if (sw1Var2.f()) {
                    sw1Var2.e();
                }
                sw1Var4 = sw1Var2;
            }
            if (j4 <= j) {
                return sw1Var2;
            }
            long j6 = j4 * ((long) t41.b);
            do {
                unsafe = ud0.a;
                j2 = E0;
                longVolatile = unsafe.getLongVolatile(this, j2);
                if (longVolatile >= j6) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j6));
            if (j4 * ((long) t41.b) < v()) {
                sw1Var2.a();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [pl1] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.yv1
    public final Object m(xn2 xn2Var) throws Throwable {
        sw1 sw1Var;
        Throwable th;
        ?? r1;
        pl1 pl1Var;
        cq cqVar;
        sw1 sw1Var2;
        Unsafe unsafe = ud0.a;
        ?? r2 = Z;
        sw1 sw1Var3 = (sw1) unsafe.getObjectVolatile(this, (long) r2);
        while (!this.z()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = t41.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (sw1Var3.d != j2) {
                sw1 sw1VarL = this.l(j2, sw1Var3);
                if (sw1VarL == null) {
                    continue;
                } else {
                    sw1Var = sw1VarL;
                }
            } else {
                sw1Var = sw1Var3;
            }
            r41 r41Var = this;
            Object objM = r41Var.M(sw1Var, i, andIncrement, null);
            ig4 ig4Var = t41.m;
            cq cqVar2 = null;
            if (objM == ig4Var) {
                qc0.p("unexpected");
                return null;
            }
            ig4 ig4Var2 = t41.o;
            if (objM == ig4Var2) {
                if (andIncrement < r41Var.v()) {
                    sw1Var.a();
                }
                this = r41Var;
                sw1Var3 = sw1Var;
            } else {
                if (objM != t41.n) {
                    sw1Var.a();
                    return objM;
                }
                pl1 pl1VarW = pa7.W(k99.D(xn2Var));
                try {
                    Object objM2 = r41Var.M(sw1Var, i, andIncrement, pl1VarW);
                    try {
                        if (objM2 == ig4Var) {
                            pl1VarW.a(sw1Var, i);
                        } else {
                            a26 a26Var = r41Var.b;
                            try {
                                if (objM2 == ig4Var2) {
                                    if (andIncrement < r41Var.v()) {
                                        sw1Var.a();
                                    }
                                    sw1 sw1Var4 = (sw1) ud0.a.getObjectVolatile(r41Var, (long) r2);
                                    while (true) {
                                        if (r41Var.z()) {
                                            pl1VarW.g(new dzb(r41Var.s()));
                                        } else {
                                            pl1 pl1Var2 = pl1VarW;
                                            try {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(r41Var);
                                                long j3 = t41.b;
                                                long j4 = andIncrement2 / j3;
                                                int i2 = (int) (andIncrement2 % j3);
                                                if (sw1Var4.d != j4) {
                                                    try {
                                                        sw1 sw1VarL2 = r41Var.l(j4, sw1Var4);
                                                        if (sw1VarL2 == null) {
                                                            pl1VarW = pl1Var2;
                                                        } else {
                                                            sw1Var2 = sw1VarL2;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        r1 = pl1Var2;
                                                        r1.D();
                                                        throw th;
                                                    }
                                                } else {
                                                    sw1Var2 = sw1Var4;
                                                }
                                                r41 r41Var2 = r41Var;
                                                objM2 = r41Var2.M(sw1Var2, i2, andIncrement2, pl1Var2);
                                                r41Var = r41Var2;
                                                sw1 sw1Var5 = sw1Var2;
                                                pl1Var = pl1Var2;
                                                if (objM2 == t41.m) {
                                                    pl1Var.a(sw1Var5, i2);
                                                } else if (objM2 == t41.o) {
                                                    if (andIncrement2 < r41Var.v()) {
                                                        sw1Var5.a();
                                                    }
                                                    sw1Var4 = sw1Var5;
                                                    pl1VarW = pl1Var;
                                                } else {
                                                    if (objM2 == t41.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    sw1Var5.a();
                                                    if (a26Var != null) {
                                                        cqVar = new cq(3, r41Var, r41.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
                                                        cqVar2 = cqVar;
                                                    }
                                                    pl1Var.n(objM2, cqVar2);
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r2 = pl1Var2;
                                                th = th;
                                                r1 = r2;
                                                r1.D();
                                                throw th;
                                            }
                                        }
                                    }
                                } else {
                                    pl1Var = pl1VarW;
                                    sw1Var.a();
                                    if (a26Var != null) {
                                        cqVar = new cq(3, r41Var, r41.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
                                        cqVar2 = cqVar;
                                    }
                                    pl1Var.n(objM2, cqVar2);
                                }
                                return pl1Var.t();
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        pl1Var = pl1VarW;
                        return pl1Var.t();
                    } catch (Throwable th5) {
                        th = th5;
                        r1 = pl1VarW;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    r2 = pl1VarW;
                }
            }
        }
        Throwable thS = this.s();
        int i3 = vxd.a;
        throw thS;
    }

    public final sw1 n(long j, sw1 sw1Var) {
        Object objA;
        sw1 sw1Var2;
        long j2;
        Unsafe unsafe;
        r41 r41Var = this;
        sw1 sw1Var3 = t41.a;
        s41 s41Var = s41.a;
        loop0: while (true) {
            objA = kh2.a(sw1Var, j, s41Var);
            if (!r8c.i(objA)) {
                rtc rtcVarG = r8c.g(objA);
                while (true) {
                    Unsafe unsafe2 = ud0.a;
                    long j3 = F0;
                    rtc rtcVar = (rtc) unsafe2.getObjectVolatile(r41Var, j3);
                    if (rtcVar.d >= rtcVarG.d) {
                        break loop0;
                    }
                    if (!rtcVarG.j()) {
                        break;
                    }
                    do {
                        unsafe = ud0.a;
                        if (unsafe.compareAndSwapObject(r41Var, F0, rtcVar, rtcVarG)) {
                            if (!rtcVar.f()) {
                                break loop0;
                            }
                            rtcVar.e();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(r41Var, j3) == rtcVar);
                    if (rtcVarG.f()) {
                        rtcVarG.e();
                    }
                }
            } else {
                break;
            }
        }
        sw1 sw1Var4 = null;
        if (r8c.i(objA)) {
            r41Var.A();
            if (sw1Var.d * ((long) t41.b) >= r41Var.t()) {
                return null;
            }
            sw1Var.a();
            return null;
        }
        sw1 sw1Var5 = (sw1) r8c.g(objA);
        long j4 = sw1Var5.d;
        if (j4 <= j) {
            return sw1Var5;
        }
        long j5 = j4 * ((long) t41.b);
        while (true) {
            Unsafe unsafe3 = ud0.a;
            long j6 = G0;
            long longVolatile = unsafe3.getLongVolatile(r41Var, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                sw1Var2 = sw1Var4;
                j2 = j4;
                break;
            }
            sw1Var2 = sw1Var4;
            j2 = j4;
            if (unsafe3.compareAndSwapLong(r41Var, j6, longVolatile, j7 + (((long) ((int) (longVolatile >> 60))) << 60))) {
                break;
            }
            r41Var = this;
            sw1Var4 = sw1Var2;
            j4 = j2;
        }
        if (j2 * ((long) t41.b) >= t()) {
            return sw1Var2;
        }
        sw1Var5.a();
        return sw1Var2;
    }

    @Override // defpackage.yv1
    public final Object o(i92 i92Var) {
        return G(this, i92Var);
    }

    public final long p() {
        return ud0.a.getLongVolatile(this, y);
    }

    public final Throwable q() {
        return (Throwable) ud0.a.getObjectVolatile(this, x);
    }

    public final kxa r() {
        l41 l41Var = l41.a;
        z7f.t(3, l41Var);
        m41 m41Var = m41.a;
        z7f.t(3, m41Var);
        return new kxa(this, l41Var, m41Var, this.c);
    }

    public final Throwable s() {
        Throwable thQ = q();
        return thQ == null ? new e62("Channel was closed") : thQ;
    }

    public final long t() {
        return ud0.a.getLongVolatile(this, E0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = ud0.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, G0) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        int i = 0;
        List listI = t72.I(unsafe.getObjectVolatile(this, Z), unsafe.getObjectVolatile(this, F0), unsafe.getObjectVolatile(this, z));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (((sw1) obj) != t41.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            s8f.c();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((sw1) next).d;
            do {
                Object next2 = it.next();
                long j2 = ((sw1) next2).d;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        sw1 sw1Var = (sw1) next;
        long jT = t();
        long jV = v();
        loop2: while (true) {
            int i2 = t41.b;
            for (int i3 = i; i3 < i2; i3++) {
                long j3 = (sw1Var.d * ((long) t41.b)) + ((long) i3);
                if (j3 >= jV && j3 >= jT) {
                    break loop2;
                }
                Object objL = sw1Var.l(i3);
                Object obj2 = sw1Var.v.get(i3 * 2);
                if (objL instanceof ol1) {
                    string = (jV > j3 || j3 >= jT) ? (jT > j3 || j3 >= jV) ? "cont" : "send" : "receive";
                } else if (objL instanceof ytc) {
                    string = (jV > j3 || j3 >= jT) ? (jT > j3 || j3 >= jV) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof xib) {
                    string = "receiveCatching";
                } else if (objL instanceof gzf) {
                    string = "EB(" + objL + ')';
                } else if (pa7.t(objL, t41.f) || pa7.t(objL, t41.g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(t41.e) && !objL.equals(t41.i) && !objL.equals(t41.h) && !objL.equals(t41.k) && !objL.equals(t41.j) && !objL.equals(t41.l)) {
                        string = objL.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            sw1Var = (sw1) sw1Var.c();
            if (sw1Var == null) {
                break;
            }
            i = 0;
        }
        if (v4e.R(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable thQ = q();
        return thQ == null ? new g62("Channel was closed") : thQ;
    }

    public final long v() {
        return ud0.a.getLongVolatile(this, G0) & 1152921504606846975L;
    }

    public final void w(long j) {
        if ((g.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((ud0.a.getLongVolatile(this, Y) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean y(long j, boolean z2) {
        r41 r41Var = this;
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                r41Var.f(j & 1152921504606846975L);
                if (z2) {
                    while (true) {
                        Unsafe unsafe = ud0.a;
                        long j2 = Z;
                        sw1 sw1VarL = (sw1) unsafe.getObjectVolatile(r41Var, j2);
                        long jT = r41Var.t();
                        if (r41Var.v() <= jT) {
                            break;
                        }
                        long j3 = t41.b;
                        long j4 = jT / j3;
                        if (sw1VarL.d != j4 && (sw1VarL = r41Var.l(j4, sw1VarL)) == null) {
                            if (((sw1) unsafe.getObjectVolatile(r41Var, j2)).d < j4) {
                                break;
                            }
                        } else {
                            sw1VarL.a();
                            int i2 = (int) (jT % j3);
                            while (true) {
                                Object objL = sw1VarL.l(i2);
                                if (objL != null && objL != t41.e) {
                                    if (objL != t41.d && (objL == t41.j || objL == t41.l || objL == t41.i || objL == t41.h || (objL != t41.g && (objL == t41.f || jT != r41Var.t())))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else {
                                    if (sw1VarL.k(i2, objL, t41.h)) {
                                        r41Var.j();
                                        break;
                                    }
                                    r41Var = this;
                                }
                            }
                            ud0.a.compareAndSwapLong(r41Var, E0, jT, 1 + jT);
                            r41Var = this;
                        }
                    }
                }
            } else {
                if (i != 3) {
                    ho7.j(tec.e(i, "unexpected close status: "));
                    return false;
                }
                sw1 sw1VarF = r41Var.f(j & 1152921504606846975L);
                ebf ebfVarR = null;
                Object objU = null;
                loop0: do {
                    AtomicReferenceArray atomicReferenceArray = sw1VarF.v;
                    for (int i3 = t41.b - 1; -1 < i3; i3--) {
                        long j5 = (sw1VarF.d * ((long) t41.b)) + ((long) i3);
                        while (true) {
                            Object objL2 = sw1VarF.l(i3);
                            if (objL2 == t41.i) {
                                break loop0;
                            }
                            ig4 ig4Var = t41.d;
                            a26 a26Var = r41Var.b;
                            if (objL2 != ig4Var) {
                                if (objL2 != t41.e && objL2 != null) {
                                    if (!(objL2 instanceof fzf) && !(objL2 instanceof gzf)) {
                                        ig4 ig4Var2 = t41.g;
                                        if (objL2 == ig4Var2 || objL2 == t41.f) {
                                            break loop0;
                                        }
                                        if (objL2 != ig4Var2) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < r41Var.t()) {
                                            break loop0;
                                        }
                                        fzf fzfVar = objL2 instanceof gzf ? ((gzf) objL2).a : (fzf) objL2;
                                        if (sw1VarF.k(i3, objL2, t41.l)) {
                                            if (a26Var != null) {
                                                ebfVarR = vpf.r(a26Var, atomicReferenceArray.get(i3 * 2), ebfVarR);
                                            }
                                            objU = kn2.U(objU, fzfVar);
                                            sw1VarF.n(i3, null);
                                            sw1VarF.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (sw1VarF.k(i3, objL2, t41.l)) {
                                        sw1VarF.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < r41Var.t()) {
                                    break loop0;
                                }
                                if (sw1VarF.k(i3, objL2, t41.l)) {
                                    if (a26Var != null) {
                                        ebfVarR = vpf.r(a26Var, atomicReferenceArray.get(i3 * 2), ebfVarR);
                                    }
                                    sw1VarF.n(i3, null);
                                    sw1VarF.i();
                                    break;
                                }
                            }
                        }
                    }
                    sw1VarF = (sw1) ((lh2) ud0.a.getObjectVolatile(sw1VarF, lh2.b));
                } while (sw1VarF != null);
                if (objU != null) {
                    if (objU instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objU;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            r41Var.J((fzf) arrayList.get(size), false);
                        }
                    } else {
                        r41Var.J((fzf) objU, false);
                    }
                }
                if (ebfVarR != null) {
                    throw ebfVarR;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean z() {
        return y(ud0.a.getLongVolatile(this, G0), true);
    }
}
