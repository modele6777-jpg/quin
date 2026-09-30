package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rec;
import defpackage.rp3;
import defpackage.sec;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.vd8;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Ltech/chatmind/api/ScenarioPatternRequest;", "", "", "patternId", "scenarioId", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/ScenarioPatternRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/ScenarioPatternRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPatternId", "getScenarioId", "getLanguage", "Companion", "rec", "sec", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ScenarioPatternRequest {
    public static final int $stable = 0;
    public static final sec Companion = new sec();
    private final String language;
    private final String patternId;
    private final String scenarioId;

    public /* synthetic */ ScenarioPatternRequest(int i, String str, String str2, String str3, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, rec.a.e());
            throw null;
        }
        this.patternId = str;
        this.scenarioId = str2;
        if ((i & 4) == 0) {
            this.language = vd8.d();
        } else {
            this.language = str3;
        }
    }

    public static /* synthetic */ ScenarioPatternRequest copy$default(ScenarioPatternRequest scenarioPatternRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scenarioPatternRequest.patternId;
        }
        if ((i & 2) != 0) {
            str2 = scenarioPatternRequest.scenarioId;
        }
        if ((i & 4) != 0) {
            str3 = scenarioPatternRequest.language;
        }
        return scenarioPatternRequest.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(ScenarioPatternRequest self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.patternId);
        output.w(serialDesc, 1, self.scenarioId);
        if (!output.g(serialDesc) && pa7.t(self.language, vd8.d())) {
            return;
        }
        output.w(serialDesc, 2, self.language);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPatternId() {
        return this.patternId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScenarioId() {
        return this.scenarioId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final ScenarioPatternRequest copy(String patternId, String scenarioId, String language) {
        patternId.getClass();
        scenarioId.getClass();
        language.getClass();
        return new ScenarioPatternRequest(patternId, scenarioId, language);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScenarioPatternRequest)) {
            return false;
        }
        ScenarioPatternRequest scenarioPatternRequest = (ScenarioPatternRequest) other;
        return pa7.t(this.patternId, scenarioPatternRequest.patternId) && pa7.t(this.scenarioId, scenarioPatternRequest.scenarioId) && pa7.t(this.language, scenarioPatternRequest.language);
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getPatternId() {
        return this.patternId;
    }

    public final String getScenarioId() {
        return this.scenarioId;
    }

    public int hashCode() {
        return this.language.hashCode() + ub3.c(this.patternId.hashCode() * 31, 31, this.scenarioId);
    }

    public String toString() {
        String str = this.patternId;
        String str2 = this.scenarioId;
        return ks0.l(ib8.o("ScenarioPatternRequest(patternId=", str, ", scenarioId=", str2, ", language="), this.language, ")");
    }

    public ScenarioPatternRequest(String str, String str2, String str3) {
        tec.x(str, str2, str3);
        this.patternId = str;
        this.scenarioId = str2;
        this.language = str3;
    }

    public /* synthetic */ ScenarioPatternRequest(String str, String str2, String str3, int i, rp3 rp3Var) {
        this(str, str2, (i & 4) != 0 ? vd8.d() : str3);
    }
}
