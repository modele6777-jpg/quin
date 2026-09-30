package tech.chatmind.api.message.model;

import defpackage.ag2;
import defpackage.ib8;
import defpackage.iz6;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Ltech/chatmind/api/message/model/InAppMessageMetadata;", "", "", "planKey", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/message/model/InAppMessageMetadata;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Ltech/chatmind/api/message/model/InAppMessageMetadata;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlanKey", "Companion", "hz6", "iz6", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class InAppMessageMetadata {
    public static final int $stable = 0;
    public static final iz6 Companion = new iz6();
    private final String planKey;

    public /* synthetic */ InAppMessageMetadata(int i, String str, xyc xycVar) {
        if ((i & 1) == 0) {
            this.planKey = "";
        } else {
            this.planKey = str;
        }
    }

    public static /* synthetic */ InAppMessageMetadata copy$default(InAppMessageMetadata inAppMessageMetadata, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppMessageMetadata.planKey;
        }
        return inAppMessageMetadata.copy(str);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(InAppMessageMetadata self, ag2 output, nyc serialDesc) {
        if (!output.g(serialDesc) && pa7.t(self.planKey, "")) {
            return;
        }
        output.w(serialDesc, 0, self.planKey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlanKey() {
        return this.planKey;
    }

    public final InAppMessageMetadata copy(String planKey) {
        planKey.getClass();
        return new InAppMessageMetadata(planKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InAppMessageMetadata) && pa7.t(this.planKey, ((InAppMessageMetadata) other).planKey);
    }

    public final String getPlanKey() {
        return this.planKey;
    }

    public int hashCode() {
        return this.planKey.hashCode();
    }

    public String toString() {
        return ib8.j("InAppMessageMetadata(planKey=", this.planKey, ")");
    }

    public InAppMessageMetadata() {
        this((String) null, 1, (rp3) (0 == true ? 1 : 0));
    }

    public InAppMessageMetadata(String str) {
        str.getClass();
        this.planKey = str;
    }

    public /* synthetic */ InAppMessageMetadata(String str, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? "" : str);
    }
}
