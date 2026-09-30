package ai.askquin.qa.transport;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.wj7;
import defpackage.y2b;
import defpackage.z18;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class QaBridgeService extends Service {
    public static final /* synthetic */ int c = 0;
    public final lw7 a = eb3.N(z18.a, new wj7(14, this));
    public final y2b b = new y2b(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.b;
    }
}
