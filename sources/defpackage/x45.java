package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x45 {
    public final WeakReference a;
    public final w45 b;
    public final /* synthetic */ y45 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.function.IntConsumer, w45] */
    public x45(y45 y45Var, Context context) {
        this.c = y45Var;
        this.a = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: w45
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                y45 y45Var2 = this.a.c;
                if (y45Var2.h0) {
                    return;
                }
                y45Var2.L(1, Integer.valueOf(i), 19);
            }
        };
        this.b = r0;
        context.registerDeviceIdChangeListener(new vp(1, y45Var.v.a(y45Var.t, null)), r0);
    }

    public final void a() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.b);
    }
}
