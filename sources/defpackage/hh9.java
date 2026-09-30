package defpackage;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hh9 extends m4 {
    public CharSequence c;

    @Override // defpackage.m4
    public final void m0(szc szcVar) {
        new Notification.BigTextStyle((Notification.Builder) szcVar.c).setBigContentTitle(null).bigText(this.c);
    }

    @Override // defpackage.m4
    public final String r0() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
