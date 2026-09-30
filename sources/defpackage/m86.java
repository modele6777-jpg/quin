package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 m86[], still in use, count: 1, list:
  (r0v1 m86[]) from 0x0024: CONSTRUCTOR (r0v1 m86[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:37) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class m86 implements p07 {
    a("app.xmind.quin.giftcard.1month", "gift-card-1month"),
    b("app.xmind.quin.giftcard.1year", "gift-card-1year");

    public static final /* synthetic */ mx4 d;
    private final String planKey;
    private final String productId;

    static {
        d = new mx4(m86VarArr);
    }

    public m86(String str, String str2) {
        super(str, i);
        this.productId = str;
        this.planKey = str2;
    }

    public static m86 valueOf(String str) {
        return (m86) Enum.valueOf(m86.class, str);
    }

    public static m86[] values() {
        return (m86[]) c.clone();
    }

    @Override // defpackage.p07
    public final String a() {
        return this.planKey;
    }

    @Override // defpackage.cwa
    public final String b() {
        return this.productId;
    }

    public final String d() {
        return this.planKey;
    }
}
