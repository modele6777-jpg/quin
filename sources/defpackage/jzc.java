package defpackage;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljzc;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lf84;", "", "code", "I", "b", "()I", "errorCode", "c", "", "serverResponseError", "Ljava/lang/Boolean;", "", "serverResponseData", "Ljava/lang/String;", "serverResponseBody", "traceId", "isHttpFailure", "Z", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public class jzc extends Exception implements f84 {
    private final int code;
    private final int errorCode;
    private final boolean isHttpFailure;
    private final String serverResponseBody;
    private final String serverResponseData;
    private final Boolean serverResponseError;
    private final String traceId;

    public /* synthetic */ jzc(int i, int i2, String str, Boolean bool, String str2, int i3) {
        this(i, i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? null : bool, (i3 & 16) != 0 ? null : str2, null, null, false);
    }

    @Override // defpackage.f84
    public final List a() {
        c78 c78VarW = t72.w();
        if (this.isHttpFailure) {
            c78VarW.add(new iy9("http_code", String.valueOf(this.code)));
        }
        c78VarW.add(new iy9("server_error_code", String.valueOf(this.errorCode)));
        String message = getMessage();
        if (message != null) {
            if (v4e.Q(message)) {
                message = null;
            }
            if (message != null) {
                c78VarW.add(new iy9("server_error_message", nzc.a(message)));
            }
        }
        Boolean bool = this.serverResponseError;
        if (bool != null) {
            c78VarW.add(new iy9("server_response_error", String.valueOf(bool.booleanValue())));
        }
        String str = this.serverResponseData;
        if (str != null) {
            if (v4e.Q(str)) {
                str = null;
            }
            if (str != null) {
                c78VarW.add(new iy9("server_response_data", nzc.a(str)));
            }
        }
        String str2 = this.serverResponseBody;
        if (str2 != null) {
            if (v4e.Q(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                c78VarW.add(new iy9("server_response_body", nzc.a(str2)));
            }
        }
        String str3 = this.traceId;
        if (str3 != null) {
            String str4 = v4e.Q(str3) ? null : str3;
            if (str4 != null) {
                c78VarW.add(new iy9("x_trace_id", nzc.a(str4)));
            }
        }
        return c78VarW.n();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzc(int i, int i2, String str, Boolean bool, String str2, String str3, String str4, boolean z) {
        super(str);
        str.getClass();
        this.code = i;
        this.errorCode = i2;
        this.serverResponseError = bool;
        this.serverResponseData = str2;
        this.serverResponseBody = str3;
        this.traceId = str4;
        this.isHttpFailure = z;
    }
}
