package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eh9 {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final int d;
    public final CharSequence e;
    public final PendingIntent f;

    public eh9(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatA = IconCompat.a(2131230960);
        Bundle bundle = new Bundle();
        this.c = true;
        this.b = iconCompatA;
        if (iconCompatA != null && iconCompatA.c() == 2) {
            this.d = iconCompatA.b();
        }
        this.e = ih9.b(str);
        this.f = pendingIntent;
        this.a = bundle;
        this.c = true;
    }
}
