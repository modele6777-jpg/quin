package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wse extends sv3 implements kv7, mb6, ug2 {
    public ute F0;
    public boolean G0;
    public final o31 H0;
    public Map I0;

    public wse(ute uteVar, z2f z2fVar, mue mueVar, boolean z, l26 l26Var, wo7 wo7Var) {
        this.F0 = uteVar;
        this.G0 = z;
        o31 o31Var = new o31(uteVar.h);
        l1(o31Var);
        this.H0 = o31Var;
        ute uteVar2 = this.F0;
        uteVar2.b = l26Var;
        boolean z2 = this.G0;
        uteVar2.a.a.setValue(new upe(z2fVar, mueVar, z2, !z2, wo7Var.c == 4));
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        ute uteVar = this.F0;
        cv7 layoutDirection = zn8Var.getLayoutDirection();
        xp5 xp5Var = (xp5) eb3.H(this, zg2.k);
        vpe vpeVar = uteVar.a;
        tpe tpeVar = new tpe(zn8Var, layoutDirection, xp5Var, j);
        vpeVar.b.setValue(tpeVar);
        upe upeVar = (upe) vpeVar.a.getValue();
        if (upeVar == null) {
            l37.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            oo3.f();
            return null;
        }
        ste steVarH = vpeVar.h(upeVar, tpeVar);
        long j2 = steVarH.c;
        l26 l26Var = uteVar.b;
        if (l26Var != null) {
            l26Var.z(zn8Var, new h2e(9, uteVar));
        }
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        cea ceaVarV = tn8Var.v(pa7.S(i, i, i2, i2));
        this.F0.g.setValue(new yi4(this.G0 ? zn8Var.Z(gdc.c(steVarH.b.b(0))) : 0.0f));
        Map linkedHashMap = this.I0;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap(2);
        }
        linkedHashMap.put(cj.a, Integer.valueOf(Math.round(steVarH.d)));
        linkedHashMap.put(cj.b, Integer.valueOf(Math.round(steVarH.e)));
        this.I0 = linkedHashMap;
        return zn8Var.n0(i, i2, linkedHashMap, new l1(ceaVarV, 21));
    }

    @Override // defpackage.mb6
    public final void l0(yf9 yf9Var) {
        this.F0.d.setValue(yf9Var);
    }
}
