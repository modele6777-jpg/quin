package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vsa implements d08 {
    public final int a;
    public final gg7 b;
    public final a26 c;
    public kl2 d;
    public p6e e;
    public o6e f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public usa l;
    public boolean m;
    public long n;
    public long o;
    public long p = a19.a();
    public boolean q;
    public final /* synthetic */ zi0 r;

    public vsa(zi0 zi0Var, int i, gg7 gg7Var, a26 a26Var) {
        this.r = zi0Var;
        this.a = i;
        this.b = gg7Var;
        this.c = a26Var;
    }

    @Override // defpackage.d08
    public final void a() {
        this.m = true;
    }

    public final void b() {
        o6e o6eVar = this.f;
        if (o6eVar != null) {
            o6eVar.cancel();
        }
        this.f = null;
        p6e p6eVar = this.e;
        if (p6eVar != null) {
            p6eVar.a();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(e8e e8eVar) {
        boolean zD;
        if (!this.r.a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(e8eVar);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zD = d(e8eVar);
        }
        bp.Y(-1L, "compose:lazy:prefetch:execute:item");
        return zD;
    }

    @Override // defpackage.d08
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d1  */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final boolean d(e8e e8eVar) {
        ?? r12;
        int i = this.a;
        long j = i;
        bp.Y(j, "compose:lazy:prefetch:execute:item");
        rz7 rz7Var = (rz7) ((qz7) this.r.b).b.invoke();
        if (!this.h) {
            int iA = rz7Var.a();
            if (i >= 0 && i < iA) {
                Object objB = rz7Var.b(i);
                Object obj = this.j;
                if (obj != null && !objB.equals(obj)) {
                    b();
                    return false;
                }
                Object objC = rz7Var.c(i);
                gg7 gg7Var = this.b;
                gr0 gr0Var = (gr0) gg7Var.d;
                if (gg7Var.c != objC || gr0Var == null) {
                    w79 w79Var = (w79) gg7Var.b;
                    Object objG = w79Var.g(objC);
                    Object obj2 = objG;
                    if (objG == null) {
                        gr0 gr0Var2 = new gr0();
                        gr0Var2.e = -1;
                        w79Var.m(objC, gr0Var2);
                        obj2 = gr0Var2;
                    }
                    gr0Var = (gr0) obj2;
                    gg7Var.c = objC;
                    gg7Var.d = gr0Var;
                }
                e();
                long jA = e8eVar.a();
                this.n = jA;
                this.p = a19.a();
                this.o = 0L;
                bp.Y(jA, "compose:lazy:prefetch:available_time_nanos");
                if (!e()) {
                    if (g(this.n, gr0Var.a + gr0Var.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(objB, objC, gr0Var);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.f != null) {
                    if (!g(this.n, gr0Var.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        o6e o6eVar = this.f;
                        if (o6eVar == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.e = o6eVar.apply();
                        this.f = null;
                        this.i = true;
                        Trace.endSection();
                        h();
                        gr0Var.c = gr0.a(this.o, gr0Var.c);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (!this.k) {
                    if (this.n <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        p6e p6eVar = this.e;
                        if (p6eVar == null) {
                            throw ub3.e("Should precompose before resolving nested prefetch states");
                        }
                        mmb mmbVar = new mmb();
                        p6eVar.b(new up(mmbVar, 6));
                        List list = (List) mmbVar.element;
                        this.l = list != null ? new usa(this, list) : null;
                        this.k = true;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                usa usaVar = this.l;
                if (usaVar != null) {
                    int i2 = gr0Var.e;
                    boolean z = this.m;
                    List[] listArr = usaVar.b;
                    int i3 = usaVar.c;
                    List list2 = usaVar.a;
                    if (i3 < list2.size()) {
                        if (usaVar.f.h) {
                            l37.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((e08) list2.get(i4)).d = i2;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (usaVar.c < list2.size()) {
                                try {
                                    if (listArr[usaVar.c] == null) {
                                        if (e8eVar.a() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = usaVar.c;
                                        e08 e08Var = (e08) list2.get(i5);
                                        a26 a26Var = e08Var.a;
                                        c08 c08Var = new c08(e08Var, e08Var.d);
                                        a26Var.d(c08Var);
                                        ArrayList arrayList = c08Var.b;
                                        e08Var.f = arrayList.size();
                                        listArr[i5] = arrayList;
                                    }
                                    List list3 = listArr[usaVar.c];
                                    list3.getClass();
                                    while (usaVar.d < list3.size()) {
                                        vsa vsaVar = (vsa) list3.get(usaVar.d);
                                        if (z) {
                                            vsa vsaVar2 = vsaVar != null ? vsaVar : null;
                                            if (vsaVar2 != null) {
                                                r12 = 1;
                                                vsaVar2.m = true;
                                            } else {
                                                r12 = 1;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        usaVar.e = r12;
                                        if (vsaVar.c(e8eVar)) {
                                            Trace.endSection();
                                            return r12;
                                        }
                                        usaVar.d += r12;
                                    }
                                    usaVar.d = 0;
                                    usaVar.c++;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                usa usaVar2 = this.l;
                if (usaVar2 != null && usaVar2.e) {
                    h();
                    bp.Y(j, "compose:lazy:prefetch:execute:item");
                    usa usaVar3 = this.l;
                    if (usaVar3 != null) {
                        usaVar3.e = false;
                    }
                }
                kl2 kl2Var = this.d;
                if (!this.g && kl2Var != null) {
                    if (!g(this.n, gr0Var.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j2 = kl2Var.a;
                        if (this.h) {
                            l37.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.g) {
                            l37.a("Request was already measured!");
                        }
                        this.g = true;
                        p6e p6eVar2 = this.e;
                        if (p6eVar2 == null) {
                            throw ub3.e("performComposition() must be called before performMeasure()");
                        }
                        int iD = p6eVar2.d();
                        for (int i6 = 0; i6 < iD; i6++) {
                            p6eVar2.e(i6, j2);
                        }
                        Trace.endSection();
                        h();
                        gr0Var.d = gr0.a(this.o, gr0Var.d);
                        a26 a26Var2 = this.c;
                        if (a26Var2 != null) {
                            a26Var2.d(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                usa usaVar4 = this.l;
                if (this.g && this.k && usaVar4 != null) {
                    List list4 = usaVar4.a;
                    int size2 = list4.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < size2; i7++) {
                        iMin = Math.min(iMin, ((e08) list4.get(i7)).e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i8 = gr0Var.e;
                    gr0Var.e = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                    int size3 = list4.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size3; i9++) {
                        iMin2 = Math.min(iMin2, ((e08) list4.get(i9)).f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        gr0Var.d = 0L;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        o6e o6eVar;
        return this.i || ((o6eVar = this.f) != null && o6eVar.w0());
    }

    public final void f(Object obj, Object obj2, gr0 gr0Var) {
        o6e w84Var;
        o6e o6eVar = this.f;
        if (o6eVar == null) {
            zi0 zi0Var = this.r;
            l26 l26VarA = ((qz7) zi0Var.b).a(this.a, obj, obj2);
            gw7 gw7VarA = ((q6e) zi0Var.c).a();
            if (gw7VarA.a.W()) {
                gw7VarA.k(obj, l26VarA, true);
                w84Var = new w84(17, gw7VarA, obj);
            } else {
                w84Var = new fz3(16, gw7VarA, obj);
            }
            o6eVar = w84Var;
            this.f = o6eVar;
            this.j = obj;
        }
        this.q = false;
        while (!o6eVar.w0() && !this.q) {
            o6eVar.y0(new bo1(19, this, gr0Var));
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            gr0Var.b = gr0.a(j, gr0Var.b);
        } else {
            gr0Var.a = gr0.a(j, gr0Var.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        long jA = a19.a();
        long jB = zxe.b(jA, this.p);
        long j = jB >> 1;
        qfc qfcVar = ar4.b;
        if ((((int) jB) & 1) != 0) {
            if (j > 9223372036854L) {
                j = Long.MAX_VALUE;
            } else {
                j = j < -9223372036854L ? Long.MIN_VALUE : j * 1000000;
            }
        }
        this.o = j;
        long j2 = this.n - j;
        this.n = j2;
        this.p = jA;
        bp.Y(j2, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        kl2 kl2Var = this.d;
        boolean zE = e();
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(kl2Var);
        sb.append(", isComposed = ");
        ib8.w(sb, zE, ", isMeasured = ", z, ", isCanceled = ");
        return ub3.m(sb, z2, " }");
    }
}
