package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g61 implements pc5 {
    public final /* synthetic */ int a;
    public final as9 b;
    public final Object c;

    public /* synthetic */ g61(Object obj, as9 as9Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = as9Var;
    }

    @Override // defpackage.pc5
    public final Object a(pv4 pv4Var) {
        int i = this.a;
        zb3 zb3Var = zb3.b;
        Object obj = this.c;
        as9 as9Var = this.b;
        switch (i) {
            case 0:
                f41 f41Var = new f41();
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                f41Var.g1(bArr, bArr.length);
                return new otd(rxg.i(f41Var, as9Var.f), null, zb3Var);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new otd(new ptd(new yhb(new i61(byteBuffer)), as9Var.f, new j61(byteBuffer)), null, zb3Var);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = erf.a;
                boolean z = bitmapDrawable instanceof VectorDrawable;
                if (z) {
                    bitmapDrawable = new BitmapDrawable(as9Var.a.getResources(), kj0.Z(bitmapDrawable, yw6.a(as9Var), as9Var.b, as9Var.c, (ykd) b21.A(as9Var, vw6.b), as9Var.d == bpa.b));
                }
                return new tv6(y7h.k(bitmapDrawable), z, zb3Var);
        }
    }
}
