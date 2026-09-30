package defpackage;

import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 thb[], still in use, count: 1, list:
  (r0v1 thb[]) from 0x00bd: CONSTRUCTOR (r0v1 thb[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:190) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class thb implements cwa, p07 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("OneTime", "app.xmind.quin.1reading", null),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("SevenTimes", "app.xmind.quin.7readings", null),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("TenTimes", "app.xmind.quin.10readings", null),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("FifteenTimes", "app.xmind.quin.15readings", null),
    a("FiveCount", "app.xmind.quin.5readings", null),
    b("SixCount", null, "6-times"),
    c("TwentyCount", "app.xmind.quin.20readings", null),
    d("SixtyCount", "app.xmind.quin.60readings", null),
    e("FiveCount1001", "app.xmind.quin.5readings", null),
    f("GlobalLimitedFiveTimes", "app.xmind.quin.global.limited.5times", null),
    g("TwentyFiveCount1001", "app.xmind.quin.25readings", null),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("DiscountFiveCount", "app.xmind.thefool.discount_5times", null),
    v("TenTimesAbTest", "app.xmind.thefool.limited.10times", null);

    public static final /* synthetic */ mx4 x;
    private final String cnPlanKey;
    private final int count;
    private final String googlePlayProductId;

    static {
        x = new mx4(thbVarArr);
    }

    public thb(String str, String str2, String str3) {
        super(str, i);
        this.googlePlayProductId = str2;
        this.count = i;
        this.cnPlanKey = str3;
    }

    public static thb valueOf(String str) {
        return (thb) Enum.valueOf(thb.class, str);
    }

    public static thb[] values() {
        return (thb[]) w.clone();
    }

    @Override // defpackage.cwa, defpackage.p07
    public final String a() {
        String str = this.cnPlanKey;
        return str == null ? b() : str;
    }

    @Override // defpackage.cwa
    public final String b() {
        String str = this.googlePlayProductId;
        return str == null ? "" : str;
    }

    @Override // defpackage.p07
    public final Set c() {
        String str = this.googlePlayProductId;
        return str != null ? n3d.p(str) : xu4.a;
    }

    public final int d() {
        return this.count;
    }
}
