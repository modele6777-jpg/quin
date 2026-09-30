package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 hj[], still in use, count: 1, list:
  (r0v1 hj[]) from 0x000f: CONSTRUCTOR (r0v1 hj[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:16) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class hj implements p07 {
    CurrentDecks;

    public static final /* synthetic */ mx4 c;
    private final String planKey;
    private final String productId;

    static {
        c = new mx4(hjVarArr);
    }

    public hj() {
        super("CurrentDecks", 0);
        this.productId = "app.xmind.quin.all_tarot_decks";
        this.planKey = "all-tarot-decks";
    }

    public static hj valueOf(String str) {
        return (hj) Enum.valueOf(hj.class, str);
    }

    public static hj[] values() {
        return (hj[]) b.clone();
    }

    @Override // defpackage.cwa
    public final String b() {
        return this.productId;
    }
}
