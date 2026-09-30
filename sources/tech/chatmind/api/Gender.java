package tech.chatmind.api;

import ai.askquin.R;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.mz4;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.z18;
import defpackage.z46;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Ltech/chatmind/api/Gender;", "", "", "stringId", "drawableId", "<init>", "(Ljava/lang/String;III)V", "I", "getStringId", "()I", "getDrawableId", "Companion", "z46", "MALE", "FEMALE", "OTHER", "UNDISCLOSED", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum Gender {
    MALE(R.string.gender_male, R.drawable.ic_male),
    FEMALE(R.string.gender_female, R.drawable.ic_female),
    OTHER(R.string.gender_other, R.drawable.ic_gender_other),
    UNDISCLOSED(R.string.gender_undisclosed, R.drawable.ic_gender_private);

    private final int drawableId;
    private final int stringId;
    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final z46 Companion = new z46();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new mz4(29));

    Gender(int i, int i2) {
        this.stringId = i;
        this.drawableId = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _init_$_anonymous_() {
        Gender[] genderArrValues = values();
        genderArrValues.getClass();
        return new wn2("tech.chatmind.api.Gender", genderArrValues);
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }

    public final int getDrawableId() {
        return this.drawableId;
    }

    public final int getStringId() {
        return this.stringId;
    }
}
