package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 d09[], still in use, count: 1, list:
  (r0v1 d09[]) from 0x0030: CONSTRUCTOR (r0v1 d09[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:49) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class d09 {
    FINAL(0),
    OPEN(1),
    ABSTRACT(2),
    SEALED(3);

    public static final /* synthetic */ mx4 f;
    private final ji5 flag;

    static {
        f = new mx4(d09VarArr);
    }

    public d09(int i) {
        super(str, i);
        mi5 mi5Var = oi5.e;
        mi5Var.getClass();
        this.flag = new ji5(mi5Var, i);
    }

    public static d09 valueOf(String str) {
        return (d09) Enum.valueOf(d09.class, str);
    }

    public static d09[] values() {
        return (d09[]) e.clone();
    }

    public final ji5 a() {
        return this.flag;
    }
}
