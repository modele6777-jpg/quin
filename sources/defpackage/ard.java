package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ard implements gj5 {
    public final erd a;
    public final ph3 b;
    public final vz c;
    public final k94 d = ohc.b;

    public ard(erd erdVar, ph3 ph3Var, vz vzVar) {
        this.a = erdVar;
        this.b = ph3Var;
        this.c = vzVar;
    }

    @Override // defpackage.gj5
    public Object a(fhc fhcVar, float f, xn2 xn2Var) {
        return c(fhcVar, f, rxg.x, (zn2) xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fhc fhcVar, float f, a26 a26Var, zn2 zn2Var) {
        vqd vqdVar;
        a26 a26Var2;
        if (zn2Var instanceof vqd) {
            vqdVar = (vqd) zn2Var;
            int i = vqdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vqdVar.label = i - Integer.MIN_VALUE;
            } else {
                vqdVar = new vqd(this, zn2Var);
            }
        } else {
            vqdVar = new vqd(this, zn2Var);
        }
        Object objP0 = vqdVar.result;
        int i2 = vqdVar.label;
        if (i2 == 0) {
            jzb.q(objP0);
            xqd xqdVar = new xqd(this, f, a26Var, fhcVar, null);
            vqdVar.L$0 = a26Var;
            vqdVar.label = 1;
            objP0 = ynb.p0(this.d, xqdVar, vqdVar);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
            a26Var2 = a26Var;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a26Var2 = (a26) vqdVar.L$0;
            jzb.q(objP0);
        }
        sz szVar = (sz) objP0;
        a26Var2.d(new Float(0.0f));
        return szVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(fhc fhcVar, float f, a26 a26Var, zn2 zn2Var) {
        yqd yqdVar;
        if (zn2Var instanceof yqd) {
            yqdVar = (yqd) zn2Var;
            int i = yqdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                yqdVar.label = i - Integer.MIN_VALUE;
            } else {
                yqdVar = new yqd(this, zn2Var);
            }
        } else {
            yqdVar = new yqd(this, zn2Var);
        }
        Object objB = yqdVar.result;
        int i2 = yqdVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            yqdVar.label = 1;
            objB = b(fhcVar, f, a26Var, yqdVar);
            Object obj = bw2.a;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
        }
        sz szVar = (sz) objB;
        return new Float(szVar.a.floatValue() != 0.0f ? ((Number) szVar.b.c()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(fhc fhcVar, float f, float f2, wqd wqdVar, zn2 zn2Var) {
        zqd zqdVar;
        if (zn2Var instanceof zqd) {
            zqdVar = (zqd) zn2Var;
            int i = zqdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                zqdVar.label = i - Integer.MIN_VALUE;
            } else {
                zqdVar = new zqd(this, zn2Var);
            }
        } else {
            zqdVar = new zqd(this, zn2Var);
        }
        zqd zqdVar2 = zqdVar;
        Object objE = zqdVar2.result;
        int i2 = zqdVar2.label;
        if (i2 == 0) {
            jzb.q(objE);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return g21.a(f, f2, 28);
            }
            zqdVar2.label = 1;
            ph3 ph3Var = this.b;
            objE = (Math.abs(lmg.R(ph3Var, 0.0f, f2)) >= Math.abs(f) ? new mjg(ph3Var) : new fnb(this.c)).e(fhcVar, new Float(f), new Float(f2), wqdVar, zqdVar2);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objE);
        }
        return ((sz) objE).b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ard) {
            ard ardVar = (ard) obj;
            if (pa7.t(ardVar.c, this.c) && pa7.t(ardVar.b, this.b) && pa7.t(ardVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
