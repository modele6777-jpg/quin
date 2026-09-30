package tech.chatmind.api.payment;

import defpackage.ag2;
import defpackage.an1;
import defpackage.co2;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.s7e;
import defpackage.t7e;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Ltech/chatmind/api/payment/SubscriptionStatusResponse;", "", "", "hasActiveContract", "Ltech/chatmind/api/payment/ContractInfo;", "contract", "<init>", "(ZLtech/chatmind/api/payment/ContractInfo;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZLtech/chatmind/api/payment/ContractInfo;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/payment/SubscriptionStatusResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "component2", "()Ltech/chatmind/api/payment/ContractInfo;", "copy", "(ZLtech/chatmind/api/payment/ContractInfo;)Ltech/chatmind/api/payment/SubscriptionStatusResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasActiveContract", "Ltech/chatmind/api/payment/ContractInfo;", "getContract", "Companion", "s7e", "t7e", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SubscriptionStatusResponse {
    public static final int $stable = 0;
    public static final t7e Companion = new t7e();
    private final ContractInfo contract;
    private final boolean hasActiveContract;

    public /* synthetic */ SubscriptionStatusResponse(int i, boolean z, ContractInfo contractInfo, xyc xycVar) {
        if (1 != (i & 1)) {
            an1.R(i, 1, s7e.a.e());
            throw null;
        }
        this.hasActiveContract = z;
        if ((i & 2) == 0) {
            this.contract = null;
        } else {
            this.contract = contractInfo;
        }
    }

    public static /* synthetic */ SubscriptionStatusResponse copy$default(SubscriptionStatusResponse subscriptionStatusResponse, boolean z, ContractInfo contractInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            z = subscriptionStatusResponse.hasActiveContract;
        }
        if ((i & 2) != 0) {
            contractInfo = subscriptionStatusResponse.contract;
        }
        return subscriptionStatusResponse.copy(z, contractInfo);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SubscriptionStatusResponse self, ag2 output, nyc serialDesc) {
        output.o(serialDesc, 0, self.hasActiveContract);
        if (!output.g(serialDesc) && self.contract == null) {
            return;
        }
        output.A(serialDesc, 1, co2.a, self.contract);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasActiveContract() {
        return this.hasActiveContract;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ContractInfo getContract() {
        return this.contract;
    }

    public final SubscriptionStatusResponse copy(boolean hasActiveContract, ContractInfo contract) {
        return new SubscriptionStatusResponse(hasActiveContract, contract);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionStatusResponse)) {
            return false;
        }
        SubscriptionStatusResponse subscriptionStatusResponse = (SubscriptionStatusResponse) other;
        return this.hasActiveContract == subscriptionStatusResponse.hasActiveContract && pa7.t(this.contract, subscriptionStatusResponse.contract);
    }

    public final ContractInfo getContract() {
        return this.contract;
    }

    public final boolean getHasActiveContract() {
        return this.hasActiveContract;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasActiveContract) * 31;
        ContractInfo contractInfo = this.contract;
        return iHashCode + (contractInfo == null ? 0 : contractInfo.hashCode());
    }

    public String toString() {
        return "SubscriptionStatusResponse(hasActiveContract=" + this.hasActiveContract + ", contract=" + this.contract + ")";
    }

    public SubscriptionStatusResponse(boolean z, ContractInfo contractInfo) {
        this.hasActiveContract = z;
        this.contract = contractInfo;
    }

    public /* synthetic */ SubscriptionStatusResponse(boolean z, ContractInfo contractInfo, int i, rp3 rp3Var) {
        this(z, (i & 2) != 0 ? null : contractInfo);
    }
}
