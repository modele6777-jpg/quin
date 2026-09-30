package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pu1[], still in use, count: 1, list:
  (r0v1 pu1[]) from 0x0034: CONSTRUCTOR (r0v1 pu1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:53) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class pu1 {
    MiddleSchoolStudent("middle_high_school"),
    College("college_above"),
    /* JADX INFO: Fake field, exist only in values array */
    Worker("worker"),
    /* JADX INFO: Fake field, exist only in values array */
    Freelance("freelance");

    public static final m8c a = new m8c(17);
    public static final /* synthetic */ mx4 e;
    private final String key;

    static {
        e = new mx4(new pu1[]{r0, r1, new pu1("worker"), new pu1("freelance")});
    }

    public pu1(String str) {
        super(str, i);
        this.key = str;
    }

    public static pu1 valueOf(String str) {
        return (pu1) Enum.valueOf(pu1.class, str);
    }

    public static pu1[] values() {
        return (pu1[]) d.clone();
    }

    public final String a() {
        return this.key;
    }
}
