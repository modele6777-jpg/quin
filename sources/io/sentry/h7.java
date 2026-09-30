package io.sentry;

import com.adjust.sdk.Constants;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum h7 implements k2 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(Constants.MINIMAL_ERROR_STATUS_CODE),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(Constants.MINIMAL_ERROR_STATUS_CODE),
    ABORTED(409),
    OUT_OF_RANGE(Constants.MINIMAL_ERROR_STATUS_CODE),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    h7(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    public static h7 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static h7 fromHttpStatusCode(int i) {
        for (h7 h7Var : values()) {
            if (h7Var.matches(i)) {
                return h7Var;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.k2
    public void serialize(m3 m3Var, z0 z0Var) {
        ((io.sentry.internal.debugmeta.c) m3Var).z(apiName());
    }

    h7(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }

    public static h7 fromHttpStatusCode(Integer num, h7 h7Var) {
        h7 h7VarFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : h7Var;
        return h7VarFromHttpStatusCode != null ? h7VarFromHttpStatusCode : h7Var;
    }
}
