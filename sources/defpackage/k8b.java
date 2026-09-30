package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k8b {
    public static final wj5 a;

    static {
        hs3 hs3Var = xqa.p0;
        isa isaVar = hs3Var.a;
        Object obj = hs3Var.b;
        ypa.a.getClass();
        j8b j8bVar = new j8b(new dra(ypa.b(), isaVar, obj));
        js3 js3Var = ga4.a;
        a = ym8.x(j8bVar, hr3.c);
    }

    public static final void a(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(1740673008);
        if (!l46Var.W(i & 1, (i & 3) != 2)) {
            l46Var.Z();
        } else if (e((e8b) l46Var.k(l8b.a))) {
            l46Var.f0(-1045453761);
            dd2Var.z(l46Var, 6);
            l46Var.r(false);
        } else {
            l46Var.f0(-1045435502);
            l46Var.r(false);
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var, i, 17);
        }
    }

    public static final void b(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-1061064731);
        if (!l46Var.W(i & 1, (i & 3) != 2)) {
            l46Var.Z();
        } else if (f((e8b) l46Var.k(l8b.a))) {
            l46Var.f0(779996138);
            dd2Var.z(l46Var, 6);
            l46Var.r(false);
        } else {
            l46Var.f0(780014397);
            l46Var.r(false);
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var, i, 16);
        }
    }

    public static final mfc c() {
        hs3 hs3Var = xqa.p0;
        String str = (String) z5c.I(nu4.a, new f8b(hs3Var.a, hs3Var.b, null));
        if (str.length() <= 0) {
            return d();
        }
        try {
            return mfc.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return d();
        }
    }

    public static final mfc d() {
        ca2.a.getClass();
        return ca2.c ? mfc.b : mfc.a;
    }

    public static final boolean e(e8b e8bVar) {
        e8bVar.getClass();
        return e8bVar.C == mfc.a;
    }

    public static final boolean f(e8b e8bVar) {
        e8bVar.getClass();
        return e8bVar.C == mfc.b;
    }

    public static final j09 g(j09 j09Var, n26 n26Var, l46 l46Var, int i) {
        j09Var.getClass();
        if (!e((e8b) l46Var.k(l8b.a))) {
            l46Var.f0(-858293444);
            l46Var.r(false);
            return j09Var;
        }
        l46Var.f0(-837325970);
        j09 j09Var2 = (j09) n26Var.m(j09Var, l46Var, Integer.valueOf(i & 126));
        l46Var.r(false);
        return j09Var2;
    }

    public static final j09 h(j09 j09Var, n26 n26Var, l46 l46Var, int i) {
        j09Var.getClass();
        if (!f((e8b) l46Var.k(l8b.a))) {
            l46Var.f0(1868284989);
            l46Var.r(false);
            return j09Var;
        }
        l46Var.f0(2082225868);
        j09 j09Var2 = (j09) n26Var.m(j09Var, l46Var, Integer.valueOf(i & 126));
        l46Var.r(false);
        return j09Var2;
    }
}
