package defpackage;

import kotlin.Metadata;
import tech.chatmind.api.QuestionRequest;
import tech.chatmind.api.ScenarioPatternRequest;
import tech.chatmind.api.ShareSummaryContent;
import tech.chatmind.api.SummaryRequest;
import tech.chatmind.api.dto.ScenarioPattern;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Llfe;", "", "Ltech/chatmind/api/QuestionRequest;", "data", "Lvyb;", "c", "(Ltech/chatmind/api/QuestionRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/ScenarioPatternRequest;", "Ltech/chatmind/api/server/ServerResponse;", "Ltech/chatmind/api/dto/ScenarioPattern;", "a", "(Ltech/chatmind/api/ScenarioPatternRequest;Lxn2;)Ljava/lang/Object;", "Ltech/chatmind/api/SummaryRequest;", "Ltech/chatmind/api/ShareSummaryContent;", "b", "(Ltech/chatmind/api/SummaryRequest;Lxn2;)Ljava/lang/Object;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface lfe {
    @iw9("/api/aigc/scenario-pattern")
    Object a(@w01 ScenarioPatternRequest scenarioPatternRequest, xn2<? super ServerResponse<ScenarioPattern>> xn2Var);

    @iw9("/api/aigc/summarize-json")
    @p3e
    Object b(@w01 SummaryRequest summaryRequest, xn2<? super ShareSummaryContent> xn2Var);

    @iw9("/api/aigc/generate-pattern")
    @p3e
    Object c(@w01 QuestionRequest questionRequest, xn2<? super vyb> xn2Var);
}
