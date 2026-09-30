package ai.askquin.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.f73;
import defpackage.g73;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.os2;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\t\u0010\nB_\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJT\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b/\u0010\u001d¨\u00063"}, d2 = {"Lai/askquin/model/DailyFortuneDirectionContent;", "", "", "affirmation", "reading", "", "questions", "dos", "donts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_model", "(Lai/askquin/model/DailyFortuneDirectionContent;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lai/askquin/model/DailyFortuneDirectionContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAffirmation", "getReading", "Ljava/util/List;", "getQuestions", "getDos", "getDonts", "Companion", "f73", "g73", "Quin.core:model"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class DailyFortuneDirectionContent {
    private static final lw7[] $childSerializers;
    public static final g73 Companion = new g73();
    private final String affirmation;
    private final List<String> donts;
    private final List<String> dos;
    private final List<String> questions;
    private final String reading;

    static {
        os2 os2Var = new os2(14);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, eb3.N(z18Var, os2Var), eb3.N(z18Var, new os2(15)), eb3.N(z18Var, new os2(16))};
    }

    public /* synthetic */ DailyFortuneDirectionContent(int i, String str, String str2, List list, List list2, List list3, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, f73.a.e());
            throw null;
        }
        this.affirmation = str;
        this.reading = str2;
        this.questions = list;
        int i2 = i & 8;
        pu4 pu4Var = pu4.a;
        if (i2 == 0) {
            this.dos = pu4Var;
        } else {
            this.dos = list2;
        }
        if ((i & 16) == 0) {
            this.donts = pu4Var;
        } else {
            this.donts = list3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DailyFortuneDirectionContent copy$default(DailyFortuneDirectionContent dailyFortuneDirectionContent, String str, String str2, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dailyFortuneDirectionContent.affirmation;
        }
        if ((i & 2) != 0) {
            str2 = dailyFortuneDirectionContent.reading;
        }
        if ((i & 4) != 0) {
            list = dailyFortuneDirectionContent.questions;
        }
        if ((i & 8) != 0) {
            list2 = dailyFortuneDirectionContent.dos;
        }
        if ((i & 16) != 0) {
            list3 = dailyFortuneDirectionContent.donts;
        }
        List list4 = list3;
        List list5 = list;
        return dailyFortuneDirectionContent.copy(str, str2, list5, list2, list4);
    }

    public static final /* synthetic */ void write$Self$Quin_core_model(DailyFortuneDirectionContent self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.affirmation);
        output.w(serialDesc, 1, self.reading);
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.questions);
        boolean zG = output.g(serialDesc);
        pu4 pu4Var = pu4.a;
        if (zG || !pa7.t(self.dos, pu4Var)) {
            output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.dos);
        }
        if (!output.g(serialDesc) && pa7.t(self.donts, pu4Var)) {
            return;
        }
        output.p(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.donts);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAffirmation() {
        return this.affirmation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReading() {
        return this.reading;
    }

    public final List<String> component3() {
        return this.questions;
    }

    public final List<String> component4() {
        return this.dos;
    }

    public final List<String> component5() {
        return this.donts;
    }

    public final DailyFortuneDirectionContent copy(String affirmation, String reading, List<String> questions, List<String> dos, List<String> donts) {
        affirmation.getClass();
        reading.getClass();
        questions.getClass();
        dos.getClass();
        donts.getClass();
        return new DailyFortuneDirectionContent(affirmation, reading, questions, dos, donts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyFortuneDirectionContent)) {
            return false;
        }
        DailyFortuneDirectionContent dailyFortuneDirectionContent = (DailyFortuneDirectionContent) other;
        return pa7.t(this.affirmation, dailyFortuneDirectionContent.affirmation) && pa7.t(this.reading, dailyFortuneDirectionContent.reading) && pa7.t(this.questions, dailyFortuneDirectionContent.questions) && pa7.t(this.dos, dailyFortuneDirectionContent.dos) && pa7.t(this.donts, dailyFortuneDirectionContent.donts);
    }

    public final String getAffirmation() {
        return this.affirmation;
    }

    public final List<String> getDonts() {
        return this.donts;
    }

    public final List<String> getDos() {
        return this.dos;
    }

    public final List<String> getQuestions() {
        return this.questions;
    }

    public final String getReading() {
        return this.reading;
    }

    public int hashCode() {
        return this.donts.hashCode() + tec.a(tec.a(ub3.c(this.affirmation.hashCode() * 31, 31, this.reading), 31, this.questions), 31, this.dos);
    }

    public String toString() {
        String str = this.affirmation;
        String str2 = this.reading;
        List<String> list = this.questions;
        List<String> list2 = this.dos;
        List<String> list3 = this.donts;
        StringBuilder sbO = ib8.o("DailyFortuneDirectionContent(affirmation=", str, ", reading=", str2, ", questions=");
        sbO.append(list);
        sbO.append(", dos=");
        sbO.append(list2);
        sbO.append(", donts=");
        return ks0.n(sbO, list3, ")");
    }

    public DailyFortuneDirectionContent(String str, String str2, List<String> list, List<String> list2, List<String> list3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.affirmation = str;
        this.reading = str2;
        this.questions = list;
        this.dos = list2;
        this.donts = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DailyFortuneDirectionContent(String str, String str2, List list, List list2, List list3, int i, rp3 rp3Var) {
        int i2 = i & 8;
        pu4 pu4Var = pu4.a;
        this(str, str2, list, i2 != 0 ? pu4Var : list2, (i & 16) != 0 ? pu4Var : list3);
    }
}
