package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dj0 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ ej0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj0(ej0 ej0Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = ej0Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.c.d();
    }
}
