package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tech.chatmind.api.events.model.EventInfo2;
import tech.chatmind.api.events.model.EventRequest;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0007J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0003\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0003\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH§@¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, d2 = {"Laz4;", "", "Ltech/chatmind/api/events/model/EventRequest;", "request", "Ltech/chatmind/api/server/NullableServerResponse;", "Lnh7;", "a", "(Ltech/chatmind/api/events/model/EventRequest;Lxn2;)Ljava/lang/Object;", "", "Ltech/chatmind/api/events/model/EventInfo2;", "c", "", "", "d", "(Ljava/util/Map;Lxn2;)Ljava/lang/Object;", "b", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface az4 {
    @iw9("/api/activity/list")
    Object a(@w01 EventRequest eventRequest, xn2<? super NullableServerResponse<nh7>> xn2Var);

    @iw9("/api/activity/explore-banner")
    Object b(@w01 Map<String, String> map, xn2<? super NullableServerResponse<nh7>> xn2Var);

    @iw9("/api/activity/popup")
    Object c(@w01 EventRequest eventRequest, xn2<? super NullableServerResponse<List<EventInfo2>>> xn2Var);

    @iw9("/api/user/popup")
    Object d(@w01 Map<String, String> map, xn2<? super NullableServerResponse<nh7>> xn2Var);
}
