package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rw4 {
    public static final y6f a = new y6f(xx.Z, xx.E0);
    public static final fxd b = b21.P(0.0f, 400.0f, 5, null);
    public static final fxd c = b21.P(0.0f, 400.0f, 5, null);
    public static final fxd d;
    public static final fxd e;

    static {
        hkb hkbVar = qyf.a;
        d = b21.P(0.0f, 400.0f, 1, new w67(4294967297L));
        e = b21.P(0.0f, 400.0f, 1, new e77(4294967297L));
    }

    public static final void a(n3f n3fVar, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-1186853286);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(n3fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            vz9 vz9Var = n3fVar.e;
            vz9 vz9Var2 = n3fVar.d;
            boolean z = vz9Var.getValue() != null;
            if (pa7.t(n3fVar.a.a(), vz9Var2.getValue()) && !z) {
                x16Var.invoke();
            }
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            Object obj = objR;
            if (objR == i8cVar) {
                boolean[] zArr = {z};
                l46Var.p0(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new Object[1];
                l46Var.p0(objR2);
            }
            Object[] objArr = (Object[]) objR2;
            if (!pa7.t(objArr[0], vz9Var2.getValue())) {
                if (!z && !zArr2[0]) {
                    x16Var.invoke();
                }
                objArr[0] = vz9Var2.getValue();
            }
            zArr2[0] = z;
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zv4(n3fVar, x16Var, i);
        }
    }

    public static cx4 b(fxd fxdVar, jx0 jx0Var, int i) {
        lx0 lx0Var;
        jx0 jx0Var2 = ndb.E0;
        if ((i & 1) != 0) {
            hkb hkbVar = qyf.a;
            fxdVar = b21.P(0.0f, 400.0f, 1, new e77(4294967297L));
        }
        if ((i & 2) != 0) {
            jx0Var = jx0Var2;
        }
        if (pa7.t(jx0Var, ndb.Y)) {
            lx0Var = ndb.e;
        } else {
            lx0Var = pa7.t(jx0Var, jx0Var2) ? ndb.g : ndb.f;
        }
        return c(fxdVar, lx0Var, new iw4());
    }

    public static final cx4 c(ze5 ze5Var, yi yiVar, a26 a26Var) {
        return new cx4(new o3f((x95) null, (ood) null, new vv1(yiVar, a26Var, ze5Var, true), (aec) null, (LinkedHashMap) null, 123));
    }

    public static cx4 d(int i) {
        lx0 lx0Var = ndb.f;
        hkb hkbVar = qyf.a;
        fxd fxdVarP = b21.P(0.0f, 400.0f, 1, new e77(4294967297L));
        if ((i & 2) != 0) {
            lx0Var = ndb.x;
        }
        return c(fxdVarP, lx0Var, xx.H0);
    }

    public static cx4 e(fxd fxdVar, kx0 kx0Var, int i) {
        lx0 lx0Var;
        kx0 kx0Var2 = ndb.X;
        if ((i & 1) != 0) {
            hkb hkbVar = qyf.a;
            fxdVar = b21.P(0.0f, 400.0f, 1, new e77(4294967297L));
        }
        if ((i & 2) != 0) {
            kx0Var = kx0Var2;
        }
        if (pa7.t(kx0Var, ndb.y)) {
            lx0Var = ndb.c;
        } else {
            lx0Var = pa7.t(kx0Var, kx0Var2) ? ndb.w : ndb.f;
        }
        return c(fxdVar, lx0Var, new jw4());
    }

    public static cx4 f(ze5 ze5Var, int i) {
        if ((i & 1) != 0) {
            ze5Var = b21.P(0.0f, 400.0f, 5, null);
        }
        return new cx4(new o3f(new x95(0.0f, ze5Var), (ood) null, (vv1) null, (aec) null, (LinkedHashMap) null, 126));
    }

    public static f45 g(ze5 ze5Var, int i) {
        if ((i & 1) != 0) {
            ze5Var = b21.P(0.0f, 400.0f, 5, null);
        }
        return new f45(new o3f(new x95(0.0f, ze5Var), (ood) null, (vv1) null, (aec) null, (LinkedHashMap) null, 126));
    }

    public static cx4 h(x6f x6fVar) {
        return new cx4(new o3f((x95) null, (ood) null, (vv1) null, new aec(0.92f, r2f.b, x6fVar), (LinkedHashMap) null, 119));
    }

    public static f45 i(fxd fxdVar, jx0 jx0Var, int i) {
        lx0 lx0Var;
        jx0 jx0Var2 = ndb.E0;
        if ((i & 1) != 0) {
            hkb hkbVar = qyf.a;
            fxdVar = b21.P(0.0f, 400.0f, 1, new e77(4294967297L));
        }
        if ((i & 2) != 0) {
            jx0Var = jx0Var2;
        }
        if (pa7.t(jx0Var, ndb.Y)) {
            lx0Var = ndb.e;
        } else {
            lx0Var = pa7.t(jx0Var, jx0Var2) ? ndb.g : ndb.f;
        }
        return j(fxdVar, lx0Var, new kw4());
    }

    public static final f45 j(ze5 ze5Var, yi yiVar, a26 a26Var) {
        return new f45(new o3f((x95) null, (ood) null, new vv1(yiVar, a26Var, ze5Var, true), (aec) null, (LinkedHashMap) null, 123));
    }

    public static f45 k(int i) {
        lx0 lx0Var = ndb.f;
        hkb hkbVar = qyf.a;
        fxd fxdVarP = b21.P(0.0f, 400.0f, 1, new e77(4294967297L));
        if ((i & 2) != 0) {
            lx0Var = ndb.x;
        }
        return j(fxdVarP, lx0Var, xx.K0);
    }

    public static f45 l(fxd fxdVar, kx0 kx0Var, int i) {
        lx0 lx0Var;
        kx0 kx0Var2 = ndb.X;
        if ((i & 1) != 0) {
            hkb hkbVar = qyf.a;
            fxdVar = b21.P(0.0f, 400.0f, 1, new e77(4294967297L));
        }
        if ((i & 2) != 0) {
            kx0Var = kx0Var2;
        }
        if (pa7.t(kx0Var, ndb.y)) {
            lx0Var = ndb.c;
        } else {
            lx0Var = pa7.t(kx0Var, kx0Var2) ? ndb.w : ndb.f;
        }
        return j(fxdVar, lx0Var, new lw4());
    }

    public static final cx4 m(ze5 ze5Var, a26 a26Var) {
        return new cx4(new o3f((x95) null, new ood(ze5Var, new nw4(a26Var)), (vv1) null, (aec) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ cx4 n(int i, a26 a26Var) {
        hkb hkbVar = qyf.a;
        fxd fxdVarP = b21.P(0.0f, 400.0f, 1, new w67(4294967297L));
        if ((i & 2) != 0) {
            a26Var = xx.M0;
        }
        return m(fxdVarP, a26Var);
    }

    public static final f45 o(ze5 ze5Var, a26 a26Var) {
        return new f45(new o3f((x95) null, new ood(ze5Var, new pw4(a26Var)), (vv1) null, (aec) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ f45 p(int i, a26 a26Var) {
        hkb hkbVar = qyf.a;
        fxd fxdVarP = b21.P(0.0f, 400.0f, 1, new w67(4294967297L));
        if ((i & 2) != 0) {
            a26Var = xx.N0;
        }
        return o(fxdVarP, a26Var);
    }
}
