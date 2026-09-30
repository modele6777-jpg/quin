package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v22 lif[], still in use, count: 1, list:
  (r0v22 lif[]) from 0x0144: CONSTRUCTOR (r0v22 lif[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:325) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class lif {
    Guest("guest"),
    PassOnly("pass-only"),
    PassAndCompensate("pass-and-compensate"),
    MonthlyActive("monthly-active"),
    MonthlyFreeCountInUse("monthly-free-count-in-use"),
    YearlyActive("yearly-active"),
    WeeklyActive("weekly-active"),
    MixedPassInUse("mixed-pass-in-use"),
    MixedUsageInUse("mixed-usage-in-use"),
    PartiallyUsedAddonStandby("partially-used-addon-standby"),
    NonSubscriberCountInUse("non-subscriber-count-in-use"),
    NonSubscriberUsageInUse("non-subscriber-usage-in-use"),
    AddonOnlyNoFollowUp("addon-only-no-follow-up"),
    AddonOnlyExhausted("addon-only-exhausted"),
    ExpiredSubscriptionAddonDailyLimit("expired-subscription-addon-daily-limit"),
    DailyLimitCn("daily-limit-cn"),
    DailyLimitUsageFirstWithCounts("daily-limit-usage-first-with-counts"),
    DailyLimitGlobal("daily-limit-global"),
    MonthlyExhausted("monthly-exhausted"),
    MonthlyExhaustedWithEventBonus("monthly-exhausted-with-event-bonus"),
    MonthlyExhaustedWithCombinedCounts("monthly-exhausted-with-combined-counts"),
    LastMonthExpireFallback("last-month-expire-fallback");

    public static final /* synthetic */ mx4 N0;
    public static final w1e a = new w1e(8);
    private final String wireValue;

    static {
        N0 = new mx4(new lif[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1, r0});
    }

    public lif(String str) {
        super(str, i);
        this.wireValue = str;
    }

    public static lif valueOf(String str) {
        return (lif) Enum.valueOf(lif.class, str);
    }

    public static lif[] values() {
        return (lif[]) M0.clone();
    }

    public final String a() {
        return this.wireValue;
    }
}
