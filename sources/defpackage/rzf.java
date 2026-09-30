package defpackage;

import ai.askquin.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rzf[], still in use, count: 1, list:
  (r0v1 rzf[]) from 0x00e0: CONSTRUCTOR (r0v1 rzf[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:225) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class rzf {
    /* JADX INFO: Fake field, exist only in values array */
    Emotion("romanticRelationship", R.string.onboarding_wanna_know_emotion, Integer.valueOf(R.drawable.ic_wanna_know_emotion), Integer.valueOf(R.drawable.ic_wanna_know_emotion_neo)),
    /* JADX INFO: Fake field, exist only in values array */
    Career("careerDirection", R.string.onboarding_wanna_know_career, Integer.valueOf(R.drawable.ic_wanna_know_career), Integer.valueOf(R.drawable.ic_wanna_know_career_neo)),
    /* JADX INFO: Fake field, exist only in values array */
    AcademicAdvice("academicAdvice", R.string.onboarding_wanna_know_studies, Integer.valueOf(R.drawable.ic_wanna_know_studies), Integer.valueOf(R.drawable.ic_wanna_know_studies_neo)),
    /* JADX INFO: Fake field, exist only in values array */
    Life("lifeMystery", R.string.onboarding_wanna_know_life, Integer.valueOf(R.drawable.ic_wanna_know_life), Integer.valueOf(R.drawable.ic_wanna_know_life_neo)),
    /* JADX INFO: Fake field, exist only in values array */
    Fortune("recentLuck", R.string.onboarding_wanna_know_fortune, Integer.valueOf(R.drawable.ic_wanna_know_fortune), Integer.valueOf(R.drawable.ic_wanna_know_fortune_neo)),
    /* JADX INFO: Fake field, exist only in values array */
    DecisionMaking("decisionMaking", R.string.onboarding_wanna_know_decision, Integer.valueOf(R.drawable.ic_wanna_know_decision), Integer.valueOf(R.drawable.ic_wanna_know_decision_neo)),
    /* JADX INFO: Fake field, exist only in values array */
    SelfUnderstanding("selfUnderstanding", R.string.onboarding_wanna_know_about_self, Integer.valueOf(R.drawable.ic_wanna_know_about_self), Integer.valueOf(R.drawable.ic_wanna_know_about_self_neo)),
    /* JADX INFO: Fake field, exist only in values array */
    JustLookAround("justLookAround", R.string.onboarding_wanna_know_other, Integer.valueOf(R.drawable.ic_wanna_know_other), Integer.valueOf(R.drawable.ic_wanna_know_other_neo));

    public static final g3e a = new g3e(10);
    public static final /* synthetic */ mx4 c = new mx4(new rzf[]{new rzf("romanticRelationship", R.string.onboarding_wanna_know_emotion, Integer.valueOf(R.drawable.ic_wanna_know_emotion), Integer.valueOf(R.drawable.ic_wanna_know_emotion_neo)), new rzf("careerDirection", R.string.onboarding_wanna_know_career, Integer.valueOf(R.drawable.ic_wanna_know_career), Integer.valueOf(R.drawable.ic_wanna_know_career_neo)), new rzf("academicAdvice", R.string.onboarding_wanna_know_studies, Integer.valueOf(R.drawable.ic_wanna_know_studies), Integer.valueOf(R.drawable.ic_wanna_know_studies_neo)), new rzf("lifeMystery", R.string.onboarding_wanna_know_life, Integer.valueOf(R.drawable.ic_wanna_know_life), Integer.valueOf(R.drawable.ic_wanna_know_life_neo)), new rzf("recentLuck", R.string.onboarding_wanna_know_fortune, Integer.valueOf(R.drawable.ic_wanna_know_fortune), Integer.valueOf(R.drawable.ic_wanna_know_fortune_neo)), new rzf("decisionMaking", R.string.onboarding_wanna_know_decision, Integer.valueOf(R.drawable.ic_wanna_know_decision), Integer.valueOf(R.drawable.ic_wanna_know_decision_neo)), new rzf("selfUnderstanding", R.string.onboarding_wanna_know_about_self, Integer.valueOf(R.drawable.ic_wanna_know_about_self), Integer.valueOf(R.drawable.ic_wanna_know_about_self_neo)), new rzf("justLookAround", R.string.onboarding_wanna_know_other, Integer.valueOf(R.drawable.ic_wanna_know_other), Integer.valueOf(R.drawable.ic_wanna_know_other_neo))});
    private final Integer iconRes;
    private final String id;
    private final int labelRes;
    private final Integer neoIconRes;

    static {
    }

    public rzf(String str, int i, Integer num, Integer num2) {
        super(str, i);
        this.id = str;
        this.labelRes = i;
        this.iconRes = num;
        this.neoIconRes = num2;
    }

    public static rzf valueOf(String str) {
        return (rzf) Enum.valueOf(rzf.class, str);
    }

    public static rzf[] values() {
        return (rzf[]) b.clone();
    }

    public final Integer a() {
        return this.iconRes;
    }

    public final int b() {
        return this.labelRes;
    }

    public final Integer c() {
        return this.neoIconRes;
    }

    public final String getId() {
        return this.id;
    }
}
