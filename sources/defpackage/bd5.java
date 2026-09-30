package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class bd5 {
    public static final bd5 a;
    public static final bd5 b;
    public static final bd5[] c;
    public static final /* synthetic */ bd5[] d;
    private final zc5 collection;
    private final Class<?> elementType;
    private final int id;
    private final rf7 javaType;
    private final boolean primitiveScalar;

    /* JADX INFO: Fake field, exist only in values array */
    bd5 EF0;

    static {
        rf7 rf7Var = rf7.e;
        zc5 zc5Var = zc5.a;
        bd5 bd5Var = new bd5("DOUBLE", 0, 0, zc5Var, rf7Var);
        rf7 rf7Var2 = rf7.d;
        bd5 bd5Var2 = new bd5("FLOAT", 1, 1, zc5Var, rf7Var2);
        rf7 rf7Var3 = rf7.c;
        bd5 bd5Var3 = new bd5("INT64", 2, 2, zc5Var, rf7Var3);
        bd5 bd5Var4 = new bd5("UINT64", 3, 3, zc5Var, rf7Var3);
        rf7 rf7Var4 = rf7.b;
        bd5 bd5Var5 = new bd5("INT32", 4, 4, zc5Var, rf7Var4);
        bd5 bd5Var6 = new bd5("FIXED64", 5, 5, zc5Var, rf7Var3);
        bd5 bd5Var7 = new bd5("FIXED32", 6, 6, zc5Var, rf7Var4);
        rf7 rf7Var5 = rf7.f;
        bd5 bd5Var8 = new bd5("BOOL", 7, 7, zc5Var, rf7Var5);
        rf7 rf7Var6 = rf7.g;
        bd5 bd5Var9 = new bd5("STRING", 8, 8, zc5Var, rf7Var6);
        rf7 rf7Var7 = rf7.x;
        bd5 bd5Var10 = new bd5("MESSAGE", 9, 9, zc5Var, rf7Var7);
        rf7 rf7Var8 = rf7.v;
        bd5 bd5Var11 = new bd5("BYTES", 10, 10, zc5Var, rf7Var8);
        bd5 bd5Var12 = new bd5("UINT32", 11, 11, zc5Var, rf7Var4);
        rf7 rf7Var9 = rf7.w;
        bd5 bd5Var13 = new bd5("ENUM", 12, 12, zc5Var, rf7Var9);
        bd5 bd5Var14 = new bd5("SFIXED32", 13, 13, zc5Var, rf7Var4);
        bd5 bd5Var15 = new bd5("SFIXED64", 14, 14, zc5Var, rf7Var3);
        bd5 bd5Var16 = new bd5("SINT32", 15, 15, zc5Var, rf7Var4);
        bd5 bd5Var17 = new bd5("SINT64", 16, 16, zc5Var, rf7Var3);
        bd5 bd5Var18 = new bd5("GROUP", 17, 17, zc5Var, rf7Var7);
        zc5 zc5Var2 = zc5.b;
        bd5 bd5Var19 = new bd5("DOUBLE_LIST", 18, 18, zc5Var2, rf7Var);
        bd5 bd5Var20 = new bd5("FLOAT_LIST", 19, 19, zc5Var2, rf7Var2);
        bd5 bd5Var21 = new bd5("INT64_LIST", 20, 20, zc5Var2, rf7Var3);
        bd5 bd5Var22 = new bd5("UINT64_LIST", 21, 21, zc5Var2, rf7Var3);
        bd5 bd5Var23 = new bd5("INT32_LIST", 22, 22, zc5Var2, rf7Var4);
        bd5 bd5Var24 = new bd5("FIXED64_LIST", 23, 23, zc5Var2, rf7Var3);
        bd5 bd5Var25 = new bd5("FIXED32_LIST", 24, 24, zc5Var2, rf7Var4);
        bd5 bd5Var26 = new bd5("BOOL_LIST", 25, 25, zc5Var2, rf7Var5);
        bd5 bd5Var27 = new bd5("STRING_LIST", 26, 26, zc5Var2, rf7Var6);
        bd5 bd5Var28 = new bd5("MESSAGE_LIST", 27, 27, zc5Var2, rf7Var7);
        bd5 bd5Var29 = new bd5("BYTES_LIST", 28, 28, zc5Var2, rf7Var8);
        bd5 bd5Var30 = new bd5("UINT32_LIST", 29, 29, zc5Var2, rf7Var4);
        bd5 bd5Var31 = new bd5("ENUM_LIST", 30, 30, zc5Var2, rf7Var9);
        bd5 bd5Var32 = new bd5("SFIXED32_LIST", 31, 31, zc5Var2, rf7Var4);
        bd5 bd5Var33 = new bd5("SFIXED64_LIST", 32, 32, zc5Var2, rf7Var3);
        bd5 bd5Var34 = new bd5("SINT32_LIST", 33, 33, zc5Var2, rf7Var4);
        bd5 bd5Var35 = new bd5("SINT64_LIST", 34, 34, zc5Var2, rf7Var3);
        zc5 zc5Var3 = zc5.c;
        bd5 bd5Var36 = new bd5("DOUBLE_LIST_PACKED", 35, 35, zc5Var3, rf7Var);
        a = bd5Var36;
        bd5 bd5Var37 = new bd5("FLOAT_LIST_PACKED", 36, 36, zc5Var3, rf7Var2);
        bd5 bd5Var38 = new bd5("INT64_LIST_PACKED", 37, 37, zc5Var3, rf7Var3);
        bd5 bd5Var39 = new bd5("UINT64_LIST_PACKED", 38, 38, zc5Var3, rf7Var3);
        bd5 bd5Var40 = new bd5("INT32_LIST_PACKED", 39, 39, zc5Var3, rf7Var4);
        bd5 bd5Var41 = new bd5("FIXED64_LIST_PACKED", 40, 40, zc5Var3, rf7Var3);
        bd5 bd5Var42 = new bd5("FIXED32_LIST_PACKED", 41, 41, zc5Var3, rf7Var4);
        bd5 bd5Var43 = new bd5("BOOL_LIST_PACKED", 42, 42, zc5Var3, rf7Var5);
        bd5 bd5Var44 = new bd5("UINT32_LIST_PACKED", 43, 43, zc5Var3, rf7Var4);
        bd5 bd5Var45 = new bd5("ENUM_LIST_PACKED", 44, 44, zc5Var3, rf7Var9);
        bd5 bd5Var46 = new bd5("SFIXED32_LIST_PACKED", 45, 45, zc5Var3, rf7Var4);
        bd5 bd5Var47 = new bd5("SFIXED64_LIST_PACKED", 46, 46, zc5Var3, rf7Var3);
        bd5 bd5Var48 = new bd5("SINT32_LIST_PACKED", 47, 47, zc5Var3, rf7Var4);
        bd5 bd5Var49 = new bd5("SINT64_LIST_PACKED", 48, 48, zc5Var3, rf7Var3);
        b = bd5Var49;
        d = new bd5[]{bd5Var, bd5Var2, bd5Var3, bd5Var4, bd5Var5, bd5Var6, bd5Var7, bd5Var8, bd5Var9, bd5Var10, bd5Var11, bd5Var12, bd5Var13, bd5Var14, bd5Var15, bd5Var16, bd5Var17, bd5Var18, bd5Var19, bd5Var20, bd5Var21, bd5Var22, bd5Var23, bd5Var24, bd5Var25, bd5Var26, bd5Var27, bd5Var28, bd5Var29, bd5Var30, bd5Var31, bd5Var32, bd5Var33, bd5Var34, bd5Var35, bd5Var36, bd5Var37, bd5Var38, bd5Var39, bd5Var40, bd5Var41, bd5Var42, bd5Var43, bd5Var44, bd5Var45, bd5Var46, bd5Var47, bd5Var48, bd5Var49, new bd5("GROUP_LIST", 49, 49, zc5Var2, rf7Var7), new bd5("MAP", 50, 50, zc5.d, rf7.a)};
        bd5[] bd5VarArrValues = values();
        c = new bd5[bd5VarArrValues.length];
        for (bd5 bd5Var50 : bd5VarArrValues) {
            c[bd5Var50.id] = bd5Var50;
        }
    }

    public bd5(String str, int i, int i2, zc5 zc5Var, rf7 rf7Var) {
        int iOrdinal;
        super(str, i);
        this.id = i2;
        this.collection = zc5Var;
        this.javaType = rf7Var;
        int iOrdinal2 = zc5Var.ordinal();
        if (iOrdinal2 == 1 || iOrdinal2 == 3) {
            this.elementType = rf7Var.a();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (zc5Var != zc5.a || (iOrdinal = rf7Var.ordinal()) == 6 || iOrdinal == 7 || iOrdinal == 9) ? false : true;
    }

    public static bd5 valueOf(String str) {
        return (bd5) Enum.valueOf(bd5.class, str);
    }

    public static bd5[] values() {
        return (bd5[]) d.clone();
    }

    public final int a() {
        return this.id;
    }
}
