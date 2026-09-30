package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ek1 implements yl2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ek1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.yl2
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                break;
            case 1:
                ft3 ft3Var = (ft3) obj3;
                oae oaeVar = (oae) obj2;
                oaeVar.close();
                Surface surface = (Surface) ft3Var.v.remove(oaeVar);
                if (surface != null) {
                    gq9 gq9Var = ft3Var.a;
                    e46.d((AtomicBoolean) gq9Var.c, true);
                    e46.c((Thread) gq9Var.e);
                    gq9Var.o(surface, true);
                }
                break;
            default:
                vq4 vq4Var = (vq4) obj3;
                oae oaeVar2 = (oae) obj2;
                oaeVar2.close();
                Surface surface2 = (Surface) vq4Var.v.remove(oaeVar2);
                if (surface2 != null) {
                    tq4 tq4Var = vq4Var.a;
                    e46.d((AtomicBoolean) tq4Var.c, true);
                    e46.c((Thread) tq4Var.e);
                    tq4Var.o(surface2, true);
                }
                break;
        }
    }
}
