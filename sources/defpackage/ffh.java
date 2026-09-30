package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ffh extends qpg {
    public final ysd c;
    public final HashMap d;

    public ffh(ysd ysdVar) {
        super("require");
        this.d = new HashMap();
        this.c = ysdVar;
    }

    @Override // defpackage.qpg
    public final vqg b(kxa kxaVar, List list) {
        vqg vqgVar;
        jcc.m("require", 1, list);
        String strD = ((vea) kxaVar.b).G(kxaVar, (vqg) list.get(0)).d();
        HashMap map = this.d;
        if (map.containsKey(strD)) {
            return (vqg) map.get(strD);
        }
        HashMap map2 = (HashMap) this.c.b;
        if (map2.containsKey(strD)) {
            try {
                vqgVar = (vqg) ((Callable) map2.get(strD)).call();
            } catch (Exception unused) {
                qc0.p("Failed to create API implementation: ".concat(String.valueOf(strD)));
                return null;
            }
        } else {
            vqgVar = vqg.v0;
        }
        if (vqgVar instanceof qpg) {
            map.put(strD, (qpg) vqgVar);
        }
        return vqgVar;
    }
}
