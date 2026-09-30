package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l6h extends qpg {
    public final /* synthetic */ int c = 1;
    public final Object d;

    public l6h(oid oidVar) {
        super("internal.logger");
        this.d = oidVar;
        this.b.put("log", new aeh(this, false, true));
        this.b.put("silent", new bah("silent", 1));
        ((qpg) this.b.get("silent")).i("log", new aeh(this, true, true));
        this.b.put("unmonitored", new bah("unmonitored", 2));
        ((qpg) this.b.get("unmonitored")).i("log", new aeh(this, false, false));
    }

    @Override // defpackage.qpg
    public final vqg b(kxa kxaVar, List list) {
        TreeMap treeMap;
        int i = this.c;
        String str = this.a;
        grg grgVar = vqg.v0;
        Object obj = this.d;
        String str2 = null;
        switch (i) {
            case 0:
                jcc.m(str, 3, list);
                String strD = ((vea) kxaVar.b).G(kxaVar, (vqg) list.get(0)).d();
                vqg vqgVar = (vqg) list.get(1);
                vea veaVar = (vea) kxaVar.b;
                long jT = (long) jcc.t(veaVar.G(kxaVar, vqgVar).j().doubleValue());
                vqg vqgVarG = veaVar.G(kxaVar, (vqg) list.get(2));
                HashMap mapV = vqgVarG instanceof rqg ? jcc.v((rqg) vqgVarG) : new HashMap();
                psd psdVar = (psd) obj;
                psdVar.getClass();
                HashMap map = new HashMap();
                for (String str3 : mapV.keySet()) {
                    HashMap map2 = ((zjg) psdVar.b).c;
                    map.put(str3, zjg.b(map2.containsKey(str3) ? map2.get(str3) : null, mapV.get(str3), str3));
                }
                ((ArrayList) psdVar.d).add(new zjg(strD, jT, map));
                return grgVar;
            case 1:
                jcc.m("getValue", 2, list);
                vqg vqgVarG2 = ((vea) kxaVar.b).G(kxaVar, (vqg) list.get(0));
                vqg vqgVarG3 = ((vea) kxaVar.b).G(kxaVar, (vqg) list.get(1));
                String strD2 = vqgVarG2.d();
                lqb lqbVar = (lqb) obj;
                Map map3 = (Map) ((y2h) lqbVar.c).e.get((String) lqbVar.b);
                if (map3 != null && map3.containsKey(strD2)) {
                    str2 = (String) map3.get(strD2);
                }
                return str2 != null ? new erg(str2) : vqgVarG3;
            case 2:
                return grgVar;
            case 3:
                try {
                    return xdc.y(((q2h) obj).call());
                } catch (Exception unused) {
                    return grgVar;
                }
            default:
                jcc.m(str, 3, list);
                ((vea) kxaVar.b).G(kxaVar, (vqg) list.get(0)).d();
                vqg vqgVar2 = (vqg) list.get(1);
                vea veaVar2 = (vea) kxaVar.b;
                vqg vqgVarG4 = veaVar2.G(kxaVar, vqgVar2);
                if (vqgVarG4 instanceof uqg) {
                    vqg vqgVarG5 = veaVar2.G(kxaVar, (vqg) list.get(2));
                    if (vqgVarG5 instanceof rqg) {
                        rqg rqgVar = (rqg) vqgVarG5;
                        HashMap map4 = rqgVar.a;
                        if (map4.containsKey("type")) {
                            String strD3 = rqgVar.e("type").d();
                            int iS = map4.containsKey("priority") ? jcc.s(rqgVar.e("priority").j().doubleValue()) : 1000;
                            gsg gsgVar = (gsg) obj;
                            uqg uqgVar = (uqg) vqgVarG4;
                            gsgVar.getClass();
                            if ("create".equals(strD3)) {
                                treeMap = (TreeMap) gsgVar.b;
                            } else if ("edit".equals(strD3)) {
                                treeMap = (TreeMap) gsgVar.a;
                            } else {
                                qc0.p("Unknown callback type: ".concat(String.valueOf(strD3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(iS))) {
                                iS = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(iS), uqgVar);
                            return grgVar;
                        }
                        qc0.j("Undefined rule type");
                    } else {
                        qc0.j("Invalid callback params");
                    }
                } else {
                    qc0.j("Invalid callback type");
                }
                return null;
        }
    }

    public l6h(psd psdVar) {
        super("internal.eventLogger");
        this.d = psdVar;
    }

    public l6h(gsg gsgVar) {
        super("internal.registerCallback");
        this.d = gsgVar;
    }

    public l6h(q2h q2hVar) {
        super("internal.appMetadata");
        this.d = q2hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6h(bah bahVar, lqb lqbVar) {
        super("getValue");
        this.d = lqbVar;
    }
}
