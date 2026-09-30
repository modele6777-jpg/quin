package tech.chatmind.api.payment;

import defpackage.ag2;
import defpackage.an1;
import defpackage.co2;
import defpackage.do2;
import defpackage.eo2;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import java.util.Locale;
import kotlin.Metadata;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010!J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u001d¨\u00067"}, d2 = {"Ltech/chatmind/api/payment/ContractInfo;", "", "", "contractId", "planKey", "status", "", "amount", "createdAt", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/payment/ContractInfo;Lag2;Lnyc;)V", "write$Self", "Leo2;", "getContractStatus", "()Leo2;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/payment/ContractInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContractId", "getPlanKey", "getStatus", "I", "getAmount", "getCreatedAt", "getUpdatedAt", "Companion", "co2", "do2", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ContractInfo {
    public static final int $stable = 0;
    public static final do2 Companion = new do2();
    private final int amount;
    private final String contractId;
    private final String createdAt;
    private final String planKey;
    private final String status;
    private final String updatedAt;

    public /* synthetic */ ContractInfo(int i, String str, String str2, String str3, int i2, String str4, String str5, xyc xycVar) {
        if (63 != (i & 63)) {
            an1.R(i, 63, co2.a.e());
            throw null;
        }
        this.contractId = str;
        this.planKey = str2;
        this.status = str3;
        this.amount = i2;
        this.createdAt = str4;
        this.updatedAt = str5;
    }

    public static /* synthetic */ ContractInfo copy$default(ContractInfo contractInfo, String str, String str2, String str3, int i, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = contractInfo.contractId;
        }
        if ((i2 & 2) != 0) {
            str2 = contractInfo.planKey;
        }
        if ((i2 & 4) != 0) {
            str3 = contractInfo.status;
        }
        if ((i2 & 8) != 0) {
            i = contractInfo.amount;
        }
        if ((i2 & 16) != 0) {
            str4 = contractInfo.createdAt;
        }
        if ((i2 & 32) != 0) {
            str5 = contractInfo.updatedAt;
        }
        String str6 = str4;
        String str7 = str5;
        return contractInfo.copy(str, str2, str3, i, str6, str7);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(ContractInfo self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.contractId);
        output.w(serialDesc, 1, self.planKey);
        output.w(serialDesc, 2, self.status);
        output.v(3, self.amount, serialDesc);
        output.w(serialDesc, 4, self.createdAt);
        output.w(serialDesc, 5, self.updatedAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContractId() {
        return this.contractId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlanKey() {
        return this.planKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final ContractInfo copy(String contractId, String planKey, String status, int amount, String createdAt, String updatedAt) {
        contractId.getClass();
        planKey.getClass();
        status.getClass();
        createdAt.getClass();
        updatedAt.getClass();
        return new ContractInfo(contractId, planKey, status, amount, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractInfo)) {
            return false;
        }
        ContractInfo contractInfo = (ContractInfo) other;
        return pa7.t(this.contractId, contractInfo.contractId) && pa7.t(this.planKey, contractInfo.planKey) && pa7.t(this.status, contractInfo.status) && this.amount == contractInfo.amount && pa7.t(this.createdAt, contractInfo.createdAt) && pa7.t(this.updatedAt, contractInfo.updatedAt);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getContractId() {
        return this.contractId;
    }

    public final eo2 getContractStatus() {
        String lowerCase = this.status.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.equals(UsageBillingBalance.STATUS_ACTIVE)) {
            return eo2.a;
        }
        return lowerCase.equals("terminated") ? eo2.b : eo2.c;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getPlanKey() {
        return this.planKey;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return this.updatedAt.hashCode() + ub3.c(ub3.b(this.amount, ub3.c(ub3.c(this.contractId.hashCode() * 31, 31, this.planKey), 31, this.status), 31), 31, this.createdAt);
    }

    public String toString() {
        String str = this.contractId;
        String str2 = this.planKey;
        String str3 = this.status;
        int i = this.amount;
        String str4 = this.createdAt;
        String str5 = this.updatedAt;
        StringBuilder sbO = ib8.o("ContractInfo(contractId=", str, ", planKey=", str2, ", status=");
        sbO.append(str3);
        sbO.append(", amount=");
        sbO.append(i);
        sbO.append(", createdAt=");
        return ks0.m(sbO, str4, ", updatedAt=", str5, ")");
    }

    public ContractInfo(String str, String str2, String str3, int i, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.contractId = str;
        this.planKey = str2;
        this.status = str3;
        this.amount = i;
        this.createdAt = str4;
        this.updatedAt = str5;
    }
}
