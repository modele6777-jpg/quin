package androidx.lifecycle;

import android.os.Handler;
import defpackage.a58;
import defpackage.f48;
import defpackage.h48;
import defpackage.m45;
import defpackage.x48;
import defpackage.yea;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Lx48;", "<init>", "()V", "bp", "lifecycle-process"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class ProcessLifecycleOwner implements x48 {
    public static final ProcessLifecycleOwner w = new ProcessLifecycleOwner();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final a58 f = new a58(this, true);
    public final m45 g = new m45(18, this);
    public final yea v = new yea(this);

    private ProcessLifecycleOwner() {
    }

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                this.f.e(f48.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                handler.getClass();
                handler.removeCallbacks(this.g);
            }
        }
    }

    @Override // defpackage.x48
    public final h48 k() {
        return this.f;
    }
}
