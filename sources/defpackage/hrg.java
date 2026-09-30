package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hrg {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ int b;

    public hrg(int i) {
        this.b = i;
    }

    public static uqg c(kxa kxaVar, ArrayList arrayList) {
        isg isgVar = isg.ADD;
        jcc.n("FN", 2, arrayList);
        vqg vqgVarG = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
        vqg vqgVarG2 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1));
        if (!(vqgVarG2 instanceof smg)) {
            qc0.j(ub3.i("FN requires an ArrayValue of parameter names found ", vqgVarG2.getClass().getCanonicalName()));
            return null;
        }
        List listN = ((smg) vqgVarG2).n();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new uqg(vqgVarG.d(), (ArrayList) listN, arrayList2, kxaVar);
    }

    public static boolean d(vqg vqgVar, vqg vqgVar2) {
        if (vqgVar instanceof oqg) {
            vqgVar = new erg(vqgVar.d());
        }
        if (vqgVar2 instanceof oqg) {
            vqgVar2 = new erg(vqgVar2.d());
        }
        if ((vqgVar instanceof erg) && (vqgVar2 instanceof erg)) {
            return ((erg) vqgVar).a.compareTo(((erg) vqgVar2).a) < 0;
        }
        double dDoubleValue = vqgVar.j().doubleValue();
        double dDoubleValue2 = vqgVar2.j().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static vqg e(csg csgVar, vqg vqgVar, vqg vqgVar2) {
        if (vqgVar instanceof Iterable) {
            return g(csgVar, ((Iterable) vqgVar).iterator(), vqgVar2);
        }
        qc0.j("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(vqg vqgVar, vqg vqgVar2) {
        if (vqgVar.getClass().equals(vqgVar2.getClass())) {
            if ((vqgVar instanceof grg) || (vqgVar instanceof tqg)) {
                return true;
            }
            if (vqgVar instanceof vog) {
                return (Double.isNaN(vqgVar.j().doubleValue()) || Double.isNaN(vqgVar2.j().doubleValue()) || vqgVar.j().doubleValue() != vqgVar2.j().doubleValue()) ? false : true;
            }
            if (vqgVar instanceof erg) {
                return vqgVar.d().equals(vqgVar2.d());
            }
            if (vqgVar instanceof lng) {
                return vqgVar.a().equals(vqgVar2.a());
            }
            return vqgVar == vqgVar2;
        }
        if (((vqgVar instanceof grg) || (vqgVar instanceof tqg)) && ((vqgVar2 instanceof grg) || (vqgVar2 instanceof tqg))) {
            return true;
        }
        boolean z = vqgVar instanceof vog;
        if (z && (vqgVar2 instanceof erg)) {
            return f(vqgVar, new vog(vqgVar2.j()));
        }
        boolean z2 = vqgVar instanceof erg;
        if (z2 && (vqgVar2 instanceof vog)) {
            return f(new vog(vqgVar.j()), vqgVar2);
        }
        if (vqgVar instanceof lng) {
            return f(new vog(vqgVar.j()), vqgVar2);
        }
        if (vqgVar2 instanceof lng) {
            return f(vqgVar, new vog(vqgVar2.j()));
        }
        if ((z2 || z) && (vqgVar2 instanceof oqg)) {
            return f(vqgVar, new erg(vqgVar2.d()));
        }
        if ((vqgVar instanceof oqg) && ((vqgVar2 instanceof erg) || (vqgVar2 instanceof vog))) {
            return f(new erg(vqgVar.d()), vqgVar2);
        }
        return false;
    }

    public static vqg g(csg csgVar, Iterator it, vqg vqgVar) {
        if (it != null) {
            while (it.hasNext()) {
                vqg vqgVarO = csgVar.f((vqg) it.next()).o((smg) vqgVar);
                if (vqgVarO instanceof fog) {
                    fog fogVar = (fog) vqgVarO;
                    String str = fogVar.b;
                    if ("break".equals(str)) {
                        return vqg.v0;
                    }
                    if ("return".equals(str)) {
                        return fogVar;
                    }
                }
            }
        }
        return vqg.v0;
    }

    public static boolean h(vqg vqgVar, vqg vqgVar2) {
        if (vqgVar instanceof oqg) {
            vqgVar = new erg(vqgVar.d());
        }
        if (vqgVar2 instanceof oqg) {
            vqgVar2 = new erg(vqgVar2.d());
        }
        return (((vqgVar instanceof erg) && (vqgVar2 instanceof erg)) || !(Double.isNaN(vqgVar.j().doubleValue()) || Double.isNaN(vqgVar2.j().doubleValue()))) && !d(vqgVar2, vqgVar);
    }

    /* JADX WARN: Code duplicated, block: B:401:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:564:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v315 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v340, types: [smg] */
    /* JADX WARN: Type inference failed for: r10v347, types: [rqg] */
    /* JADX WARN: Type inference failed for: r10v383 */
    /* JADX WARN: Type inference failed for: r10v384 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kxa] */
    /* JADX WARN: Type inference failed for: r7v54, types: [vqg] */
    public final vqg a(String str, kxa kxaVar, ArrayList arrayList) {
        boolean zF;
        boolean zF2;
        vqg vqgVar;
        vqg vqgVarO;
        grg grgVar;
        fog fogVar;
        vqg ergVar;
        ?? smgVar;
        String str2;
        int i = 0;
        switch (this.b) {
            case 0:
                isg isgVar = isg.ADD;
                switch (jcc.q(str).ordinal()) {
                    case 4:
                        jcc.m("BITWISE_AND", 2, arrayList);
                        return new vog(Double.valueOf(jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue()) & jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue())));
                    case 5:
                        jcc.m("BITWISE_LEFT_SHIFT", 2, arrayList);
                        return new vog(Double.valueOf(jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue()) << ((int) (((long) jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue())) & 31))));
                    case 6:
                        jcc.m("BITWISE_NOT", 1, arrayList);
                        return new vog(Double.valueOf(~jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue())));
                    case 7:
                        jcc.m("BITWISE_OR", 2, arrayList);
                        return new vog(Double.valueOf(jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue()) | jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue())));
                    case 8:
                        jcc.m("BITWISE_RIGHT_SHIFT", 2, arrayList);
                        return new vog(Double.valueOf(jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue()) >> ((int) (((long) jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue())) & 31))));
                    case 9:
                        jcc.m("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, arrayList);
                        return new vog(Double.valueOf((((long) jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue())) & 4294967295L) >>> ((int) (((long) jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue())) & 31))));
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        jcc.m("BITWISE_XOR", 2, arrayList);
                        return new vog(Double.valueOf(jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue()) ^ jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                jcc.m(jcc.q(str).name(), 2, arrayList);
                vqg vqgVarG = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                vqg vqgVarG2 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1));
                int iOrdinal = jcc.q(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zF2 = f(vqgVarG, vqgVarG2);
                    } else if (iOrdinal == 42) {
                        zF = d(vqgVarG, vqgVarG2);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zF = d(vqgVarG2, vqgVarG);
                                break;
                            case 38:
                                zF = h(vqgVarG2, vqgVarG);
                                break;
                            case 39:
                                zF = jcc.r(vqgVarG, vqgVarG2);
                                break;
                            case 40:
                                zF2 = jcc.r(vqgVarG, vqgVarG2);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        zF = h(vqgVarG, vqgVarG2);
                    }
                    zF = !zF2;
                } else {
                    zF = f(vqgVarG, vqgVarG2);
                }
                return zF ? vqg.A0 : vqg.B0;
            case 2:
                isg isgVar2 = isg.ADD;
                int iOrdinal2 = jcc.q(str).ordinal();
                if (iOrdinal2 == 2) {
                    jcc.m("APPLY", 3, arrayList);
                    vqg vqgVar2 = (vqg) arrayList.get(0);
                    vea veaVar = (vea) kxaVar.b;
                    vea veaVar2 = (vea) kxaVar.b;
                    vqg vqgVarG3 = veaVar.G(kxaVar, vqgVar2);
                    String strD = veaVar2.G(kxaVar, (vqg) arrayList.get(1)).d();
                    vqg vqgVarG4 = veaVar2.G(kxaVar, (vqg) arrayList.get(2));
                    if (!(vqgVarG4 instanceof smg)) {
                        qc0.j(ub3.i("Function arguments for Apply are not a list found ", vqgVarG4.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!strD.isEmpty()) {
                        return vqgVarG3.g(strD, kxaVar, (ArrayList) ((smg) vqgVarG4).n());
                    }
                    qc0.j("Function name for apply is undefined");
                    return null;
                }
                if (iOrdinal2 == 15) {
                    jcc.m("BREAK", 0, arrayList);
                    return vqg.x0;
                }
                if (iOrdinal2 == 25) {
                    return c(kxaVar, arrayList);
                }
                if (iOrdinal2 == 41) {
                    jcc.n("IF", 2, arrayList);
                    vqg vqgVar3 = (vqg) arrayList.get(0);
                    vea veaVar3 = (vea) kxaVar.b;
                    vea veaVar4 = (vea) kxaVar.b;
                    vqg vqgVarG5 = veaVar3.G(kxaVar, vqgVar3);
                    vqg vqgVarG6 = veaVar4.G(kxaVar, (vqg) arrayList.get(1));
                    vqg vqgVarG7 = arrayList.size() > 2 ? veaVar4.G(kxaVar, (vqg) arrayList.get(2)) : null;
                    grg grgVar2 = vqg.v0;
                    if (!vqgVarG5.a().booleanValue()) {
                        if (vqgVarG7 != null) {
                            vqgVarO = kxaVar.o((smg) vqgVarG7);
                        } else {
                            vqgVar = grgVar2;
                        }
                        if (true != (vqgVar instanceof fog)) {
                            return grgVar2;
                        }
                        return vqgVar;
                    }
                    vqgVarO = kxaVar.o((smg) vqgVarG6);
                    vqgVar = vqgVarO;
                    if (true != (vqgVar instanceof fog)) {
                        return grgVar2;
                    }
                    return vqgVar;
                }
                if (iOrdinal2 == 54) {
                    return new smg(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return vqg.z0;
                    }
                    jcc.m("RETURN", 1, arrayList);
                    return new fog("return", ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        jcc.n("DEFINE_FUNCTION", 2, arrayList);
                        uqg uqgVarC = c(kxaVar, arrayList);
                        String str3 = uqgVarC.a;
                        if (str3 == null) {
                            kxaVar.x("", uqgVarC);
                            return uqgVarC;
                        }
                        kxaVar.x(str3, uqgVarC);
                        return uqgVarC;
                    }
                    if (iOrdinal2 == 60) {
                        jcc.m("SWITCH", 3, arrayList);
                        vqg vqgVar4 = (vqg) arrayList.get(0);
                        vea veaVar5 = (vea) kxaVar.b;
                        vea veaVar6 = (vea) kxaVar.b;
                        vqg vqgVarG8 = veaVar5.G(kxaVar, vqgVar4);
                        vqg vqgVarG9 = veaVar6.G(kxaVar, (vqg) arrayList.get(1));
                        vqg vqgVarG10 = veaVar6.G(kxaVar, (vqg) arrayList.get(2));
                        if (!(vqgVarG9 instanceof smg)) {
                            qc0.j("Malformed SWITCH statement, cases are not a list");
                            return null;
                        }
                        if (!(vqgVarG10 instanceof smg)) {
                            qc0.j("Malformed SWITCH statement, case statements are not a list");
                            return null;
                        }
                        smg smgVar2 = (smg) vqgVarG9;
                        smg smgVar3 = (smg) vqgVarG10;
                        boolean z = false;
                        for (int i2 = 0; i2 < smgVar2.p(); i2++) {
                            if (z || vqgVarG8.equals(veaVar6.G(kxaVar, smgVar2.q(i2)))) {
                                vqg vqgVarG11 = veaVar6.G(kxaVar, smgVar3.q(i2));
                                if (vqgVarG11 instanceof fog) {
                                    return ((fog) vqgVarG11).b.equals("break") ? vqg.v0 : vqgVarG11;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (smgVar2.p() + 1 == smgVar3.p()) {
                            vqg vqgVarG12 = veaVar6.G(kxaVar, smgVar3.q(smgVar2.p()));
                            if (vqgVarG12 instanceof fog) {
                                String str4 = ((fog) vqgVarG12).b;
                                if (str4.equals("return") || str4.equals("continue")) {
                                    return vqgVarG12;
                                }
                            }
                        }
                        return vqg.v0;
                    }
                    if (iOrdinal2 == 61) {
                        jcc.m("TERNARY", 3, arrayList);
                        vqg vqgVar5 = (vqg) arrayList.get(0);
                        vea veaVar7 = (vea) kxaVar.b;
                        vea veaVar8 = (vea) kxaVar.b;
                        return veaVar7.G(kxaVar, vqgVar5).a().booleanValue() ? veaVar8.G(kxaVar, (vqg) arrayList.get(1)) : veaVar8.G(kxaVar, (vqg) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            return kxaVar.v().o(new smg(arrayList));
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            jcc.m("BREAK", 0, arrayList);
                            return vqg.y0;
                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            break;
                        default:
                            b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return vqg.v0;
                }
                vqg vqgVarG13 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                return vqgVarG13 instanceof smg ? kxaVar.o((smg) vqgVarG13) : vqg.v0;
            case 3:
                isg isgVar3 = isg.ADD;
                int iOrdinal3 = jcc.q(str).ordinal();
                if (iOrdinal3 == 1) {
                    jcc.m("AND", 2, arrayList);
                    vqg vqgVarG14 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                    if (vqgVarG14.a().booleanValue()) {
                        return ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1));
                    }
                    return vqgVarG14;
                }
                if (iOrdinal3 == 47) {
                    jcc.m("NOT", 1, arrayList);
                    return new lng(Boolean.valueOf(!((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).a().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    b(str);
                    throw null;
                }
                jcc.m("OR", 2, arrayList);
                vqg vqgVarG15 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                if (vqgVarG15.a().booleanValue()) {
                    return vqgVarG15;
                }
                return ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1));
            case 4:
                isg isgVar4 = isg.ADD;
                int iOrdinal4 = jcc.q(str).ordinal();
                if (iOrdinal4 == 65) {
                    jcc.m("WHILE", 4, arrayList);
                    vqg vqgVar6 = (vqg) arrayList.get(0);
                    vqg vqgVar7 = (vqg) arrayList.get(1);
                    vqg vqgVar8 = (vqg) arrayList.get(2);
                    vqg vqgVar9 = (vqg) arrayList.get(3);
                    vea veaVar9 = (vea) kxaVar.b;
                    vea veaVar10 = (vea) kxaVar.b;
                    vqg vqgVarG16 = veaVar9.G(kxaVar, vqgVar9);
                    if (veaVar10.G(kxaVar, vqgVar8).a().booleanValue()) {
                        vqg vqgVarO2 = kxaVar.o((smg) vqgVarG16);
                        if (vqgVarO2 instanceof fog) {
                            fog fogVar2 = (fog) vqgVarO2;
                            String str5 = fogVar2.b;
                            if ("break".equals(str5)) {
                                return vqg.v0;
                            }
                            if ("return".equals(str5)) {
                                return fogVar2;
                            }
                        }
                    }
                    while (veaVar10.G(kxaVar, vqgVar6).a().booleanValue()) {
                        vqg vqgVarO3 = kxaVar.o((smg) vqgVarG16);
                        if (vqgVarO3 instanceof fog) {
                            fog fogVar3 = (fog) vqgVarO3;
                            String str6 = fogVar3.b;
                            if ("break".equals(str6)) {
                                return vqg.v0;
                            }
                            if ("return".equals(str6)) {
                                return fogVar3;
                            }
                        }
                        kxaVar.n(vqgVar7);
                    }
                    return vqg.v0;
                }
                switch (iOrdinal4) {
                    case 26:
                        jcc.m("FOR_IN", 3, arrayList);
                        if (!(arrayList.get(0) instanceof erg)) {
                            qc0.j("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String strD2 = ((vqg) arrayList.get(0)).d();
                        vqg vqgVarG17 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1));
                        vqg vqgVarG18 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(2));
                        Iterator itC = vqgVarG17.c();
                        if (itC != null) {
                            while (itC.hasNext()) {
                                kxaVar.y(strD2, (vqg) itC.next());
                                vqg vqgVarO4 = kxaVar.o((smg) vqgVarG18);
                                if (vqgVarO4 instanceof fog) {
                                    fogVar = (fog) vqgVarO4;
                                    String str7 = fogVar.b;
                                    if ("break".equals(str7)) {
                                        grgVar = vqg.v0;
                                    } else if ("return".equals(str7)) {
                                        return fogVar;
                                    }
                                }
                            }
                            grgVar = vqg.v0;
                        } else {
                            grgVar = vqg.v0;
                        }
                        return grgVar;
                    case 27:
                        jcc.m("FOR_IN_CONST", 3, arrayList);
                        if (arrayList.get(0) instanceof erg) {
                            return g(new zrg(kxaVar, ((vqg) arrayList.get(0)).d(), 0), ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).c(), ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(2)));
                        }
                        qc0.j("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case 28:
                        jcc.m("FOR_IN_LET", 3, arrayList);
                        if (!(arrayList.get(0) instanceof erg)) {
                            qc0.j("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String strD3 = ((vqg) arrayList.get(0)).d();
                        vqg vqgVarG19 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1));
                        vqg vqgVarG20 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(2));
                        Iterator itC2 = vqgVarG19.c();
                        if (itC2 != null) {
                            while (itC2.hasNext()) {
                                vqg vqgVar10 = (vqg) itC2.next();
                                kxa kxaVarV = kxaVar.v();
                                kxaVarV.y(strD3, vqgVar10);
                                vqg vqgVarO5 = kxaVarV.o((smg) vqgVarG20);
                                if (vqgVarO5 instanceof fog) {
                                    fogVar = (fog) vqgVarO5;
                                    String str8 = fogVar.b;
                                    if ("break".equals(str8)) {
                                        grgVar = vqg.v0;
                                    } else if ("return".equals(str8)) {
                                        return fogVar;
                                    }
                                }
                            }
                            grgVar = vqg.v0;
                        } else {
                            grgVar = vqg.v0;
                        }
                        return grgVar;
                    case 29:
                        jcc.m("FOR_LET", 4, arrayList);
                        vqg vqgVar11 = (vqg) arrayList.get(0);
                        vea veaVar11 = (vea) kxaVar.b;
                        vea veaVar12 = (vea) kxaVar.b;
                        vqg vqgVarG21 = veaVar11.G(kxaVar, vqgVar11);
                        if (!(vqgVarG21 instanceof smg)) {
                            qc0.j("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        smg smgVar4 = (smg) vqgVarG21;
                        vqg vqgVar12 = (vqg) arrayList.get(1);
                        vqg vqgVar13 = (vqg) arrayList.get(2);
                        vqg vqgVarG22 = veaVar12.G(kxaVar, (vqg) arrayList.get(3));
                        kxa kxaVarV2 = kxaVar.v();
                        for (int i3 = 0; i3 < smgVar4.p(); i3++) {
                            String strD4 = smgVar4.q(i3).d();
                            kxaVarV2.x(strD4, kxaVar.z(strD4));
                        }
                        while (veaVar12.G(kxaVar, vqgVar12).a().booleanValue()) {
                            vqg vqgVarO6 = kxaVar.o((smg) vqgVarG22);
                            if (vqgVarO6 instanceof fog) {
                                fog fogVar4 = (fog) vqgVarO6;
                                String str9 = fogVar4.b;
                                if ("break".equals(str9)) {
                                    return vqg.v0;
                                }
                                if ("return".equals(str9)) {
                                    return fogVar4;
                                }
                            }
                            kxa kxaVarV3 = kxaVar.v();
                            for (int i4 = 0; i4 < smgVar4.p(); i4++) {
                                String strD5 = smgVar4.q(i4).d();
                                kxaVarV3.x(strD5, kxaVarV2.z(strD5));
                            }
                            kxaVarV3.n(vqgVar13);
                            kxaVarV2 = kxaVarV3;
                        }
                        return vqg.v0;
                    case 30:
                        jcc.m("FOR_OF", 3, arrayList);
                        if (arrayList.get(0) instanceof erg) {
                            return e(new zrg(kxaVar, ((vqg) arrayList.get(0)).d(), 1), ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)), ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(2)));
                        }
                        qc0.j("Variable name in FOR_OF must be a string");
                        return null;
                    case 31:
                        jcc.m("FOR_OF_CONST", 3, arrayList);
                        if (arrayList.get(0) instanceof erg) {
                            return e(new zrg(kxaVar, ((vqg) arrayList.get(0)).d(), 0), ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)), ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(2)));
                        }
                        qc0.j("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                        jcc.m("FOR_OF_LET", 3, arrayList);
                        if (arrayList.get(0) instanceof erg) {
                            return e(new vea(29, kxaVar, ((vqg) arrayList.get(0)).d()), ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)), ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(2)));
                        }
                        qc0.j("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        b(str);
                        throw null;
                }
            case 5:
                isg isgVar5 = isg.ADD;
                int iOrdinal5 = jcc.q(str).ordinal();
                if (iOrdinal5 == 0) {
                    jcc.m("ADD", 2, arrayList);
                    vqg vqgVarG23 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                    vqg vqgVarG24 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1));
                    ergVar = ((vqgVarG23 instanceof oqg) || (vqgVarG23 instanceof erg) || (vqgVarG24 instanceof oqg) || (vqgVarG24 instanceof erg)) ? new erg(String.valueOf(vqgVarG23.d()).concat(String.valueOf(vqgVarG24.d()))) : new vog(Double.valueOf(vqgVarG24.j().doubleValue() + vqgVarG23.j().doubleValue()));
                } else if (iOrdinal5 == 21) {
                    jcc.m("DIVIDE", 2, arrayList);
                    ergVar = new vog(Double.valueOf(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue() / ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue()));
                } else {
                    if (iOrdinal5 == 59) {
                        jcc.m("SUBTRACT", 2, arrayList);
                        return new vog(Double.valueOf(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue() + (-((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue())));
                    }
                    if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                        jcc.m(str, 2, arrayList);
                        vqg vqgVarG25 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                        kxaVar.n((vqg) arrayList.get(1));
                        return vqgVarG25;
                    }
                    if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                        jcc.m(str, 1, arrayList);
                        return ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                    }
                    switch (iOrdinal5) {
                        case 44:
                            jcc.m("MODULUS", 2, arrayList);
                            ergVar = new vog(Double.valueOf(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue() % ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue()));
                            break;
                        case 45:
                            jcc.m("MULTIPLY", 2, arrayList);
                            return new vog(Double.valueOf(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue() * ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue()));
                        case 46:
                            jcc.m("NEGATE", 1, arrayList);
                            return new vog(Double.valueOf(-((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return ergVar;
            case 6:
                if (str == null || str.isEmpty() || !kxaVar.w(str)) {
                    qc0.j(ub3.i("Command not found: ", str));
                    return null;
                }
                vqg vqgVarZ = kxaVar.z(str);
                if (vqgVarZ instanceof qpg) {
                    return ((qpg) vqgVarZ).b(kxaVar, arrayList);
                }
                qc0.j(ib8.j("Function ", str, " is not defined"));
                return null;
            default:
                isg isgVar6 = isg.ADD;
                int iOrdinal6 = jcc.q(str).ordinal();
                if (iOrdinal6 == 3) {
                    jcc.m("ASSIGN", 2, arrayList);
                    vqg vqgVarG26 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                    if (!(vqgVarG26 instanceof erg)) {
                        qc0.j(ub3.i("Expected string for assign var. got ", vqgVarG26.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((erg) vqgVarG26).a;
                    if (!kxaVar.w(str10)) {
                        qc0.j(ub3.i("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    vqg vqgVarG27 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1));
                    kxaVar.x(str10, vqgVarG27);
                    return vqgVarG27;
                }
                if (iOrdinal6 == 14) {
                    jcc.n("CONST", 2, arrayList);
                    if (arrayList.size() % 2 != 0) {
                        qc0.j(tec.e(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i < arrayList.size() - 1) {
                        vqg vqgVarG28 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(i));
                        if (!(vqgVarG28 instanceof erg)) {
                            qc0.j(ub3.i("Expected string for const name. got ", vqgVarG28.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((erg) vqgVarG28).a;
                        kxaVar.y(str11, ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(i + 1)));
                        ((HashMap) kxaVar.d).put(str11, Boolean.TRUE);
                        i += 2;
                    }
                    return vqg.v0;
                }
                if (iOrdinal6 == 24) {
                    jcc.n("EXPRESSION_LIST", 1, arrayList);
                    smgVar = vqg.v0;
                    while (i < arrayList.size()) {
                        vqg vqgVarG29 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(i));
                        if (vqgVarG29 instanceof fog) {
                            qc0.p("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i++;
                        smgVar = vqgVarG29;
                    }
                } else {
                    if (iOrdinal6 == 33) {
                        jcc.m("GET", 1, arrayList);
                        vqg vqgVarG30 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                        if (vqgVarG30 instanceof erg) {
                            return kxaVar.z(((erg) vqgVarG30).a);
                        }
                        qc0.j(ub3.i("Expected string for get var. got ", vqgVarG30.getClass().getCanonicalName()));
                        return null;
                    }
                    if (iOrdinal6 == 49) {
                        jcc.m("NULL", 0, arrayList);
                        return vqg.w0;
                    }
                    if (iOrdinal6 == 58) {
                        jcc.m("SET_PROPERTY", 3, arrayList);
                        vqg vqgVar14 = (vqg) arrayList.get(0);
                        vea veaVar13 = (vea) kxaVar.b;
                        vea veaVar14 = (vea) kxaVar.b;
                        vqg vqgVarG31 = veaVar13.G(kxaVar, vqgVar14);
                        vqg vqgVarG32 = veaVar14.G(kxaVar, (vqg) arrayList.get(1));
                        vqg vqgVarG33 = veaVar14.G(kxaVar, (vqg) arrayList.get(2));
                        if (vqgVarG31 == vqg.v0 || vqgVarG31 == vqg.w0) {
                            qc0.p(ub3.k("Can't set property ", vqgVarG32.d(), " of ", vqgVarG31.d()));
                            return null;
                        }
                        if ((vqgVarG31 instanceof smg) && (vqgVarG32 instanceof vog)) {
                            ((smg) vqgVarG31).r(((vog) vqgVarG32).a.intValue(), vqgVarG33);
                        } else if (vqgVarG31 instanceof oqg) {
                            ((oqg) vqgVarG31).i(vqgVarG32.d(), vqgVarG33);
                        }
                        return vqgVarG33;
                    }
                    if (iOrdinal6 != 17) {
                        if (iOrdinal6 != 18) {
                            if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                                jcc.m("GET_PROPERTY", 2, arrayList);
                                vqg vqgVarG34 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                                vqg vqgVarG35 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1));
                                if ((vqgVarG34 instanceof smg) && jcc.p(vqgVarG35)) {
                                    return ((smg) vqgVarG34).q(vqgVarG35.j().intValue());
                                }
                                if (vqgVarG34 instanceof oqg) {
                                    return ((oqg) vqgVarG34).e(vqgVarG35.d());
                                }
                                if (vqgVarG34 instanceof erg) {
                                    if ("length".equals(vqgVarG35.d())) {
                                        return new vog(Double.valueOf(((erg) vqgVarG34).a.length()));
                                    }
                                    if (jcc.p(vqgVarG35)) {
                                        double dDoubleValue = vqgVarG35.j().doubleValue();
                                        String str12 = ((erg) vqgVarG34).a;
                                        if (dDoubleValue < str12.length()) {
                                            return new erg(String.valueOf(str12.charAt(vqgVarG35.j().intValue())));
                                        }
                                    }
                                }
                                return vqg.v0;
                            }
                            switch (iOrdinal6) {
                                case 62:
                                    jcc.m("TYPEOF", 1, arrayList);
                                    vqg vqgVarG36 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                                    if (vqgVarG36 instanceof grg) {
                                        str2 = "undefined";
                                    } else if (vqgVarG36 instanceof lng) {
                                        str2 = "boolean";
                                    } else if (vqgVarG36 instanceof vog) {
                                        str2 = "number";
                                    } else if (vqgVarG36 instanceof erg) {
                                        str2 = "string";
                                    } else if (vqgVarG36 instanceof uqg) {
                                        str2 = "function";
                                    } else {
                                        if ((vqgVarG36 instanceof yqg) || (vqgVarG36 instanceof fog)) {
                                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", vqgVarG36));
                                        }
                                        str2 = "object";
                                    }
                                    return new erg(str2);
                                case 63:
                                    jcc.m("UNDEFINED", 0, arrayList);
                                    return vqg.v0;
                                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                    jcc.n("VAR", 1, arrayList);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        vqg vqgVarG37 = ((vea) kxaVar.b).G(kxaVar, (vqg) it.next());
                                        if (!(vqgVarG37 instanceof erg)) {
                                            qc0.j(ub3.i("Expected string for var name. got ", vqgVarG37.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        kxaVar.y(((erg) vqgVarG37).a, vqg.v0);
                                    }
                                    return vqg.v0;
                                default:
                                    b(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new rqg();
                        }
                        if (arrayList.size() % 2 != 0) {
                            qc0.j(tec.e(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        smgVar = new rqg();
                        while (i < arrayList.size() - 1) {
                            vqg vqgVarG38 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(i));
                            vqg vqgVarG39 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(i + 1));
                            if ((vqgVarG38 instanceof fog) || (vqgVarG39 instanceof fog)) {
                                qc0.p("Failed to evaluate map entry");
                                return null;
                            }
                            smgVar.i(vqgVarG38.d(), vqgVarG39);
                            i += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new smg();
                        }
                        smgVar = new smg();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            vqg vqgVarG40 = ((vea) kxaVar.b).G(kxaVar, (vqg) it2.next());
                            if (vqgVarG40 instanceof fog) {
                                qc0.p("Failed to evaluate array element");
                                return null;
                            }
                            smgVar.r(i, vqgVarG40);
                            i++;
                        }
                    }
                }
                return smgVar;
        }
    }

    public final void b(String str) {
        if (!this.a.contains(jcc.q(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
