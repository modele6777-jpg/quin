package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.AiRecommendInterpretRequest;
import tech.chatmind.api.AiRecommendInterpretResponse;
import tech.chatmind.api.AiRecommendResponse;
import tech.chatmind.api.AudioAssetCompleteResponse;
import tech.chatmind.api.DecisionCheckRequest;
import tech.chatmind.api.DecisionCheckResponse;
import tech.chatmind.api.DrawClarifyingCardRequest;
import tech.chatmind.api.FollowUpRequest;
import tech.chatmind.api.RecommendQuestionsResponse;
import tech.chatmind.api.SpreadInterpretRequest;
import tech.chatmind.api.SpreadInterpretResponse;
import tech.chatmind.api.SpreadRecommendResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0010J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u0010J \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\u0010J$\u0010 \u001a\u00020\u001b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!J$\u0010#\u001a\u00020\u001b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010$¨\u0006%À\u0006\u0003"}, d2 = {"Lwie;", "", "", "chatId", "assetId", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/AudioAssetCompleteResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/DecisionCheckRequest;", "request", "Ltech/chatmind/api/DecisionCheckResponse;", "a", "(Ltech/chatmind/api/DecisionCheckRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/SpreadRecommendResponse;", "c", "(Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/SpreadInterpretRequest;", "Ltech/chatmind/api/SpreadInterpretResponse;", "g", "(Ljava/lang/String;Ltech/chatmind/api/SpreadInterpretRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/AiRecommendResponse;", "e", "Ltech/chatmind/api/AiRecommendInterpretRequest;", "Ltech/chatmind/api/AiRecommendInterpretResponse;", "d", "(Ljava/lang/String;Ltech/chatmind/api/AiRecommendInterpretRequest;Lxn2;)Ljava/lang/Object;", "Lvyb;", "i", "Ltech/chatmind/api/RecommendQuestionsResponse;", "h", "Ltech/chatmind/api/FollowUpRequest;", "j", "(Ljava/lang/String;Ltech/chatmind/api/FollowUpRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/DrawClarifyingCardRequest;", "f", "(Ljava/lang/String;Ltech/chatmind/api/DrawClarifyingCardRequest;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface wie {
    @iw9("/api/tarot/readings/decision-check")
    Object a(@w01 DecisionCheckRequest decisionCheckRequest, xn2<? super ServerResponse<DecisionCheckResponse>> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/assets/{assetId}/complete")
    Object b(@f1a("chatId") String str, @f1a("assetId") String str2, xn2<? super ServerResponse<AudioAssetCompleteResponse>> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/spreads/recommend")
    Object c(@f1a("chatId") String str, xn2<? super ServerResponse<SpreadRecommendResponse>> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/spreads/ai-recommend/interpret")
    Object d(@f1a("chatId") String str, @w01 AiRecommendInterpretRequest aiRecommendInterpretRequest, xn2<? super ServerResponse<AiRecommendInterpretResponse>> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/spreads/ai-recommend/recommend")
    Object e(@f1a("chatId") String str, xn2<? super ServerResponse<AiRecommendResponse>> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/follow-ups")
    @p3e
    Object f(@f1a("chatId") String str, @w01 DrawClarifyingCardRequest drawClarifyingCardRequest, xn2<? super vyb> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/spreads/interpret")
    Object g(@f1a("chatId") String str, @w01 SpreadInterpretRequest spreadInterpretRequest, xn2<? super ServerResponse<SpreadInterpretResponse>> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/recommend-questions")
    Object h(@f1a("chatId") String str, xn2<? super ServerResponse<RecommendQuestionsResponse>> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/interpret")
    @p3e
    Object i(@f1a("chatId") String str, xn2<? super vyb> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/follow-ups")
    @p3e
    Object j(@f1a("chatId") String str, @w01 FollowUpRequest followUpRequest, xn2<? super vyb> xn2Var);
}
