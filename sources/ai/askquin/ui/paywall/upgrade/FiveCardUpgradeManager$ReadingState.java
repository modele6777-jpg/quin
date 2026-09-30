package ai.askquin.ui.paywall.upgrade;

import defpackage.ag2;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.gh5;
import defpackage.ib8;
import defpackage.jh5;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.o58;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.LimitedQuota;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u0002;<BO\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JX\u0010(\u001a\u00020\u00142\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b*\u0010!J\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b6\u0010#R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b7\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010'¨\u0006="}, d2 = {"ai/askquin/ui/paywall/upgrade/FiveCardUpgradeManager$ReadingState", "", "", "Ltech/chatmind/api/LimitedQuota;", "before", "", "capturedAt", "", "succeeded", "confirmed", "suppressed", "Lai/askquin/ui/paywall/upgrade/FiveCardUpgradePending;", "pending", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZZLai/askquin/ui/paywall/upgrade/FiveCardUpgradePending;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;ZZZLai/askquin/ui/paywall/upgrade/FiveCardUpgradePending;Lxyc;)V", "Lai/askquin/ui/paywall/upgrade/FiveCardUpgradeManager$ReadingState;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/paywall/upgrade/FiveCardUpgradeManager$ReadingState;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "component6", "()Lai/askquin/ui/paywall/upgrade/FiveCardUpgradePending;", "copy", "(Ljava/util/List;Ljava/lang/String;ZZZLai/askquin/ui/paywall/upgrade/FiveCardUpgradePending;)Lai/askquin/ui/paywall/upgrade/FiveCardUpgradeManager$ReadingState;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBefore", "Ljava/lang/String;", "getCapturedAt", "Z", "getSucceeded", "getConfirmed", "getSuppressed", "Lai/askquin/ui/paywall/upgrade/FiveCardUpgradePending;", "getPending", "Companion", "ai/askquin/ui/paywall/upgrade/e", "gh5", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
final /* data */ class FiveCardUpgradeManager$ReadingState {
    private final List<LimitedQuota> before;
    private final String capturedAt;
    private final boolean confirmed;
    private final FiveCardUpgradePending pending;
    private final boolean succeeded;
    private final boolean suppressed;
    public static final gh5 Companion = new gh5();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new c(2)), null, null, null, null, null};

    public /* synthetic */ FiveCardUpgradeManager$ReadingState(int i, List list, String str, boolean z, boolean z2, boolean z3, FiveCardUpgradePending fiveCardUpgradePending, xyc xycVar) {
        if ((i & 1) == 0) {
            this.before = null;
        } else {
            this.before = list;
        }
        if ((i & 2) == 0) {
            this.capturedAt = null;
        } else {
            this.capturedAt = str;
        }
        if ((i & 4) == 0) {
            this.succeeded = false;
        } else {
            this.succeeded = z;
        }
        if ((i & 8) == 0) {
            this.confirmed = false;
        } else {
            this.confirmed = z2;
        }
        if ((i & 16) == 0) {
            this.suppressed = false;
        } else {
            this.suppressed = z3;
        }
        if ((i & 32) == 0) {
            this.pending = null;
        } else {
            this.pending = fiveCardUpgradePending;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(o58.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiveCardUpgradeManager$ReadingState copy$default(FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState, List list, String str, boolean z, boolean z2, boolean z3, FiveCardUpgradePending fiveCardUpgradePending, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fiveCardUpgradeManager$ReadingState.before;
        }
        if ((i & 2) != 0) {
            str = fiveCardUpgradeManager$ReadingState.capturedAt;
        }
        if ((i & 4) != 0) {
            z = fiveCardUpgradeManager$ReadingState.succeeded;
        }
        if ((i & 8) != 0) {
            z2 = fiveCardUpgradeManager$ReadingState.confirmed;
        }
        if ((i & 16) != 0) {
            z3 = fiveCardUpgradeManager$ReadingState.suppressed;
        }
        if ((i & 32) != 0) {
            fiveCardUpgradePending = fiveCardUpgradeManager$ReadingState.pending;
        }
        boolean z4 = z3;
        FiveCardUpgradePending fiveCardUpgradePending2 = fiveCardUpgradePending;
        return fiveCardUpgradeManager$ReadingState.copy(list, str, z, z2, z4, fiveCardUpgradePending2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(FiveCardUpgradeManager$ReadingState self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.before != null) {
            output.A(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.before);
        }
        if (output.g(serialDesc) || self.capturedAt != null) {
            output.A(serialDesc, 1, p4e.a, self.capturedAt);
        }
        if (output.g(serialDesc) || self.succeeded) {
            output.o(serialDesc, 2, self.succeeded);
        }
        if (output.g(serialDesc) || self.confirmed) {
            output.o(serialDesc, 3, self.confirmed);
        }
        if (output.g(serialDesc) || self.suppressed) {
            output.o(serialDesc, 4, self.suppressed);
        }
        if (!output.g(serialDesc) && self.pending == null) {
            return;
        }
        output.A(serialDesc, 5, jh5.a, self.pending);
    }

    public final List<LimitedQuota> component1() {
        return this.before;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCapturedAt() {
        return this.capturedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSucceeded() {
        return this.succeeded;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSuppressed() {
        return this.suppressed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FiveCardUpgradePending getPending() {
        return this.pending;
    }

    public final FiveCardUpgradeManager$ReadingState copy(List<LimitedQuota> before, String capturedAt, boolean succeeded, boolean confirmed, boolean suppressed, FiveCardUpgradePending pending) {
        return new FiveCardUpgradeManager$ReadingState(before, capturedAt, succeeded, confirmed, suppressed, pending);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiveCardUpgradeManager$ReadingState)) {
            return false;
        }
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState = (FiveCardUpgradeManager$ReadingState) other;
        return pa7.t(this.before, fiveCardUpgradeManager$ReadingState.before) && pa7.t(this.capturedAt, fiveCardUpgradeManager$ReadingState.capturedAt) && this.succeeded == fiveCardUpgradeManager$ReadingState.succeeded && this.confirmed == fiveCardUpgradeManager$ReadingState.confirmed && this.suppressed == fiveCardUpgradeManager$ReadingState.suppressed && pa7.t(this.pending, fiveCardUpgradeManager$ReadingState.pending);
    }

    public final List<LimitedQuota> getBefore() {
        return this.before;
    }

    public final String getCapturedAt() {
        return this.capturedAt;
    }

    public final boolean getConfirmed() {
        return this.confirmed;
    }

    public final FiveCardUpgradePending getPending() {
        return this.pending;
    }

    public final boolean getSucceeded() {
        return this.succeeded;
    }

    public final boolean getSuppressed() {
        return this.suppressed;
    }

    public int hashCode() {
        List<LimitedQuota> list = this.before;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.capturedAt;
        int iD = ub3.d(ub3.d(ub3.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.succeeded), 31, this.confirmed), 31, this.suppressed);
        FiveCardUpgradePending fiveCardUpgradePending = this.pending;
        return iD + (fiveCardUpgradePending != null ? fiveCardUpgradePending.hashCode() : 0);
    }

    public String toString() {
        List<LimitedQuota> list = this.before;
        String str = this.capturedAt;
        boolean z = this.succeeded;
        boolean z2 = this.confirmed;
        boolean z3 = this.suppressed;
        FiveCardUpgradePending fiveCardUpgradePending = this.pending;
        StringBuilder sb = new StringBuilder("ReadingState(before=");
        sb.append(list);
        sb.append(", capturedAt=");
        sb.append(str);
        sb.append(", succeeded=");
        ib8.w(sb, z, ", confirmed=", z2, ", suppressed=");
        sb.append(z3);
        sb.append(", pending=");
        sb.append(fiveCardUpgradePending);
        sb.append(")");
        return sb.toString();
    }

    public FiveCardUpgradeManager$ReadingState() {
        this((List) null, (String) null, false, false, false, (FiveCardUpgradePending) null, 63, (rp3) null);
    }

    public FiveCardUpgradeManager$ReadingState(List<LimitedQuota> list, String str, boolean z, boolean z2, boolean z3, FiveCardUpgradePending fiveCardUpgradePending) {
        this.before = list;
        this.capturedAt = str;
        this.succeeded = z;
        this.confirmed = z2;
        this.suppressed = z3;
        this.pending = fiveCardUpgradePending;
    }

    public /* synthetic */ FiveCardUpgradeManager$ReadingState(List list, String str, boolean z, boolean z2, boolean z3, FiveCardUpgradePending fiveCardUpgradePending, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : fiveCardUpgradePending);
    }
}
