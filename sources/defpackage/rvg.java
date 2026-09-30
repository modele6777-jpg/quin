package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import io.sentry.android.core.b1;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rvg {
    public final p3h a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public rvg(p3h p3hVar) {
        this.a = p3hVar;
    }

    public final gfh a(vb2 vb2Var, q0c q0cVar) {
        tjg tjgVar = (tjg) q0cVar;
        if (tjgVar.b) {
            return Tasks.d(null);
        }
        Intent intent = new Intent(vb2Var, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", tjgVar.a);
        intent.putExtra("window_flags", vb2Var.getWindow().getDecorView().getWindowSystemUiVisibility());
        gle gleVar = new gle();
        intent.putExtra("result_receiver", new py2(this.b, gleVar));
        vb2Var.startActivity(intent);
        return gleVar.a;
    }

    public final gfh b() {
        String str;
        p3h p3hVar = this.a;
        String str2 = p3hVar.b;
        ue1 ue1Var = p3h.c;
        ue1Var.d("requestInAppReview (%s)", str2);
        reh rehVar = p3hVar.a;
        if (rehVar != null) {
            gle gleVar = new gle();
            rehVar.a().post(new z8h(rehVar, gleVar, gleVar, new wxg(p3hVar, gleVar, gleVar)));
            return gleVar.a;
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            b1.d("PlayCore", ue1.f(ue1Var.a, "Play Store app is either not installed or not the official version", objArr));
        }
        Locale locale = Locale.getDefault();
        HashMap map = ujg.a;
        if (map.containsKey(-1)) {
            str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) ujg.b.get(-1)) + ")";
        } else {
            str = "";
        }
        return Tasks.c(new p0c(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null)));
    }
}
