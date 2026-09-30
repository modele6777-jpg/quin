package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jn {
    public static final z4 a = new z4(18);
    public static final qh3 b = new qh3(new m8c(10));

    public static final Object a(mo moVar, float f, ho hoVar, hq3 hq3Var, Object obj, vz vzVar, ym ymVar) {
        Object objQ;
        float fE = hq3Var.e(obj);
        jmb jmbVar = new jmb();
        jmbVar.element = Float.isNaN(moVar.j.j()) ? 0.0f : moVar.j.j();
        if (!Float.isNaN(fE)) {
            float f2 = jmbVar.element;
            if (f2 != fE && (objQ = hkg.Q(f2, fE, f, vzVar, new h8(1, hoVar, jmbVar), ymVar)) == bw2.a) {
                return objQ;
            }
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(mo moVar, Object obj, float f, vz vzVar, ph3 ph3Var, zn2 zn2Var) {
        xm xmVar;
        float f2;
        jmb jmbVar;
        if (zn2Var instanceof xm) {
            xmVar = (xm) zn2Var;
            int i = xmVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xmVar.label = i - Integer.MIN_VALUE;
            } else {
                xmVar = new xm(zn2Var);
            }
        } else {
            xmVar = new xm(zn2Var);
        }
        Object obj2 = xmVar.result;
        int i2 = xmVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            jmb jmbVar2 = new jmb();
            jmbVar2.element = f;
            ym ymVar = new ym(moVar, f, vzVar, jmbVar2, ph3Var, null);
            xmVar.L$0 = jmbVar2;
            xmVar.F$0 = f;
            xmVar.label = 1;
            Object objA = moVar.a(obj, s89.a, ymVar, xmVar);
            Object obj3 = bw2.a;
            if (objA == obj3) {
                return obj3;
            }
            f2 = f;
            jmbVar = jmbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = xmVar.F$0;
            jmbVar = (jmb) xmVar.L$0;
            jzb.q(obj2);
        }
        return new Float(f2 - jmbVar.element);
    }

    public static Object c(mo moVar, Object obj, float f, mn mnVar) {
        x6f x6fVar;
        ph3 ph3Var;
        if (moVar.c()) {
            x6fVar = moVar.d;
            if (x6fVar == null) {
                pa7.g0("snapAnimationSpec");
                throw null;
            }
        } else {
            x6fVar = rm.a;
        }
        x6f x6fVar2 = x6fVar;
        if (moVar.c()) {
            ph3Var = moVar.e;
            if (ph3Var == null) {
                pa7.g0("decayAnimationSpec");
                throw null;
            }
        } else {
            ph3Var = rm.c;
        }
        return b(moVar, obj, f, x6fVar2, ph3Var, mnVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[RETURN] */
    public static final Object d(hq3 hq3Var, float f, float f2, a26 a26Var, x16 x16Var) {
        if (Float.isNaN(f)) {
            qc0.j("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(f2) > 0.0f;
        boolean z2 = z && f2 > 0.0f;
        if (!z) {
            Object objA = hq3Var.a(f);
            objA.getClass();
            return objA;
        }
        if (Math.abs(f2) >= Math.abs(((Number) x16Var.invoke()).floatValue())) {
            Object objB = hq3Var.b(f, z2);
            objB.getClass();
            return objB;
        }
        Object objB2 = hq3Var.b(f, false);
        objB2.getClass();
        float fE = hq3Var.e(objB2);
        Object objB3 = hq3Var.b(f, true);
        objB3.getClass();
        float fE2 = hq3Var.e(objB3);
        float fAbs = Math.abs(((Number) a26Var.d(Float.valueOf(Math.abs(fE - fE2)))).floatValue());
        if (!z2) {
            fE = fE2;
        }
        boolean z3 = Math.abs(fE - f) >= fAbs;
        if (z3) {
            if (z2) {
                return objB3;
            }
            return objB2;
        }
        if (z3) {
            ap.c();
            return null;
        }
        if (z2) {
            return objB2;
        }
        return objB3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(x16 x16Var, l26 l26Var, zn2 zn2Var) {
        an anVar;
        if (zn2Var instanceof an) {
            anVar = (an) zn2Var;
            int i = anVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anVar.label = i - Integer.MIN_VALUE;
            } else {
                anVar = new an(zn2Var);
            }
        } else {
            anVar = new an(zn2Var);
        }
        Object obj = anVar.result;
        int i2 = anVar.label;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                in inVar = new in(x16Var, l26Var, null);
                anVar.label = 1;
                Object objO = jgb.O(inVar, anVar);
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
        } catch (qm unused) {
        }
        return wef.a;
    }
}
