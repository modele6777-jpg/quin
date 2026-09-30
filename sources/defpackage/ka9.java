package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ka9 {
    public final Context a;
    public final ma9 b;
    public final bs c;
    public final Activity d;
    public boolean e;
    public final yr0 f;
    public final boolean g;

    public ka9(Context context) {
        context.getClass();
        this.a = context;
        this.b = new ma9(this, new vw5(this, 15));
        int i = 2;
        this.c = new bs(context, 2);
        for (Object obj : fyc.u(new d59(5), context)) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
                this.f = new yr0(i, this);
                this.g = true;
                gc9 gc9Var = this.b.s;
                gc9Var.a(new bb9(gc9Var));
                this.b.s.a(new te(this.a));
                new ace(new vw5(this, 16));
            }
        }
        obj = null;
        this.d = (Activity) obj;
        this.f = new yr0(i, this);
        this.g = true;
        gc9 gc9Var2 = this.b.s;
        gc9Var2.a(new bb9(gc9Var2));
        this.b.s.a(new te(this.a));
        new ace(new vw5(this, 16));
    }

    public static void e(ka9 ka9Var, Object obj, pb9 pb9Var, int i) {
        if ((i & 2) != 0) {
            pb9Var = null;
        }
        ka9Var.getClass();
        obj.getClass();
        ka9Var.b.o(obj, pb9Var);
    }

    public static void h(ka9 ka9Var, Object obj, boolean z) {
        ka9Var.getClass();
        obj.getClass();
        ma9 ma9Var = ka9Var.b;
        ma9Var.getClass();
        if (ma9Var.q(ma9Var.f(obj), z, false)) {
            ma9Var.b();
        }
    }

    public final void a(ja9 ja9Var) {
        ja9Var.getClass();
        ma9 ma9Var = this.b;
        ma9Var.getClass();
        ma9Var.p.add(ja9Var);
        ad0 ad0Var = ma9Var.f;
        if (ad0Var.isEmpty()) {
            return;
        }
        da9 da9Var = (da9) ad0Var.last();
        ja9Var.a(ma9Var.a, da9Var.b, da9Var.v.a());
    }

    public final da9 b(String str) {
        Object objPrevious;
        da9 da9Var;
        str.getClass();
        ma9 ma9Var = this.b;
        ma9Var.getClass();
        ad0 ad0Var = ma9Var.f;
        ListIterator listIterator = ad0Var.listIterator(ad0Var.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            da9Var = (da9) objPrevious;
        } while (!da9Var.b.e(str, da9Var.v.a()));
        da9 da9Var2 = (da9) objPrevious;
        if (da9Var2 != null) {
            return da9Var2;
        }
        StringBuilder sbP = tec.p("No destination with route ", str, " is on the NavController's back stack. The current destination is ");
        sbP.append(ma9Var.i());
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    public final da9 c() {
        Object next;
        Iterator it = s72.V0(this.b.f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((el2) fyc.p(it)).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((da9) next).b instanceof ya9)) {
                return (da9) next;
            }
        }
        next = null;
        return (da9) next;
    }

    public final void d(a26 a26Var, Object obj) {
        obj.getClass();
        ma9 ma9Var = this.b;
        ma9Var.getClass();
        ma9Var.o(obj, cn1.I(a26Var));
    }

    public final void f(em7 em7Var, boolean z) {
        em7Var.getClass();
        ma9 ma9Var = this.b;
        ma9Var.getClass();
        int iE = m7c.e(hfc.l(em7Var));
        if (ma9.e(iE, ma9Var.j(), null, true) == null) {
            ho7.x("Destination with route ", em7Var.r(), " cannot be found in navigation graph ", ma9Var.j());
        } else if (ma9Var.p(iE, z, false)) {
            ma9Var.b();
        }
    }

    public final boolean g() {
        ma9 ma9Var = this.b;
        if (ma9Var.f.isEmpty()) {
            return false;
        }
        ua9 ua9VarI = ma9Var.i();
        ua9VarI.getClass();
        return ma9Var.p(ua9VarI.b.b, true, false) && ma9Var.b();
    }

    public final void i(ja9 ja9Var) {
        ja9Var.getClass();
        ma9 ma9Var = this.b;
        ma9Var.getClass();
        ma9Var.p.remove(ja9Var);
    }
}
