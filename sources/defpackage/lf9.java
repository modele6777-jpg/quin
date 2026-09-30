package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lf9 {
    public static final lf9 a;
    public static final lf9 b;
    public static final lf9 c;
    public static final lf9 d;
    public static final lf9 e;
    public static final lf9 f;
    public static final lf9 g;
    public static final lf9 v;
    public static final /* synthetic */ lf9[] w;

    /* JADX INFO: Fake field, exist only in values array */
    lf9 EF1;

    static {
        lf9 lf9Var = new lf9("FROM_IDE", 0);
        lf9 lf9Var2 = new lf9("FROM_BACKEND", 1);
        lf9 lf9Var3 = new lf9("FROM_TEST", 2);
        lf9 lf9Var4 = new lf9("FROM_BUILTINS", 3);
        a = lf9Var4;
        lf9 lf9Var5 = new lf9("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        lf9 lf9Var6 = new lf9("WHEN_CHECK_OVERRIDES", 5);
        lf9 lf9Var7 = new lf9("FOR_SCRIPT", 6);
        lf9 lf9Var8 = new lf9("FROM_REFLECTION", 7);
        b = lf9Var8;
        lf9 lf9Var9 = new lf9("WHEN_RESOLVE_DECLARATION", 8);
        lf9 lf9Var10 = new lf9("WHEN_GET_DECLARATION_SCOPE", 9);
        lf9 lf9Var11 = new lf9("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        lf9 lf9Var12 = new lf9("FOR_ALREADY_TRACKED", 11);
        c = lf9Var12;
        lf9 lf9Var13 = new lf9("WHEN_GET_ALL_DESCRIPTORS", 12);
        d = lf9Var13;
        lf9 lf9Var14 = new lf9("WHEN_TYPING", 13);
        lf9 lf9Var15 = new lf9("WHEN_GET_SUPER_MEMBERS", 14);
        e = lf9Var15;
        lf9 lf9Var16 = new lf9("FOR_NON_TRACKED_SCOPE", 15);
        f = lf9Var16;
        lf9 lf9Var17 = new lf9("FROM_SYNTHETIC_SCOPE", 16);
        lf9 lf9Var18 = new lf9("FROM_DESERIALIZATION", 17);
        g = lf9Var18;
        lf9 lf9Var19 = new lf9("FROM_JAVA_LOADER", 18);
        v = lf9Var19;
        w = new lf9[]{lf9Var, lf9Var2, lf9Var3, lf9Var4, lf9Var5, lf9Var6, lf9Var7, lf9Var8, lf9Var9, lf9Var10, lf9Var11, lf9Var12, lf9Var13, lf9Var14, lf9Var15, lf9Var16, lf9Var17, lf9Var18, lf9Var19, new lf9("WHEN_GET_LOCAL_VARIABLE", 19), new lf9("WHEN_FIND_BY_FQNAME", 20), new lf9("WHEN_GET_COMPANION_OBJECT", 21), new lf9("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static lf9 valueOf(String str) {
        return (lf9) Enum.valueOf(lf9.class, str);
    }

    public static lf9[] values() {
        return (lf9[]) w.clone();
    }
}
