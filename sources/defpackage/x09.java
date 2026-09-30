package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x09 extends cm3 implements w09 {
    public final ge8 d;
    public final xr7 e;
    public final Map f;
    public final tw9 g;
    public bu3 v;
    public nw9 w;
    public final boolean x;
    public final be8 y;
    public final ace z;

    public x09(t99 t99Var, ge8 ge8Var, xr7 xr7Var, int i) {
        super(hj6.c, t99Var);
        this.d = ge8Var;
        this.e = xr7Var;
        if (!t99Var.b) {
            yg5.l(t99Var, "Module name must be special: ");
            throw null;
        }
        this.f = qu4.a;
        tw9.a.getClass();
        tw9 tw9Var = (tw9) f0(rw9.b);
        this.g = tw9Var == null ? sw9.b : tw9Var;
        this.x = true;
        this.y = ge8Var.b(new x(26, this));
        this.z = new ace(new vj7(this, 1));
    }

    public final void C0() {
        if (this.x) {
            return;
        }
        if (f0(xa7.a) != null) {
            r3.f();
        } else {
            throw new wa7("Accessing invalid module descriptor " + this);
        }
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.q(this, obj);
    }

    @Override // defpackage.w09
    public final List V() {
        if (this.v != null) {
            return pu4.a;
        }
        String str = getName().a;
        str.getClass();
        ho7.l(str, " were not set", "Dependencies of module ");
        return null;
    }

    @Override // defpackage.w09
    public final n18 W(dx5 dx5Var) {
        dx5Var.getClass();
        C0();
        return (n18) this.y.d(dx5Var);
    }

    @Override // defpackage.w09
    public final xr7 f() {
        return this.e;
    }

    @Override // defpackage.w09
    public final Object f0(rch rchVar) {
        rchVar.getClass();
        Object obj = this.f.get(rchVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.bm3
    public final bm3 k() {
        return null;
    }

    @Override // defpackage.w09
    public final Collection m(dx5 dx5Var, a26 a26Var) {
        dx5Var.getClass();
        C0();
        C0();
        return ((fg2) this.z.getValue()).m(dx5Var, a26Var);
    }

    @Override // defpackage.cm3, defpackage.m4
    public final String toString() {
        StringBuilder sb = new StringBuilder(cm3.B0(this));
        if (!this.x) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        nw9 nw9Var = this.w;
        sb.append(nw9Var != null ? nw9Var.getClass().getSimpleName() : null);
        return sb.toString();
    }

    @Override // defpackage.w09
    public final boolean u(w09 w09Var) {
        w09Var.getClass();
        if (this == w09Var) {
            return true;
        }
        this.v.getClass();
        if (s72.o0(xu4.a, w09Var)) {
            return true;
        }
        V();
        return w09Var.V().contains(this);
    }
}
