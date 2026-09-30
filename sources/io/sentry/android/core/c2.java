package io.sentry.android.core;

import ai.askquin.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import defpackage.aha;
import io.sentry.l5;
import io.sentry.o5;
import io.sentry.q4;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.y6;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c2 extends AlertDialog {
    public boolean a;
    public io.sentry.protocol.w b;
    public DialogInterface.OnDismissListener c;
    public final l5 d;
    public y1 e;
    public b2 f;

    public c2(Context context) {
        Activity activity;
        super(context, 0);
        this.a = false;
        l5 feedbackOptions = q4.b().o().getFeedbackOptions();
        l5 l5Var = new l5();
        l5Var.a = false;
        l5Var.b = true;
        l5Var.c = false;
        l5Var.d = true;
        l5Var.e = true;
        l5Var.f = true;
        l5Var.g = false;
        l5Var.a = feedbackOptions.a;
        l5Var.b = feedbackOptions.b;
        l5Var.c = feedbackOptions.c;
        l5Var.d = feedbackOptions.d;
        l5Var.e = feedbackOptions.e;
        l5Var.f = feedbackOptions.f;
        l5Var.g = feedbackOptions.g;
        l5Var.h = feedbackOptions.h;
        this.d = l5Var;
        o5.d().a("UserFeedbackWidget");
        l5 feedbackOptions2 = q4.b().o().getFeedbackOptions();
        if (!l5Var.g || feedbackOptions2.g) {
            return;
        }
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity == null) {
            return;
        }
        this.e = new y1(q4.b().o().getLogger());
        WeakReference weakReference = new WeakReference(activity);
        this.e.c(activity, new y6(3, this, weakReference));
        Application application = activity.getApplication();
        b2 b2Var = new b2(this, weakReference);
        this.f = b2Var;
        application.registerActivityLifecycleCallbacks(b2Var);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        io.sentry.protocol.i0 i0VarM;
        super.onCreate(bundle);
        setContentView(R.layout.sentry_dialog_user_feedback);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131072);
        }
        setCancelable(this.a);
        TextView textView = (TextView) findViewById(R.id.sentry_dialog_user_feedback_title);
        ImageView imageView = (ImageView) findViewById(R.id.sentry_dialog_user_feedback_logo);
        final TextView textView2 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_name);
        final EditText editText = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_name);
        final TextView textView3 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_email);
        final EditText editText2 = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_email);
        final TextView textView4 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_description);
        final EditText editText3 = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_description);
        Button button = (Button) findViewById(R.id.sentry_dialog_user_feedback_btn_send);
        Button button2 = (Button) findViewById(R.id.sentry_dialog_user_feedback_btn_cancel);
        final l5 l5Var = this.d;
        if (l5Var.f) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        if (l5Var.b || l5Var.a) {
            textView2.setVisibility(0);
            editText.setVisibility(0);
            textView2.setText("Name");
            editText.setHint("Your Name");
            if (l5Var.a) {
                textView2.append(" (Required)");
            }
        } else {
            textView2.setVisibility(8);
            editText.setVisibility(8);
        }
        if (l5Var.d || l5Var.c) {
            textView3.setVisibility(0);
            editText2.setVisibility(0);
            textView3.setText("Email");
            editText2.setHint("your.email@example.org");
            if (l5Var.c) {
                textView3.append(" (Required)");
            }
        } else {
            textView3.setVisibility(8);
            editText2.setVisibility(8);
        }
        if (l5Var.e && (i0VarM = q4.b().w().M()) != null) {
            editText.setText(i0VarM.c);
            editText2.setText(i0VarM.a);
        }
        textView4.setText("Description");
        textView4.append(" (Required)");
        editText3.setHint("What's the bug? What did you expect?");
        textView.setText("Report a Bug");
        button.setText("Send Bug Report");
        button.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText4 = editText;
                String strTrim = editText4.getText().toString().trim();
                EditText editText5 = editText2;
                String strTrim2 = editText5.getText().toString().trim();
                EditText editText6 = editText3;
                String strTrim3 = editText6.getText().toString().trim();
                boolean zIsEmpty = strTrim.isEmpty();
                l5 l5Var2 = l5Var;
                if (zIsEmpty && l5Var2.a) {
                    editText4.setError(textView2.getText());
                    return;
                }
                if (strTrim2.isEmpty() && l5Var2.c) {
                    editText5.setError(textView3.getText());
                    return;
                }
                if (strTrim3.isEmpty()) {
                    editText6.setError(textView4.getText());
                    return;
                }
                io.sentry.protocol.k kVar = new io.sentry.protocol.k(strTrim3);
                kVar.c = strTrim;
                kVar.b = strTrim2;
                c2 c2Var = this.a;
                io.sentry.protocol.w wVar = c2Var.b;
                if (wVar != null) {
                    kVar.e = wVar;
                }
                if (q4.b().x().a(kVar).equals(io.sentry.protocol.w.b)) {
                    l5Var2.getClass();
                } else {
                    Context context = c2Var.getContext();
                    l5Var2.getClass();
                    Toast.makeText(context, "Thank you for your report!", 0).show();
                }
                c2Var.cancel();
            }
        });
        button2.setText("Cancel");
        button2.setOnClickListener(new aha(5, this));
        setOnDismissListener(this.c);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        EditText editText = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_description);
        editText.getText().clear();
        editText.setError(null);
        q6 q6VarO = q4.b().o();
        q6VarO.getFeedbackOptions().getClass();
        q6VarO.getReplayController().h(Boolean.FALSE);
        this.b = q6VarO.getReplayController().l();
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        this.a = z;
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.c = onDismissListener;
        final Runnable runnable = q4.b().o().getFeedbackOptions().h;
        if (runnable != null) {
            super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: io.sentry.android.core.a2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    runnable.run();
                    c2 c2Var = this.a;
                    c2Var.b = null;
                    DialogInterface.OnDismissListener onDismissListener2 = c2Var.c;
                    if (onDismissListener2 != null) {
                        onDismissListener2.onDismiss(dialogInterface);
                    }
                }
            });
        } else {
            super.setOnDismissListener(this.c);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        io.sentry.g1 g1VarB = q4.b();
        q6 q6VarO = g1VarB.o();
        if (g1VarB.isEnabled() && q6VarO.isEnabled()) {
            super.show();
        } else {
            q6VarO.getLogger().i(q5.WARNING, "Sentry is disabled. Feedback dialog won't be shown.", new Object[0]);
        }
    }
}
