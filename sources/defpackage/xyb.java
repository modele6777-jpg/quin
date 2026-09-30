package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxyb;", "Lyyc;", "Lf84;", "", "serverResponseBody", "Ljava/lang/String;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class xyb extends yyc implements f84 {
    private final String serverResponseBody;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyb(Exception exc, String str) {
        super("Failed to decode server response: ".concat(exc.getClass().getName()));
        str.getClass();
        this.serverResponseBody = str;
    }

    @Override // defpackage.f84
    public final List a() {
        return t72.H(new iy9("server_response_body", v4e.m0(UserMetadata.MAX_ATTRIBUTE_SIZE, nzc.e(this.serverResponseBody))));
    }
}
