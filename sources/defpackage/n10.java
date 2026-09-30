package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.annual.model.AnnualLuckResponse;
import tech.chatmind.api.annual.model.DomainReportRequestBody;
import tech.chatmind.api.annual.model.MonthlyReportRequestBody;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Ln10;", "", "", "year", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/annual/model/AnnualLuckResponse;", "a", "(Ljava/lang/String;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/annual/model/MonthlyReportRequestBody;", "body", "", "testMode", "Lwef;", "c", "(Ljava/lang/String;Ltech/chatmind/api/annual/model/MonthlyReportRequestBody;ZLxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/annual/model/DomainReportRequestBody;", "b", "(Ljava/lang/String;Ltech/chatmind/api/annual/model/DomainReportRequestBody;ZLxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface n10 {
    @ri6({"X-Test-UID: 99666EFC-D64F-479C-A2F8-92BE32E1DFEb9", "X-Test-Mode: true"})
    @y36("api/reports/annual-forecast/{year}")
    Object a(@f1a("year") String str, xn2<? super ServerResponse<AnnualLuckResponse>> xn2Var);

    @iw9("api/reports/annual-forecast/{year}")
    @ri6({"X-Test-UID: 99666EFC-D64F-479C-A2F8-92BE32E1DFEb9"})
    Object b(@f1a("year") String str, @w01 DomainReportRequestBody domainReportRequestBody, @ni6("X-Test-Mode") boolean z, xn2<? super ServerResponse<wef>> xn2Var);

    @iw9("api/reports/annual-forecast/{year}")
    @ri6({"X-Test-UID: 99666EFC-D64F-479C-A2F8-92BE32E1DFEb9"})
    Object c(@f1a("year") String str, @w01 MonthlyReportRequestBody monthlyReportRequestBody, @ni6("X-Test-Mode") boolean z, xn2<? super ServerResponse<wef>> xn2Var);
}
