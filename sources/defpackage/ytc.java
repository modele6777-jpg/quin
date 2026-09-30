package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ytc implements ll1, fzf {
    public static final /* synthetic */ long f = ud0.a.objectFieldOffset(ytc.class.getDeclaredField("state$volatile"));
    public static final /* synthetic */ int g = 0;
    public final pv2 a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = ztc.a;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object e = ztc.d;

    public ytc(pv2 pv2Var) {
        this.a = pv2Var;
    }

    public static Object d(ytc ytcVar, gbe gbeVar) {
        return ud0.a.getObjectVolatile(ytcVar, f) instanceof wtc ? ytcVar.c(gbeVar) : ytcVar.e(gbeVar);
    }

    @Override // defpackage.fzf
    public final void a(rtc rtcVar, int i) {
        this.c = rtcVar;
        this.d = i;
    }

    @Override // defpackage.ll1
    public final void b(Throwable th) {
        ytc ytcVar;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == ztc.b) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = ud0.a;
                ytcVar = this;
                if (unsafe2.compareAndSwapObject(ytcVar, f, objectVolatile, ztc.c)) {
                    ArrayList arrayList = ytcVar.b;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((wtc) it.next()).a();
                    }
                    ytcVar.e = ztc.d;
                    ytcVar.b = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(ytcVar, j) != objectVolatile) {
                    break;
                } else {
                    this = ytcVar;
                }
            }
            this = ytcVar;
        }
    }

    public final Object c(zn2 zn2Var) {
        Unsafe unsafe = ud0.a;
        long j = f;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        objectVolatile.getClass();
        wtc wtcVar = (wtc) objectVolatile;
        Object obj = wtcVar.d;
        Object obj2 = this.e;
        ArrayList<wtc> arrayList = this.b;
        if (arrayList != null) {
            for (wtc wtcVar2 : arrayList) {
                if (wtcVar2 != wtcVar) {
                    wtcVar2.a();
                }
            }
            ud0.a.putObjectVolatile(this, j, ztc.b);
            this.e = ztc.d;
            this.b = null;
        }
        Object objM = wtcVar.c.m(wtcVar.a, obj, obj2);
        m26 m26Var = wtcVar.e;
        return obj == ztc.e ? ((a26) m26Var).d(zn2Var) : ((l26) m26Var).z(objM, zn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object e(zn2 zn2Var) {
        xtc xtcVar;
        Object obj;
        pl1 pl1Var;
        Unsafe unsafe;
        if (zn2Var instanceof xtc) {
            xtcVar = (xtc) zn2Var;
            int i = xtcVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xtcVar.label = i - Integer.MIN_VALUE;
            } else {
                xtcVar = new xtc(this, zn2Var);
            }
        } else {
            xtcVar = new xtc(this, zn2Var);
        }
        xtc xtcVar2 = xtcVar;
        Object obj2 = xtcVar2.result;
        int i2 = xtcVar2.label;
        Object obj3 = bw2.a;
        if (i2 == 0) {
            jzb.q(obj2);
            xtcVar2.label = 1;
            pl1 pl1Var2 = new pl1(1, k99.D(xtcVar2));
            pl1Var2.v();
            loop0: while (true) {
                Unsafe unsafe2 = ud0.a;
                long j = f;
                Object objectVolatile = unsafe2.getObjectVolatile(this, j);
                obj = wef.a;
                pl1 pl1Var3 = pl1Var2;
                ig4 ig4Var = ztc.a;
                if (objectVolatile == ig4Var) {
                    pl1 pl1Var4 = pl1Var3;
                    while (true) {
                        Unsafe unsafe3 = ud0.a;
                        pl1Var = pl1Var4;
                        if (unsafe3.compareAndSwapObject(this, f, objectVolatile, pl1Var4)) {
                            pl1Var.y(this);
                            break loop0;
                        }
                        if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                            break;
                        }
                        pl1Var4 = pl1Var;
                    }
                    pl1Var2 = pl1Var;
                } else {
                    pl1Var = pl1Var3;
                    if (!(objectVolatile instanceof List)) {
                        if (!(objectVolatile instanceof wtc)) {
                            pd4.i(objectVolatile, "unexpected state: ");
                            return null;
                        }
                        wtc wtcVar = (wtc) objectVolatile;
                        Object obj4 = this.e;
                        n26 n26Var = wtcVar.f;
                        pl1Var.n(obj, n26Var != null ? (n26) n26Var.m(this, wtcVar.d, obj4) : null);
                        break;
                    }
                    do {
                        unsafe = ud0.a;
                        if (unsafe.compareAndSwapObject(this, f, objectVolatile, ig4Var)) {
                            Iterator it = ((Iterable) objectVolatile).iterator();
                            while (it.hasNext()) {
                                wtc wtcVarF = f(it.next());
                                wtcVarF.getClass();
                                wtcVarF.g = null;
                                wtcVarF.h = -1;
                                h(wtcVarF, true);
                            }
                            break;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                    pl1Var2 = pl1Var;
                }
            }
            Object objT = pl1Var.t();
            if (objT == obj3) {
                obj = objT;
            }
            if (obj != obj3) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                jzb.q(obj2);
                return obj2;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj2);
        xtcVar2.label = 2;
        Object objC = c(xtcVar2);
        return objC == obj3 ? obj3 : objC;
    }

    public final wtc f(Object obj) {
        Object next;
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((wtc) next).a != obj);
        wtc wtcVar = (wtc) next;
        if (wtcVar != null) {
            return wtcVar;
        }
        cva.w(obj, " is not found", "Clause with object ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(kxa kxaVar, l26 l26Var) {
        h(new wtc(this, kxaVar.a, (n26) kxaVar.b, (n26) kxaVar.c, null, (gbe) l26Var, (n26) kxaVar.d), false);
    }

    public final void h(wtc wtcVar, boolean z) {
        Object obj = wtcVar.a;
        Unsafe unsafe = ud0.a;
        long j = f;
        if (unsafe.getObjectVolatile(this, j) instanceof wtc) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((wtc) it.next()).a == obj) {
                        ho7.j(ks0.j(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        wtcVar.b.m(obj, this, wtcVar.d);
        if (this.e != ztc.d) {
            ud0.a.putObjectVolatile(this, j, wtcVar);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.b;
            arrayList2.getClass();
            arrayList2.add(wtcVar);
        }
        wtcVar.g = this.c;
        wtcVar.h = this.d;
        this.c = null;
        this.d = -1;
    }

    public final boolean i(Object obj, Object obj2) {
        return j(obj, obj2) == 0;
    }

    public final int j(Object obj, Object obj2) {
        ytc ytcVar;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            Unsafe unsafe3 = ud0.a;
            long j = f;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof ol1) {
                wtc wtcVarF = this.f(obj);
                if (wtcVarF != null) {
                    n26 n26Var = wtcVarF.f;
                    n26 n26Var2 = n26Var != null ? (n26) n26Var.m(this, wtcVarF.d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = ud0.a;
                        ytcVar = this;
                        if (unsafe4.compareAndSwapObject(ytcVar, f, objectVolatile, wtcVarF)) {
                            ol1 ol1Var = (ol1) objectVolatile;
                            ytcVar.e = obj2;
                            ig4 ig4VarJ = ol1Var.j(wef.a, n26Var2);
                            if (ig4VarJ == null) {
                                ytcVar.e = ztc.d;
                                return 2;
                            }
                            ol1Var.q(ig4VarJ);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(ytcVar, j) != objectVolatile) {
                            break;
                        }
                        this = ytcVar;
                    }
                } else {
                    continue;
                }
            } else {
                ytcVar = this;
                if (pa7.t(objectVolatile, ztc.b) || (objectVolatile instanceof wtc)) {
                    return 3;
                }
                if (pa7.t(objectVolatile, ztc.c)) {
                    return 2;
                }
                if (pa7.t(objectVolatile, ztc.a)) {
                    List listH = t72.H(obj);
                    do {
                        unsafe2 = ud0.a;
                        if (unsafe2.compareAndSwapObject(ytcVar, f, objectVolatile, listH)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(ytcVar, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        pd4.i(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListR0 = s72.R0((Collection) objectVolatile, obj);
                    do {
                        unsafe = ud0.a;
                        if (unsafe.compareAndSwapObject(ytcVar, f, objectVolatile, arrayListR0)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(ytcVar, j) == objectVolatile);
                }
            }
            this = ytcVar;
        }
    }
}
