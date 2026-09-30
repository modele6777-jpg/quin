package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mic[], still in use, count: 1, list:
  (r0v1 mic[]) from 0x0020: CONSTRUCTOR (r0v1 mic[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:33) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class mic {
    SummerSolstice2026("summer_solstice"),
    AutumnEquinox2026("autumn_equinox");

    public static final jy4 a;
    public static final mic b;
    public static final /* synthetic */ mx4 f;
    private final String seasonKey;
    private final int year;

    static {
        mic micVar = AutumnEquinox2026;
        f = new mx4(micVarArr);
        a = new jy4(26);
        b = micVar;
    }

    public mic(String str) {
        super(str, i);
        this.seasonKey = str;
        this.year = 2026;
    }

    public static mic valueOf(String str) {
        return (mic) Enum.valueOf(mic.class, str);
    }

    public static mic[] values() {
        return (mic[]) e.clone();
    }

    public final String a() {
        return this.seasonKey;
    }

    public final int b() {
        return this.year;
    }

    public final SolarTerm c() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return SolarTerm.SUMMER_SOLSTICE;
        }
        if (iOrdinal == 1) {
            return SolarTerm.AUTUMN_EQUINOX;
        }
        ap.c();
        return null;
    }
}
