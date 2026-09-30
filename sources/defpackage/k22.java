package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 k22[], still in use, count: 1, list:
  (r0v1 k22[]) from 0x004e: CONSTRUCTOR (r0v1 k22[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:79) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class k22 {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    OBJECT(5),
    COMPANION_OBJECT(6);

    public static final /* synthetic */ mx4 w;
    private final ji5 flag;

    static {
        w = new mx4(k22VarArr);
    }

    public k22(int i) {
        super(str, i);
        mi5 mi5Var = oi5.f;
        mi5Var.getClass();
        this.flag = new ji5(mi5Var, i);
    }

    public static k22 valueOf(String str) {
        return (k22) Enum.valueOf(k22.class, str);
    }

    public static k22[] values() {
        return (k22[]) v.clone();
    }

    public final ji5 a() {
        return this.flag;
    }
}
