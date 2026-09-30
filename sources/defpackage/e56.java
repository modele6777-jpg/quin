package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 e56[], still in use, count: 1, list:
  (r0v1 e56[]) from 0x005c: CONSTRUCTOR (r0v1 e56[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:93) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class e56 implements p07 {
    EXAM("app.xmind.quin.test_report"),
    EXAM_DISCOUNT("app.xmind.quin.discounted_test_report"),
    YEARLY_READING_2026("app.xmind.thefool.2026_yearly_reading"),
    SUMMER_SOLSTICE_READING_2026("app.xmind.thefool.seasonalReading"),
    SUMMER_SOLSTICE_READING_2026_EARLY_BIRD("app.xmind.thefool.seasonalReadingEarlyBird"),
    AUTUMN_EQUINOX_READING_2026("app.xmind.quin.seasonal_reading"),
    AUTUMN_EQUINOX_READING_2026_EARLY_BIRD("app.xmind.quin.seasonal_reading_early_bird");

    public static final /* synthetic */ mx4 w;
    private final String productId;

    static {
        w = new mx4(e56VarArr);
    }

    public e56(String str) {
        super(str, i);
        this.productId = str;
    }

    public static e56 valueOf(String str) {
        return (e56) Enum.valueOf(e56.class, str);
    }

    public static e56[] values() {
        return (e56[]) v.clone();
    }

    @Override // defpackage.cwa
    public final String b() {
        return this.productId;
    }
}
