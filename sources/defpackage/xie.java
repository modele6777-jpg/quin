package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.AdditionalInfoRequest;
import tech.chatmind.api.AssetUploadUrlRequest;
import tech.chatmind.api.AssetUploadUrlResponse;
import tech.chatmind.api.ClaimReadingsRequest;
import tech.chatmind.api.ClaimReadingsResponse;
import tech.chatmind.api.DeleteReadingResponse;
import tech.chatmind.api.LegacyImportRequest;
import tech.chatmind.api.LegacyImportResponse;
import tech.chatmind.api.PauseReadingAudioResponse;
import tech.chatmind.api.ReadingListResponse;
import tech.chatmind.api.ReadingRequest;
import tech.chatmind.api.ReadingResponse;
import tech.chatmind.api.SkipClarifyingCardRequest;
import tech.chatmind.api.SubmitSpreadRequest;
import tech.chatmind.api.TarotReadingHistory;
import tech.chatmind.api.TarotReadingMessagesResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u001e\u0010\u0014J.\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b#\u0010$J \u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b&\u0010\u0014J*\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020'H§@¢\u0006\u0004\b(\u0010)J*\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020*H§@¢\u0006\u0004\b+\u0010,J8\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b.\u0010/¨\u00060À\u0006\u0003"}, d2 = {"Lxie;", "", "Ltech/chatmind/api/ReadingRequest;", "request", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/ReadingResponse;", "f", "(Ltech/chatmind/api/ReadingRequest;Lxn2;)Ljava/lang/Object;", "", "chatId", "Ltech/chatmind/api/AdditionalInfoRequest;", "Lwef;", "b", "(Ljava/lang/String;Ltech/chatmind/api/AdditionalInfoRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/AssetUploadUrlRequest;", "Ltech/chatmind/api/AssetUploadUrlResponse;", "d", "(Ljava/lang/String;Ltech/chatmind/api/AssetUploadUrlRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/PauseReadingAudioResponse;", "l", "(Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/LegacyImportRequest;", "Ltech/chatmind/api/LegacyImportResponse;", "k", "(Ltech/chatmind/api/LegacyImportRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/ClaimReadingsRequest;", "Ltech/chatmind/api/ClaimReadingsResponse;", "c", "(Ltech/chatmind/api/ClaimReadingsRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/DeleteReadingResponse;", "i", "", "limit", "continuationToken", "Ltech/chatmind/api/ReadingListResponse;", "h", "(Ljava/lang/Integer;Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/TarotReadingHistory;", "e", "Ltech/chatmind/api/SubmitSpreadRequest;", "a", "(Ljava/lang/String;Ltech/chatmind/api/SubmitSpreadRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/SkipClarifyingCardRequest;", "g", "(Ljava/lang/String;Ltech/chatmind/api/SkipClarifyingCardRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/TarotReadingMessagesResponse;", "j", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface xie {
    @iw9("/api/tarot/readings/{chatId}/spread")
    Object a(@f1a("chatId") String str, @w01 SubmitSpreadRequest submitSpreadRequest, xn2<? super ServerResponse<wef>> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/additional-info")
    Object b(@f1a("chatId") String str, @w01 AdditionalInfoRequest additionalInfoRequest, xn2<? super ServerResponse<wef>> xn2Var);

    @jw9("/api/tarot/readings/claim")
    Object c(@w01 ClaimReadingsRequest claimReadingsRequest, xn2<? super ServerResponse<ClaimReadingsResponse>> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/assets")
    Object d(@f1a("chatId") String str, @w01 AssetUploadUrlRequest assetUploadUrlRequest, xn2<? super ServerResponse<AssetUploadUrlResponse>> xn2Var);

    @y36("/api/tarot/readings/{chatId}")
    Object e(@f1a("chatId") String str, xn2<? super ServerResponse<TarotReadingHistory>> xn2Var);

    @iw9("/api/tarot/readings")
    Object f(@w01 ReadingRequest readingRequest, xn2<? super ServerResponse<ReadingResponse>> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/clarifying-cards/skip")
    Object g(@f1a("chatId") String str, @w01 SkipClarifyingCardRequest skipClarifyingCardRequest, xn2<? super ServerResponse<wef>> xn2Var);

    @y36("/api/tarot/readings")
    Object h(@a4b("limit") Integer num, @a4b("continuationToken") String str, xn2<? super ServerResponse<ReadingListResponse>> xn2Var);

    @k23("/api/tarot/readings/{chatId}")
    Object i(@f1a("chatId") String str, xn2<? super ServerResponse<DeleteReadingResponse>> xn2Var);

    @y36("/api/tarot/readings/{chatId}/messages")
    Object j(@f1a("chatId") String str, @a4b("limit") Integer num, @a4b("continuationToken") String str2, xn2<? super ServerResponse<TarotReadingMessagesResponse>> xn2Var);

    @iw9("/api/tarot/readings/legacy-import")
    Object k(@w01 LegacyImportRequest legacyImportRequest, xn2<? super ServerResponse<LegacyImportResponse>> xn2Var);

    @iw9("/api/tarot/readings/{chatId}/audio/pause")
    Object l(@f1a("chatId") String str, xn2<? super ServerResponse<PauseReadingAudioResponse>> xn2Var);
}
