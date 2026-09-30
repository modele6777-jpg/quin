package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.QuotaUsageRequest;
import tech.chatmind.api.QuotaUsageResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lvab;", "", "Ltech/chatmind/api/QuotaUsageRequest;", "data", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/QuotaUsageResponse;", "a", "(Ltech/chatmind/api/QuotaUsageRequest;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface vab {
    @iw9("/api/aigc/quota-usage")
    Object a(@w01 QuotaUsageRequest quotaUsageRequest, xn2<? super ServerResponse<QuotaUsageResponse>> xn2Var);
}
