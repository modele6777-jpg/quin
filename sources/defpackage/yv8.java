package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yv8 extends i09 implements ug2, kv7 {
    public LinkedHashMap Z;

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        float f = ((yi4) eb3.H(this, p77.c)).a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        cea ceaVarV = tn8Var.v(j);
        boolean z = this.Y && !Float.isNaN(f) && yi4.a(f, 0.0f) > 0;
        int iD0 = !Float.isNaN(f) ? zn8Var.D0(f) : 0;
        int iMax = ceaVarV.a;
        if (z) {
            iMax = Math.max(iMax, iD0);
        }
        int iMax2 = ceaVarV.b;
        if (z) {
            iMax2 = Math.max(iMax2, iD0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.Z;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.Z = linkedHashMap;
            }
            vtf vtfVar = p77.b;
            int iRound = Math.round((iD0 - ceaVarV.a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(vtfVar, Integer.valueOf(iRound));
            oq6 oq6Var = p77.a;
            int iRound2 = Math.round((iD0 - ceaVarV.b) / 2.0f);
            linkedHashMap.put(oq6Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.Z;
        if (map == null) {
            map = qu4.a;
        }
        return zn8Var.n0(iMax, iMax2, map, new d57(iMax, iMax2, ceaVarV));
    }
}
