package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k51 extends lw9 implements kw9 {
    public final ay0 v;
    public final v99 w;
    public final kxa x;
    public iza y;
    public p04 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k51(dx5 dx5Var, ge8 ge8Var, w09 w09Var, iza izaVar, g51 g51Var) {
        super(w09Var, dx5Var);
        dx5Var.getClass();
        w09Var.getClass();
        g51Var.getClass();
        this.v = g51Var;
        qza qzaVarG = izaVar.G();
        qzaVarG.getClass();
        oza ozaVarF = izaVar.F();
        ozaVarF.getClass();
        v99 v99Var = new v99(qzaVarG, ozaVarF);
        this.w = v99Var;
        qqf qqfVar = new qqf(4, this);
        kxa kxaVar = new kxa();
        kxaVar.a = v99Var;
        kxaVar.b = g51Var;
        kxaVar.c = qqfVar;
        List listD = izaVar.D();
        listD.getClass();
        int iF = bm8.F(t72.u(listD, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF < 16 ? 16 : iF);
        for (Object obj : listD) {
            linkedHashMap.put(i7h.u((v99) kxaVar.a, ((nya) obj).q0()), obj);
        }
        kxaVar.d = linkedHashMap;
        this.x = kxaVar;
        this.y = izaVar;
    }

    public final void E0(tz3 tz3Var) {
        tz3Var.getClass();
        iza izaVar = this.y;
        if (izaVar == null) {
            qc0.p("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.y = null;
        hza hzaVarE = izaVar.E();
        hzaVarE.getClass();
        this.z = new p04(this, hzaVarE, this.w, this.v, null, tz3Var, "scope of " + this, new j5(18, this));
    }

    @Override // defpackage.kw9
    public final dr8 F() {
        p04 p04Var = this.z;
        if (p04Var != null) {
            return p04Var;
        }
        pa7.g0("_memberScope");
        throw null;
    }

    @Override // defpackage.lw9, defpackage.cm3, defpackage.m4
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.f);
        sb.append(" from ");
        int i = qz3.a;
        w09 w09VarC = oz3.c(this);
        w09VarC.getClass();
        sb.append(w09VarC);
        return sb.toString();
    }
}
