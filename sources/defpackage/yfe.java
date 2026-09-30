package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yfe[], still in use, count: 1, list:
  (r0v1 yfe[]) from 0x0048: CONSTRUCTOR (r0v1 yfe[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:73) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class yfe {
    FRONT("front"),
    BACK("back"),
    /* JADX INFO: Fake field, exist only in values array */
    LEFT("left"),
    /* JADX INFO: Fake field, exist only in values array */
    RIGHT("right"),
    /* JADX INFO: Fake field, exist only in values array */
    TOP("top"),
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM("bottom");

    public static final /* synthetic */ mx4 d;
    private final String resourceSuffix;

    static {
        d = new mx4(yfeVarArr);
    }

    public yfe(String str) {
        super(str, i);
        this.resourceSuffix = str;
    }

    public static yfe valueOf(String str) {
        return (yfe) Enum.valueOf(yfe.class, str);
    }

    public static yfe[] values() {
        return (yfe[]) c.clone();
    }

    public final String a() {
        return this.resourceSuffix;
    }
}
