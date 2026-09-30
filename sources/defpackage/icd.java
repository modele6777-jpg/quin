package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class icd implements vpb {
    public tbd X;
    public final qz9 b;
    public final vz9 c;
    public final vz9 d;
    public final vz9 e;
    public final vz9 f;
    public final vz9 g;
    public final vz9 v;
    public final vz9 w;
    public boolean x;
    public zt y;
    public icd z;
    public final vz9 a = q1c.f(Boolean.FALSE);
    public final vz9 Y = q1c.f(null);

    public icd(hcd hcdVar, k21 k21Var, qdd qddVar, boolean z, odd oddVar, boolean z2, rdd rddVar, float f) {
        this.b = new qz9(f);
        this.c = q1c.f(Boolean.valueOf(z2));
        this.d = q1c.f(hcdVar);
        this.e = q1c.f(k21Var);
        this.f = q1c.f(qddVar);
        this.g = q1c.f(Boolean.valueOf(z));
        this.v = q1c.f(oddVar);
        this.w = q1c.f(rddVar);
    }

    public final scd b() {
        tbd tbdVar;
        scd scdVarM1;
        ((mdd) j().b.getValue()).getClass();
        tbd tbdVar2 = this.X;
        Object obj = null;
        scd scdVarM2 = tbdVar2 != null ? tbdVar2.m1() : null;
        if (l() ? !i() : i()) {
            List listC = f().c();
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = listC.get(i);
                icd icdVar = (icd) obj2;
                boolean zL = icdVar.l();
                boolean zI = icdVar.i();
                if (!zL) {
                    zI = !zI;
                }
                if (zI) {
                    obj = obj2;
                    break;
                }
            }
            icd icdVar2 = (icd) obj;
            if (icdVar2 != null && (tbdVar = icdVar2.X) != null && (scdVarM1 = tbdVar.m1()) != null) {
                return scdVarM1;
            }
        }
        return scdVarM2;
    }

    @Override // defpackage.vpb
    public final void c() {
        xdd xddVar = f().b;
        xddVar.getClass();
        hcd hcdVarF = f();
        hcdVarF.d.setValue(s72.M0(this, hcdVarF.b()));
        hcdVarF.e.setValue(s72.M0(this, hcdVarF.c()));
        hcdVarF.f();
        xddVar.f();
        xddVar.v.l(this);
        sz9 sz9Var = xddVar.g;
        sz9Var.k(sz9Var.j() + 1);
        if (hcdVarF.b().isEmpty()) {
            ynb.V(hcdVarF.b.b, null, null, new udd(hcdVarF, this, null), 3);
        }
        f().c.f();
    }

    @Override // defpackage.vpb
    public final void d() {
        xdd xddVar = f().b;
        xddVar.getClass();
        sz9 sz9Var = xddVar.g;
        hcd hcdVarF = f();
        hcdVarF.d.setValue(s72.R0(hcdVarF.b(), this));
        hcdVarF.f();
        xddVar.f();
        i79 i79Var = xddVar.v;
        Object[] objArr = i79Var.a;
        int i = i79Var.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            icd icdVar = (icd) objArr[i2];
            if (!(icdVar instanceof icd)) {
                icdVar = null;
            }
            if (pa7.t(icdVar != null ? icdVar.f() : null, f())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || i2 >= i79Var.b - 1) {
            i79Var.h(this);
        } else {
            i79Var.g(i2 + 1, this);
        }
        sz9Var.k(sz9Var.j() + 1);
        f().c.f();
    }

    public final k21 e() {
        return (k21) this.e.getValue();
    }

    public final hcd f() {
        return (hcd) this.d.getValue();
    }

    public final boolean g() {
        if (e().b()) {
            return true;
        }
        return (f().c.e().d() && !f().c.e().b()) || !((Boolean) this.g.getValue()).booleanValue();
    }

    public final boolean h() {
        if (g() && f().c.e().d() && k() && ((Boolean) this.c.getValue()).booleanValue()) {
            return f().b.e() || l();
        }
        return false;
    }

    public final boolean i() {
        return e().b();
    }

    public final rdd j() {
        return (rdd) this.w.getValue();
    }

    public final boolean k() {
        rdd rddVarJ = j();
        if (!((Boolean) this.a.getValue()).booleanValue()) {
            return false;
        }
        ((mdd) rddVarJ.b.getValue()).getClass();
        return true;
    }

    public final boolean l() {
        scd scdVarM1;
        tbd tbdVar = this.X;
        return (tbdVar == null || (scdVarM1 = tbdVar.m1()) == null || !scdVarM1.d()) ? false : true;
    }

    @Override // defpackage.vpb
    public final void a() {
    }
}
