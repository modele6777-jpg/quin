package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ldb extends o8f {
    public static final tf7 c;
    public static final tf7 d;
    public final vea b = new vea(new jy4(21));

    static {
        t8f t8fVar = t8f.b;
        c = tf7.a(vfh.Q(t8fVar, false, null, 5), uf7.c, false, null, null, 61);
        d = tf7.a(vfh.Q(t8fVar, false, null, 5), uf7.b, false, null, null, 61);
    }

    @Override // defpackage.o8f
    public final i8f d(tt7 tt7Var) {
        return new dzd(h(tt7Var, new tf7(t8f.b, false, false, null, 62)));
    }

    public final iy9 g(tjd tjdVar, u09 u09Var, tf7 tf7Var) {
        if (tjdVar.c0().getParameters().isEmpty()) {
            return new iy9(tjdVar, Boolean.FALSE);
        }
        if (xr7.z(tjdVar)) {
            i8f i8fVar = (i8f) tjdVar.Z().get(0);
            dsf dsfVarA = i8fVar.a();
            tt7 tt7VarB = i8fVar.b();
            tt7VarB.getClass();
            return new iy9(rxg.T(tjdVar.a0(), tjdVar.c0(), t72.H(new dzd(h(tt7VarB, tf7Var), dsfVarA)), tjdVar.i0()), Boolean.FALSE);
        }
        if (i7h.x(tjdVar)) {
            return new iy9(sy4.c(qy4.z, tjdVar.c0().toString()), Boolean.FALSE);
        }
        dr8 dr8VarM = u09Var.M(this);
        dr8VarM.getClass();
        e7f e7fVarA0 = tjdVar.a0();
        j7f j7fVarH = u09Var.h();
        j7fVarH.getClass();
        List<c8f> parameters = u09Var.h().getParameters();
        parameters.getClass();
        ArrayList arrayList = new ArrayList(t72.u(parameters, 10));
        for (c8f c8fVar : parameters) {
            c8fVar.getClass();
            vea veaVar = this.b;
            arrayList.add(jy4.m(c8fVar, tf7Var, veaVar, veaVar.u(c8fVar, tf7Var)));
        }
        return new iy9(rxg.V(e7fVarA0, j7fVarH, arrayList, tjdVar.i0(), dr8VarM, new yy3(u09Var, this, tjdVar, tf7Var)), Boolean.TRUE);
    }

    public final tt7 h(tt7 tt7Var, tf7 tf7Var) {
        y22 y22VarM = tt7Var.c0().m();
        if (y22VarM instanceof c8f) {
            tf7Var.getClass();
            return h(this.b.u((c8f) y22VarM, tf7.a(tf7Var, null, true, null, null, 59)), tf7Var);
        }
        if (!(y22VarM instanceof u09)) {
            pd4.i(y22VarM, "Unexpected declaration kind: ");
            return null;
        }
        y22 y22VarM2 = pa7.j0(tt7Var).c0().m();
        if (!(y22VarM2 instanceof u09)) {
            qc0.k("For some reason declaration for upper bound is not a class but \"", y22VarM2, "\" while for lower it's \"", y22VarM, 34);
            return null;
        }
        iy9 iy9VarG = g(pa7.Z(tt7Var), (u09) y22VarM, c);
        tjd tjdVar = (tjd) iy9VarG.a();
        boolean zBooleanValue = ((Boolean) iy9VarG.b()).booleanValue();
        iy9 iy9VarG2 = g(pa7.j0(tt7Var), (u09) y22VarM2, d);
        tjd tjdVar2 = (tjd) iy9VarG2.a();
        return (zBooleanValue || ((Boolean) iy9VarG2.b()).booleanValue()) ? new mdb(tjdVar, tjdVar2) : rxg.E(tjdVar, tjdVar2);
    }
}
