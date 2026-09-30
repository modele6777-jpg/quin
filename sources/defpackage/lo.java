package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lo {
    public final lnc a;
    public final x16 b;
    public final hka c;
    public final a26 d;
    public final vz9 g;
    public final qz9 i;
    public final qz9 j;
    public final vz9 k;
    public final vz9 l;
    public final go m;
    public final d97 e = new d97();
    public final ko f = new ko(this);
    public final mx3 h = zrd.b(new sn(this, 0));

    public lo(ued uedVar, lnc lncVar, x16 x16Var, hka hkaVar, a26 a26Var) {
        this.a = lncVar;
        this.b = x16Var;
        this.c = hkaVar;
        this.d = a26Var;
        this.g = q1c.f(uedVar);
        zrd.b(new sn(this, 1));
        this.i = new qz9(Float.NaN);
        new xh0(0);
        new lx3(qrd.h().g());
        this.j = new qz9(0.0f);
        this.k = q1c.f(null);
        this.l = q1c.f(new jl8(qu4.a));
        this.m = new go(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s89 s89Var, io ioVar, zn2 zn2Var) {
        un unVar;
        if (zn2Var instanceof un) {
            unVar = (un) zn2Var;
            int i = unVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unVar.label = i - Integer.MIN_VALUE;
            } else {
                unVar = new un(this, zn2Var);
            }
        } else {
            unVar = new un(this, zn2Var);
        }
        Object obj = unVar.result;
        int i2 = unVar.label;
        qz9 qz9Var = this.i;
        a26 a26Var = this.d;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                d97 d97Var = this.e;
                xn xnVar = new xn(this, null, ioVar);
                unVar.label = 1;
                d97Var.getClass();
                Object objO = jgb.O(new c97(s89Var, d97Var, xnVar, null), unVar);
                bw2 bw2Var = bw2.a;
                if (objO == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            Object objA = d().a(qz9Var.j());
            if (objA != null && Math.abs(qz9Var.j() - d().d(objA)) <= 0.5f && ((Boolean) a26Var.d(objA)).booleanValue()) {
                g(objA);
            }
            return wef.a;
        } catch (Throwable th) {
            Object objA2 = d().a(qz9Var.j());
            if (objA2 != null && Math.abs(qz9Var.j() - d().d(objA2)) <= 0.5f && ((Boolean) a26Var.d(objA2)).booleanValue()) {
                g(objA2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, s89 s89Var, o26 o26Var, xn2 xn2Var) {
        zn znVar;
        if (xn2Var instanceof zn) {
            znVar = (zn) xn2Var;
            int i = znVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                znVar.label = i - Integer.MIN_VALUE;
            } else {
                znVar = new zn(this, xn2Var);
            }
        } else {
            znVar = new zn(this, xn2Var);
        }
        Object obj2 = znVar.result;
        int i2 = znVar.label;
        qz9 qz9Var = this.i;
        a26 a26Var = this.d;
        try {
            if (i2 == 0) {
                jzb.q(obj2);
                if (d().a.containsKey(obj)) {
                    d97 d97Var = this.e;
                    eo eoVar = new eo(this, obj, o26Var, null);
                    znVar.label = 1;
                    d97Var.getClass();
                    Object objO = jgb.O(new c97(s89Var, d97Var, eoVar, null), znVar);
                    bw2 bw2Var = bw2.a;
                    if (objO == bw2Var) {
                        return bw2Var;
                    }
                } else {
                    g(obj);
                }
                return wef.a;
            }
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
            h(null);
            Object objA = d().a(qz9Var.j());
            if (objA != null && Math.abs(qz9Var.j() - d().d(objA)) <= 0.5f && ((Boolean) a26Var.d(objA)).booleanValue()) {
                g(objA);
            }
            return wef.a;
        } catch (Throwable th) {
            h(null);
            Object objA2 = d().a(qz9Var.j());
            if (objA2 != null && Math.abs(qz9Var.j() - d().d(objA2)) <= 0.5f && ((Boolean) a26Var.d(objA2)).booleanValue()) {
                g(objA2);
            }
            throw th;
        }
    }

    public final Object c(float f, float f2, Object obj) {
        jl8 jl8VarD = d();
        float fD = jl8VarD.d(obj);
        float fFloatValue = ((Number) this.b.invoke()).floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            lnc lncVar = this.a;
            if (fD < f) {
                if (f2 >= fFloatValue) {
                    Object objB = jl8VarD.b(f, true);
                    objB.getClass();
                    return objB;
                }
                Object objB2 = jl8VarD.b(f, true);
                objB2.getClass();
                if (f >= Math.abs(Math.abs(((Number) lncVar.d(Float.valueOf(Math.abs(jl8VarD.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objB3 = jl8VarD.b(f, false);
                    objB3.getClass();
                    return objB3;
                }
                Object objB4 = jl8VarD.b(f, false);
                objB4.getClass();
                float fAbs = Math.abs(fD - Math.abs(((Number) lncVar.d(Float.valueOf(Math.abs(fD - jl8VarD.d(objB4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public final jl8 d() {
        return (jl8) this.l.getValue();
    }

    public final float e(float f) {
        qz9 qz9Var = this.i;
        float fJ = (Float.isNaN(qz9Var.j()) ? 0.0f : qz9Var.j()) + f;
        float fC = d().c();
        Float fJ0 = s72.J0(d().a.values());
        return mh3.n(fJ, fC, fJ0 != null ? fJ0.floatValue() : Float.NaN);
    }

    public final float f() {
        qz9 qz9Var = this.i;
        if (!Float.isNaN(qz9Var.j())) {
            return qz9Var.j();
        }
        qc0.p("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void g(Object obj) {
        this.g.setValue(obj);
    }

    public final void h(Object obj) {
        this.k.setValue(obj);
    }
}
