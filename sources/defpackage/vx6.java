package defpackage;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vx6 extends lu3 {
    public final /* synthetic */ int n = 0;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx6(wae waeVar, Size size) {
        super(34, size);
        this.o = waeVar;
    }

    @Override // defpackage.lu3
    public final m88 f() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return bm8.C((Surface) obj);
            default:
                return ((wae) obj).f;
        }
    }

    public vx6(Surface surface, Size size, int i) {
        super(i, size);
        this.o = surface;
    }
}
