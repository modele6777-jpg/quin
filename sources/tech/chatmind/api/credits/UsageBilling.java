package tech.chatmind.api.credits;

import defpackage.ag2;
import defpackage.cif;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ehf;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xhf;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.yhf;
import defpackage.z18;
import defpackage.z7c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J@\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010 R\u0011\u00103\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b2\u0010\u001b¨\u00067"}, d2 = {"Ltech/chatmind/api/credits/UsageBilling;", "", "", "enabled", "canFollowUp", "", "Ltech/chatmind/api/credits/UsageBillingBalance;", "balances", "Ltech/chatmind/api/credits/UsageBillingDailyLimit;", "dailyLimit", "<init>", "(ZZLjava/util/List;Ltech/chatmind/api/credits/UsageBillingDailyLimit;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZZLjava/util/List;Ltech/chatmind/api/credits/UsageBillingDailyLimit;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/credits/UsageBilling;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "component2", "component3", "()Ljava/util/List;", "component4", "()Ltech/chatmind/api/credits/UsageBillingDailyLimit;", "copy", "(ZZLjava/util/List;Ltech/chatmind/api/credits/UsageBillingDailyLimit;)Ltech/chatmind/api/credits/UsageBilling;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "getCanFollowUp", "Ljava/util/List;", "getBalances", "Ltech/chatmind/api/credits/UsageBillingDailyLimit;", "getDailyLimit", "getHasActiveBalance", "hasActiveBalance", "Companion", "whf", "xhf", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UsageBilling {
    public static final int $stable = 8;
    private final List<UsageBillingBalance> balances;
    private final boolean canFollowUp;
    private final UsageBillingDailyLimit dailyLimit;
    private final boolean enabled;
    public static final xhf Companion = new xhf();
    private static final lw7[] $childSerializers = {null, null, eb3.N(z18.b, new ehf(5)), null};

    public /* synthetic */ UsageBilling(int i, boolean z, boolean z2, List list, UsageBillingDailyLimit usageBillingDailyLimit, xyc xycVar) {
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
            this.dailyLimit = usageBillingDailyLimit;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(yhf.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UsageBilling copy$default(UsageBilling usageBilling, boolean z, boolean z2, List list, UsageBillingDailyLimit usageBillingDailyLimit, int i, Object obj) {
        if ((i & 1) != 0) {
            z = usageBilling.enabled;
        }
        if ((i & 2) != 0) {
            z2 = usageBilling.canFollowUp;
        }
        if ((i & 4) != 0) {
            list = usageBilling.balances;
        }
        if ((i & 8) != 0) {
            usageBillingDailyLimit = usageBilling.dailyLimit;
        }
        return usageBilling.copy(z, z2, list, usageBillingDailyLimit);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(UsageBilling self, ag2 output, nyc serialDesc) {
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
        output.A(serialDesc, 3, cif.a, self.dailyLimit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCanFollowUp() {
        return this.canFollowUp;
    }

    public final List<UsageBillingBalance> component3() {
        return this.balances;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UsageBillingDailyLimit getDailyLimit() {
        return this.dailyLimit;
    }

    public final UsageBilling copy(boolean enabled, boolean canFollowUp, List<UsageBillingBalance> balances, UsageBillingDailyLimit dailyLimit) {
        balances.getClass();
        return new UsageBilling(enabled, canFollowUp, balances, dailyLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsageBilling)) {
            return false;
        }
        UsageBilling usageBilling = (UsageBilling) other;
        return this.enabled == usageBilling.enabled && this.canFollowUp == usageBilling.canFollowUp && pa7.t(this.balances, usageBilling.balances) && pa7.t(this.dailyLimit, usageBilling.dailyLimit);
    }

    public final List<UsageBillingBalance> getBalances() {
        return this.balances;
    }

    public final boolean getCanFollowUp() {
        return this.canFollowUp;
    }

    public final UsageBillingDailyLimit getDailyLimit() {
        return this.dailyLimit;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getHasActiveBalance() {
        List<UsageBillingBalance> list = this.balances;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((UsageBillingBalance) it.next()).isAvailable()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iA = tec.a(ub3.d(Boolean.hashCode(this.enabled) * 31, 31, this.canFollowUp), 31, this.balances);
        UsageBillingDailyLimit usageBillingDailyLimit = this.dailyLimit;
        return iA + (usageBillingDailyLimit == null ? 0 : usageBillingDailyLimit.hashCode());
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.canFollowUp;
        List<UsageBillingBalance> list = this.balances;
        UsageBillingDailyLimit usageBillingDailyLimit = this.dailyLimit;
        StringBuilder sbP = ib8.p("UsageBilling(enabled=", ", canFollowUp=", ", balances=", z, z2);
        sbP.append(list);
        sbP.append(", dailyLimit=");
        sbP.append(usageBillingDailyLimit);
        sbP.append(")");
        return sbP.toString();
    }

    public UsageBilling() {
        this(false, false, (List) null, (UsageBillingDailyLimit) null, 15, (rp3) null);
    }

    public UsageBilling(boolean z, boolean z2, List<UsageBillingBalance> list, UsageBillingDailyLimit usageBillingDailyLimit) {
        list.getClass();
        this.enabled = z;
        this.canFollowUp = z2;
        this.balances = list;
        this.dailyLimit = usageBillingDailyLimit;
    }

    public /* synthetic */ UsageBilling(boolean z, boolean z2, List list, UsageBillingDailyLimit usageBillingDailyLimit, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? pu4.a : list, (i & 8) != 0 ? null : usageBillingDailyLimit);
    }
}
