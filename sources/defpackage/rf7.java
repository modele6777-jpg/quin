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
public final class rf7 {
    public static final rf7 a;
    public static final rf7 b;
    public static final rf7 c;
    public static final rf7 d;
    public static final rf7 e;
    public static final rf7 f;
    public static final rf7 g;
    public static final rf7 v;
    public static final rf7 w;
    public static final rf7 x;
    public static final /* synthetic */ rf7[] y;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        rf7 rf7Var = new rf7("VOID", 0, Void.class, Void.class, null);
        a = rf7Var;
        Class cls = Integer.TYPE;
        rf7 rf7Var2 = new rf7("INT", 1, cls, Integer.class, 0);
        b = rf7Var2;
        rf7 rf7Var3 = new rf7("LONG", 2, Long.TYPE, Long.class, 0L);
        c = rf7Var3;
        rf7 rf7Var4 = new rf7("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        d = rf7Var4;
        rf7 rf7Var5 = new rf7("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        e = rf7Var5;
        rf7 rf7Var6 = new rf7("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f = rf7Var6;
        rf7 rf7Var7 = new rf7("STRING", 6, String.class, String.class, "");
        g = rf7Var7;
        rf7 rf7Var8 = new rf7("BYTE_STRING", 7, y61.class, y61.class, y61.a);
        v = rf7Var8;
        rf7 rf7Var9 = new rf7("ENUM", 8, cls, Integer.class, null);
        w = rf7Var9;
        rf7 rf7Var10 = new rf7("MESSAGE", 9, Object.class, Object.class, null);
        x = rf7Var10;
        y = new rf7[]{rf7Var, rf7Var2, rf7Var3, rf7Var4, rf7Var5, rf7Var6, rf7Var7, rf7Var8, rf7Var9, rf7Var10};
    }

    public rf7(String str, int i, Class cls, Class cls2, Serializable serializable) {
        super(str, i);
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static rf7 valueOf(String str) {
        return (rf7) Enum.valueOf(rf7.class, str);
    }

    public static rf7[] values() {
        return (rf7[]) y.clone();
    }

    public final Class a() {
        return this.boxedType;
    }
}
