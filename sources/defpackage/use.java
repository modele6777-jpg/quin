package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class use {
    public final lqb a;
    public une b;
    public final vz9 c;
    public final vz9 d;
    public final vz9 e;
    public final vz9 f;
    public final aoc g;
    public final p89 h;

    public use(String str, long j, lqb lqbVar) {
        this.a = lqbVar;
        this.b = new une(new vne(str, u3c.d(str.length(), j), null, null, null, null, null, 124), null, null, null, 14);
        Boolean bool = Boolean.FALSE;
        this.c = q1c.f(bool);
        this.d = q1c.f(new vne(str, j, null, null, null, null, null, 124));
        this.e = q1c.f(bool);
        this.f = q1c.f(bool);
        this.g = new aoc(this);
        this.h = new p89(0, new xv[16]);
    }

    public final void a(une uneVar) {
        boolean z = ((p89) uneVar.a().b).c > 0;
        boolean z2 = !eue.c(uneVar.g, this.b.g);
        boolean zT = true ^ pa7.t(uneVar.d, this.b.d);
        if (z) {
            e(d(), une.i(uneVar, 0L, null, 15), uneVar.a(), fpe.b);
        }
        i(uneVar, z, z2, zT);
    }

    public final void b(u47 u47Var, boolean z, fpe fpeVar) {
        vne vneVarD = d();
        if (((p89) this.b.a().b).c == 0 && eue.c(vneVarD.d, this.b.g)) {
            if (pa7.t(vneVarD.e, this.b.v) && pa7.t(vneVarD.f, this.b.x) && pa7.t(vneVarD.a, this.b.w)) {
                return;
            }
            vne vneVarD2 = d();
            String string = this.b.c.toString();
            une uneVar = this.b;
            long j = uneVar.g;
            eue eueVar = uneVar.v;
            j(vneVarD2, new vne(string, j, eueVar, uneVar.x, n3d.h(eueVar, uneVar.w), null, vneVarD.b, 32), z);
            return;
        }
        boolean z2 = false;
        boolean z3 = ((p89) this.b.a().b).c != 0;
        String string2 = this.b.c.toString();
        une uneVar2 = this.b;
        long j2 = uneVar2.g;
        eue eueVar2 = uneVar2.v;
        vne vneVar = new vne(string2, j2, eueVar2, uneVar2.x, n3d.h(eueVar2, uneVar2.w), null, n3d.j(this.b), 32);
        if (u47Var == null) {
            if (z3 && z) {
                z2 = true;
            }
            j(vneVarD, vneVar, z2);
            e(vneVarD, vneVar, this.b.a(), fpeVar);
            return;
        }
        une uneVar3 = new une(vneVar, this.b.a(), vneVarD, null, 8);
        u47Var.a(uneVar3);
        boolean zT = c5e.t(uneVar3.c, vneVar);
        boolean z4 = !zT;
        boolean zC = eue.c(uneVar3.g, vneVar.d);
        boolean z5 = !zC;
        nue nueVar = uneVar3.d;
        xse xseVar = vneVar.b;
        boolean zT2 = pa7.t(nueVar, xseVar != null ? xseVar.a : null);
        boolean z6 = !zT2;
        if (zT && zC && zT2) {
            j(vneVarD, une.i(uneVar3, 0L, vneVar.e, 13), z);
        } else {
            i(uneVar3, z4, z5, z6);
        }
        e(vneVarD, d(), uneVar3.a(), fpeVar);
    }

    public final void c() {
        this.c.setValue(Boolean.FALSE);
        g(false);
    }

    public final vne d() {
        return (vne) this.d.getValue();
    }

    public final void e(vne vneVar, vne vneVar2, k47 k47Var, fpe fpeVar) {
        int iOrdinal = fpeVar.ordinal();
        lqb lqbVar = this.a;
        if (iOrdinal == 0) {
            q6c.f(lqbVar, vneVar, vneVar2, k47Var, true);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                q6c.f(lqbVar, vneVar, vneVar2, k47Var, false);
                return;
            } else {
                ap.c();
                return;
            }
        }
        ((vz9) lqbVar.c).setValue(null);
        ibf ibfVar = (ibf) lqbVar.b;
        ibfVar.b.clear();
        ibfVar.c.clear();
    }

    public final void f(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    public final void g(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    public final une h() {
        vz9 vz9Var = this.c;
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            boolean zBooleanValue = ((Boolean) vz9Var.getValue()).booleanValue();
            iqf.p(irdVarJ, irdVarL, a26VarE);
            if (zBooleanValue) {
                l37.c("TextFieldState does not support concurrent or nested editing.");
            }
            vz9Var.setValue(Boolean.TRUE);
            return new une(d(), null, null, null, 14);
        } catch (Throwable th) {
            iqf.p(irdVarJ, irdVarL, a26VarE);
            throw th;
        }
    }

    public final void i(une uneVar, boolean z, boolean z2, boolean z3) {
        vne vneVarI = une.i(this.b, 0L, null, 15);
        if (z || z3) {
            this.b = new une(new vne(uneVar.c.toString(), uneVar.g, null, null, null, null, n3d.j(uneVar), 60), null, null, null, 14);
        } else if (z2) {
            une uneVar2 = this.b;
            long j = uneVar.g;
            int i = eue.c;
            uneVar2.h(u3c.b((int) (j >> 32), (int) (j & 4294967295L)));
        }
        if (z || z2 || !pa7.t(vneVarI.e, uneVar.v)) {
            this.b.g(null);
        }
        j(vneVarI, une.i(this.b, 0L, null, 15), true);
    }

    public final void j(vne vneVar, vne vneVar2, boolean z) {
        this.d.setValue(vneVar2);
        p89 p89Var = this.h;
        Object[] objArr = p89Var.a;
        int i = p89Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            xv xvVar = (xv) objArr[i2];
            boolean z2 = (!z || c5e.t(vneVar.c, vneVar2) || vneVar.e == null) ? false : true;
            ne2 ne2Var = xvVar.a;
            long j = vneVar.d;
            eue eueVar = vneVar.e;
            long j2 = vneVar2.d;
            eue eueVar2 = vneVar2.e;
            if (z2) {
                a90 a90Var = (a90) ne2Var;
                a90Var.S().restartInput((View) a90Var.b);
            } else if (!eue.c(j, j2) || !pa7.t(eueVar, eueVar2)) {
                a90 a90Var2 = (a90) ne2Var;
                a90Var2.S().updateSelection((View) a90Var2.b, eue.g(j2), eue.f(j2), eueVar2 != null ? eue.g(eueVar2.a) : -1, eueVar2 != null ? eue.f(eueVar2.a) : -1);
            }
        }
        g(false);
    }

    public final String toString() {
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            return "TextFieldState(selection=" + eue.i(d().d) + ", text=\"" + ((Object) d().c) + "\")";
        } finally {
            iqf.p(irdVarJ, irdVarL, a26VarE);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public use(String str, int i) {
        str = (i & 1) != 0 ? "" : str;
        int length = str.length();
        this(str, u3c.b(length, length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public use(String str, long j) {
        pu4 pu4Var = pu4.a;
        this(str, j, new lqb((vue) null, new ibf(pu4Var, pu4Var, 100)));
    }
}
