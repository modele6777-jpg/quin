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
/* JADX INFO: loaded from: classes.dex */
public class y9g {
    public static final m9g a;
    public static final p9g b;
    public static final s9g c;
    public static final /* synthetic */ y9g[] d;
    private final bag javaType;
    private final int wireType;

    /* JADX INFO: Fake field, exist only in values array */
    y9g EF0;

    /* JADX INFO: Fake field, exist only in values array */
    y9g EF1;

    /* JADX INFO: Fake field, exist only in values array */
    y9g EF2;

    static {
        y9g y9gVar = new y9g("DOUBLE", 0, bag.DOUBLE, 1);
        y9g y9gVar2 = new y9g("FLOAT", 1, bag.FLOAT, 5);
        bag bagVar = bag.LONG;
        y9g y9gVar3 = new y9g("INT64", 2, bagVar, 0);
        y9g y9gVar4 = new y9g("UINT64", 3, bagVar, 0);
        bag bagVar2 = bag.INT;
        y9g y9gVar5 = new y9g("INT32", 4, bagVar2, 0);
        y9g y9gVar6 = new y9g("FIXED64", 5, bagVar, 1);
        y9g y9gVar7 = new y9g("FIXED32", 6, bagVar2, 5);
        y9g y9gVar8 = new y9g("BOOL", 7, bag.BOOLEAN, 0);
        m9g m9gVar = new m9g("STRING", 8, bag.STRING, 2);
        a = m9gVar;
        bag bagVar3 = bag.MESSAGE;
        p9g p9gVar = new p9g("GROUP", 9, bagVar3, 3);
        b = p9gVar;
        s9g s9gVar = new s9g("MESSAGE", 10, bagVar3, 2);
        c = s9gVar;
        d = new y9g[]{y9gVar, y9gVar2, y9gVar3, y9gVar4, y9gVar5, y9gVar6, y9gVar7, y9gVar8, m9gVar, p9gVar, s9gVar, new v9g("BYTES", 11, bag.BYTE_STRING, 2), new y9g("UINT32", 12, bagVar2, 0), new y9g("ENUM", 13, bag.ENUM, 0), new y9g("SFIXED32", 14, bagVar2, 5), new y9g("SFIXED64", 15, bagVar, 1), new y9g("SINT32", 16, bagVar2, 0), new y9g("SINT64", 17, bagVar, 0)};
    }

    public y9g(String str, int i, bag bagVar, int i2) {
        super(str, i);
        this.javaType = bagVar;
        this.wireType = i2;
    }

    public static y9g valueOf(String str) {
        return (y9g) Enum.valueOf(y9g.class, str);
    }

    public static y9g[] values() {
        return (y9g[]) d.clone();
    }

    public final bag a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }
}
