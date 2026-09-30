package tech.chatmind.api.server;

import defpackage.ak9;
import defpackage.ib8;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.z7c;
import defpackage.zj9;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = ak9.class)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\b\u0087\b\u0018\u0000 )*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001*BE\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JT\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0017¨\u0006+"}, d2 = {"Ltech/chatmind/api/server/NullableServerResponse;", "T", "", "", "login", "success", "error", "", "errorCode", "", "errorMessage", "data", "<init>", "(ZZZILjava/lang/String;Ljava/lang/Object;)V", "component1", "()Z", "component2", "component3", "component4", "()I", "component5", "()Ljava/lang/String;", "component6", "()Ljava/lang/Object;", "copy", "(ZZZILjava/lang/String;Ljava/lang/Object;)Ltech/chatmind/api/server/NullableServerResponse;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getLogin", "getSuccess", "getError", "I", "getErrorCode", "Ljava/lang/String;", "getErrorMessage", "Ljava/lang/Object;", "getData", "Companion", "zj9", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class NullableServerResponse<T> {
    public static final int $stable = 0;
    public static final zj9 Companion = new zj9();
    private final T data;
    private final boolean error;
    private final int errorCode;
    private final String errorMessage;
    private final boolean login;
    private final boolean success;

    public /* synthetic */ NullableServerResponse(boolean z, boolean z2, boolean z3, int i, String str, Object obj, int i2, rp3 rp3Var) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? null : obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NullableServerResponse copy$default(NullableServerResponse nullableServerResponse, boolean z, boolean z2, boolean z3, int i, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            z = nullableServerResponse.login;
        }
        if ((i2 & 2) != 0) {
            z2 = nullableServerResponse.success;
        }
        if ((i2 & 4) != 0) {
            z3 = nullableServerResponse.error;
        }
        if ((i2 & 8) != 0) {
            i = nullableServerResponse.errorCode;
        }
        if ((i2 & 16) != 0) {
            str = nullableServerResponse.errorMessage;
        }
        if ((i2 & 32) != 0) {
            obj = nullableServerResponse.data;
        }
        String str2 = str;
        Object obj3 = obj;
        return nullableServerResponse.copy(z, z2, z3, i, str2, obj3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getLogin() {
        return this.login;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final T component6() {
        return this.data;
    }

    public final NullableServerResponse<T> copy(boolean login, boolean success, boolean error, int errorCode, String errorMessage, T data) {
        errorMessage.getClass();
        return new NullableServerResponse<>(login, success, error, errorCode, errorMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NullableServerResponse)) {
            return false;
        }
        NullableServerResponse nullableServerResponse = (NullableServerResponse) other;
        return this.login == nullableServerResponse.login && this.success == nullableServerResponse.success && this.error == nullableServerResponse.error && this.errorCode == nullableServerResponse.errorCode && pa7.t(this.errorMessage, nullableServerResponse.errorMessage) && pa7.t(this.data, nullableServerResponse.data);
    }

    public final T getData() {
        return this.data;
    }

    public final boolean getError() {
        return this.error;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getLogin() {
        return this.login;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iC = ub3.c(ub3.b(this.errorCode, ub3.d(ub3.d(Boolean.hashCode(this.login) * 31, 31, this.success), 31, this.error), 31), 31, this.errorMessage);
        T t = this.data;
        return iC + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        boolean z = this.login;
        boolean z2 = this.success;
        boolean z3 = this.error;
        int i = this.errorCode;
        String str = this.errorMessage;
        T t = this.data;
        StringBuilder sbP = ib8.p("NullableServerResponse(login=", ", success=", ", error=", z, z2);
        sbP.append(z3);
        sbP.append(", errorCode=");
        sbP.append(i);
        sbP.append(", errorMessage=");
        sbP.append(str);
        sbP.append(", data=");
        sbP.append(t);
        sbP.append(")");
        return sbP.toString();
    }

    public NullableServerResponse(boolean z, boolean z2, boolean z3, int i, String str, T t) {
        str.getClass();
        this.login = z;
        this.success = z2;
        this.error = z3;
        this.errorCode = i;
        this.errorMessage = str;
        this.data = t;
    }

    public NullableServerResponse() {
        this(false, false, false, 0, null, null, 63, null);
    }
}
