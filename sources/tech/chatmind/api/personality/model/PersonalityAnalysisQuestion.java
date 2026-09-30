package tech.chatmind.api.personality.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.kaa;
import defpackage.laa;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.smf;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Ltech/chatmind/api/personality/model/PersonalityAnalysisQuestion;", "", "", "question", "Ltech/chatmind/api/personality/model/UserDecision;", "userDecision", "<init>", "(Ljava/lang/String;Ltech/chatmind/api/personality/model/UserDecision;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ltech/chatmind/api/personality/model/UserDecision;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/personality/model/PersonalityAnalysisQuestion;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ltech/chatmind/api/personality/model/UserDecision;", "copy", "(Ljava/lang/String;Ltech/chatmind/api/personality/model/UserDecision;)Ltech/chatmind/api/personality/model/PersonalityAnalysisQuestion;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuestion", "Ltech/chatmind/api/personality/model/UserDecision;", "getUserDecision", "Companion", "kaa", "laa", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PersonalityAnalysisQuestion {
    public static final int $stable = 0;
    public static final laa Companion = new laa();
    private final String question;
    private final UserDecision userDecision;

    public /* synthetic */ PersonalityAnalysisQuestion(int i, String str, UserDecision userDecision, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, kaa.a.e());
            throw null;
        }
        this.question = str;
        this.userDecision = userDecision;
    }

    public static /* synthetic */ PersonalityAnalysisQuestion copy$default(PersonalityAnalysisQuestion personalityAnalysisQuestion, String str, UserDecision userDecision, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalityAnalysisQuestion.question;
        }
        if ((i & 2) != 0) {
            userDecision = personalityAnalysisQuestion.userDecision;
        }
        return personalityAnalysisQuestion.copy(str, userDecision);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(PersonalityAnalysisQuestion self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.question);
        output.A(serialDesc, 1, smf.a, self.userDecision);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserDecision getUserDecision() {
        return this.userDecision;
    }

    public final PersonalityAnalysisQuestion copy(String question, UserDecision userDecision) {
        question.getClass();
        return new PersonalityAnalysisQuestion(question, userDecision);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalityAnalysisQuestion)) {
            return false;
        }
        PersonalityAnalysisQuestion personalityAnalysisQuestion = (PersonalityAnalysisQuestion) other;
        return pa7.t(this.question, personalityAnalysisQuestion.question) && pa7.t(this.userDecision, personalityAnalysisQuestion.userDecision);
    }

    public final String getQuestion() {
        return this.question;
    }

    public final UserDecision getUserDecision() {
        return this.userDecision;
    }

    public int hashCode() {
        int iHashCode = this.question.hashCode() * 31;
        UserDecision userDecision = this.userDecision;
        return iHashCode + (userDecision == null ? 0 : userDecision.hashCode());
    }

    public String toString() {
        return "PersonalityAnalysisQuestion(question=" + this.question + ", userDecision=" + this.userDecision + ")";
    }

    public PersonalityAnalysisQuestion(String str, UserDecision userDecision) {
        str.getClass();
        this.question = str;
        this.userDecision = userDecision;
    }
}
