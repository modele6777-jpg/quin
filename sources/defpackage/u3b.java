package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 u3b[], still in use, count: 1, list:
  (r0v1 u3b[]) from 0x0026: CONSTRUCTOR (r0v1 u3b[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class u3b {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("Yes", "the_sun"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("Maybe", "the_moon"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("No", "the_hermit");

    public static final /* synthetic */ mx4 b;
    private final String cardKey;
    private final String label;

    static {
        b = new mx4(u3bVarArr);
    }

    public u3b(String str, String str2) {
        super(str, i);
        this.label = str;
        this.cardKey = str2;
    }

    public static u3b valueOf(String str) {
        return (u3b) Enum.valueOf(u3b.class, str);
    }

    public static u3b[] values() {
        return (u3b[]) a.clone();
    }

    public final String a() {
        return this.cardKey;
    }

    public final String b() {
        return this.label;
    }
}
