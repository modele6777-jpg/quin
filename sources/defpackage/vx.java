package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vx {
    public static final fxd a = b21.P(0.0f, 0.0f, 7, null);
    public static final fxd b;

    static {
        hkb hkbVar = qyf.a;
        b = b21.P(0.0f, 0.0f, 3, new yi4(0.4f));
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final h0e a(float f, ze5 ze5Var, String str, l46 l46Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            ze5Var = b;
        }
        ze5 ze5Var2 = ze5Var;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        return c(new yi4(f), xo1.i, ze5Var2, null, str, null, l46Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }

    public static final h0e b(float f, vz vzVar, String str, a26 a26Var, l46 l46Var, int i, int i2) {
        int i3 = i2 & 2;
        fxd fxdVar = a;
        vz vzVar2 = i3 != 0 ? fxdVar : vzVar;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        a26 a26Var2 = (i2 & 16) != 0 ? null : a26Var;
        if (vzVar2 == fxdVar) {
            l46Var.f0(1144115775);
            boolean z = (((i & 896) ^ 384) > 256 && l46Var.d(0.01f)) || (i & 384) == 256;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = b21.P(0.0f, 0.0f, 3, Float.valueOf(0.01f));
                l46Var.p0(objR);
            }
            vzVar2 = (fxd) objR;
            l46Var.r(false);
        } else {
            l46Var.f0(1144225701);
            l46Var.r(false);
        }
        int i4 = i << 3;
        return c(Float.valueOf(f), xo1.g, vzVar2, null, str2, a26Var2, l46Var, (i4 & 458752) | (i & 14) | (57344 & i4), 0);
    }

    public static final h0e c(Object obj, y6f y6fVar, vz vzVar, Float f, String str, a26 a26Var, l46 l46Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objR = l46Var.R();
        Object obj2 = sf2.a;
        if (objR == obj2) {
            objR = q1c.f(null);
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        Object objR2 = l46Var.R();
        if (objR2 == obj2) {
            objR2 = new jx(obj, y6fVar, f);
            l46Var.p0(objR2);
        }
        jx jxVar = (jx) objR2;
        e89 e89VarI = q1c.i(a26Var, l46Var);
        if (f != null && (vzVar instanceof fxd)) {
            fxd fxdVar = (fxd) vzVar;
            if (!pa7.t(fxdVar.c, f)) {
                vzVar = new fxd(fxdVar.a, fxdVar.b, f);
            }
        }
        e89 e89VarI2 = q1c.i(vzVar, l46Var);
        Object objR3 = l46Var.R();
        if (objR3 == obj2) {
            objR3 = urg.a(-1, null, null, 6);
            l46Var.p0(objR3);
        }
        yv1 yv1Var = (yv1) objR3;
        boolean zI = l46Var.i(yv1Var) | ((((i & 14) ^ 6) > 4 && l46Var.i(obj)) || (i & 6) == 4);
        Object objR4 = l46Var.R();
        if (zI || objR4 == obj2) {
            objR4 = new v6(7, yv1Var, obj);
            l46Var.p0(objR4);
        }
        af1.u((x16) objR4, l46Var);
        boolean zI2 = l46Var.i(yv1Var) | l46Var.i(jxVar) | l46Var.g(e89VarI2) | l46Var.g(e89VarI);
        Object objR5 = l46Var.R();
        if (zI2 || objR5 == obj2) {
            Object uxVar = new ux(yv1Var, jxVar, e89VarI2, e89VarI, null);
            l46Var.p0(uxVar);
            objR5 = uxVar;
        }
        af1.o((l26) objR5, l46Var, yv1Var);
        h0e h0eVar = (h0e) e89Var.getValue();
        return h0eVar == null ? jxVar.c : h0eVar;
    }
}
