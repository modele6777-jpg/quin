package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a56[], still in use, count: 1, list:
  (r0v1 a56[]) from 0x0026: CONSTRUCTOR (r0v1 a56[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class a56 {
    /* JADX INFO: Fake field, exist only in values array */
    Female("female"),
    /* JADX INFO: Fake field, exist only in values array */
    Male("male"),
    /* JADX INFO: Fake field, exist only in values array */
    Other("other");

    public static final y25 a = new y25(5);
    public static final /* synthetic */ mx4 c = new mx4(new a56[]{new a56("female"), new a56("male"), new a56("other")});
    private final String key;

    static {
    }

    public a56(String str) {
        super(str, i);
        this.key = str;
    }

    public static a56 valueOf(String str) {
        return (a56) Enum.valueOf(a56.class, str);
    }

    public static a56[] values() {
        return (a56[]) b.clone();
    }

    public final String a() {
        return this.key;
    }
}
