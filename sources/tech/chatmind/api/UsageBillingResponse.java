package tech.chatmind.api;

import defpackage.ag2;
import defpackage.aif;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ehf;
import defpackage.eif;
import defpackage.hif;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J@\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010 ¨\u00065"}, d2 = {"Ltech/chatmind/api/UsageBillingResponse;", "", "", "enabled", "canFollowUp", "", "Ltech/chatmind/api/UsageBillingBalanceResponse;", "balances", "Ltech/chatmind/api/UsageBillingDailyLimitResponse;", "dailyLimit", "<init>", "(ZZLjava/util/List;Ltech/chatmind/api/UsageBillingDailyLimitResponse;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZZLjava/util/List;Ltech/chatmind/api/UsageBillingDailyLimitResponse;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/UsageBillingResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "component2", "component3", "()Ljava/util/List;", "component4", "()Ltech/chatmind/api/UsageBillingDailyLimitResponse;", "copy", "(ZZLjava/util/List;Ltech/chatmind/api/UsageBillingDailyLimitResponse;)Ltech/chatmind/api/UsageBillingResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "getCanFollowUp", "Ljava/util/List;", "getBalances", "Ltech/chatmind/api/UsageBillingDailyLimitResponse;", "getDailyLimit", "Companion", "gif", "hif", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UsageBillingResponse {
    public static final int $stable = 8;
    private final List<UsageBillingBalanceResponse> balances;
    private final boolean canFollowUp;
    private final UsageBillingDailyLimitResponse dailyLimit;
    private final boolean enabled;
    public static final hif Companion = new hif();
    private static final lw7[] $childSerializers = {null, null, eb3.N(z18.b, new ehf(6)), null};

    public /* synthetic */ UsageBillingResponse(int i, boolean z, boolean z2, List list, UsageBillingDailyLimitResponse usageBillingDailyLimitResponse, xyc xycVar) {
        if ((i & 1) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z;
        }
        if ((i & 2) == 0) {
            this.canFollowUp = false;
        } else {
            this.canFollowUp = z2;
        }
        if ((i & 4) == 0) {
            this.balances = pu4.a;
        } else {
            this.balances = list;
        }
        if ((i & 8) == 0) {
            this.dailyLimit = null;
        } else {
            this.dailyLimit = usageBillingDailyLimitResponse;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(aif.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UsageBillingResponse copy$default(UsageBillingResponse usageBillingResponse, boolean z, boolean z2, List list, UsageBillingDailyLimitResponse usageBillingDailyLimitResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            z = usageBillingResponse.enabled;
        }
        if ((i & 2) != 0) {
            z2 = usageBillingResponse.canFollowUp;
        }
        if ((i & 4) != 0) {
            list = usageBillingResponse.balances;
        }
        if ((i & 8) != 0) {
            usageBillingDailyLimitResponse = usageBillingResponse.dailyLimit;
        }
        return usageBillingResponse.copy(z, z2, list, usageBillingDailyLimitResponse);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(UsageBillingResponse self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.enabled) {
            output.o(serialDesc, 0, self.enabled);
        }
        if (output.g(serialDesc) || self.canFollowUp) {
            output.o(serialDesc, 1, self.canFollowUp);
        }
        if (output.g(serialDesc) || !pa7.t(self.balances, pu4.a)) {
            output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.balances);
        }
        if (!output.g(serialDesc) && self.dailyLimit == null) {
            return;
        }
        output.A(serialDesc, 3, eif.a, self.dailyLimit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCanFollowUp() {
        return this.canFollowUp;
    }

    public final List<UsageBillingBalanceResponse> component3() {
        return this.balances;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UsageBillingDailyLimitResponse getDailyLimit() {
        return this.dailyLimit;
    }

    public final UsageBillingResponse copy(boolean enabled, boolean canFollowUp, List<UsageBillingBalanceResponse> balances, UsageBillingDailyLimitResponse dailyLimit) {
        balances.getClass();
        return new UsageBillingResponse(enabled, canFollowUp, balances, dailyLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsageBillingResponse)) {
            return false;
        }
        UsageBillingResponse usageBillingResponse = (UsageBillingResponse) other;
        return this.enabled == usageBillingResponse.enabled && this.canFollowUp == usageBillingResponse.canFollowUp && pa7.t(this.balances, usageBillingResponse.balances) && pa7.t(this.dailyLimit, usageBillingResponse.dailyLimit);
    }

    public final List<UsageBillingBalanceResponse> getBalances() {
        return this.balances;
    }

    public final boolean getCanFollowUp() {
        return this.canFollowUp;
    }

    public final UsageBillingDailyLimitResponse getDailyLimit() {
        return this.dailyLimit;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        int iA = tec.a(ub3.d(Boolean.hashCode(this.enabled) * 31, 31, this.canFollowUp), 31, this.balances);
        UsageBillingDailyLimitResponse usageBillingDailyLimitResponse = this.dailyLimit;
        return iA + (usageBillingDailyLimitResponse == null ? 0 : usageBillingDailyLimitResponse.hashCode());
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.canFollowUp;
        List<UsageBillingBalanceResponse> list = this.balances;
        UsageBillingDailyLimitResponse usageBillingDailyLimitResponse = this.dailyLimit;
        StringBuilder sbP = ib8.p("UsageBillingResponse(enabled=", ", canFollowUp=", ", balances=", z, z2);
        sbP.append(list);
        sbP.append(", dailyLimit=");
        sbP.append(usageBillingDailyLimitResponse);
        sbP.append(")");
        return sbP.toString();
    }

    public UsageBillingResponse() {
        this(false, false, (List) null, (UsageBillingDailyLimitResponse) null, 15, (rp3) null);
    }

    public UsageBillingResponse(boolean z, boolean z2, List<UsageBillingBalanceResponse> list, UsageBillingDailyLimitResponse usageBillingDailyLimitResponse) {
        list.getClass();
        this.enabled = z;
        this.canFollowUp = z2;
        this.balances = list;
        this.dailyLimit = usageBillingDailyLimitResponse;
    }

    public /* synthetic */ UsageBillingResponse(boolean z, boolean z2, List list, UsageBillingDailyLimitResponse usageBillingDailyLimitResponse, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? pu4.a : list, (i & 8) != 0 ? null : usageBillingDailyLimitResponse);
    }
}
