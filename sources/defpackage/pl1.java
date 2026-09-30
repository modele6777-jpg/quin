package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class pl1 extends ca4 implements ol1, cw2, fzf {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long v;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final xn2 d;
    public final pv2 e;

    static {
        Unsafe unsafe = ud0.a;
        f = unsafe.objectFieldOffset(pl1.class.getDeclaredField("_decisionAndIndex$volatile"));
        v = unsafe.objectFieldOffset(pl1.class.getDeclaredField("_state$volatile"));
        g = unsafe.objectFieldOffset(pl1.class.getDeclaredField("_parentHandle$volatile"));
    }

    public pl1(int i, xn2 xn2Var) {
        super(i);
        this.d = xn2Var;
        this.e = xn2Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = fd.a;
    }

    public static void B(sg9 sg9Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + sg9Var + ", already has " + obj).toString());
    }

    public static Object G(sg9 sg9Var, Object obj, int i, n26 n26Var) {
        if (obj instanceof eb2) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (n26Var != null || (sg9Var instanceof ll1)) {
            return new cb2(obj, sg9Var instanceof ll1 ? (ll1) sg9Var : null, n26Var, (Throwable) null, 16);
        }
        return obj;
    }

    public final boolean A() {
        if (this.c == 2) {
            return ud0.a.getObjectVolatile((z94) this.d, z94.v) != null;
        }
        return false;
    }

    public String C() {
        return "CancellableContinuation";
    }

    public final void D() {
        pl1 pl1Var;
        xn2 xn2Var = this.d;
        Throwable th = null;
        z94 z94Var = xn2Var instanceof z94 ? (z94) xn2Var : null;
        if (z94Var != null) {
            long j = z94.v;
            loop0: while (true) {
                Object objectVolatile = ud0.a.getObjectVolatile(z94Var, j);
                ig4 ig4Var = aa4.b;
                if (objectVolatile == ig4Var) {
                    while (true) {
                        Unsafe unsafe = ud0.a;
                        pl1 pl1Var2 = this;
                        pl1Var = pl1Var2;
                        if (unsafe.compareAndSwapObject(z94Var, z94.v, ig4Var, pl1Var2)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(z94Var, j) != ig4Var) {
                            break;
                        } else {
                            this = pl1Var;
                        }
                    }
                    this = pl1Var;
                } else {
                    pl1Var = this;
                    if (!(objectVolatile instanceof Throwable)) {
                        pd4.i(objectVolatile, "Inconsistent state ");
                        return;
                    }
                    while (true) {
                        Unsafe unsafe2 = ud0.a;
                        if (unsafe2.compareAndSwapObject(z94Var, z94.v, objectVolatile, (Object) null)) {
                            th = (Throwable) objectVolatile;
                            break;
                        } else if (unsafe2.getObjectVolatile(z94Var, j) != objectVolatile) {
                            qc0.j("Failed requirement.");
                            return;
                        }
                    }
                }
            }
            if (th == null) {
                return;
            }
            pl1Var.o();
            pl1Var.p(th);
        }
    }

    public final void E(Object obj, int i, n26 n26Var) {
        pl1 pl1Var;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof sg9)) {
                pl1 pl1Var2 = this;
                if (objectVolatile instanceof tl1) {
                    tl1 tl1Var = (tl1) objectVolatile;
                    if (unsafe.compareAndSwapInt(tl1Var, tl1.c, 0, 1)) {
                        if (n26Var != null) {
                            pl1Var2.l(n26Var, tl1Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                pd4.i(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objG = G((sg9) objectVolatile, obj, i, n26Var);
            while (true) {
                Unsafe unsafe2 = ud0.a;
                pl1Var = this;
                if (unsafe2.compareAndSwapObject(pl1Var, v, objectVolatile, objG)) {
                    if (!pl1Var.A()) {
                        pl1Var.o();
                    }
                    pl1Var.r(i);
                    return;
                } else if (unsafe2.getObjectVolatile(pl1Var, j) != objectVolatile) {
                    break;
                } else {
                    this = pl1Var;
                }
            }
            this = pl1Var;
        }
    }

    public final void F(sv2 sv2Var) {
        xn2 xn2Var = this.d;
        z94 z94Var = xn2Var instanceof z94 ? (z94) xn2Var : null;
        E(wef.a, (z94Var != null ? z94Var.d : null) == sv2Var ? 4 : this.c, null);
    }

    public final ig4 H(Object obj, n26 n26Var) {
        pl1 pl1Var;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof sg9)) {
                return null;
            }
            Object objG = G((sg9) objectVolatile, obj, this.c, n26Var);
            while (true) {
                Unsafe unsafe2 = ud0.a;
                pl1Var = this;
                if (unsafe2.compareAndSwapObject(pl1Var, v, objectVolatile, objG)) {
                    boolean zA = pl1Var.A();
                    ig4 ig4Var = ql1.a;
                    if (!zA) {
                        pl1Var.o();
                    }
                    return ig4Var;
                }
                if (unsafe2.getObjectVolatile(pl1Var, j) != objectVolatile) {
                    break;
                }
                this = pl1Var;
            }
            this = pl1Var;
        }
    }

    @Override // defpackage.fzf
    public final void a(rtc rtcVar, int i) {
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                qc0.p("invokeOnCancellation should be called at most once");
                return;
            }
            pl1 pl1Var = this;
            if (unsafe.compareAndSwapInt(pl1Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                pl1Var.y(rtcVar);
                return;
            }
            this = pl1Var;
        }
    }

    @Override // defpackage.ca4
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        pl1 pl1Var;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof sg9) {
                qc0.p("Not completed");
                return;
            }
            if (objectVolatile instanceof eb2) {
                return;
            }
            if (objectVolatile instanceof cb2) {
                cb2 cb2Var = (cb2) objectVolatile;
                if (cb2Var.e != null) {
                    qc0.p("Must be called at most once");
                    return;
                }
                cb2 cb2VarA = cb2.a(cb2Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = ud0.a;
                    pl1 pl1Var2 = this;
                    if (unsafe2.compareAndSwapObject(pl1Var2, v, objectVolatile, cb2VarA)) {
                        ll1 ll1Var = cb2Var.b;
                        if (ll1Var != null) {
                            pl1Var2.k(ll1Var, cancellationException);
                        }
                        n26 n26Var = cb2Var.c;
                        if (n26Var != null) {
                            pl1Var2.l(n26Var, cancellationException, cb2Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(pl1Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        pl1Var = pl1Var2;
                        break;
                    }
                    this = pl1Var2;
                }
            } else {
                pl1 pl1Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                cb2 cb2Var2 = new cb2(objectVolatile, (ll1) null, (n26) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    cb2 cb2Var3 = cb2Var2;
                    Unsafe unsafe3 = ud0.a;
                    pl1Var = pl1Var3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(pl1Var, v, objectVolatile, cb2Var3);
                    cb2Var2 = cb2Var3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(pl1Var, j) != objectVolatile) {
                        break;
                    } else {
                        pl1Var3 = pl1Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = pl1Var;
        }
    }

    @Override // defpackage.ca4
    public final xn2 c() {
        return this.d;
    }

    @Override // defpackage.ca4
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // defpackage.cw2
    public final cw2 e() {
        xn2 xn2Var = this.d;
        if (xn2Var instanceof cw2) {
            return (cw2) xn2Var;
        }
        return null;
    }

    @Override // defpackage.ca4
    public final Object f(Object obj) {
        return obj instanceof cb2 ? ((cb2) obj).a : obj;
    }

    @Override // defpackage.xn2
    public final void g(Object obj) {
        Throwable thA = ezb.a(obj);
        if (thA != null) {
            obj = new eb2(thA, false);
        }
        E(obj, this.c, null);
    }

    @Override // defpackage.xn2
    public final pv2 getContext() {
        return this.e;
    }

    @Override // defpackage.ca4
    public final Object i() {
        return u();
    }

    @Override // defpackage.ol1
    public final ig4 j(Object obj, n26 n26Var) {
        return H(obj, n26Var);
    }

    public final void k(ll1 ll1Var, Throwable th) {
        try {
            ll1Var.b(th);
        } catch (Throwable th2) {
            tq.C(this.e, new fb2("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(n26 n26Var, Throwable th, Object obj) {
        pv2 pv2Var = this.e;
        try {
            n26Var.m(th, obj, pv2Var);
        } catch (Throwable th2) {
            tq.C(pv2Var, new fb2("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(rtc rtcVar, Throwable th) {
        pv2 pv2Var = this.e;
        int intVolatile = ud0.a.getIntVolatile(this, f) & 536870911;
        if (intVolatile == 536870911) {
            qc0.p("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            rtcVar.h(intVolatile, pv2Var);
        } catch (Throwable th2) {
            tq.C(pv2Var, new fb2("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.ol1
    public final void n(Object obj, n26 n26Var) {
        E(obj, this.c, n26Var);
    }

    public final void o() {
        Unsafe unsafe = ud0.a;
        long j = g;
        ta4 ta4Var = (ta4) unsafe.getObjectVolatile(this, j);
        if (ta4Var == null) {
            return;
        }
        ta4Var.a();
        unsafe.putObjectVolatile(this, j, hg9.a);
    }

    @Override // defpackage.ol1
    public final boolean p(Throwable th) {
        Throwable cancellationException;
        pl1 pl1Var;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof sg9)) {
                return false;
            }
            boolean z = (objectVolatile instanceof ll1) || (objectVolatile instanceof rtc);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            tl1 tl1Var = new tl1(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = ud0.a;
                pl1Var = this;
                if (unsafe2.compareAndSwapObject(pl1Var, v, objectVolatile, tl1Var)) {
                    sg9 sg9Var = (sg9) objectVolatile;
                    if (sg9Var instanceof ll1) {
                        pl1Var.k((ll1) objectVolatile, th);
                    } else if (sg9Var instanceof rtc) {
                        pl1Var.m((rtc) objectVolatile, th);
                    }
                    if (!pl1Var.A()) {
                        pl1Var.o();
                    }
                    pl1Var.r(pl1Var.c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(pl1Var, j) != objectVolatile) {
                    break;
                }
                this = pl1Var;
            }
            this = pl1Var;
        }
    }

    @Override // defpackage.ol1
    public final void q(Object obj) {
        r(this.c);
    }

    public final void r(int i) {
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    qc0.p("Already resumed");
                    return;
                }
                boolean z = i == 4;
                xn2 xn2Var = this.d;
                if (!z && (xn2Var instanceof z94)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.c;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        z94 z94Var = (z94) xn2Var;
                        sv2 sv2Var = z94Var.d;
                        pv2 context = z94Var.e.getContext();
                        if (aa4.c(sv2Var, context)) {
                            aa4.b(sv2Var, context, this);
                            return;
                        }
                        vz4 vz4VarA = gwe.a();
                        if (vz4VarA.c >= 4294967296L) {
                            vz4VarA.e1(this);
                            return;
                        }
                        vz4VarA.f1(true);
                        try {
                            db6.I0(this, xn2Var, true);
                            do {
                            } while (vz4VarA.h1());
                        } catch (Throwable th) {
                            try {
                                this.h(th);
                            } finally {
                                vz4VarA.d1(true);
                            }
                        }
                        return;
                    }
                }
                db6.I0(this, xn2Var, z);
                return;
            }
            pl1 pl1Var = this;
            if (unsafe.compareAndSwapInt(pl1Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = pl1Var;
            }
        }
    }

    public Throwable s(rg7 rg7Var) {
        return rg7Var.N();
    }

    public final Object t() {
        dg7 dg7Var;
        boolean zA = A();
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    qc0.p("Already suspended");
                    return null;
                }
                if (zA) {
                    this.D();
                }
                Object objU = this.u();
                if (objU instanceof eb2) {
                    throw ((eb2) objU).a;
                }
                int i2 = this.c;
                if ((i2 != 1 && i2 != 2) || (dg7Var = (dg7) this.e.F0(ndb.Y0)) == null || dg7Var.b()) {
                    return this.f(objU);
                }
                CancellationException cancellationExceptionN = dg7Var.N();
                this.b(cancellationExceptionN);
                throw cancellationExceptionN;
            }
            pl1 pl1Var = this;
            if (unsafe.compareAndSwapInt(pl1Var, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((ta4) unsafe.getObjectVolatile(pl1Var, g)) == null) {
                    pl1Var.w();
                }
                if (zA) {
                    pl1Var.D();
                }
                return bw2.a;
            }
            this = pl1Var;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(C());
        sb.append('(');
        sb.append(mh3.Z(this.d));
        sb.append("){");
        Object objU = u();
        if (objU instanceof sg9) {
            str = "Active";
        } else {
            str = objU instanceof tl1 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(mh3.F(this));
        return sb.toString();
    }

    public final Object u() {
        return ud0.a.getObjectVolatile(this, v);
    }

    public final void v() {
        ta4 ta4VarW = w();
        if (ta4VarW != null && z()) {
            ta4VarW.a();
            ud0.a.putObjectVolatile(this, g, hg9.a);
        }
    }

    public final ta4 w() {
        dg7 dg7Var = (dg7) this.e.F0(ndb.Y0);
        if (dg7Var == null) {
            return null;
        }
        ta4 ta4VarE = tq.E(dg7Var, true, new wy1(this));
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = g;
            pl1 pl1Var = this;
            if (unsafe.compareAndSwapObject(pl1Var, j, (Object) null, ta4VarE) || unsafe.getObjectVolatile(pl1Var, j) != null) {
                break;
            }
            this = pl1Var;
        }
        return ta4VarE;
    }

    public final void x(a26 a26Var) {
        y(new kl1(1, a26Var));
    }

    public final void y(sg9 sg9Var) {
        sg9 sg9Var2;
        pl1 pl1Var;
        pl1 pl1Var2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = ud0.a;
            long j = v;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof fd) {
                while (true) {
                    Unsafe unsafe3 = ud0.a;
                    pl1 pl1Var3 = this;
                    sg9 sg9Var3 = sg9Var;
                    pl1Var = pl1Var3;
                    sg9Var2 = sg9Var3;
                    if (unsafe3.compareAndSwapObject(pl1Var3, v, objectVolatile, sg9Var3)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(pl1Var, j) != objectVolatile) {
                        break;
                    }
                    this = pl1Var;
                    sg9Var = sg9Var2;
                }
            } else {
                sg9Var2 = sg9Var;
                pl1Var = this;
                if ((objectVolatile instanceof ll1) || (objectVolatile instanceof rtc)) {
                    B(sg9Var2, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof eb2) {
                    eb2 eb2Var = (eb2) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(eb2Var, eb2.b, 0, 1)) {
                        B(sg9Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof tl1) {
                        Throwable th = eb2Var.a;
                        if (sg9Var2 instanceof ll1) {
                            pl1Var.k((ll1) sg9Var2, th);
                            return;
                        } else {
                            pl1Var.m((rtc) sg9Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof cb2) {
                    cb2 cb2Var = (cb2) objectVolatile;
                    if (cb2Var.b != null) {
                        B(sg9Var2, objectVolatile);
                        throw null;
                    }
                    if (sg9Var2 instanceof rtc) {
                        return;
                    }
                    ll1 ll1Var = (ll1) sg9Var2;
                    Throwable th2 = cb2Var.e;
                    if (th2 != null) {
                        pl1Var.k(ll1Var, th2);
                        return;
                    }
                    cb2 cb2VarA = cb2.a(cb2Var, ll1Var, null, 29);
                    do {
                        unsafe = ud0.a;
                        if (unsafe.compareAndSwapObject(pl1Var, v, objectVolatile, cb2VarA)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(pl1Var, j) == objectVolatile);
                } else {
                    if (sg9Var2 instanceof rtc) {
                        return;
                    }
                    cb2 cb2Var2 = new cb2(objectVolatile, (ll1) sg9Var2, (n26) null, (Throwable) null, 28);
                    while (true) {
                        cb2 cb2Var3 = cb2Var2;
                        Unsafe unsafe4 = ud0.a;
                        pl1Var2 = pl1Var;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(pl1Var2, v, objectVolatile, cb2Var3);
                        cb2Var2 = cb2Var3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(pl1Var2, j) != objectVolatile) {
                            break;
                        } else {
                            pl1Var = pl1Var2;
                        }
                    }
                }
                this = pl1Var2;
                sg9Var = sg9Var2;
            }
            pl1Var2 = pl1Var;
            this = pl1Var2;
            sg9Var = sg9Var2;
        }
    }

    public final boolean z() {
        return !(u() instanceof sg9);
    }
}
