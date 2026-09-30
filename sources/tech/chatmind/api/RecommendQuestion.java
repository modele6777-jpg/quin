package tech.chatmind.api;

import defpackage.ag2;
import defpackage.gjb;
import defpackage.ijb;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Ltech/chatmind/api/RecommendQuestion;", "", "Ltech/chatmind/api/RecommendQuestionType;", "type", "", "text", "<init>", "(Ltech/chatmind/api/RecommendQuestionType;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/RecommendQuestionType;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/RecommendQuestion;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/RecommendQuestionType;", "component2", "()Ljava/lang/String;", "copy", "(Ltech/chatmind/api/RecommendQuestionType;Ljava/lang/String;)Ltech/chatmind/api/RecommendQuestion;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/RecommendQuestionType;", "getType", "Ljava/lang/String;", "getText", "Companion", "fjb", "gjb", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class RecommendQuestion {
    public static final int $stable = 0;
    public static final gjb Companion = new gjb();
    private final String text;
    private final RecommendQuestionType type;

    public /* synthetic */ RecommendQuestion(int i, RecommendQuestionType recommendQuestionType, String str, xyc xycVar) {
        this.type = (i & 1) == 0 ? RecommendQuestionType.UNKNOWN : recommendQuestionType;
        if ((i & 2) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
    }

    public static /* synthetic */ RecommendQuestion copy$default(RecommendQuestion recommendQuestion, RecommendQuestionType recommendQuestionType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            recommendQuestionType = recommendQuestion.type;
        }
        if ((i & 2) != 0) {
            str = recommendQuestion.text;
        }
        return recommendQuestion.copy(recommendQuestionType, str);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(RecommendQuestion self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || self.type != RecommendQuestionType.UNKNOWN) {
            output.p(serialDesc, 0, ijb.a, self.type);
        }
        if (!output.g(serialDesc) && pa7.t(self.text, "")) {
            return;
        }
        output.w(serialDesc, 1, self.text);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RecommendQuestionType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final RecommendQuestion copy(RecommendQuestionType type, String text) {
        type.getClass();
        text.getClass();
        return new RecommendQuestion(type, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendQuestion)) {
            return false;
        }
        RecommendQuestion recommendQuestion = (RecommendQuestion) other;
        return this.type == recommendQuestion.type && pa7.t(this.text, recommendQuestion.text);
    }

    public final String getText() {
        return this.text;
    }

    public final RecommendQuestionType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "RecommendQuestion(type=" + this.type + ", text=" + this.text + ")";
    }

    public RecommendQuestion() {
        this((RecommendQuestionType) null, (String) (0 == true ? 1 : 0), 3, (rp3) (0 == true ? 1 : 0));
    }

    public RecommendQuestion(RecommendQuestionType recommendQuestionType, String str) {
        recommendQuestionType.getClass();
        str.getClass();
        this.type = recommendQuestionType;
        this.text = str;
    }

    public /* synthetic */ RecommendQuestion(RecommendQuestionType recommendQuestionType, String str, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? RecommendQuestionType.UNKNOWN : recommendQuestionType, (i & 2) != 0 ? "" : str);
    }
}
