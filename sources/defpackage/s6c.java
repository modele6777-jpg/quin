package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s6c extends OrientationEventListener {
    public final /* synthetic */ u6c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6c(Context context, u6c u6cVar) {
        super(context);
        this.a = u6cVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        List listJ1;
        if (i == -1) {
            return;
        }
        u6c u6cVar = this.a;
        int i2 = 1;
        if (u6cVar.d == -1) {
            if (i >= 0 && i < 45) {
                i2 = 0;
            } else if (45 <= i && i < 135) {
                i2 = 3;
            } else if (135 <= i && i < 225) {
                i2 = 2;
            } else if (225 > i || i >= 315) {
                i2 = 0;
            }
        } else if ((i >= 0 && i < 40) || (320 <= i && i < 360)) {
            i2 = 0;
        } else if (50 <= i && i < 130) {
            i2 = 3;
        } else if (140 <= i && i < 220) {
            i2 = 2;
        } else if (230 > i || i >= 310) {
            i2 = u6cVar.d;
        }
        u6c u6cVar2 = this.a;
        if (u6cVar2.d != i2) {
            u6cVar2.d = i2;
            synchronized (u6cVar2.a) {
                listJ1 = s72.j1(u6cVar2.c.values());
            }
            Iterator it = listJ1.iterator();
            while (it.hasNext()) {
                ((t6c) it.next()).a(i2);
            }
        }
    }
}
