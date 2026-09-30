package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u7e implements cwa {
    public static final /* synthetic */ mx4 E0;
    public static final u7e X;
    public static final u7e Y;
    public static final /* synthetic */ u7e[] Z;
    public static final uzd a;
    public static final u7e b;
    public static final u7e c;
    public static final u7e d;
    public static final u7e e;
    public static final u7e f;
    public static final u7e g;
    public static final u7e v;
    public static final u7e w;
    public static final u7e x;
    public static final u7e y;
    public static final u7e z;
    private final String basePlanId;
    private final g7e duration;
    private final o7e level;
    private final String offerId;
    private final String productId;
    private final boolean showInMainPaywall;

    static {
        g7e g7eVar = g7e.b;
        o7e o7eVar = o7e.d;
        u7e u7eVar = new u7e("Monthly", 0, "member-month", g7eVar, o7eVar, 16);
        b = u7eVar;
        g7e g7eVar2 = g7e.d;
        u7e u7eVar2 = new u7e("Yearly", 1, "member-year", g7eVar2, o7eVar, 16);
        c = u7eVar2;
        g7e g7eVar3 = g7e.c;
        u7e u7eVar3 = new u7e("SeasonalQuarterly", 2, "member-quarter", g7eVar3, o7eVar, 48);
        d = u7eVar3;
        g7e g7eVar4 = g7e.a;
        o7e o7eVar2 = o7e.c;
        u7e u7eVar4 = new u7e("Weekly", 3, "supreme-one-week", g7eVar4, o7eVar2, 48);
        e = u7eVar4;
        u7e u7eVar5 = new u7e("MonthlySupreme", 4, "supreme-one-month", g7eVar, o7eVar2, 48);
        f = u7eVar5;
        u7e u7eVar6 = new u7e("Quarterly", 5, "supreme-3-month", g7eVar3, o7eVar2, 48);
        g = u7eVar6;
        u7e u7eVar7 = new u7e("YearlySupreme", 6, "supreme-one-year", g7eVar2, o7eVar2, 48);
        v = u7eVar7;
        o7e o7eVar3 = o7e.b;
        u7e u7eVar8 = new u7e("WeeklyPro", 7, "pro-one-week", g7eVar4, o7eVar3, 48);
        u7e u7eVar9 = new u7e("MonthlyPro", 8, "pro-one-month", g7eVar, o7eVar3, 48);
        w = u7eVar9;
        u7e u7eVar10 = new u7e("QuarterPro", 9, "pro-3-month", g7eVar3, o7eVar3, 48);
        x = u7eVar10;
        u7e u7eVar11 = new u7e("YearlyPro", 10, "pro-one-year", g7eVar2, o7eVar3, 48);
        y = u7eVar11;
        u7e u7eVar12 = new u7e("YearlyProDiscount", 11, "pro-one-year", g7eVar2, o7eVar3, 32);
        o7e o7eVar4 = o7e.a;
        u7e u7eVar13 = new u7e("WeeklyBasic", 12, "basic-one-week", g7eVar4, o7eVar4, 48);
        u7e u7eVar14 = new u7e("MonthlyBasic", 13, "basic-one-month", g7eVar, o7eVar4, 48);
        z = u7eVar14;
        u7e u7eVar15 = new u7e("QuarterBasic", 14, "basic-3-month", g7eVar3, o7eVar4, 48);
        X = u7eVar15;
        u7e u7eVar16 = new u7e("YearlyBasic", 15, "basic-one-year", g7eVar2, o7eVar4, 48);
        Y = u7eVar16;
        u7e[] u7eVarArr = {u7eVar, u7eVar2, u7eVar3, u7eVar4, u7eVar5, u7eVar6, u7eVar7, u7eVar8, u7eVar9, u7eVar10, u7eVar11, u7eVar12, u7eVar13, u7eVar14, u7eVar15, u7eVar16};
        Z = u7eVarArr;
        E0 = new mx4(u7eVarArr);
        a = new uzd(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7e(String str, int i, String str2, g7e g7eVar, o7e o7eVar, int i2) {
        super(str, i);
        String str3 = (i2 & 16) != 0 ? null : "pro-one-year-discount";
        boolean z2 = (i2 & 32) == 0;
        this.productId = "app.xmind.quin.member";
        this.basePlanId = str2;
        this.duration = g7eVar;
        this.level = o7eVar;
        this.offerId = str3;
        this.showInMainPaywall = z2;
    }

    public static u7e valueOf(String str) {
        return (u7e) Enum.valueOf(u7e.class, str);
    }

    public static u7e[] values() {
        return (u7e[]) Z.clone();
    }

    @Override // defpackage.cwa, defpackage.p07
    public final String a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "limited-monthly";
        }
        if (iOrdinal == 1) {
            return "limited-annually-discount";
        }
        if (iOrdinal == 2) {
            return "limited-quarterly";
        }
        String str = this.offerId;
        return str == null ? this.basePlanId : str;
    }

    @Override // defpackage.cwa
    public final String b() {
        return this.productId;
    }

    public final String d() {
        return this.basePlanId;
    }

    public final g7e e() {
        return this.duration;
    }

    public final o7e g() {
        return this.level;
    }

    public final String h() {
        return this.offerId;
    }

    public final boolean i() {
        return this.showInMainPaywall;
    }
}
