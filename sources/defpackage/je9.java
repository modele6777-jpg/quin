package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class je9 extends t56 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final je9 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile j0a PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private ql8 customAttributes_ = ql8.a;
    private String url_ = "";
    private String responseContentType_ = "";
    private n87 perfSessions_ = w0b.d;

    static {
        je9 je9Var = new je9();
        DEFAULT_INSTANCE = je9Var;
        t56.o(je9.class, je9Var);
    }

    public static fe9 M() {
        return (fe9) DEFAULT_INSTANCE.h();
    }

    public static je9 u() {
        return DEFAULT_INSTANCE;
    }

    public final long A() {
        return this.timeToRequestCompletedUs_;
    }

    public final long B() {
        return this.timeToResponseCompletedUs_;
    }

    public final long C() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String D() {
        return this.url_;
    }

    public final boolean E() {
        return (this.bitField0_ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 512) != 0;
    }

    public final void N(long j) {
        this.bitField0_ |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        this.clientStartTimeUs_ = j;
    }

    public final void O(he9 he9Var) {
        this.httpMethod_ = he9Var.a();
        this.bitField0_ |= 2;
    }

    public final void P(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    public final void Q() {
        this.networkClientErrorReason_ = ie9.GENERIC_CLIENT_ERROR.a();
        this.bitField0_ |= 16;
    }

    public final void R(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    public final void S(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    public final void T(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    public final void U(long j) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j;
    }

    public final void V(long j) {
        this.bitField0_ |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        this.timeToResponseCompletedUs_ = j;
    }

    public final void W(long j) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j;
    }

    public final void X(String str) {
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    @Override // defpackage.t56
    public final Object i(int i) {
        j0a n56Var;
        switch (kv2.B(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new hdb(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", ndb.c1, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", hj6.P0, "customAttributes_", ge9.a, "perfSessions_", m8a.class});
            case 3:
                return new je9();
            case 4:
                return new fe9(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j0a j0aVar = PARSER;
                if (j0aVar != null) {
                    return j0aVar;
                }
                synchronized (je9.class) {
                    try {
                        n56Var = PARSER;
                        if (n56Var == null) {
                            n56Var = new n56();
                            PARSER = n56Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return n56Var;
            default:
                cva.f();
                return null;
        }
    }

    public final void r(List list) {
        n87 n87VarN = this.perfSessions_;
        if (!((l4) n87VarN).a) {
            n87VarN = t56.n(n87VarN);
            this.perfSessions_ = n87VarN;
        }
        k56.g(list, n87VarN);
    }

    public final void s() {
        this.bitField0_ &= -65;
        this.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public final long t() {
        return this.clientStartTimeUs_;
    }

    public final he9 v() {
        he9 he9Var;
        int i = this.httpMethod_;
        he9 he9Var2 = he9.HTTP_METHOD_UNKNOWN;
        switch (i) {
            case 0:
                he9Var = he9Var2;
                break;
            case 1:
                he9Var = he9.GET;
                break;
            case 2:
                he9Var = he9.PUT;
                break;
            case 3:
                he9Var = he9.POST;
                break;
            case 4:
                he9Var = he9.DELETE;
                break;
            case 5:
                he9Var = he9.HEAD;
                break;
            case 6:
                he9Var = he9.PATCH;
                break;
            case 7:
                he9Var = he9.OPTIONS;
                break;
            case 8:
                he9Var = he9.TRACE;
                break;
            case 9:
                he9Var = he9.CONNECT;
                break;
            default:
                he9Var = null;
                break;
        }
        return he9Var == null ? he9Var2 : he9Var;
    }

    public final int w() {
        return this.httpResponseCode_;
    }

    public final n87 x() {
        return this.perfSessions_;
    }

    public final long y() {
        return this.requestPayloadBytes_;
    }

    public final long z() {
        return this.responsePayloadBytes_;
    }
}
