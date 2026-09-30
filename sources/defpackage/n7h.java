package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n7h extends rqg {
    public final psd b;

    public n7h(psd psdVar) {
        this.b = psdVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.rqg, defpackage.vqg
    public final vqg g(String str, kxa kxaVar, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        psd psdVar = this.b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    jcc.m("getEventName", 0, arrayList);
                    return new erg(((zjg) psdVar.c).a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    jcc.m("getTimestamp", 0, arrayList);
                    return new vog(Double.valueOf(((zjg) psdVar.c).b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    jcc.m("getParamValue", 1, arrayList);
                    String strD = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).d();
                    HashMap map = ((zjg) psdVar.c).c;
                    return xdc.y(map.containsKey(strD) ? map.get(strD) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    jcc.m("getParams", 0, arrayList);
                    HashMap map2 = ((zjg) psdVar.c).c;
                    rqg rqgVar = new rqg();
                    for (String str2 : map2.keySet()) {
                        rqgVar.i(str2, xdc.y(map2.get(str2)));
                    }
                    return rqgVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    jcc.m("setParamValue", 2, arrayList);
                    String strD2 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).d();
                    vqg vqgVarG = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1));
                    zjg zjgVar = (zjg) psdVar.c;
                    Object objU = jcc.u(vqgVarG);
                    HashMap map3 = zjgVar.c;
                    if (objU == null) {
                        map3.remove(strD2);
                        return vqgVarG;
                    }
                    map3.put(strD2, zjg.b(map3.get(strD2), objU, strD2));
                    return vqgVarG;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    jcc.m("setEventName", 1, arrayList);
                    vqg vqgVarG2 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                    if (vqg.v0.equals(vqgVarG2) || vqg.w0.equals(vqgVarG2)) {
                        qc0.j("Illegal event name");
                        return null;
                    }
                    ((zjg) psdVar.c).a = vqgVarG2.d();
                    return new erg(vqgVarG2.d());
                }
                break;
        }
        return super.g(str, kxaVar, arrayList);
    }
}
