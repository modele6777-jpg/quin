package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.AllRecommendationsResponse;
import tech.chatmind.api.QueryQuestionRequest;
import tech.chatmind.api.QueryQuestionResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Ln4b;", "", "Ltech/chatmind/api/QueryQuestionRequest;", "request", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/QueryQuestionResponse;", "a", "(Ltech/chatmind/api/QueryQuestionRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/AllRecommendationsResponse;", "b", "(Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface n4b {
    @iw9("/api/question/recommend-questions")
    Object a(@w01 QueryQuestionRequest queryQuestionRequest, xn2<? super ServerResponse<QueryQuestionResponse>> xn2Var);

    @y36("/api/question/recommendations")
    Object b(xn2<? super ServerResponse<AllRecommendationsResponse>> xn2Var);
}
