package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qz3 {
    public static final /* synthetic */ int a = 0;

    static {
        t99.e("value");
    }

    public static final boolean a(xrf xrfVar) {
        Boolean boolW = od4.w(t72.H(xrfVar), qk6.y, pz3.a);
        boolW.getClass();
        return boolW.booleanValue();
    }

    public static ea1 b(ea1 ea1Var, a26 a26Var) {
        ea1Var.getClass();
        return (ea1) od4.m(t72.H(ea1Var), new qfc(), new l23(new mmb(), a26Var));
    }

    public static final dx5 c(bm3 bm3Var) {
        ex5 ex5VarF = oz3.f(bm3Var);
        ex5VarF.getClass();
        if (!ex5VarF.d()) {
            ex5VarF = null;
        }
        if (ex5VarF != null) {
            return ex5VarF.i();
        }
        return null;
    }

    public static final u09 d(u00 u00Var) {
        u00Var.getClass();
        y22 y22VarM = u00Var.getType().c0().m();
        if (y22VarM instanceof u09) {
            return (u09) y22VarM;
        }
        return null;
    }

    public static final xr7 e(bm3 bm3Var) {
        bm3Var.getClass();
        w09 w09VarC = oz3.c(bm3Var);
        w09VarC.getClass();
        return w09VarC.f();
    }

    public static final j22 f(y22 y22Var) {
        bm3 bm3VarK;
        j22 j22VarF;
        if (y22Var == null || (bm3VarK = y22Var.k()) == null) {
            return null;
        }
        if (bm3VarK instanceof kw9) {
            dx5 dx5Var = ((lw9) ((kw9) bm3VarK)).f;
            t99 name = y22Var.getName();
            name.getClass();
            return new j22(dx5Var, name);
        }
        if (!(bm3VarK instanceof z22) || (j22VarF = f((y22) bm3VarK)) == null) {
            return null;
        }
        t99 name2 = y22Var.getName();
        name2.getClass();
        return j22VarF.d(name2);
    }

    public static final dx5 g(bm3 bm3Var) {
        bm3Var.getClass();
        dx5 dx5VarG = oz3.g(bm3Var);
        return dx5VarG != null ? dx5VarG : oz3.f(bm3Var.k()).a(bm3Var.getName()).i();
    }

    public static final void h(w09 w09Var) {
        w09Var.getClass();
        if (w09Var.f0(au7.a) == null) {
            return;
        }
        r3.f();
    }

    public static final ea1 i(ea1 ea1Var) {
        ea1Var.getClass();
        return ea1Var instanceof uxa ? ((uxa) ea1Var).w : ea1Var;
    }
}
