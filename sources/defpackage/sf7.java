package defpackage;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sf7 {
    public static final sf7 a;
    public static final sf7 b;
    public static final sf7 c;
    public static final sf7 d;
    public static final sf7 e;
    public static final sf7 f;
    public static final sf7 g;
    public static final sf7 v;
    public static final sf7 w;
    public static final sf7 x;
    public static final /* synthetic */ sf7[] y;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        sf7 sf7Var = new sf7("VOID", 0, Void.class, Void.class, null);
        a = sf7Var;
        Class cls = Integer.TYPE;
        sf7 sf7Var2 = new sf7("INT", 1, cls, Integer.class, 0);
        b = sf7Var2;
        sf7 sf7Var3 = new sf7("LONG", 2, Long.TYPE, Long.class, 0L);
        c = sf7Var3;
        sf7 sf7Var4 = new sf7("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        d = sf7Var4;
        sf7 sf7Var5 = new sf7("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        e = sf7Var5;
        sf7 sf7Var6 = new sf7("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f = sf7Var6;
        sf7 sf7Var7 = new sf7("STRING", 6, String.class, String.class, "");
        g = sf7Var7;
        sf7 sf7Var8 = new sf7("BYTE_STRING", 7, b71.class, b71.class, b71.a);
        v = sf7Var8;
        sf7 sf7Var9 = new sf7("ENUM", 8, cls, Integer.class, null);
        w = sf7Var9;
        sf7 sf7Var10 = new sf7("MESSAGE", 9, Object.class, Object.class, null);
        x = sf7Var10;
        y = new sf7[]{sf7Var, sf7Var2, sf7Var3, sf7Var4, sf7Var5, sf7Var6, sf7Var7, sf7Var8, sf7Var9, sf7Var10};
    }

    public sf7(String str, int i, Class cls, Class cls2, Serializable serializable) {
        super(str, i);
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static sf7 valueOf(String str) {
        return (sf7) Enum.valueOf(sf7.class, str);
    }

    public static sf7[] values() {
        return (sf7[]) y.clone();
    }

    public final Class a() {
        return this.boxedType;
    }
}
