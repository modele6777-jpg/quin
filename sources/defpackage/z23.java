package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.dailycard.model.DailyCardRequestBody;
import tech.chatmind.api.dailycard.model.DailyCardResponse;
import tech.chatmind.api.dailycard.model.ListDailyCardBody;
import tech.chatmind.api.dailycard.model.ListDailyCardResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lz23;", "", "Ltech/chatmind/api/dailycard/model/DailyCardRequestBody;", "dailyCardRequestBody", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/dailycard/model/DailyCardResponse;", "a", "(Ltech/chatmind/api/dailycard/model/DailyCardRequestBody;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/dailycard/model/ListDailyCardBody;", "body", "Ltech/chatmind/api/dailycard/model/ListDailyCardResponse;", "b", "(Ltech/chatmind/api/dailycard/model/ListDailyCardBody;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface z23 {
    @iw9("api/tarot/daily-card")
    Object a(@w01 DailyCardRequestBody dailyCardRequestBody, xn2<? super ServerResponse<DailyCardResponse>> xn2Var);

    @iw9("api/tarot/list-daily-card")
    Object b(@w01 ListDailyCardBody listDailyCardBody, xn2<? super ServerResponse<ListDailyCardResponse>> xn2Var);
}
