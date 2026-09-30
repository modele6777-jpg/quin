package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xv6 extends eu0 {
    public final du7 D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final ri8 H;
    public final mq4 I;
    public gl9 J;
    public sug K;

    public xv6(oi8 oi8Var, tu7 tu7Var) {
        super(oi8Var, tu7Var);
        this.D = new du7(3, 0);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = tu7Var.g;
        uh8 uh8Var = oi8Var.a;
        this.H = uh8Var == null ? null : (ri8) ((HashMap) uh8Var.c()).get(str);
        a82 a82Var = this.p.x;
        if (a82Var != null) {
            this.I = new mq4(this, this, a82Var);
        }
    }

    @Override // defpackage.eu0, defpackage.ep4
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Bitmap bitmapO;
        super.c(rectF, matrix, z);
        ri8 ri8Var = this.H;
        if (ri8Var != null) {
            int i = ri8Var.b;
            int i2 = ri8Var.a;
            float fC = xqf.c();
            if (this.o.x || (bitmapO = o()) == null) {
                rectF.set(0.0f, 0.0f, i2 * fC, i * fC);
            } else {
                rectF.set(0.0f, 0.0f, bitmapO.getWidth() * fC, bitmapO.getHeight() * fC);
            }
            this.n.mapRect(rectF);
        }
    }

    @Override // defpackage.eu0
    public final void i(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        ri8 ri8Var;
        Bitmap bitmapO = o();
        if (bitmapO == null || bitmapO.isRecycled() || (ri8Var = this.H) == null) {
            return;
        }
        float fC = xqf.c();
        du7 du7Var = this.D;
        du7Var.setAlpha(i);
        mq4 mq4Var = this.I;
        if (mq4Var != null) {
            kq4Var = mq4Var.b(matrix, i);
        }
        int width = bitmapO.getWidth();
        int height = bitmapO.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z = this.o.x;
        Rect rect2 = this.F;
        if (z) {
            rect2.set(0, 0, (int) (ri8Var.a * fC), (int) (ri8Var.b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapO.getWidth() * fC), (int) (bitmapO.getHeight() * fC));
        }
        boolean z2 = kq4Var != null;
        if (z2) {
            if (this.J == null) {
                this.J = new gl9();
            }
            sug sugVar = this.K;
            if (sugVar == null) {
                sugVar = new sug(11, (byte) 0);
                this.K = sugVar;
            }
            sug sugVar2 = sugVar;
            sugVar.b = 255;
            sugVar.c = null;
            kq4Var.getClass();
            kq4 kq4Var2 = new kq4(kq4Var);
            sugVar2.c = kq4Var2;
            kq4Var2.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.J.e(canvas, rectF, this.K);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapO, rect, rect2, du7Var);
        if (z2) {
            this.J.c();
            if (this.J.c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    public final Bitmap o() {
        Bitmap bitmapD;
        String str = this.p.g;
        oi8 oi8Var = this.o;
        ta0 ta0Var = oi8Var.f;
        if (ta0Var != null) {
            Context contextF = oi8Var.f();
            Context context = (Context) ta0Var.b;
            if (contextF != null) {
                if (context instanceof Application) {
                    contextF = contextF.getApplicationContext();
                }
                if (contextF != context) {
                    oi8Var.f = null;
                }
            } else if (context != null) {
                oi8Var.f = null;
            }
        }
        ta0 ta0Var2 = oi8Var.f;
        if (ta0Var2 == null) {
            ta0Var2 = new ta0(oi8Var.getCallback(), oi8Var.a.c());
            oi8Var.f = ta0Var2;
        }
        String str2 = (String) ta0Var2.c;
        ri8 ri8Var = (ri8) ((Map) ta0Var2.d).get(str);
        if (ri8Var == null) {
            bitmapD = null;
        } else {
            int i = ri8Var.b;
            int i2 = ri8Var.a;
            bitmapD = ri8Var.f;
            if (bitmapD == null) {
                Context context2 = (Context) ta0Var2.b;
                if (context2 == null) {
                    bitmapD = null;
                } else {
                    String str3 = ri8Var.d;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                        try {
                            if (TextUtils.isEmpty(str2)) {
                                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                            }
                            try {
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                if (bitmapDecodeStream == null) {
                                    gf8.b("Decoded image `" + str + "` is null.");
                                    bitmapD = null;
                                } else {
                                    bitmapD = xqf.d(bitmapDecodeStream, i2, i);
                                    synchronized (ta0.g) {
                                        ((ri8) ((Map) ta0Var2.d).get(str)).f = bitmapD;
                                    }
                                }
                            } catch (IllegalArgumentException e) {
                                gf8.c("Unable to decode image `" + str + "`.", e);
                            }
                        } catch (IOException e2) {
                            gf8.c("Unable to open asset.", e2);
                        }
                    } else {
                        try {
                            byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                            try {
                                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                if (bitmapDecodeByteArray == null) {
                                    gf8.b("Decoded image `" + str + "` is null.");
                                    bitmapD = null;
                                } else {
                                    bitmapD = xqf.d(bitmapDecodeByteArray, i2, i);
                                    synchronized (ta0.g) {
                                        ((ri8) ((Map) ta0Var2.d).get(str)).f = bitmapD;
                                    }
                                }
                            } catch (IllegalArgumentException e3) {
                                gf8.c("Unable to decode image `" + str + "`.", e3);
                            }
                        } catch (IllegalArgumentException e4) {
                            gf8.c("data URL did not have correct base64 format.", e4);
                        }
                    }
                }
            }
        }
        if (bitmapD != null) {
            return bitmapD;
        }
        ri8 ri8Var2 = this.H;
        if (ri8Var2 != null) {
            return ri8Var2.f;
        }
        return null;
    }
}
