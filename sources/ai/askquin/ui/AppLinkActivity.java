package ai.askquin.ui;

import ai.askquin.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.bzd;
import defpackage.dzb;
import defpackage.ezb;
import defpackage.fzc;
import defpackage.h1;
import defpackage.jcc;
import defpackage.l0;
import defpackage.pa7;
import defpackage.ua0;
import defpackage.va0;
import defpackage.x1f;
import defpackage.xh7;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class AppLinkActivity extends h1 {
    public static final /* synthetic */ int Q0 = 0;

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    @Override // defpackage.h1, defpackage.nx5, defpackage.vb2, defpackage.ub2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object dzbVar;
        String url;
        Instant instantExpiredAt;
        String string;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent != null ? intent.getAction() : null;
        Intent intent2 = getIntent();
        Uri data = intent2 != null ? intent2.getData() : null;
        Intent intent3 = getIntent();
        intent3.getClass();
        try {
            Bundle extras = intent3.getExtras();
            if (extras == null || (string = extras.getString("extraMap")) == null) {
                dzbVar = null;
            } else {
                xh7 xh7Var = fzc.a;
                xh7Var.getClass();
                String androidJsonPayload = ((ExtraMap) xh7Var.b(ExtraMap.Companion.serializer(), string)).getAndroidJsonPayload();
                if (androidJsonPayload != null) {
                    dzbVar = (AndroidJsonPayload) xh7Var.b(AndroidJsonPayload.Companion.serializer(), androidJsonPayload);
                } else {
                    dzbVar = null;
                }
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            d().c("fail to extract androidJsonPayload", thA);
        }
        AndroidJsonPayload androidJsonPayload2 = (AndroidJsonPayload) (dzbVar instanceof dzb ? null : dzbVar);
        d().e("AppLinkActivity onCreate action=" + action + " data=" + data + ", androidJsonPayload=" + androidJsonPayload2);
        if (androidJsonPayload2 != null) {
            try {
                UrlData quinData = androidJsonPayload2.getQuinData();
                if (quinData != null && (instantExpiredAt = quinData.expiredAt()) != null && instantExpiredAt.isAfter(Instant.now())) {
                    jcc.k(1, Integer.valueOf(R.string.discount_activity_ended_toast));
                    return;
                }
                String reportTriggeredBy = androidJsonPayload2.getReportTriggeredBy();
                if (reportTriggeredBy != null) {
                    x1f x1fVar = x1f.a;
                    x1f.i(2, new l0(10, reportTriggeredBy, androidJsonPayload2), "notification_click");
                }
                UrlData quinData2 = androidJsonPayload2.getQuinData();
                if (quinData2 != null && (url = quinData2.getUrl()) != null) {
                    Uri uri = Uri.parse(url);
                    uri.getClass();
                    if (bzd.A(uri) || pa7.t(uri.getScheme(), "quinlove")) {
                        ua0.a.setValue(new va0(uri));
                        return;
                    }
                }
            } finally {
                w();
            }
        }
        if (pa7.t(action, "android.intent.action.VIEW") && data != null && (bzd.A(data) || pa7.t(data.getScheme(), "quinlove"))) {
            ua0.a.setValue(new va0(data));
        }
    }

    public final void w() {
        startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
        finish();
    }
}
