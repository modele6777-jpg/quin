package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b10 {
    public static final LinkedHashMap c;
    public final egh a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (y00 y00Var : y00.values()) {
            String strA = y00Var.a();
            if (linkedHashMap.get(strA) == null) {
                linkedHashMap.put(strA, y00Var);
            }
        }
        c = linkedHashMap;
    }

    public b10(egh eghVar) {
        this.a = eghVar;
    }

    public static ArrayList a(Object obj, boolean z) {
        Map mapG = ((u00) obj).g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapG.entrySet()) {
            x72.g0(arrayList, (!z || pa7.t((t99) entry.getKey(), pj7.b)) ? k((bl2) entry.getValue()) : pu4.a);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:70:0x0138  */
    public static xf7 b(b10 b10Var, xf7 xf7Var, h10 h10Var) {
        boolean z;
        ge7 ge7Var;
        csb csbVarI;
        ge7 ge7Var2;
        Object objD;
        Object next;
        iy9 iy9Var;
        dag dagVarH;
        b10Var.getClass();
        egh eghVar = b10Var.a;
        boolean z2 = eghVar.b;
        if (!z2) {
            ArrayList<ge7> arrayList = new ArrayList();
            Iterator it = h10Var.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                csb csbVar = csb.IGNORE;
                ge7 ge7Var3 = null;
                if (z2 || (ge7Var = (ge7) he7.b.get(e(next2))) == null) {
                    ge7Var2 = null;
                } else {
                    dx5 dx5VarE = e(next2);
                    if (dx5VarE == null || !he7.a.containsKey(dx5VarE)) {
                        csbVarI = b10Var.i(next2);
                        if (csbVarI == null) {
                            csbVarI = ((nj7) eghVar.c).a;
                        }
                    } else {
                        csbVarI = (csb) ((x) eghVar.d).d(dx5VarE);
                    }
                    if (csbVarI == csbVar) {
                        csbVarI = null;
                    }
                    if (csbVarI == null) {
                        ge7Var2 = null;
                    } else {
                        dag dagVarA = dag.a(ge7Var.a, null, csbVarI.b(), 1);
                        Collection collection = ge7Var.b;
                        boolean z3 = ge7Var.c;
                        boolean z4 = ge7Var.d;
                        boolean z5 = ge7Var.e;
                        collection.getClass();
                        ge7Var2 = new ge7(dagVarA, collection, z3, z4, z5);
                    }
                }
                if (ge7Var2 != null) {
                    ge7Var3 = ge7Var2;
                } else {
                    if (((nj7) eghVar.c).d || (objD = d(next2, qj7.f)) == null) {
                        iy9Var = null;
                    } else {
                        Iterator it2 = f(next2).iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (b10Var.j(next) == null);
                        if (next == null) {
                            iy9Var = null;
                        } else {
                            ArrayList arrayListA = a(objD, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = arrayListA.iterator();
                            while (it3.hasNext()) {
                                y00 y00Var = (y00) c.get((String) it3.next());
                                if (y00Var != null) {
                                    linkedHashSet.add(y00Var);
                                }
                            }
                            if (linkedHashSet.contains(y00.TYPE_USE)) {
                                linkedHashSet = n3d.m(n3d.k(qd0.I0(y00.values()), y00.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                            }
                            iy9Var = new iy9(next, linkedHashSet);
                        }
                    }
                    if (iy9Var != null) {
                        Object objA = iy9Var.a();
                        Set set = (Set) iy9Var.b();
                        csb csbVarI2 = b10Var.i(next2);
                        if (csbVarI2 == null && (csbVarI2 = b10Var.i(objA)) == null) {
                            csbVarI2 = ((nj7) eghVar.c).a;
                        }
                        if (csbVarI2 != csbVar) {
                            objA.getClass();
                            dag dagVarH2 = b10Var.h(objA, false);
                            if (dagVarH2 == null) {
                                Object objJ = b10Var.j(objA);
                                if (objJ != null) {
                                    csb csbVarI3 = b10Var.i(objA);
                                    if (csbVarI3 == null) {
                                        csbVarI3 = ((nj7) eghVar.c).a;
                                    }
                                    if (csbVarI3 == csbVar || (dagVarH = b10Var.h(objJ, false)) == null) {
                                        dagVarH2 = null;
                                    } else {
                                        dagVarH2 = dag.a(dagVarH, null, csbVarI3.b(), 1);
                                    }
                                } else {
                                    dagVarH2 = null;
                                }
                            }
                            if (dagVarH2 != null) {
                                ge7Var3 = new ge7(dag.a(dagVarH2, null, csbVarI2.b(), 1), set, 28);
                            }
                        }
                    }
                }
                if (ge7Var3 != null) {
                    arrayList.add(ge7Var3);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(y00.class);
                for (ge7 ge7Var4 : arrayList) {
                    for (y00 y00Var2 : ge7Var4.b) {
                        enumMap.containsKey(y00Var2);
                        enumMap.put(y00Var2, ge7Var4);
                    }
                }
                EnumMap enumMap2 = xf7Var != null ? new EnumMap(xf7Var.a) : new EnumMap(y00.class);
                for (Map.Entry entry : enumMap.entrySet()) {
                    y00 y00Var3 = (y00) entry.getKey();
                    ge7 ge7Var5 = (ge7) entry.getValue();
                    if (ge7Var5 != null) {
                        enumMap2.put(y00Var3, ge7Var5);
                        z = true;
                    }
                }
                if (z) {
                    return new xf7(enumMap2);
                }
            }
        }
        return xf7Var;
    }

    public static dag c(Iterable iterable, a26 a26Var) {
        boolean z;
        Iterator it = iterable.iterator();
        dag dagVar = null;
        while (it.hasNext()) {
            dag dagVar2 = (dag) a26Var.d(it.next());
            if (dagVar != null) {
                boolean z2 = dagVar.b;
                if (dagVar2 != null && !dagVar2.equals(dagVar) && (!(z = dagVar2.b) || z2)) {
                    if (z || !z2) {
                        return null;
                    }
                }
            }
            dagVar = dagVar2;
        }
        return dagVar;
    }

    public static Object d(Object obj, dx5 dx5Var) {
        for (Object obj2 : f(obj)) {
            if (pa7.t(e(obj2), dx5Var)) {
                return obj2;
            }
        }
        return null;
    }

    public static dx5 e(Object obj) {
        u00 u00Var = (u00) obj;
        u00Var.getClass();
        return u00Var.f();
    }

    public static Iterable f(Object obj) {
        h10 annotations;
        u00 u00Var = (u00) obj;
        u00Var.getClass();
        u09 u09VarD = qz3.d(u00Var);
        return (u09VarD == null || (annotations = u09VarD.getAnnotations()) == null) ? pu4.a : annotations;
    }

    public static boolean g(Object obj, dx5 dx5Var) {
        Iterable iterableF = f(obj);
        if ((iterableF instanceof Collection) && ((Collection) iterableF).isEmpty()) {
            return false;
        }
        Iterator it = iterableF.iterator();
        while (it.hasNext()) {
            if (pa7.t(e(it.next()), dx5Var)) {
                return true;
            }
        }
        return false;
    }

    public static List k(bl2 bl2Var) {
        if (!(bl2Var instanceof pd0)) {
            return bl2Var instanceof rx4 ? t72.H(((rx4) bl2Var).c.c()) : pu4.a;
        }
        Iterable iterable = (Iterable) ((pd0) bl2Var).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            x72.g0(arrayList, k((bl2) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r8.equals("ALWAYS") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r8.equals("UNKNOWN") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r8.equals("NEVER") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r8.equals("MAYBE") == false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dag h(java.lang.Object r8, boolean r9) {
        /*
            r7 = this;
            dx5 r0 = e(r8)
            r1 = 0
            if (r0 != 0) goto L9
            goto L90
        L9:
            egh r7 = r7.a
            java.lang.Object r7 = r7.d
            x r7 = (defpackage.x) r7
            java.lang.Object r7 = r7.d(r0)
            csb r7 = (defpackage.csb) r7
            r7.getClass()
            csb r2 = defpackage.csb.IGNORE
            if (r7 != r2) goto L1d
            return r1
        L1d:
            java.util.Set r2 = defpackage.qj7.k
            boolean r2 = r2.contains(r0)
            vj9 r3 = defpackage.vj9.c
            r4 = 0
            if (r2 == 0) goto L29
            goto L81
        L29:
            java.util.Set r2 = defpackage.qj7.l
            boolean r2 = r2.contains(r0)
            vj9 r5 = defpackage.vj9.b
            if (r2 == 0) goto L35
        L33:
            r3 = r5
            goto L81
        L35:
            java.util.Set r2 = defpackage.qj7.m
            boolean r2 = r2.contains(r0)
            vj9 r6 = defpackage.vj9.a
            if (r2 == 0) goto L41
        L3f:
            r3 = r6
            goto L81
        L41:
            dx5 r2 = defpackage.qj7.g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L90
            java.util.ArrayList r8 = a(r8, r4)
            java.lang.Object r8 = defpackage.s72.w0(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L81
            int r0 = r8.hashCode()
            switch(r0) {
                case 73135176: goto L78;
                case 74175084: goto L6f;
                case 433141802: goto L66;
                case 1933739535: goto L5d;
                default: goto L5c;
            }
        L5c:
            goto L90
        L5d:
            java.lang.String r0 = "ALWAYS"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L90
            goto L81
        L66:
            java.lang.String r0 = "UNKNOWN"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L3f
            goto L90
        L6f:
            java.lang.String r0 = "NEVER"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L33
            goto L90
        L78:
            java.lang.String r0 = "MAYBE"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L33
            goto L90
        L81:
            dag r8 = new dag
            boolean r7 = r7.b()
            if (r7 != 0) goto L8b
            if (r9 == 0) goto L8c
        L8b:
            r4 = 1
        L8c:
            r8.<init>(r3, r4)
            return r8
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.h(java.lang.Object, boolean):dag");
    }

    public final csb i(Object obj) {
        String str;
        nj7 nj7Var = (nj7) this.a.c;
        csb csbVar = (csb) nj7Var.c.get(e(obj));
        if (csbVar != null) {
            return csbVar;
        }
        Object objD = d(obj, qj7.p);
        if (objD == null || (str = (String) s72.w0(a(objD, false))) == null) {
            return null;
        }
        csb csbVar2 = nj7Var.b;
        if (csbVar2 != null) {
            return csbVar2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return csb.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return csb.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return csb.WARN;
        }
        return null;
    }

    public final Object j(Object obj) {
        Object objJ;
        obj.getClass();
        if (!((nj7) this.a.c).d) {
            if (s72.o0(qj7.j, e(obj)) || g(obj, qj7.d)) {
                return obj;
            }
            if (g(obj, qj7.e)) {
                u09 u09VarD = qz3.d((u00) obj);
                u09VarD.getClass();
                ConcurrentHashMap concurrentHashMap = this.b;
                Object obj2 = concurrentHashMap.get(u09VarD);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = f(obj).iterator();
                do {
                    if (!it.hasNext()) {
                        objJ = null;
                        break;
                    }
                    objJ = j(it.next());
                } while (objJ == null);
                if (objJ != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(u09VarD, objJ);
                    return objPutIfAbsent == null ? objJ : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
