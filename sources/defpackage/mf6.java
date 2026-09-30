package defpackage;

import java.util.Map;
import kotlin.Metadata;
import tech.chatmind.api.guestpass.GuestPassInfoResponse;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lmf6;", "", "", "", "request", "Ltech/chatmind/api/server/NullableServerResponse;", "Ltech/chatmind/api/guestpass/GuestPassInfoResponse;", "a", "(Ljava/util/Map;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface mf6 {
    @iw9("/api/guest-pass/info")
    Object a(@w01 Map<String, String> map, xn2<? super NullableServerResponse<GuestPassInfoResponse>> xn2Var);
}
