package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import ai.askquin.ui.onboard.OnboardingActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v04 implements d3b {
    public final Context a;
    public final List b;

    public v04(Context context) {
        this.a = context;
        ParamType paramType = ParamType.STRING;
        this.b = t72.I(new ParamSpec("dest", paramType, true, (nh7) null, 8, (rp3) null), new ParamSpec("source", paramType, false, (nh7) null, 8, (rp3) null));
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        Intent intentAddFlags;
        String strC;
        nh7 nh7Var = (nh7) ti7Var.get("dest");
        String strC2 = nh7Var != null ? oh7.i(nh7Var).c() : null;
        Context context = this.a;
        if (strC2 != null) {
            switch (strC2) {
                case "skin-store-preview":
                    int i = aod.Q0;
                    nh7 nh7Var2 = (nh7) ti7Var.get("source");
                    if (nh7Var2 == null || (strC = oh7.i(nh7Var2).c()) == null) {
                        strC = "available";
                    }
                    intentAddFlags = new Intent(context, (Class<?>) aod.class).putExtra("scenario", strC).addFlags(335544320);
                    intentAddFlags.getClass();
                    break;
                case "onboarding-birthday":
                    intentAddFlags = new Intent(context, (Class<?>) OnboardingActivity.class);
                    intentAddFlags.addFlags(268435456);
                    intentAddFlags.putExtra("KEY_START_DESTINATION", "birthday");
                    break;
                case "paywall-upgrade-remaining-one":
                    int i2 = dhf.Q0;
                    intentAddFlags = w1e.h(context, 1, true);
                    break;
                case "paywall-upgrade-no-offer-exhausted":
                    int i3 = dhf.Q0;
                    intentAddFlags = w1e.h(context, 0, false);
                    break;
                case "paywall-upgrade-no-offer-remaining-one":
                    int i4 = dhf.Q0;
                    intentAddFlags = w1e.h(context, 1, false);
                    break;
                case "paywall-upgrade-exhausted":
                    int i5 = dhf.Q0;
                    intentAddFlags = w1e.h(context, 0, true);
                    break;
                default:
                    intentAddFlags = null;
                    break;
            }
        } else {
            intentAddFlags = null;
        }
        if (intentAddFlags == null) {
            nh7 nh7Var3 = (nh7) ti7Var.get("source");
            return w04.a(strC2, nh7Var3 != null ? oh7.i(nh7Var3).c() : null);
        }
        if (intentAddFlags.resolveActivity(context.getPackageManager()) == null) {
            return new QaResult.Err("UI preview requires a debug or verify build", "preview_unavailable");
        }
        j8 j8Var = new j8(this, intentAddFlags, strC2, 24);
        if (pa7.t(Looper.myLooper(), Looper.getMainLooper())) {
            return (QaResult) j8Var.invoke();
        }
        Handler handler = new Handler(Looper.getMainLooper());
        FutureTask futureTask = new FutureTask(new uh2(2, j8Var));
        handler.post(futureTask);
        try {
            Object obj = futureTask.get(2L, TimeUnit.SECONDS);
            obj.getClass();
            return (QaResult) obj;
        } catch (Exception e) {
            futureTask.cancel(false);
            handler.removeCallbacks(futureTask);
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return e instanceof TimeoutException ? new QaResult.Err("timed out opening preview on the main thread", "timeout") : new QaResult.Err(ub3.i("preview launch failed: ", e.getMessage()), "nav_error");
        }
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "dev.open";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "打开 DevScreen 的页面/弹窗/paywall（任意屏一键）";
    }
}
