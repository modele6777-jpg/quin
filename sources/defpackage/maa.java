package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.personality.ReportServerData;
import tech.chatmind.api.personality.UnfinishedHistory;
import tech.chatmind.api.personality.model.CreateExaminationResponse;
import tech.chatmind.api.personality.model.PersonalityAnalysisHistoryResponse;
import tech.chatmind.api.personality.model.QuestionResponse;
import tech.chatmind.api.personality.model.QuestionStatusResponse;
import tech.chatmind.api.personality.model.RatingRequestBody;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H§@¢\u0006\u0004\b\f\u0010\nJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H§@¢\u0006\u0004\b\u000e\u0010\nJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0007J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lmaa;", "", "", "testId", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/personality/ReportServerData;", "f", "(Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/personality/UnfinishedHistory;", "e", "(Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/personality/model/PersonalityAnalysisHistoryResponse;", "d", "Ltech/chatmind/api/personality/model/CreateExaminationResponse;", "b", "Ltech/chatmind/api/personality/model/QuestionResponse;", "a", "Ltech/chatmind/api/personality/model/RatingRequestBody;", "rateBody", "Ltech/chatmind/api/personality/model/QuestionStatusResponse;", "c", "(Ltech/chatmind/api/personality/model/RatingRequestBody;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface maa {
    @iw9("/api/test-report/question-list")
    @pr5
    Object a(@qc5("testId") String str, xn2<? super ServerResponse<QuestionResponse>> xn2Var);

    @iw9("/api/test-report/create-test")
    Object b(xn2<? super ServerResponse<CreateExaminationResponse>> xn2Var);

    @iw9("/api/test-report/question-select")
    Object c(@w01 RatingRequestBody ratingRequestBody, xn2<? super ServerResponse<QuestionStatusResponse>> xn2Var);

    @y36("/api/test-report/history")
    Object d(xn2<? super ServerResponse<PersonalityAnalysisHistoryResponse>> xn2Var);

    @y36("/api/test-report/get-unfinished-test")
    Object e(xn2<? super ServerResponse<UnfinishedHistory>> xn2Var);

    @iw9("/api/test-report/result")
    @pr5
    Object f(@qc5("testId") String str, xn2<? super ServerResponse<ReportServerData>> xn2Var);
}
