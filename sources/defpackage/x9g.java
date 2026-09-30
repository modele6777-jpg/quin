package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
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
public class x9g {
    public static final x9g a;
    public static final x9g b;
    public static final o9g c;
    public static final r9g d;
    public static final x9g e;
    public static final /* synthetic */ x9g[] f;
    private final aag javaType;
    private final int wireType;

    /* JADX INFO: Fake field, exist only in values array */
    x9g EF0;

    /* JADX INFO: Fake field, exist only in values array */
    x9g EF1;

    /* JADX INFO: Fake field, exist only in values array */
    x9g EF2;

    static {
        x9g x9gVar = new x9g("DOUBLE", 0, aag.d, 1);
        x9g x9gVar2 = new x9g("FLOAT", 1, aag.c, 5);
        aag aagVar = aag.b;
        x9g x9gVar3 = new x9g("INT64", 2, aagVar, 0);
        x9g x9gVar4 = new x9g("UINT64", 3, aagVar, 0);
        aag aagVar2 = aag.a;
        x9g x9gVar5 = new x9g("INT32", 4, aagVar2, 0);
        a = x9gVar5;
        x9g x9gVar6 = new x9g("FIXED64", 5, aagVar, 1);
        x9g x9gVar7 = new x9g("FIXED32", 6, aagVar2, 5);
        x9g x9gVar8 = new x9g("BOOL", 7, aag.e, 0);
        b = x9gVar8;
        l9g l9gVar = new l9g("STRING", 8, aag.f, 2);
        aag aagVar3 = aag.w;
        o9g o9gVar = new o9g("GROUP", 9, aagVar3, 3);
        c = o9gVar;
        r9g r9gVar = new r9g("MESSAGE", 10, aagVar3, 2);
        d = r9gVar;
        u9g u9gVar = new u9g("BYTES", 11, aag.g, 2);
        x9g x9gVar9 = new x9g("UINT32", 12, aagVar2, 0);
        x9g x9gVar10 = new x9g("ENUM", 13, aag.v, 0);
        e = x9gVar10;
        f = new x9g[]{x9gVar, x9gVar2, x9gVar3, x9gVar4, x9gVar5, x9gVar6, x9gVar7, x9gVar8, l9gVar, o9gVar, r9gVar, u9gVar, x9gVar9, x9gVar10, new x9g("SFIXED32", 14, aagVar2, 5), new x9g("SFIXED64", 15, aagVar, 1), new x9g("SINT32", 16, aagVar2, 0), new x9g("SINT64", 17, aagVar, 0)};
    }

    public x9g(String str, int i, aag aagVar, int i2) {
        super(str, i);
        this.javaType = aagVar;
        this.wireType = i2;
    }

    public static x9g valueOf(String str) {
        return (x9g) Enum.valueOf(x9g.class, str);
    }

    public static x9g[] values() {
        return (x9g[]) f.clone();
    }

    public final aag a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }

    public boolean c() {
        return !(this instanceof l9g);
    }
}
