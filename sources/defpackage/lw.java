package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lw implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ mw a;

    public lw(mw mwVar) {
        this.a = mwVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d.removeCallbacks(this);
        this.a.d1();
        mw mwVar = this.a;
        synchronized (mwVar.e) {
            if (mwVar.x) {
                mwVar.x = false;
                ArrayList arrayList = mwVar.g;
                mwVar.g = mwVar.v;
                mwVar.v = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d1();
        mw mwVar = this.a;
        synchronized (mwVar.e) {
            if (mwVar.g.isEmpty()) {
                mwVar.c.removeFrameCallback(this);
                mwVar.x = false;
            }
        }
    }
}
