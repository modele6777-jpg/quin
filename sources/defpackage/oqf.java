package defpackage;

import android.content.Context;
import com.adjust.sdk.Reflection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oqf implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oqf(Context context, Object obj, int i) {
        this.a = i;
        this.b = context;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return Reflection.getGoogleAdId(this.b, this.c);
            default:
                return Reflection.isGoogleAdIdTrackingEnabled(this.b, this.c);
        }
    }
}
