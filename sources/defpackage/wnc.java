package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wnc[], still in use, count: 1, list:
  (r0v1 wnc[]) from 0x0030: CONSTRUCTOR (r0v1 wnc[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:49) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class wnc {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_PURCHASED("not_purchased"),
    /* JADX INFO: Fake field, exist only in values array */
    PURCHASED("purchased"),
    /* JADX INFO: Fake field, exist only in values array */
    GENERATING("generating"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPLETED("completed");

    public static final eu4 a = new eu4(27);
    public static final /* synthetic */ mx4 c = new mx4(new wnc[]{new wnc("not_purchased"), new wnc("purchased"), new wnc("generating"), new wnc("completed")});
    private final String wireValue;

    static {
    }

    public wnc(String str) {
        super(str, i);
        this.wireValue = str;
    }

    public static wnc valueOf(String str) {
        return (wnc) Enum.valueOf(wnc.class, str);
    }

    public static wnc[] values() {
        return (wnc[]) b.clone();
    }

    public final String a() {
        return this.wireValue;
    }
}
