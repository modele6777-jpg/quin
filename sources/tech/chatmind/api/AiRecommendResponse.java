package tech.chatmind.api;

import defpackage.ii;
import defpackage.ji;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = ji.class)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001d"}, d2 = {"Ltech/chatmind/api/AiRecommendResponse;", "", "", "Ltech/chatmind/api/SpreadRecommendationResult;", "spreads", "", "suggestedSpreadIndex", "<init>", "(Ljava/util/List;I)V", "component1", "()Ljava/util/List;", "component2", "()I", "copy", "(Ljava/util/List;I)Ltech/chatmind/api/AiRecommendResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSpreads", "I", "getSuggestedSpreadIndex", "Companion", "ii", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class AiRecommendResponse {
    public static final int $stable = 8;
    public static final ii Companion = new ii();
    private final List<SpreadRecommendationResult> spreads;
    private final int suggestedSpreadIndex;

    public /* synthetic */ AiRecommendResponse(List list, int i, int i2, rp3 rp3Var) {
        this((i2 & 1) != 0 ? pu4.a : list, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiRecommendResponse copy$default(AiRecommendResponse aiRecommendResponse, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = aiRecommendResponse.spreads;
        }
        if ((i2 & 2) != 0) {
            i = aiRecommendResponse.suggestedSpreadIndex;
        }
        return aiRecommendResponse.copy(list, i);
    }

    public final List<SpreadRecommendationResult> component1() {
        return this.spreads;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSuggestedSpreadIndex() {
        return this.suggestedSpreadIndex;
    }

    public final AiRecommendResponse copy(List<SpreadRecommendationResult> spreads, int suggestedSpreadIndex) {
        spreads.getClass();
        return new AiRecommendResponse(spreads, suggestedSpreadIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiRecommendResponse)) {
            return false;
        }
        AiRecommendResponse aiRecommendResponse = (AiRecommendResponse) other;
        return pa7.t(this.spreads, aiRecommendResponse.spreads) && this.suggestedSpreadIndex == aiRecommendResponse.suggestedSpreadIndex;
    }

    public final List<SpreadRecommendationResult> getSpreads() {
        return this.spreads;
    }

    public final int getSuggestedSpreadIndex() {
        return this.suggestedSpreadIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.suggestedSpreadIndex) + (this.spreads.hashCode() * 31);
    }

    public String toString() {
        return "AiRecommendResponse(spreads=" + this.spreads + ", suggestedSpreadIndex=" + this.suggestedSpreadIndex + ")";
    }

    public AiRecommendResponse(List<SpreadRecommendationResult> list, int i) {
        list.getClass();
        this.spreads = list;
        this.suggestedSpreadIndex = i;
    }

    public AiRecommendResponse() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }
}
