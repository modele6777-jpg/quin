package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bdh {
    public final Context a;
    public final u8e b;
    public final u8e c;
    public final u8e d;
    public volatile int e = 0;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final Object g = new Object();
    public volatile hn5 h = null;

    public bdh(Context context, u8e u8eVar, u8e u8eVar2, u8e u8eVar3) {
        this.a = context;
        this.b = u8eVar;
        this.c = u8eVar2;
        this.d = u8eVar3;
    }
}
