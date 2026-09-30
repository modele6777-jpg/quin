package tech.chatmind.api.personality.model;

import defpackage.an1;
import defpackage.smf;
import defpackage.tec;
import defpackage.tmf;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006$"}, d2 = {"Ltech/chatmind/api/personality/model/UserDecision;", "", "", "rate", "<init>", "(I)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/personality/model/UserDecision;Lag2;Lnyc;)V", "write$Self", "component1", "()I", "copy", "(I)Ltech/chatmind/api/personality/model/UserDecision;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRate", "Companion", "smf", "tmf", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UserDecision {
    public static final int $stable = 0;
    public static final tmf Companion = new tmf();
    private final int rate;

    public /* synthetic */ UserDecision(int i, int i2, xyc xycVar) {
        if (1 == (i & 1)) {
            this.rate = i2;
        } else {
            an1.R(i, 1, smf.a.e());
            throw null;
        }
    }

    public static /* synthetic */ UserDecision copy$default(UserDecision userDecision, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userDecision.rate;
        }
        return userDecision.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRate() {
        return this.rate;
    }

    public final UserDecision copy(int rate) {
        return new UserDecision(rate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserDecision) && this.rate == ((UserDecision) other).rate;
    }

    public final int getRate() {
        return this.rate;
    }

    public int hashCode() {
        return Integer.hashCode(this.rate);
    }

    public String toString() {
        return tec.f(this.rate, "UserDecision(rate=", ")");
    }

    public UserDecision(int i) {
        this.rate = i;
    }
}
