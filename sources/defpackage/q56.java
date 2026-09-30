package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q56 extends u56 implements wt8 {
    private final xc5 extensions;

    public q56(p56 p56Var) {
        p56Var.b.f();
        p56Var.c = false;
        this.extensions = p56Var.b;
    }

    public final boolean k() {
        tpd tpdVar = this.extensions.a;
        for (int i = 0; i < tpdVar.b.size(); i++) {
            if (!xc5.e((Map.Entry) tpdVar.b.get(i))) {
                return false;
            }
        }
        Iterator it = tpdVar.d().iterator();
        while (it.hasNext()) {
            if (!xc5.e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int l() {
        tpd tpdVar = this.extensions.a;
        int iD = 0;
        for (int i = 0; i < tpdVar.b.size(); i++) {
            Map.Entry entry = (Map.Entry) tpdVar.b.get(i);
            iD += xc5.d((r56) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : tpdVar.d()) {
            iD += xc5.d((r56) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object m(s56 s56Var) {
        s(s56Var);
        xc5 xc5Var = this.extensions;
        r56 r56Var = s56Var.d;
        Object obj = xc5Var.a.get(r56Var);
        if (obj == null) {
            return s56Var.b;
        }
        if (!r56Var.c) {
            return s56Var.a(obj);
        }
        if (r56Var.b.a() != aag.v) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(s56Var.a(it.next()));
        }
        return arrayList;
    }

    public final Object n(s56 s56Var, int i) {
        s(s56Var);
        xc5 xc5Var = this.extensions;
        r56 r56Var = s56Var.d;
        xc5Var.getClass();
        if (!r56Var.c) {
            qc0.j("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object obj = xc5Var.a.get(r56Var);
        if (obj != null) {
            return s56Var.a(((List) obj).get(i));
        }
        throw new IndexOutOfBoundsException();
    }

    public final int o(s56 s56Var) {
        s(s56Var);
        xc5 xc5Var = this.extensions;
        r56 r56Var = s56Var.d;
        xc5Var.getClass();
        if (!r56Var.c) {
            qc0.j("getRepeatedField() can only be called on repeated fields.");
            return 0;
        }
        Object obj = xc5Var.a.get(r56Var);
        if (obj == null) {
            return 0;
        }
        return ((List) obj).size();
    }

    public final boolean p(s56 s56Var) {
        s(s56Var);
        xc5 xc5Var = this.extensions;
        r56 r56Var = s56Var.d;
        xc5Var.getClass();
        if (!r56Var.c) {
            return xc5Var.a.get(r56Var) != null;
        }
        qc0.j("hasField() can only be called on non-repeated fields.");
        return false;
    }

    public final void q() {
        this.extensions.f();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001b  */
    public final boolean r(g72 g72Var, p90 p90Var, o85 o85Var, int i) {
        boolean z;
        boolean z2;
        Object objF;
        ut8 ut8Var;
        xc5 xc5Var = this.extensions;
        int i2 = i & 7;
        s56 s56Var = (s56) o85Var.a.get(new m85(i >>> 3, a()));
        if (s56Var == null) {
            z2 = true;
            z = false;
        } else {
            r56 r56Var = s56Var.d;
            x9g x9gVar = r56Var.b;
            xc5 xc5Var2 = xc5.c;
            if (i2 == x9gVar.b()) {
                z2 = false;
                z = false;
            } else if (r56Var.c && r56Var.b.c() && i2 == 2) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z2) {
            return g72Var.q(i, p90Var);
        }
        l56 l56VarG = null;
        if (z) {
            int iE = g72Var.e(g72Var.k());
            r56 r56Var2 = s56Var.d;
            if (r56Var2.b != x9g.e) {
                while (g72Var.c() > 0) {
                    xc5Var.a(r56Var2, xc5.h(g72Var, r56Var2.b));
                }
            } else if (g72Var.c() > 0) {
                g72Var.k();
                throw null;
            }
            g72Var.d(iE);
            return true;
        }
        r56 r56Var3 = s56Var.d;
        x9g x9gVar2 = r56Var3.b;
        boolean z3 = r56Var3.c;
        x9g x9gVar3 = r56Var3.b;
        int iOrdinal = x9gVar2.a().ordinal();
        if (iOrdinal == 7) {
            g72Var.k();
            throw null;
        }
        if (iOrdinal != 8) {
            objF = xc5.h(g72Var, x9gVar3);
        } else {
            if (!z3 && (ut8Var = (ut8) xc5Var.a.get(r56Var3)) != null) {
                l56VarG = ut8Var.c();
            }
            if (l56VarG == null) {
                l56VarG = s56Var.c.g();
            }
            if (x9gVar3 == x9g.c) {
                int i3 = r56Var3.a;
                g72Var.b();
                g72Var.i++;
                l56VarG.h(g72Var, o85Var);
                g72Var.a((i3 << 3) | 4);
                g72Var.i--;
            } else {
                int iK = g72Var.k();
                g72Var.b();
                int iE2 = g72Var.e(iK);
                g72Var.i++;
                l56VarG.h(g72Var, o85Var);
                g72Var.a(0);
                g72Var.i--;
                g72Var.d(iE2);
            }
            objF = l56VarG.f();
        }
        if (z3) {
            xc5Var.a(r56Var3, s56Var.b(objF));
            return true;
        }
        xc5Var.i(r56Var3, s56Var.b(objF));
        return true;
    }

    public final void s(s56 s56Var) {
        if (s56Var.a == a()) {
            return;
        }
        qc0.j("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public q56() {
        this.extensions = new xc5();
    }
}
