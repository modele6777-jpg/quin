package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import defpackage.aa8;
import defpackage.abg;
import defpackage.ba8;
import defpackage.djg;
import defpackage.em7;
import defpackage.ey2;
import defpackage.fud;
import defpackage.hu3;
import defpackage.job;
import defpackage.kxa;
import defpackage.l2e;
import defpackage.mjg;
import defpackage.nx5;
import defpackage.oid;
import defpackage.owf;
import defpackage.qc0;
import defpackage.thg;
import defpackage.z98;
import io.sentry.android.core.b1;
import java.lang.reflect.Modifier;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class SignInHubActivity extends nx5 {
    public static boolean U0 = false;
    public boolean P0 = false;
    public SignInConfiguration Q0;
    public boolean R0;
    public int S0;
    public Intent T0;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // defpackage.nx5, defpackage.vb2, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.P0) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                mjg mjgVarO = mjg.O(this);
                GoogleSignInOptions googleSignInOptions = this.Q0.b;
                synchronized (mjgVarO) {
                    ((l2e) mjgVarO.a).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.R0 = true;
                this.S0 = i2;
                this.T0 = intent;
                s();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                t(intExtra);
                return;
            }
        }
        t(8);
    }

    @Override // defpackage.nx5, defpackage.vb2, defpackage.ub2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            b1.d("AuthSignInClient", "Null action");
            t(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            b1.d("AuthSignInClient", "Action not implemented");
            t(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            b1.d("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            b1.d("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            b1.d("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.Q0 = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.R0 = z;
            if (z) {
                this.S0 = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.T0 = intent2;
                    s();
                    return;
                } else {
                    b1.d("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (U0) {
            setResult(0);
            t(12502);
            return;
        }
        U0 = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.Q0);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.P0 = true;
            b1.l("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            t(17);
        }
    }

    @Override // defpackage.nx5, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        U0 = false;
    }

    @Override // defpackage.vb2, defpackage.ub2, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.R0);
        if (this.R0) {
            bundle.putInt("signInResultCode", this.S0);
            bundle.putParcelable("signInResultData", this.T0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s() {
        owf owfVarG = g();
        hu3 hu3Var = ba8.d;
        owfVarG.getClass();
        ey2 ey2Var = ey2.b;
        ey2Var.getClass();
        kxa kxaVar = new kxa(owfVarG, hu3Var, ey2Var);
        em7 em7VarB = job.a.b(ba8.class);
        String strG = em7VarB.g();
        if (strG == null) {
            qc0.j("Local and anonymous classes can not be ViewModels");
            return;
        }
        ba8 ba8Var = (ba8) kxaVar.f(em7VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG));
        oid oidVar = new oid(9, this);
        boolean z = ba8Var.c;
        fud fudVar = ba8Var.b;
        if (z) {
            qc0.p("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            qc0.p("initLoader must be called on the main thread");
            return;
        }
        fudVar.getClass();
        z98 z98Var = (z98) abg.q(fudVar, 0);
        if (z98Var == null) {
            try {
                ba8Var.c = true;
                Set set = thg.b;
                synchronized (set) {
                }
                djg djgVar = new djg(this, set);
                if (djg.class.isMemberClass() && !Modifier.isStatic(djg.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + djgVar);
                }
                z98 z98Var2 = new z98(djgVar);
                fudVar.c(0, z98Var2);
                ba8Var.c = false;
                aa8 aa8Var = new aa8(z98Var2.l, oidVar);
                z98Var2.e(this, aa8Var);
                aa8 aa8Var2 = z98Var2.n;
                if (aa8Var2 != null) {
                    z98Var2.j(aa8Var2);
                }
                z98Var2.m = this;
                z98Var2.n = aa8Var;
            } catch (Throwable th) {
                ba8Var.c = false;
                throw th;
            }
        } else {
            aa8 aa8Var3 = new aa8(z98Var.l, oidVar);
            z98Var.e(this, aa8Var3);
            aa8 aa8Var4 = z98Var.n;
            if (aa8Var4 != null) {
                z98Var.j(aa8Var4);
            }
            z98Var.m = this;
            z98Var.n = aa8Var3;
        }
        U0 = false;
    }

    public final void t(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        U0 = false;
    }
}
