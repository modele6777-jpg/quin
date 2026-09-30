package ai.askquin.ui.reading.model;

import ai.askquin.R;
import defpackage.lx4;
import defpackage.pa7;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\f\b\u0001\u0010\u0002\u001a\u00020\u0003:\u0002\b\u0004\u0012\f\b\u0001\u0010\u0005\u001a\u00020\u0003:\u0002\b\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fÊ\u0001\u0002\b\u0011¨\u0006\u0010"}, d2 = {"Lai/askquin/ui/reading/model/QuestionCategory;", "", "iconRes", "", "Landroidx/annotation/DrawableRes;", "labelRes", "Landroidx/annotation/StringRes;", "<init>", "(Ljava/lang/String;III)V", "getIconRes", "()I", "getLabelRes", "MyCareer", "MyGrowth", "MyRelationship", "MyFortune", "Quin:conversation_gpRelease", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum QuestionCategory {
    MyCareer(R.drawable.ic_reading_career, R.string.reading_question_category_my_career),
    MyGrowth(R.drawable.ic_reading_growth, R.string.reading_question_category_my_growth),
    MyRelationship(R.drawable.ic_reading_relationship, R.string.reading_question_category_my_relationship),
    MyFortune(R.drawable.ic_reading_my_fortune, R.string.reading_question_category_my_fortune);

    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    private final int iconRes;
    private final int labelRes;

    QuestionCategory(int i, int i2) {
        this.iconRes = i;
        this.labelRes = i2;
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }
}
