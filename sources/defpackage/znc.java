package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 znc[], still in use, count: 1, list:
  (r0v1 znc[]) from 0x0036: CONSTRUCTOR (r0v1 znc[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:55) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class znc {
    /* JADX INFO: Fake field, exist only in values array */
    HAPPY_PATH("happy_path"),
    GENERATION_SLOW("generation_slow"),
    GENERATION_ERROR("generation_error"),
    FOLLOW_UP_ERROR("follow_up_error");

    public static final yx4 a = new yx4(27);
    public static final /* synthetic */ mx4 f;
    private final String wireValue;

    static {
        f = new mx4(new znc[]{r0, r1, r2, r3});
    }

    public znc(String str) {
        super(str, i);
        this.wireValue = str;
    }

    public static znc valueOf(String str) {
        return (znc) Enum.valueOf(znc.class, str);
    }

    public static znc[] values() {
        return (znc[]) e.clone();
    }

    public final String a() {
        return this.wireValue;
    }
}
