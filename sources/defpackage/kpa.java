package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kpa {
    public static final wf7 a = new wf7(vj9.b, false);
    public static final wf7 b;
    public static final wf7 c;
    public static final LinkedHashMap d;

    static {
        vj9 vj9Var = vj9.c;
        b = new wf7(vj9Var, false);
        c = new wf7(vj9Var, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        oid oidVar = new oid(0);
        new vea(oidVar, "java/util/".concat("Iterator"), false, 9).r("forEachRemaining", null, new hpa(strConcat4, 0));
        new vea(oidVar, "java/lang/".concat("Iterable"), false, 9).r("spliterator", null, new qqf(9));
        vea veaVar = new vea(oidVar, "java/util/".concat("Collection"), false, 9);
        veaVar.r("removeIf", null, new hpa(strConcat2, 17));
        veaVar.r("stream", null, new hpa(strConcat8, 26));
        veaVar.r("parallelStream", null, new jpa(strConcat8, 1));
        vea veaVar2 = new vea(oidVar, "java/util/".concat("List"), false, 9);
        veaVar2.r("replaceAll", null, new jpa(strConcat7, 2));
        veaVar2.r("addFirst", "2.1", new jpa(strConcat, 3));
        veaVar2.r("addLast", "2.1", new jpa(strConcat, 4));
        veaVar2.r("removeFirst", "2.1", new jpa(strConcat, 5));
        veaVar2.r("removeLast", "2.1", new jpa(strConcat, 6));
        vea veaVar3 = new vea(oidVar, "java/util/".concat("LinkedList"), false, 9);
        veaVar3.r("addFirst", "2.1", new hpa(strConcat, 1));
        veaVar3.r("addLast", "2.1", new hpa(strConcat, 2));
        veaVar3.r("removeFirst", "2.1", new hpa(strConcat, 3));
        veaVar3.r("removeLast", "2.1", new hpa(strConcat, 4));
        vea veaVar4 = new vea(oidVar, "java/util/".concat("LinkedHashSet"), false, 9);
        veaVar4.r("addFirst", "2.2", new hpa(strConcat, 5));
        veaVar4.r("addLast", "2.2", new hpa(strConcat, 6));
        veaVar4.r("removeFirst", "2.2", new hpa(strConcat, 7));
        veaVar4.r("removeLast", "2.2", new hpa(strConcat, 8));
        veaVar4.r("getFirst", "2.2", new hpa(strConcat, 9));
        veaVar4.r("getLast", "2.2", new hpa(strConcat, 10));
        vea veaVar5 = new vea(oidVar, "java/util/".concat("Map"), false, 9);
        veaVar5.r("forEach", null, new hpa(strConcat6, 11));
        veaVar5.r("putIfAbsent", null, new hpa(strConcat, 12));
        veaVar5.r("replace", null, new hpa(strConcat, 13));
        veaVar5.r("replace", null, new hpa(strConcat, 14));
        veaVar5.r("replaceAll", null, new hpa(strConcat5, 15));
        veaVar5.r("compute", null, new ipa(strConcat, strConcat5, 0));
        veaVar5.r("computeIfAbsent", null, new ipa(strConcat, strConcat3, 1));
        veaVar5.r("computeIfPresent", null, new ipa(strConcat, strConcat5, 2));
        veaVar5.r("merge", null, new ipa(strConcat, strConcat5, 3));
        vea veaVar6 = new vea(oidVar, "java/util/".concat("LinkedHashMap"), false, 9);
        veaVar6.r("putFirst", "2.2", new hpa(strConcat, 16));
        veaVar6.r("putLast", "2.2", new hpa(strConcat, 18));
        vea veaVar7 = new vea(oidVar, strConcat9, false, 9);
        veaVar7.r("empty", null, new hpa(strConcat9, 19));
        veaVar7.r("of", null, new ipa(strConcat, strConcat9, 4));
        veaVar7.r("ofNullable", null, new ipa(strConcat, strConcat9, 5));
        veaVar7.r("get", null, new hpa(strConcat, 20));
        veaVar7.r("ifPresent", null, new hpa(strConcat4, 21));
        boolean z = false;
        int i = 9;
        new vea(oidVar, "java/lang/".concat("ref/Reference"), z, i).r("get", null, new hpa(strConcat, 22));
        new vea(oidVar, strConcat2, z, i).r("test", null, new hpa(strConcat, 23));
        new vea(oidVar, "java/util/function/".concat("BiPredicate"), z, i).r("test", null, new hpa(strConcat, 24));
        new vea(oidVar, strConcat4, z, i).r("accept", null, new hpa(strConcat, 25));
        new vea(oidVar, strConcat6, z, i).r("accept", null, new hpa(strConcat, 27));
        new vea(oidVar, strConcat3, z, i).r("apply", null, new hpa(strConcat, 28));
        new vea(oidVar, strConcat5, z, i).r("apply", null, new hpa(strConcat, 29));
        new vea(oidVar, "java/util/function/".concat("Supplier"), z, i).r("get", null, new jpa(strConcat, 0));
        d = (LinkedHashMap) oidVar.b;
    }
}
