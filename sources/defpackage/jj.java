package defpackage;

import com.google.gson.JsonArray;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jj implements ei7 {
    public static final jj b = new jj(0);
    public static final jj c = new jj(1);
    public static final jj d = new jj(2);
    public static final jj e = new jj(3);
    public static final jj f = new jj(4);
    public static final jj g = new jj(5);
    public final /* synthetic */ int a;

    public /* synthetic */ jj(int i) {
        this.a = i;
    }

    @Override // defpackage.ei7
    public final Object a(kb6 kb6Var, ai7 ai7Var, Object obj, String str) throws ci7 {
        ArrayList arrayList;
        List list;
        ArrayList arrayList2;
        List list2;
        ArrayList arrayList3;
        List list3;
        ArrayList arrayList4;
        List list4;
        int i = 0;
        switch (this.a) {
            case 0:
                if (ai7Var.a.size() != 2) {
                    throw new ci7("all expects exactly 2 arguments", str);
                }
                Object objM = kb6Var.m(ai7Var.get(0), obj, str.concat("[0]"));
                if (objM == null) {
                    return Boolean.FALSE;
                }
                if (!cd0.a(objM)) {
                    throw new ci7("first argument to all must be a valid array", str);
                }
                if (objM instanceof List) {
                    list = (List) ((List) objM).stream().map(new fj0(5)).collect(Collectors.toList());
                } else {
                    if (objM.getClass().isArray()) {
                        arrayList = new ArrayList();
                        while (i < Array.getLength(objM)) {
                            arrayList.add(i, kb6.r(Array.get(objM, i)));
                            i++;
                        }
                    } else if (objM instanceof JsonArray) {
                        list = (List) g21.L((JsonArray) objM);
                    } else {
                        if (!(objM instanceof Iterable)) {
                            qc0.j("ArrayLike only works with lists, iterables, arrays, or JsonArray");
                            return null;
                        }
                        arrayList = new ArrayList();
                        Iterator it = ((Iterable) objM).iterator();
                        while (it.hasNext()) {
                            arrayList.add(kb6.r(it.next()));
                        }
                    }
                    list = arrayList;
                }
                if (list.size() < 1) {
                    return Boolean.FALSE;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!gg7.y(kb6Var.m(ai7Var.get(1), it2.next(), String.format("%s[%d]", str, 1)))) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            case 1:
                if (ai7Var.a.size() != 2) {
                    throw new ci7("filter expects exactly 2 arguments", str);
                }
                Object objM2 = kb6Var.m(ai7Var.get(0), obj, str.concat("[0]"));
                if (!cd0.a(objM2)) {
                    throw new ci7("first argument to filter must be a valid array", str.concat("[0]"));
                }
                ArrayList arrayList5 = new ArrayList();
                if (objM2 instanceof List) {
                    list2 = (List) ((List) objM2).stream().map(new fj0(5)).collect(Collectors.toList());
                } else {
                    if (objM2 != null && objM2.getClass().isArray()) {
                        arrayList2 = new ArrayList();
                        while (i < Array.getLength(objM2)) {
                            arrayList2.add(i, kb6.r(Array.get(objM2, i)));
                            i++;
                        }
                    } else if (objM2 instanceof JsonArray) {
                        list2 = (List) g21.L((JsonArray) objM2);
                    } else {
                        if (!(objM2 instanceof Iterable)) {
                            qc0.j("ArrayLike only works with lists, iterables, arrays, or JsonArray");
                            return null;
                        }
                        arrayList2 = new ArrayList();
                        Iterator it3 = ((Iterable) objM2).iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(kb6.r(it3.next()));
                        }
                    }
                    list2 = arrayList2;
                }
                for (Object obj2 : list2) {
                    if (gg7.y(kb6Var.m(ai7Var.get(1), obj2, str.concat("[1]")))) {
                        arrayList5.add(obj2);
                    }
                }
                return arrayList5;
            case 2:
                return Boolean.valueOf(!((Boolean) eh2.c.a(kb6Var, ai7Var, obj, str)).booleanValue());
            case 3:
                if (ai7Var.a.size() != 2) {
                    throw new ci7("map expects exactly 2 arguments", str);
                }
                Object objM3 = kb6Var.m(ai7Var.get(0), obj, str.concat("[0]"));
                if (!cd0.a(objM3)) {
                    return Collections.EMPTY_LIST;
                }
                ArrayList arrayList6 = new ArrayList();
                if (objM3 instanceof List) {
                    list3 = (List) ((List) objM3).stream().map(new fj0(5)).collect(Collectors.toList());
                } else {
                    if (objM3 != null && objM3.getClass().isArray()) {
                        arrayList3 = new ArrayList();
                        while (i < Array.getLength(objM3)) {
                            arrayList3.add(i, kb6.r(Array.get(objM3, i)));
                            i++;
                        }
                    } else if (objM3 instanceof JsonArray) {
                        list3 = (List) g21.L((JsonArray) objM3);
                    } else {
                        if (!(objM3 instanceof Iterable)) {
                            qc0.j("ArrayLike only works with lists, iterables, arrays, or JsonArray");
                            return null;
                        }
                        arrayList3 = new ArrayList();
                        Iterator it4 = ((Iterable) objM3).iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(kb6.r(it4.next()));
                        }
                    }
                    list3 = arrayList3;
                }
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(kb6Var.m(ai7Var.get(1), it5.next(), str.concat("[1]")));
                }
                return arrayList6;
            case 4:
                if (ai7Var.a.size() != 3) {
                    throw new ci7("reduce expects exactly 3 arguments", str);
                }
                Object objM4 = kb6Var.m(ai7Var.get(0), obj, str.concat("[0]"));
                Object objM5 = kb6Var.m(ai7Var.get(2), obj, str.concat("[2]"));
                if (!cd0.a(objM4)) {
                    return objM5;
                }
                HashMap map = new HashMap();
                map.put("accumulator", objM5);
                if (objM4 instanceof List) {
                    list4 = (List) ((List) objM4).stream().map(new fj0(5)).collect(Collectors.toList());
                } else {
                    if (objM4 != null && objM4.getClass().isArray()) {
                        arrayList4 = new ArrayList();
                        while (i < Array.getLength(objM4)) {
                            arrayList4.add(i, kb6.r(Array.get(objM4, i)));
                            i++;
                        }
                    } else if (objM4 instanceof JsonArray) {
                        list4 = (List) g21.L((JsonArray) objM4);
                    } else {
                        if (!(objM4 instanceof Iterable)) {
                            qc0.j("ArrayLike only works with lists, iterables, arrays, or JsonArray");
                            return null;
                        }
                        arrayList4 = new ArrayList();
                        Iterator it6 = ((Iterable) objM4).iterator();
                        while (it6.hasNext()) {
                            arrayList4.add(kb6.r(it6.next()));
                        }
                    }
                    list4 = arrayList4;
                }
                Iterator it7 = list4.iterator();
                while (it7.hasNext()) {
                    map.put("current", it7.next());
                    map.put("accumulator", kb6Var.m(ai7Var.get(1), map, str.concat("[1]")));
                }
                return map.get("accumulator");
            default:
                return Boolean.valueOf(!((Boolean) eh2.f.a(kb6Var, ai7Var, obj, str)).booleanValue());
        }
    }

    @Override // defpackage.ei7
    public final String c() {
        switch (this.a) {
            case 0:
                return "all";
            case 1:
                return "filter";
            case 2:
                return "!=";
            case 3:
                return "map";
            case 4:
                return "reduce";
            default:
                return "!==";
        }
    }
}
