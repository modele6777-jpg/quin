package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class fy3 implements x16 {
    public final /* synthetic */ int a;
    public final uy3 b;

    public /* synthetic */ fy3(uy3 uy3Var, int i) {
        this.a = i;
        this.b = uy3Var;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0200  */
    @Override // defpackage.x16
    public final Object invoke() throws IOException {
        bm3 bm3VarK;
        Class<?> clsD;
        sc5 sc5VarR;
        int i = this.a;
        uy3 uy3Var = this.b;
        switch (i) {
            case 0:
                j22 j22Var = n8c.a;
                wxa wxaVarG = uy3Var.G();
                xm7 xm7Var = uy3Var.v;
                m93 m93VarB = n8c.b(wxaVarG);
                if (!(m93VarB instanceof el7)) {
                    if (m93VarB instanceof cl7) {
                        return ((cl7) m93VarB).r;
                    }
                    if ((m93VarB instanceof dl7) || (m93VarB instanceof fl7)) {
                        return null;
                    }
                    ap.c();
                    return null;
                }
                el7 el7Var = (el7) m93VarB;
                kza kzaVar = el7Var.s;
                wxa wxaVar = el7Var.r;
                o85 o85Var = sl7.a;
                rk7 rk7VarB = sl7.b(kzaVar, el7Var.u, el7Var.v, true);
                if (rk7VarB == null) {
                    return null;
                }
                if (wxaVar.g() != 2) {
                    bm3 bm3VarK2 = wxaVar.k();
                    if (bm3VarK2 == null) {
                        kn2.a(1);
                        throw null;
                    }
                    if (oz3.k(bm3VarK2)) {
                        bm3 bm3VarK3 = bm3VarK2.k();
                        if (oz3.l(bm3VarK3, l22.CLASS) || oz3.l(bm3VarK3, l22.ENUM_CLASS)) {
                            u09 u09Var = (u09) bm3VarK2;
                            LinkedHashSet linkedHashSet = oa2.a;
                            if (oz3.k(u09Var)) {
                                LinkedHashSet linkedHashSet2 = oa2.a;
                                j22 j22VarF = qz3.f(u09Var);
                                if (s72.o0(linkedHashSet2, j22VarF != null ? j22VarF.e() : null)) {
                                    if (oz3.k(wxaVar.k())) {
                                        sc5VarR = wxaVar.R();
                                        if (!((sc5VarR == null && sc5VarR.getAnnotations().E(oj7.a)) ? true : wxaVar.getAnnotations().E(oj7.a))) {
                                            if (sl7.d(kzaVar)) {
                                                bm3VarK = wxaVar.k();
                                                if (bm3VarK instanceof u09) {
                                                    clsD = sqf.q((u09) bm3VarK);
                                                } else {
                                                    clsD = xm7Var.d();
                                                }
                                            }
                                        }
                                    } else if (sl7.d(kzaVar)) {
                                        bm3VarK = wxaVar.k();
                                        if (bm3VarK instanceof u09) {
                                            clsD = sqf.q((u09) bm3VarK);
                                        } else {
                                            clsD = xm7Var.d();
                                        }
                                    }
                                }
                            }
                        } else if (oz3.k(wxaVar.k())) {
                            sc5VarR = wxaVar.R();
                            if (!((sc5VarR == null && sc5VarR.getAnnotations().E(oj7.a)) ? true : wxaVar.getAnnotations().E(oj7.a))) {
                                if (sl7.d(kzaVar)) {
                                    bm3VarK = wxaVar.k();
                                    if (bm3VarK instanceof u09) {
                                        clsD = sqf.q((u09) bm3VarK);
                                    } else {
                                        clsD = xm7Var.d();
                                    }
                                }
                            }
                        } else if (sl7.d(kzaVar)) {
                            bm3VarK = wxaVar.k();
                            if (bm3VarK instanceof u09) {
                                clsD = sqf.q((u09) bm3VarK);
                            } else {
                                clsD = xm7Var.d();
                            }
                        }
                    } else if (oz3.k(wxaVar.k())) {
                        sc5VarR = wxaVar.R();
                        if (!((sc5VarR == null && sc5VarR.getAnnotations().E(oj7.a)) ? true : wxaVar.getAnnotations().E(oj7.a))) {
                            if (sl7.d(kzaVar)) {
                                bm3VarK = wxaVar.k();
                                if (bm3VarK instanceof u09) {
                                    clsD = sqf.q((u09) bm3VarK);
                                } else {
                                    clsD = xm7Var.d();
                                }
                            }
                        }
                    } else if (sl7.d(kzaVar)) {
                        bm3VarK = wxaVar.k();
                        if (bm3VarK instanceof u09) {
                            clsD = sqf.q((u09) bm3VarK);
                        } else {
                            clsD = xm7Var.d();
                        }
                    }
                    clsD = xm7Var.d().getEnclosingClass();
                } else if (sl7.d(kzaVar)) {
                    clsD = xm7Var.d().getEnclosingClass();
                } else {
                    bm3VarK = wxaVar.k();
                    if (bm3VarK instanceof u09) {
                        clsD = sqf.q((u09) bm3VarK);
                    } else {
                        clsD = xm7Var.d();
                    }
                }
                if (clsD == null) {
                    return null;
                }
                try {
                    return clsD.getDeclaredField(rk7VarB.G0);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            case 1:
                xm7 xm7Var2 = uy3Var.v;
                String str = uy3Var.w;
                String str2 = uy3Var.x;
                xm7Var2.getClass();
                str.getClass();
                str2.getClass();
                um8 um8VarE = xm7.a.e(str2);
                if (um8VarE != null) {
                    String str3 = (String) ((sm8) um8VarE.a()).get(1);
                    wxa wxaVarK = xm7Var2.K(Integer.parseInt(str3));
                    if (wxaVarK != null) {
                        return wxaVarK;
                    }
                    StringBuilder sbP = tec.p("Local property #", str3, " not found in ");
                    sbP.append(xm7Var2.d());
                    throw new pt7(sbP.toString());
                }
                Collection collectionN = xm7Var2.N(t99.e(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionN) {
                    if (pa7.t(n8c.b((wxa) obj).r(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbO = ib8.o("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                    sbO.append(xm7Var2);
                    throw new pt7(sbO.toString());
                }
                if (arrayList.size() == 1) {
                    return (wxa) s72.X0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    rz3 visibility = ((wxa) obj2).getVisibility();
                    Object arrayList2 = linkedHashMap.get(visibility);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                TreeMap treeMap = new TreeMap(new ww2(29));
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                collectionValues.getClass();
                List list = (List) s72.E0(collectionValues);
                if (list.size() == 1) {
                    return (wxa) s72.v0(list);
                }
                String strD0 = s72.D0(xm7Var2.N(t99.e(str)), "\n", null, null, tj7.e, 30);
                StringBuilder sbO2 = ib8.o("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbO2.append(xm7Var2);
                sbO2.append(':');
                sbO2.append(strD0.length() == 0 ? " no members found" : "\n".concat(strD0));
                throw new pt7(sbO2.toString());
            default:
                return uy3Var.h().getReturnType();
        }
    }
}
