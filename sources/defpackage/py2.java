package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import io.sentry.android.core.b1;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class py2 extends ResultReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py2(Handler handler, gle gleVar) {
        super(handler);
        this.a = 2;
        this.b = gleVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        String string;
        Bundle bundle2;
        f76 f76Var;
        final b76 b76VarB0;
        int i2 = this.a;
        final int i3 = 1;
        final int i4 = 0;
        Object obj = this.b;
        switch (i2) {
            case 0:
                bundle.getClass();
                qy2 qy2Var = (qy2) obj;
                if (ry2.b(bundle, new gl(2, ry2.a, my2.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 4), qy2Var.e(), qy2Var.d(), qy2Var.g)) {
                    return;
                }
                int i5 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) bundle.getParcelable("RESULT_DATA");
                int i6 = ry2.c;
                if (i5 != i6) {
                    b1.l("BeginSignIn", "Returned request code " + i6 + " which  does not match what was given " + i5);
                    return;
                }
                CancellationSignal cancellationSignal = qy2Var.g;
                if (i != -1) {
                    b76 g76Var = new g76(y41.q(i));
                    if (i == 0) {
                        g76Var = new y66("activity is cancelled by the user.");
                    }
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (yy2.a(cancellationSignal)) {
                        return;
                    }
                    qy2Var.e().execute(new oy2(qy2Var, g76Var, i4));
                    return;
                }
                try {
                    Context context = qy2Var.d;
                    oa7.A(context);
                    new zig(context, new pjg());
                    f76 f76VarC = qy2Var.c(zig.c(intent));
                    CancellationSignal cancellationSignal2 = qy2Var.g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (yy2.a(cancellationSignal2)) {
                        return;
                    }
                    qy2Var.e().execute(new ny2(i4, qy2Var, f76VarC));
                    return;
                } catch (b76 e) {
                    CancellationSignal cancellationSignal3 = qy2Var.g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (yy2.a(cancellationSignal3)) {
                        return;
                    }
                    qy2Var.e().execute(new oy2(qy2Var, e, i3));
                    return;
                } catch (x60 e2) {
                    mmb mmbVar = new mmb();
                    mmbVar.element = new g76(e2.getMessage());
                    if (e2.a() == 16) {
                        mmbVar.element = new y66(e2.getMessage());
                    } else if (ry2.b.contains(Integer.valueOf(e2.a()))) {
                        mmbVar.element = new c76(e2.getMessage());
                    }
                    CancellationSignal cancellationSignal4 = qy2Var.g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (yy2.a(cancellationSignal4)) {
                        return;
                    }
                    qy2Var.e().execute(new ny2(i3, qy2Var, mmbVar));
                    return;
                } catch (Throwable th) {
                    g76 g76Var2 = new g76(th.getMessage());
                    CancellationSignal cancellationSignal5 = qy2Var.g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (yy2.a(cancellationSignal5)) {
                        return;
                    }
                    qy2Var.e().execute(new ny2(2, qy2Var, g76Var2));
                    return;
                }
            case 1:
                bundle.getClass();
                gl glVar = new gl(2, ry2.a, my2.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 17);
                z66 z66Var = (z66) obj;
                Executor executor = z66Var.f;
                if (executor == null) {
                    pa7.g0("executor");
                    throw null;
                }
                iy2 iy2Var = z66Var.e;
                if (iy2Var == null) {
                    pa7.g0("callback");
                    throw null;
                }
                if (ry2.b(bundle, glVar, executor, iy2Var, z66Var.g)) {
                    return;
                }
                int i7 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) abg.C(bundle, "RESULT_DATA", Intent.class);
                Executor executor2 = z66Var.f;
                if (executor2 == null) {
                    pa7.g0("executor");
                    throw null;
                }
                final iy2 iy2Var2 = z66Var.e;
                if (iy2Var2 == null) {
                    pa7.g0("callback");
                    throw null;
                }
                CancellationSignal cancellationSignal6 = z66Var.g;
                int i8 = ry2.c;
                if (i7 != i8) {
                    b1.l("GetCredentialController", "Returned request code " + i8 + " which  does not match what was given " + i7);
                    return;
                }
                if (i != -1) {
                    final b76 g76Var3 = new g76(y41.q(i));
                    if (i == 0) {
                        g76Var3 = new y66("activity is cancelled by the user.");
                    }
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (yy2.a(cancellationSignal6)) {
                        return;
                    }
                    executor2.execute(new Runnable() { // from class: yyb
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i9 = i4;
                            Object g76Var4 = g76Var3;
                            iy2 iy2Var3 = iy2Var2;
                            switch (i9) {
                                case 0:
                                    ((hy2) iy2Var3).a(g76Var4);
                                    break;
                                default:
                                    if (g76Var4 == null) {
                                        g76Var4 = new g76("No provider data returned");
                                    }
                                    ((hy2) iy2Var3).a(g76Var4);
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (intent2 == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (yy2.a(cancellationSignal6)) {
                        return;
                    }
                    executor2.execute(new vy2(iy2Var2, 8));
                    return;
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 34) {
                    f76Var = hgc.g(intent2);
                } else {
                    Bundle bundleExtra = intent2.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                    f76Var = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new f76(g21.G(string, bundle2));
                }
                if (f76Var != null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (yy2.a(cancellationSignal6)) {
                        return;
                    }
                    executor2.execute(new xu8(13, iy2Var2, f76Var));
                    return;
                }
                if (i9 >= 34) {
                    b76VarB0 = hgc.f(intent2);
                } else {
                    int i10 = b76.a;
                    Bundle bundleExtra2 = intent2.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 == null) {
                        b76VarB0 = null;
                    } else {
                        String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string2 == null) {
                            qc0.j("Bundle was missing exception type.");
                            return;
                        }
                        b76VarB0 = t72.b0(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                    }
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (yy2.a(cancellationSignal6)) {
                    return;
                }
                executor2.execute(new Runnable() { // from class: yyb
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i3;
                        Object g76Var4 = b76VarB0;
                        iy2 iy2Var3 = iy2Var2;
                        switch (i11) {
                            case 0:
                                ((hy2) iy2Var3).a(g76Var4);
                                break;
                            default:
                                if (g76Var4 == null) {
                                    g76Var4 = new g76("No provider data returned");
                                }
                                ((hy2) iy2Var3).a(g76Var4);
                                break;
                        }
                    }
                });
                return;
            default:
                ((gle) obj).c(null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py2(ry2 ry2Var, Handler handler, int i) {
        super(handler);
        this.a = i;
        this.b = ry2Var;
    }
}
