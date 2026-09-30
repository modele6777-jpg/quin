package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.seasonal.model.SeasonalFollowUpRequest;
import tech.chatmind.api.seasonal.model.SeasonalHistoryResponse;
import tech.chatmind.api.seasonal.model.SeasonalReadingRequest;
import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H§@¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lpic;", "", "Ltech/chatmind/api/seasonal/model/SeasonalReadingRequest;", "body", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/seasonal/model/SeasonalReadingResponse;", "a", "(Ltech/chatmind/api/seasonal/model/SeasonalReadingRequest;Lxn2;)Ljava/lang/Object;", "", "year", "", "solarTerm", "d", "(ILjava/lang/String;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/seasonal/model/SeasonalHistoryResponse;", "b", "(Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/seasonal/model/SeasonalFollowUpRequest;", "c", "(ILjava/lang/String;Ltech/chatmind/api/seasonal/model/SeasonalFollowUpRequest;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface pic {
    @iw9("api/tarot/seasonal/readings")
    Object a(@w01 SeasonalReadingRequest seasonalReadingRequest, xn2<? super ServerResponse<SeasonalReadingResponse>> xn2Var);

    @y36("api/tarot/seasonal/readings")
    Object b(xn2<? super ServerResponse<SeasonalHistoryResponse>> xn2Var);

    @iw9("api/tarot/seasonal/readings/{year}/{solarTerm}/follow-ups")
    Object c(@f1a("year") int i, @f1a("solarTerm") String str, @w01 SeasonalFollowUpRequest seasonalFollowUpRequest, xn2<? super ServerResponse<SeasonalReadingResponse>> xn2Var);

    @y36("api/tarot/seasonal/readings")
    Object d(@a4b("year") int i, @a4b("solarTerm") String str, xn2<? super ServerResponse<SeasonalReadingResponse>> xn2Var);
}
