package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.ReadingShareRequest;
import tech.chatmind.api.ReadingShareResponse;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ltgb;", "", "", "chatId", "Ltech/chatmind/api/ReadingShareRequest;", "request", "Ltech/chatmind/api/server/NullableServerResponse;", "Ltech/chatmind/api/ReadingShareResponse;", "a", "(Ljava/lang/String;Ltech/chatmind/api/ReadingShareRequest;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface tgb {
    @iw9("/api/share/tarot-readings/{chatId}")
    Object a(@f1a("chatId") String str, @w01 ReadingShareRequest readingShareRequest, xn2<? super NullableServerResponse<ReadingShareResponse>> xn2Var);
}
