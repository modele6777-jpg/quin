package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pyf[], still in use, count: 1, list:
  (r0v1 pyf[]) from 0x003e: CONSTRUCTOR (r0v1 pyf[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:63) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes3.dex */
public final class pyf {
    INTERNAL(0),
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);

    public static final /* synthetic */ mx4 e;
    private final ji5 flag;

    static {
        e = new mx4(pyfVarArr);
    }

    public pyf(int i) {
        super(str, i);
        mi5 mi5Var = oi5.d;
        mi5Var.getClass();
        this.flag = new ji5(mi5Var, i);
    }

    public static pyf valueOf(String str) {
        return (pyf) Enum.valueOf(pyf.class, str);
    }

    public static pyf[] values() {
        return (pyf[]) d.clone();
    }

    public final ji5 a() {
        return this.flag;
    }
}
