package defpackage;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vr7 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr7 b;

    public /* synthetic */ vr7(xr7 xr7Var, int i) {
        this.a = i;
        this.b = xr7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        xr7 xr7Var = this.b;
        switch (i) {
            case 0:
                return Arrays.asList(xr7Var.l().W(tyd.k), xr7Var.l().W(tyd.m), xr7Var.l().W(tyd.n), xr7Var.l().W(tyd.l));
            default:
                EnumMap enumMap = new EnumMap(jua.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (jua juaVar : jua.values()) {
                    String strB = juaVar.e().b();
                    if (strB == null) {
                        xr7.a(47);
                        throw null;
                    }
                    tjd tjdVarS = xr7Var.k(strB).S();
                    if (tjdVarS == null) {
                        xr7.a(48);
                        throw null;
                    }
                    String strB2 = juaVar.c().b();
                    if (strB2 == null) {
                        xr7.a(47);
                        throw null;
                    }
                    tjd tjdVarS2 = xr7Var.k(strB2).S();
                    if (tjdVarS2 == null) {
                        xr7.a(48);
                        throw null;
                    }
                    enumMap.put(juaVar, tjdVarS2);
                    map.put(tjdVarS, tjdVarS2);
                    map2.put(tjdVarS2, tjdVarS);
                }
                return new wr7(enumMap, map, map2);
        }
    }
}
