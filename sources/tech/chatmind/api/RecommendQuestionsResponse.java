package tech.chatmind.api;

import defpackage.ib8;
import defpackage.jjb;
import defpackage.kjb;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = kjb.class)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0019"}, d2 = {"Ltech/chatmind/api/RecommendQuestionsResponse;", "", "", "Ltech/chatmind/api/RecommendQuestion;", "questions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Ltech/chatmind/api/RecommendQuestionsResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getQuestions", "Companion", "jjb", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class RecommendQuestionsResponse {
    public static final int $stable = 8;
    public static final jjb Companion = new jjb();
    private final List<RecommendQuestion> questions;

    public /* synthetic */ RecommendQuestionsResponse(List list, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? pu4.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendQuestionsResponse copy$default(RecommendQuestionsResponse recommendQuestionsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendQuestionsResponse.questions;
        }
        return recommendQuestionsResponse.copy(list);
    }

    public final List<RecommendQuestion> component1() {
        return this.questions;
    }

    public final RecommendQuestionsResponse copy(List<RecommendQuestion> questions) {
        questions.getClass();
        return new RecommendQuestionsResponse(questions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecommendQuestionsResponse) && pa7.t(this.questions, ((RecommendQuestionsResponse) other).questions);
    }

    public final List<RecommendQuestion> getQuestions() {
        return this.questions;
    }

    public int hashCode() {
        return this.questions.hashCode();
    }

    public String toString() {
        return ib8.k("RecommendQuestionsResponse(questions=", ")", this.questions);
    }

    public RecommendQuestionsResponse(List<RecommendQuestion> list) {
        list.getClass();
        this.questions = list;
    }

    public RecommendQuestionsResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
