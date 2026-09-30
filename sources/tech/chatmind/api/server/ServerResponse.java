package tech.chatmind.api.server;

import defpackage.ag2;
import defpackage.an1;
import defpackage.gia;
import defpackage.ib8;
import defpackage.mzc;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 8*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00029:BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011JG\u0010\u001c\u001a\u00020\u0019\"\n\b\u0001\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b%\u0010&JR\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b*\u0010\"J\u001a\u0010,\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b1\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010$R\u0017\u0010\u000b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010&¨\u0006;"}, d2 = {"Ltech/chatmind/api/server/ServerResponse;", "T", "", "", "login", "success", "error", "", "errorCode", "", "errorMessage", "data", "<init>", "(ZZZILjava/lang/String;Ljava/lang/Object;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZZZILjava/lang/String;Ljava/lang/Object;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lxn7;", "typeSerial0", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/server/ServerResponse;Lag2;Lnyc;Lxn7;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "()I", "component5", "()Ljava/lang/String;", "component6", "()Ljava/lang/Object;", "copy", "(ZZZILjava/lang/String;Ljava/lang/Object;)Ltech/chatmind/api/server/ServerResponse;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getLogin", "getSuccess", "getError", "I", "getErrorCode", "Ljava/lang/String;", "getErrorMessage", "Ljava/lang/Object;", "getData", "Companion", "lzc", "mzc", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ServerResponse<T> {
    private static final nyc $cachedDescriptor;
    public static final int $stable = 0;
    public static final mzc Companion = new mzc();
    private final T data;
    private final boolean error;
    private final int errorCode;
    private final String errorMessage;
    private final boolean login;
    private final boolean success;

    static {
        gia giaVar = new gia("tech.chatmind.api.server.ServerResponse", null, 6);
        giaVar.k("login", true);
        giaVar.k("success", true);
        giaVar.k("error", true);
        giaVar.k("errorCode", true);
        giaVar.k("errorMessage", true);
        giaVar.k("data", false);
        $cachedDescriptor = giaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ServerResponse(int i, boolean z, boolean z2, boolean z3, int i2, String str, Object obj, xyc xycVar) {
        if (32 != (i & 32)) {
            an1.R(i, 32, $cachedDescriptor);
            throw null;
        }
        if ((i & 1) == 0) {
            this.login = false;
        } else {
            this.login = z;
        }
        if ((i & 2) == 0) {
            this.success = false;
        } else {
            this.success = z2;
        }
        if ((i & 4) == 0) {
            this.error = false;
        } else {
            this.error = z3;
        }
        if ((i & 8) == 0) {
            this.errorCode = 0;
        } else {
            this.errorCode = i2;
        }
        if ((i & 16) == 0) {
            this.errorMessage = "";
        } else {
            this.errorMessage = str;
        }
        this.data = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServerResponse copy$default(ServerResponse serverResponse, boolean z, boolean z2, boolean z3, int i, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            z = serverResponse.login;
        }
        if ((i2 & 2) != 0) {
            z2 = serverResponse.success;
        }
        if ((i2 & 4) != 0) {
            z3 = serverResponse.error;
        }
        if ((i2 & 8) != 0) {
            i = serverResponse.errorCode;
        }
        if ((i2 & 16) != 0) {
            str = serverResponse.errorMessage;
        }
        if ((i2 & 32) != 0) {
            obj = serverResponse.data;
        }
        String str2 = str;
        Object obj3 = obj;
        return serverResponse.copy(z, z2, z3, i, str2, obj3);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(ServerResponse self, ag2 output, nyc serialDesc, xn7 typeSerial0) {
        if (output.g(serialDesc) || self.login) {
            output.o(serialDesc, 0, self.login);
        }
        if (output.g(serialDesc) || self.success) {
            output.o(serialDesc, 1, self.success);
        }
        if (output.g(serialDesc) || self.error) {
            output.o(serialDesc, 2, self.error);
        }
        if (output.g(serialDesc) || self.errorCode != 0) {
            output.v(3, self.errorCode, serialDesc);
        }
        if (output.g(serialDesc) || !pa7.t(self.errorMessage, "")) {
            output.w(serialDesc, 4, self.errorMessage);
        }
        output.p(serialDesc, 5, typeSerial0, self.data);
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

    public final ServerResponse<T> copy(boolean login, boolean success, boolean error, int errorCode, String errorMessage, T data) {
        errorMessage.getClass();
        return new ServerResponse<>(login, success, error, errorCode, errorMessage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerResponse)) {
            return false;
        }
        ServerResponse serverResponse = (ServerResponse) other;
        return this.login == serverResponse.login && this.success == serverResponse.success && this.error == serverResponse.error && this.errorCode == serverResponse.errorCode && pa7.t(this.errorMessage, serverResponse.errorMessage) && pa7.t(this.data, serverResponse.data);
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
        StringBuilder sbP = ib8.p("ServerResponse(login=", ", success=", ", error=", z, z2);
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

    public ServerResponse(boolean z, boolean z2, boolean z3, int i, String str, T t) {
        str.getClass();
        this.login = z;
        this.success = z2;
        this.error = z3;
        this.errorCode = i;
        this.errorMessage = str;
        this.data = t;
    }

    public /* synthetic */ ServerResponse(boolean z, boolean z2, boolean z3, int i, String str, Object obj, int i2, rp3 rp3Var) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str, obj);
    }
}
