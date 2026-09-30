package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dsc {
    public static final bsc a = new bsc();
    public static final vz9 b = q1c.f(Boolean.FALSE);
    public static Intent c;

    public static boolean a(Intent intent) {
        if (ua0.a() == null) {
            if ((intent != null ? intent.getData() : null) == null && ((intent == null || !intent.hasExtra("triggered_by")) && ((intent == null || !intent.hasExtra("source")) && (intent == null || !intent.hasExtra("qa_nav_route"))))) {
                return false;
            }
        }
        return true;
    }
}
