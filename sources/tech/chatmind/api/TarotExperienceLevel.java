package tech.chatmind.api;

import ai.askquin.R;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.mie;
import defpackage.nie;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Ltech/chatmind/api/TarotExperienceLevel;", "", "", "stringId", "<init>", "(Ljava/lang/String;II)V", "I", "getStringId", "()I", "Companion", "nie", "BEGINNER", "INTERMEDIATE", "ADVANCED", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum TarotExperienceLevel {
    BEGINNER(R.string.tarot_experience_level_beginner),
    INTERMEDIATE(R.string.tarot_experience_level_intermediate),
    ADVANCED(R.string.tarot_experience_level_advanced);

    private final int stringId;
    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final nie Companion = new nie();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new mie(0));

    TarotExperienceLevel(int i) {
        this.stringId = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _init_$_anonymous_() {
        TarotExperienceLevel[] tarotExperienceLevelArrValues = values();
        tarotExperienceLevelArrValues.getClass();
        return new wn2("tech.chatmind.api.TarotExperienceLevel", tarotExperienceLevelArrValues);
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }

    public final int getStringId() {
        return this.stringId;
    }
}
