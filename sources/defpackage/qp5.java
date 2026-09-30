package defpackage;

import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;
import ai.askquin.ui.conversation.dialogue.NewReadingState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qp5 {
    public static final Set a = qd0.I0(new ClarifyingCardState[]{ClarifyingCardState.PendingDecision, ClarifyingCardState.Drawing, ClarifyingCardState.Interpreting});

    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ca A[EDGE_INSN: B:96:0x01ca->B:97:0x01cd BREAK  A[LOOP:8: B:71:0x0165->B:83:0x0190]] */
    public static pp5 a(Map map, List list) {
        NewReadingState newReadingState;
        String str;
        List list2;
        ft8 ft8Var;
        boolean z;
        gt8 gt8Var;
        ClarifyingCardState clarifyingCardState;
        String str2;
        Object objPrevious;
        list.getClass();
        map.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ft8) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof gt8) {
                arrayList2.add(obj2);
            }
        }
        int iF = bm8.F(t72.u(arrayList, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        for (Object obj3 : arrayList) {
            linkedHashMap.put(((ft8) obj3).a, obj3);
        }
        int iF2 = bm8.F(t72.u(arrayList2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2);
        for (Object obj4 : arrayList2) {
            linkedHashMap2.put(((gt8) obj4).a, obj4);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj5 : arrayList) {
            String str3 = ((ft8) obj5).c;
            Object arrayList3 = linkedHashMap3.get(str3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(str3, arrayList3);
            }
            ((List) arrayList3).add(obj5);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Object obj6 : arrayList2) {
            String str4 = ((gt8) obj6).d;
            Object arrayList4 = linkedHashMap4.get(str4);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap4.put(str4, arrayList4);
            }
            ((List) arrayList4).add(obj6);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        ArrayList<ht8> arrayList5 = new ArrayList();
        for (Object obj7 : list) {
            if (obj7 instanceof ht8) {
                arrayList5.add(obj7);
            }
        }
        ht8 ht8Var = (ht8) s72.H0(arrayList5);
        String str5 = ht8Var != null ? ht8Var.a : null;
        for (ht8 ht8Var2 : arrayList5) {
            String str6 = ht8Var2.d;
            String str7 = ht8Var2.a;
            if (str6 == null || (ft8Var = (ft8) linkedHashMap.get(str6)) == null) {
                list2 = (List) linkedHashMap3.get(str7);
                if (list2 != null) {
                    ft8Var = (ft8) s72.H0(list2);
                } else {
                    ft8Var = null;
                }
            } else {
                if (!pa7.t(ft8Var.c, str7)) {
                    ft8Var = null;
                }
                if (ft8Var == null) {
                    list2 = (List) linkedHashMap3.get(str7);
                    if (list2 != null) {
                        ft8Var = (ft8) s72.H0(list2);
                    } else {
                        ft8Var = null;
                    }
                }
            }
            if (ft8Var == null) {
                z = true;
                gt8Var = null;
                break;
            }
            String str8 = ft8Var.a;
            Iterator it = ((ArrayList) qd0.k0(new String[]{ht8Var2.e, ft8Var.d})).iterator();
            while (true) {
                if (!it.hasNext()) {
                    List list3 = (List) linkedHashMap4.get(str7);
                    if (list3 == null) {
                        z = true;
                        gt8Var = null;
                        break;
                    }
                    ListIterator listIterator = list3.listIterator(list3.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            z = true;
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                        gt8 gt8Var2 = (gt8) objPrevious;
                        z = true;
                        if (pa7.t(gt8Var2.d, str7) && pa7.t(gt8Var2.c, str8)) {
                            break;
                        }
                    }
                    gt8Var = (gt8) objPrevious;
                    break;
                }
                gt8Var = (gt8) linkedHashMap2.get((String) it.next());
                if (gt8Var != null) {
                    if (!pa7.t(gt8Var.d, str7) || !pa7.t(gt8Var.c, str8)) {
                        gt8Var = null;
                    }
                    if (gt8Var != null) {
                        z = true;
                        break;
                    }
                }
            }
            if (ht8Var2.c) {
                clarifyingCardState = ClarifyingCardState.Skipped;
            } else if (gt8Var != null && (str2 = gt8Var.b) != null && (!v4e.Q(str2)) == z) {
                clarifyingCardState = ClarifyingCardState.Completed;
            } else if (map.get(str7) == s12.a) {
                clarifyingCardState = ClarifyingCardState.Drawing;
            } else if (ft8Var != null) {
                clarifyingCardState = ClarifyingCardState.Interpreting;
            } else if (pa7.t(str7, str5)) {
                clarifyingCardState = map.get(str7) == s12.b ? ClarifyingCardState.Interpreting : ClarifyingCardState.PendingDecision;
            } else {
                clarifyingCardState = ClarifyingCardState.Stale;
            }
            linkedHashMap5.put(str7, new t12(ht8Var2, ft8Var, gt8Var, clarifyingCardState));
        }
        Collection collectionValues = linkedHashMap5.values();
        collectionValues.getClass();
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            gt8 gt8Var3 = ((t12) it2.next()).c;
            String str9 = gt8Var3 != null ? gt8Var3.a : null;
            if (str9 != null) {
                arrayList6.add(str9);
            }
        }
        Set setO1 = s72.o1(arrayList6);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj8 : list) {
            ot8 ot8Var = (ot8) obj8;
            if (ot8Var instanceof ft8 ? false : ot8Var instanceof gt8 ? setO1.contains(((gt8) ot8Var).a) : true) {
                arrayList7.add(obj8);
            }
        }
        ArrayList<jt8> arrayList8 = new ArrayList();
        for (Object obj9 : list) {
            if (obj9 instanceof jt8) {
                arrayList8.add(obj9);
            }
        }
        int iF3 = bm8.F(t72.u(arrayList8, 10));
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(iF3 < 16 ? 16 : iF3);
        for (jt8 jt8Var : arrayList8) {
            String str10 = jt8Var.a;
            String str11 = jt8Var.c;
            t68 t68Var = jt8Var.d;
            if (str11 == null) {
                str11 = t68Var != null ? t68Var.a : null;
            }
            if (str11 == null) {
                newReadingState = NewReadingState.NotStarted;
            } else {
                if (t68Var != null && (str = t68Var.c) != null) {
                    if (!v4e.Q(str)) {
                        newReadingState = NewReadingState.Completed;
                    }
                }
                newReadingState = NewReadingState.InProgress;
            }
            iy9 iy9Var = new iy9(str10, newReadingState);
            linkedHashMap6.put(iy9Var.d(), iy9Var.e());
        }
        Collection collectionValues2 = linkedHashMap5.values();
        collectionValues2.getClass();
        ArrayList arrayList9 = new ArrayList();
        Iterator it3 = collectionValues2.iterator();
        while (it3.hasNext()) {
            ft8 ft8Var2 = ((t12) it3.next()).b;
            if (ft8Var2 != null) {
                arrayList9.add(ft8Var2);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        Iterator it4 = arrayList9.iterator();
        while (it4.hasNext()) {
            x72.g0(arrayList10, ((ft8) it4.next()).b);
        }
        List listC1 = s72.c1(arrayList10, 3);
        Collection collectionValues3 = linkedHashMap5.values();
        collectionValues3.getClass();
        t12 t12Var = (t12) s72.G0(collectionValues3);
        return new pp5(arrayList7, linkedHashMap5, listC1, linkedHashMap6, str5, s72.o0(a, t12Var != null ? t12Var.d : null));
    }
}
