package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.payment.CancelContractRequest;
import tech.chatmind.api.payment.CancelContractResponse;
import tech.chatmind.api.payment.SubscriptionStatusResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lw1g;", "", "Ltech/chatmind/api/payment/CancelContractRequest;", "request", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/payment/CancelContractResponse;", "a", "(Ltech/chatmind/api/payment/CancelContractRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/payment/SubscriptionStatusResponse;", "b", "(Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface w1g {
    @iw9("/api/payment/wechat-pay/subscription/cancel-contract")
    Object a(@w01 CancelContractRequest cancelContractRequest, xn2<? super ServerResponse<CancelContractResponse>> xn2Var);

    @iw9("/api/payment/wechat-pay/subscription/status")
    Object b(xn2<? super ServerResponse<SubscriptionStatusResponse>> xn2Var);
}
