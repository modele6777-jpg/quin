package defpackage;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.function.BiFunction;
import tech.chatmind.api.events.model.UserPopupEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tnf implements hf8 {
    public Map a;
    public final f99 b = new f99();

    public tnf(nnf nnfVar) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) {
        pnf pnfVar;
        Object dzbVar;
        Object dzbVar2;
        Object dzbVar3;
        if (zn2Var instanceof pnf) {
            pnfVar = (pnf) zn2Var;
            int i = pnfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pnfVar.label = i - Integer.MIN_VALUE;
            } else {
                pnfVar = new pnf(this, zn2Var);
            }
        } else {
            pnfVar = new pnf(this, zn2Var);
        }
        Object objB = pnfVar.result;
        int i2 = pnfVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            Map map = this.a;
            if (map != null) {
                return map;
            }
            pnfVar.label = 1;
            objB = lw2.b(new gsa(2, null), pnfVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
        }
        String str = (String) objB;
        if (!v4e.Q(str)) {
            try {
                dzbVar = oh7.h(fzc.a.e(str));
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            ti7 ti7Var = (ti7) dzbVar;
            if (ti7Var != null) {
                Map map2 = ti7Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    nh7 nh7Var = (nh7) entry.getValue();
                    try {
                        e37 e37Var = oh7.a;
                        nh7Var.getClass();
                        dzbVar2 = nh7Var instanceof yg7 ? (yg7) nh7Var : null;
                        if (dzbVar2 == null) {
                            oh7.d(nh7Var, "JsonArray");
                            throw null;
                        }
                    } catch (Throwable th2) {
                        dzbVar2 = new dzb(th2);
                    }
                    if (dzbVar2 instanceof dzb) {
                        dzbVar2 = null;
                    }
                    Iterable iterable = (List) dzbVar2;
                    if (iterable == null) {
                        iterable = pu4.a;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        try {
                            dzbVar3 = (UserPopupEvent) fzc.a.a(UserPopupEvent.Companion.serializer(), (nh7) it.next());
                        } catch (Throwable th3) {
                            dzbVar3 = new dzb(th3);
                        }
                        if (dzbVar3 instanceof dzb) {
                            dzbVar3 = null;
                        }
                        UserPopupEvent userPopupEvent = (UserPopupEvent) dzbVar3;
                        if (userPopupEvent != null) {
                            arrayList.add(userPopupEvent);
                        }
                    }
                    linkedHashMap.put(key, arrayList);
                }
                return linkedHashMap;
            }
        }
        return qu4.a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bc A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:14:0x0042, B:21:0x005c, B:31:0x009b, B:33:0x00bc, B:34:0x00be, B:35:0x00d0, B:37:0x00d6, B:39:0x00e7, B:40:0x00eb, B:41:0x00f4, B:43:0x00fa, B:45:0x010f, B:46:0x0113, B:47:0x0123, B:49:0x0129, B:51:0x013b, B:52:0x0147), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6 A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:14:0x0042, B:21:0x005c, B:31:0x009b, B:33:0x00bc, B:34:0x00be, B:35:0x00d0, B:37:0x00d6, B:39:0x00e7, B:40:0x00eb, B:41:0x00f4, B:43:0x00fa, B:45:0x010f, B:46:0x0113, B:47:0x0123, B:49:0x0129, B:51:0x013b, B:52:0x0147), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:14:0x0042, B:21:0x005c, B:31:0x009b, B:33:0x00bc, B:34:0x00be, B:35:0x00d0, B:37:0x00d6, B:39:0x00e7, B:40:0x00eb, B:41:0x00f4, B:43:0x00fa, B:45:0x010f, B:46:0x0113, B:47:0x0123, B:49:0x0129, B:51:0x013b, B:52:0x0147), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0129 A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:14:0x0042, B:21:0x005c, B:31:0x009b, B:33:0x00bc, B:34:0x00be, B:35:0x00d0, B:37:0x00d6, B:39:0x00e7, B:40:0x00eb, B:41:0x00f4, B:43:0x00fa, B:45:0x010f, B:46:0x0113, B:47:0x0123, B:49:0x0129, B:51:0x013b, B:52:0x0147), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [tnf] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final Object b(String str, List list, zn2 zn2Var) throws Throwable {
        qnf qnfVar;
        d99 d99Var;
        ?? r12;
        ?? r1;
        d99 d99Var2;
        Instant instantNow;
        Iterable iterable;
        HashSet hashSet;
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        List list2;
        if (zn2Var instanceof qnf) {
            qnfVar = (qnf) zn2Var;
            int i = qnfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnfVar.label = i - Integer.MIN_VALUE;
            } else {
                qnfVar = new qnf(this, zn2Var);
            }
        } else {
            qnfVar = new qnf(this, zn2Var);
        }
        Object obj = qnfVar.result;
        int i2 = qnfVar.label;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (i2 == 0) {
                    jzb.q(obj);
                    qnfVar.L$0 = str;
                    qnfVar.L$1 = list;
                    d99Var = this.b;
                    qnfVar.L$2 = d99Var;
                    qnfVar.label = 1;
                    if (d99Var.b(qnfVar) != bw2Var) {
                    }
                    r12 = str;
                    return bw2Var;
                }
                if (i2 == 1) {
                    d99 d99Var3 = (d99) qnfVar.L$2;
                    list = (List) qnfVar.L$1;
                    String str2 = (String) qnfVar.L$0;
                    jzb.q(obj);
                    d99Var = d99Var3;
                    r12 = str2;
                } else {
                    if (i2 == 2) {
                        d99Var2 = (d99) qnfVar.L$2;
                        list = (List) qnfVar.L$1;
                        String str3 = (String) qnfVar.L$0;
                        jzb.q(obj);
                        r1 = str3;
                        ?? Y = bm8.Y((Map) obj);
                        instantNow = Instant.now();
                        final z8d z8dVar = new z8d(15, instantNow);
                        Y.replaceAll(new BiFunction() { // from class: onf
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj2, Object obj3) {
                                return (List) z8dVar.z(obj2, obj3);
                            }
                        });
                        iterable = (List) Y.get(r1);
                        if (iterable == null) {
                            iterable = pu4.a;
                        }
                        ArrayList arrayListQ0 = s72.Q0(list, iterable);
                        hashSet = new HashSet();
                        arrayList = new ArrayList();
                        for (Object obj2 : arrayListQ0) {
                            if (hashSet.add(db6.N((UserPopupEvent) obj2))) {
                                arrayList.add(obj2);
                            }
                        }
                        arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (((UserPopupEvent) obj3).getEndAt().toInstant().isAfter(instantNow)) {
                                arrayList2.add(obj3);
                            }
                        }
                        Y.put(r1, arrayList2);
                        linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : Y.entrySet()) {
                            if (!((List) entry.getValue()).isEmpty()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        qnfVar.L$0 = null;
                        qnfVar.L$1 = null;
                        qnfVar.L$2 = d99Var2;
                        qnfVar.L$3 = null;
                        qnfVar.L$4 = null;
                        qnfVar.L$5 = arrayList2;
                        qnfVar.label = 3;
                        if (c(linkedHashMap, qnfVar) != bw2Var) {
                            list2 = arrayList2;
                        }
                        r12 = str;
                        return bw2Var;
                    }
                    if (i2 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = (List) qnfVar.L$5;
                    d99Var2 = (d99) qnfVar.L$2;
                    jzb.q(obj);
                }
                d99Var2.h(null);
                return list2;
                r12 = str;
                qnfVar.L$0 = r12;
                qnfVar.L$1 = list;
                qnfVar.L$2 = d99Var;
                qnfVar.label = 2;
                Object objA = a(qnfVar);
                if (objA != bw2Var) {
                    r1 = r12;
                    d99Var2 = d99Var;
                    obj = objA;
                    ?? Y2 = bm8.Y((Map) obj);
                    instantNow = Instant.now();
                    final z8d z8dVar2 = new z8d(15, instantNow);
                    Y2.replaceAll(new BiFunction() { // from class: onf
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj4, Object obj5) {
                            return (List) z8dVar2.z(obj4, obj5);
                        }
                    });
                    iterable = (List) Y2.get(r1);
                    if (iterable == null) {
                        iterable = pu4.a;
                    }
                    ArrayList arrayListQ1 = s72.Q0(list, iterable);
                    hashSet = new HashSet();
                    arrayList = new ArrayList();
                    while (r13.hasNext()) {
                        if (hashSet.add(db6.N((UserPopupEvent) obj2))) {
                            arrayList.add(obj2);
                        }
                    }
                    arrayList2 = new ArrayList();
                    while (r4.hasNext()) {
                        if (((UserPopupEvent) obj3).getEndAt().toInstant().isAfter(instantNow)) {
                            arrayList2.add(obj3);
                        }
                    }
                    Y2.put(r1, arrayList2);
                    linkedHashMap = new LinkedHashMap();
                    while (r14.hasNext()) {
                        if (!((List) entry.getValue()).isEmpty()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    qnfVar.L$0 = null;
                    qnfVar.L$1 = null;
                    qnfVar.L$2 = d99Var2;
                    qnfVar.L$3 = null;
                    qnfVar.L$4 = null;
                    qnfVar.L$5 = arrayList2;
                    qnfVar.label = 3;
                    if (c(linkedHashMap, qnfVar) != bw2Var) {
                        list2 = arrayList2;
                        d99Var2.h(null);
                        return list2;
                    }
                }
                r12 = str;
                return bw2Var;
            } catch (Throwable th) {
                th = th;
                str = d99Var;
                str.h(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [tnf] */
    /* JADX WARN: Type inference failed for: r8v1, types: [hf8] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final Object c(LinkedHashMap linkedHashMap, zn2 zn2Var) {
        rnf rnfVar;
        if (zn2Var instanceof rnf) {
            rnfVar = (rnf) zn2Var;
            int i = rnfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rnfVar.label = i - Integer.MIN_VALUE;
            } else {
                rnfVar = new rnf(this, zn2Var);
            }
        } else {
            rnfVar = new rnf(this, zn2Var);
        }
        Object obj = rnfVar.result;
        int i2 = rnfVar.label;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                this.a = linkedHashMap;
                xh7 xh7Var = fzc.a;
                xh7Var.getClass();
                String strD = xh7Var.d(new qh6(p4e.a, new dd0(UserPopupEvent.Companion.serializer(), 0), 1), linkedHashMap);
                rnfVar.L$0 = null;
                rnfVar.label = 1;
                Object objO = bsa.o(xqa.L.a, strD, rnfVar);
                bw2 bw2Var = bw2.a;
                this = objO;
                if (objO == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                this = this;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.d().c("Failed to persist pending user popups", e2);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ac A[Catch: all -> 0x005a, TryCatch #1 {all -> 0x005a, blocks: (B:21:0x0056, B:36:0x009e, B:38:0x00ac, B:39:0x00ae, B:40:0x00b7, B:42:0x00bd, B:44:0x00ce, B:45:0x00d2, B:46:0x00e2, B:48:0x00e8, B:50:0x00fa, B:51:0x0106, B:33:0x008e), top: B:61:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd A[Catch: all -> 0x005a, TryCatch #1 {all -> 0x005a, blocks: (B:21:0x0056, B:36:0x009e, B:38:0x00ac, B:39:0x00ae, B:40:0x00b7, B:42:0x00bd, B:44:0x00ce, B:45:0x00d2, B:46:0x00e2, B:48:0x00e8, B:50:0x00fa, B:51:0x0106, B:33:0x008e), top: B:61:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8 A[Catch: all -> 0x005a, TryCatch #1 {all -> 0x005a, blocks: (B:21:0x0056, B:36:0x009e, B:38:0x00ac, B:39:0x00ae, B:40:0x00b7, B:42:0x00bd, B:44:0x00ce, B:45:0x00d2, B:46:0x00e2, B:48:0x00e8, B:50:0x00fa, B:51:0x0106, B:33:0x008e), top: B:61:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r11v0, types: [tnf] */
    /* JADX WARN: Type inference failed for: r11v11, types: [d99] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [d99] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [d99] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final Object e(String str, Set set, zn2 zn2Var) throws Throwable {
        snf snfVar;
        Throwable th;
        ?? r11;
        ?? r1;
        d99 d99Var;
        ?? r2;
        Iterable iterable;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        ?? r12;
        if (zn2Var instanceof snf) {
            snfVar = (snf) zn2Var;
            int i = snfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                snfVar.label = i - Integer.MIN_VALUE;
            } else {
                snfVar = new snf(this, zn2Var);
            }
        } else {
            snfVar = new snf(this, zn2Var);
        }
        Object objA = snfVar.result;
        int i2 = snfVar.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                if (set.isEmpty()) {
                    return wefVar;
                }
                snfVar.L$0 = str;
                snfVar.L$1 = set;
                f99 f99Var = this.b;
                snfVar.L$2 = f99Var;
                snfVar.label = 1;
                if (f99Var.b(snfVar) != bw2Var) {
                    r1 = str;
                    d99Var = f99Var;
                }
                return bw2Var;
            }
            if (i2 == 1) {
                d99 d99Var2 = (d99) snfVar.L$2;
                set = (Set) snfVar.L$1;
                String str2 = (String) snfVar.L$0;
                jzb.q(objA);
                r1 = str2;
                d99Var = d99Var2;
            } else {
                if (i2 == 2) {
                    d99 d99Var3 = (d99) snfVar.L$2;
                    set = (Set) snfVar.L$1;
                    String str3 = (String) snfVar.L$0;
                    jzb.q(objA);
                    r2 = str3;
                    str = d99Var3;
                    ?? Y = bm8.Y((Map) objA);
                    iterable = (List) Y.get(r2);
                    if (iterable == null) {
                        iterable = pu4.a;
                    }
                    arrayList = new ArrayList();
                    for (Object obj : iterable) {
                        if (!set.contains(db6.N((UserPopupEvent) obj))) {
                            arrayList.add(obj);
                        }
                    }
                    Y.put(r2, arrayList);
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : Y.entrySet()) {
                        if (!((List) entry.getValue()).isEmpty()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    snfVar.L$0 = null;
                    snfVar.L$1 = null;
                    snfVar.L$2 = str;
                    snfVar.L$3 = null;
                    snfVar.label = 3;
                    if (c(linkedHashMap, snfVar) != bw2Var) {
                        r12 = str;
                    }
                    return bw2Var;
                }
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r11 = (d99) snfVar.L$2;
                try {
                    jzb.q(objA);
                    r12 = r11;
                } catch (Throwable th2) {
                    th = th2;
                    r11.h(null);
                    throw th;
                }
            }
            r12.h(null);
            return wefVar;
            snfVar.L$0 = r1;
            snfVar.L$1 = set;
            snfVar.L$2 = d99Var;
            snfVar.label = 2;
            objA = a(snfVar);
            r2 = r1;
            str = d99Var;
            if (objA != bw2Var) {
                ?? Y2 = bm8.Y((Map) objA);
                iterable = (List) Y2.get(r2);
                if (iterable == null) {
                    iterable = pu4.a;
                }
                arrayList = new ArrayList();
                while (r4.hasNext()) {
                    if (!set.contains(db6.N((UserPopupEvent) obj))) {
                        arrayList.add(obj);
                    }
                }
                Y2.put(r2, arrayList);
                linkedHashMap = new LinkedHashMap();
                while (r14.hasNext()) {
                    if (!((List) entry.getValue()).isEmpty()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                snfVar.L$0 = null;
                snfVar.L$1 = null;
                snfVar.L$2 = str;
                snfVar.L$3 = null;
                snfVar.label = 3;
                if (c(linkedHashMap, snfVar) != bw2Var) {
                    r12 = str;
                    r12.h(null);
                    return wefVar;
                }
            }
            return bw2Var;
        } catch (Throwable th3) {
            ?? r10 = str;
            th = th3;
            r11 = r10;
        }
    }
}
