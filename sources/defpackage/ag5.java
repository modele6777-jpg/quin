package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.adjust.sdk.Constants;
import java.net.URI;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ag5 extends k8a {
    public static final ct e = ct.d();
    public final je9 c;
    public final Context d;

    public ag5(je9 je9Var, Context context) {
        this.d = context;
        this.c = je9Var;
    }

    @Override // defpackage.k8a
    public final boolean a() {
        URI uriCreate;
        je9 je9Var = this.c;
        String strD = je9Var.D();
        boolean zIsEmpty = strD == null ? true : strD.trim().isEmpty();
        ct ctVar = e;
        if (zIsEmpty) {
            ctVar.f("URL is missing:" + je9Var.D());
            return false;
        }
        String strD2 = je9Var.D();
        if (strD2 == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(strD2);
            } catch (IllegalArgumentException | IllegalStateException e2) {
                ctVar.g("getResultUrl throws exception %s", e2.getMessage());
                uriCreate = null;
            }
        }
        if (uriCreate == null) {
            ctVar.f("URL cannot be parsed");
            return false;
        }
        Context context = this.d;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            ct.d().a("Detected domain allowlist, only allowlisted domains will be measured.");
            if (r8c.a == null) {
                r8c.a = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                String[] strArr = r8c.a;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        ctVar.f("URL fails allowlist rule: " + uriCreate);
                        return false;
                    }
                    if (host.contains(strArr[i])) {
                        break;
                    }
                    i++;
                }
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            ctVar.f("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !Constants.SCHEME.equalsIgnoreCase(scheme))) {
            ctVar.f("URL scheme is null or invalid");
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            ctVar.f("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            ctVar.f("URL port is less than or equal to 0");
            return false;
        }
        he9 he9VarV = je9Var.F() ? je9Var.v() : null;
        if (he9VarV == null || he9VarV == he9.HTTP_METHOD_UNKNOWN) {
            ctVar.f("HTTP Method is null or invalid: " + je9Var.v());
            return false;
        }
        if (je9Var.G() && je9Var.w() <= 0) {
            ctVar.f("HTTP ResponseCode is a negative value:" + je9Var.w());
            return false;
        }
        if (je9Var.H() && je9Var.y() < 0) {
            ctVar.f("Request Payload is a negative value:" + je9Var.y());
            return false;
        }
        if (je9Var.I() && je9Var.z() < 0) {
            ctVar.f("Response Payload is a negative value:" + je9Var.z());
            return false;
        }
        if (!je9Var.E() || je9Var.t() <= 0) {
            ctVar.f("Start time of the request is null, or zero, or a negative value:" + je9Var.t());
            return false;
        }
        if (je9Var.J() && je9Var.A() < 0) {
            ctVar.f("Time to complete the request is a negative value:" + je9Var.A());
            return false;
        }
        if (je9Var.L() && je9Var.C() < 0) {
            ctVar.f("Time from the start of the request to the start of the response is null or a negative value:" + je9Var.C());
            return false;
        }
        if (!je9Var.K() || je9Var.B() <= 0) {
            ctVar.f("Time from the start of the request to the end of the response is null, negative or zero:" + je9Var.B());
            return false;
        }
        if (je9Var.G()) {
            return true;
        }
        ctVar.f("Did not receive a HTTP Response Code");
        return false;
    }
}
