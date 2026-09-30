package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mdb extends bj5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdb(tjd tjdVar, tjd tjdVar2) {
        super(tjdVar, tjdVar2);
        tjdVar.getClass();
        tjdVar2.getClass();
        vt7.a.b(tjdVar, tjdVar2);
    }

    public static final ArrayList q0(jz3 jz3Var, tt7 tt7Var) throws IOException {
        List<i8f> listZ = tt7Var.Z();
        ArrayList arrayList = new ArrayList(t72.u(listZ, 10));
        for (i8f i8fVar : listZ) {
            i8fVar.getClass();
            StringBuilder sb = new StringBuilder();
            s72.C0(t72.H(i8fVar), sb, ", ", null, null, new iz3(jz3Var, 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final String r0(String str, String str2) {
        if (!v4e.G(str, '<')) {
            return str;
        }
        return v4e.i0(str, '<') + '<' + str2 + '>' + v4e.g0('>', str, str);
    }

    @Override // defpackage.bj5, defpackage.tt7
    public final dr8 F() {
        y22 y22VarM = c0().m();
        u09 u09Var = y22VarM instanceof u09 ? (u09) y22VarM : null;
        if (u09Var == null) {
            cva.k(c0().m(), "Incorrect classifier: ");
            return null;
        }
        dr8 dr8VarM = u09Var.M(new ldb());
        dr8VarM.getClass();
        return dr8VarM;
    }

    @Override // defpackage.tt7
    public final tt7 j0(zt7 zt7Var) {
        tjd tjdVar = this.b;
        tjdVar.getClass();
        tjd tjdVar2 = this.c;
        tjdVar2.getClass();
        return new mdb(tjdVar, tjdVar2);
    }

    @Override // defpackage.jgf
    public final jgf l0(boolean z) {
        return new mdb(this.b.l0(z), this.c.l0(z));
    }

    @Override // defpackage.jgf
    /* JADX INFO: renamed from: m0 */
    public final jgf j0(zt7 zt7Var) {
        tjd tjdVar = this.b;
        tjdVar.getClass();
        tjd tjdVar2 = this.c;
        tjdVar2.getClass();
        return new mdb(tjdVar, tjdVar2);
    }

    @Override // defpackage.jgf
    public final jgf n0(e7f e7fVar) {
        e7fVar.getClass();
        return new mdb(this.b.n0(e7fVar), this.c.n0(e7fVar));
    }

    @Override // defpackage.bj5
    public final tjd o0() {
        return this.b;
    }

    @Override // defpackage.bj5
    public final String p0(jz3 jz3Var, jz3 jz3Var2) throws IOException {
        tjd tjdVar = this.b;
        String strP = jz3Var.P(tjdVar);
        tjd tjdVar2 = this.c;
        String strP2 = jz3Var.P(tjdVar2);
        if (jz3Var2.a.p()) {
            return "raw (" + strP + ".." + strP2 + ')';
        }
        if (tjdVar2.Z().isEmpty()) {
            return jz3Var.w(strP, strP2, o7c.p(this));
        }
        ArrayList arrayListQ0 = q0(jz3Var, tjdVar);
        ArrayList arrayListQ1 = q0(jz3Var, tjdVar2);
        String strD0 = s72.D0(arrayListQ0, ", ", null, null, d5a.x, 30);
        ArrayList arrayListR1 = s72.r1(arrayListQ0, arrayListQ1);
        if (!arrayListR1.isEmpty()) {
            Iterator it = arrayListR1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strP2 = r0(strP2, strD0);
                    break;
                }
                iy9 iy9Var = (iy9) it.next();
                String str = (String) iy9Var.d();
                String str2 = (String) iy9Var.e();
                if (!pa7.t(str, v4e.Y("out ", str2)) && !str2.equals("*")) {
                    break;
                }
            }
        } else {
            strP2 = r0(strP2, strD0);
            break;
        }
        String strR0 = r0(strP, strD0);
        return strR0.equals(strP2) ? strR0 : jz3Var.w(strR0, strP2, o7c.p(this));
    }
}
