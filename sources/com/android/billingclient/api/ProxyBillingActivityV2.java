package com.android.billingclient.api;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.af;
import defpackage.fnb;
import defpackage.g5b;
import defpackage.j77;
import defpackage.jf;
import defpackage.oid;
import defpackage.ue;
import defpackage.vb2;
import defpackage.vrb;
import defpackage.yea;
import defpackage.ysd;
import defpackage.zsg;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyBillingActivityV2 extends vb2 {
    public jf K0;
    public jf L0;
    public jf M0;
    public jf N0;
    public jf O0;
    public jf P0;
    public ResultReceiver Q0;
    public ResultReceiver R0;
    public ResultReceiver S0;
    public ResultReceiver T0;
    public ResultReceiver U0;
    public ResultReceiver V0;

    public static final ue q() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            ue ueVar = new ue(ActivityOptions.makeBasic());
            ueVar.Z(3);
            return ueVar;
        }
        if (i < 34) {
            return null;
        }
        ue ueVar2 = new ue(ActivityOptions.makeBasic());
        ueVar2.Z(1);
        return ueVar2;
    }

    @Override // defpackage.vb2, defpackage.ub2, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        super.onCreate(bundle);
        this.K0 = p(new fnb(this), new af(5));
        this.L0 = p(new g5b(19, this), new af(5));
        this.M0 = p(new vrb(15, this), new af(5));
        this.N0 = p(new ysd(9, this), new af(5));
        this.O0 = p(new oid(11, this), new af(5));
        this.P0 = p(new yea(this), new af(5));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.Q0 = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.R0 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.S0 = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.T0 = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.U0 = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.V0 = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        zsg.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.Q0 = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            jf jfVar = this.K0;
            pendingIntent.getClass();
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            jfVar.y(new j77(intentSender, null, 0, 0), q());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.R0 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            jf jfVar2 = this.L0;
            pendingIntent2.getClass();
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            intentSender2.getClass();
            jfVar2.y(new j77(intentSender2, null, 0, 0), q());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.S0 = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            jf jfVar3 = this.M0;
            pendingIntent3.getClass();
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            intentSender3.getClass();
            jfVar3.y(new j77(intentSender3, null, 0, 0), q());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.T0 = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            jf jfVar4 = this.N0;
            pendingIntent4.getClass();
            IntentSender intentSender4 = pendingIntent4.getIntentSender();
            intentSender4.getClass();
            jfVar4.y(new j77(intentSender4, null, 0, 0), q());
            return;
        }
        if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.U0 = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            jf jfVar5 = this.O0;
            pendingIntent5.getClass();
            IntentSender intentSender5 = pendingIntent5.getIntentSender();
            intentSender5.getClass();
            jfVar5.y(new j77(intentSender5, null, 0, 0), q());
            return;
        }
        if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.V0 = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            jf jfVar6 = this.P0;
            pendingIntent6.getClass();
            IntentSender intentSender6 = pendingIntent6.getIntentSender();
            intentSender6.getClass();
            jfVar6.y(new j77(intentSender6, null, 0, 0), q());
        }
    }

    @Override // defpackage.vb2, defpackage.ub2, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.Q0;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.R0;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.S0;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.T0;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.U0;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.V0;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
