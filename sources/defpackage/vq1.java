package defpackage;

import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.generatecard.model.CardDetectionRequest;
import tech.chatmind.api.generatecard.model.CardDetectionResponse;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lvq1;", "", "Ltech/chatmind/api/generatecard/model/CardDetectionRequest;", "request", "Ltech/chatmind/api/server/NullableServerResponse;", "", "Ltech/chatmind/api/generatecard/model/CardDetectionResponse;", "a", "(Ltech/chatmind/api/generatecard/model/CardDetectionRequest;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface vq1 {
    @iw9("/api/aigc/card-detection")
    Object a(@w01 CardDetectionRequest cardDetectionRequest, xn2<? super NullableServerResponse<List<CardDetectionResponse>>> xn2Var);
}
