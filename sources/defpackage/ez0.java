package defpackage;

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ez0 extends ejd {
    public final Context n;
    public final int o;

    public ez0(Context context) {
        super(new tm3[1], new cz0[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // defpackage.ejd
    public final tm3 g() {
        return new tm3(1);
    }

    @Override // defpackage.ejd
    public final um3 h() {
        return new cz0(this);
    }

    @Override // defpackage.ejd
    public final rm3 i(Throwable th) {
        return new kv6("Unexpected decode error", th);
    }

    @Override // defpackage.ejd
    public final rm3 j(tm3 tm3Var, um3 um3Var, boolean z) {
        cz0 cz0Var = (cz0) um3Var;
        ByteBuffer byteBuffer = tm3Var.e;
        byteBuffer.getClass();
        pa7.J(byteBuffer.hasArray());
        pa7.A(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.o;
            if (iMax == -1) {
                Context context = this.n;
                if (context != null) {
                    Point pointR = pqf.r(context);
                    int i = pointR.x;
                    int i2 = pointR.y;
                    rr5 rr5Var = tm3Var.c;
                    if (rr5Var != null) {
                        int i3 = rr5Var.R;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = rr5Var.S;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            cz0Var.e = cn1.s(byteBuffer.array(), byteBuffer.remaining(), iMax);
            cz0Var.c = tm3Var.g;
            return null;
        } catch (l0a e) {
            return new kv6("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new kv6(e2);
        }
    }
}
