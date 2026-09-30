package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.nyc;
import defpackage.ogf;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pgf;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0019¨\u0006)"}, d2 = {"Ltech/chatmind/api/UpdateUserProfileResponse;", "", "", "success", "", "errorMessage", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZLjava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/UpdateUserProfileResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Ltech/chatmind/api/UpdateUserProfileResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "Ljava/lang/String;", "getErrorMessage", "Companion", "ogf", "pgf", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UpdateUserProfileResponse {
    public static final int $stable = 0;
    public static final pgf Companion = new pgf();
    private final String errorMessage;
    private final boolean success;

    public /* synthetic */ UpdateUserProfileResponse(int i, boolean z, String str, xyc xycVar) {
        if (1 != (i & 1)) {
            an1.R(i, 1, ogf.a.e());
            throw null;
        }
        this.success = z;
        if ((i & 2) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str;
        }
    }

    public static /* synthetic */ UpdateUserProfileResponse copy$default(UpdateUserProfileResponse updateUserProfileResponse, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updateUserProfileResponse.success;
        }
        if ((i & 2) != 0) {
            str = updateUserProfileResponse.errorMessage;
        }
        return updateUserProfileResponse.copy(z, str);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(UpdateUserProfileResponse self, ag2 output, nyc serialDesc) {
        output.o(serialDesc, 0, self.success);
        if (!output.g(serialDesc) && self.errorMessage == null) {
            return;
        }
        output.A(serialDesc, 1, p4e.a, self.errorMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final UpdateUserProfileResponse copy(boolean success, String errorMessage) {
        return new UpdateUserProfileResponse(success, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateUserProfileResponse)) {
            return false;
        }
        UpdateUserProfileResponse updateUserProfileResponse = (UpdateUserProfileResponse) other;
        return this.success == updateUserProfileResponse.success && pa7.t(this.errorMessage, updateUserProfileResponse.errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.errorMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "UpdateUserProfileResponse(success=" + this.success + ", errorMessage=" + this.errorMessage + ")";
    }

    public UpdateUserProfileResponse(boolean z, String str) {
        this.success = z;
        this.errorMessage = str;
    }

    public /* synthetic */ UpdateUserProfileResponse(boolean z, String str, int i, rp3 rp3Var) {
        this(z, (i & 2) != 0 ? null : str);
    }
}
