package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.giftcard.GiftCardDraftRequest;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lr76;", "", "Ltech/chatmind/api/giftcard/GiftCardDraftRequest;", "request", "Ltech/chatmind/api/server/NullableServerResponse;", "Lnh7;", "c", "(Ltech/chatmind/api/giftcard/GiftCardDraftRequest;Lxn2;)Ljava/lang/Object;", "", "tab", "b", "(Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "cardId", "orderRef", "a", "(Ljava/lang/String;Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface r76 {
    @y36("/api/gift-card/detail")
    Object a(@a4b("cardId") String str, @a4b("orderRef") String str2, xn2<? super NullableServerResponse<nh7>> xn2Var);

    @y36("/api/gift-card/list")
    Object b(@a4b("tab") String str, xn2<? super NullableServerResponse<nh7>> xn2Var);

    @iw9("/api/gift-card/draft")
    Object c(@w01 GiftCardDraftRequest giftCardDraftRequest, xn2<? super NullableServerResponse<nh7>> xn2Var);
}
