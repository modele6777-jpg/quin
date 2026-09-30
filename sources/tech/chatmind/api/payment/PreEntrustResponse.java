package tech.chatmind.api.payment;

import defpackage.ag2;
import defpackage.an1;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.woa;
import defpackage.xoa;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Ltech/chatmind/api/payment/PreEntrustResponse;", "", "", "contractCode", "preEntrustwebId", "miniprogramUsername", "miniprogramPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/payment/PreEntrustResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/payment/PreEntrustResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContractCode", "getPreEntrustwebId", "getMiniprogramUsername", "getMiniprogramPath", "Companion", "woa", "xoa", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PreEntrustResponse {
    public static final int $stable = 0;
    public static final xoa Companion = new xoa();
    private final String contractCode;
    private final String miniprogramPath;
    private final String miniprogramUsername;
    private final String preEntrustwebId;

    public /* synthetic */ PreEntrustResponse(int i, String str, String str2, String str3, String str4, xyc xycVar) {
        if (15 != (i & 15)) {
            an1.R(i, 15, woa.a.e());
            throw null;
        }
        this.contractCode = str;
        this.preEntrustwebId = str2;
        this.miniprogramUsername = str3;
        this.miniprogramPath = str4;
    }

    public static /* synthetic */ PreEntrustResponse copy$default(PreEntrustResponse preEntrustResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preEntrustResponse.contractCode;
        }
        if ((i & 2) != 0) {
            str2 = preEntrustResponse.preEntrustwebId;
        }
        if ((i & 4) != 0) {
            str3 = preEntrustResponse.miniprogramUsername;
        }
        if ((i & 8) != 0) {
            str4 = preEntrustResponse.miniprogramPath;
        }
        return preEntrustResponse.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(PreEntrustResponse self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.contractCode);
        output.w(serialDesc, 1, self.preEntrustwebId);
        output.w(serialDesc, 2, self.miniprogramUsername);
        output.w(serialDesc, 3, self.miniprogramPath);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContractCode() {
        return this.contractCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPreEntrustwebId() {
        return this.preEntrustwebId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMiniprogramUsername() {
        return this.miniprogramUsername;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMiniprogramPath() {
        return this.miniprogramPath;
    }

    public final PreEntrustResponse copy(String contractCode, String preEntrustwebId, String miniprogramUsername, String miniprogramPath) {
        contractCode.getClass();
        preEntrustwebId.getClass();
        miniprogramUsername.getClass();
        miniprogramPath.getClass();
        return new PreEntrustResponse(contractCode, preEntrustwebId, miniprogramUsername, miniprogramPath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreEntrustResponse)) {
            return false;
        }
        PreEntrustResponse preEntrustResponse = (PreEntrustResponse) other;
        return pa7.t(this.contractCode, preEntrustResponse.contractCode) && pa7.t(this.preEntrustwebId, preEntrustResponse.preEntrustwebId) && pa7.t(this.miniprogramUsername, preEntrustResponse.miniprogramUsername) && pa7.t(this.miniprogramPath, preEntrustResponse.miniprogramPath);
    }

    public final String getContractCode() {
        return this.contractCode;
    }

    public final String getMiniprogramPath() {
        return this.miniprogramPath;
    }

    public final String getMiniprogramUsername() {
        return this.miniprogramUsername;
    }

    public final String getPreEntrustwebId() {
        return this.preEntrustwebId;
    }

    public int hashCode() {
        return this.miniprogramPath.hashCode() + ub3.c(ub3.c(this.contractCode.hashCode() * 31, 31, this.preEntrustwebId), 31, this.miniprogramUsername);
    }

    public String toString() {
        String str = this.contractCode;
        String str2 = this.preEntrustwebId;
        return ks0.m(ib8.o("PreEntrustResponse(contractCode=", str, ", preEntrustwebId=", str2, ", miniprogramUsername="), this.miniprogramUsername, ", miniprogramPath=", this.miniprogramPath, ")");
    }

    public PreEntrustResponse(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.contractCode = str;
        this.preEntrustwebId = str2;
        this.miniprogramUsername = str3;
        this.miniprogramPath = str4;
    }
}
