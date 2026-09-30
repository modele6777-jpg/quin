package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.message.model.InAppMessageList;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lpt8;", "", "", "timeAt", "locale", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/message/model/InAppMessageList;", "a", "(Ljava/lang/String;Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface pt8 {
    @iw9("api/message/pull")
    @pr5
    Object a(@qc5("timeAt") String str, @qc5("locale") String str2, xn2<? super ServerResponse<InAppMessageList>> xn2Var);
}
