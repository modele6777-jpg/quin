package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ekf {
    public final hh1 a;
    public final if1 b;
    public final k47 c;
    public final ceg d;
    public final dj8 e;
    public final aj1 f;
    public final h1b g;
    public final h1b h;
    public final uk1 i;
    public final ag1 j;
    public final Object k;
    public final LinkedHashSet l;
    public final LinkedHashSet m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final LinkedHashSet q;
    public final jv8 r;
    public final t9e s;
    public final egh t;
    public final trd u;
    public volatile p23 v;
    public final ArrayList w;
    public final Set x;

    public ekf(hh1 hh1Var, if1 if1Var, k47 k47Var, ceg cegVar, dj8 dj8Var, Set set, wb1 wb1Var, aj1 aj1Var, vd9 vd9Var, h1b h1bVar, h1b h1bVar2, hv4 hv4Var, gh1 gh1Var, uk1 uk1Var, ag1 ag1Var, Context context, ja4 ja4Var) {
        if1Var.getClass();
        cegVar.getClass();
        dj8Var.getClass();
        set.getClass();
        wb1Var.getClass();
        aj1Var.getClass();
        vd9Var.getClass();
        h1bVar.getClass();
        h1bVar2.getClass();
        hv4Var.getClass();
        gh1Var.getClass();
        ag1Var.getClass();
        this.a = hh1Var;
        this.b = if1Var;
        this.c = k47Var;
        this.d = cegVar;
        this.e = dj8Var;
        this.f = aj1Var;
        this.g = vd9Var;
        this.h = h1bVar2;
        this.i = uk1Var;
        this.j = ag1Var;
        this.k = new Object();
        this.l = new LinkedHashSet();
        this.m = new LinkedHashSet();
        this.o = true;
        this.p = true;
        this.q = new LinkedHashSet();
        this.r = new jv8(gh1Var, new iv8(), ja4Var);
        yg1 yg1Var = gh1Var.b;
        this.s = new t9e(context, yg1Var, hv4Var, bb5.B);
        this.t = new egh(yg1Var);
        this.u = new trd(26, this);
        this.w = new ArrayList();
        Set setN1 = s72.n1(set);
        setN1.add(wb1Var);
        this.x = setN1;
    }

    public final void a(oif oifVar) {
        oifVar.getClass();
        synchronized (this.k) {
            if (this.m.add(oifVar)) {
                l();
            }
        }
    }

    public final boolean b(LinkedHashSet linkedHashSet) {
        if (((Boolean) this.i.a.a(uk1.z, Boolean.TRUE)).booleanValue() && !this.l.contains(this.r) && j(linkedHashSet)) {
            c();
            return true;
        }
        if (!linkedHashSet.contains(this.r) || j(linkedHashSet)) {
            return false;
        }
        jv8 jv8Var = this.r;
        jv8Var.getClass();
        synchronized (this.k) {
            if (this.m.remove(jv8Var)) {
                l();
            }
        }
        g(t72.H(jv8Var));
        jv8Var.B((pg1) this.g.get());
        return true;
    }

    public final void c() {
        pg1 pg1Var = (pg1) this.g.get();
        jv8 jv8Var = this.r;
        jv8Var.b(pg1Var, null, null, null);
        jv8Var.D(hq0.a(lv8.a).c(), null);
        d(t72.H(jv8Var));
        a(jv8Var);
    }

    public final void d(List list) {
        synchronized (this.k) {
            if (list.isEmpty()) {
                if (b21.F(5, "CXCP")) {
                    b1.l("CXCP", "Attach [] from " + this + " (Ignored)");
                }
                return;
            }
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "Attaching " + list + " from " + this);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!this.l.contains((oif) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((oif) it.next()).v();
            }
            if (this.l.addAll(list) && !b(s72.A0(this.l, this.m))) {
                n();
                this.e.a(s72.j1(this.l));
                k(this.l);
            }
            if (this.o) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((oif) it2.next()).t();
                }
            } else {
                this.q.addAll(arrayList);
            }
        }
    }

    public final Object e(gbe gbeVar) {
        List listJ1;
        synchronized (this.k) {
            f();
            this.r.z();
            listJ1 = s72.j1(this.w);
        }
        Object objX = pa7.X(listJ1, gbeVar);
        return objX == bw2.a ? objX : wef.a;
    }

    public final void f() {
        dg7 dg7VarB;
        pif pifVarH = h();
        this.v = null;
        if1 if1Var = this.b;
        kg1 kg1Var = (kg1) this.h.get();
        if1Var.getClass();
        kg1Var.getClass();
        synchronized (if1Var.b) {
            try {
                if (if1Var.f) {
                    ArrayList arrayList = if1Var.d;
                    yg1 yg1Var = (yg1) eb3.X(kg1Var, job.a.b(yg1.class));
                    String str = yg1Var != null ? ((nc1) yg1Var).a : null;
                    ig1 ig1Var = str != null ? new ig1(str) : null;
                    if (ig1Var == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.remove(ig1Var.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pifVarH != null) {
            xif xifVar = (xif) pifVarH;
            if (xifVar.h.a()) {
                xifVar.c.close();
                dg7VarB = ynb.V(xifVar.b.f, null, null, new uif(null, xifVar), 3);
            } else {
                dg7VarB = y7h.b(wef.a);
            }
            this.w.add(dg7VarB);
            dg7VarB.E(new i2e(27, this, dg7VarB));
        }
        synchronized (this.k) {
        }
    }

    public final void g(List list) {
        synchronized (this.k) {
            if (list.isEmpty()) {
                if (b21.F(5, "CXCP")) {
                    b1.l("CXCP", "Detaching [] from " + this + " (Ignored)");
                }
                return;
            }
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "Detaching " + list + " from " + this);
            }
            this.m.removeAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                oif oifVar = (oif) it.next();
                if (this.l.contains(oifVar)) {
                    oifVar.w();
                }
            }
            if (this.l.removeAll(list)) {
                if (b(s72.A0(this.l, this.m))) {
                    return;
                }
                if (this.l.isEmpty()) {
                    this.d.f(false);
                    this.e.a(pu4.a);
                } else {
                    n();
                    this.e.a(s72.j1(this.l));
                }
                k(this.l);
            }
            this.q.removeAll(list);
        }
    }

    public final pif h() {
        p23 p23Var = this.v;
        if (p23Var != null) {
            return (pif) p23Var.m.get();
        }
        return null;
    }

    public final int i() {
        int i;
        synchronized (this.k) {
            if1 if1Var = this.b;
            synchronized (if1Var.b) {
                i = if1Var.e;
            }
            return i == 2 ? 1 : 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v2 */
    public final boolean j(LinkedHashSet linkedHashSet) {
        boolean z;
        t9e t9eVar;
        boolean z2;
        ?? r21;
        int i;
        boolean zA;
        xjf xjfVar;
        ?? r0;
        List listH;
        if (((Boolean) this.i.a.a(uk1.z, Boolean.TRUE)).booleanValue() && !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                oif oifVar = (oif) it.next();
                jv8 jv8Var = this.r;
                if (!pa7.t(oifVar, jv8Var)) {
                    List listB = oifVar.p.b();
                    listB.getClass();
                    if (!listB.isEmpty()) {
                        ArrayList<oif> arrayList = new ArrayList();
                        for (Object obj : this.l) {
                            if (!pa7.t((oif) obj, jv8Var)) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                            yzc yzcVar = new yzc();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                yzcVar.a(((oif) it2.next()).p);
                            }
                            zzc zzcVarB = yzcVar.b();
                            List listUnmodifiableList = Collections.unmodifiableList(zzcVarB.g.a);
                            listUnmodifiableList.getClass();
                            List listB2 = zzcVarB.b();
                            listB2.getClass();
                            if (!listB2.isEmpty()) {
                                if (listB2.isEmpty()) {
                                    z = true;
                                    break;
                                }
                                Iterator it3 = listB2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z = true;
                                        break;
                                    }
                                    if (!pa7.t(((lu3) it3.next()).j, MediaCodec.class)) {
                                        z = false;
                                        break;
                                    }
                                }
                                boolean zIsEmpty = listUnmodifiableList.isEmpty();
                                if (!z && !zIsEmpty) {
                                    break;
                                }
                                if (jv8Var.c() == null) {
                                    jv8Var.D(hq0.a(lv8.a).c(), null);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it4 = arrayList.iterator();
                                while (true) {
                                    boolean zHasNext = it4.hasNext();
                                    t9eVar = this.s;
                                    if (!zHasNext) {
                                        z2 = true;
                                        r21 = 0;
                                        break;
                                    }
                                    oif oifVar2 = (oif) it4.next();
                                    Size sizeC = oifVar2.c();
                                    hq0 hq0Var = oifVar2.j;
                                    if (sizeC == null || hq0Var == null) {
                                        z2 = true;
                                        r21 = 0;
                                        if (b21.F(5, "CXCP")) {
                                            b1.l("CXCP", "Invalid surface resolution or stream spec is found.");
                                        }
                                        arrayList2.clear();
                                        break;
                                    }
                                    z9e z9eVarP = t9eVar.p(i(), oifVar2.i.l(), sizeC, oifVar2.i.r());
                                    int iL = oifVar2.i.l();
                                    qr4 qr4Var = hq0Var.c;
                                    if (oifVar2 instanceof k3e) {
                                        xjf xjfVar2 = ((k3e) oifVar2).i;
                                        xjfVar2.getClass();
                                        listH = (List) ((l3e) xjfVar2).c(l3e.b);
                                        listH.getClass();
                                    } else {
                                        listH = t72.H(oifVar2.i.s());
                                    }
                                    List list = listH;
                                    qh2 qh2VarJ = hq0Var.f;
                                    if (qh2VarJ == null) {
                                        qh2VarJ = k79.j();
                                    }
                                    qh2 qh2Var = qh2VarJ;
                                    int i2 = hq0Var.d;
                                    Range range = hq0Var.e;
                                    Boolean bool = (Boolean) oifVar2.i.a(xjf.l0, Boolean.FALSE);
                                    Objects.requireNonNull(bool);
                                    arrayList2.add(new eo0(z9eVarP, iL, sizeC, qr4Var, list, qh2Var, i2, range, bool.booleanValue(), oifVar2.i.v(sizeC)));
                                }
                                if (arrayList2.isEmpty()) {
                                    r0 = r21;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (oif oifVar3 : arrayList) {
                                        List<lu3> listB3 = oifVar3.p.b();
                                        listB3.getClass();
                                        for (lu3 lu3Var : listB3) {
                                            int i3 = i();
                                            int iL2 = oifVar3.i.l();
                                            Size size = lu3Var.h;
                                            size.getClass();
                                            arrayList3.add(t9eVar.p(i3, iL2, size, oifVar3.i.r()));
                                        }
                                    }
                                    int i4 = i();
                                    Iterator it5 = this.t.j(arrayList2, t72.H(jv8Var.i), t72.H(Integer.valueOf((int) r21))).entrySet().iterator();
                                    do {
                                        if (!it5.hasNext()) {
                                            i = 8;
                                            break;
                                        }
                                        i = 10;
                                    } while (((qr4) ((Map.Entry) it5.next()).getValue()).b != 10);
                                    int i5 = i;
                                    boolean zD = tgc.d(arrayList);
                                    vuf vufVarI = tgc.i(arrayList, new k8f(13));
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj2 : arrayList) {
                                        if (obj2 instanceof hv6) {
                                            arrayList4.add(obj2);
                                        }
                                    }
                                    hv6 hv6Var = (hv6) s72.x0(arrayList4);
                                    ?? r27 = (hv6Var == null || (xjfVar = hv6Var.i) == null || xjfVar.l() != 4101) ? r21 : z2;
                                    Range range2 = hq0.h;
                                    range2.getClass();
                                    s9e s9eVar = new s9e(i4, i5, zD, vufVarI, r27, false, false, false, range2, false);
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList3);
                                    int i6 = i();
                                    int iL3 = jv8Var.i.l();
                                    Size sizeC2 = jv8Var.c();
                                    sizeC2.getClass();
                                    arrayList5.add(t9eVar.p(i6, iL3, sizeC2, jv8Var.i.r()));
                                    pu4 pu4Var = pu4.a;
                                    zA = this.s.a(s9eVar, arrayList5, qu4.a, pu4Var, pu4Var);
                                    r0 = zA;
                                    if (b21.F(3, "CXCP")) {
                                        Log.d("CXCP", "Combination of " + arrayList3 + " + " + jv8Var + " is supported: " + zA);
                                    }
                                }
                                if (r0 != 0) {
                                    r0 = zA;
                                    return z2;
                                }
                                r0 = zA;
                                return r21;
                            }
                            break;
                        }
                        break;
                        break;
                    }
                }
            }
        }
        return false;
    }

    public final void k(LinkedHashSet linkedHashSet) {
        f();
        List listJ1 = s72.j1(linkedHashSet);
        if (listJ1.isEmpty()) {
            for (sif sifVar : this.x) {
                sifVar.b(null);
                sifVar.reset();
            }
            return;
        }
        if (!this.o) {
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                ((sif) it.next()).b(null);
            }
        }
        fe6 fe6Var = new fe6(this.f);
        synchronized (this.k) {
        }
        c0d c0dVar = new c0d(listJ1, this.p);
        ag1 ag1Var = this.j;
        trd trdVar = this.u;
        synchronized (this.k) {
        }
        ag1Var.getClass();
        trdVar.getClass();
        rif rifVar = new rif(trdVar, fe6Var, c0dVar, new ace(new smc(c0dVar, ag1Var, fe6Var, 7)));
        if (!this.o) {
            if1 if1Var = this.b;
            kg1 kg1Var = (kg1) this.h.get();
            if1Var.getClass();
            kg1Var.getClass();
            synchronized (if1Var.b) {
                try {
                    if (if1Var.f) {
                        ArrayList arrayList = if1Var.d;
                        yg1 yg1Var = (yg1) eb3.X(kg1Var, job.a.b(yg1.class));
                        String str = yg1Var != null ? ((nc1) yg1Var).a : null;
                        ig1 ig1Var = str != null ? new ig1(str) : null;
                        if (ig1Var == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        arrayList.add(ig1Var.a);
                        synchronized (if1Var.b) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        k47 k47Var = this.c;
        this.v = new p23((n23) k47Var.b, (o23) k47Var.c, rifVar);
        pif pifVarH = h();
        if (pifVarH == null) {
            qc0.p("Required value was null.");
            return;
        }
        xif xifVar = (xif) pifVarH;
        ynb.V(xifVar.b.f, null, null, new wif(null, xifVar), 3);
        Iterator it2 = this.x.iterator();
        while (it2.hasNext()) {
            ((sif) it2.next()).b(xifVar.c);
        }
        ynb.V(xifVar.b.f, null, null, new vif(null, xifVar, this.n), 3);
        m(s72.A0(this.l, this.m));
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "Notifying " + this.q + " camera control ready");
        }
        Iterator it3 = this.q.iterator();
        while (it3.hasNext()) {
            ((oif) it3.next()).t();
        }
        this.q.clear();
    }

    public final void l() {
        if (this.l.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSetA0 = s72.A0(this.l, this.m);
        if (((Boolean) this.i.a.a(uk1.z, Boolean.TRUE)).booleanValue() && !this.l.contains(this.r) && j(linkedHashSetA0)) {
            c();
            return;
        }
        if (!linkedHashSetA0.contains(this.r) || j(linkedHashSetA0)) {
            m(linkedHashSetA0);
            return;
        }
        jv8 jv8Var = this.r;
        jv8Var.getClass();
        synchronized (this.k) {
            if (this.m.remove(jv8Var)) {
                l();
            }
        }
        g(t72.H(jv8Var));
        jv8Var.B((pg1) this.g.get());
    }

    public final void m(LinkedHashSet linkedHashSet) {
        pif pifVarH = h();
        if (pifVarH != null) {
            ((xif) pifVarH).c.c(linkedHashSet, this.p);
            for (sif sifVar : this.x) {
                if (sifVar instanceof dkf) {
                    ((dkf) sifVar).a(linkedHashSet);
                }
            }
        }
    }

    public final void n() {
        boolean z = false;
        LinkedHashSet linkedHashSet = this.l;
        if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (((Boolean) ((oif) it.next()).i.a(xjf.n0, Boolean.FALSE)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        this.d.f(z);
    }

    public final String toString() {
        return "UseCaseManager<" + this.j + '>';
    }
}
