package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d2f extends lg9 {
    public final r41 f;
    public lyd g;

    public d2f(gic gicVar, q12 q12Var, sw3 sw3Var) {
        super(gicVar, q12Var, sw3Var);
        this.f = urg.a(Integer.MAX_VALUE, null, null, 6);
    }

    public static z1f e(r41 r41Var) {
        z1f z1fVar = null;
        dyc dycVarI = dec.i(new og9(new w39(r41Var, 1), null));
        while (dycVarI.hasNext()) {
            z1f z1fVarA = (z1f) dycVarI.next();
            if (z1fVar != null) {
                z1fVarA = z1fVar.a(z1fVarA);
            }
            z1fVar = z1fVarA;
        }
        return z1fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
    
        if (r18.b.z(r4, r3) == r9) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.gic r19, defpackage.z1f r20, defpackage.zn2 r21) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d2f.c(gic, z1f, zn2):java.lang.Object");
    }

    public final boolean d(hia hiaVar) {
        boolean z;
        boolean z2;
        boolean z3;
        r41 r41Var;
        gic gicVar;
        oia oiaVar = (oia) s72.x0(hiaVar.a);
        if (oiaVar != null) {
            List listB = oiaVar.b();
            int size = listB.size();
            int i = 0;
            z3 = false;
            while (true) {
                r41Var = this.f;
                gicVar = this.a;
                if (i >= size) {
                    break;
                }
                vj6 vj6Var = (vj6) listB.get(i);
                long j = vj6Var.d ^ (-9223372034707292160L);
                if (!(gicVar.j(gicVar.f(j)) == 0.0f)) {
                    z3 = !(r41Var.d(new z1f(j, vj6Var.a, false)) instanceof qw1) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = oiaVar.l ^ (-9223372034707292160L);
            boolean z4 = hiaVar.f == 12;
            if (!(gicVar.j(gicVar.f(j2)) == 0.0f) || z4) {
                if (!(r41Var.d(new z1f(j2, oiaVar.b, z4)) instanceof qw1) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
