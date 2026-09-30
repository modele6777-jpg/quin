package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 kg4[], still in use, count: 1, list:
  (r0v1 kg4[]) from 0x0045: CONSTRUCTOR (r0v1 kg4[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:70) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class kg4 {
    /* JADX INFO: Fake field, exist only in values array */
    LOVE("love", 1),
    /* JADX INFO: Fake field, exist only in values array */
    CAREER("career", 2),
    /* JADX INFO: Fake field, exist only in values array */
    WEALTH("wealth", 3),
    /* JADX INFO: Fake field, exist only in values array */
    HEALTH("health", 4),
    /* JADX INFO: Fake field, exist only in values array */
    RELATIONSHIP("social", 5),
    /* JADX INFO: Fake field, exist only in values array */
    GROWTH("innerGrowth", 6);

    public static final gec a = new gec(28);
    public static final /* synthetic */ mx4 c = new mx4(new kg4[]{new kg4("love", 1), new kg4("career", 2), new kg4("wealth", 3), new kg4("health", 4), new kg4("social", 5), new kg4("innerGrowth", 6)});
    private final int id;
    private final String key;

    static {
    }

    public kg4(String str, int i) {
        super(str, i);
        this.id = i;
        this.key = str;
    }

    public static kg4 valueOf(String str) {
        return (kg4) Enum.valueOf(kg4.class, str);
    }

    public static kg4[] values() {
        return (kg4[]) b.clone();
    }

    public final int a() {
        return this.id;
    }

    public final String b() {
        return this.key;
    }
}
