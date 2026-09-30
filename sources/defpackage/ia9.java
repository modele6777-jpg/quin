package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ia9 {
    public final uzd a;
    public final s0e b;
    public final s0e c;
    public boolean d;
    public final whb e;
    public final whb f;
    public final fc9 g;
    public final /* synthetic */ ka9 h;

    public ia9(ka9 ka9Var, fc9 fc9Var) {
        fc9Var.getClass();
        this.h = ka9Var;
        this.a = new uzd(2);
        s0e s0eVarA = t0e.a(pu4.a);
        this.b = s0eVarA;
        s0e s0eVarA2 = t0e.a(xu4.a);
        this.c = s0eVarA2;
        this.e = if9.n(s0eVarA);
        this.f = if9.n(s0eVarA2);
        this.g = fc9Var;
    }

    public final void a(da9 da9Var) {
        da9Var.getClass();
        synchronized (this.a) {
            s0e s0eVar = this.b;
            s0eVar.n(null, s72.R0((Collection) s0eVar.getValue(), da9Var));
        }
    }

    public final da9 b(ua9 ua9Var, Bundle bundle) {
        ma9 ma9Var = this.h.b;
        ma9Var.getClass();
        return y25.f(ma9Var.a.c, ua9Var, bundle, ma9Var.k(), ma9Var.o);
    }

    public final void c(da9 da9Var) {
        na9 na9Var;
        owf owfVar;
        da9Var.getClass();
        ma9 ma9Var = this.h.b;
        s0e s0eVar = ma9Var.h;
        String str = da9Var.f;
        LinkedHashMap linkedHashMap = ma9Var.w;
        boolean zT = pa7.t(linkedHashMap.get(da9Var), Boolean.TRUE);
        s0e s0eVar2 = this.c;
        s0eVar2.n(null, n3d.k((Set) s0eVar2.getValue(), da9Var));
        linkedHashMap.remove(da9Var);
        ad0 ad0Var = ma9Var.f;
        if (ad0Var.contains(da9Var)) {
            if (this.d) {
                return;
            }
            ma9Var.w();
            s0e s0eVar3 = ma9Var.g;
            ArrayList arrayList = new ArrayList(ad0Var);
            s0eVar3.getClass();
            s0eVar3.n(null, arrayList);
            ArrayList arrayListT = ma9Var.t();
            s0eVar.getClass();
            s0eVar.n(null, arrayListT);
            return;
        }
        ma9Var.v(da9Var);
        if (da9Var.v.j.i.compareTo(g48.c) >= 0) {
            da9Var.d(g48.a);
        }
        if (!ad0Var.isEmpty()) {
            Iterator it = ad0Var.iterator();
            while (it.hasNext()) {
                if (((da9) it.next()).f.equals(str)) {
                }
            }
            if (!zT) {
                owfVar.a();
            }
        } else if (!zT && (na9Var = ma9Var.o) != null && (owfVar = (owf) na9Var.b.remove(str)) != null) {
            owfVar.a();
        }
        ma9Var.w();
        ArrayList arrayListT2 = ma9Var.t();
        s0eVar.getClass();
        s0eVar.n(null, arrayListT2);
    }

    public final void d(da9 da9Var, boolean z) {
        da9Var.getClass();
        ma9 ma9Var = this.h.b;
        jf6 jf6Var = new jf6(this, da9Var, z);
        ma9Var.getClass();
        fc9 fc9VarB = ma9Var.s.b(da9Var.b.a);
        ma9Var.w.put(da9Var, Boolean.valueOf(z));
        if (!fc9VarB.equals(this.g)) {
            Object obj = ma9Var.t.get(fc9VarB);
            obj.getClass();
            ((ia9) obj).d(da9Var, z);
            return;
        }
        fl0 fl0Var = ma9Var.v;
        if (fl0Var != null) {
            fl0Var.d(da9Var);
            jf6Var.invoke();
            return;
        }
        ad0 ad0Var = ma9Var.f;
        int iIndexOf = ad0Var.indexOf(da9Var);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + da9Var + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != ad0Var.c) {
            ma9Var.p(((da9) ad0Var.get(i)).b.b.b, true, false);
        }
        ma9.s(ma9Var, da9Var);
        jf6Var.invoke();
        ma9Var.b.invoke();
        ma9Var.b();
    }

    public final void e(da9 da9Var, boolean z) {
        Object objPrevious;
        da9Var.getClass();
        q0e q0eVar = this.e.a;
        s0e s0eVar = this.c;
        Iterable iterable = (Iterable) s0eVar.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((da9) it.next()) == da9Var) {
                    Iterable iterable2 = (Iterable) q0eVar.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((da9) it2.next()) == da9Var) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        s0eVar.n(null, n3d.n((Set) s0eVar.getValue(), da9Var));
        List list = (List) q0eVar.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            da9 da9Var2 = (da9) objPrevious;
            if (!pa7.t(da9Var2, da9Var) && ((List) q0eVar.getValue()).lastIndexOf(da9Var2) < ((List) q0eVar.getValue()).lastIndexOf(da9Var)) {
                break;
            }
        }
        da9 da9Var3 = (da9) objPrevious;
        if (da9Var3 != null) {
            s0eVar.n(null, n3d.n((Set) s0eVar.getValue(), da9Var3));
        }
        d(da9Var, z);
    }

    public final void f(da9 da9Var) {
        da9Var.getClass();
        ma9 ma9Var = this.h.b;
        ma9Var.getClass();
        fc9 fc9VarB = ma9Var.s.b(da9Var.b.a);
        if (!fc9VarB.equals(this.g)) {
            Object obj = ma9Var.t.get(fc9VarB);
            if (obj != null) {
                ((ia9) obj).f(da9Var);
                return;
            } else {
                ho7.j(ks0.l(new StringBuilder("NavigatorBackStack for "), da9Var.b.a, " should already be created"));
                return;
            }
        }
        a26 a26Var = ma9Var.u;
        if (a26Var != null) {
            a26Var.d(da9Var);
            a(da9Var);
        } else {
            Log.i("NavController", "Ignoring add of destination " + da9Var.b + " outside of the call to navigate(). ");
        }
    }
}
