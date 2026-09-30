package defpackage;

import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yo implements rq0 {
    public final AndroidComposeView a;
    public final wq0 b;
    public final AutofillId c;

    public yo(AndroidComposeView androidComposeView, wq0 wq0Var) {
        this.a = androidComposeView;
        this.b = wq0Var;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw kv2.d("Required value was null.");
        }
        this.c = autofillId;
    }
}
