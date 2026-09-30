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
public final class log {
    public static final log a;
    public static final log b;
    public static final log c;
    public static final /* synthetic */ log[] d;
    private final mog zzs;
    private final int zzt;

    /* JADX INFO: Fake field, exist only in values array */
    log EF1;

    /* JADX INFO: Fake field, exist only in values array */
    log EF2;

    /* JADX INFO: Fake field, exist only in values array */
    log EF0;

    static {
        log logVar = new log("DOUBLE", 0, mog.d, 1);
        log logVar2 = new log("FLOAT", 1, mog.c, 5);
        mog mogVar = mog.b;
        log logVar3 = new log("INT64", 2, mogVar, 0);
        log logVar4 = new log("UINT64", 3, mogVar, 0);
        mog mogVar2 = mog.a;
        log logVar5 = new log("INT32", 4, mogVar2, 0);
        log logVar6 = new log("FIXED64", 5, mogVar, 1);
        log logVar7 = new log("FIXED32", 6, mogVar2, 5);
        log logVar8 = new log("BOOL", 7, mog.e, 0);
        log logVar9 = new log("STRING", 8, mog.f, 2);
        a = logVar9;
        mog mogVar3 = mog.w;
        log logVar10 = new log("GROUP", 9, mogVar3, 3);
        b = logVar10;
        log logVar11 = new log("MESSAGE", 10, mogVar3, 2);
        c = logVar11;
        d = new log[]{logVar, logVar2, logVar3, logVar4, logVar5, logVar6, logVar7, logVar8, logVar9, logVar10, logVar11, new log("BYTES", 11, mog.g, 2), new log("UINT32", 12, mogVar2, 0), new log("ENUM", 13, mog.v, 0), new log("SFIXED32", 14, mogVar2, 5), new log("SFIXED64", 15, mogVar, 1), new log("SINT32", 16, mogVar2, 0), new log("SINT64", 17, mogVar, 0)};
    }

    public log(String str, int i, mog mogVar, int i2) {
        super(str, i);
        this.zzs = mogVar;
        this.zzt = i2;
    }

    public static log[] values() {
        return (log[]) d.clone();
    }

    public final mog a() {
        return this.zzs;
    }

    public final int b() {
        return this.zzt;
    }
}
