package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y84 extends j6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y84(String str, Bundle bundle, int i) {
        super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle);
        switch (i) {
            case 1:
                super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
                if (str.length() > 0) {
                    return;
                }
                qc0.j("password should not be empty");
                throw null;
            case 2:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                qc0.j("authenticationResponseJson must not be empty, and must be a valid JSON");
                throw null;
            default:
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused2) {
                    }
                }
                qc0.j("credentialJson must not be empty, and must be a valid JSON");
                throw null;
        }
    }
}
