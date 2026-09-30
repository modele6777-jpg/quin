package defpackage;

import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vo2 implements yl2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vo2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.yl2
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                vb2 vb2Var = (vb2) this.b;
                aw2 aw2Var = (aw2) this.c;
                q7b q7bVar = (q7b) this.d;
                gd8 gd8Var = (gd8) this.e;
                Intent intent = (Intent) obj;
                intent.getClass();
                vb2Var.setIntent(intent);
                ynb.V(aw2Var, null, null, new tq2(vb2Var, q7bVar, gd8Var, null), 3);
                return;
            default:
                ft3 ft3Var = (ft3) this.b;
                wae waeVar = (wae) this.c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                Surface surface = (Surface) this.e;
                synchronized (waeVar.a) {
                    waeVar.m = null;
                    waeVar.n = null;
                    break;
                }
                surfaceTexture.setOnFrameAvailableListener(null);
                surfaceTexture.release();
                surface.release();
                ft3Var.w--;
                ft3Var.d();
                return;
        }
    }
}
