package tech.chatmind.api.personality.model;

import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.faa;
import defpackage.haa;
import defpackage.iaa;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.pa7;
import defpackage.syc;
import defpackage.tyc;
import defpackage.vy9;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Ltech/chatmind/api/personality/model/PersonalityAnalysisHistoryResponse;", "", "", "Ltech/chatmind/api/personality/model/PersonalityAnalysis;", "analysis", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/personality/model/PersonalityAnalysisHistoryResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Ltech/chatmind/api/personality/model/PersonalityAnalysisHistoryResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAnalysis", "getAnalysis$annotations", "()V", "Companion", "haa", "iaa", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PersonalityAnalysisHistoryResponse {
    public static final int $stable = 8;
    private final List<PersonalityAnalysis> analysis;
    public static final iaa Companion = new iaa();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new vy9(27))};

    public /* synthetic */ PersonalityAnalysisHistoryResponse(int i, List list, xyc xycVar) {
        if (1 == (i & 1)) {
            this.analysis = list;
        } else {
            an1.R(i, 1, haa.a.e());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(faa.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersonalityAnalysisHistoryResponse copy$default(PersonalityAnalysisHistoryResponse personalityAnalysisHistoryResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = personalityAnalysisHistoryResponse.analysis;
        }
        return personalityAnalysisHistoryResponse.copy(list);
    }

    public final List<PersonalityAnalysis> component1() {
        return this.analysis;
    }

    public final PersonalityAnalysisHistoryResponse copy(List<PersonalityAnalysis> analysis) {
        analysis.getClass();
        return new PersonalityAnalysisHistoryResponse(analysis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PersonalityAnalysisHistoryResponse) && pa7.t(this.analysis, ((PersonalityAnalysisHistoryResponse) other).analysis);
    }

    public final List<PersonalityAnalysis> getAnalysis() {
        return this.analysis;
    }

    public int hashCode() {
        return this.analysis.hashCode();
    }

    public String toString() {
        return ib8.k("PersonalityAnalysisHistoryResponse(analysis=", ")", this.analysis);
    }

    @syc("history")
    public static /* synthetic */ void getAnalysis$annotations() {
    }

    public PersonalityAnalysisHistoryResponse(List<PersonalityAnalysis> list) {
        list.getClass();
        this.analysis = list;
    }
}
