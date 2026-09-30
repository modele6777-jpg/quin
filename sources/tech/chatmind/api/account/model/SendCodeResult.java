package tech.chatmind.api.account.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.c77;
import defpackage.ib8;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.txc;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.uxc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ<\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b\u0003\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b\u0004\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u001e¨\u0006/"}, d2 = {"Ltech/chatmind/api/account/model/SendCodeResult;", "", "", "isNewUser", "isError", "", "errorCode", "", "errorMessage", "<init>", "(ZZLjava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZZLjava/lang/Integer;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/account/model/SendCodeResult;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/String;", "copy", "(ZZLjava/lang/Integer;Ljava/lang/String;)Ltech/chatmind/api/account/model/SendCodeResult;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/Integer;", "getErrorCode", "Ljava/lang/String;", "getErrorMessage", "Companion", "txc", "uxc", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SendCodeResult {
    public static final int $stable = 0;
    public static final uxc Companion = new uxc();
    private final Integer errorCode;
    private final String errorMessage;
    private final boolean isError;
    private final boolean isNewUser;

    public /* synthetic */ SendCodeResult(int i, boolean z, boolean z2, Integer num, String str, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, txc.a.e());
            throw null;
        }
        this.isNewUser = z;
        this.isError = z2;
        if ((i & 4) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num;
        }
        if ((i & 8) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str;
        }
    }

    public static /* synthetic */ SendCodeResult copy$default(SendCodeResult sendCodeResult, boolean z, boolean z2, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sendCodeResult.isNewUser;
        }
        if ((i & 2) != 0) {
            z2 = sendCodeResult.isError;
        }
        if ((i & 4) != 0) {
            num = sendCodeResult.errorCode;
        }
        if ((i & 8) != 0) {
            str = sendCodeResult.errorMessage;
        }
        return sendCodeResult.copy(z, z2, num, str);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SendCodeResult self, ag2 output, nyc serialDesc) {
        output.o(serialDesc, 0, self.isNewUser);
        output.o(serialDesc, 1, self.isError);
        if (output.g(serialDesc) || self.errorCode != null) {
            output.A(serialDesc, 2, c77.a, self.errorCode);
        }
        if (!output.g(serialDesc) && self.errorMessage == null) {
            return;
        }
        output.A(serialDesc, 3, p4e.a, self.errorMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsNewUser() {
        return this.isNewUser;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final SendCodeResult copy(boolean isNewUser, boolean isError, Integer errorCode, String errorMessage) {
        return new SendCodeResult(isNewUser, isError, errorCode, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendCodeResult)) {
            return false;
        }
        SendCodeResult sendCodeResult = (SendCodeResult) other;
        return this.isNewUser == sendCodeResult.isNewUser && this.isError == sendCodeResult.isError && pa7.t(this.errorCode, sendCodeResult.errorCode) && pa7.t(this.errorMessage, sendCodeResult.errorMessage);
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int iD = ub3.d(Boolean.hashCode(this.isNewUser) * 31, 31, this.isError);
        Integer num = this.errorCode;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorMessage;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean isError() {
        return this.isError;
    }

    public final boolean isNewUser() {
        return this.isNewUser;
    }

    public String toString() {
        boolean z = this.isNewUser;
        boolean z2 = this.isError;
        Integer num = this.errorCode;
        String str = this.errorMessage;
        StringBuilder sbP = ib8.p("SendCodeResult(isNewUser=", ", isError=", ", errorCode=", z, z2);
        sbP.append(num);
        sbP.append(", errorMessage=");
        sbP.append(str);
        sbP.append(")");
        return sbP.toString();
    }

    public SendCodeResult(boolean z, boolean z2, Integer num, String str) {
        this.isNewUser = z;
        this.isError = z2;
        this.errorCode = num;
        this.errorMessage = str;
    }

    public /* synthetic */ SendCodeResult(boolean z, boolean z2, Integer num, String str, int i, rp3 rp3Var) {
        this(z, z2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }
}
