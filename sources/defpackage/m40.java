package defpackage;

import ai.askquin.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 m40[], still in use, count: 1, list:
  (r0v1 m40[]) from 0x0022: CONSTRUCTOR (r0v1 m40[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:35) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class m40 {
    CompletedMonthly(R.string.annual_monthly_report),
    CompletedDomain(R.string.annual_domain_report);

    public static final /* synthetic */ mx4 d;
    private final int labelRes;

    static {
        d = new mx4(m40VarArr);
    }

    public m40(int i) {
        super(str, i);
        this.labelRes = i;
    }

    public static m40 valueOf(String str) {
        return (m40) Enum.valueOf(m40.class, str);
    }

    public static m40[] values() {
        return (m40[]) c.clone();
    }

    public final int a() {
        return this.labelRes;
    }
}
