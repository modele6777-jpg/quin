package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.UpdateUserProfileResponse;
import tech.chatmind.api.UserProfileResponse;
import tech.chatmind.api.UserProfileUpdateRequestBody;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H§@¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lvkf;", "", "Ltech/chatmind/api/UserProfileUpdateRequestBody;", "request", "Ltech/chatmind/api/UpdateUserProfileResponse;", "c", "(Ltech/chatmind/api/UserProfileUpdateRequestBody;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/UserProfileResponse;", "b", "(Lxn2;)Ljava/lang/Object;", "", "skinId", "d", "(Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "Lwef;", "a", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface vkf {
    @k23("/api/account/delete")
    Object a(xn2<? super ServerResponse<wef>> xn2Var);

    @y36("/api/user/get-user-profile")
    Object b(xn2<? super ServerResponse<UserProfileResponse>> xn2Var);

    @iw9("/api/user/update-user-profile")
    Object c(@w01 UserProfileUpdateRequestBody userProfileUpdateRequestBody, xn2<? super UpdateUserProfileResponse> xn2Var);

    @iw9("/api/user/update-current-card")
    @pr5
    Object d(@qc5("card") String str, xn2<? super UpdateUserProfileResponse> xn2Var);
}
