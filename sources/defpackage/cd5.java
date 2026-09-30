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
public final class cd5 {
    public static final cd5 a;
    public static final cd5 b;
    public static final cd5[] c;
    public static final /* synthetic */ cd5[] d;
    private final ad5 collection;
    private final Class<?> elementType;
    private final int id;
    private final sf7 javaType;
    private final boolean primitiveScalar;

    /* JADX INFO: Fake field, exist only in values array */
    cd5 EF0;

    static {
        sf7 sf7Var = sf7.e;
        ad5 ad5Var = ad5.a;
        cd5 cd5Var = new cd5("DOUBLE", 0, 0, ad5Var, sf7Var);
        sf7 sf7Var2 = sf7.d;
        cd5 cd5Var2 = new cd5("FLOAT", 1, 1, ad5Var, sf7Var2);
        sf7 sf7Var3 = sf7.c;
        cd5 cd5Var3 = new cd5("INT64", 2, 2, ad5Var, sf7Var3);
        cd5 cd5Var4 = new cd5("UINT64", 3, 3, ad5Var, sf7Var3);
        sf7 sf7Var4 = sf7.b;
        cd5 cd5Var5 = new cd5("INT32", 4, 4, ad5Var, sf7Var4);
        cd5 cd5Var6 = new cd5("FIXED64", 5, 5, ad5Var, sf7Var3);
        cd5 cd5Var7 = new cd5("FIXED32", 6, 6, ad5Var, sf7Var4);
        sf7 sf7Var5 = sf7.f;
        cd5 cd5Var8 = new cd5("BOOL", 7, 7, ad5Var, sf7Var5);
        sf7 sf7Var6 = sf7.g;
        cd5 cd5Var9 = new cd5("STRING", 8, 8, ad5Var, sf7Var6);
        sf7 sf7Var7 = sf7.x;
        cd5 cd5Var10 = new cd5("MESSAGE", 9, 9, ad5Var, sf7Var7);
        sf7 sf7Var8 = sf7.v;
        cd5 cd5Var11 = new cd5("BYTES", 10, 10, ad5Var, sf7Var8);
        cd5 cd5Var12 = new cd5("UINT32", 11, 11, ad5Var, sf7Var4);
        sf7 sf7Var9 = sf7.w;
        cd5 cd5Var13 = new cd5("ENUM", 12, 12, ad5Var, sf7Var9);
        cd5 cd5Var14 = new cd5("SFIXED32", 13, 13, ad5Var, sf7Var4);
        cd5 cd5Var15 = new cd5("SFIXED64", 14, 14, ad5Var, sf7Var3);
        cd5 cd5Var16 = new cd5("SINT32", 15, 15, ad5Var, sf7Var4);
        cd5 cd5Var17 = new cd5("SINT64", 16, 16, ad5Var, sf7Var3);
        cd5 cd5Var18 = new cd5("GROUP", 17, 17, ad5Var, sf7Var7);
        ad5 ad5Var2 = ad5.b;
        cd5 cd5Var19 = new cd5("DOUBLE_LIST", 18, 18, ad5Var2, sf7Var);
        cd5 cd5Var20 = new cd5("FLOAT_LIST", 19, 19, ad5Var2, sf7Var2);
        cd5 cd5Var21 = new cd5("INT64_LIST", 20, 20, ad5Var2, sf7Var3);
        cd5 cd5Var22 = new cd5("UINT64_LIST", 21, 21, ad5Var2, sf7Var3);
        cd5 cd5Var23 = new cd5("INT32_LIST", 22, 22, ad5Var2, sf7Var4);
        cd5 cd5Var24 = new cd5("FIXED64_LIST", 23, 23, ad5Var2, sf7Var3);
        cd5 cd5Var25 = new cd5("FIXED32_LIST", 24, 24, ad5Var2, sf7Var4);
        cd5 cd5Var26 = new cd5("BOOL_LIST", 25, 25, ad5Var2, sf7Var5);
        cd5 cd5Var27 = new cd5("STRING_LIST", 26, 26, ad5Var2, sf7Var6);
        cd5 cd5Var28 = new cd5("MESSAGE_LIST", 27, 27, ad5Var2, sf7Var7);
        cd5 cd5Var29 = new cd5("BYTES_LIST", 28, 28, ad5Var2, sf7Var8);
        cd5 cd5Var30 = new cd5("UINT32_LIST", 29, 29, ad5Var2, sf7Var4);
        cd5 cd5Var31 = new cd5("ENUM_LIST", 30, 30, ad5Var2, sf7Var9);
        cd5 cd5Var32 = new cd5("SFIXED32_LIST", 31, 31, ad5Var2, sf7Var4);
        cd5 cd5Var33 = new cd5("SFIXED64_LIST", 32, 32, ad5Var2, sf7Var3);
        cd5 cd5Var34 = new cd5("SINT32_LIST", 33, 33, ad5Var2, sf7Var4);
        cd5 cd5Var35 = new cd5("SINT64_LIST", 34, 34, ad5Var2, sf7Var3);
        ad5 ad5Var3 = ad5.c;
        cd5 cd5Var36 = new cd5("DOUBLE_LIST_PACKED", 35, 35, ad5Var3, sf7Var);
        a = cd5Var36;
        cd5 cd5Var37 = new cd5("FLOAT_LIST_PACKED", 36, 36, ad5Var3, sf7Var2);
        cd5 cd5Var38 = new cd5("INT64_LIST_PACKED", 37, 37, ad5Var3, sf7Var3);
        cd5 cd5Var39 = new cd5("UINT64_LIST_PACKED", 38, 38, ad5Var3, sf7Var3);
        cd5 cd5Var40 = new cd5("INT32_LIST_PACKED", 39, 39, ad5Var3, sf7Var4);
        cd5 cd5Var41 = new cd5("FIXED64_LIST_PACKED", 40, 40, ad5Var3, sf7Var3);
        cd5 cd5Var42 = new cd5("FIXED32_LIST_PACKED", 41, 41, ad5Var3, sf7Var4);
        cd5 cd5Var43 = new cd5("BOOL_LIST_PACKED", 42, 42, ad5Var3, sf7Var5);
        cd5 cd5Var44 = new cd5("UINT32_LIST_PACKED", 43, 43, ad5Var3, sf7Var4);
        cd5 cd5Var45 = new cd5("ENUM_LIST_PACKED", 44, 44, ad5Var3, sf7Var9);
        cd5 cd5Var46 = new cd5("SFIXED32_LIST_PACKED", 45, 45, ad5Var3, sf7Var4);
        cd5 cd5Var47 = new cd5("SFIXED64_LIST_PACKED", 46, 46, ad5Var3, sf7Var3);
        cd5 cd5Var48 = new cd5("SINT32_LIST_PACKED", 47, 47, ad5Var3, sf7Var4);
        cd5 cd5Var49 = new cd5("SINT64_LIST_PACKED", 48, 48, ad5Var3, sf7Var3);
        b = cd5Var49;
        d = new cd5[]{cd5Var, cd5Var2, cd5Var3, cd5Var4, cd5Var5, cd5Var6, cd5Var7, cd5Var8, cd5Var9, cd5Var10, cd5Var11, cd5Var12, cd5Var13, cd5Var14, cd5Var15, cd5Var16, cd5Var17, cd5Var18, cd5Var19, cd5Var20, cd5Var21, cd5Var22, cd5Var23, cd5Var24, cd5Var25, cd5Var26, cd5Var27, cd5Var28, cd5Var29, cd5Var30, cd5Var31, cd5Var32, cd5Var33, cd5Var34, cd5Var35, cd5Var36, cd5Var37, cd5Var38, cd5Var39, cd5Var40, cd5Var41, cd5Var42, cd5Var43, cd5Var44, cd5Var45, cd5Var46, cd5Var47, cd5Var48, cd5Var49, new cd5("GROUP_LIST", 49, 49, ad5Var2, sf7Var7), new cd5("MAP", 50, 50, ad5.d, sf7.a)};
        cd5[] cd5VarArrValues = values();
        c = new cd5[cd5VarArrValues.length];
        for (cd5 cd5Var50 : cd5VarArrValues) {
            c[cd5Var50.id] = cd5Var50;
        }
    }

    public cd5(String str, int i, int i2, ad5 ad5Var, sf7 sf7Var) {
        int iOrdinal;
        super(str, i);
        this.id = i2;
        this.collection = ad5Var;
        this.javaType = sf7Var;
        int iOrdinal2 = ad5Var.ordinal();
        if (iOrdinal2 == 1 || iOrdinal2 == 3) {
            this.elementType = sf7Var.a();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (ad5Var != ad5.a || (iOrdinal = sf7Var.ordinal()) == 6 || iOrdinal == 7 || iOrdinal == 9) ? false : true;
    }

    public static cd5 valueOf(String str) {
        return (cd5) Enum.valueOf(cd5.class, str);
    }

    public static cd5[] values() {
        return (cd5[]) d.clone();
    }

    public final int a() {
        return this.id;
    }
}
