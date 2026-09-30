package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qwc {
    public static final vea d = i7h.B(new qdc(15), new fnc(20));
    public fwc b;
    public final vz9 a = q1c.f(null);
    public final vz9 c = q1c.f(pu4.a);

    public final vuc a() {
        return (vuc) this.a.getValue();
    }

    public final void b(long j) {
        bv7 bv7Var;
        int i;
        uuc uucVarF;
        fwc fwcVar = this.b;
        if (fwcVar == null || (bv7Var = fwcVar.z) == null || !bv7Var.h()) {
            return;
        }
        ArrayList arrayListE = fwcVar.a.e(bv7Var);
        if (arrayListE.isEmpty()) {
            return;
        }
        int i2 = eue.c;
        int i3 = (int) (j >> 32);
        uuc uucVarF2 = fwc.f(i3, arrayListE);
        if (uucVarF2 == null || (uucVarF = fwc.f((i = (int) (j & 4294967295L)), arrayListE)) == null) {
            return;
        }
        vuc vucVar = new vuc(uucVarF2, uucVarF, i3 > i);
        fwcVar.v(vucVar);
        fwcVar.d.d(vucVar);
        fwcVar.G0 = null;
        fo5.a(fwcVar.v);
        fwcVar.q(true);
    }
}
