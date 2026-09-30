package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u6c {
    public final Object a;
    public final s6c b;
    public final LinkedHashMap c;
    public volatile int d;

    public u6c(Context context) {
        context.getClass();
        this.a = new Object();
        this.c = new LinkedHashMap();
        this.d = -1;
        this.b = new s6c(context, this);
    }
}
