package com.android.billingclient.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.bp;
import defpackage.hwg;
import defpackage.i;
import defpackage.j6h;
import defpackage.jxg;
import defpackage.lqb;
import defpackage.p7h;
import defpackage.s6h;
import defpackage.t7h;
import defpackage.tx0;
import defpackage.u6h;
import defpackage.z5h;
import defpackage.zsg;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver a;
    public boolean b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;
    public jxg g;
    public lqb v;

    public static z5h a(Intent intent, int i) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return z5h.NULL_BUNDLE_IN_ACTIVITY_RESULT;
            }
            return i == 5 ? z5h.PLAY_STORE_ON_CREATE_RUNTIME_EXCEPTION : z5h.REASON_UNSPECIFIED;
        }
        if (i == -1) {
            return z5h.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i == 0) {
            return z5h.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i != 3) {
            return i != 4 ? z5h.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : z5h.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
        }
        return z5h.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    public final Intent b(z5h z5hVar, long j, boolean z) {
        tx0 tx0Var;
        Intent intentC = c();
        j6h j6hVar = j6h.BROADCAST_ACTION_UNSPECIFIED;
        if (z) {
            jxg jxgVar = this.g;
            if (jxgVar != null && (tx0Var = jxgVar.a) != null) {
                intentC.putExtra("RESPONSE_CODE", tx0Var.a);
                intentC.putExtra("DEBUG_MESSAGE", tx0Var.c);
            } else if (jxgVar == null || jxgVar.b) {
                intentC.putExtra("RESPONSE_CODE", 6);
                intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                i iVarA = tx0.a();
                iVarA.a = 6;
                iVarA.c = "An internal error occurred.";
                intentC.putExtra("FAILURE_LOGGING_PAYLOAD", hwg.b(z5hVar, 2, iVarA.a(), null, j6hVar).b());
            } else {
                intentC.putExtra("RESPONSE_CODE", 3);
                intentC.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
                i iVarA2 = tx0.a();
                iVarA2.a = 3;
                iVarA2.c = "Play Store is blocked.";
                intentC.putExtra("FAILURE_LOGGING_PAYLOAD", hwg.b(z5h.PLAY_STORE_APP_BLOCKED, 2, iVarA2.a(), null, j6hVar).b());
            }
        } else {
            intentC.putExtra("RESPONSE_CODE", 6);
            intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            i iVarA3 = tx0.a();
            iVarA3.a = 6;
            iVarA3.c = "An internal error occurred.";
            intentC.putExtra("FAILURE_LOGGING_PAYLOAD", hwg.b(z5hVar, 2, iVarA3.a(), null, j6hVar).b());
        }
        intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentC.putExtra("billingClientTransactionId", j);
        intentC.putExtra("wasServiceAutoReconnected", this.f);
        return intentC;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[PHI: r11
  0x0070: PHI (r11v1 int) = (r11v0 int), (r11v16 int) binds: [B:28:0x006b, B:30:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:50:0x0112  */
    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0070, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x008c, please report this as an issue */
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        int i3;
        int i4;
        String string;
        Intent intentC;
        boolean z2;
        int i5;
        ResultReceiver resultReceiver;
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = zsg.e(intent, "ProxyBillingActivity").a;
            i4 = -1;
            if (i2 != -1) {
                zsg.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                zsg.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            }
            if (true != z) {
                zsg.h("ProxyBillingActivity", "Got null data with resultCode " + i4 + "!");
            } else if (intent.getExtras() == null) {
                zsg.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (a(intent, i4).equals(z5h.REASON_UNSPECIFIED)) {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent2;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.e);
                intentC.putExtra("wasServiceAutoReconnected", this.f);
            } else {
                z5h z5hVarA = a(intent, i4);
                long j = this.e;
                if (intent == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intentC = b(z5hVarA, j, z2);
            }
            if (i == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i == 110) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = zsg.e(intent, "ProxyBillingActivity").a;
            i4 = -1;
            if (i2 != -1) {
                zsg.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                zsg.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            }
            if (true != z) {
                zsg.h("ProxyBillingActivity", "Got null data with resultCode " + i4 + "!");
            } else if (intent.getExtras() == null) {
                zsg.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (a(intent, i4).equals(z5h.REASON_UNSPECIFIED)) {
                z5h z5hVarA2 = a(intent, i4);
                long j2 = this.e;
                if (intent == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intentC = b(z5hVarA2, j2, z2);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent3.setPackage(getApplicationContext().getPackageName());
                    intent3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent3;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.e);
                intentC.putExtra("wasServiceAutoReconnected", this.f);
            }
            if (i == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i == 101) {
            int i6 = zsg.a;
            if (intent == null) {
                zsg.h("ProxyBillingActivity", "Got null intent!");
                intent = null;
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    zsg.h("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i5 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.a;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i5, extras);
                }
            }
            i5 = 0;
            resultReceiver = this.a;
            if (resultReceiver != null) {
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                resultReceiver.send(i5, extras);
            }
        } else {
            zsg.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.b = false;
        jxg jxgVar = this.g;
        if (jxgVar != null) {
            jxgVar.a = null;
        }
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d5  */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean zContainsKey;
        int i;
        PendingIntent pendingIntent;
        ProxyBillingActivity proxyBillingActivity;
        IntentSender.SendIntentException sendIntentException;
        ResultReceiver resultReceiver;
        Intent intentB;
        Bundle bundle2;
        Bundle bundle3;
        super.onCreate(bundle);
        if (bundle == null) {
            zContainsKey = getIntent() == null ? false : getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
        } else {
            zContainsKey = bundle.containsKey("in_app_message_result_receiver");
        }
        if (!zContainsKey) {
            try {
                i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                zsg.i("ProxyBillingActivity", "Failed to get package info for current package.", e);
                i = -1;
            }
            if (this.v == null) {
                Context applicationContext = getApplicationContext();
                s6h s6hVarZ = u6h.z();
                s6hVarZ.g(getPackageName());
                s6hVarZ.h();
                s6hVarZ.d(i);
                s6hVarZ.c(Build.VERSION.SDK_INT);
                s6hVarZ.f();
                this.v = new lqb(applicationContext, (u6h) s6hVarZ.a());
            }
            synchronized (this) {
                try {
                    this.g = new jxg(this.v);
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
                    intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
                    bp.H(this, this.g, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", 2);
                } catch (NoSuchMethodError | RuntimeException e2) {
                    this.g = null;
                    boolean z = e2 instanceof NoSuchMethodError;
                    lqb lqbVar = this.v;
                    if (z) {
                        p7h p7hVarP = t7h.p();
                        p7hVarP.b();
                        t7h.q((t7h) p7hVarP.b, 2);
                        lqbVar.G((t7h) p7hVarP.a());
                    } else {
                        p7h p7hVarP2 = t7h.p();
                        p7hVarP2.b();
                        t7h.q((t7h) p7hVarP2.b, 1);
                        lqbVar.G((t7h) p7hVarP2.a());
                    }
                    zsg.i("ProxyBillingActivity", "Failed to register receiver.", e2);
                }
            }
        }
        if (bundle != null) {
            zsg.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        zsg.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.c = true;
                this.d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.b = true;
            int i2 = Build.VERSION.SDK_INT;
            try {
                try {
                    if (i2 < 36) {
                        if (i2 >= 34) {
                            bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                        } else {
                            bundle2 = null;
                        }
                        proxyBillingActivity = this;
                        proxyBillingActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.d, new Intent(), 0, 0, 0, bundle2);
                        return;
                    }
                    bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
                    proxyBillingActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.d, new Intent(), 0, 0, 0, bundle2);
                    return;
                } catch (IntentSender.SendIntentException e3) {
                    e = e3;
                    sendIntentException = e;
                    zsg.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", sendIntentException);
                    resultReceiver = proxyBillingActivity.a;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    } else {
                        intentB = proxyBillingActivity.b(z5h.INTENT_SENDER_EXCEPTION, proxyBillingActivity.e, false);
                        if (proxyBillingActivity.c) {
                            intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        proxyBillingActivity.sendBroadcast(intentB);
                    }
                    proxyBillingActivity.b = false;
                    proxyBillingActivity.finish();
                }
                bundle2 = bundle3;
                proxyBillingActivity = this;
            } catch (IntentSender.SendIntentException e4) {
                sendIntentException = e4;
                proxyBillingActivity = this;
                zsg.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", sendIntentException);
                resultReceiver = proxyBillingActivity.a;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                } else {
                    intentB = proxyBillingActivity.b(z5h.INTENT_SENDER_EXCEPTION, proxyBillingActivity.e, false);
                    if (proxyBillingActivity.c) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    proxyBillingActivity.sendBroadcast(intentB);
                }
                proxyBillingActivity.b = false;
                proxyBillingActivity.finish();
            }
        } catch (IntentSender.SendIntentException e5) {
            e = e5;
            proxyBillingActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        tx0 tx0Var;
        super.onDestroy();
        jxg jxgVar = this.g;
        if (jxgVar != null) {
            tx0Var = jxgVar.a;
            try {
                unregisterReceiver(jxgVar);
            } catch (RuntimeException e) {
                zsg.i("ProxyBillingActivity", "Failed to unregister receiver.", e);
            }
        } else {
            tx0Var = null;
        }
        if (isFinishing() && this.b) {
            Intent intentC = c();
            if (tx0Var != null) {
                intentC.putExtra("RESPONSE_CODE", tx0Var.a);
                intentC.putExtra("DEBUG_MESSAGE", tx0Var.c);
            } else {
                intentC.putExtra("RESPONSE_CODE", 1);
                intentC.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.c) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.d;
            if (i == 110 || i == 100) {
                intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentC.putExtra("billingClientTransactionId", this.e);
            }
            sendBroadcast(intentC);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.c);
        bundle.putInt("activity_code", this.d);
        bundle.putLong("billingClientTransactionId", this.e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f);
    }
}
