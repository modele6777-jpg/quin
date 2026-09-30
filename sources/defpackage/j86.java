package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 j86[], still in use, count: 1, list:
  (r0v1 j86[]) from 0x002b: CONSTRUCTOR (r0v1 j86[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:44) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class j86 {
    /* JADX INFO: Fake field, exist only in values array */
    Eligible("eligible", true, false),
    /* JADX INFO: Fake field, exist only in values array */
    NoSubscription("no_subscription", false, false),
    /* JADX INFO: Fake field, exist only in values array */
    AlreadyPurchased("already_purchased", true, true);

    public static final yx4 a = new yx4(6);
    public static final /* synthetic */ mx4 c = new mx4(new j86[]{new j86("eligible", true, false), new j86("no_subscription", false, false), new j86("already_purchased", true, true)});
    private final boolean hasPurchasedGiftCard;
    private final boolean hasSubscription;
    private final String wireValue;

    static {
    }

    public j86(String str, boolean z, boolean z2) {
        super(str, i);
        this.wireValue = str;
        this.hasSubscription = z;
        this.hasPurchasedGiftCard = z2;
    }

    public static j86 valueOf(String str) {
        return (j86) Enum.valueOf(j86.class, str);
    }

    public static j86[] values() {
        return (j86[]) b.clone();
    }

    public final boolean a() {
        return this.hasPurchasedGiftCard;
    }

    public final boolean b() {
        return this.hasSubscription;
    }

    public final String c() {
        return this.wireValue;
    }
}
