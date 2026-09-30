package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 sfb[], still in use, count: 1, list:
  (r0v1 sfb[]) from 0x002c: CONSTRUCTOR (r0v1 sfb[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:45) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sfb {
    DISLIKE("dislike"),
    LIKE("like"),
    LOVE("love");

    public static final /* synthetic */ mx4 e;
    private final String value;

    static {
        e = new mx4(sfbVarArr);
    }

    public sfb(String str) {
        super(str, i);
        this.value = str;
    }

    public static sfb valueOf(String str) {
        return (sfb) Enum.valueOf(sfb.class, str);
    }

    public static sfb[] values() {
        return (sfb[]) d.clone();
    }

    public final String a() {
        return this.value;
    }
}
