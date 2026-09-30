package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
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
public class w9g {
    public static final w9g a;
    public static final k9g b;
    public static final n9g c;
    public static final /* synthetic */ w9g[] d;
    private final z9g javaType;
    private final int wireType;

    /* JADX INFO: Fake field, exist only in values array */
    w9g EF0;

    /* JADX INFO: Fake field, exist only in values array */
    w9g EF1;

    static {
        w9g w9gVar = new w9g("DOUBLE", 0, z9g.DOUBLE, 1);
        w9g w9gVar2 = new w9g("FLOAT", 1, z9g.FLOAT, 5);
        z9g z9gVar = z9g.LONG;
        w9g w9gVar3 = new w9g("INT64", 2, z9gVar, 0);
        a = w9gVar3;
        w9g w9gVar4 = new w9g("UINT64", 3, z9gVar, 0);
        z9g z9gVar2 = z9g.INT;
        w9g w9gVar5 = new w9g("INT32", 4, z9gVar2, 0);
        w9g w9gVar6 = new w9g("FIXED64", 5, z9gVar, 1);
        w9g w9gVar7 = new w9g("FIXED32", 6, z9gVar2, 5);
        w9g w9gVar8 = new w9g("BOOL", 7, z9g.BOOLEAN, 0);
        k9g k9gVar = new k9g("STRING", 8, z9g.STRING, 2);
        b = k9gVar;
        z9g z9gVar3 = z9g.MESSAGE;
        n9g n9gVar = new n9g("GROUP", 9, z9gVar3, 3);
        c = n9gVar;
        d = new w9g[]{w9gVar, w9gVar2, w9gVar3, w9gVar4, w9gVar5, w9gVar6, w9gVar7, w9gVar8, k9gVar, n9gVar, new q9g("MESSAGE", 10, z9gVar3, 2), new t9g("BYTES", 11, z9g.BYTE_STRING, 2), new w9g("UINT32", 12, z9gVar2, 0), new w9g("ENUM", 13, z9g.ENUM, 0), new w9g("SFIXED32", 14, z9gVar2, 5), new w9g("SFIXED64", 15, z9gVar, 1), new w9g("SINT32", 16, z9gVar2, 0), new w9g("SINT64", 17, z9gVar, 0)};
    }

    public w9g(String str, int i, z9g z9gVar, int i2) {
        super(str, i);
        this.javaType = z9gVar;
        this.wireType = i2;
    }

    public static w9g valueOf(String str) {
        return (w9g) Enum.valueOf(w9g.class, str);
    }

    public static w9g[] values() {
        return (w9g[]) d.clone();
    }

    public final z9g a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }
}
