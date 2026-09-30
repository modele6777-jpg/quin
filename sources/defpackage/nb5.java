package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.FeedbackRequest;
import tech.chatmind.api.ReadingFeedbackData;
import tech.chatmind.api.ReadingFeedbackRequest;
import tech.chatmind.api.ReadingFeedbackResponse;
import tech.chatmind.api.ReadingFeedbackTagsResponse;
import tech.chatmind.api.server.NullableServerResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lnb5;", "", "Ltech/chatmind/api/FeedbackRequest;", "reqBody", "Ltech/chatmind/api/server/ServerResponse;", "Lwef;", "a", "(Ltech/chatmind/api/FeedbackRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/ReadingFeedbackRequest;", "Ltech/chatmind/api/ReadingFeedbackResponse;", "d", "(Ltech/chatmind/api/ReadingFeedbackRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/ReadingFeedbackTagsResponse;", "c", "(Lxn2;)Ljava/lang/Object;", "", "chatId", "Ltech/chatmind/api/server/NullableServerResponse;", "Ltech/chatmind/api/ReadingFeedbackData;", "b", "(Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface nb5 {
    @iw9("/api/feedback/post-feedback")
    Object a(@w01 FeedbackRequest feedbackRequest, xn2<? super ServerResponse<wef>> xn2Var);

    @y36("/api/feedback/{chatId}")
    Object b(@f1a("chatId") String str, xn2<? super NullableServerResponse<ReadingFeedbackData>> xn2Var);

    @y36("/api/feedback/tags")
    Object c(xn2<? super ServerResponse<ReadingFeedbackTagsResponse>> xn2Var);

    @iw9("/api/feedback")
    Object d(@w01 ReadingFeedbackRequest readingFeedbackRequest, xn2<? super ServerResponse<ReadingFeedbackResponse>> xn2Var);
}
