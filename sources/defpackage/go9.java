package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class go9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ go9(Context context, Intent intent, int i) {
        this.a = i;
        this.b = context;
        this.c = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Intent intent = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                context.startActivity(intent);
                break;
            default:
                context.startActivity(intent);
                break;
        }
    }
}
