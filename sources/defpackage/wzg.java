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
public final class wzg {
    public static final wzg a;
    public static final wzg b;
    public static final wzg[] c;
    public static final /* synthetic */ wzg[] d;
    private final int zzab;

    /* JADX INFO: Fake field, exist only in values array */
    wzg EF0;

    static {
        s1h s1hVar = s1h.DOUBLE;
        wzg wzgVar = new wzg("DOUBLE", 0, 0, 1, s1hVar);
        s1h s1hVar2 = s1h.FLOAT;
        wzg wzgVar2 = new wzg("FLOAT", 1, 1, 1, s1hVar2);
        s1h s1hVar3 = s1h.LONG;
        wzg wzgVar3 = new wzg("INT64", 2, 2, 1, s1hVar3);
        wzg wzgVar4 = new wzg("UINT64", 3, 3, 1, s1hVar3);
        s1h s1hVar4 = s1h.INT;
        wzg wzgVar5 = new wzg("INT32", 4, 4, 1, s1hVar4);
        wzg wzgVar6 = new wzg("FIXED64", 5, 5, 1, s1hVar3);
        wzg wzgVar7 = new wzg("FIXED32", 6, 6, 1, s1hVar4);
        s1h s1hVar5 = s1h.BOOLEAN;
        wzg wzgVar8 = new wzg("BOOL", 7, 7, 1, s1hVar5);
        s1h s1hVar6 = s1h.STRING;
        wzg wzgVar9 = new wzg("STRING", 8, 8, 1, s1hVar6);
        s1h s1hVar7 = s1h.MESSAGE;
        wzg wzgVar10 = new wzg("MESSAGE", 9, 9, 1, s1hVar7);
        s1h s1hVar8 = s1h.BYTE_STRING;
        wzg wzgVar11 = new wzg("BYTES", 10, 10, 1, s1hVar8);
        wzg wzgVar12 = new wzg("UINT32", 11, 11, 1, s1hVar4);
        s1h s1hVar9 = s1h.ENUM;
        wzg wzgVar13 = new wzg("ENUM", 12, 12, 1, s1hVar9);
        wzg wzgVar14 = new wzg("SFIXED32", 13, 13, 1, s1hVar4);
        wzg wzgVar15 = new wzg("SFIXED64", 14, 14, 1, s1hVar3);
        wzg wzgVar16 = new wzg("SINT32", 15, 15, 1, s1hVar4);
        wzg wzgVar17 = new wzg("SINT64", 16, 16, 1, s1hVar3);
        wzg wzgVar18 = new wzg("GROUP", 17, 17, 1, s1hVar7);
        wzg wzgVar19 = new wzg("DOUBLE_LIST", 18, 18, 2, s1hVar);
        wzg wzgVar20 = new wzg("FLOAT_LIST", 19, 19, 2, s1hVar2);
        wzg wzgVar21 = new wzg("INT64_LIST", 20, 20, 2, s1hVar3);
        wzg wzgVar22 = new wzg("UINT64_LIST", 21, 21, 2, s1hVar3);
        wzg wzgVar23 = new wzg("INT32_LIST", 22, 22, 2, s1hVar4);
        wzg wzgVar24 = new wzg("FIXED64_LIST", 23, 23, 2, s1hVar3);
        wzg wzgVar25 = new wzg("FIXED32_LIST", 24, 24, 2, s1hVar4);
        wzg wzgVar26 = new wzg("BOOL_LIST", 25, 25, 2, s1hVar5);
        wzg wzgVar27 = new wzg("STRING_LIST", 26, 26, 2, s1hVar6);
        wzg wzgVar28 = new wzg("MESSAGE_LIST", 27, 27, 2, s1hVar7);
        wzg wzgVar29 = new wzg("BYTES_LIST", 28, 28, 2, s1hVar8);
        wzg wzgVar30 = new wzg("UINT32_LIST", 29, 29, 2, s1hVar4);
        wzg wzgVar31 = new wzg("ENUM_LIST", 30, 30, 2, s1hVar9);
        wzg wzgVar32 = new wzg("SFIXED32_LIST", 31, 31, 2, s1hVar4);
        wzg wzgVar33 = new wzg("SFIXED64_LIST", 32, 32, 2, s1hVar3);
        wzg wzgVar34 = new wzg("SINT32_LIST", 33, 33, 2, s1hVar4);
        wzg wzgVar35 = new wzg("SINT64_LIST", 34, 34, 2, s1hVar3);
        wzg wzgVar36 = new wzg("DOUBLE_LIST_PACKED", 35, 35, 3, s1hVar);
        a = wzgVar36;
        wzg wzgVar37 = new wzg("FLOAT_LIST_PACKED", 36, 36, 3, s1hVar2);
        wzg wzgVar38 = new wzg("INT64_LIST_PACKED", 37, 37, 3, s1hVar3);
        wzg wzgVar39 = new wzg("UINT64_LIST_PACKED", 38, 38, 3, s1hVar3);
        wzg wzgVar40 = new wzg("INT32_LIST_PACKED", 39, 39, 3, s1hVar4);
        wzg wzgVar41 = new wzg("FIXED64_LIST_PACKED", 40, 40, 3, s1hVar3);
        wzg wzgVar42 = new wzg("FIXED32_LIST_PACKED", 41, 41, 3, s1hVar4);
        wzg wzgVar43 = new wzg("BOOL_LIST_PACKED", 42, 42, 3, s1hVar5);
        wzg wzgVar44 = new wzg("UINT32_LIST_PACKED", 43, 43, 3, s1hVar4);
        wzg wzgVar45 = new wzg("ENUM_LIST_PACKED", 44, 44, 3, s1hVar9);
        wzg wzgVar46 = new wzg("SFIXED32_LIST_PACKED", 45, 45, 3, s1hVar4);
        wzg wzgVar47 = new wzg("SFIXED64_LIST_PACKED", 46, 46, 3, s1hVar3);
        wzg wzgVar48 = new wzg("SINT32_LIST_PACKED", 47, 47, 3, s1hVar4);
        wzg wzgVar49 = new wzg("SINT64_LIST_PACKED", 48, 48, 3, s1hVar3);
        b = wzgVar49;
        d = new wzg[]{wzgVar, wzgVar2, wzgVar3, wzgVar4, wzgVar5, wzgVar6, wzgVar7, wzgVar8, wzgVar9, wzgVar10, wzgVar11, wzgVar12, wzgVar13, wzgVar14, wzgVar15, wzgVar16, wzgVar17, wzgVar18, wzgVar19, wzgVar20, wzgVar21, wzgVar22, wzgVar23, wzgVar24, wzgVar25, wzgVar26, wzgVar27, wzgVar28, wzgVar29, wzgVar30, wzgVar31, wzgVar32, wzgVar33, wzgVar34, wzgVar35, wzgVar36, wzgVar37, wzgVar38, wzgVar39, wzgVar40, wzgVar41, wzgVar42, wzgVar43, wzgVar44, wzgVar45, wzgVar46, wzgVar47, wzgVar48, wzgVar49, new wzg("GROUP_LIST", 49, 49, 2, s1hVar7), new wzg("MAP", 50, 50, 4, s1h.VOID)};
        wzg[] wzgVarArrValues = values();
        c = new wzg[wzgVarArrValues.length];
        for (wzg wzgVar50 : wzgVarArrValues) {
            c[wzgVar50.zzab] = wzgVar50;
        }
    }

    public wzg(String str, int i, int i2, int i3, s1h s1hVar) {
        super(str, i);
        this.zzab = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            s1hVar.getClass();
        }
        if (i3 == 1) {
            s1h s1hVar2 = s1h.VOID;
            s1hVar.ordinal();
        }
    }

    public static wzg[] values() {
        return (wzg[]) d.clone();
    }

    public final int a() {
        return this.zzab;
    }
}
