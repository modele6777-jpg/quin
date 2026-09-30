package tech.chatmind.api;

import defpackage.an1;
import defpackage.ib8;
import defpackage.jwd;
import defpackage.kwd;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Ltech/chatmind/api/SpreadInterpretRequest;", "", "", "spreadId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/SpreadInterpretRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Ltech/chatmind/api/SpreadInterpretRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSpreadId", "Companion", "jwd", "kwd", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SpreadInterpretRequest {
    public static final int $stable = 0;
    public static final kwd Companion = new kwd();
    private final String spreadId;

    public /* synthetic */ SpreadInterpretRequest(int i, String str, xyc xycVar) {
        if (1 == (i & 1)) {
            this.spreadId = str;
        } else {
            an1.R(i, 1, jwd.a.e());
            throw null;
        }
    }

    public static /* synthetic */ SpreadInterpretRequest copy$default(SpreadInterpretRequest spreadInterpretRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spreadInterpretRequest.spreadId;
        }
        return spreadInterpretRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSpreadId() {
        return this.spreadId;
    }

    public final SpreadInterpretRequest copy(String spreadId) {
        spreadId.getClass();
        return new SpreadInterpretRequest(spreadId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SpreadInterpretRequest) && pa7.t(this.spreadId, ((SpreadInterpretRequest) other).spreadId);
    }

    public final String getSpreadId() {
        return this.spreadId;
    }

    public int hashCode() {
        return this.spreadId.hashCode();
    }

    public String toString() {
        return ib8.j("SpreadInterpretRequest(spreadId=", this.spreadId, ")");
    }

    public SpreadInterpretRequest(String str) {
        str.getClass();
        this.spreadId = str;
    }
}
