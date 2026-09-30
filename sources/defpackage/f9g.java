package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f9g extends ContentObserver {
    public final /* synthetic */ r41 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9g(r41 r41Var, Handler handler) {
        super(handler);
        this.a = r41Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.d(wef.a);
    }
}
