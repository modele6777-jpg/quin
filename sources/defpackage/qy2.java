package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import io.sentry.android.core.b1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qy2 extends ry2 {
    public final Context d;
    public iy2 e;
    public Executor f;
    public CancellationSignal g;
    public final py2 h;

    public qy2(Context context) {
        context.getClass();
        this.d = context;
        this.h = new py2(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final f76 c(kgd kgdVar) throws g76, y66, k76 {
        Object obj;
        String string;
        j6 y84Var;
        j2b j2bVar = kgdVar.w;
        String str = kgdVar.g;
        String str2 = kgdVar.a;
        String str3 = kgdVar.f;
        boolean z = true;
        if (str3 != null) {
            str2.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str3);
            y84Var = new y84(str3, bundle, 1);
        } else {
            fc6 fc6Var = null;
            JSONObject jSONObject = null;
            if (str != null) {
                str2.getClass();
                String str4 = kgdVar.b;
                String str5 = str4 != null ? str4 : null;
                String str6 = kgdVar.c;
                String str7 = str6 != null ? str6 : null;
                String str8 = kgdVar.d;
                String str9 = str8 != null ? str8 : null;
                String str10 = kgdVar.v;
                String str11 = str10 != null ? str10 : null;
                Uri uri = kgdVar.e;
                fc6Var = new fc6(str2, str, str5, str9, str7, uri != null ? uri : null, str11);
            } else if (j2bVar != null) {
                yl0 yl0Var = j2bVar.f;
                wl0 wl0Var = j2bVar.e;
                xl0 xl0Var = j2bVar.d;
                LinkedHashMap linkedHashMap = k2b.a;
                JSONObject jSONObject2 = new JSONObject();
                if (xl0Var != null) {
                    obj = xl0Var;
                } else if (wl0Var != null) {
                    obj = wl0Var;
                } else {
                    if (yl0Var == null) {
                        qc0.p("No response set.");
                        return null;
                    }
                    obj = yl0Var;
                }
                if (obj instanceof yl0) {
                    yl0 yl0Var2 = (yl0) obj;
                    by4 by4Var = yl0Var2.a;
                    by4Var.getClass();
                    String str12 = yl0Var2.b;
                    jg4 jg4Var = (jg4) k2b.a.get(by4Var);
                    if (jg4Var == null) {
                        throw new k76(new k(26), ub3.i("unknown fido gms exception - ", str12));
                    }
                    if (by4Var == by4.NOT_ALLOWED_ERR && str12 != null && v4e.F(str12, "Unable to get sync account", false)) {
                        throw new y66("Passkey retrieval was cancelled by the user.");
                    }
                    throw new k76(jg4Var, str12);
                }
                if (obj instanceof wl0) {
                    try {
                        x0h x0hVar = j2bVar.c;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (x0hVar != null && x0hVar.m().length > 0) {
                                jSONObject3.put("rawId", y7h.u(x0hVar.m()));
                            }
                            String str13 = j2bVar.v;
                            if (str13 != null) {
                                jSONObject3.put("authenticatorAttachment", str13);
                            }
                            String str14 = j2bVar.b;
                            if (str14 != null && yl0Var == null) {
                                jSONObject3.put("type", str14);
                            }
                            String str15 = j2bVar.a;
                            if (str15 != null) {
                                jSONObject3.put("id", str15);
                            }
                            String str16 = "response";
                            if (wl0Var != null) {
                                jSONObject = wl0Var.c();
                            } else if (xl0Var != null) {
                                jSONObject = xl0Var.c();
                            } else {
                                if (yl0Var != null) {
                                    try {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("code", yl0Var.a.a());
                                        String str17 = yl0Var.b;
                                        if (str17 != null) {
                                            jSONObject.put("message", str17);
                                        }
                                        str16 = "error";
                                    } catch (JSONException e) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                                    }
                                }
                                z = false;
                            }
                            if (jSONObject != null) {
                                jSONObject3.put(str16, jSONObject);
                            }
                            ul0 ul0Var = j2bVar.g;
                            if (ul0Var != null) {
                                jSONObject3.put("clientExtensionResults", ul0Var.c());
                            } else if (z) {
                                jSONObject3.put("clientExtensionResults", new JSONObject());
                            }
                            string = jSONObject3.toString();
                            string.getClass();
                        } catch (JSONException e2) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
                        }
                    } catch (Throwable th) {
                        throw new g76("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
                    }
                } else {
                    b1.d("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                    string = jSONObject2.toString();
                    string.getClass();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", string);
                y84Var = new y84(string, bundle2, 2);
            } else {
                b1.l("BeginSignIn", "Credential returned but no google Id or password or passkey found");
            }
            y84Var = fc6Var;
        }
        if (y84Var != null) {
            return new f76(y84Var);
        }
        throw new g76("When attempting to convert get response, null credential found");
    }

    public final iy2 d() {
        iy2 iy2Var = this.e;
        if (iy2Var != null) {
            return iy2Var;
        }
        pa7.g0("callback");
        throw null;
    }

    public final Executor e() {
        Executor executor = this.f;
        if (executor != null) {
            return executor;
        }
        pa7.g0("executor");
        throw null;
    }

    public final void f(e76 e76Var, CancellationSignal cancellationSignal, Executor executor, iy2 iy2Var) {
        e76Var.getClass();
        iy2Var.getClass();
        executor.getClass();
        this.g = cancellationSignal;
        this.e = iy2Var;
        this.f = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (yy2.a(cancellationSignal)) {
            return;
        }
        Context context = this.d;
        context.getClass();
        dx0 dx0Var = new dx0(false);
        zw0 zw0VarC = ax0.c();
        zw0VarC.a = false;
        ax0 ax0VarA = zw0VarC.a();
        cx0 cx0Var = new cx0(false, null, null);
        bx0 bx0Var = new bx0(false, null);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        int i = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        Iterator it = e76Var.a.iterator();
        boolean z = false;
        ax0 ax0VarA2 = ax0VarA;
        while (it.hasNext()) {
            if (((i76) it.next()) instanceof i76) {
                zw0 zw0VarC2 = ax0.c();
                zw0VarC2.b = false;
                oa7.x("908709090310-6rk9ld8362m372ostkv4kn0k5ru7iu95.apps.googleusercontent.com");
                zw0VarC2.c = "908709090310-6rk9ld8362m372ostkv4kn0k5ru7iu95.apps.googleusercontent.com";
                z = true;
                zw0VarC2.a = true;
                ax0VarA2 = zw0VarC2.a();
            }
        }
        zig zigVar = new zig(context, new pjg());
        zw0 zw0VarC3 = ax0.c();
        zw0VarC3.a = false;
        zw0VarC3.a();
        ex0 ex0Var = new ex0(dx0Var, ax0VarA2, zigVar.l, z, 0, cx0Var, bx0Var, false);
        j27 j27VarB = j27.b();
        j27VarB.d = new za5[]{new za5("auth_api_credentials_begin_sign_in", 8L)};
        j27VarB.c = new ysd(zigVar, ex0Var);
        j27VarB.a = false;
        j27VarB.b = 1553;
        gfh gfhVarB = zigVar.b(0, j27VarB.a());
        jv2 jv2Var = new jv2(19, new ks2(5, cancellationSignal, this));
        gfhVarB.getClass();
        dd7 dd7Var = hle.a;
        gfhVarB.e(dd7Var, jv2Var);
        gfhVarB.d(dd7Var, new bo1(6, this, cancellationSignal));
    }
}
