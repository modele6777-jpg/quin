package defpackage;

import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xjb extends lg2 {
    public final ow a;
    public final gg7 b;
    public final Object c;
    public dg7 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public x79 h;
    public final p89 i;
    public final ArrayList j;
    public final ArrayList k;
    public final w79 l;
    public final fz3 m;
    public final w79 n;
    public final w79 o;
    public ArrayList p;
    public x79 q;
    public pl1 r;
    public final s0e s;
    public boolean t;
    public final s0e u;
    public final psd v;
    public final fg7 w;
    public final pv2 x;
    public final y25 y;
    public static final s0e z = t0e.a(y9a.d);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public xjb(pv2 pv2Var) {
        ow owVar = new ow(new qjb(this, 0));
        this.a = owVar;
        this.b = new gg7(new qjb(this, 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new x79();
        this.i = new p89(0, new rg2[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new w79();
        this.m = new fz3(23);
        this.n = new w79();
        this.o = new w79();
        this.s = t0e.a(null);
        this.u = t0e.a(sjb.c);
        this.v = new psd(0, (byte) 0);
        fg7 fg7Var = new fg7((dg7) pv2Var.F0(ndb.Y0));
        fg7Var.E(new p59(29, this));
        this.w = fg7Var;
        this.x = pv2Var.p0(owVar).p0(fg7Var);
        this.y = new y25(21);
    }

    public static final void B(xjb xjbVar, g49 g49Var, g49 g49Var2) {
        List list = g49Var2.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                g49 g49Var3 = (g49) list.get(i);
                fz3 fz3Var = xjbVar.m;
                e49 e49Var = g49Var3.a;
                w59.a((w79) fz3Var.b, e49Var, new mc9(g49Var3, g49Var));
                w59.a((w79) fz3Var.c, g49Var, e49Var);
                B(xjbVar, g49Var, g49Var3);
            }
        }
    }

    public static final void K(ArrayList arrayList, xjb xjbVar, rg2 rg2Var) {
        arrayList.clear();
        synchronized (xjbVar.c) {
            Iterator it = xjbVar.k.iterator();
            while (it.hasNext()) {
                g49 g49Var = (g49) it.next();
                if (g49Var.c.equals(rg2Var)) {
                    arrayList.add(g49Var);
                    it.remove();
                }
            }
        }
    }

    public static void z(c89 c89Var) {
        try {
            if (c89Var.w() instanceof krd) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            c89Var.c();
        } catch (Throwable th) {
            c89Var.c();
            throw th;
        }
    }

    public final void A() {
        synchronized (this.c) {
            if (((sjb) this.u.getValue()).compareTo(sjb.e) >= 0) {
                s0e s0eVar = this.u;
                sjb sjbVar = sjb.b;
                s0eVar.getClass();
                s0eVar.n(null, sjbVar);
            }
        }
        this.w.h(null);
    }

    public final ol1 C() {
        s0e s0eVar = this.u;
        int iCompareTo = ((sjb) s0eVar.getValue()).compareTo(sjb.b);
        s0e s0eVar2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        p89 p89Var = this.i;
        if (iCompareTo > 0) {
            Object value = s0eVar2.getValue();
            sjb sjbVar = sjb.f;
            sjb sjbVar2 = sjb.c;
            if (value == null) {
                if (this.d == null) {
                    this.h = new x79();
                    p89Var.g();
                    if (D() || F()) {
                        sjbVar2 = sjb.d;
                    }
                } else {
                    sjbVar2 = (p89Var.c != 0 || this.h.d() || !arrayList2.isEmpty() || !arrayList.isEmpty() || D() || F() || this.l.j()) ? sjbVar : sjb.e;
                }
            }
            s0eVar.getClass();
            s0eVar.n(null, sjbVar2);
            if (sjbVar2 != sjbVar) {
                return null;
            }
            pl1 pl1Var = this.r;
            this.r = null;
            return pl1Var;
        }
        List listH = H();
        int size = listH.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = pu4.a;
        this.h = new x79();
        p89Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        pl1 pl1Var2 = this.r;
        if (pl1Var2 != null) {
            pl1Var2.p(null);
        }
        this.r = null;
        s0eVar2.m(null);
        return null;
    }

    public final boolean D() {
        return !this.t && (((xh0) ((a82) this.a.c).b).get() & 134217727) > 0;
    }

    public final boolean E() {
        return this.i.c != 0 || D() || F() || this.l.j();
    }

    public final boolean F() {
        return !this.t && (((xh0) ((a82) this.b.c).b).get() & 134217727) > 0;
    }

    public final boolean G() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.h.d() || this.i.c != 0 || D() || F();
        }
        return z2;
    }

    public final List H() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? pu4.a : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void I() {
        ol1 ol1VarC;
        synchronized (this.c) {
            ol1VarC = C();
            if (((sjb) this.u.getValue()).compareTo(sjb.b) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (ol1VarC != null) {
            ((pl1) ol1VarC).g(wef.a);
        }
    }

    public final void J(rg2 rg2Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((g49) arrayList.get(i)).c.equals(rg2Var)) {
                    ArrayList arrayList2 = new ArrayList();
                    K(arrayList2, this, rg2Var);
                    while (!arrayList2.isEmpty()) {
                        L(arrayList2, null);
                        K(arrayList2, this, rg2Var);
                    }
                    return;
                }
            }
        }
    }

    public final List L(List list, x79 x79Var) {
        c89 c89VarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            rg2 rg2Var = ((g49) obj).c;
            Object arrayList2 = map.get(rg2Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(rg2Var, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            rg2 rg2Var2 = (rg2) entry.getKey();
            List list2 = (List) entry.getValue();
            if (rg2Var2.K0.F) {
                wf2.a("Check failed");
            }
            p59 p59Var = new p59(28, rg2Var2);
            h6b h6bVar = new h6b(7, rg2Var2, x79Var);
            ird irdVarH = qrd.h();
            c89 c89Var = irdVarH instanceof c89 ? (c89) irdVarH : null;
            if (c89Var == null || (c89VarC = c89Var.C(p59Var, h6bVar)) == null) {
                qc0.p("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                ird irdVarJ = c89VarC.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                g49 g49Var = (g49) list2.get(i2);
                                Object objB = w59.b(this.l, g49Var.a);
                                g49 g49Var2 = (g49) objB;
                                if (g49Var2 != null) {
                                    this.m.x(g49Var2);
                                }
                                arrayList.add(new iy9(g49Var, objB));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                iy9 iy9Var = (iy9) arrayList.get(i3);
                                if (iy9Var.e() == null) {
                                    if (((w79) this.m.b).b(((g49) iy9Var.d()).a)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            iy9 iy9Var2 = (iy9) arrayList.get(i4);
                                            if (iy9Var2.e() == null) {
                                                fz3 fz3Var = this.m;
                                                e49 e49Var = ((g49) iy9Var2.d()).a;
                                                w79 w79Var = (w79) fz3Var.b;
                                                mc9 mc9Var = (mc9) w59.b(w79Var, e49Var);
                                                if (w79Var.i()) {
                                                    ((w79) fz3Var.c).a();
                                                }
                                                if (mc9Var != null) {
                                                    g49 g49Var3 = mc9Var.a;
                                                    w59.a(this.o, mc9Var.b, g49Var3);
                                                    iy9Var2 = new iy9(iy9Var2.d(), g49Var3);
                                                }
                                            }
                                            arrayList3.add(iy9Var2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((iy9) arrayList.get(i5)).e() != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((iy9) arrayList.get(i6)).e() == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        iy9 iy9Var3 = (iy9) arrayList.get(i7);
                                        g49 g49Var4 = iy9Var3.e() == null ? (g49) iy9Var3.d() : null;
                                        if (g49Var4 != null) {
                                            arrayList4.add(g49Var4);
                                        }
                                    }
                                    synchronized (this.c) {
                                        x72.g0(this.k, arrayList4);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((iy9) obj2).e() != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    rg2Var2.u(arrayList);
                    ird.q(irdVarJ);
                    z(c89VarC);
                } catch (Throwable th2) {
                    ird.q(irdVarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                z(c89VarC);
                throw th3;
            }
        }
        return s72.j1(map.keySet());
    }

    public final rg2 M(rg2 rg2Var, x79 x79Var) {
        c89 c89VarC;
        if (rg2Var.K0.F || rg2Var.L0 == 3) {
            return null;
        }
        x79 x79Var2 = this.q;
        if (x79Var2 == null || !x79Var2.a(rg2Var)) {
            p59 p59Var = new p59(28, rg2Var);
            h6b h6bVar = new h6b(7, rg2Var, x79Var);
            ird irdVarH = qrd.h();
            c89 c89Var = irdVarH instanceof c89 ? (c89) irdVarH : null;
            if (c89Var == null || (c89VarC = c89Var.C(p59Var, h6bVar)) == null) {
                qc0.p("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    ird irdVarJ = c89VarC.j();
                    if (x79Var != null) {
                        try {
                            if (x79Var.d()) {
                                ek9 ek9Var = new ek9(27, x79Var, rg2Var);
                                l46 l46Var = rg2Var.K0;
                                if (l46Var.F) {
                                    wf2.a("Preparing a composition while composing is not supported");
                                }
                                l46Var.F = true;
                                try {
                                    ek9Var.invoke();
                                    l46Var.F = false;
                                } catch (Throwable th) {
                                    l46Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            ird.q(irdVarJ);
                            throw th2;
                        }
                    }
                    boolean zY = rg2Var.y();
                    ird.q(irdVarJ);
                    z(c89VarC);
                    if (zY) {
                        return rg2Var;
                    }
                } catch (Throwable th3) {
                    z(c89VarC);
                    throw th3;
                }
            }
        }
        return null;
    }

    public final void N(Throwable th, rg2 rg2Var) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof bf2)) {
            synchronized (this.c) {
                b1.e("ComposeInternal", "Error was captured in composition.", th);
                rjb rjbVar = (rjb) this.s.getValue();
                if (rjbVar != null) {
                    throw rjbVar.a;
                }
                s0e s0eVar = this.s;
                rjb rjbVar2 = new rjb(th);
                s0eVar.getClass();
                s0eVar.n(null, rjbVar2);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                b1.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new x79();
                this.k.clear();
                this.l.a();
                this.n.a();
                s0e s0eVar2 = this.s;
                rjb rjbVar3 = new rjb(th);
                s0eVar2.getClass();
                s0eVar2.n(null, rjbVar3);
                if (rg2Var != null) {
                    P(rg2Var);
                }
                if (C() != null) {
                    wf2.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean O() {
        boolean zE;
        synchronized (this.c) {
            if (this.h.c()) {
                return E();
            }
            List listH = H();
            oec oecVar = new oec(this.h);
            this.h = new x79();
            try {
                int size = listH.size();
                for (int i = 0; i < size; i++) {
                    ((rg2) listH.get(i)).z(oecVar);
                    if (((sjb) this.u.getValue()).compareTo(sjb.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (C() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zE = E();
                }
                return zE;
            } catch (Throwable th) {
                synchronized (this.c) {
                    x79 x79Var = this.h;
                    int i2 = x79Var.d;
                    Iterator<E> it = oecVar.iterator();
                    while (it.hasNext()) {
                        x79Var.l(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void P(rg2 rg2Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(rg2Var)) {
            arrayList.add(rg2Var);
        }
        if (this.f.remove(rg2Var)) {
            this.g = null;
        }
    }

    @Override // defpackage.lg2
    public final void a(rg2 rg2Var, l26 l26Var) throws Throwable {
        sjb sjbVar;
        boolean zContains;
        c89 c89VarC;
        boolean z2 = rg2Var.K0.F;
        synchronized (this.c) {
            sjb sjbVar2 = (sjb) this.u.getValue();
            sjbVar = sjb.b;
            zContains = sjbVar2.compareTo(sjbVar) > 0 ? true ^ H().contains(rg2Var) : true;
        }
        try {
            p59 p59Var = new p59(28, rg2Var);
            h6b h6bVar = new h6b(7, rg2Var, (Object) null);
            ird irdVarH = qrd.h();
            c89 c89Var = irdVarH instanceof c89 ? (c89) irdVarH : null;
            if (c89Var == null || (c89VarC = c89Var.C(p59Var, h6bVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                ird irdVarJ = c89VarC.j();
                try {
                    rg2Var.l(l26Var);
                    ird.q(irdVarJ);
                    z(c89VarC);
                    synchronized (this.c) {
                        if (((sjb) this.u.getValue()).compareTo(sjbVar) > 0 && !H().contains(rg2Var)) {
                            this.f.add(rg2Var);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        qrd.h().m();
                    }
                    try {
                        J(rg2Var);
                        try {
                            rg2Var.f();
                            rg2Var.h();
                            if (z2) {
                                return;
                            }
                            qrd.h().m();
                        } catch (Throwable th) {
                            N(th, null);
                        }
                    } catch (Throwable th2) {
                        N(th2, rg2Var);
                    }
                } catch (Throwable th3) {
                    ird.q(irdVarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                z(c89VarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            N(th5, rg2Var);
        }
    }

    @Override // defpackage.lg2
    public final lec b(rg2 rg2Var, cfd cfdVar, l26 l26Var) {
        psd psdVar = this.v;
        try {
            cfd cfdVar2 = rg2Var.E0;
            rg2Var.E0 = cfdVar;
            try {
                a(rg2Var, l26Var);
                x79 x79Var = (x79) psdVar.get();
                if (x79Var == null) {
                    x79Var = mec.a;
                    x79Var.getClass();
                }
                rg2Var.E0 = cfdVar2;
                psdVar.A(null);
                return x79Var;
            } catch (Throwable th) {
                rg2Var.E0 = cfdVar2;
                throw th;
            }
        } catch (Throwable th2) {
            psdVar.A(null);
            throw th2;
        }
    }

    @Override // defpackage.lg2
    public final void c(g49 g49Var) {
        ol1 ol1VarC;
        synchronized (this.c) {
            try {
                w59.a(this.l, g49Var.a, g49Var);
                if (g49Var.h != null) {
                    B(this, g49Var, g49Var);
                }
                ol1VarC = C();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ol1VarC != null) {
            ((pl1) ol1VarC).g(wef.a);
        }
    }

    @Override // defpackage.lg2
    public final boolean e() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // defpackage.lg2
    public final boolean f() {
        return false;
    }

    @Override // defpackage.lg2
    public final boolean g() {
        return false;
    }

    @Override // defpackage.lg2
    public final long h() {
        return 1000L;
    }

    @Override // defpackage.lg2
    public final kg2 i() {
        return null;
    }

    @Override // defpackage.lg2
    public final pv2 k() {
        return this.x;
    }

    @Override // defpackage.lg2
    public final boolean l() {
        return false;
    }

    @Override // defpackage.lg2
    public final void m(g49 g49Var) {
        ol1 ol1VarC;
        synchronized (this.c) {
            this.k.add(g49Var);
            ol1VarC = C();
        }
        if (ol1VarC != null) {
            ((pl1) ol1VarC).g(wef.a);
        }
    }

    @Override // defpackage.lg2
    public final void n(rg2 rg2Var) {
        ol1 ol1VarC;
        synchronized (this.c) {
            if (this.i.h(rg2Var)) {
                ol1VarC = null;
            } else {
                this.i.b(rg2Var);
                ol1VarC = C();
            }
        }
        if (ol1VarC != null) {
            ((pl1) ol1VarC).g(wef.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x008a A[LOOP:0: B:16:0x004a->B:29:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x008d A[EDGE_INSN: B:37:0x008d->B:30:0x008d BREAK  A[LOOP:0: B:16:0x004a->B:29:0x008a], SYNTHETIC] */
    @Override // defpackage.lg2
    public final void o(g49 g49Var, f49 f49Var, ac0 ac0Var) {
        qk9 qk9Var;
        synchronized (this.c) {
            this.n.m(g49Var, f49Var);
            Object objG = this.o.g(g49Var);
            if (objG == null) {
                qk9Var = rk9.b;
                qk9Var.getClass();
            } else if (objG instanceof i79) {
                qk9Var = (qk9) objG;
            } else {
                Object[] objArr = rk9.a;
                i79 i79Var = new i79(1);
                i79Var.h(objG);
                qk9Var = i79Var;
            }
            if (qk9Var.e()) {
                w79 w79VarE = f49Var.a.e(ac0Var, qk9Var);
                Object[] objArr2 = w79VarE.b;
                Object[] objArr3 = w79VarE.c;
                long[] jArr = w79VarE.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj = objArr2[i4];
                                    this.n.m((g49) obj, (f49) objArr3[i4]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.lg2
    public final f49 p(g49 g49Var) {
        f49 f49Var;
        synchronized (this.c) {
            f49Var = (f49) this.n.k(g49Var);
        }
        return f49Var;
    }

    @Override // defpackage.lg2
    public final lec q(rg2 rg2Var, cfd cfdVar, lec lecVar) {
        psd psdVar = this.v;
        try {
            O();
            rg2Var.z(new oec(lecVar));
            cfd cfdVar2 = rg2Var.E0;
            rg2Var.E0 = cfdVar;
            try {
                rg2 rg2VarM = M(rg2Var, null);
                if (rg2VarM != null) {
                    J(rg2Var);
                    rg2VarM.f();
                    rg2VarM.h();
                }
                x79 x79Var = (x79) psdVar.get();
                if (x79Var == null) {
                    x79Var = mec.a;
                    x79Var.getClass();
                }
                rg2Var.E0 = cfdVar2;
                psdVar.A(null);
                return x79Var;
            } catch (Throwable th) {
                rg2Var.E0 = cfdVar2;
                throw th;
            }
        } catch (Throwable th2) {
            psdVar.A(null);
            throw th2;
        }
    }

    @Override // defpackage.lg2
    public final void t(ojb ojbVar) {
        psd psdVar = this.v;
        x79 x79Var = (x79) psdVar.get();
        if (x79Var == null) {
            x79 x79Var2 = mec.a;
            x79Var = new x79();
            psdVar.A(x79Var);
        }
        x79Var.e(ojbVar);
    }

    @Override // defpackage.lg2
    public final void u(rg2 rg2Var) {
        synchronized (this.c) {
            try {
                x79 x79Var = this.q;
                if (x79Var == null) {
                    x79 x79Var2 = mec.a;
                    x79Var = new x79();
                    this.q = x79Var;
                }
                x79Var.e(rg2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lg2
    public final rl1 v(zv6 zv6Var) {
        gg7 gg7Var = this.b;
        a82 a82Var = (a82) gg7Var.c;
        ff9 ff9Var = new ff9();
        ff9Var.a = zv6Var;
        return a82Var.q(ff9Var, (jf6) gg7Var.d);
    }

    @Override // defpackage.lg2
    public final void y(rg2 rg2Var) {
        synchronized (this.c) {
            if (this.f.remove(rg2Var)) {
                this.g = null;
            }
            this.i.j(rg2Var);
            this.j.remove(rg2Var);
        }
    }

    @Override // defpackage.lg2
    public final void r(Set set) {
    }
}
