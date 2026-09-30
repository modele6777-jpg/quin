package defpackage;

import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 az2[], still in use, count: 1, list:
  (r0v1 az2[]) from 0x0028: CONSTRUCTOR (r0v1 az2[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:41) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class az2 implements cwa, p07 {
    CreditPackA("app.xmind.quin.creditpack.a", 0, "credit-pack-a"),
    CreditPackB("app.xmind.quin.creditpack.b", 1, "credit-pack-b");

    public static final /* synthetic */ mx4 d;
    private final String globalProductId;
    private final String planKey;
    private final String productId;

    static {
        d = new mx4(az2VarArr);
    }

    public az2(String str, int i, String str2) {
        super(str, i);
        this.productId = str;
        this.globalProductId = str;
        this.planKey = str2;
    }

    public static az2 valueOf(String str) {
        return (az2) Enum.valueOf(az2.class, str);
    }

    public static az2[] values() {
        return (az2[]) c.clone();
    }

    @Override // defpackage.cwa, defpackage.p07
    public final String a() {
        return this.planKey;
    }

    @Override // defpackage.cwa
    public final String b() {
        return this.productId;
    }

    @Override // defpackage.p07
    public final Set c() {
        return qd0.I0(new String[]{this.productId, this.globalProductId});
    }
}
