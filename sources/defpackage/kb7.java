package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.BasicRequest;
import tech.chatmind.api.GenerateCodeResponse;
import tech.chatmind.api.InvitationInfo;
import tech.chatmind.api.UseCodeRequest;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u0007¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lkb7;", "", "Ltech/chatmind/api/BasicRequest;", "request", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/GenerateCodeResponse;", "c", "(Ltech/chatmind/api/BasicRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/UseCodeRequest;", "Lwef;", "b", "(Ltech/chatmind/api/UseCodeRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/InvitationInfo;", "a", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface kb7 {
    @iw9("/api/invite/info")
    Object a(@w01 BasicRequest basicRequest, xn2<? super ServerResponse<InvitationInfo>> xn2Var);

    @iw9("/api/invite/use-code")
    Object b(@w01 UseCodeRequest useCodeRequest, xn2<? super ServerResponse<wef>> xn2Var);

    @iw9("/api/invite/generate-code")
    Object c(@w01 BasicRequest basicRequest, xn2<? super ServerResponse<GenerateCodeResponse>> xn2Var);
}
