package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rg7 implements dg7 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = ud0.a;
        b = unsafe.objectFieldOffset(rg7.class.getDeclaredField("_state$volatile"));
        a = unsafe.objectFieldOffset(rg7.class.getDeclaredField("_parentHandle$volatile"));
    }

    public rg7(boolean z) {
        this._state$volatile = z ? sg7.g : sg7.f;
    }

    public static yy1 V(he8 he8Var) {
        while (he8Var.k()) {
            he8Var = he8Var.j();
        }
        while (true) {
            he8Var = he8Var.i();
            if (!he8Var.k()) {
                if (he8Var instanceof yy1) {
                    return (yy1) he8Var;
                }
                if (he8Var instanceof ag9) {
                    return null;
                }
            }
        }
    }

    public static String d0(Object obj) {
        if (!(obj instanceof lg7)) {
            if (obj instanceof x07) {
                return ((x07) obj).b() ? "Active" : "New";
            }
            return obj instanceof eb2 ? "Cancelled" : "Completed";
        }
        lg7 lg7Var = (lg7) obj;
        if (lg7Var.e()) {
            return "Cancelling";
        }
        return lg7Var.f() ? "Completing" : "Active";
    }

    public final void A(x07 x07Var, Object obj) {
        Unsafe unsafe = ud0.a;
        long j = a;
        xy1 xy1Var = (xy1) unsafe.getObjectVolatile(this, j);
        if (xy1Var != null) {
            xy1Var.a();
            unsafe.putObjectVolatile(this, j, hg9.a);
        }
        fb2 fb2Var = null;
        eb2 eb2Var = obj instanceof eb2 ? (eb2) obj : null;
        Throwable th = eb2Var != null ? eb2Var.a : null;
        if (x07Var instanceof hg7) {
            try {
                ((hg7) x07Var).n(th);
                return;
            } catch (Throwable th2) {
                M(new fb2("Exception in completion handler " + x07Var + " for " + this, th2));
                return;
            }
        }
        ag9 ag9VarD = x07Var.d();
        if (ag9VarD != null) {
            ag9VarD.e(new e78(1), 1);
            Object objH = ag9VarD.h();
            objH.getClass();
            for (he8 he8VarI = (he8) objH; !he8VarI.equals(ag9VarD); he8VarI = he8VarI.i()) {
                if (he8VarI instanceof hg7) {
                    try {
                        ((hg7) he8VarI).n(th);
                    } catch (Throwable th3) {
                        if (fb2Var != null) {
                            bzd.m(fb2Var, th3);
                        } else {
                            fb2Var = new fb2("Exception in completion handler " + he8VarI + " for " + this, th3);
                        }
                    }
                }
            }
            if (fb2Var != null) {
                M(fb2Var);
            }
        }
    }

    public final Throwable B(Object obj) {
        Throwable thC;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new eg7(y(), null, this) : th;
        }
        obj.getClass();
        rg7 rg7Var = (rg7) obj;
        Object objK = rg7Var.K();
        if (objK instanceof lg7) {
            thC = ((lg7) objK).c();
        } else if (objK instanceof eb2) {
            thC = ((eb2) objK).a;
        } else {
            if (objK instanceof x07) {
                pd4.i(objK, "Cannot be cancelling child in this state: ");
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new eg7("Parent job is ".concat(d0(objK)), thC, rg7Var) : cancellationException;
    }

    public final Object C(lg7 lg7Var, Object obj) throws Throwable {
        Throwable th;
        rg7 rg7Var;
        lg7 lg7Var2;
        eb2 eb2Var = obj instanceof eb2 ? (eb2) obj : null;
        Throwable th2 = eb2Var != null ? eb2Var.a : null;
        synchronized (lg7Var) {
            try {
                lg7Var.e();
                ArrayList<Throwable> arrayListG = lg7Var.g(th2);
                Throwable thF = F(lg7Var, arrayListG);
                if (thF != null) {
                    try {
                        if (arrayListG.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                            for (Throwable th3 : arrayListG) {
                                if (th3 != thF && th3 != thF && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    bzd.m(thF, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thF != null && thF != th2) {
                    obj = new eb2(thF, false);
                }
                if (thF != null && (w(thF) || L(thF))) {
                    obj.getClass();
                    ud0.a.compareAndSwapInt((eb2) obj, eb2.b, 0, 1);
                }
                Y(obj);
                Object b17Var = obj instanceof x07 ? new b17((x07) obj) : obj;
                while (true) {
                    Unsafe unsafe = ud0.a;
                    long j = b;
                    rg7Var = this;
                    lg7Var2 = lg7Var;
                    if (unsafe.compareAndSwapObject(rg7Var, j, lg7Var2, b17Var) || unsafe.getObjectVolatile(rg7Var, j) != lg7Var2) {
                        break;
                    }
                    this = rg7Var;
                    lg7Var = lg7Var2;
                }
                rg7Var.A(lg7Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // defpackage.dg7
    public final lqb C0() {
        qg7 qg7Var = qg7.a;
        z7f.t(3, qg7Var);
        return new lqb(5, this, qg7Var);
    }

    public final Object D() throws Throwable {
        Object objK = K();
        if (objK instanceof x07) {
            qc0.p("This job has not completed yet");
            return null;
        }
        if (objK instanceof eb2) {
            throw ((eb2) objK).a;
        }
        return sg7.a(objK);
    }

    @Override // defpackage.dg7
    public final ta4 E(a26 a26Var) {
        return P(true, new bd7(a26Var));
    }

    public final Throwable F(lg7 lg7Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (lg7Var.e()) {
                return new eg7(y(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof kye) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof kye)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // defpackage.pv2
    public final nv2 F0(ov2 ov2Var) {
        return i7h.s(this, ov2Var);
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return this instanceof za2;
    }

    public final ag9 J(x07 x07Var) {
        ag9 ag9VarD = x07Var.d();
        if (ag9VarD != null) {
            return ag9VarD;
        }
        if (x07Var instanceof hu4) {
            return new ag9();
        }
        if (x07Var instanceof hg7) {
            b0((hg7) x07Var);
            return null;
        }
        pd4.i(x07Var, "State should have list: ");
        return null;
    }

    public final Object K() {
        return ud0.a.getObjectVolatile(this, b);
    }

    public boolean L(Throwable th) {
        return false;
    }

    @Override // defpackage.dg7
    public final boolean L0() {
        return !(K() instanceof x07);
    }

    @Override // defpackage.dg7
    public final CancellationException N() {
        CancellationException cancellationException;
        Object objK = K();
        if (objK instanceof lg7) {
            Throwable thC = ((lg7) objK).c();
            if (thC == null) {
                pd4.i(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
            return cancellationException == null ? new eg7(strConcat, thC, this) : cancellationException;
        }
        if (objK instanceof x07) {
            pd4.i(this, "Job is still new or active: ");
            return null;
        }
        if (!(objK instanceof eb2)) {
            return new eg7(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((eb2) objK).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new eg7(y(), th, this) : cancellationException;
    }

    public final void O(dg7 dg7Var) {
        long j = a;
        hg9 hg9Var = hg9.a;
        if (dg7Var == null) {
            ud0.a.putObjectVolatile(this, j, hg9Var);
            return;
        }
        dg7Var.start();
        xy1 xy1VarX = dg7Var.x(this);
        Unsafe unsafe = ud0.a;
        unsafe.putObjectVolatile(this, j, xy1VarX);
        if (L0()) {
            xy1VarX.a();
            unsafe.putObjectVolatile(this, j, hg9Var);
        }
    }

    public final ta4 P(boolean z, hg7 hg7Var) {
        rg7 rg7Var;
        hg7 hg7Var2;
        boolean zE;
        hg7Var.d = this;
        loop0: while (true) {
            Object objK = this.K();
            if (!(objK instanceof hu4)) {
                rg7Var = this;
                hg7Var2 = hg7Var;
                boolean z2 = objK instanceof x07;
                hg9 hg9Var = hg9.a;
                if (z2) {
                    x07 x07Var = (x07) objK;
                    ag9 ag9VarD = x07Var.d();
                    if (ag9VarD == null) {
                        rg7Var.b0((hg7) objK);
                    } else {
                        if (hg7Var2.m()) {
                            lg7 lg7Var = x07Var instanceof lg7 ? (lg7) x07Var : null;
                            Throwable thC = lg7Var != null ? lg7Var.c() : null;
                            if (thC == null) {
                                zE = ag9VarD.e(hg7Var2, 5);
                            } else if (z) {
                                hg7Var2.n(thC);
                                return hg9Var;
                            }
                        } else {
                            zE = ag9VarD.e(hg7Var2, 1);
                        }
                        if (zE) {
                            break;
                        }
                    }
                    this = rg7Var;
                    hg7Var = hg7Var2;
                } else if (z) {
                    Object objK2 = rg7Var.K();
                    eb2 eb2Var = objK2 instanceof eb2 ? (eb2) objK2 : null;
                    hg7Var2.n(eb2Var != null ? eb2Var.a : null);
                }
                return hg9Var;
            }
            hu4 hu4Var = (hu4) objK;
            if (hu4Var.a) {
                while (true) {
                    Unsafe unsafe = ud0.a;
                    long j = b;
                    rg7Var = this;
                    hg7Var2 = hg7Var;
                    if (unsafe.compareAndSwapObject(rg7Var, j, objK, hg7Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(rg7Var, j) != objK) {
                        break;
                    }
                    this = rg7Var;
                    hg7Var = hg7Var2;
                }
            } else {
                rg7Var = this;
                hg7Var2 = hg7Var;
                rg7Var.a0(hu4Var);
            }
            this = rg7Var;
            hg7Var = hg7Var2;
        }
        return hg7Var2;
    }

    public boolean Q() {
        return this instanceof m01;
    }

    public final boolean R(Object obj) {
        Object objE0;
        do {
            objE0 = e0(K(), obj);
            if (objE0 == sg7.a) {
                return false;
            }
            if (objE0 == sg7.b) {
                return true;
            }
        } while (objE0 == sg7.c);
        f(objE0);
        return true;
    }

    public final Object S(Object obj) {
        Object objE0;
        do {
            objE0 = e0(K(), obj);
            if (objE0 == sg7.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                eb2 eb2Var = obj instanceof eb2 ? (eb2) obj : null;
                throw new IllegalStateException(str, eb2Var != null ? eb2Var.a : null);
            }
        } while (objE0 == sg7.c);
        return objE0;
    }

    public String T() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.pv2
    public final pv2 U(ov2 ov2Var) {
        return i7h.E(this, ov2Var);
    }

    @Override // defpackage.dg7
    public final Object U0(zn2 zn2Var) {
        Object objK;
        wef wefVar;
        do {
            objK = K();
            boolean z = objK instanceof x07;
            wefVar = wef.a;
            if (!z) {
                tq.v(zn2Var.getContext());
                return wefVar;
            }
        } while (c0(objK) < 0);
        pl1 pl1Var = new pl1(1, k99.D(zn2Var));
        pl1Var.v();
        pl1Var.y(new kl1(2, tq.E(this, true, new mzb(pl1Var))));
        Object objT = pl1Var.t();
        bw2 bw2Var = bw2.a;
        if (objT != bw2Var) {
            objT = wefVar;
        }
        return objT == bw2Var ? objT : wefVar;
    }

    @Override // defpackage.pv2
    public final Object V0(l26 l26Var, Object obj) {
        return l26Var.z(obj, this);
    }

    public final void X(ag9 ag9Var, Throwable th) {
        ag9Var.e(new e78(4), 4);
        Object objH = ag9Var.h();
        objH.getClass();
        fb2 fb2Var = null;
        for (he8 he8VarI = (he8) objH; !he8VarI.equals(ag9Var); he8VarI = he8VarI.i()) {
            if ((he8VarI instanceof hg7) && ((hg7) he8VarI).m()) {
                try {
                    ((hg7) he8VarI).n(th);
                } catch (Throwable th2) {
                    if (fb2Var != null) {
                        bzd.m(fb2Var, th2);
                    } else {
                        fb2Var = new fb2("Exception in completion handler " + he8VarI + " for " + this, th2);
                    }
                }
            }
        }
        if (fb2Var != null) {
            M(fb2Var);
        }
        w(th);
    }

    public final void a0(hu4 hu4Var) {
        ag9 ag9Var = new ag9();
        Object s07Var = hu4Var.a ? ag9Var : new s07(ag9Var);
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = b;
            rg7 rg7Var = this;
            hu4 hu4Var2 = hu4Var;
            if (unsafe.compareAndSwapObject(rg7Var, j, hu4Var2, s07Var) || unsafe.getObjectVolatile(rg7Var, j) != hu4Var2) {
                return;
            }
            this = rg7Var;
            hu4Var = hu4Var2;
        }
    }

    @Override // defpackage.dg7
    public boolean b() {
        Object objK = K();
        return (objK instanceof x07) && ((x07) objK).b();
    }

    public final void b0(hg7 hg7Var) {
        hg7 hg7Var2;
        rg7 rg7Var;
        ag9 ag9Var = new ag9();
        Unsafe unsafe = ud0.a;
        unsafe.putObjectVolatile(ag9Var, he8.b, hg7Var);
        long j = he8.a;
        unsafe.putObjectVolatile(ag9Var, j, hg7Var);
        loop0: while (true) {
            if (hg7Var.h() != hg7Var) {
                hg7Var2 = hg7Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = ud0.a;
                hg7Var2 = hg7Var;
                if (unsafe2.compareAndSwapObject(hg7Var2, he8.a, hg7Var, ag9Var)) {
                    ag9Var.g(hg7Var2);
                    break loop0;
                }
                rg7Var = this;
                hg7Var = hg7Var2;
                if (unsafe2.getObjectVolatile(hg7Var2, j) != hg7Var2) {
                    break;
                } else {
                    this = rg7Var;
                }
            }
            this = rg7Var;
        }
        he8 he8VarI = hg7Var2.i();
        while (true) {
            Unsafe unsafe3 = ud0.a;
            long j2 = b;
            rg7 rg7Var2 = this;
            if (unsafe3.compareAndSwapObject(rg7Var2, j2, hg7Var2, he8VarI) || unsafe3.getObjectVolatile(rg7Var2, j2) != hg7Var2) {
                return;
            } else {
                this = rg7Var2;
            }
        }
    }

    public final int c0(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof hu4;
        long j = b;
        if (!z) {
            rg7 rg7Var = this;
            Object obj2 = obj;
            if (!(obj2 instanceof s07)) {
                return 0;
            }
            ag9 ag9Var = ((s07) obj2).a;
            do {
                rg7 rg7Var2 = rg7Var;
                unsafe = ud0.a;
                Object obj3 = obj2;
                boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(rg7Var2, b, obj3, ag9Var);
                rg7Var = rg7Var2;
                obj2 = obj3;
                if (zCompareAndSwapObject) {
                    rg7Var.Z();
                    return 1;
                }
            } while (unsafe.getObjectVolatile(rg7Var, j) == obj2);
            return -1;
        }
        if (((hu4) obj).a) {
            return 0;
        }
        while (true) {
            Unsafe unsafe2 = ud0.a;
            rg7 rg7Var3 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(rg7Var3, b, obj4, sg7.g)) {
                rg7Var3.Z();
                return 1;
            }
            if (unsafe2.getObjectVolatile(rg7Var3, j) != obj4) {
                return -1;
            }
            this = rg7Var3;
            obj = obj4;
        }
    }

    public final Object e0(Object obj, Object obj2) {
        if (!(obj instanceof x07)) {
            return sg7.a;
        }
        if ((!(obj instanceof hu4) && !(obj instanceof hg7)) || (obj instanceof yy1) || (obj2 instanceof eb2)) {
            rg7 rg7Var = this;
            x07 x07Var = (x07) obj;
            ag9 ag9VarJ = rg7Var.J(x07Var);
            if (ag9VarJ == null) {
                return sg7.c;
            }
            lg7 lg7Var = x07Var instanceof lg7 ? (lg7) x07Var : null;
            if (lg7Var == null) {
                lg7Var = new lg7(ag9VarJ, null);
            }
            lg7 lg7Var2 = lg7Var;
            synchronized (lg7Var2) {
                if (lg7Var2.f()) {
                    return sg7.a;
                }
                ud0.a.putIntVolatile(lg7Var2, lg7.c, 1);
                if (lg7Var2 != x07Var) {
                    while (true) {
                        Unsafe unsafe = ud0.a;
                        long j = b;
                        rg7 rg7Var2 = rg7Var;
                        rg7Var = rg7Var2;
                        if (unsafe.compareAndSwapObject(rg7Var2, j, x07Var, lg7Var2)) {
                            break;
                        }
                        if (unsafe.getObjectVolatile(rg7Var, j) != x07Var) {
                            return sg7.c;
                        }
                    }
                }
                boolean zE = lg7Var2.e();
                eb2 eb2Var = obj2 instanceof eb2 ? (eb2) obj2 : null;
                if (eb2Var != null) {
                    lg7Var2.a(eb2Var.a);
                }
                Throwable thC = zE ? null : lg7Var2.c();
                if (thC != null) {
                    rg7Var.X(ag9VarJ, thC);
                }
                yy1 yy1VarV = V(ag9VarJ);
                if (yy1VarV != null && rg7Var.f0(lg7Var2, yy1VarV, obj2)) {
                    return sg7.b;
                }
                ag9VarJ.e(new e78(2), 2);
                yy1 yy1VarV2 = V(ag9VarJ);
                return (yy1VarV2 == null || !rg7Var.f0(lg7Var2, yy1VarV2, obj2)) ? rg7Var.C(lg7Var2, obj2) : sg7.b;
            }
        }
        x07 x07Var2 = (x07) obj;
        Object b17Var = obj2 instanceof x07 ? new b17((x07) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = ud0.a;
            long j2 = b;
            rg7 rg7Var3 = this;
            if (unsafe2.compareAndSwapObject(rg7Var3, j2, x07Var2, b17Var)) {
                rg7Var3.Y(obj2);
                rg7Var3.A(x07Var2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(rg7Var3, j2) != x07Var2) {
                return sg7.c;
            }
            this = rg7Var3;
        }
    }

    public final boolean f0(lg7 lg7Var, yy1 yy1Var, Object obj) {
        while (tq.E(yy1Var.e, false, new kg7(this, lg7Var, yy1Var, obj)) == hg9.a) {
            yy1Var = V(yy1Var);
            if (yy1Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nv2
    public final ov2 getKey() {
        return ndb.Y0;
    }

    @Override // defpackage.dg7
    public void h(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new eg7(y(), null, this);
        }
        v(cancellationException);
    }

    @Override // defpackage.dg7
    public final ta4 h0(boolean z, boolean z2, uj3 uj3Var) {
        return P(z2, z ? new ad7(uj3Var) : new bd7(uj3Var));
    }

    @Override // defpackage.dg7
    public final boolean isCancelled() {
        Object objK = K();
        if (objK instanceof eb2) {
            return true;
        }
        return (objK instanceof lg7) && ((lg7) objK).e();
    }

    public Object l() {
        return D();
    }

    @Override // defpackage.pv2
    public final pv2 p0(pv2 pv2Var) {
        return i7h.I(this, pv2Var);
    }

    public void r(Object obj) {
        f(obj);
    }

    public final Object s(xn2 xn2Var) throws Throwable {
        Object objK;
        do {
            objK = K();
            if (!(objK instanceof x07)) {
                if (objK instanceof eb2) {
                    throw ((eb2) objK).a;
                }
                return sg7.a(objK);
            }
        } while (c0(objK) < 0);
        jg7 jg7Var = new jg7(k99.D(xn2Var), this);
        jg7Var.v();
        jg7Var.y(new kl1(2, tq.E(this, true, new lzb(jg7Var))));
        return jg7Var.t();
    }

    @Override // defpackage.dg7
    public final boolean start() {
        int iC0;
        do {
            iC0 = c0(K());
            if (iC0 == 0) {
                return false;
            }
        } while (iC0 != 1);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb A[LOOP:2: B:56:0x00b2->B:63:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    public final boolean t(Object obj) {
        rg7 rg7Var;
        Throwable thB;
        Object objK;
        Throwable thC;
        ig4 ig4Var;
        Object objE0;
        x07 x07Var;
        ag9 ag9VarJ;
        lg7 lg7Var;
        Unsafe unsafe;
        long j;
        Object objE1 = sg7.a;
        if (I()) {
            do {
                Object objK2 = K();
                if (!(objK2 instanceof x07) || ((objK2 instanceof lg7) && ((lg7) objK2).f())) {
                    objE1 = sg7.a;
                    break;
                }
                objE1 = e0(objK2, new eb2(B(obj), false));
            } while (objE1 == sg7.c);
            if (objE1 != sg7.b) {
                if (objE1 == sg7.a) {
                    thB = null;
                    loop1: while (true) {
                        objK = this.K();
                        if (objK instanceof lg7) {
                            if (objK instanceof x07) {
                                if (thB == null) {
                                    thB = this.B(obj);
                                }
                                x07Var = (x07) objK;
                                if (x07Var.b()) {
                                    ag9VarJ = this.J(x07Var);
                                    if (ag9VarJ == null) {
                                        rg7Var = this;
                                    } else {
                                        lg7Var = new lg7(ag9VarJ, thB);
                                        while (true) {
                                            unsafe = ud0.a;
                                            j = b;
                                            rg7Var = this;
                                            if (unsafe.compareAndSwapObject(rg7Var, j, x07Var, lg7Var)) {
                                                rg7Var.X(ag9VarJ, thB);
                                                objE0 = sg7.a;
                                            } else if (unsafe.getObjectVolatile(rg7Var, j) != x07Var) {
                                                this = rg7Var;
                                            }
                                        }
                                    }
                                    this = rg7Var;
                                } else {
                                    rg7Var = this;
                                    objE0 = rg7Var.e0(objK, new eb2(thB, false));
                                    if (objE0 != sg7.a) {
                                        pd4.i(objK, "Cannot happen in ");
                                        return false;
                                    }
                                    if (objE0 != sg7.c) {
                                        this = rg7Var;
                                    }
                                }
                            } else {
                                rg7Var = this;
                                objE0 = sg7.d;
                            }
                            objE1 = objE0;
                            break;
                        }
                        synchronized (objK) {
                            if (ud0.a.getObjectVolatile((lg7) objK, lg7.b) == sg7.e) {
                                ig4Var = sg7.d;
                            } else {
                                boolean zE = ((lg7) objK).e();
                                if (obj == null || !zE) {
                                    if (thB == null) {
                                        thB = this.B(obj);
                                    }
                                    ((lg7) objK).a(thB);
                                }
                                thC = zE ? null : ((lg7) objK).c();
                                if (thC != null) {
                                    this.X(((lg7) objK).a, thC);
                                }
                                ig4Var = sg7.a;
                            }
                        }
                        rg7Var = this;
                        objE1 = ig4Var;
                        break;
                    }
                }
                rg7Var = this;
                if (objE1 != sg7.a && objE1 != sg7.b) {
                    if (objE1 == sg7.d) {
                        return false;
                    }
                    rg7Var.f(objE1);
                    return true;
                }
            }
        } else {
            if (objE1 == sg7.a) {
                thB = null;
                loop1: while (true) {
                    objK = this.K();
                    if (objK instanceof lg7) {
                        if (objK instanceof x07) {
                            if (thB == null) {
                                thB = this.B(obj);
                            }
                            x07Var = (x07) objK;
                            if (x07Var.b()) {
                                ag9VarJ = this.J(x07Var);
                                if (ag9VarJ == null) {
                                    rg7Var = this;
                                } else {
                                    lg7Var = new lg7(ag9VarJ, thB);
                                    while (true) {
                                        unsafe = ud0.a;
                                        j = b;
                                        rg7Var = this;
                                        if (unsafe.compareAndSwapObject(rg7Var, j, x07Var, lg7Var)) {
                                            rg7Var.X(ag9VarJ, thB);
                                            objE0 = sg7.a;
                                        } else if (unsafe.getObjectVolatile(rg7Var, j) != x07Var) {
                                            this = rg7Var;
                                        }
                                    }
                                }
                                this = rg7Var;
                            } else {
                                rg7Var = this;
                                objE0 = rg7Var.e0(objK, new eb2(thB, false));
                                if (objE0 != sg7.a) {
                                    pd4.i(objK, "Cannot happen in ");
                                    return false;
                                }
                                if (objE0 != sg7.c) {
                                    this = rg7Var;
                                }
                            }
                        } else {
                            rg7Var = this;
                            objE0 = sg7.d;
                        }
                        objE1 = objE0;
                        break;
                    }
                    synchronized (objK) {
                        if (ud0.a.getObjectVolatile((lg7) objK, lg7.b) == sg7.e) {
                            ig4Var = sg7.d;
                        } else {
                            boolean zE2 = ((lg7) objK).e();
                            if (obj == null) {
                                if (thB == null) {
                                    thB = this.B(obj);
                                }
                                ((lg7) objK).a(thB);
                            } else {
                                if (thB == null) {
                                    thB = this.B(obj);
                                }
                                ((lg7) objK).a(thB);
                            }
                            if (zE2) {
                            }
                            if (thC != null) {
                                this.X(((lg7) objK).a, thC);
                            }
                            ig4Var = sg7.a;
                        }
                        rg7Var = this;
                        objE1 = ig4Var;
                        break;
                    }
                }
            }
            rg7Var = this;
            if (objE1 != sg7.a) {
                if (objE1 == sg7.d) {
                    return false;
                }
                rg7Var.f(objE1);
                return true;
            }
        }
        return true;
    }

    public final String toString() {
        return (T() + '{' + d0(K()) + '}') + '@' + mh3.F(this);
    }

    public void v(Throwable th) {
        t(th);
    }

    public final boolean w(Throwable th) {
        if (Q()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        xy1 xy1Var = (xy1) ud0.a.getObjectVolatile(this, a);
        if (xy1Var == null || xy1Var == hg9.a) {
            return z;
        }
        return xy1Var.c(th) || z;
    }

    @Override // defpackage.dg7
    public final xy1 x(rg7 rg7Var) {
        rg7 rg7Var2;
        yy1 yy1Var = new yy1(rg7Var);
        yy1Var.d = this;
        loop0: while (true) {
            Object objK = this.K();
            if (objK instanceof hu4) {
                hu4 hu4Var = (hu4) objK;
                if (hu4Var.a) {
                    while (true) {
                        Unsafe unsafe = ud0.a;
                        long j = b;
                        rg7Var2 = this;
                        if (unsafe.compareAndSwapObject(rg7Var2, j, objK, yy1Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(rg7Var2, j) != objK) {
                            break;
                        }
                        this = rg7Var2;
                    }
                } else {
                    rg7Var2 = this;
                    rg7Var2.a0(hu4Var);
                }
                this = rg7Var2;
            } else {
                rg7Var2 = this;
                boolean z = objK instanceof x07;
                hg9 hg9Var = hg9.a;
                Throwable thC = null;
                if (!z) {
                    Object objK2 = rg7Var2.K();
                    eb2 eb2Var = objK2 instanceof eb2 ? (eb2) objK2 : null;
                    yy1Var.n(eb2Var != null ? eb2Var.a : null);
                    return hg9Var;
                }
                ag9 ag9VarD = ((x07) objK).d();
                if (ag9VarD != null) {
                    if (ag9VarD.e(yy1Var, 7)) {
                        break;
                    }
                    boolean zE = ag9VarD.e(yy1Var, 3);
                    Object objK3 = rg7Var2.K();
                    if (objK3 instanceof lg7) {
                        thC = ((lg7) objK3).c();
                    } else {
                        eb2 eb2Var2 = objK3 instanceof eb2 ? (eb2) objK3 : null;
                        if (eb2Var2 != null) {
                            thC = eb2Var2.a;
                        }
                    }
                    yy1Var.n(thC);
                    if (zE) {
                        break;
                    }
                    return hg9Var;
                }
                rg7Var2.b0((hg7) objK);
                this = rg7Var2;
            }
        }
        return yy1Var;
    }

    public String y() {
        return "Job was cancelled";
    }

    public boolean z(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return t(th) && H();
    }

    public void Z() {
    }

    public void M(fb2 fb2Var) {
        throw fb2Var;
    }

    public void Y(Object obj) {
    }

    public void f(Object obj) {
    }
}
