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
public final class kmg {
    public static final kmg a;
    public static final kmg b;
    public static final kmg[] c;
    public static final /* synthetic */ kmg[] d;
    private final int zzZ;

    /* JADX INFO: Fake field, exist only in values array */
    kmg EF0;

    static {
        cng cngVar = cng.DOUBLE;
        kmg kmgVar = new kmg("DOUBLE", 0, 0, 1, cngVar);
        cng cngVar2 = cng.FLOAT;
        kmg kmgVar2 = new kmg("FLOAT", 1, 1, 1, cngVar2);
        cng cngVar3 = cng.LONG;
        kmg kmgVar3 = new kmg("INT64", 2, 2, 1, cngVar3);
        kmg kmgVar4 = new kmg("UINT64", 3, 3, 1, cngVar3);
        cng cngVar4 = cng.INT;
        kmg kmgVar5 = new kmg("INT32", 4, 4, 1, cngVar4);
        kmg kmgVar6 = new kmg("FIXED64", 5, 5, 1, cngVar3);
        kmg kmgVar7 = new kmg("FIXED32", 6, 6, 1, cngVar4);
        cng cngVar5 = cng.BOOLEAN;
        kmg kmgVar8 = new kmg("BOOL", 7, 7, 1, cngVar5);
        cng cngVar6 = cng.STRING;
        kmg kmgVar9 = new kmg("STRING", 8, 8, 1, cngVar6);
        cng cngVar7 = cng.MESSAGE;
        kmg kmgVar10 = new kmg("MESSAGE", 9, 9, 1, cngVar7);
        cng cngVar8 = cng.BYTE_STRING;
        kmg kmgVar11 = new kmg("BYTES", 10, 10, 1, cngVar8);
        kmg kmgVar12 = new kmg("UINT32", 11, 11, 1, cngVar4);
        cng cngVar9 = cng.ENUM;
        kmg kmgVar13 = new kmg("ENUM", 12, 12, 1, cngVar9);
        kmg kmgVar14 = new kmg("SFIXED32", 13, 13, 1, cngVar4);
        kmg kmgVar15 = new kmg("SFIXED64", 14, 14, 1, cngVar3);
        kmg kmgVar16 = new kmg("SINT32", 15, 15, 1, cngVar4);
        kmg kmgVar17 = new kmg("SINT64", 16, 16, 1, cngVar3);
        kmg kmgVar18 = new kmg("GROUP", 17, 17, 1, cngVar7);
        kmg kmgVar19 = new kmg("DOUBLE_LIST", 18, 18, 2, cngVar);
        kmg kmgVar20 = new kmg("FLOAT_LIST", 19, 19, 2, cngVar2);
        kmg kmgVar21 = new kmg("INT64_LIST", 20, 20, 2, cngVar3);
        kmg kmgVar22 = new kmg("UINT64_LIST", 21, 21, 2, cngVar3);
        kmg kmgVar23 = new kmg("INT32_LIST", 22, 22, 2, cngVar4);
        kmg kmgVar24 = new kmg("FIXED64_LIST", 23, 23, 2, cngVar3);
        kmg kmgVar25 = new kmg("FIXED32_LIST", 24, 24, 2, cngVar4);
        kmg kmgVar26 = new kmg("BOOL_LIST", 25, 25, 2, cngVar5);
        kmg kmgVar27 = new kmg("STRING_LIST", 26, 26, 2, cngVar6);
        kmg kmgVar28 = new kmg("MESSAGE_LIST", 27, 27, 2, cngVar7);
        kmg kmgVar29 = new kmg("BYTES_LIST", 28, 28, 2, cngVar8);
        kmg kmgVar30 = new kmg("UINT32_LIST", 29, 29, 2, cngVar4);
        kmg kmgVar31 = new kmg("ENUM_LIST", 30, 30, 2, cngVar9);
        kmg kmgVar32 = new kmg("SFIXED32_LIST", 31, 31, 2, cngVar4);
        kmg kmgVar33 = new kmg("SFIXED64_LIST", 32, 32, 2, cngVar3);
        kmg kmgVar34 = new kmg("SINT32_LIST", 33, 33, 2, cngVar4);
        kmg kmgVar35 = new kmg("SINT64_LIST", 34, 34, 2, cngVar3);
        kmg kmgVar36 = new kmg("DOUBLE_LIST_PACKED", 35, 35, 3, cngVar);
        a = kmgVar36;
        kmg kmgVar37 = new kmg("FLOAT_LIST_PACKED", 36, 36, 3, cngVar2);
        kmg kmgVar38 = new kmg("INT64_LIST_PACKED", 37, 37, 3, cngVar3);
        kmg kmgVar39 = new kmg("UINT64_LIST_PACKED", 38, 38, 3, cngVar3);
        kmg kmgVar40 = new kmg("INT32_LIST_PACKED", 39, 39, 3, cngVar4);
        kmg kmgVar41 = new kmg("FIXED64_LIST_PACKED", 40, 40, 3, cngVar3);
        kmg kmgVar42 = new kmg("FIXED32_LIST_PACKED", 41, 41, 3, cngVar4);
        kmg kmgVar43 = new kmg("BOOL_LIST_PACKED", 42, 42, 3, cngVar5);
        kmg kmgVar44 = new kmg("UINT32_LIST_PACKED", 43, 43, 3, cngVar4);
        kmg kmgVar45 = new kmg("ENUM_LIST_PACKED", 44, 44, 3, cngVar9);
        kmg kmgVar46 = new kmg("SFIXED32_LIST_PACKED", 45, 45, 3, cngVar4);
        kmg kmgVar47 = new kmg("SFIXED64_LIST_PACKED", 46, 46, 3, cngVar3);
        kmg kmgVar48 = new kmg("SINT32_LIST_PACKED", 47, 47, 3, cngVar4);
        kmg kmgVar49 = new kmg("SINT64_LIST_PACKED", 48, 48, 3, cngVar3);
        b = kmgVar49;
        d = new kmg[]{kmgVar, kmgVar2, kmgVar3, kmgVar4, kmgVar5, kmgVar6, kmgVar7, kmgVar8, kmgVar9, kmgVar10, kmgVar11, kmgVar12, kmgVar13, kmgVar14, kmgVar15, kmgVar16, kmgVar17, kmgVar18, kmgVar19, kmgVar20, kmgVar21, kmgVar22, kmgVar23, kmgVar24, kmgVar25, kmgVar26, kmgVar27, kmgVar28, kmgVar29, kmgVar30, kmgVar31, kmgVar32, kmgVar33, kmgVar34, kmgVar35, kmgVar36, kmgVar37, kmgVar38, kmgVar39, kmgVar40, kmgVar41, kmgVar42, kmgVar43, kmgVar44, kmgVar45, kmgVar46, kmgVar47, kmgVar48, kmgVar49, new kmg("GROUP_LIST", 49, 49, 2, cngVar7), new kmg("MAP", 50, 50, 4, cng.VOID)};
        kmg[] kmgVarArrValues = values();
        c = new kmg[kmgVarArrValues.length];
        for (kmg kmgVar50 : kmgVarArrValues) {
            c[kmgVar50.zzZ] = kmgVar50;
        }
    }

    public kmg(String str, int i, int i2, int i3, cng cngVar) {
        super(str, i);
        this.zzZ = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            cngVar.getClass();
        }
        if (i3 == 1) {
            cng cngVar2 = cng.VOID;
            cngVar.ordinal();
        }
    }

    public static kmg[] values() {
        return (kmg[]) d.clone();
    }

    public final int a() {
        return this.zzZ;
    }
}
