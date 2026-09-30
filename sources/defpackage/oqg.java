package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface oqg {
    static vqg f(oqg oqgVar, erg ergVar, kxa kxaVar, ArrayList arrayList) {
        String str = ergVar.a;
        if (oqgVar.k(str)) {
            vqg vqgVarE = oqgVar.e(str);
            if (vqgVarE instanceof qpg) {
                return ((qpg) vqgVarE).b(kxaVar, arrayList);
            }
            qc0.j(tec.l(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            jcc.m("hasOwnProperty", 1, arrayList);
            return oqgVar.k(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).d()) ? vqg.A0 : vqg.B0;
        }
        qc0.j(ub3.i("Object has no function ", str));
        return null;
    }

    vqg e(String str);

    void i(String str, vqg vqgVar);

    boolean k(String str);
}
