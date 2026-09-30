package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qud {
    public static final ArrayList a;
    public static final ArrayList b;
    public static final Map c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final mud g;
    public static final Map h;
    public static final LinkedHashMap i;
    public static final HashSet j;
    public static final LinkedHashMap k;

    static {
        Set<String> setI0 = qd0.I0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(t72.u(setI0, 10));
        for (String str : setI0) {
            String strC = al7.BOOLEAN.c();
            strC.getClass();
            arrayList.add(jy4.t("java/util/Collection", str, "Ljava/util/Collection;", strC));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((mud) it.next()).e);
        }
        b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(t72.u(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((mud) it2.next()).b.b());
        }
        String strConcat = "java/util/".concat("Collection");
        al7 al7Var = al7.BOOLEAN;
        String strC2 = al7Var.c();
        strC2.getClass();
        mud mudVarT = jy4.t(strConcat, "contains", "Ljava/lang/Object;", strC2);
        pud pudVar = pud.c;
        iy9 iy9Var = new iy9(mudVarT, pudVar);
        String strConcat2 = "java/util/".concat("Collection");
        String strC3 = al7Var.c();
        strC3.getClass();
        iy9 iy9Var2 = new iy9(jy4.t(strConcat2, "remove", "Ljava/lang/Object;", strC3), pudVar);
        String strConcat3 = "java/util/".concat("Map");
        String strC4 = al7Var.c();
        strC4.getClass();
        iy9 iy9Var3 = new iy9(jy4.t(strConcat3, "containsKey", "Ljava/lang/Object;", strC4), pudVar);
        String strConcat4 = "java/util/".concat("Map");
        String strC5 = al7Var.c();
        strC5.getClass();
        iy9 iy9Var4 = new iy9(jy4.t(strConcat4, "containsValue", "Ljava/lang/Object;", strC5), pudVar);
        String strConcat5 = "java/util/".concat("Map");
        String strC6 = al7Var.c();
        strC6.getClass();
        iy9 iy9Var5 = new iy9(jy4.t(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strC6), pudVar);
        iy9 iy9Var6 = new iy9(jy4.t("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), pud.d);
        mud mudVarT2 = jy4.t("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        pud pudVar2 = pud.a;
        iy9 iy9Var7 = new iy9(mudVarT2, pudVar2);
        iy9 iy9Var8 = new iy9(jy4.t("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), pudVar2);
        String strConcat6 = "java/util/".concat("List");
        al7 al7Var2 = al7.INT;
        String strC7 = al7Var2.c();
        strC7.getClass();
        mud mudVarT3 = jy4.t(strConcat6, "indexOf", "Ljava/lang/Object;", strC7);
        pud pudVar3 = pud.b;
        iy9 iy9Var9 = new iy9(mudVarT3, pudVar3);
        String strConcat7 = "java/util/".concat("List");
        String strC8 = al7Var2.c();
        strC8.getClass();
        Map mapH = bm8.H(iy9Var, iy9Var2, iy9Var3, iy9Var4, iy9Var5, iy9Var6, iy9Var7, iy9Var8, iy9Var9, new iy9(jy4.t(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strC8), pudVar3));
        c = mapH;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(mapH.size()));
        for (Map.Entry entry : mapH.entrySet()) {
            linkedHashMap.put(((mud) entry.getKey()).e, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetM = n3d.m(c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(t72.u(linkedHashSetM, 10));
        Iterator it3 = linkedHashSetM.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((mud) it3.next()).b);
        }
        e = s72.o1(arrayList5);
        ArrayList arrayList6 = new ArrayList(t72.u(linkedHashSetM, 10));
        Iterator it4 = linkedHashSetM.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((mud) it4.next()).e);
        }
        f = s72.o1(arrayList6);
        al7 al7Var3 = al7.INT;
        String strC9 = al7Var3.c();
        strC9.getClass();
        mud mudVarT4 = jy4.t("java/util/List", "removeAt", strC9, "Ljava/lang/Object;");
        g = mudVarT4;
        String strConcat8 = "java/lang/".concat("Number");
        t99 t99Var = tr9.w;
        String strC10 = al7.BYTE.c();
        strC10.getClass();
        iy9 iy9Var10 = new iy9(new mud(strConcat8, t99Var, "", strC10), t99.e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        t99 t99Var2 = tr9.v;
        String strC11 = al7.SHORT.c();
        strC11.getClass();
        iy9 iy9Var11 = new iy9(new mud(strConcat9, t99Var2, "", strC11), t99.e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        t99 t99Var3 = tr9.u;
        String strC12 = al7Var3.c();
        strC12.getClass();
        iy9 iy9Var12 = new iy9(new mud(strConcat10, t99Var3, "", strC12), t99.e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        t99 t99Var4 = tr9.t;
        String strC13 = al7.LONG.c();
        strC13.getClass();
        iy9 iy9Var13 = new iy9(new mud(strConcat11, t99Var4, "", strC13), t99.e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        t99 t99Var5 = tr9.s;
        String strC14 = al7.FLOAT.c();
        strC14.getClass();
        iy9 iy9Var14 = new iy9(new mud(strConcat12, t99Var5, "", strC14), t99.e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        t99 t99Var6 = tr9.r;
        String strC15 = al7.DOUBLE.c();
        strC15.getClass();
        iy9 iy9Var15 = new iy9(new mud(strConcat13, t99Var6, "", strC15), t99.e("doubleValue"));
        iy9 iy9Var16 = new iy9(mudVarT4, t99.e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strC16 = al7Var3.c();
        strC16.getClass();
        String strC17 = al7.CHAR.c();
        strC17.getClass();
        Map mapH2 = bm8.H(iy9Var10, iy9Var11, iy9Var12, iy9Var13, iy9Var14, iy9Var15, iy9Var16, new iy9(jy4.t(strConcat14, "get", strC16, strC17), t99.e("charAt")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), t99.e("get")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), t99.e("set")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), t99.e("getAndSet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), t99.e("getAndAdd")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), t99.e("addAndGet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), t99.e("get")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), t99.e("set")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), t99.e("getAndSet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), t99.e("getAndAdd")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), t99.e("addAndGet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), t99.e("get")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), t99.e("set")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), t99.e("getAndSet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), t99.e("get")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), t99.e("set")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), t99.e("getAndSet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), t99.e("get")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), t99.e("set")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), t99.e("getAndSet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), t99.e("compareAndSet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), t99.e("getAndAdd")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), t99.e("addAndGet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), t99.e("get")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), t99.e("set")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), t99.e("getAndSet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), t99.e("compareAndSet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), t99.e("getAndAdd")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), t99.e("addAndGet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), t99.e("get")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), t99.e("set")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), t99.e("getAndSet")), new iy9(jy4.t("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), t99.e("compareAndSet")));
        h = mapH2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(bm8.F(mapH2.size()));
        for (Map.Entry entry2 : mapH2.entrySet()) {
            linkedHashMap2.put(((mud) entry2.getKey()).e, entry2.getValue());
        }
        i = linkedHashMap2;
        Map map = h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            mud mudVar = (mud) entry3.getKey();
            t99 t99Var7 = (t99) entry3.getValue();
            String str2 = mudVar.a;
            String str3 = mudVar.c;
            String str4 = mudVar.d;
            t99Var7.getClass();
            linkedHashSet.add(str2 + '.' + (t99Var7 + '(' + str3 + ')' + str4));
        }
        Set setKeySet = h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((mud) it5.next()).b);
        }
        j = hashSet;
        Set<Map.Entry> setEntrySet = h.entrySet();
        ArrayList<iy9> arrayList7 = new ArrayList(t72.u(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new iy9(((mud) entry4.getKey()).b, entry4.getValue()));
        }
        int iF = bm8.F(t72.u(arrayList7, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iF);
        for (iy9 iy9Var17 : arrayList7) {
            linkedHashMap3.put((t99) iy9Var17.e(), (t99) iy9Var17.d());
        }
        k = linkedHashMap3;
    }
}
