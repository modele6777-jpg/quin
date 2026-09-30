package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 zq8[], still in use, count: 1, list:
  (r0v1 zq8[]) from 0x0028: CONSTRUCTOR (r0v1 zq8[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:41) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class zq8 {
    /* JADX INFO: Fake field, exist only in values array */
    DECLARATION(0),
    /* JADX INFO: Fake field, exist only in values array */
    FAKE_OVERRIDE(1),
    /* JADX INFO: Fake field, exist only in values array */
    DELEGATION(2),
    /* JADX INFO: Fake field, exist only in values array */
    SYNTHESIZED(3);

    public static final /* synthetic */ mx4 b;
    private final ji5 flag;

    static {
        b = new mx4(zq8VarArr);
    }

    public zq8(int i) {
        super(str, i);
        mi5 mi5Var = oi5.q;
        mi5Var.getClass();
        this.flag = new ji5(mi5Var, i);
    }

    public static zq8 valueOf(String str) {
        return (zq8) Enum.valueOf(zq8.class, str);
    }

    public static zq8[] values() {
        return (zq8[]) a.clone();
    }

    public final ji5 a() {
        return this.flag;
    }
}
