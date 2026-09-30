package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ja8 {
    public static final Object c = new Object();
    public static ja8 d;
    public final HashMap a;
    public final ArrayList b;

    public ja8(Context context) {
        this.a = new HashMap();
        new HashMap();
        this.b = new ArrayList();
        new qi(this, context.getMainLooper(), 3);
    }

    public void a(Object obj, String str) {
        obj.getClass();
        this.a.put(str, obj);
        this.b.remove(str);
    }

    public ja8() {
        this.a = new HashMap();
        this.b = new ArrayList();
    }
}
