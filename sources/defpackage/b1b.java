package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1b {
    public final a28 a;

    public b1b(x16 x16Var) {
        this.a = new a28(x16Var);
    }

    public abstract e1b a(Object obj);

    public srf b() {
        return this.a;
    }

    public final e1b c(a26 a26Var) {
        return new e1b(this, null, false, null, a26Var, false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[PHI: r4
  0x0034: PHI (r4v2 srf) = (r4v6 srf), (r4v7 srf) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final srf d(e1b e1bVar, srf srfVar) {
        dh2 dh2Var;
        srf srfVar2;
        q1e q1eVar;
        xr4 xr4Var;
        srf srfVar3 = null;
        srfVar3 = null;
        srfVar3 = null;
        srfVar3 = null;
        srfVar3 = null;
        srfVar3 = null;
        if (srfVar instanceof xr4) {
            if (e1bVar.e) {
                xr4Var = (xr4) srfVar;
                xr4Var.a.setValue(e1bVar.a());
            }
        } else if (srfVar instanceof q1e) {
            if ((e1bVar.b || e1bVar.f != null) && !e1bVar.e) {
                q1eVar = (q1e) srfVar;
                if (pa7.t(e1bVar.a(), q1eVar.a)) {
                    srfVar2 = dh2Var;
                    srfVar2 = q1eVar;
                    srfVar3 = srfVar2;
                }
            }
        } else if (srfVar instanceof dh2) {
            dh2Var = (dh2) srfVar;
            if (e1bVar.d == dh2Var.a) {
                srfVar2 = dh2Var;
                srfVar2 = q1eVar;
                srfVar3 = srfVar2;
            }
        }
        if (srfVar3 != null) {
            srfVar3 = xr4Var;
            return srfVar3;
        }
        if (!e1bVar.e) {
            a26 a26Var = e1bVar.d;
            if (a26Var != null) {
                srfVar3 = xr4Var;
                return new dh2(a26Var);
            }
            srfVar3 = xr4Var;
            return new q1e(e1bVar.a());
        }
        Object obj = e1bVar.f;
        yrd yrdVar = e1bVar.c;
        if (yrdVar == null) {
            srfVar3 = xr4Var;
            yrdVar = i8c.f;
        }
        srfVar3 = xr4Var;
        return new xr4(new vz9(obj, yrdVar));
    }
}
