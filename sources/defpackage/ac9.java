package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ac9 {
    public final s0e a = t0e.a(bc9.Z);
    public final s0e b;
    public final whb c;
    public final ad0 d;
    public final ad0 e;
    public xb9 f;
    public int g;
    public zb9 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public ac9() {
        s0e s0eVarA = t0e.a(new yb9());
        this.b = s0eVarA;
        this.c = if9.n(s0eVarA);
        this.d = new ad0();
        this.e = new ad0();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(szc szcVar, zb9 zb9Var, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        szcVar.getClass();
        if (zb9Var.a != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(zb9Var);
            szc szcVar2 = zb9Var.a;
            sb.append("' is already added to dispatcher ");
            sb.append(szcVar2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            linkedHashSet = i != 1 ? this.i : this.j;
        } else {
            linkedHashSet = this.k;
        }
        linkedHashSet.add(zb9Var);
        zb9Var.a = szcVar;
        ((yb9) this.c.a.getValue()).getClass();
        if (i != 0) {
            z = i != 1 ? this.n : this.l;
        } else {
            z = this.m;
        }
        zb9Var.b(z);
    }

    public final void b() {
        boolean z;
        boolean z2;
        yb9 yb9Var;
        ad0 ad0Var = this.d;
        if (!ad0Var.isEmpty()) {
            Iterator it = ad0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((xb9) it.next()).b) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        ad0 ad0Var2 = this.e;
        if (!ad0Var2.isEmpty()) {
            Iterator it2 = ad0Var2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                } else if (((xb9) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((zb9) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((zb9) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((zb9) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        xb9 xb9VarC = this.f;
        if (xb9VarC == null) {
            xb9VarC = c(0);
        }
        xb9 xb9VarC2 = this.f;
        if (xb9VarC2 == null) {
            xb9VarC2 = c(0);
        }
        if (pa7.t(xb9VarC2, xb9VarC)) {
            if (xb9VarC2 == null) {
                yb9Var = new yb9();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = ad0Var.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((xb9) it6.next()).b;
                }
                Iterator<E> it7 = ad0Var2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((xb9) it7.next()).b;
                }
                m93 m93Var = xb9VarC2.a;
                c78 c78VarW = t72.w();
                x72.g0(c78VarW, arrayList);
                c78VarW.add(m93Var);
                x72.g0(c78VarW, pu4.a);
                yb9Var = new yb9(c78VarW.n(), arrayList.size());
            }
            s0e s0eVar = this.b;
            if (pa7.t((yb9) s0eVar.getValue(), yb9Var)) {
                return;
            }
            s0eVar.n(null, yb9Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((zb9) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((zb9) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((zb9) it10.next()).getClass();
            }
        }
    }

    public final xb9 c(int i) {
        Object next;
        Object next2;
        ad0 ad0Var = this.e;
        ad0 ad0Var2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = ad0Var2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((xb9) next).b);
            xb9 xb9Var = (xb9) next;
            if (xb9Var != null) {
                return xb9Var;
            }
            for (Object obj2 : ad0Var) {
                if (((xb9) obj2).b) {
                    obj = obj2;
                    break;
                }
            }
            return (xb9) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = ad0Var2.iterator();
            while (it2.hasNext()) {
                ((xb9) it2.next()).getClass();
            }
            Iterator it3 = ad0Var.iterator();
            while (it3.hasNext()) {
                ((xb9) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = ad0Var2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((xb9) next2).b);
        xb9 xb9Var2 = (xb9) next2;
        if (xb9Var2 != null) {
            return xb9Var2;
        }
        for (Object obj3 : ad0Var) {
            if (((xb9) obj3).b) {
                obj = obj3;
                break;
            }
        }
        return (xb9) obj;
    }
}
